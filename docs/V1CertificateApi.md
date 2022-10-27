# V1CertificateApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificateRequest**](V1CertificateApi.md#certificateRequest) | **POST** /v1/certificate/certificaterequest | Enrollment with client generated keys for an existing End Entity |
| [**enrollKeystore**](V1CertificateApi.md#enrollKeystore) | **POST** /v1/certificate/enrollkeystore | Keystore enrollment |
| [**enrollPkcs10Certificate**](V1CertificateApi.md#enrollPkcs10Certificate) | **POST** /v1/certificate/pkcs10enroll | Enrollment with client generated keys, using CSR subject |
| [**finalizeEnrollment**](V1CertificateApi.md#finalizeEnrollment) | **POST** /v1/certificate/{request_id}/finalize | Finalize enrollment |
| [**getCertificatesAboutToExpire**](V1CertificateApi.md#getCertificatesAboutToExpire) | **GET** /v1/certificate/expire | Get a list of certificates that are about to expire |
| [**revocationStatus**](V1CertificateApi.md#revocationStatus) | **GET** /v1/certificate/{issuer_dn}/{certificate_serial_number}/revocationstatus | Checks revocation status of the specified certificate |
| [**revokeCertificate**](V1CertificateApi.md#revokeCertificate) | **PUT** /v1/certificate/{issuer_dn}/{certificate_serial_number}/revoke | Revokes the specified certificate |
| [**searchCertificates**](V1CertificateApi.md#searchCertificates) | **POST** /v1/certificate/search | Searches for certificates confirming given criteria. |
| [**status2**](V1CertificateApi.md#status2) | **GET** /v1/certificate/status | Get the status of this REST Resource |


<a name="certificateRequest"></a>
# **certificateRequest**
> CertificateRestResponse certificateRequest(certificateRequestRestRequest)

Enrollment with client generated keys for an existing End Entity

Enroll for a certificate given a PEM encoded PKCS#10 CSR.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    CertificateRequestRestRequest certificateRequestRestRequest = new CertificateRequestRestRequest(); // CertificateRequestRestRequest | 
    try {
      CertificateRestResponse result = apiInstance.certificateRequest(certificateRequestRestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#certificateRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **certificateRequestRestRequest** | [**CertificateRequestRestRequest**](CertificateRequestRestRequest.md)|  | [optional] |

### Return type

[**CertificateRestResponse**](CertificateRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="enrollKeystore"></a>
# **enrollKeystore**
> CertificateRestResponse enrollKeystore(keyStoreRestRequest)

Keystore enrollment

Creates a keystore for the specified end entity

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    KeyStoreRestRequest keyStoreRestRequest = new KeyStoreRestRequest(); // KeyStoreRestRequest | 
    try {
      CertificateRestResponse result = apiInstance.enrollKeystore(keyStoreRestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#enrollKeystore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyStoreRestRequest** | [**KeyStoreRestRequest**](KeyStoreRestRequest.md)|  | [optional] |

### Return type

[**CertificateRestResponse**](CertificateRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="enrollPkcs10Certificate"></a>
# **enrollPkcs10Certificate**
> CertificateRestResponse enrollPkcs10Certificate(enrollCertificateRestRequest)

Enrollment with client generated keys, using CSR subject

Enroll for a certificate given a PEM encoded PKCS#10 CSR.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    EnrollCertificateRestRequest enrollCertificateRestRequest = new EnrollCertificateRestRequest(); // EnrollCertificateRestRequest | 
    try {
      CertificateRestResponse result = apiInstance.enrollPkcs10Certificate(enrollCertificateRestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#enrollPkcs10Certificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **enrollCertificateRestRequest** | [**EnrollCertificateRestRequest**](EnrollCertificateRestRequest.md)|  | [optional] |

### Return type

[**CertificateRestResponse**](CertificateRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="finalizeEnrollment"></a>
# **finalizeEnrollment**
> CertificateRestResponse finalizeEnrollment(requestId, finalizeRestRequest)

Finalize enrollment

Finalizes enrollment after administrator approval using request Id

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    Integer requestId = 56; // Integer | Approval request id
    FinalizeRestRequest finalizeRestRequest = new FinalizeRestRequest(); // FinalizeRestRequest | responseFormat must be one of 'P12', 'BCFKS', 'JKS', 'DER'
    try {
      CertificateRestResponse result = apiInstance.finalizeEnrollment(requestId, finalizeRestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#finalizeEnrollment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **Integer**| Approval request id | |
| **finalizeRestRequest** | [**FinalizeRestRequest**](FinalizeRestRequest.md)| responseFormat must be one of &#39;P12&#39;, &#39;BCFKS&#39;, &#39;JKS&#39;, &#39;DER&#39; | [optional] |

### Return type

[**CertificateRestResponse**](CertificateRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="getCertificatesAboutToExpire"></a>
# **getCertificatesAboutToExpire**
> ExpiringCertificatesRestResponse getCertificatesAboutToExpire(days, offset, maxNumberOfResults)

Get a list of certificates that are about to expire

List of certificates expiring within specified number of days

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    Long days = 56L; // Long | Request certificates expiring within this number of days
    Integer offset = 56; // Integer | Next offset to display results of, if maxNumberOfResults is exceeded. Starts from 0.
    Integer maxNumberOfResults = 56; // Integer | Maximum number of certificates to display. If result exceeds this value. Modify 'offset' to retrieve more results
    try {
      ExpiringCertificatesRestResponse result = apiInstance.getCertificatesAboutToExpire(days, offset, maxNumberOfResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#getCertificatesAboutToExpire");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **days** | **Long**| Request certificates expiring within this number of days | [optional] |
| **offset** | **Integer**| Next offset to display results of, if maxNumberOfResults is exceeded. Starts from 0. | [optional] |
| **maxNumberOfResults** | **Integer**| Maximum number of certificates to display. If result exceeds this value. Modify &#39;offset&#39; to retrieve more results | [optional] |

### Return type

[**ExpiringCertificatesRestResponse**](ExpiringCertificatesRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="revocationStatus"></a>
# **revocationStatus**
> RevokeStatusRestResponse revocationStatus(issuerDn, certificateSerialNumber)

Checks revocation status of the specified certificate

Checks revocation status of the specified certificate

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    String issuerDn = "issuerDn_example"; // String | Subject DN of the issuing CA
    String certificateSerialNumber = "certificateSerialNumber_example"; // String | hex serial number (without prefix, e.g. '00')
    try {
      RevokeStatusRestResponse result = apiInstance.revocationStatus(issuerDn, certificateSerialNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#revocationStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issuerDn** | **String**| Subject DN of the issuing CA | |
| **certificateSerialNumber** | **String**| hex serial number (without prefix, e.g. &#39;00&#39;) | |

### Return type

[**RevokeStatusRestResponse**](RevokeStatusRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="revokeCertificate"></a>
# **revokeCertificate**
> RevokeStatusRestResponse revokeCertificate(issuerDn, certificateSerialNumber, reason, date)

Revokes the specified certificate

Revokes the specified certificate

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    String issuerDn = "issuerDn_example"; // String | Subject DN of the issuing CA
    String certificateSerialNumber = "certificateSerialNumber_example"; // String | hex serial number (without prefix, e.g. '00')
    String reason = "reason_example"; // String | Must be valid RFC5280 reason. One of  NOT_REVOKED, UNSPECIFIED ,KEY_COMPROMISE,  CA_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION,  CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGES_WITHDRAWN, AA_COMPROMISE
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | ISO 8601 Date string, eg. '2018-06-15T14:07:09Z'
    try {
      RevokeStatusRestResponse result = apiInstance.revokeCertificate(issuerDn, certificateSerialNumber, reason, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#revokeCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issuerDn** | **String**| Subject DN of the issuing CA | |
| **certificateSerialNumber** | **String**| hex serial number (without prefix, e.g. &#39;00&#39;) | |
| **reason** | **String**| Must be valid RFC5280 reason. One of  NOT_REVOKED, UNSPECIFIED ,KEY_COMPROMISE,  CA_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION,  CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGES_WITHDRAWN, AA_COMPROMISE | [optional] |
| **date** | **OffsetDateTime**| ISO 8601 Date string, eg. &#39;2018-06-15T14:07:09Z&#39; | [optional] |

### Return type

[**RevokeStatusRestResponse**](RevokeStatusRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="searchCertificates"></a>
# **searchCertificates**
> SearchCertificatesRestResponse searchCertificates(searchCertificatesRestRequest)

Searches for certificates confirming given criteria.

Insert as many search criteria as needed. A reference about allowed values for criteria could be found below, under SearchCertificateCriteriaRestRequest model.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    SearchCertificatesRestRequest searchCertificatesRestRequest = new SearchCertificatesRestRequest(); // SearchCertificatesRestRequest | Maximum number of results and collection of search criterias.
    try {
      SearchCertificatesRestResponse result = apiInstance.searchCertificates(searchCertificatesRestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#searchCertificates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchCertificatesRestRequest** | [**SearchCertificatesRestRequest**](SearchCertificatesRestRequest.md)| Maximum number of results and collection of search criterias. | [optional] |

### Return type

[**SearchCertificatesRestResponse**](SearchCertificatesRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="status2"></a>
# **status2**
> RestResourceStatusRestResponse status2()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CertificateApi;

import java.nio.file.Path;

public class Example {
  public static void main(String[] args) {
    // Set base path to EJBCA REST API
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    // Retrieve client certificate and key
    Path cert = Paths.get("path/to/clientcertificate");
    Path key = Paths.get("path/to/key");
    defaultClient.setClientCert(cert, key);

    V1CertificateApi apiInstance = new V1CertificateApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CertificateApi#status2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestResourceStatusRestResponse**](RestResourceStatusRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

