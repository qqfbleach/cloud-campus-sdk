/*
 * 终端用户认证授权
 * 终端用户认证开放API 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiCallback;
import com.huawei.cloudcampus.api.ApiClient;
import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.ApiResponse;
import com.huawei.cloudcampus.api.Configuration;
import com.huawei.cloudcampus.api.Pair;
import com.huawei.cloudcampus.api.ProgressRequestBody;
import com.huawei.cloudcampus.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.huawei.cloudcampus.api.model.AuthorizationOutputDto;
import com.huawei.cloudcampus.api.model.CommonOutputDto;
import com.huawei.cloudcampus.api.model.UserAuthInputDto;
import com.huawei.cloudcampus.api.model.UserAuthOutputDto;
import com.huawei.cloudcampus.api.model.UserLogoutInputDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortalAuthApi {
    private ApiClient apiClient;

    public PortalAuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortalAuthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAuthorizationResult
     * @param psessionid 会话ID。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAuthorizationResultCall(String psessionid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/portalauth/loginstatus/{psessionid}"
            .replaceAll("\\{" + "psessionid" + "\\}", apiClient.escapeString(psessionid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAuthorizationResultValidateBeforeCall(String psessionid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'psessionid' is set
        if (psessionid == null) {
            throw new ApiException("Missing the required parameter 'psessionid' when calling getAuthorizationResult(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAuthorizationResultCall(psessionid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询认证结果
     * ## 典型场景 ##  提供认证结果查询接口。 ## 接口功能 ##  根据认证会话ID，查询认证结果。 ## 接口约束 ##  接口不需要认证。 
     * @param psessionid 会话ID。 (required)
     * @return AuthorizationOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthorizationOutputDto getAuthorizationResult(String psessionid) throws ApiException {
        ApiResponse<AuthorizationOutputDto> resp = getAuthorizationResultWithHttpInfo(psessionid);
        return resp.getData();
    }

    /**
     * 查询认证结果
     * ## 典型场景 ##  提供认证结果查询接口。 ## 接口功能 ##  根据认证会话ID，查询认证结果。 ## 接口约束 ##  接口不需要认证。 
     * @param psessionid 会话ID。 (required)
     * @return ApiResponse&lt;AuthorizationOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthorizationOutputDto> getAuthorizationResultWithHttpInfo(String psessionid) throws ApiException {
        com.squareup.okhttp.Call call = getAuthorizationResultValidateBeforeCall(psessionid, null, null);
        Type localVarReturnType = new TypeToken<AuthorizationOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询认证结果 (asynchronously)
     * ## 典型场景 ##  提供认证结果查询接口。 ## 接口功能 ##  根据认证会话ID，查询认证结果。 ## 接口约束 ##  接口不需要认证。 
     * @param psessionid 会话ID。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAuthorizationResultAsync(String psessionid, final ApiCallback<AuthorizationOutputDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAuthorizationResultValidateBeforeCall(psessionid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthorizationOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for portalAuthLogin
     * @param body 认证信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call portalAuthLoginCall(UserAuthInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/portalauth/login";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call portalAuthLoginValidateBeforeCall(UserAuthInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling portalAuthLogin(Async)");
        }
        
        
        com.squareup.okhttp.Call call = portalAuthLoginCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 认证终端用户
     * ## 典型场景 ##  用户认证接口。 ## 接口功能 ##  用户输入认证用户名密码后，控制器对认证信息进行校验，校验通过后通知设备对终端用户进行授权，用户可以接入网络。 ## 接口约束 ##  接口不需要认证，该接口返回认证结果，授权结果需要调用接口查询。 
     * @param body 认证信息。 (required)
     * @return UserAuthOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserAuthOutputDto portalAuthLogin(UserAuthInputDto body) throws ApiException {
        ApiResponse<UserAuthOutputDto> resp = portalAuthLoginWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 认证终端用户
     * ## 典型场景 ##  用户认证接口。 ## 接口功能 ##  用户输入认证用户名密码后，控制器对认证信息进行校验，校验通过后通知设备对终端用户进行授权，用户可以接入网络。 ## 接口约束 ##  接口不需要认证，该接口返回认证结果，授权结果需要调用接口查询。 
     * @param body 认证信息。 (required)
     * @return ApiResponse&lt;UserAuthOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserAuthOutputDto> portalAuthLoginWithHttpInfo(UserAuthInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = portalAuthLoginValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<UserAuthOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 认证终端用户 (asynchronously)
     * ## 典型场景 ##  用户认证接口。 ## 接口功能 ##  用户输入认证用户名密码后，控制器对认证信息进行校验，校验通过后通知设备对终端用户进行授权，用户可以接入网络。 ## 接口约束 ##  接口不需要认证，该接口返回认证结果，授权结果需要调用接口查询。 
     * @param body 认证信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call portalAuthLoginAsync(UserAuthInputDto body, final ApiCallback<UserAuthOutputDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = portalAuthLoginValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserAuthOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for portalAuthLogout
     * @param body 注销信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call portalAuthLogoutCall(UserLogoutInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/portalauth/logout";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call portalAuthLogoutValidateBeforeCall(UserLogoutInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling portalAuthLogout(Async)");
        }
        
        
        com.squareup.okhttp.Call call = portalAuthLogoutCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 注销终端用户
     * ## 典型场景 ##  用户注销接口。 ## 接口功能 ##  根据用户认证ID，注销用户，注销后，用户将无法继续访问网络。 ## 接口约束 ##  接口不需要认证。 
     * @param body 注销信息。 (required)
     * @return CommonOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonOutputDto portalAuthLogout(UserLogoutInputDto body) throws ApiException {
        ApiResponse<CommonOutputDto> resp = portalAuthLogoutWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 注销终端用户
     * ## 典型场景 ##  用户注销接口。 ## 接口功能 ##  根据用户认证ID，注销用户，注销后，用户将无法继续访问网络。 ## 接口约束 ##  接口不需要认证。 
     * @param body 注销信息。 (required)
     * @return ApiResponse&lt;CommonOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonOutputDto> portalAuthLogoutWithHttpInfo(UserLogoutInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = portalAuthLogoutValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CommonOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 注销终端用户 (asynchronously)
     * ## 典型场景 ##  用户注销接口。 ## 接口功能 ##  根据用户认证ID，注销用户，注销后，用户将无法继续访问网络。 ## 接口约束 ##  接口不需要认证。 
     * @param body 注销信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call portalAuthLogoutAsync(UserLogoutInputDto body, final ApiCallback<CommonOutputDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = portalAuthLogoutValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
