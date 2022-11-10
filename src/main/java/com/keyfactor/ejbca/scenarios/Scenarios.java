/*
 * Copyright 2022 Keyfactor
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0.  Unless
 * required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * thespecific language governing permissions and limitations under the
 * License.
 */

package com.keyfactor.ejbca.scenarios;

import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.api.V1CaApi;
import com.keyfactor.ejbca.client.api.V1CertificateApi;
import com.keyfactor.ejbca.client.model.CaInfoRestResponse;
import com.keyfactor.ejbca.client.model.CaInfosRestResponse;
import com.keyfactor.ejbca.client.model.CertificateRestResponse;
import com.keyfactor.ejbca.client.model.EnrollCertificateRestRequest;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;

import javax.security.auth.x500.X500Principal;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.*;

public class Scenarios {
    private final ApiClient defaultClient;

    Scenarios(String host, Path clientCert, Path key) {
        defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(host + "ejbca/ejbca-rest-api");

        defaultClient.setClientCert(clientCert, key);
    }

    public List<X509Certificate> enrollCertificate(KeyPair keyPair, String subject, String password, String eeProfile, String certProfile) {
        // Extract CN from subject
        String username = "";
        if (!subject.contains("CN=")) {
            System.err.println("Subject doesn't contain CN");
            return null;
        }
        username = subject.split(",")[0]; // Remove everything after CN
        username = username.replace("CN=", "");

        // Generate CSR with RSA 2048 key
        String csrPem;
        try {
            csrPem = generateCSR(keyPair, subject);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | OperatorCreationException | IOException e) {
            System.err.printf("Failed to create certificate signing request: %s", e.getMessage());
            return null;
        }

        // Get list of available CAs
        CaInfosRestResponse caList;
        try {
            caList = (new V1CaApi(defaultClient)).listCas();
        } catch (ApiException e) {
            System.err.printf("Failed to get list of available CAs: %s", e.getMessage());
            return null;
        }

        // Choose CA to use
        String caName = "";
        for (CaInfoRestResponse ca : Objects.requireNonNull(caList.getCertificateAuthorities())) {
            if (ca.getName().contains("ManagementCA")) {
                caName = ca.getName();
            }
        }

        EnrollCertificateRestRequest csr = new EnrollCertificateRestRequest();
        csr.setCertificateRequest(csrPem);
        csr.setCertificateProfileName(certProfile);
        csr.setEndEntityProfileName(eeProfile);
        csr.setCertificateAuthorityName(caName);
        csr.setUsername(username);
        csr.setPassword(password);
        csr.setIncludeChain(true);

        List<X509Certificate> certList = new ArrayList<>();

        CertificateRestResponse result = null;
        try {
            result = (new V1CertificateApi(defaultClient)).enrollPkcs10Certificate(csr);
        } catch (ApiException e) {
            System.err.printf("Failed to enroll CSR: %s", e.getMessage());
            return null;
        }

        X509Certificate cert = null;
        // Add leaf certificate to list
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream certStream = new ByteArrayInputStream(Base64.getDecoder().decode(result.getCertificate()));

            cert = (X509Certificate)cf.generateCertificate(certStream);
            certList.add(cert);
        } catch (CertificateException e) {
            System.err.printf("Failed to import certificate into X509Certificate: %s", e.getMessage());
        }

        for (byte[] chainItemByte : Objects.requireNonNull(result.getCertificateChain())) {
            try {
                CertificateFactory cf = CertificateFactory.getInstance("X.509");
                InputStream certStream = new ByteArrayInputStream(chainItemByte);

                cert = (X509Certificate)cf.generateCertificate(certStream);
                certList.add(cert);
            } catch (CertificateException e) {
                System.err.printf("Failed to import certificate chain into X509Certificate: %s", e.getMessage());
            }
        }

        return certList;
    }

    public KeyPair generateKey(String algorithm, int keysize) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
        keyPairGenerator.initialize(keysize);
        return keyPairGenerator.generateKeyPair();
    }

    private String generateCSR(KeyPair keyPair, String subject) throws NoSuchAlgorithmException, NoSuchProviderException, OperatorCreationException, IOException {
        PKCS10CertificationRequestBuilder p10Builder = new JcaPKCS10CertificationRequestBuilder(
                new X500Principal(subject), keyPair.getPublic());

        JcaContentSignerBuilder csBuilder = new JcaContentSignerBuilder("SHA256withRSA");
        ContentSigner signer = csBuilder.build(keyPair.getPrivate());
        PKCS10CertificationRequest csr = p10Builder.build(signer);

        Writer writer = new StringWriter();

        JcaPEMWriter jcaPEMWriter = new JcaPEMWriter(writer);
        jcaPEMWriter.writeObject(csr);
        jcaPEMWriter.close();

        return writer.toString();
    }

    public static void main(String[] args) {
        // Generate RSA 2048 key
        KeyPair keyPair = null;

        Path cert = Paths.get(System.getenv("CLIENT_CERT_PATH"));
        Scenarios scenarios = new Scenarios(System.getenv("HOSTNAME"), cert, cert);

        try {
            keyPair = scenarios.generateKey("RSA", 2048);
        } catch (NoSuchAlgorithmException e) {
            System.err.printf("Failed to create private key: %s", e.getMessage());
            throw new RuntimeException();
        }

        String eeProfile = System.getenv("END_ENTITY_PROFILE");
        String certProfile = System.getenv("CERT_PROFILE");

        List<X509Certificate> certAndChain = scenarios.enrollCertificate(keyPair, "CN=certEnrollTest", "ReallyStrongPassword1!", eeProfile, certProfile);

        System.out.printf("Enrolled certificate with SN %s. Also returned chain of length %d", certAndChain.get(0).getSerialNumber(), certAndChain.size() - 1);
    }
}
