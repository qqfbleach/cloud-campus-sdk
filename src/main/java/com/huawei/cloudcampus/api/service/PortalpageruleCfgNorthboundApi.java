/*
 * AP页面推送策略
 * AP页面推送策略开放API。 
 *
 * OpenAPI spec version: 1.0.1
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


import com.huawei.cloudcampus.api.model.AddPortalPageRuleInputDto;
import com.huawei.cloudcampus.api.model.CommonPortalPageRuleOutputDto;
import com.huawei.cloudcampus.api.model.DeletePortalPageRuleInputDto;
import com.huawei.cloudcampus.api.model.DeletePortalPageRuleOutputDto;
import com.huawei.cloudcampus.api.model.GetPortalPageRuleOutputDto;
import com.huawei.cloudcampus.api.model.UpdatePortalPageRuleInputDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortalpageruleCfgNorthboundApi {
    private ApiClient apiClient;

    public PortalpageruleCfgNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortalpageruleCfgNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addPortalPageRule
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPortalPageRuleCall(String siteId, AddPortalPageRuleInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule"
            .replaceAll("\\{" + "siteId" + "\\}", apiClient.escapeString(siteId.toString()));

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
    private com.squareup.okhttp.Call addPortalPageRuleValidateBeforeCall(String siteId, AddPortalPageRuleInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling addPortalPageRule(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addPortalPageRule(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addPortalPageRuleCall(siteId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建页面推送策略
     * ## 典型场景 ##  创建AP portal页面推送策略。 ## 接口功能 ##  创建AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @return CommonPortalPageRuleOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonPortalPageRuleOutputDto addPortalPageRule(String siteId, AddPortalPageRuleInputDto body) throws ApiException {
        ApiResponse<CommonPortalPageRuleOutputDto> resp = addPortalPageRuleWithHttpInfo(siteId, body);
        return resp.getData();
    }

    /**
     * 创建页面推送策略
     * ## 典型场景 ##  创建AP portal页面推送策略。 ## 接口功能 ##  创建AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @return ApiResponse&lt;CommonPortalPageRuleOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonPortalPageRuleOutputDto> addPortalPageRuleWithHttpInfo(String siteId, AddPortalPageRuleInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = addPortalPageRuleValidateBeforeCall(siteId, body, null, null);
        Type localVarReturnType = new TypeToken<CommonPortalPageRuleOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建页面推送策略 (asynchronously)
     * ## 典型场景 ##  创建AP portal页面推送策略。 ## 接口功能 ##  创建AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPortalPageRuleAsync(String siteId, AddPortalPageRuleInputDto body, final ApiCallback<CommonPortalPageRuleOutputDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addPortalPageRuleValidateBeforeCall(siteId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonPortalPageRuleOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deletePortalPageRule
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortalPageRuleCall(String siteId, DeletePortalPageRuleInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule"
            .replaceAll("\\{" + "siteId" + "\\}", apiClient.escapeString(siteId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePortalPageRuleValidateBeforeCall(String siteId, DeletePortalPageRuleInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling deletePortalPageRule(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deletePortalPageRule(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deletePortalPageRuleCall(siteId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除页面推送策略
     * ## 典型场景 ##  删除AP portal页面推送策略。 ## 接口功能 ##  删除AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @return DeletePortalPageRuleOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletePortalPageRuleOutputDto deletePortalPageRule(String siteId, DeletePortalPageRuleInputDto body) throws ApiException {
        ApiResponse<DeletePortalPageRuleOutputDto> resp = deletePortalPageRuleWithHttpInfo(siteId, body);
        return resp.getData();
    }

    /**
     * 删除页面推送策略
     * ## 典型场景 ##  删除AP portal页面推送策略。 ## 接口功能 ##  删除AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @return ApiResponse&lt;DeletePortalPageRuleOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletePortalPageRuleOutputDto> deletePortalPageRuleWithHttpInfo(String siteId, DeletePortalPageRuleInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = deletePortalPageRuleValidateBeforeCall(siteId, body, null, null);
        Type localVarReturnType = new TypeToken<DeletePortalPageRuleOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除页面推送策略 (asynchronously)
     * ## 典型场景 ##  删除AP portal页面推送策略。 ## 接口功能 ##  删除AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 
     * @param siteId 站点ID。 (required)
     * @param body 策略结构。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortalPageRuleAsync(String siteId, DeletePortalPageRuleInputDto body, final ApiCallback<DeletePortalPageRuleOutputDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePortalPageRuleValidateBeforeCall(siteId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletePortalPageRuleOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPortalPageRule
     * @param siteId 站点ID。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPortalPageRuleCall(String siteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule"
            .replaceAll("\\{" + "siteId" + "\\}", apiClient.escapeString(siteId.toString()));

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
    private com.squareup.okhttp.Call getPortalPageRuleValidateBeforeCall(String siteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling getPortalPageRule(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getPortalPageRuleCall(siteId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询页面推送策略
     * ## 典型场景 ##  查询AP portal页面推送策略。 ## 接口功能 ##  查询AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @return GetPortalPageRuleOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPortalPageRuleOutputDto getPortalPageRule(String siteId) throws ApiException {
        ApiResponse<GetPortalPageRuleOutputDto> resp = getPortalPageRuleWithHttpInfo(siteId);
        return resp.getData();
    }

    /**
     * 查询页面推送策略
     * ## 典型场景 ##  查询AP portal页面推送策略。 ## 接口功能 ##  查询AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @return ApiResponse&lt;GetPortalPageRuleOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPortalPageRuleOutputDto> getPortalPageRuleWithHttpInfo(String siteId) throws ApiException {
        com.squareup.okhttp.Call call = getPortalPageRuleValidateBeforeCall(siteId, null, null);
        Type localVarReturnType = new TypeToken<GetPortalPageRuleOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询页面推送策略 (asynchronously)
     * ## 典型场景 ##  查询AP portal页面推送策略。 ## 接口功能 ##  查询AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPortalPageRuleAsync(String siteId, final ApiCallback<GetPortalPageRuleOutputDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPortalPageRuleValidateBeforeCall(siteId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPortalPageRuleOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePortalPageRule
     * @param siteId 站点ID。 (required)
     * @param id 策略ID，格式为UUID。 (required)
     * @param body 策略结构。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePortalPageRuleCall(String siteId, String id, UpdatePortalPageRuleInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule/{id}"
            .replaceAll("\\{" + "siteId" + "\\}", apiClient.escapeString(siteId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePortalPageRuleValidateBeforeCall(String siteId, String id, UpdatePortalPageRuleInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling updatePortalPageRule(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updatePortalPageRule(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updatePortalPageRule(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updatePortalPageRuleCall(siteId, id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改页面推送策略
     * ## 典型场景 ##  修改页面推送策略北向接口。 ## 接口功能 ##  修改页面推送策略 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param id 策略ID，格式为UUID。 (required)
     * @param body 策略结构。 (required)
     * @return CommonPortalPageRuleOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonPortalPageRuleOutputDto updatePortalPageRule(String siteId, String id, UpdatePortalPageRuleInputDto body) throws ApiException {
        ApiResponse<CommonPortalPageRuleOutputDto> resp = updatePortalPageRuleWithHttpInfo(siteId, id, body);
        return resp.getData();
    }

    /**
     * 修改页面推送策略
     * ## 典型场景 ##  修改页面推送策略北向接口。 ## 接口功能 ##  修改页面推送策略 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param id 策略ID，格式为UUID。 (required)
     * @param body 策略结构。 (required)
     * @return ApiResponse&lt;CommonPortalPageRuleOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonPortalPageRuleOutputDto> updatePortalPageRuleWithHttpInfo(String siteId, String id, UpdatePortalPageRuleInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = updatePortalPageRuleValidateBeforeCall(siteId, id, body, null, null);
        Type localVarReturnType = new TypeToken<CommonPortalPageRuleOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改页面推送策略 (asynchronously)
     * ## 典型场景 ##  修改页面推送策略北向接口。 ## 接口功能 ##  修改页面推送策略 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     * @param siteId 站点ID。 (required)
     * @param id 策略ID，格式为UUID。 (required)
     * @param body 策略结构。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePortalPageRuleAsync(String siteId, String id, UpdatePortalPageRuleInputDto body, final ApiCallback<CommonPortalPageRuleOutputDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePortalPageRuleValidateBeforeCall(siteId, id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonPortalPageRuleOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}