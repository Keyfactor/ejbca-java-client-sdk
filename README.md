# Community supported
We welcome contributions.

The Keyfactor Python Client SDK is open source and community supported, meaning that there is **no SLA** applicable for these tools.

To report a problem or suggest a new feature, use the **[Issues](../../issues)** tab. If you want to contribute actual bug fixes or proposed enhancements, use the **[Pull requests](../../pulls)** tab.

# ejbca-java-client-sdk

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.keyfactor.ejbca</groupId>
  <artifactId>ejbca-java-client-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'ejbca-java-client-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'ejbca-java-client-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.keyfactor.ejbca:ejbca-java-client-sdk:1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ejbca-java-client-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CaApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Set base path to EJBCA REST API
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CaApi apiInstance = new V1CaApi(defaultClient);
    String issuerDn = "issuerDn_example"; // String | the CRL issuers DN (CAs subject DN)
    Boolean deltacrl = false; // Boolean | true to also create the deltaCRL, false to only create the base CRL
    try {
      CreateCrlRestResponse result = apiInstance.createCrl(issuerDn, deltacrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaApi#createCrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *V1CaApi* | [**createCrl**](docs/V1CaApi.md#createCrl) | **POST** /v1/ca/{issuer_dn}/createcrl | Create CRL(main, partition and delta) issued by this CA |
| *V1CaApi* | [**getCertificateAsPem**](docs/V1CaApi.md#getCertificateAsPem) | **GET** /v1/ca/{subject_dn}/certificate/download | Get PEM file with the active CA certificate chain |
| *V1CaApi* | [**getLatestCrl**](docs/V1CaApi.md#getLatestCrl) | **GET** /v1/ca/{issuer_dn}/getLatestCrl | Returns the latest CRL issued by this CA |
| *V1CaApi* | [**importCrl**](docs/V1CaApi.md#importCrl) | **POST** /v1/ca/{issuer_dn}/importcrl | Import a certificate revocation list (CRL) for a CA |
| *V1CaApi* | [**listCas**](docs/V1CaApi.md#listCas) | **GET** /v1/ca | Returns the Response containing the list of CAs with general information per CA as Json |
| *V1CaApi* | [**status1**](docs/V1CaApi.md#status1) | **GET** /v1/ca/status | Get the status of this REST Resource |
| *V1CaManagementApi* | [**activate**](docs/V1CaManagementApi.md#activate) | **PUT** /v1/ca_management/{ca_name}/activate | Activate a CA |
| *V1CaManagementApi* | [**deactivate**](docs/V1CaManagementApi.md#deactivate) | **PUT** /v1/ca_management/{ca_name}/deactivate | Deactivate a CA |
| *V1CaManagementApi* | [**status**](docs/V1CaManagementApi.md#status) | **GET** /v1/ca_management/status | Get the status of this REST Resource |
| *V1CertificateApi* | [**certificateRequest**](docs/V1CertificateApi.md#certificateRequest) | **POST** /v1/certificate/certificaterequest | Enrollment with client generated keys for an existing End Entity |
| *V1CertificateApi* | [**enrollKeystore**](docs/V1CertificateApi.md#enrollKeystore) | **POST** /v1/certificate/enrollkeystore | Keystore enrollment |
| *V1CertificateApi* | [**enrollPkcs10Certificate**](docs/V1CertificateApi.md#enrollPkcs10Certificate) | **POST** /v1/certificate/pkcs10enroll | Enrollment with client generated keys, using CSR subject |
| *V1CertificateApi* | [**finalizeEnrollment**](docs/V1CertificateApi.md#finalizeEnrollment) | **POST** /v1/certificate/{request_id}/finalize | Finalize enrollment |
| *V1CertificateApi* | [**getCertificatesAboutToExpire**](docs/V1CertificateApi.md#getCertificatesAboutToExpire) | **GET** /v1/certificate/expire | Get a list of certificates that are about to expire |
| *V1CertificateApi* | [**revocationStatus**](docs/V1CertificateApi.md#revocationStatus) | **GET** /v1/certificate/{issuer_dn}/{certificate_serial_number}/revocationstatus | Checks revocation status of the specified certificate |
| *V1CertificateApi* | [**revokeCertificate**](docs/V1CertificateApi.md#revokeCertificate) | **PUT** /v1/certificate/{issuer_dn}/{certificate_serial_number}/revoke | Revokes the specified certificate |
| *V1CertificateApi* | [**searchCertificates**](docs/V1CertificateApi.md#searchCertificates) | **POST** /v1/certificate/search | Searches for certificates confirming given criteria. |
| *V1CertificateApi* | [**status2**](docs/V1CertificateApi.md#status2) | **GET** /v1/certificate/status | Get the status of this REST Resource |
| *V1CryptotokenApi* | [**activate1**](docs/V1CryptotokenApi.md#activate1) | **PUT** /v1/cryptotoken/{cryptotoken_name}/activate | Activate a Crypto Token |
| *V1CryptotokenApi* | [**deactivate1**](docs/V1CryptotokenApi.md#deactivate1) | **PUT** /v1/cryptotoken/{cryptotoken_name}/deactivate | Deactivate a Crypto Token |
| *V1CryptotokenApi* | [**generateKeys**](docs/V1CryptotokenApi.md#generateKeys) | **POST** /v1/cryptotoken/{cryptotoken_name}/generatekeys | Generate keys |
| *V1CryptotokenApi* | [**removeKeys**](docs/V1CryptotokenApi.md#removeKeys) | **POST** /v1/cryptotoken/{cryptotoken_name}/{key_pair_alias}/removekeys | Remove keys |
| *V1CryptotokenApi* | [**status5**](docs/V1CryptotokenApi.md#status5) | **GET** /v1/cryptotoken/status | Get the status of this REST Resource |
| *V1EndentityApi* | [**add**](docs/V1EndentityApi.md#add) | **POST** /v1/endentity | Add new end entity, if it does not exist |
| *V1EndentityApi* | [**delete**](docs/V1EndentityApi.md#delete) | **DELETE** /v1/endentity/{endentity_name} | Deletes end entity |
| *V1EndentityApi* | [**revoke**](docs/V1EndentityApi.md#revoke) | **PUT** /v1/endentity/{endentity_name}/revoke | Revokes all end entity certificates |
| *V1EndentityApi* | [**search**](docs/V1EndentityApi.md#search) | **POST** /v1/endentity/search | Searches for end entity confirming given criteria. |
| *V1EndentityApi* | [**setstatus**](docs/V1EndentityApi.md#setstatus) | **POST** /v1/endentity/{endentity_name}/setstatus | Edits end entity setting new status |
| *V1EndentityApi* | [**status6**](docs/V1EndentityApi.md#status6) | **GET** /v1/endentity/status | Get the status of this REST Resource |
| *V1SshApi* | [**pubkey**](docs/V1SshApi.md#pubkey) | **GET** /v1/ssh/{ca_name}/pubkey | Retrieves a CA&#39;s public key in SSH format. |
| *V1SshApi* | [**status8**](docs/V1SshApi.md#status8) | **GET** /v1/ssh/status | Get the status of this REST Resource |
| *V2CertificateApi* | [**getCertificateProfileInfo**](docs/V2CertificateApi.md#getCertificateProfileInfo) | **GET** /v2/certificate/profile/{profile_name} | Get Certificate Profile Info. |
| *V2CertificateApi* | [**searchCertificates1**](docs/V2CertificateApi.md#searchCertificates1) | **POST** /v2/certificate/search | Searches for certificates confirming given criteria and pagination. |
| *V2CertificateApi* | [**status3**](docs/V2CertificateApi.md#status3) | **GET** /v2/certificate/status | Get the status of this REST Resource |
| *V2EndentityApi* | [**getAuthorizedEndEntityProfiles**](docs/V2EndentityApi.md#getAuthorizedEndEntityProfiles) | **GET** /v2/endentity/profiles/authorized | List of authorized end entity profiles for the current admin. |
| *V2EndentityApi* | [**profile**](docs/V2EndentityApi.md#profile) | **GET** /v2/endentity/profile/{endentity_profile_name} | Get End Entity Profile content |
| *V2EndentityApi* | [**sortedSearch**](docs/V2EndentityApi.md#sortedSearch) | **POST** /v2/endentity/search | Searches and sorts for end entity conforming given criteria. |
| *V2EndentityApi* | [**status7**](docs/V2EndentityApi.md#status7) | **GET** /v2/endentity/status | Get the status of this REST Resource |


## Documentation for Models

 - [AddEndEntityRestRequest](docs/AddEndEntityRestRequest.md)
 - [AuthorizedEEPsRestResponse](docs/AuthorizedEEPsRestResponse.md)
 - [CaInfoRestResponse](docs/CaInfoRestResponse.md)
 - [CaInfosRestResponse](docs/CaInfosRestResponse.md)
 - [CertificateProfileInfoRestResponseV2](docs/CertificateProfileInfoRestResponseV2.md)
 - [CertificateRequestRestRequest](docs/CertificateRequestRestRequest.md)
 - [CertificateRestResponse](docs/CertificateRestResponse.md)
 - [CertificateRestResponseV2](docs/CertificateRestResponseV2.md)
 - [CertificatesRestResponse](docs/CertificatesRestResponse.md)
 - [CreateCrlRestResponse](docs/CreateCrlRestResponse.md)
 - [CrlRestResponse](docs/CrlRestResponse.md)
 - [CryptoTokenActivationRestRequest](docs/CryptoTokenActivationRestRequest.md)
 - [CryptoTokenKeyGenerationRestRequest](docs/CryptoTokenKeyGenerationRestRequest.md)
 - [EndEntityProfileResponse](docs/EndEntityProfileResponse.md)
 - [EndEntityProfileRestResponse](docs/EndEntityProfileRestResponse.md)
 - [EndEntityRestResponse](docs/EndEntityRestResponse.md)
 - [EndEntityRevocationRestRequest](docs/EndEntityRevocationRestRequest.md)
 - [EnrollCertificateRestRequest](docs/EnrollCertificateRestRequest.md)
 - [ExpiringCertificatesRestResponse](docs/ExpiringCertificatesRestResponse.md)
 - [ExtendedInformationRestRequestComponent](docs/ExtendedInformationRestRequestComponent.md)
 - [ExtendedInformationRestResponseComponent](docs/ExtendedInformationRestResponseComponent.md)
 - [FinalizeRestRequest](docs/FinalizeRestRequest.md)
 - [KeyStoreRestRequest](docs/KeyStoreRestRequest.md)
 - [Pagination](docs/Pagination.md)
 - [PaginationRestResponseComponent](docs/PaginationRestResponseComponent.md)
 - [PaginationSummary](docs/PaginationSummary.md)
 - [RestResourceStatusRestResponse](docs/RestResourceStatusRestResponse.md)
 - [RevokeStatusRestResponse](docs/RevokeStatusRestResponse.md)
 - [SearchCertificateCriteriaRestRequest](docs/SearchCertificateCriteriaRestRequest.md)
 - [SearchCertificateSortRestRequest](docs/SearchCertificateSortRestRequest.md)
 - [SearchCertificatesRestRequest](docs/SearchCertificatesRestRequest.md)
 - [SearchCertificatesRestRequestV2](docs/SearchCertificatesRestRequestV2.md)
 - [SearchCertificatesRestResponse](docs/SearchCertificatesRestResponse.md)
 - [SearchCertificatesRestResponseV2](docs/SearchCertificatesRestResponseV2.md)
 - [SearchEndEntitiesRestRequest](docs/SearchEndEntitiesRestRequest.md)
 - [SearchEndEntitiesRestRequestV2](docs/SearchEndEntitiesRestRequestV2.md)
 - [SearchEndEntitiesRestResponse](docs/SearchEndEntitiesRestResponse.md)
 - [SearchEndEntitiesSortRestRequest](docs/SearchEndEntitiesSortRestRequest.md)
 - [SearchEndEntityCriteriaRestRequest](docs/SearchEndEntityCriteriaRestRequest.md)
 - [SetEndEntityStatusRestRequest](docs/SetEndEntityStatusRestRequest.md)
 - [SshPublicKeyRestResponse](docs/SshPublicKeyRestResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

EJBCA REST Interface
- API version: 1.0
    - Build date: 2022-11-01T11:20:10.237-07:00[America/Phoenix]

API reference documentation.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



