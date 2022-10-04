# V1CaApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCrl**](V1CaApi.md#createCrl) | **POST** /v1/ca/{issuer_dn}/createcrl | Create CRL(main, partition and delta) issued by this CA |
| [**getCertificateAsPem**](V1CaApi.md#getCertificateAsPem) | **GET** /v1/ca/{subject_dn}/certificate/download | Get PEM file with the active CA certificate chain |
| [**getLatestCrl**](V1CaApi.md#getLatestCrl) | **GET** /v1/ca/{issuer_dn}/getLatestCrl | Returns the latest CRL issued by this CA |
| [**importCrl**](V1CaApi.md#importCrl) | **POST** /v1/ca/{issuer_dn}/importcrl | Import a certificate revocation list (CRL) for a CA |
| [**listCas**](V1CaApi.md#listCas) | **GET** /v1/ca | Returns the Response containing the list of CAs with general information per CA as Json |
| [**status1**](V1CaApi.md#status1) | **GET** /v1/ca/status | Get the status of this REST Resource |


<a name="createCrl"></a>
# **createCrl**
> CreateCrlRestResponse createCrl(issuerDn, deltacrl)

Create CRL(main, partition and delta) issued by this CA



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issuerDn** | **String**| the CRL issuers DN (CAs subject DN) | |
| **deltacrl** | **Boolean**| true to also create the deltaCRL, false to only create the base CRL | [optional] [default to false] |

### Return type

[**CreateCrlRestResponse**](CreateCrlRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCertificateAsPem"></a>
# **getCertificateAsPem**
> getCertificateAsPem(subjectDn)

Get PEM file with the active CA certificate chain



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaApi apiInstance = new V1CaApi(defaultClient);
    String subjectDn = "subjectDn_example"; // String | CAs subject DN
    try {
      apiInstance.getCertificateAsPem(subjectDn);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaApi#getCertificateAsPem");
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
| **subjectDn** | **String**| CAs subject DN | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="getLatestCrl"></a>
# **getLatestCrl**
> CrlRestResponse getLatestCrl(issuerDn, deltaCrl, crlPartitionIndex)

Returns the latest CRL issued by this CA



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaApi apiInstance = new V1CaApi(defaultClient);
    String issuerDn = "issuerDn_example"; // String | the CRL issuers DN (CAs subject DN)
    Boolean deltaCrl = false; // Boolean | true to get the latest deltaCRL, false to get the latest complete CRL
    Integer crlPartitionIndex = 0; // Integer | the CRL partition index
    try {
      CrlRestResponse result = apiInstance.getLatestCrl(issuerDn, deltaCrl, crlPartitionIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaApi#getLatestCrl");
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
| **issuerDn** | **String**| the CRL issuers DN (CAs subject DN) | |
| **deltaCrl** | **Boolean**| true to get the latest deltaCRL, false to get the latest complete CRL | [optional] [default to false] |
| **crlPartitionIndex** | **Integer**| the CRL partition index | [optional] [default to 0] |

### Return type

[**CrlRestResponse**](CrlRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="importCrl"></a>
# **importCrl**
> importCrl(issuerDn, crlFile, crlPartitionIndex)

Import a certificate revocation list (CRL) for a CA



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaApi apiInstance = new V1CaApi(defaultClient);
    String issuerDn = "issuerDn_example"; // String | the CRL issuers DN (CAs subject DN)
    File crlFile = new File("/path/to/file"); // File | CRL file in DER format
    Integer crlPartitionIndex = 0; // Integer | CRL partition index
    try {
      apiInstance.importCrl(issuerDn, crlFile, crlPartitionIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaApi#importCrl");
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
| **issuerDn** | **String**| the CRL issuers DN (CAs subject DN) | |
| **crlFile** | **File**| CRL file in DER format | [optional] |
| **crlPartitionIndex** | **Integer**| CRL partition index | [optional] [default to 0] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CRL file was imported successfully |  -  |
| **400** | Error while importing CRL file |  -  |

<a name="listCas"></a>
# **listCas**
> CaInfosRestResponse listCas()

Returns the Response containing the list of CAs with general information per CA as Json

Returns the Response containing the list of CAs with general information per CA as Json

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaApi apiInstance = new V1CaApi(defaultClient);
    try {
      CaInfosRestResponse result = apiInstance.listCas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaApi#listCas");
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

[**CaInfosRestResponse**](CaInfosRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="status1"></a>
# **status1**
> RestResourceStatusRestResponse status1()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaApi apiInstance = new V1CaApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaApi#status1");
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

