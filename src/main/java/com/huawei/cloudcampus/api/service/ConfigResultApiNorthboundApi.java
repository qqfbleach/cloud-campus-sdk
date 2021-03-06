/*
 * 配置结果查询
 * 查询配置结果
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


import com.huawei.cloudcampus.api.model.BatchGetDto;
import com.huawei.cloudcampus.api.model.StateResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigResultApiNorthboundApi {
    private ApiClient apiClient;

    public ConfigResultApiNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigResultApiNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getConfigResults
     * @param batchGetDto 服务信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getConfigResultsCall(BatchGetDto batchGetDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = batchGetDto;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkconfigservice/configresult";

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
    private com.squareup.okhttp.Call getConfigResultsValidateBeforeCall(BatchGetDto batchGetDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'batchGetDto' is set
        if (batchGetDto == null) {
            throw new ApiException("Missing the required parameter 'batchGetDto' when calling getConfigResults(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getConfigResultsCall(batchGetDto, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 获取配置结果
     * ## 典型场景 ##    提供配置参数的接口，获取配置结果。获取的配置结果为所传siteIds和deviceIds的并集。 ## 接口功能 ##    获取配置结果。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param batchGetDto 服务信息。 (required)
     * @return StateResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StateResponseDto getConfigResults(BatchGetDto batchGetDto) throws ApiException {
        ApiResponse<StateResponseDto> resp = getConfigResultsWithHttpInfo(batchGetDto);
        return resp.getData();
    }

    /**
     * 获取配置结果
     * ## 典型场景 ##    提供配置参数的接口，获取配置结果。获取的配置结果为所传siteIds和deviceIds的并集。 ## 接口功能 ##    获取配置结果。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param batchGetDto 服务信息。 (required)
     * @return ApiResponse&lt;StateResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StateResponseDto> getConfigResultsWithHttpInfo(BatchGetDto batchGetDto) throws ApiException {
        com.squareup.okhttp.Call call = getConfigResultsValidateBeforeCall(batchGetDto, null, null);
        Type localVarReturnType = new TypeToken<StateResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取配置结果 (asynchronously)
     * ## 典型场景 ##    提供配置参数的接口，获取配置结果。获取的配置结果为所传siteIds和deviceIds的并集。 ## 接口功能 ##    获取配置结果。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param batchGetDto 服务信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getConfigResultsAsync(BatchGetDto batchGetDto, final ApiCallback<StateResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getConfigResultsValidateBeforeCall(batchGetDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StateResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
