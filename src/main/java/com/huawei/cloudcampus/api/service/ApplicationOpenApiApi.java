/*
 * 终端应用流量信息查询
 * 终端TopN应用流量查询。 
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


import com.huawei.cloudcampus.api.model.ApplicationInfoResp;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationOpenApiApi {
    private ApiClient apiClient;

    public ApplicationOpenApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationOpenApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for queryApplicationInfo
     * @param appDimension 查询维度，app---应用名称、apptype---应用类型。 (required)
     * @param timeDimension 统计周期，day---天、week---周、month---月。 (required)
     * @param top top流量数据个数，当前目前只支持范围5。 (required)
     * @param siteId 站点ID，如果为空，代表租户维度。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryApplicationInfoCall(String appDimension, String timeDimension, Integer top, UUID siteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/performanceservice/application/apptraffic/topapp";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (siteId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "siteId", siteId));
        if (appDimension != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "appDimension", appDimension));
        if (timeDimension != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeDimension", timeDimension));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));

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
    private com.squareup.okhttp.Call queryApplicationInfoValidateBeforeCall(String appDimension, String timeDimension, Integer top, UUID siteId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appDimension' is set
        if (appDimension == null) {
            throw new ApiException("Missing the required parameter 'appDimension' when calling queryApplicationInfo(Async)");
        }
        
        // verify the required parameter 'timeDimension' is set
        if (timeDimension == null) {
            throw new ApiException("Missing the required parameter 'timeDimension' when calling queryApplicationInfo(Async)");
        }
        
        // verify the required parameter 'top' is set
        if (top == null) {
            throw new ApiException("Missing the required parameter 'top' when calling queryApplicationInfo(Async)");
        }
        
        
        com.squareup.okhttp.Call call = queryApplicationInfoCall(appDimension, timeDimension, top, siteId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询终端TopN应用流量
     * ## 典型场景 ##    提供查询终端TopN应用流量列表的接口。           ## 接口功能 ##    查询终端TopN应用流量列表。 ## 接口约束 ##    1、当前只支持Top5查询，后续扩展更多维度。    2、当前不支持自由选择时间段统计数据，只支持当前一天，当前一周或者当前一个月的数据查询。     
     * @param appDimension 查询维度，app---应用名称、apptype---应用类型。 (required)
     * @param timeDimension 统计周期，day---天、week---周、month---月。 (required)
     * @param top top流量数据个数，当前目前只支持范围5。 (required)
     * @param siteId 站点ID，如果为空，代表租户维度。 (optional)
     * @return ApplicationInfoResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationInfoResp queryApplicationInfo(String appDimension, String timeDimension, Integer top, UUID siteId) throws ApiException {
        ApiResponse<ApplicationInfoResp> resp = queryApplicationInfoWithHttpInfo(appDimension, timeDimension, top, siteId);
        return resp.getData();
    }

    /**
     * 查询终端TopN应用流量
     * ## 典型场景 ##    提供查询终端TopN应用流量列表的接口。           ## 接口功能 ##    查询终端TopN应用流量列表。 ## 接口约束 ##    1、当前只支持Top5查询，后续扩展更多维度。    2、当前不支持自由选择时间段统计数据，只支持当前一天，当前一周或者当前一个月的数据查询。     
     * @param appDimension 查询维度，app---应用名称、apptype---应用类型。 (required)
     * @param timeDimension 统计周期，day---天、week---周、month---月。 (required)
     * @param top top流量数据个数，当前目前只支持范围5。 (required)
     * @param siteId 站点ID，如果为空，代表租户维度。 (optional)
     * @return ApiResponse&lt;ApplicationInfoResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationInfoResp> queryApplicationInfoWithHttpInfo(String appDimension, String timeDimension, Integer top, UUID siteId) throws ApiException {
        com.squareup.okhttp.Call call = queryApplicationInfoValidateBeforeCall(appDimension, timeDimension, top, siteId, null, null);
        Type localVarReturnType = new TypeToken<ApplicationInfoResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询终端TopN应用流量 (asynchronously)
     * ## 典型场景 ##    提供查询终端TopN应用流量列表的接口。           ## 接口功能 ##    查询终端TopN应用流量列表。 ## 接口约束 ##    1、当前只支持Top5查询，后续扩展更多维度。    2、当前不支持自由选择时间段统计数据，只支持当前一天，当前一周或者当前一个月的数据查询。     
     * @param appDimension 查询维度，app---应用名称、apptype---应用类型。 (required)
     * @param timeDimension 统计周期，day---天、week---周、month---月。 (required)
     * @param top top流量数据个数，当前目前只支持范围5。 (required)
     * @param siteId 站点ID，如果为空，代表租户维度。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryApplicationInfoAsync(String appDimension, String timeDimension, Integer top, UUID siteId, final ApiCallback<ApplicationInfoResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryApplicationInfoValidateBeforeCall(appDimension, timeDimension, top, siteId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationInfoResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
