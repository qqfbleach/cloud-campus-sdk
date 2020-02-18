/*
 * AP DHCP配置
 * AP DHCP配置第三方接口说明。 
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


import com.huawei.cloudcampus.api.model.ApDhcpConfigApiDto;
import com.huawei.cloudcampus.api.model.ApDhcpConfigResponsesDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApdhcpCfgNorthboundApi {
    private ApiClient apiClient;

    public ApdhcpCfgNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApdhcpCfgNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getSiteDhcpConfig
     * @param siteId 站点ID，UUID格式。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSiteDhcpConfigCall(String siteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/site/{siteId}/apdhcp"
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
    private com.squareup.okhttp.Call getSiteDhcpConfigValidateBeforeCall(String siteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling getSiteDhcpConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getSiteDhcpConfigCall(siteId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询站点全局DHCP配置
     * ## 典型场景 ##  提供查询AP DHCP接口。&lt;br&gt; ## 接口功能 ##  查询AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @return ApDhcpConfigResponsesDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApDhcpConfigResponsesDto getSiteDhcpConfig(String siteId) throws ApiException {
        ApiResponse<ApDhcpConfigResponsesDto> resp = getSiteDhcpConfigWithHttpInfo(siteId);
        return resp.getData();
    }

    /**
     * 查询站点全局DHCP配置
     * ## 典型场景 ##  提供查询AP DHCP接口。&lt;br&gt; ## 接口功能 ##  查询AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @return ApiResponse&lt;ApDhcpConfigResponsesDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApDhcpConfigResponsesDto> getSiteDhcpConfigWithHttpInfo(String siteId) throws ApiException {
        com.squareup.okhttp.Call call = getSiteDhcpConfigValidateBeforeCall(siteId, null, null);
        Type localVarReturnType = new TypeToken<ApDhcpConfigResponsesDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询站点全局DHCP配置 (asynchronously)
     * ## 典型场景 ##  提供查询AP DHCP接口。&lt;br&gt; ## 接口功能 ##  查询AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSiteDhcpConfigAsync(String siteId, final ApiCallback<ApDhcpConfigResponsesDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSiteDhcpConfigValidateBeforeCall(siteId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApDhcpConfigResponsesDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateSiteDhcpConfig
     * @param siteId 站点ID，UUID格式。 (required)
     * @param apDhcpConfigApiDto 修改站点全局DHCP配置入参。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateSiteDhcpConfigCall(String siteId, ApDhcpConfigApiDto apDhcpConfigApiDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apDhcpConfigApiDto;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/site/{siteId}/apdhcp"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateSiteDhcpConfigValidateBeforeCall(String siteId, ApDhcpConfigApiDto apDhcpConfigApiDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling updateSiteDhcpConfig(Async)");
        }
        
        // verify the required parameter 'apDhcpConfigApiDto' is set
        if (apDhcpConfigApiDto == null) {
            throw new ApiException("Missing the required parameter 'apDhcpConfigApiDto' when calling updateSiteDhcpConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateSiteDhcpConfigCall(siteId, apDhcpConfigApiDto, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改站点全局DHCP配置
     * ## 典型场景 ##  提供修改AP DHCP接口。&lt;br&gt;  ## 接口功能 ##  修改AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param apDhcpConfigApiDto 修改站点全局DHCP配置入参。 (required)
     * @return ApDhcpConfigResponsesDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApDhcpConfigResponsesDto updateSiteDhcpConfig(String siteId, ApDhcpConfigApiDto apDhcpConfigApiDto) throws ApiException {
        ApiResponse<ApDhcpConfigResponsesDto> resp = updateSiteDhcpConfigWithHttpInfo(siteId, apDhcpConfigApiDto);
        return resp.getData();
    }

    /**
     * 修改站点全局DHCP配置
     * ## 典型场景 ##  提供修改AP DHCP接口。&lt;br&gt;  ## 接口功能 ##  修改AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param apDhcpConfigApiDto 修改站点全局DHCP配置入参。 (required)
     * @return ApiResponse&lt;ApDhcpConfigResponsesDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApDhcpConfigResponsesDto> updateSiteDhcpConfigWithHttpInfo(String siteId, ApDhcpConfigApiDto apDhcpConfigApiDto) throws ApiException {
        com.squareup.okhttp.Call call = updateSiteDhcpConfigValidateBeforeCall(siteId, apDhcpConfigApiDto, null, null);
        Type localVarReturnType = new TypeToken<ApDhcpConfigResponsesDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改站点全局DHCP配置 (asynchronously)
     * ## 典型场景 ##  提供修改AP DHCP接口。&lt;br&gt;  ## 接口功能 ##  修改AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param siteId 站点ID，UUID格式。 (required)
     * @param apDhcpConfigApiDto 修改站点全局DHCP配置入参。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSiteDhcpConfigAsync(String siteId, ApDhcpConfigApiDto apDhcpConfigApiDto, final ApiCallback<ApDhcpConfigResponsesDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSiteDhcpConfigValidateBeforeCall(siteId, apDhcpConfigApiDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApDhcpConfigResponsesDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}