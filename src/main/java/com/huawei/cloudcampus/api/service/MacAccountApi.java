/*
 * mac帐号管理
 * mac帐号管理
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


import com.huawei.cloudcampus.api.model.DataMacDto;
import com.huawei.cloudcampus.api.model.DeleteMacsOutput;
import com.huawei.cloudcampus.api.model.Ids;
import com.huawei.cloudcampus.api.model.MacDataList;
import com.huawei.cloudcampus.api.model.MacInputDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MacAccountApi {
    private ApiClient apiClient;

    public MacAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MacAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createMacAccount
     * @param body mac账号信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMacAccountCall(MacInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/accountservice/mac";

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
    private com.squareup.okhttp.Call createMacAccountValidateBeforeCall(MacInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createMacAccount(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createMacAccountCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建mac账号
     * ## 典型场景 ##    创建mac帐号。 ## 接口功能 ##    创建mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     * @param body mac账号信息。 (required)
     * @return DataMacDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataMacDto createMacAccount(MacInputDto body) throws ApiException {
        ApiResponse<DataMacDto> resp = createMacAccountWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 创建mac账号
     * ## 典型场景 ##    创建mac帐号。 ## 接口功能 ##    创建mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     * @param body mac账号信息。 (required)
     * @return ApiResponse&lt;DataMacDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataMacDto> createMacAccountWithHttpInfo(MacInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = createMacAccountValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DataMacDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建mac账号 (asynchronously)
     * ## 典型场景 ##    创建mac帐号。 ## 接口功能 ##    创建mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     * @param body mac账号信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMacAccountAsync(MacInputDto body, final ApiCallback<DataMacDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMacAccountValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataMacDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteMacAccount
     * @param body 待删除的mac帐号列表。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMacAccountCall(Ids body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/accountservice/mac/action/batch-delete";

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
    private com.squareup.okhttp.Call deleteMacAccountValidateBeforeCall(Ids body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteMacAccount(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteMacAccountCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除mac帐号
     * ## 典型场景 ##    删除mac帐号。 ## 接口功能 ##    批量删除mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     * @param body 待删除的mac帐号列表。 (required)
     * @return DeleteMacsOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteMacsOutput deleteMacAccount(Ids body) throws ApiException {
        ApiResponse<DeleteMacsOutput> resp = deleteMacAccountWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 删除mac帐号
     * ## 典型场景 ##    删除mac帐号。 ## 接口功能 ##    批量删除mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     * @param body 待删除的mac帐号列表。 (required)
     * @return ApiResponse&lt;DeleteMacsOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteMacsOutput> deleteMacAccountWithHttpInfo(Ids body) throws ApiException {
        com.squareup.okhttp.Call call = deleteMacAccountValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DeleteMacsOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除mac帐号 (asynchronously)
     * ## 典型场景 ##    删除mac帐号。 ## 接口功能 ##    批量删除mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     * @param body 待删除的mac帐号列表。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMacAccountAsync(Ids body, final ApiCallback<DeleteMacsOutput> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMacAccountValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteMacsOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMacAccountList
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 页面大小。 (optional)
     * @param searchName 名称搜索关键词。该字段支持模糊查询。 (optional)
     * @param id mac帐号ID，UUID格式。 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMacAccountListCall(Integer pageIndex, Integer pageSize, String searchName, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/accountservice/mac";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (searchName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchName", searchName));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
    private com.squareup.okhttp.Call getMacAccountListValidateBeforeCall(Integer pageIndex, Integer pageSize, String searchName, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getMacAccountListCall(pageIndex, pageSize, searchName, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询mac帐号
     * ## 典型场景 ##    查询mac帐号。 ## 接口功能 ##    查询mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、pageSize默认按照1000进行分页。 
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 页面大小。 (optional)
     * @param searchName 名称搜索关键词。该字段支持模糊查询。 (optional)
     * @param id mac帐号ID，UUID格式。 (optional)
     * @return MacDataList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MacDataList getMacAccountList(Integer pageIndex, Integer pageSize, String searchName, String id) throws ApiException {
        ApiResponse<MacDataList> resp = getMacAccountListWithHttpInfo(pageIndex, pageSize, searchName, id);
        return resp.getData();
    }

    /**
     * 查询mac帐号
     * ## 典型场景 ##    查询mac帐号。 ## 接口功能 ##    查询mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、pageSize默认按照1000进行分页。 
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 页面大小。 (optional)
     * @param searchName 名称搜索关键词。该字段支持模糊查询。 (optional)
     * @param id mac帐号ID，UUID格式。 (optional)
     * @return ApiResponse&lt;MacDataList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MacDataList> getMacAccountListWithHttpInfo(Integer pageIndex, Integer pageSize, String searchName, String id) throws ApiException {
        com.squareup.okhttp.Call call = getMacAccountListValidateBeforeCall(pageIndex, pageSize, searchName, id, null, null);
        Type localVarReturnType = new TypeToken<MacDataList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询mac帐号 (asynchronously)
     * ## 典型场景 ##    查询mac帐号。 ## 接口功能 ##    查询mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、pageSize默认按照1000进行分页。 
     * @param pageIndex 页面索引。 (optional)
     * @param pageSize 页面大小。 (optional)
     * @param searchName 名称搜索关键词。该字段支持模糊查询。 (optional)
     * @param id mac帐号ID，UUID格式。 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMacAccountListAsync(Integer pageIndex, Integer pageSize, String searchName, String id, final ApiCallback<MacDataList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMacAccountListValidateBeforeCall(pageIndex, pageSize, searchName, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MacDataList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMacAccount
     * @param id mac帐号ID，UUID格式。 (required)
     * @param body 修改mac帐号信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMacAccountCall(String id, MacInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/accountservice/mac/{id}"
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
    private com.squareup.okhttp.Call updateMacAccountValidateBeforeCall(String id, MacInputDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateMacAccount(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMacAccount(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateMacAccountCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改mac帐号
     * ## 典型场景 ##    修改mac帐号。 ## 接口功能 ##    修改mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、该接口为全量修改接口，按照最新的入参进行全量覆盖。 
     * @param id mac帐号ID，UUID格式。 (required)
     * @param body 修改mac帐号信息。 (required)
     * @return DataMacDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataMacDto updateMacAccount(String id, MacInputDto body) throws ApiException {
        ApiResponse<DataMacDto> resp = updateMacAccountWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * 修改mac帐号
     * ## 典型场景 ##    修改mac帐号。 ## 接口功能 ##    修改mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、该接口为全量修改接口，按照最新的入参进行全量覆盖。 
     * @param id mac帐号ID，UUID格式。 (required)
     * @param body 修改mac帐号信息。 (required)
     * @return ApiResponse&lt;DataMacDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataMacDto> updateMacAccountWithHttpInfo(String id, MacInputDto body) throws ApiException {
        com.squareup.okhttp.Call call = updateMacAccountValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<DataMacDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改mac帐号 (asynchronously)
     * ## 典型场景 ##    修改mac帐号。 ## 接口功能 ##    修改mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、该接口为全量修改接口，按照最新的入参进行全量覆盖。 
     * @param id mac帐号ID，UUID格式。 (required)
     * @param body 修改mac帐号信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMacAccountAsync(String id, MacInputDto body, final ApiCallback<DataMacDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMacAccountValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataMacDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}