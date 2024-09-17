/*
 * MX Platform API
 * The MX Platform API is a powerful, fully-featured API designed to make aggregating and enhancing financial data easy and reliable. It can seamlessly connect your app or website to tens of thousands of financial institutions.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mx.client.mx_platform_api;

import com.mx.client.ApiCallback;
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.ApiResponse;
import com.mx.client.Configuration;
import com.mx.client.Pair;
import com.mx.client.ProgressRequestBody;
import com.mx.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mx.client.model.MicrodepositRequestBody;
import com.mx.client.model.MicrodepositResponseBody;
import com.mx.client.model.MicrodepositVerifyRequestBody;
import com.mx.client.model.MicrodepositsResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MicrodepositsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MicrodepositsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MicrodepositsApi(ApiClient apiClient) {
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
     * Build call for microDepositsMicrodepositGuidVerifyPut
     * @param microdepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param microdepositVerifyRequestBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call microDepositsMicrodepositGuidVerifyPutCall(String microdepositGuid, MicrodepositVerifyRequestBody microdepositVerifyRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = microdepositVerifyRequestBody;

        // create path and map variables
        String localVarPath = "/micro_deposits/{microdeposit_guid}/verify"
            .replace("{" + "microdeposit_guid" + "}", localVarApiClient.escapeString(microdepositGuid.toString()));

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call microDepositsMicrodepositGuidVerifyPutValidateBeforeCall(String microdepositGuid, MicrodepositVerifyRequestBody microdepositVerifyRequestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'microdepositGuid' is set
        if (microdepositGuid == null) {
            throw new ApiException("Missing the required parameter 'microdepositGuid' when calling microDepositsMicrodepositGuidVerifyPut(Async)");
        }

        return microDepositsMicrodepositGuidVerifyPutCall(microdepositGuid, microdepositVerifyRequestBody, _callback);

    }

    /**
     * Verify a Microdeposit
     * Use this endpoint to verify the amounts deposited into the account during a microdeposit verification. The verification has not successfully completed until the &#x60;status&#x60; is &#x60;VERIFIED&#x60;. Poll the &#x60;/users/{user_guid}/micro_deposits/{micro_deposit_guid}&#x60; (read microdeposit) endpoint until you see this status or an error state.
     * @param microdepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param microdepositVerifyRequestBody  (optional)
     * @return MicrodepositResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public MicrodepositResponseBody microDepositsMicrodepositGuidVerifyPut(String microdepositGuid, MicrodepositVerifyRequestBody microdepositVerifyRequestBody) throws ApiException {
        ApiResponse<MicrodepositResponseBody> localVarResp = microDepositsMicrodepositGuidVerifyPutWithHttpInfo(microdepositGuid, microdepositVerifyRequestBody);
        return localVarResp.getData();
    }

    /**
     * Verify a Microdeposit
     * Use this endpoint to verify the amounts deposited into the account during a microdeposit verification. The verification has not successfully completed until the &#x60;status&#x60; is &#x60;VERIFIED&#x60;. Poll the &#x60;/users/{user_guid}/micro_deposits/{micro_deposit_guid}&#x60; (read microdeposit) endpoint until you see this status or an error state.
     * @param microdepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param microdepositVerifyRequestBody  (optional)
     * @return ApiResponse&lt;MicrodepositResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MicrodepositResponseBody> microDepositsMicrodepositGuidVerifyPutWithHttpInfo(String microdepositGuid, MicrodepositVerifyRequestBody microdepositVerifyRequestBody) throws ApiException {
        okhttp3.Call localVarCall = microDepositsMicrodepositGuidVerifyPutValidateBeforeCall(microdepositGuid, microdepositVerifyRequestBody, null);
        Type localVarReturnType = new TypeToken<MicrodepositResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Verify a Microdeposit (asynchronously)
     * Use this endpoint to verify the amounts deposited into the account during a microdeposit verification. The verification has not successfully completed until the &#x60;status&#x60; is &#x60;VERIFIED&#x60;. Poll the &#x60;/users/{user_guid}/micro_deposits/{micro_deposit_guid}&#x60; (read microdeposit) endpoint until you see this status or an error state.
     * @param microdepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param microdepositVerifyRequestBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call microDepositsMicrodepositGuidVerifyPutAsync(String microdepositGuid, MicrodepositVerifyRequestBody microdepositVerifyRequestBody, final ApiCallback<MicrodepositResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = microDepositsMicrodepositGuidVerifyPutValidateBeforeCall(microdepositGuid, microdepositVerifyRequestBody, _callback);
        Type localVarReturnType = new TypeToken<MicrodepositResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersUserGuidMicroDepositsGet
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsGetCall(String userGuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{user_guid}/micro_deposits"
            .replace("{" + "user_guid" + "}", localVarApiClient.escapeString(userGuid.toString()));

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call usersUserGuidMicroDepositsGetValidateBeforeCall(String userGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling usersUserGuidMicroDepositsGet(Async)");
        }

        return usersUserGuidMicroDepositsGetCall(userGuid, _callback);

    }

    /**
     * List all microdeposits for a user
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @return MicrodepositsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public MicrodepositsResponseBody usersUserGuidMicroDepositsGet(String userGuid) throws ApiException {
        ApiResponse<MicrodepositsResponseBody> localVarResp = usersUserGuidMicroDepositsGetWithHttpInfo(userGuid);
        return localVarResp.getData();
    }

    /**
     * List all microdeposits for a user
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @return ApiResponse&lt;MicrodepositsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MicrodepositsResponseBody> usersUserGuidMicroDepositsGetWithHttpInfo(String userGuid) throws ApiException {
        okhttp3.Call localVarCall = usersUserGuidMicroDepositsGetValidateBeforeCall(userGuid, null);
        Type localVarReturnType = new TypeToken<MicrodepositsResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all microdeposits for a user (asynchronously)
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsGetAsync(String userGuid, final ApiCallback<MicrodepositsResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersUserGuidMicroDepositsGetValidateBeforeCall(userGuid, _callback);
        Type localVarReturnType = new TypeToken<MicrodepositsResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersUserGuidMicroDepositsMicroDepositGuidDelete
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param userGuid The unique id for a &#x60;user&#x60;. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsMicroDepositGuidDeleteCall(String microDepositGuid, String userGuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{user_guid}/micro_deposits/{micro_deposit_guid}"
            .replace("{" + "micro_deposit_guid" + "}", localVarApiClient.escapeString(microDepositGuid.toString()))
            .replace("{" + "user_guid" + "}", localVarApiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call usersUserGuidMicroDepositsMicroDepositGuidDeleteValidateBeforeCall(String microDepositGuid, String userGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'microDepositGuid' is set
        if (microDepositGuid == null) {
            throw new ApiException("Missing the required parameter 'microDepositGuid' when calling usersUserGuidMicroDepositsMicroDepositGuidDelete(Async)");
        }

        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling usersUserGuidMicroDepositsMicroDepositGuidDelete(Async)");
        }

        return usersUserGuidMicroDepositsMicroDepositGuidDeleteCall(microDepositGuid, userGuid, _callback);

    }

    /**
     * Delete a microdeposit
     * Use this endpoint to delete the specified microdeposit.
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param userGuid The unique id for a &#x60;user&#x60;. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void usersUserGuidMicroDepositsMicroDepositGuidDelete(String microDepositGuid, String userGuid) throws ApiException {
        usersUserGuidMicroDepositsMicroDepositGuidDeleteWithHttpInfo(microDepositGuid, userGuid);
    }

    /**
     * Delete a microdeposit
     * Use this endpoint to delete the specified microdeposit.
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param userGuid The unique id for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> usersUserGuidMicroDepositsMicroDepositGuidDeleteWithHttpInfo(String microDepositGuid, String userGuid) throws ApiException {
        okhttp3.Call localVarCall = usersUserGuidMicroDepositsMicroDepositGuidDeleteValidateBeforeCall(microDepositGuid, userGuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a microdeposit (asynchronously)
     * Use this endpoint to delete the specified microdeposit.
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param userGuid The unique id for a &#x60;user&#x60;. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsMicroDepositGuidDeleteAsync(String microDepositGuid, String userGuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersUserGuidMicroDepositsMicroDepositGuidDeleteValidateBeforeCall(microDepositGuid, userGuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersUserGuidMicroDepositsMicroDepositGuidGet
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsMicroDepositGuidGetCall(String userGuid, String microDepositGuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{user_guid}/micro_deposits/{micro_deposit_guid}"
            .replace("{" + "user_guid" + "}", localVarApiClient.escapeString(userGuid.toString()))
            .replace("{" + "micro_deposit_guid" + "}", localVarApiClient.escapeString(microDepositGuid.toString()));

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call usersUserGuidMicroDepositsMicroDepositGuidGetValidateBeforeCall(String userGuid, String microDepositGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling usersUserGuidMicroDepositsMicroDepositGuidGet(Async)");
        }

        // verify the required parameter 'microDepositGuid' is set
        if (microDepositGuid == null) {
            throw new ApiException("Missing the required parameter 'microDepositGuid' when calling usersUserGuidMicroDepositsMicroDepositGuidGet(Async)");
        }

        return usersUserGuidMicroDepositsMicroDepositGuidGetCall(userGuid, microDepositGuid, _callback);

    }

    /**
     * Read a microdeposit for a user
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID. &lt;br&gt;&lt;/br&gt; Webhooks for microdeposit status changes are triggered when a status changes. The actual status of the microdeposit guid updates every minute. You may force a status update by calling the read microdeposit endpoint.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @return MicrodepositResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public MicrodepositResponseBody usersUserGuidMicroDepositsMicroDepositGuidGet(String userGuid, String microDepositGuid) throws ApiException {
        ApiResponse<MicrodepositResponseBody> localVarResp = usersUserGuidMicroDepositsMicroDepositGuidGetWithHttpInfo(userGuid, microDepositGuid);
        return localVarResp.getData();
    }

    /**
     * Read a microdeposit for a user
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID. &lt;br&gt;&lt;/br&gt; Webhooks for microdeposit status changes are triggered when a status changes. The actual status of the microdeposit guid updates every minute. You may force a status update by calling the read microdeposit endpoint.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @return ApiResponse&lt;MicrodepositResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MicrodepositResponseBody> usersUserGuidMicroDepositsMicroDepositGuidGetWithHttpInfo(String userGuid, String microDepositGuid) throws ApiException {
        okhttp3.Call localVarCall = usersUserGuidMicroDepositsMicroDepositGuidGetValidateBeforeCall(userGuid, microDepositGuid, null);
        Type localVarReturnType = new TypeToken<MicrodepositResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Read a microdeposit for a user (asynchronously)
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID. &lt;br&gt;&lt;/br&gt; Webhooks for microdeposit status changes are triggered when a status changes. The actual status of the microdeposit guid updates every minute. You may force a status update by calling the read microdeposit endpoint.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microDepositGuid The unique identifier for the microdeposit. Defined by MX. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsMicroDepositGuidGetAsync(String userGuid, String microDepositGuid, final ApiCallback<MicrodepositResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersUserGuidMicroDepositsMicroDepositGuidGetValidateBeforeCall(userGuid, microDepositGuid, _callback);
        Type localVarReturnType = new TypeToken<MicrodepositResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usersUserGuidMicroDepositsPost
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microdepositRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsPostCall(String userGuid, MicrodepositRequestBody microdepositRequestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = microdepositRequestBody;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/micro_deposits"
            .replace("{" + "user_guid" + "}", localVarApiClient.escapeString(userGuid.toString()));

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call usersUserGuidMicroDepositsPostValidateBeforeCall(String userGuid, MicrodepositRequestBody microdepositRequestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling usersUserGuidMicroDepositsPost(Async)");
        }

        // verify the required parameter 'microdepositRequestBody' is set
        if (microdepositRequestBody == null) {
            throw new ApiException("Missing the required parameter 'microdepositRequestBody' when calling usersUserGuidMicroDepositsPost(Async)");
        }

        return usersUserGuidMicroDepositsPostCall(userGuid, microdepositRequestBody, _callback);

    }

    /**
     * Create a microdeposit
     * Use this endpoint to create a microdeposit. The response will include the new microdeposit record with a status of INITIATED.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microdepositRequestBody  (required)
     * @return MicrodepositResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public MicrodepositResponseBody usersUserGuidMicroDepositsPost(String userGuid, MicrodepositRequestBody microdepositRequestBody) throws ApiException {
        ApiResponse<MicrodepositResponseBody> localVarResp = usersUserGuidMicroDepositsPostWithHttpInfo(userGuid, microdepositRequestBody);
        return localVarResp.getData();
    }

    /**
     * Create a microdeposit
     * Use this endpoint to create a microdeposit. The response will include the new microdeposit record with a status of INITIATED.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microdepositRequestBody  (required)
     * @return ApiResponse&lt;MicrodepositResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MicrodepositResponseBody> usersUserGuidMicroDepositsPostWithHttpInfo(String userGuid, MicrodepositRequestBody microdepositRequestBody) throws ApiException {
        okhttp3.Call localVarCall = usersUserGuidMicroDepositsPostValidateBeforeCall(userGuid, microdepositRequestBody, null);
        Type localVarReturnType = new TypeToken<MicrodepositResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a microdeposit (asynchronously)
     * Use this endpoint to create a microdeposit. The response will include the new microdeposit record with a status of INITIATED.
     * @param userGuid The unique identifier for the user. Defined by MX. (required)
     * @param microdepositRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersUserGuidMicroDepositsPostAsync(String userGuid, MicrodepositRequestBody microdepositRequestBody, final ApiCallback<MicrodepositResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersUserGuidMicroDepositsPostValidateBeforeCall(userGuid, microdepositRequestBody, _callback);
        Type localVarReturnType = new TypeToken<MicrodepositResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
