/*
 * EJBCA REST Interface
 * API reference documentation.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.keyfactor.ejbca.client.api;

import com.keyfactor.ejbca.client.ApiCallback;
import com.keyfactor.ejbca.client.ApiClient;
import com.keyfactor.ejbca.client.ApiException;
import com.keyfactor.ejbca.client.ApiResponse;
import com.keyfactor.ejbca.client.Configuration;
import com.keyfactor.ejbca.client.Pair;
import com.keyfactor.ejbca.client.ProgressRequestBody;
import com.keyfactor.ejbca.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.keyfactor.ejbca.model.CertificateProfileInfoRestResponseV2;
import com.keyfactor.ejbca.model.RestResourceStatusRestResponse;
import com.keyfactor.ejbca.model.SearchCertificatesRestRequestV2;
import com.keyfactor.ejbca.model.SearchCertificatesRestResponseV2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class V2CertificateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public V2CertificateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public V2CertificateApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getCertificateProfileInfo
     * @param profileName  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificateProfileInfoCall(String profileName, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/certificate/profile/{profile_name}"
            .replaceAll("\\{" + "profile_name" + "\\}", localVarApiClient.escapeString(profileName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificateProfileInfoValidateBeforeCall(String profileName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'profileName' is set
        if (profileName == null) {
            throw new ApiException("Missing the required parameter 'profileName' when calling getCertificateProfileInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getCertificateProfileInfoCall(profileName, _callback);
        return localVarCall;

    }

    /**
     * Get Certificate Profile Info.
     * 
     * @param profileName  (required)
     * @return CertificateProfileInfoRestResponseV2
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public CertificateProfileInfoRestResponseV2 getCertificateProfileInfo(String profileName) throws ApiException {
        ApiResponse<CertificateProfileInfoRestResponseV2> localVarResp = getCertificateProfileInfoWithHttpInfo(profileName);
        return localVarResp.getData();
    }

    /**
     * Get Certificate Profile Info.
     * 
     * @param profileName  (required)
     * @return ApiResponse&lt;CertificateProfileInfoRestResponseV2&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CertificateProfileInfoRestResponseV2> getCertificateProfileInfoWithHttpInfo(String profileName) throws ApiException {
        okhttp3.Call localVarCall = getCertificateProfileInfoValidateBeforeCall(profileName, null);
        Type localVarReturnType = new TypeToken<CertificateProfileInfoRestResponseV2>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Certificate Profile Info. (asynchronously)
     * 
     * @param profileName  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificateProfileInfoAsync(String profileName, final ApiCallback<CertificateProfileInfoRestResponseV2> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificateProfileInfoValidateBeforeCall(profileName, _callback);
        Type localVarReturnType = new TypeToken<CertificateProfileInfoRestResponseV2>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchCertificates1
     * @param searchCertificatesRestRequestV2 Collection of search criterias and pagination information. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchCertificates1Call(SearchCertificatesRestRequestV2 searchCertificatesRestRequestV2, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchCertificatesRestRequestV2;

        // create path and map variables
        String localVarPath = "/v2/certificate/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchCertificates1ValidateBeforeCall(SearchCertificatesRestRequestV2 searchCertificatesRestRequestV2, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchCertificates1Call(searchCertificatesRestRequestV2, _callback);
        return localVarCall;

    }

    /**
     * Searches for certificates confirming given criteria and pagination.
     * Insert as many search criteria as needed. A reference about allowed values for criteria could be found below, under SearchCertificateCriteriaRestRequestV2 model.
     * @param searchCertificatesRestRequestV2 Collection of search criterias and pagination information. (optional)
     * @return SearchCertificatesRestResponseV2
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public SearchCertificatesRestResponseV2 searchCertificates1(SearchCertificatesRestRequestV2 searchCertificatesRestRequestV2) throws ApiException {
        ApiResponse<SearchCertificatesRestResponseV2> localVarResp = searchCertificates1WithHttpInfo(searchCertificatesRestRequestV2);
        return localVarResp.getData();
    }

    /**
     * Searches for certificates confirming given criteria and pagination.
     * Insert as many search criteria as needed. A reference about allowed values for criteria could be found below, under SearchCertificateCriteriaRestRequestV2 model.
     * @param searchCertificatesRestRequestV2 Collection of search criterias and pagination information. (optional)
     * @return ApiResponse&lt;SearchCertificatesRestResponseV2&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchCertificatesRestResponseV2> searchCertificates1WithHttpInfo(SearchCertificatesRestRequestV2 searchCertificatesRestRequestV2) throws ApiException {
        okhttp3.Call localVarCall = searchCertificates1ValidateBeforeCall(searchCertificatesRestRequestV2, null);
        Type localVarReturnType = new TypeToken<SearchCertificatesRestResponseV2>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Searches for certificates confirming given criteria and pagination. (asynchronously)
     * Insert as many search criteria as needed. A reference about allowed values for criteria could be found below, under SearchCertificateCriteriaRestRequestV2 model.
     * @param searchCertificatesRestRequestV2 Collection of search criterias and pagination information. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchCertificates1Async(SearchCertificatesRestRequestV2 searchCertificatesRestRequestV2, final ApiCallback<SearchCertificatesRestResponseV2> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchCertificates1ValidateBeforeCall(searchCertificatesRestRequestV2, _callback);
        Type localVarReturnType = new TypeToken<SearchCertificatesRestResponseV2>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for status3
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call status3Call(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/certificate/status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call status3ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = status3Call(_callback);
        return localVarCall;

    }

    /**
     * Get the status of this REST Resource
     * Returns status, API version and EJBCA version.
     * @return RestResourceStatusRestResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public RestResourceStatusRestResponse status3() throws ApiException {
        ApiResponse<RestResourceStatusRestResponse> localVarResp = status3WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get the status of this REST Resource
     * Returns status, API version and EJBCA version.
     * @return ApiResponse&lt;RestResourceStatusRestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RestResourceStatusRestResponse> status3WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = status3ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<RestResourceStatusRestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the status of this REST Resource (asynchronously)
     * Returns status, API version and EJBCA version.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call status3Async(final ApiCallback<RestResourceStatusRestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = status3ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<RestResourceStatusRestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
