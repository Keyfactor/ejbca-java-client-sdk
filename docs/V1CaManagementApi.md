# V1CaManagementApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activate**](V1CaManagementApi.md#activate) | **PUT** /v1/ca_management/{ca_name}/activate | Activate a CA |
| [**deactivate**](V1CaManagementApi.md#deactivate) | **PUT** /v1/ca_management/{ca_name}/deactivate | Deactivate a CA |
| [**status**](V1CaManagementApi.md#status) | **GET** /v1/ca_management/status | Get the status of this REST Resource |


<a name="activate"></a>
# **activate**
> activate(caName)

Activate a CA

Activates CA with given name

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1CaManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaManagementApi apiInstance = new V1CaManagementApi(defaultClient);
    String caName = "caName_example"; // String | Name of the CA to activate
    try {
      apiInstance.activate(caName);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaManagementApi#activate");
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
| **caName** | **String**| Name of the CA to activate | |

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
| **200** | CA activated |  -  |

<a name="deactivate"></a>
# **deactivate**
> deactivate(caName)

Deactivate a CA

Deactivates CA with given name

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1CaManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaManagementApi apiInstance = new V1CaManagementApi(defaultClient);
    String caName = "caName_example"; // String | Name of the CA to deactivate
    try {
      apiInstance.deactivate(caName);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaManagementApi#deactivate");
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
| **caName** | **String**| Name of the CA to deactivate | |

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
| **200** | CA deactivated |  -  |

<a name="status"></a>
# **status**
> RestResourceStatusRestResponse status()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1CaManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1CaManagementApi apiInstance = new V1CaManagementApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CaManagementApi#status");
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

