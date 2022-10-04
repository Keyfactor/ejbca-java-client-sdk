# V1EndentityApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](V1EndentityApi.md#add) | **POST** /v1/endentity | Add new end entity, if it does not exist |
| [**delete**](V1EndentityApi.md#delete) | **DELETE** /v1/endentity/{endentity_name} | Deletes end entity |
| [**revoke**](V1EndentityApi.md#revoke) | **PUT** /v1/endentity/{endentity_name}/revoke | Revokes all end entity certificates |
| [**search**](V1EndentityApi.md#search) | **POST** /v1/endentity/search | Searches for end entity confirming given criteria. |
| [**setstatus**](V1EndentityApi.md#setstatus) | **POST** /v1/endentity/{endentity_name}/setstatus | Edits end entity setting new status |
| [**status6**](V1EndentityApi.md#status6) | **GET** /v1/endentity/status | Get the status of this REST Resource |


<a name="add"></a>
# **add**
> add(addEndEntityRestRequest)

Add new end entity, if it does not exist

Register new end entity based on provided registration data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1EndentityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1EndentityApi apiInstance = new V1EndentityApi(defaultClient);
    AddEndEntityRestRequest addEndEntityRestRequest = new AddEndEntityRestRequest(); // AddEndEntityRestRequest | request
    try {
      apiInstance.add(addEndEntityRestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1EndentityApi#add");
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
| **addEndEntityRestRequest** | [**AddEndEntityRestRequest**](AddEndEntityRestRequest.md)| request | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="delete"></a>
# **delete**
> delete(endentityName)

Deletes end entity

Deletes specified end entity and keeps certificate information untouched, if end entity does not exist success is still returned

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1EndentityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1EndentityApi apiInstance = new V1EndentityApi(defaultClient);
    String endentityName = "endentityName_example"; // String | Name of the end entity
    try {
      apiInstance.delete(endentityName);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1EndentityApi#delete");
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
| **endentityName** | **String**| Name of the end entity | |

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

<a name="revoke"></a>
# **revoke**
> revoke(endentityName, endEntityRevocationRestRequest)

Revokes all end entity certificates

Revokes all certificates associated with given end entity name with specified reason code (see RFC 5280 Section 5.3.1), and optionally deletes the end entity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1EndentityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1EndentityApi apiInstance = new V1EndentityApi(defaultClient);
    String endentityName = "endentityName_example"; // String | Name of the end entity
    EndEntityRevocationRestRequest endEntityRevocationRestRequest = new EndEntityRevocationRestRequest(); // EndEntityRevocationRestRequest | request
    try {
      apiInstance.revoke(endentityName, endEntityRevocationRestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1EndentityApi#revoke");
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
| **endentityName** | **String**| Name of the end entity | |
| **endEntityRevocationRestRequest** | [**EndEntityRevocationRestRequest**](EndEntityRevocationRestRequest.md)| request | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="search"></a>
# **search**
> SearchEndEntitiesRestResponse search(searchEndEntitiesRestRequest)

Searches for end entity confirming given criteria.

Insert as many search criteria as needed. A reference about allowed values for criteria could be found below, under SearchEndEntityCriteriaRestRequest model.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1EndentityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1EndentityApi apiInstance = new V1EndentityApi(defaultClient);
    SearchEndEntitiesRestRequest searchEndEntitiesRestRequest = new SearchEndEntitiesRestRequest(); // SearchEndEntitiesRestRequest | Maximum number of results and collection of search criterias.
    try {
      SearchEndEntitiesRestResponse result = apiInstance.search(searchEndEntitiesRestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1EndentityApi#search");
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
| **searchEndEntitiesRestRequest** | [**SearchEndEntitiesRestRequest**](SearchEndEntitiesRestRequest.md)| Maximum number of results and collection of search criterias. | [optional] |

### Return type

[**SearchEndEntitiesRestResponse**](SearchEndEntitiesRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="setstatus"></a>
# **setstatus**
> setstatus(endentityName, setEndEntityStatusRestRequest)

Edits end entity setting new status

Edit status, password and token type of related end entity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1EndentityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1EndentityApi apiInstance = new V1EndentityApi(defaultClient);
    String endentityName = "endentityName_example"; // String | Name of the end entity to edit status for
    SetEndEntityStatusRestRequest setEndEntityStatusRestRequest = new SetEndEntityStatusRestRequest(); // SetEndEntityStatusRestRequest | request
    try {
      apiInstance.setstatus(endentityName, setEndEntityStatusRestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1EndentityApi#setstatus");
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
| **endentityName** | **String**| Name of the end entity to edit status for | |
| **setEndEntityStatusRestRequest** | [**SetEndEntityStatusRestRequest**](SetEndEntityStatusRestRequest.md)| request | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="status6"></a>
# **status6**
> RestResourceStatusRestResponse status6()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1EndentityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1EndentityApi apiInstance = new V1EndentityApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status6();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1EndentityApi#status6");
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

