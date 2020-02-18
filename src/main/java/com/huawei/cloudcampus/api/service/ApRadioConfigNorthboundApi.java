/*
 * AP设备射频配置
 * AP设备射频配置第三方接口说明。 
 *
 * OpenAPI spec version: 1.1.1
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


import com.huawei.cloudcampus.api.model.ApDeviceRadioApiDto;
import com.huawei.cloudcampus.api.model.ApDeviceRadioResponsesDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApRadioConfigNorthboundApi {
    private ApiClient apiClient;

    public ApRadioConfigNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApRadioConfigNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDeviceRadioConfig
     * @param deviceId 设备ID，UUID格式。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeviceRadioConfigCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/device/{deviceId}/apradio/radios"
            .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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
    private com.squareup.okhttp.Call getDeviceRadioConfigValidateBeforeCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling getDeviceRadioConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getDeviceRadioConfigCall(deviceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询AP设备射频配置信息
     * ## 典型场景 ##  提供查询AP设备射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询AP设备射频配置信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;        
     * @param deviceId 设备ID，UUID格式。 (required)
     * @return ApDeviceRadioResponsesDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApDeviceRadioResponsesDto getDeviceRadioConfig(String deviceId) throws ApiException {
        ApiResponse<ApDeviceRadioResponsesDto> resp = getDeviceRadioConfigWithHttpInfo(deviceId);
        return resp.getData();
    }

    /**
     * 查询AP设备射频配置信息
     * ## 典型场景 ##  提供查询AP设备射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询AP设备射频配置信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;        
     * @param deviceId 设备ID，UUID格式。 (required)
     * @return ApiResponse&lt;ApDeviceRadioResponsesDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApDeviceRadioResponsesDto> getDeviceRadioConfigWithHttpInfo(String deviceId) throws ApiException {
        com.squareup.okhttp.Call call = getDeviceRadioConfigValidateBeforeCall(deviceId, null, null);
        Type localVarReturnType = new TypeToken<ApDeviceRadioResponsesDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询AP设备射频配置信息 (asynchronously)
     * ## 典型场景 ##  提供查询AP设备射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询AP设备射频配置信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;        
     * @param deviceId 设备ID，UUID格式。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeviceRadioConfigAsync(String deviceId, final ApiCallback<ApDeviceRadioResponsesDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeviceRadioConfigValidateBeforeCall(deviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApDeviceRadioResponsesDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDeviceRadioConfig
     * @param deviceId 设备ID，UUID格式。 (required)
     * @param apDeviceRadioApiDto 修改AP设备射频配置入参。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDeviceRadioConfigCall(String deviceId, ApDeviceRadioApiDto apDeviceRadioApiDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apDeviceRadioApiDto;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/networkconfig/device/{deviceId}/apradio/radios"
            .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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
    private com.squareup.okhttp.Call updateDeviceRadioConfigValidateBeforeCall(String deviceId, ApDeviceRadioApiDto apDeviceRadioApiDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling updateDeviceRadioConfig(Async)");
        }
        
        // verify the required parameter 'apDeviceRadioApiDto' is set
        if (apDeviceRadioApiDto == null) {
            throw new ApiException("Missing the required parameter 'apDeviceRadioApiDto' when calling updateDeviceRadioConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateDeviceRadioConfigCall(deviceId, apDeviceRadioApiDto, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改AP设备射频配置信息
     * ## 典型场景 ##  提供修改AP设备射频配置信息接口。&lt;br&gt;  ## 接口功能 ##  修改AP设备射频配置信息。&lt;br&gt;  ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param deviceId 设备ID，UUID格式。 (required)
     * @param apDeviceRadioApiDto 修改AP设备射频配置入参。 (required)
     * @return ApDeviceRadioResponsesDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApDeviceRadioResponsesDto updateDeviceRadioConfig(String deviceId, ApDeviceRadioApiDto apDeviceRadioApiDto) throws ApiException {
        ApiResponse<ApDeviceRadioResponsesDto> resp = updateDeviceRadioConfigWithHttpInfo(deviceId, apDeviceRadioApiDto);
        return resp.getData();
    }

    /**
     * 修改AP设备射频配置信息
     * ## 典型场景 ##  提供修改AP设备射频配置信息接口。&lt;br&gt;  ## 接口功能 ##  修改AP设备射频配置信息。&lt;br&gt;  ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param deviceId 设备ID，UUID格式。 (required)
     * @param apDeviceRadioApiDto 修改AP设备射频配置入参。 (required)
     * @return ApiResponse&lt;ApDeviceRadioResponsesDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApDeviceRadioResponsesDto> updateDeviceRadioConfigWithHttpInfo(String deviceId, ApDeviceRadioApiDto apDeviceRadioApiDto) throws ApiException {
        com.squareup.okhttp.Call call = updateDeviceRadioConfigValidateBeforeCall(deviceId, apDeviceRadioApiDto, null, null);
        Type localVarReturnType = new TypeToken<ApDeviceRadioResponsesDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改AP设备射频配置信息 (asynchronously)
     * ## 典型场景 ##  提供修改AP设备射频配置信息接口。&lt;br&gt;  ## 接口功能 ##  修改AP设备射频配置信息。&lt;br&gt;  ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param deviceId 设备ID，UUID格式。 (required)
     * @param apDeviceRadioApiDto 修改AP设备射频配置入参。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDeviceRadioConfigAsync(String deviceId, ApDeviceRadioApiDto apDeviceRadioApiDto, final ApiCallback<ApDeviceRadioResponsesDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDeviceRadioConfigValidateBeforeCall(deviceId, apDeviceRadioApiDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApDeviceRadioResponsesDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}