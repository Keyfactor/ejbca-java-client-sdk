# V1SshApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pubkey**](V1SshApi.md#pubkey) | **GET** /v1/ssh/{ca_name}/pubkey | Retrieves a CA&#39;s public key in SSH format. |
| [**status8**](V1SshApi.md#status8) | **GET** /v1/ssh/status | Get the status of this REST Resource |


<a name="pubkey"></a>
# **pubkey**
> SshPublicKeyRestResponse pubkey(caName)

Retrieves a CA&#39;s public key in SSH format.

Retrieves a CA&#39;s public key in SSH format.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1SshApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1SshApi apiInstance = new V1SshApi(defaultClient);
    String caName = "caName_example"; // String | 
    try {
      SshPublicKeyRestResponse result = apiInstance.pubkey(caName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1SshApi#pubkey");
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
| **caName** | **String**|  | |

### Return type

[**SshPublicKeyRestResponse**](SshPublicKeyRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="status8"></a>
# **status8**
> RestResourceStatusRestResponse status8()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1SshApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1SshApi apiInstance = new V1SshApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status8();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1SshApi#status8");
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

