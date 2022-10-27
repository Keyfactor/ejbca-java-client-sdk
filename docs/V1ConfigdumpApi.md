# V1ConfigdumpApi

All URIs are relative to *http://localhost/ejbca/ejbca-rest-api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getJsonConfigdump**](V1ConfigdumpApi.md#getJsonConfigdump) | **GET** /v1/configdump | Get the configuration in JSON. |
| [**getJsonConfigdumpForType**](V1ConfigdumpApi.md#getJsonConfigdumpForType) | **GET** /v1/configdump/{type} | Get the configuration for type in JSON. |
| [**getJsonConfigdumpForTypeAndSetting**](V1ConfigdumpApi.md#getJsonConfigdumpForTypeAndSetting) | **GET** /v1/configdump/{type}/{setting} | Get the configuration for a type and setting in JSON. |
| [**getZipExport**](V1ConfigdumpApi.md#getZipExport) | **GET** /v1/configdump/configdump.zip | Get the configuration as a ZIP file. |
| [**postJsonImport**](V1ConfigdumpApi.md#postJsonImport) | **POST** /v1/configdump | Put the configuration in JSON. |
| [**postZipImport**](V1ConfigdumpApi.md#postZipImport) | **POST** /v1/configdump/configdump.zip | Put the configuration as a ZIP file. |
| [**status4**](V1ConfigdumpApi.md#status4) | **GET** /v1/configdump/status | Get the status of this REST Resource |


<a name="getJsonConfigdump"></a>
# **getJsonConfigdump**
> List&lt;byte[]&gt; getJsonConfigdump(ignoreerrors, defaults, externalcas, include, exclude)

Get the configuration in JSON.

Returns the configdump data in JSON.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    Boolean ignoreerrors = false; // Boolean | Print a warning instead of aborting and throwing an exception on errors.
    Boolean defaults = false; // Boolean | Also include fields having the default value.
    Boolean externalcas = false; // Boolean | Enables export of external CAs (i.e. CAs where there's only a certificate and nothing else)
    List<String> include = Arrays.asList(); // List<String> | Names of items/types to include in the export. The syntax is identical to that of exclude. For items of types that aren't listed, everything is included.
    List<String> exclude = Arrays.asList(); // List<String> | Names of items/types to exclude in the export, separated by semicolon. Type and name is separated by a colon, and wildcards \"\\*\" are allowed. Both are case-insensitive. E.g. exclude=\"\\*:Example CA;cryptotoken:Example\\*;systemconfiguration:\\*\".  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols
    try {
      List<byte[]> result = apiInstance.getJsonConfigdump(ignoreerrors, defaults, externalcas, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#getJsonConfigdump");
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
| **ignoreerrors** | **Boolean**| Print a warning instead of aborting and throwing an exception on errors. | [optional] [default to false] |
| **defaults** | **Boolean**| Also include fields having the default value. | [optional] [default to false] |
| **externalcas** | **Boolean**| Enables export of external CAs (i.e. CAs where there&#39;s only a certificate and nothing else) | [optional] [default to false] |
| **include** | [**List&lt;String&gt;**](String.md)| Names of items/types to include in the export. The syntax is identical to that of exclude. For items of types that aren&#39;t listed, everything is included. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Names of items/types to exclude in the export, separated by semicolon. Type and name is separated by a colon, and wildcards \&quot;\\*\&quot; are allowed. Both are case-insensitive. E.g. exclude&#x3D;\&quot;\\*:Example CA;cryptotoken:Example\\*;systemconfiguration:\\*\&quot;.  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols | [optional] |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getJsonConfigdumpForType"></a>
# **getJsonConfigdumpForType**
> List&lt;byte[]&gt; getJsonConfigdumpForType(type, ignoreerrors, defaults, externalcas)

Get the configuration for type in JSON.

Returns the configdump data in JSON.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    String type = "type_example"; // String | Configuration type to export.  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols
    Boolean ignoreerrors = false; // Boolean | Print a warning instead of aborting and throwing an exception on errors.
    Boolean defaults = false; // Boolean | Also include fields having the default value.
    Boolean externalcas = false; // Boolean | Enables export of external CAs (i.e. CAs where there's only a certificate and nothing else)
    try {
      List<byte[]> result = apiInstance.getJsonConfigdumpForType(type, ignoreerrors, defaults, externalcas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#getJsonConfigdumpForType");
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
| **type** | **String**| Configuration type to export.  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols | |
| **ignoreerrors** | **Boolean**| Print a warning instead of aborting and throwing an exception on errors. | [optional] [default to false] |
| **defaults** | **Boolean**| Also include fields having the default value. | [optional] [default to false] |
| **externalcas** | **Boolean**| Enables export of external CAs (i.e. CAs where there&#39;s only a certificate and nothing else) | [optional] [default to false] |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getJsonConfigdumpForTypeAndSetting"></a>
# **getJsonConfigdumpForTypeAndSetting**
> List&lt;byte[]&gt; getJsonConfigdumpForTypeAndSetting(type, setting, ignoreerrors, defaults)

Get the configuration for a type and setting in JSON.

Returns the configdump data in JSON.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    String type = "type_example"; // String | Configuration type to export.  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols
    String setting = "setting_example"; // String | Individual configuration name to export
    Boolean ignoreerrors = false; // Boolean | Print a warning instead of aborting and throwing an exception on errors.
    Boolean defaults = false; // Boolean | Also include fields having the default value.
    try {
      List<byte[]> result = apiInstance.getJsonConfigdumpForTypeAndSetting(type, setting, ignoreerrors, defaults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#getJsonConfigdumpForTypeAndSetting");
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
| **type** | **String**| Configuration type to export.  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols | |
| **setting** | **String**| Individual configuration name to export | |
| **ignoreerrors** | **Boolean**| Print a warning instead of aborting and throwing an exception on errors. | [optional] [default to false] |
| **defaults** | **Boolean**| Also include fields having the default value. | [optional] [default to false] |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getZipExport"></a>
# **getZipExport**
> List&lt;byte[]&gt; getZipExport(ignoreerrors, defaults, externalcas, include, exclude)

Get the configuration as a ZIP file.

Returns a zip archive of YAML files.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    Boolean ignoreerrors = false; // Boolean | Print a warning instead of aborting and throwing an exception on errors.
    Boolean defaults = false; // Boolean | Also include fields having the default value.
    Boolean externalcas = false; // Boolean | Enables export of external CAs (i.e. CAs where there's only a certificate and nothing else)
    List<String> include = Arrays.asList(); // List<String> | Names of items/types to include in the export. The syntax is identical to that of exclude. For items of types that aren't listed, everything is included.
    List<String> exclude = Arrays.asList(); // List<String> | Names of items/types to exclude in the export, separated by semicolon. Type and name is separated by a colon, and wildcards \"\\*\" are allowed. Both are case-insensitive. E.g. exclude=\"\\*:Example CA;cryptotoken:Example\\*;systemconfiguration:\\*\".  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols
    try {
      List<byte[]> result = apiInstance.getZipExport(ignoreerrors, defaults, externalcas, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#getZipExport");
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
| **ignoreerrors** | **Boolean**| Print a warning instead of aborting and throwing an exception on errors. | [optional] [default to false] |
| **defaults** | **Boolean**| Also include fields having the default value. | [optional] [default to false] |
| **externalcas** | **Boolean**| Enables export of external CAs (i.e. CAs where there&#39;s only a certificate and nothing else) | [optional] [default to false] |
| **include** | [**List&lt;String&gt;**](String.md)| Names of items/types to include in the export. The syntax is identical to that of exclude. For items of types that aren&#39;t listed, everything is included. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Names of items/types to exclude in the export, separated by semicolon. Type and name is separated by a colon, and wildcards \&quot;\\*\&quot; are allowed. Both are case-insensitive. E.g. exclude&#x3D;\&quot;\\*:Example CA;cryptotoken:Example\\*;systemconfiguration:\\*\&quot;.  Supported types are: ACMECONFIG/acme-config, CA/certification-authorities,  CRYPTOTOKEN/crypto-tokens, PUBLISHER/publishers, APPROVALPROFILE/approval-profiles, CERTPROFILE/certificate-profiles, EEPROFILE/end-entity-profiles, SERVICE/services, ROLE/admin-roles, KEYBINDING/internal-key-bindings, ADMINPREFS/admin-preferences, OCSPCONFIG/ocsp-configuration, PEERCONNECTOR/peer-connectors, SCEPCONFIG/scep-config, CMPCONFIG/cmp-config, ESTCONFIG/est-config, VALIDATOR/validators, CTLOG/ct-logs, EXTENDEDKEYUSAGE/extended-key-usage, CERTEXTENSION/custom-certificate-extensions,  OAUTHKEY/trusted-oauth-providers, AVAILABLEPROTOCOLS/available-protocols | [optional] |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="postJsonImport"></a>
# **postJsonImport**
> ConfigdumpResults postJsonImport(ignoreerrors, initialize, _continue, overwrite, resolve, body)

Put the configuration in JSON.



### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    Boolean ignoreerrors = false; // Boolean | Add to warnings instead of aborting on errors.
    Boolean initialize = false; // Boolean | Generate initial certificate for CAs on import
    Boolean _continue = false; // Boolean | Continue on errors. Default is to abort.
    String overwrite = "true"; // String | How to handle already existing configuration. Options are abort,skip,yes
    String resolve = "abort"; // String | How to resolve missing references. Options are abort,skip,default
    String body = "body_example"; // String | JSON data in configdump format
    try {
      ConfigdumpResults result = apiInstance.postJsonImport(ignoreerrors, initialize, _continue, overwrite, resolve, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#postJsonImport");
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
| **ignoreerrors** | **Boolean**| Add to warnings instead of aborting on errors. | [optional] [default to false] |
| **initialize** | **Boolean**| Generate initial certificate for CAs on import | [optional] [default to false] |
| **_continue** | **Boolean**| Continue on errors. Default is to abort. | [optional] [default to false] |
| **overwrite** | **String**| How to handle already existing configuration. Options are abort,skip,yes | [optional] [default to abort] [enum: true, skip, abort] |
| **resolve** | **String**| How to resolve missing references. Options are abort,skip,default | [optional] [default to abort] [enum: abort, skip, useDefault] |
| **body** | **String**| JSON data in configdump format | [optional] |

### Return type

[**ConfigdumpResults**](ConfigdumpResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="postZipImport"></a>
# **postZipImport**
> ConfigdumpResults postZipImport(zipfile, ignoreerrors, initialize, _continue, overwrite, resolve)

Put the configuration as a ZIP file.



### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    File zipfile = new File("/path/to/file"); // File | A zipfile containing directories of YAML files.
    Boolean ignoreerrors = false; // Boolean | Add to warnings instead of aborting on errors.
    Boolean initialize = false; // Boolean | Generate initial certificate for CAs on import
    Boolean _continue = false; // Boolean | Continue on errors. Default is to abort.
    String overwrite = "true"; // String | How to handle already existing configuration. Options are abort,skip,yes
    String resolve = "abort"; // String | How to resolve missing references. Options are abort,skip,default
    try {
      ConfigdumpResults result = apiInstance.postZipImport(zipfile, ignoreerrors, initialize, _continue, overwrite, resolve);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#postZipImport");
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
| **zipfile** | **File**| A zipfile containing directories of YAML files. | [optional] |
| **ignoreerrors** | **Boolean**| Add to warnings instead of aborting on errors. | [optional] [default to false] |
| **initialize** | **Boolean**| Generate initial certificate for CAs on import | [optional] [default to false] |
| **_continue** | **Boolean**| Continue on errors. Default is to abort. | [optional] [default to false] |
| **overwrite** | **String**| How to handle already existing configuration. Options are abort,skip,yes | [optional] [default to abort] [enum: true, skip, abort] |
| **resolve** | **String**| How to resolve missing references. Options are abort,skip,default | [optional] [default to abort] [enum: abort, skip, useDefault] |

### Return type

[**ConfigdumpResults**](ConfigdumpResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="status4"></a>
# **status4**
> RestResourceStatusRestResponse status4()

Get the status of this REST Resource

Returns status, API version and EJBCA version.

### Example
```java
// Import classes:
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.models.*;
import com.keyfactor.ejbca.client.api.V1ConfigdumpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ejbca/ejbca-rest-api");

    V1ConfigdumpApi apiInstance = new V1ConfigdumpApi(defaultClient);
    try {
      RestResourceStatusRestResponse result = apiInstance.status4();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1ConfigdumpApi#status4");
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

