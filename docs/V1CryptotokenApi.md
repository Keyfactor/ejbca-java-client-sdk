# V1CryptotokenApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activate1**](V1CryptotokenApi.md#activate1) | **PUT** /v1/cryptotoken/{cryptotoken_name}/activate | Activate a Crypto Token |
| [**deactivate1**](V1CryptotokenApi.md#deactivate1) | **PUT** /v1/cryptotoken/{cryptotoken_name}/deactivate | Deactivate a Crypto Token |
| [**generateKeys**](V1CryptotokenApi.md#generateKeys) | **POST** /v1/cryptotoken/{cryptotoken_name}/generatekeys | Generate keys |
| [**removeKeys**](V1CryptotokenApi.md#removeKeys) | **POST** /v1/cryptotoken/{cryptotoken_name}/{key_pair_alias}/removekeys | Remove keys |
| [**status5**](V1CryptotokenApi.md#status5) | **GET** /v1/cryptotoken/status | Get the status of this REST Resource |


<a name="activate1"></a>
# **activate1**
> activate1(cryptotokenName, cryptoTokenActivationRestRequest)

Activate a Crypto Token

Activates Crypto Token given name and activation code

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CryptotokenApi;

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

    V1CryptotokenApi apiInstance = new V1CryptotokenApi(defaultClient);
    String cryptotokenName = "cryptotokenName_example"; // String | Name of the token to activate
    CryptoTokenActivationRestRequest cryptoTokenActivationRestRequest = new CryptoTokenActivationRestRequest(); // CryptoTokenActivationRestRequest | activation code
    try {
      apiInstance.activate1(cryptotokenName, cryptoTokenActivationRestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CryptotokenApi#activate1");
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
| **cryptotokenName** | **String**| Name of the token to activate | |
| **cryptoTokenActivationRestRequest** | [**CryptoTokenActivationRestRequest**](CryptoTokenActivationRestRequest.md)| activation code | [optional] |

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

<a name="deactivate1"></a>
# **deactivate1**
> deactivate1(cryptotokenName)

Deactivate a Crypto Token

Deactivates Crypto Token given name

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CryptotokenApi;

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

    V1CryptotokenApi apiInstance = new V1CryptotokenApi(defaultClient);
    String cryptotokenName = "cryptotokenName_example"; // String | Name of the token to deactivate
    try {
      apiInstance.deactivate1(cryptotokenName);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CryptotokenApi#deactivate1");
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
| **cryptotokenName** | **String**| Name of the token to deactivate | |

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

<a name="generateKeys"></a>
# **generateKeys**
> generateKeys(cryptotokenName, cryptoTokenKeyGenerationRestRequest)

Generate keys

Generates a key pair given crypto token name, key pair alias, key algorithm and key specification

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CryptotokenApi;

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

    V1CryptotokenApi apiInstance = new V1CryptotokenApi(defaultClient);
    String cryptotokenName = "cryptotokenName_example"; // String | Name of the token to generate keys for
    CryptoTokenKeyGenerationRestRequest cryptoTokenKeyGenerationRestRequest = new CryptoTokenKeyGenerationRestRequest(); // CryptoTokenKeyGenerationRestRequest | 
    try {
      apiInstance.generateKeys(cryptotokenName, cryptoTokenKeyGenerationRestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CryptotokenApi#generateKeys");
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
| **cryptotokenName** | **String**| Name of the token to generate keys for | |
| **cryptoTokenKeyGenerationRestRequest** | [**CryptoTokenKeyGenerationRestRequest**](CryptoTokenKeyGenerationRestRequest.md)|  | [optional] |

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

<a name="removeKeys"></a>
# **removeKeys**
> removeKeys(cryptotokenName, keyPairAlias)

Remove keys

Remove a key pair given crypto token name and key pair alias to be removed.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CryptotokenApi;

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

    V1CryptotokenApi apiInstance = new V1CryptotokenApi(defaultClient);
    String cryptotokenName = "cryptotokenName_example"; // String | Name of the token to remove keys for.
    String keyPairAlias = "keyPairAlias_example"; // String | Alias for the key to be removed from the crypto token.
    try {
      apiInstance.removeKeys(cryptotokenName, keyPairAlias);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CryptotokenApi#removeKeys");
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
| **cryptotokenName** | **String**| Name of the token to remove keys for. | |
| **keyPairAlias** | **String**| Alias for the key to be removed from the crypto token. | |

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

<a name="status5"></a>
# **status5**
> RestResourceStatusRestResponse status5()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.model.*;
import com.keyfactor.ejbca.client.api.V1CryptotokenApi;

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

    V1CryptotokenApi apiInstance = new V1CryptotokenApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status5();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1CryptotokenApi#status5");
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

