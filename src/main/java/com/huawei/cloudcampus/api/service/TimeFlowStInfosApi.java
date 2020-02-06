/*
 * 用户流量信息查询
 * 控制器支持查询指定时间内流量和时长发生变化的用户流量信息分页查询北向接口。 
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


import com.huawei.cloudcampus.api.model.TimeFlowStInfosOutputDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeFlowStInfosApi {
    private ApiClient apiClient;

    public TimeFlowStInfosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimeFlowStInfosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTimeFlowStInfoList
     * @param siteId 站点ID，UUID格式。 (optional)
     * @param pageIndex 当前页数，默认为1。 (optional)
     * @param pageSize 每页显示的最大数量，默认为20。 (optional)
     * @param sort 排序字段，目前只支持用户名排序。userName为正序，-userName为逆序。 (optional)
     * @param userName 用户名，最大长度为64。 (optional)
     * @param usedTime 已使用时长(分钟)大于等于当前条件值。 (optional)
     * @param usedFlow 已使用流量(兆)大于等于当前条件值。 (optional)
     * @param beginTime 最后一次计费时间起始时间。 (optional)
     * @param endTime 最后一次计费时间截止时间。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTimeFlowStInfoListCall(String siteId, Integer pageIndex, Integer pageSize, String sort, String userName, String usedTime, String usedFlow, String beginTime, String endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/accountservice/user/timeflowstinfos";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (siteId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "siteId", siteId));
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
        if (userName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
        if (usedTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "usedTime", usedTime));
        if (usedFlow != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "usedFlow", usedFlow));
        if (beginTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginTime", beginTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));

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
    private com.squareup.okhttp.Call getTimeFlowStInfoListValidateBeforeCall(String siteId, Integer pageIndex, Integer pageSize, String sort, String userName, String usedTime, String usedFlow, String beginTime, String endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTimeFlowStInfoListCall(siteId, pageIndex, pageSize, sort, userName, usedTime, usedFlow, beginTime, endTime, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询用户流量信息
     * ## 典型场景 ##  提供查询指定时间内流量和时长发生变化的用户流量信息分页查询北向接口。 ## 接口功能 ##  根据租户ID查询最后一次计费时间在指定时间范围之内的用户流量信息。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 
     * @param siteId 站点ID，UUID格式。 (optional)
     * @param pageIndex 当前页数，默认为1。 (optional)
     * @param pageSize 每页显示的最大数量，默认为20。 (optional)
     * @param sort 排序字段，目前只支持用户名排序。userName为正序，-userName为逆序。 (optional)
     * @param userName 用户名，最大长度为64。 (optional)
     * @param usedTime 已使用时长(分钟)大于等于当前条件值。 (optional)
     * @param usedFlow 已使用流量(兆)大于等于当前条件值。 (optional)
     * @param beginTime 最后一次计费时间起始时间。 (optional)
     * @param endTime 最后一次计费时间截止时间。 (optional)
     * @return TimeFlowStInfosOutputDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TimeFlowStInfosOutputDto getTimeFlowStInfoList(String siteId, Integer pageIndex, Integer pageSize, String sort, String userName, String usedTime, String usedFlow, String beginTime, String endTime) throws ApiException {
        ApiResponse<TimeFlowStInfosOutputDto> resp = getTimeFlowStInfoListWithHttpInfo(siteId, pageIndex, pageSize, sort, userName, usedTime, usedFlow, beginTime, endTime);
        return resp.getData();
    }

    /**
     * 查询用户流量信息
     * ## 典型场景 ##  提供查询指定时间内流量和时长发生变化的用户流量信息分页查询北向接口。 ## 接口功能 ##  根据租户ID查询最后一次计费时间在指定时间范围之内的用户流量信息。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 
     * @param siteId 站点ID，UUID格式。 (optional)
     * @param pageIndex 当前页数，默认为1。 (optional)
     * @param pageSize 每页显示的最大数量，默认为20。 (optional)
     * @param sort 排序字段，目前只支持用户名排序。userName为正序，-userName为逆序。 (optional)
     * @param userName 用户名，最大长度为64。 (optional)
     * @param usedTime 已使用时长(分钟)大于等于当前条件值。 (optional)
     * @param usedFlow 已使用流量(兆)大于等于当前条件值。 (optional)
     * @param beginTime 最后一次计费时间起始时间。 (optional)
     * @param endTime 最后一次计费时间截止时间。 (optional)
     * @return ApiResponse&lt;TimeFlowStInfosOutputDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TimeFlowStInfosOutputDto> getTimeFlowStInfoListWithHttpInfo(String siteId, Integer pageIndex, Integer pageSize, String sort, String userName, String usedTime, String usedFlow, String beginTime, String endTime) throws ApiException {
        com.squareup.okhttp.Call call = getTimeFlowStInfoListValidateBeforeCall(siteId, pageIndex, pageSize, sort, userName, usedTime, usedFlow, beginTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<TimeFlowStInfosOutputDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询用户流量信息 (asynchronously)
     * ## 典型场景 ##  提供查询指定时间内流量和时长发生变化的用户流量信息分页查询北向接口。 ## 接口功能 ##  根据租户ID查询最后一次计费时间在指定时间范围之内的用户流量信息。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 
     * @param siteId 站点ID，UUID格式。 (optional)
     * @param pageIndex 当前页数，默认为1。 (optional)
     * @param pageSize 每页显示的最大数量，默认为20。 (optional)
     * @param sort 排序字段，目前只支持用户名排序。userName为正序，-userName为逆序。 (optional)
     * @param userName 用户名，最大长度为64。 (optional)
     * @param usedTime 已使用时长(分钟)大于等于当前条件值。 (optional)
     * @param usedFlow 已使用流量(兆)大于等于当前条件值。 (optional)
     * @param beginTime 最后一次计费时间起始时间。 (optional)
     * @param endTime 最后一次计费时间截止时间。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTimeFlowStInfoListAsync(String siteId, Integer pageIndex, Integer pageSize, String sort, String userName, String usedTime, String usedFlow, String beginTime, String endTime, final ApiCallback<TimeFlowStInfosOutputDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTimeFlowStInfoListValidateBeforeCall(siteId, pageIndex, pageSize, sort, userName, usedTime, usedFlow, beginTime, endTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TimeFlowStInfosOutputDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
