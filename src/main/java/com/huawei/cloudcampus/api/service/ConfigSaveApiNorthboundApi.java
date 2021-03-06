/*
 * 配置保存
 * 配置保存接口说明。 
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


import com.huawei.cloudcampus.api.model.CommonDto;
import com.huawei.cloudcampus.api.model.ConfigSaveDto;
import com.huawei.cloudcampus.api.model.ConfigSaveResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigSaveApiNorthboundApi {
    private ApiClient apiClient;

    public ConfigSaveApiNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigSaveApiNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for configSave
     * @param input 配置保存入参。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call configSaveCall(ConfigSaveDto input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = input;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/config/configsave";

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
    private com.squareup.okhttp.Call configSaveValidateBeforeCall(ConfigSaveDto input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new ApiException("Missing the required parameter 'input' when calling configSave(Async)");
        }
        
        
        com.squareup.okhttp.Call call = configSaveCall(input, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 保存配置
     * ## 典型场景 ##   提供配置保存接口。&lt;br&gt; ## 接口功能 ##    配置保存。&lt;br&gt; ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。&lt;br&gt; 
     * @param input 配置保存入参。 (required)
     * @return CommonDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommonDto configSave(ConfigSaveDto input) throws ApiException {
        ApiResponse<CommonDto> resp = configSaveWithHttpInfo(input);
        return resp.getData();
    }

    /**
     * 保存配置
     * ## 典型场景 ##   提供配置保存接口。&lt;br&gt; ## 接口功能 ##    配置保存。&lt;br&gt; ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。&lt;br&gt; 
     * @param input 配置保存入参。 (required)
     * @return ApiResponse&lt;CommonDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommonDto> configSaveWithHttpInfo(ConfigSaveDto input) throws ApiException {
        com.squareup.okhttp.Call call = configSaveValidateBeforeCall(input, null, null);
        Type localVarReturnType = new TypeToken<CommonDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 保存配置 (asynchronously)
     * ## 典型场景 ##   提供配置保存接口。&lt;br&gt; ## 接口功能 ##    配置保存。&lt;br&gt; ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。&lt;br&gt; 
     * @param input 配置保存入参。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call configSaveAsync(ConfigSaveDto input, final ApiCallback<CommonDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = configSaveValidateBeforeCall(input, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommonDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryConfigSave
     * @param siteId 站点ID，UUID格式。 (required)
     * @param pageIndex 分页查询，起始值。 (optional)
     * @param pageSize 分页查询，每页数量。 (optional)
     * @param ids 设备ID列表。调用示例：GET /configsave/d623ead6-a2cc-4c3c-9039-dcc8fa898a11?ids&#x3D;deviceId1&amp;ids&#x3D;deviceId2&amp;ids&#x3D;deviceId3。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryConfigSaveCall(String siteId, Integer pageIndex, Integer pageSize, List<String> ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/config/configsave/{siteId}"
            .replaceAll("\\{" + "siteId" + "\\}", apiClient.escapeString(siteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

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
    private com.squareup.okhttp.Call queryConfigSaveValidateBeforeCall(String siteId, Integer pageIndex, Integer pageSize, List<String> ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling queryConfigSave(Async)");
        }
        
        
        com.squareup.okhttp.Call call = queryConfigSaveCall(siteId, pageIndex, pageSize, ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询保存结果
     * ## 典型场景 ##   提供查询配置保存接口。&lt;br&gt; ## 接口功能 ##    查询配置保存。&lt;br&gt;  ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param pageIndex 分页查询，起始值。 (optional)
     * @param pageSize 分页查询，每页数量。 (optional)
     * @param ids 设备ID列表。调用示例：GET /configsave/d623ead6-a2cc-4c3c-9039-dcc8fa898a11?ids&#x3D;deviceId1&amp;ids&#x3D;deviceId2&amp;ids&#x3D;deviceId3。 (optional)
     * @return ConfigSaveResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfigSaveResult queryConfigSave(String siteId, Integer pageIndex, Integer pageSize, List<String> ids) throws ApiException {
        ApiResponse<ConfigSaveResult> resp = queryConfigSaveWithHttpInfo(siteId, pageIndex, pageSize, ids);
        return resp.getData();
    }

    /**
     * 查询保存结果
     * ## 典型场景 ##   提供查询配置保存接口。&lt;br&gt; ## 接口功能 ##    查询配置保存。&lt;br&gt;  ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param pageIndex 分页查询，起始值。 (optional)
     * @param pageSize 分页查询，每页数量。 (optional)
     * @param ids 设备ID列表。调用示例：GET /configsave/d623ead6-a2cc-4c3c-9039-dcc8fa898a11?ids&#x3D;deviceId1&amp;ids&#x3D;deviceId2&amp;ids&#x3D;deviceId3。 (optional)
     * @return ApiResponse&lt;ConfigSaveResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConfigSaveResult> queryConfigSaveWithHttpInfo(String siteId, Integer pageIndex, Integer pageSize, List<String> ids) throws ApiException {
        com.squareup.okhttp.Call call = queryConfigSaveValidateBeforeCall(siteId, pageIndex, pageSize, ids, null, null);
        Type localVarReturnType = new TypeToken<ConfigSaveResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询保存结果 (asynchronously)
     * ## 典型场景 ##   提供查询配置保存接口。&lt;br&gt; ## 接口功能 ##    查询配置保存。&lt;br&gt;  ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param pageIndex 分页查询，起始值。 (optional)
     * @param pageSize 分页查询，每页数量。 (optional)
     * @param ids 设备ID列表。调用示例：GET /configsave/d623ead6-a2cc-4c3c-9039-dcc8fa898a11?ids&#x3D;deviceId1&amp;ids&#x3D;deviceId2&amp;ids&#x3D;deviceId3。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryConfigSaveAsync(String siteId, Integer pageIndex, Integer pageSize, List<String> ids, final ApiCallback<ConfigSaveResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryConfigSaveValidateBeforeCall(siteId, pageIndex, pageSize, ids, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConfigSaveResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
