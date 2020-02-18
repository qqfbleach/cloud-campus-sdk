/*
 * 防火墙设备NAT配置
 * 防火墙设备NAT配置第三方接口。
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


import com.huawei.cloudcampus.api.model.DeviceFwNatInfoDto;
import com.huawei.cloudcampus.api.model.FwNatDeleteDto;
import com.huawei.cloudcampus.api.model.FwNatDeleteResponseDto;
import com.huawei.cloudcampus.api.model.FwNatResponseDto;
import com.huawei.cloudcampus.api.model.GetFwNatResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FwNatNetcfgNorthboundApi {
    private ApiClient apiClient;

    public FwNatNetcfgNorthboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FwNatNetcfgNorthboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createDeviceFwNatConfig
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 创建的防火墙设备NAT配置。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDeviceFwNatConfigCall(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deviceFwNatInfoDto;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat"
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
    private com.squareup.okhttp.Call createDeviceFwNatConfigValidateBeforeCall(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling createDeviceFwNatConfig(Async)");
        }
        
        // verify the required parameter 'deviceFwNatInfoDto' is set
        if (deviceFwNatInfoDto == null) {
            throw new ApiException("Missing the required parameter 'deviceFwNatInfoDto' when calling createDeviceFwNatConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createDeviceFwNatConfigCall(deviceId, deviceFwNatInfoDto, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建防火墙设备NAT配置
     * ## 典型场景 ##    提供创建防火墙设备NAT配置的接口。 ## 接口功能 ##    创建防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 创建的防火墙设备NAT配置。 (required)
     * @return FwNatResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FwNatResponseDto createDeviceFwNatConfig(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto) throws ApiException {
        ApiResponse<FwNatResponseDto> resp = createDeviceFwNatConfigWithHttpInfo(deviceId, deviceFwNatInfoDto);
        return resp.getData();
    }

    /**
     * 创建防火墙设备NAT配置
     * ## 典型场景 ##    提供创建防火墙设备NAT配置的接口。 ## 接口功能 ##    创建防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 创建的防火墙设备NAT配置。 (required)
     * @return ApiResponse&lt;FwNatResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FwNatResponseDto> createDeviceFwNatConfigWithHttpInfo(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto) throws ApiException {
        com.squareup.okhttp.Call call = createDeviceFwNatConfigValidateBeforeCall(deviceId, deviceFwNatInfoDto, null, null);
        Type localVarReturnType = new TypeToken<FwNatResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建防火墙设备NAT配置 (asynchronously)
     * ## 典型场景 ##    提供创建防火墙设备NAT配置的接口。 ## 接口功能 ##    创建防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 创建的防火墙设备NAT配置。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDeviceFwNatConfigAsync(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto, final ApiCallback<FwNatResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDeviceFwNatConfigValidateBeforeCall(deviceId, deviceFwNatInfoDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FwNatResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDeviceFwNatConfig
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param id 要删除的防火墙设备NAT配置ID列表。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDeviceFwNatConfigCall(String deviceId, FwNatDeleteDto id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = id;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat/action/batch-delete"
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
    private com.squareup.okhttp.Call deleteDeviceFwNatConfigValidateBeforeCall(String deviceId, FwNatDeleteDto id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling deleteDeviceFwNatConfig(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteDeviceFwNatConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteDeviceFwNatConfigCall(deviceId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除防火墙设备NAT配置
     * ## 典型场景 ##    提供删除防火墙设备NAT配置的接口。 ## 接口功能 ##    删除防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param id 要删除的防火墙设备NAT配置ID列表。 (required)
     * @return FwNatDeleteResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FwNatDeleteResponseDto deleteDeviceFwNatConfig(String deviceId, FwNatDeleteDto id) throws ApiException {
        ApiResponse<FwNatDeleteResponseDto> resp = deleteDeviceFwNatConfigWithHttpInfo(deviceId, id);
        return resp.getData();
    }

    /**
     * 删除防火墙设备NAT配置
     * ## 典型场景 ##    提供删除防火墙设备NAT配置的接口。 ## 接口功能 ##    删除防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param id 要删除的防火墙设备NAT配置ID列表。 (required)
     * @return ApiResponse&lt;FwNatDeleteResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FwNatDeleteResponseDto> deleteDeviceFwNatConfigWithHttpInfo(String deviceId, FwNatDeleteDto id) throws ApiException {
        com.squareup.okhttp.Call call = deleteDeviceFwNatConfigValidateBeforeCall(deviceId, id, null, null);
        Type localVarReturnType = new TypeToken<FwNatDeleteResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除防火墙设备NAT配置 (asynchronously)
     * ## 典型场景 ##    提供删除防火墙设备NAT配置的接口。 ## 接口功能 ##    删除防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param id 要删除的防火墙设备NAT配置ID列表。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDeviceFwNatConfigAsync(String deviceId, FwNatDeleteDto id, final ApiCallback<FwNatDeleteResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDeviceFwNatConfigValidateBeforeCall(deviceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FwNatDeleteResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDeviceFwNatConfig
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 每页显示记录数。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeviceFwNatConfigCall(String deviceId, Integer pageIndex, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat"
            .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));

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
    private com.squareup.okhttp.Call getDeviceFwNatConfigValidateBeforeCall(String deviceId, Integer pageIndex, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling getDeviceFwNatConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getDeviceFwNatConfigCall(deviceId, pageIndex, pageSize, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询防火墙设备NAT配置
     * ## 典型场景 ##    提供查询防火墙设备NAT配置的接口。 ## 接口功能 ##    查询防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 每页显示记录数。 (optional)
     * @return GetFwNatResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFwNatResponseDto getDeviceFwNatConfig(String deviceId, Integer pageIndex, Integer pageSize) throws ApiException {
        ApiResponse<GetFwNatResponseDto> resp = getDeviceFwNatConfigWithHttpInfo(deviceId, pageIndex, pageSize);
        return resp.getData();
    }

    /**
     * 查询防火墙设备NAT配置
     * ## 典型场景 ##    提供查询防火墙设备NAT配置的接口。 ## 接口功能 ##    查询防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 每页显示记录数。 (optional)
     * @return ApiResponse&lt;GetFwNatResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFwNatResponseDto> getDeviceFwNatConfigWithHttpInfo(String deviceId, Integer pageIndex, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getDeviceFwNatConfigValidateBeforeCall(deviceId, pageIndex, pageSize, null, null);
        Type localVarReturnType = new TypeToken<GetFwNatResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询防火墙设备NAT配置 (asynchronously)
     * ## 典型场景 ##    提供查询防火墙设备NAT配置的接口。 ## 接口功能 ##    查询防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 每页显示记录数。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeviceFwNatConfigAsync(String deviceId, Integer pageIndex, Integer pageSize, final ApiCallback<GetFwNatResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeviceFwNatConfigValidateBeforeCall(deviceId, pageIndex, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFwNatResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDeviceFwNatConfig
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 修改的防火墙设备NAT配置。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDeviceFwNatConfigCall(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deviceFwNatInfoDto;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat"
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
    private com.squareup.okhttp.Call updateDeviceFwNatConfigValidateBeforeCall(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling updateDeviceFwNatConfig(Async)");
        }
        
        // verify the required parameter 'deviceFwNatInfoDto' is set
        if (deviceFwNatInfoDto == null) {
            throw new ApiException("Missing the required parameter 'deviceFwNatInfoDto' when calling updateDeviceFwNatConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateDeviceFwNatConfigCall(deviceId, deviceFwNatInfoDto, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改防火墙设备NAT配置
     * ## 典型场景 ##    提供修改防火墙设备NAT配置的接口。 ## 接口功能 ##    修改防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 修改的防火墙设备NAT配置。 (required)
     * @return FwNatResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FwNatResponseDto updateDeviceFwNatConfig(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto) throws ApiException {
        ApiResponse<FwNatResponseDto> resp = updateDeviceFwNatConfigWithHttpInfo(deviceId, deviceFwNatInfoDto);
        return resp.getData();
    }

    /**
     * 修改防火墙设备NAT配置
     * ## 典型场景 ##    提供修改防火墙设备NAT配置的接口。 ## 接口功能 ##    修改防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 修改的防火墙设备NAT配置。 (required)
     * @return ApiResponse&lt;FwNatResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FwNatResponseDto> updateDeviceFwNatConfigWithHttpInfo(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto) throws ApiException {
        com.squareup.okhttp.Call call = updateDeviceFwNatConfigValidateBeforeCall(deviceId, deviceFwNatInfoDto, null, null);
        Type localVarReturnType = new TypeToken<FwNatResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改防火墙设备NAT配置 (asynchronously)
     * ## 典型场景 ##    提供修改防火墙设备NAT配置的接口。 ## 接口功能 ##    修改防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     * @param deviceId 设备标识，UUID格式。 (required)
     * @param deviceFwNatInfoDto 修改的防火墙设备NAT配置。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDeviceFwNatConfigAsync(String deviceId, DeviceFwNatInfoDto deviceFwNatInfoDto, final ApiCallback<FwNatResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDeviceFwNatConfigValidateBeforeCall(deviceId, deviceFwNatInfoDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FwNatResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}