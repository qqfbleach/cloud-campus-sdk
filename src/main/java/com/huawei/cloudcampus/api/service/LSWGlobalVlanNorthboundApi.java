/*
 * 交换机全局VLAN配置
 * 配置交换机全局VLAN 
 *
 * OpenAPI spec version: 1.0.2
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


import com.huawei.cloudcampus.api.model.LswGlobalVlanAllRespDto;
import com.huawei.cloudcampus.api.model.LswGlobalVlanDelRespDto;
import com.huawei.cloudcampus.api.model.LswGlobalVlanDto;
import com.huawei.cloudcampus.api.model.LswGlobalVlanResponseDto;
import com.huawei.cloudcampus.api.model.LswGlobalVlanUpdateDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LSWGlobalVlanNorthboundApi {
    private ApiClient apiClient;

    public LSWGlobalVlanNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LSWGlobalVlanNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createLswGlobalVlanInfo
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 全局VLAN配置。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLswGlobalVlanInfoCall(String deviceId, LswGlobalVlanDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createLswGlobalVlanInfoValidateBeforeCall(String deviceId, LswGlobalVlanDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling createLswGlobalVlanInfo(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createLswGlobalVlanInfo(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createLswGlobalVlanInfoCall(deviceId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建交换机的全局VLAN配置
     * ## 典型场景 ##    提供配置参数的接口，创建交换机的全局VLAN配置。 ## 接口功能 ##    创建交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 全局VLAN配置。 (required)
     * @return LswGlobalVlanResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LswGlobalVlanResponseDto createLswGlobalVlanInfo(String deviceId, LswGlobalVlanDto body) throws ApiException {
        ApiResponse<LswGlobalVlanResponseDto> resp = createLswGlobalVlanInfoWithHttpInfo(deviceId, body);
        return resp.getData();
    }

    /**
     * 创建交换机的全局VLAN配置
     * ## 典型场景 ##    提供配置参数的接口，创建交换机的全局VLAN配置。 ## 接口功能 ##    创建交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 全局VLAN配置。 (required)
     * @return ApiResponse&lt;LswGlobalVlanResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LswGlobalVlanResponseDto> createLswGlobalVlanInfoWithHttpInfo(String deviceId, LswGlobalVlanDto body) throws ApiException {
        com.squareup.okhttp.Call call = createLswGlobalVlanInfoValidateBeforeCall(deviceId, body, null, null);
        Type localVarReturnType = new TypeToken<LswGlobalVlanResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建交换机的全局VLAN配置 (asynchronously)
     * ## 典型场景 ##    提供配置参数的接口，创建交换机的全局VLAN配置。 ## 接口功能 ##    创建交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 全局VLAN配置。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLswGlobalVlanInfoAsync(String deviceId, LswGlobalVlanDto body, final ApiCallback<LswGlobalVlanResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createLswGlobalVlanInfoValidateBeforeCall(deviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LswGlobalVlanResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteLswGlobalVlanInfo
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param recordId VLAN ID，UUID格式。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLswGlobalVlanInfoCall(String deviceId, String recordId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan/{recordId}"
            .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()))
            .replaceAll("\\{" + "recordId" + "\\}", apiClient.escapeString(recordId.toString()));

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
    private com.squareup.okhttp.Call deleteLswGlobalVlanInfoValidateBeforeCall(String deviceId, String recordId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling deleteLswGlobalVlanInfo(Async)");
        }
        
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new ApiException("Missing the required parameter 'recordId' when calling deleteLswGlobalVlanInfo(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteLswGlobalVlanInfoCall(deviceId, recordId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除交换机的全局VLAN配置
     * ## 典型场景 ##    提供配置参数的接口，删除交换机的全局VLAN配置。 ## 接口功能 ##    删除交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param recordId VLAN ID，UUID格式。 (required)
     * @return LswGlobalVlanDelRespDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LswGlobalVlanDelRespDto deleteLswGlobalVlanInfo(String deviceId, String recordId) throws ApiException {
        ApiResponse<LswGlobalVlanDelRespDto> resp = deleteLswGlobalVlanInfoWithHttpInfo(deviceId, recordId);
        return resp.getData();
    }

    /**
     * 删除交换机的全局VLAN配置
     * ## 典型场景 ##    提供配置参数的接口，删除交换机的全局VLAN配置。 ## 接口功能 ##    删除交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param recordId VLAN ID，UUID格式。 (required)
     * @return ApiResponse&lt;LswGlobalVlanDelRespDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LswGlobalVlanDelRespDto> deleteLswGlobalVlanInfoWithHttpInfo(String deviceId, String recordId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLswGlobalVlanInfoValidateBeforeCall(deviceId, recordId, null, null);
        Type localVarReturnType = new TypeToken<LswGlobalVlanDelRespDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除交换机的全局VLAN配置 (asynchronously)
     * ## 典型场景 ##    提供配置参数的接口，删除交换机的全局VLAN配置。 ## 接口功能 ##    删除交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param recordId VLAN ID，UUID格式。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLswGlobalVlanInfoAsync(String deviceId, String recordId, final ApiCallback<LswGlobalVlanDelRespDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLswGlobalVlanInfoValidateBeforeCall(deviceId, recordId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LswGlobalVlanDelRespDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLswGlobalVlanInfos
     * @param deviceId 设备ID，格式为uuid格式 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLswGlobalVlanInfosCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan"
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
    private com.squareup.okhttp.Call getLswGlobalVlanInfosValidateBeforeCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling getLswGlobalVlanInfos(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getLswGlobalVlanInfosCall(deviceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询交换机的全局VLAN配置
     * ## 典型场景 ##    提供查询配置参数的接口，查询LSW的全局VLAN配置信息。 ## 接口功能 ##    查询全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式 (required)
     * @return LswGlobalVlanAllRespDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LswGlobalVlanAllRespDto getLswGlobalVlanInfos(String deviceId) throws ApiException {
        ApiResponse<LswGlobalVlanAllRespDto> resp = getLswGlobalVlanInfosWithHttpInfo(deviceId);
        return resp.getData();
    }

    /**
     * 查询交换机的全局VLAN配置
     * ## 典型场景 ##    提供查询配置参数的接口，查询LSW的全局VLAN配置信息。 ## 接口功能 ##    查询全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式 (required)
     * @return ApiResponse&lt;LswGlobalVlanAllRespDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LswGlobalVlanAllRespDto> getLswGlobalVlanInfosWithHttpInfo(String deviceId) throws ApiException {
        com.squareup.okhttp.Call call = getLswGlobalVlanInfosValidateBeforeCall(deviceId, null, null);
        Type localVarReturnType = new TypeToken<LswGlobalVlanAllRespDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询交换机的全局VLAN配置 (asynchronously)
     * ## 典型场景 ##    提供查询配置参数的接口，查询LSW的全局VLAN配置信息。 ## 接口功能 ##    查询全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLswGlobalVlanInfosAsync(String deviceId, final ApiCallback<LswGlobalVlanAllRespDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLswGlobalVlanInfosValidateBeforeCall(deviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LswGlobalVlanAllRespDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateLswGlobalVlanInfo
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 交换机的全局VLAN配置。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateLswGlobalVlanInfoCall(String deviceId, LswGlobalVlanUpdateDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan"
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
    private com.squareup.okhttp.Call updateLswGlobalVlanInfoValidateBeforeCall(String deviceId, LswGlobalVlanUpdateDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling updateLswGlobalVlanInfo(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateLswGlobalVlanInfo(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateLswGlobalVlanInfoCall(deviceId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改交换机的全局VLAN配置
     * ## 典型场景 ##    提供配置参数的接口，修改交换机的全局VLAN配置。 ## 接口功能 ##    修改交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 交换机的全局VLAN配置。 (required)
     * @return LswGlobalVlanResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LswGlobalVlanResponseDto updateLswGlobalVlanInfo(String deviceId, LswGlobalVlanUpdateDto body) throws ApiException {
        ApiResponse<LswGlobalVlanResponseDto> resp = updateLswGlobalVlanInfoWithHttpInfo(deviceId, body);
        return resp.getData();
    }

    /**
     * 修改交换机的全局VLAN配置
     * ## 典型场景 ##    提供配置参数的接口，修改交换机的全局VLAN配置。 ## 接口功能 ##    修改交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 交换机的全局VLAN配置。 (required)
     * @return ApiResponse&lt;LswGlobalVlanResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LswGlobalVlanResponseDto> updateLswGlobalVlanInfoWithHttpInfo(String deviceId, LswGlobalVlanUpdateDto body) throws ApiException {
        com.squareup.okhttp.Call call = updateLswGlobalVlanInfoValidateBeforeCall(deviceId, body, null, null);
        Type localVarReturnType = new TypeToken<LswGlobalVlanResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改交换机的全局VLAN配置 (asynchronously)
     * ## 典型场景 ##    提供配置参数的接口，修改交换机的全局VLAN配置。 ## 接口功能 ##    修改交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     * @param deviceId 设备ID，格式为uuid格式。 (required)
     * @param body 交换机的全局VLAN配置。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateLswGlobalVlanInfoAsync(String deviceId, LswGlobalVlanUpdateDto body, final ApiCallback<LswGlobalVlanResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateLswGlobalVlanInfoValidateBeforeCall(deviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LswGlobalVlanResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
