# V2EndentityApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthorizedEndEntityProfiles**](V2EndentityApi.md#getAuthorizedEndEntityProfiles) | **GET** /v2/endentity/profiles/authorized | List of authorized end entity profiles for the current admin. |
| [**profile**](V2EndentityApi.md#profile) | **GET** /v2/endentity/profile/{endentity_profile_name} | Get End Entity Profile content |
| [**sortedSearch**](V2EndentityApi.md#sortedSearch) | **POST** /v2/endentity/search | Searches and sorts for end entity conforming given criteria. |
| [**status7**](V2EndentityApi.md#status7) | **GET** /v2/endentity/status | Get the status of this REST Resource |


<a name="getAuthorizedEndEntityProfiles"></a>
# **getAuthorizedEndEntityProfiles**
> AuthorizedEEPsRestResponse getAuthorizedEndEntityProfiles()

List of authorized end entity profiles for the current admin.

Returns list of all authorized end entity profiles for the current admin token

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V2EndentityApi;

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

    V2EndentityApi apiInstance = new V2EndentityApi(defaultClient);
    try {
      AuthorizedEEPsRestResponse result = apiInstance.getAuthorizedEndEntityProfiles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2EndentityApi#getAuthorizedEndEntityProfiles");
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

[**AuthorizedEEPsRestResponse**](AuthorizedEEPsRestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="profile"></a>
# **profile**
> EndEntityProfileResponse profile(endentityProfileName)

Get End Entity Profile content

Returns End Entity Profile configurations: List of available CAs, list of available Certificate Profiles.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V2EndentityApi;

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

    V2EndentityApi apiInstance = new V2EndentityApi(defaultClient);
    String endentityProfileName = "endentityProfileName_example"; // String | 
    try {
      EndEntityProfileResponse result = apiInstance.profile(endentityProfileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2EndentityApi#profile");
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
| **endentityProfileName** | **String**|  | |

### Return type

[**EndEntityProfileResponse**](EndEntityProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="sortedSearch"></a>
# **sortedSearch**
> SearchEndEntitiesRestResponse sortedSearch(searchEndEntitiesRestRequestV2)

Searches and sorts for end entity conforming given criteria.

Insert as many search criteria as needed and optionally a sorting criteria. A reference about allowed values for criteria could be found below, under SearchEndEntityCriteriaRestRequestV2 model.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V2EndentityApi;

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

    V2EndentityApi apiInstance = new V2EndentityApi(defaultClient);
    SearchEndEntitiesRestRequestV2 searchEndEntitiesRestRequestV2 = new SearchEndEntitiesRestRequestV2(); // SearchEndEntitiesRestRequestV2 | Maximum number of results and collection of search criterias.
    try {
      SearchEndEntitiesRestResponse result = apiInstance.sortedSearch(searchEndEntitiesRestRequestV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2EndentityApi#sortedSearch");
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
| **searchEndEntitiesRestRequestV2** | [**SearchEndEntitiesRestRequestV2**](SearchEndEntitiesRestRequestV2.md)| Maximum number of results and collection of search criterias. | [optional] |

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

<a name="status7"></a>
# **status7**
> RestResourceStatusRestResponse status7()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V2EndentityApi;

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

    V2EndentityApi apiInstance = new V2EndentityApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status7();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2EndentityApi#status7");
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

