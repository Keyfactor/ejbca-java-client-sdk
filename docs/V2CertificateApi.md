# V2CertificateApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCertificateProfileInfo**](V2CertificateApi.md#getCertificateProfileInfo) | **GET** /v2/certificate/profile/{profile_name} | Get Certificate Profile Info. |
| [**searchCertificates1**](V2CertificateApi.md#searchCertificates1) | **POST** /v2/certificate/search | Searches for certificates confirming given criteria and pagination. |
| [**status3**](V2CertificateApi.md#status3) | **GET** /v2/certificate/status | Get the status of this REST Resource |


<a name="getCertificateProfileInfo"></a>
# **getCertificateProfileInfo**
> CertificateProfileInfoRestResponseV2 getCertificateProfileInfo(profileName)

Get Certificate Profile Info.



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V2CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V2CertificateApi apiInstance = new V2CertificateApi(defaultClient);
    String profileName = "profileName_example"; // String | 
    try {
      CertificateProfileInfoRestResponseV2 result = apiInstance.getCertificateProfileInfo(profileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2CertificateApi#getCertificateProfileInfo");
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
| **profileName** | **String**|  | |

### Return type

[**CertificateProfileInfoRestResponseV2**](CertificateProfileInfoRestResponseV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="searchCertificates1"></a>
# **searchCertificates1**
> SearchCertificatesRestResponseV2 searchCertificates1(searchCertificatesRestRequestV2)

Searches for certificates confirming given criteria and pagination.

Insert as many search criteria as needed. A reference about allowed values for criteria could be found below, under SearchCertificateCriteriaRestRequestV2 model.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V2CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V2CertificateApi apiInstance = new V2CertificateApi(defaultClient);
    SearchCertificatesRestRequestV2 searchCertificatesRestRequestV2 = new SearchCertificatesRestRequestV2(); // SearchCertificatesRestRequestV2 | Collection of search criterias and pagination information.
    try {
      SearchCertificatesRestResponseV2 result = apiInstance.searchCertificates1(searchCertificatesRestRequestV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2CertificateApi#searchCertificates1");
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
| **searchCertificatesRestRequestV2** | [**SearchCertificatesRestRequestV2**](SearchCertificatesRestRequestV2.md)| Collection of search criterias and pagination information. | [optional] |

### Return type

[**SearchCertificatesRestResponseV2**](SearchCertificatesRestResponseV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="status3"></a>
# **status3**
> RestResourceStatusRestResponse status3()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V2CertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V2CertificateApi apiInstance = new V2CertificateApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status3();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2CertificateApi#status3");
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

