/*
 * ACL模板管理
 * ACL模板第三方管理接口说明。 
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


import com.huawei.cloudcampus.api.model.AclDtoDetail;
import com.huawei.cloudcampus.api.model.DeleteAclRet;
import com.huawei.cloudcampus.api.model.DeleteTemplateDto;
import com.huawei.cloudcampus.api.model.QueryAclRet;
import com.huawei.cloudcampus.api.model.UpadateAclDto;
import com.huawei.cloudcampus.api.model.UpdateAclRet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AclTemplateNBNorthBoundApi {
    private ApiClient apiClient;

    public AclTemplateNBNorthBoundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AclTemplateNBNorthBoundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addAclTemplate
     * @param body 待创建的ACL模板信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addAclTemplateCall(AclDtoDetail body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/profile/acl/";

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
    private com.squareup.okhttp.Call addAclTemplateValidateBeforeCall(AclDtoDetail body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addAclTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addAclTemplateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建ACL模板
     * ## 典型场景 ##  提供创建ACL模板接口。&lt;br&gt; ## 接口功能 ##  创建ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param body 待创建的ACL模板信息。 (required)
     * @return UpdateAclRet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateAclRet addAclTemplate(AclDtoDetail body) throws ApiException {
        ApiResponse<UpdateAclRet> resp = addAclTemplateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 创建ACL模板
     * ## 典型场景 ##  提供创建ACL模板接口。&lt;br&gt; ## 接口功能 ##  创建ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param body 待创建的ACL模板信息。 (required)
     * @return ApiResponse&lt;UpdateAclRet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateAclRet> addAclTemplateWithHttpInfo(AclDtoDetail body) throws ApiException {
        com.squareup.okhttp.Call call = addAclTemplateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<UpdateAclRet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建ACL模板 (asynchronously)
     * ## 典型场景 ##  提供创建ACL模板接口。&lt;br&gt; ## 接口功能 ##  创建ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param body 待创建的ACL模板信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAclTemplateAsync(AclDtoDetail body, final ApiCallback<UpdateAclRet> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAclTemplateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateAclRet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteAclTemplate
     * @param body 待删除的ACL模板标识。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAclTemplateCall(DeleteTemplateDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/profile/acl/";

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
    private com.squareup.okhttp.Call deleteAclTemplateValidateBeforeCall(DeleteTemplateDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteAclTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteAclTemplateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除ACL模板
     * ## 典型场景 ##  提供删除ACL模板接口。&lt;br&gt; ## 接口功能 ##  删除ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param body 待删除的ACL模板标识。 (required)
     * @return DeleteAclRet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteAclRet deleteAclTemplate(DeleteTemplateDto body) throws ApiException {
        ApiResponse<DeleteAclRet> resp = deleteAclTemplateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 删除ACL模板
     * ## 典型场景 ##  提供删除ACL模板接口。&lt;br&gt; ## 接口功能 ##  删除ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param body 待删除的ACL模板标识。 (required)
     * @return ApiResponse&lt;DeleteAclRet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteAclRet> deleteAclTemplateWithHttpInfo(DeleteTemplateDto body) throws ApiException {
        com.squareup.okhttp.Call call = deleteAclTemplateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DeleteAclRet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除ACL模板 (asynchronously)
     * ## 典型场景 ##  提供删除ACL模板接口。&lt;br&gt; ## 接口功能 ##  删除ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param body 待删除的ACL模板标识。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAclTemplateAsync(DeleteTemplateDto body, final ApiCallback<DeleteAclRet> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAclTemplateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteAclRet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAclTemplate
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAclTemplateCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/profile/acl/";

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
    private com.squareup.okhttp.Call getAclTemplateValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getAclTemplateCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询ACL模板
     * ## 典型场景 ##  提供查询ACL模板接口。&lt;br&gt; ## 接口功能 ##  查询ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @return QueryAclRet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryAclRet getAclTemplate() throws ApiException {
        ApiResponse<QueryAclRet> resp = getAclTemplateWithHttpInfo();
        return resp.getData();
    }

    /**
     * 查询ACL模板
     * ## 典型场景 ##  提供查询ACL模板接口。&lt;br&gt; ## 接口功能 ##  查询ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @return ApiResponse&lt;QueryAclRet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryAclRet> getAclTemplateWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAclTemplateValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<QueryAclRet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询ACL模板 (asynchronously)
     * ## 典型场景 ##  提供查询ACL模板接口。&lt;br&gt; ## 接口功能 ##  查询ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAclTemplateAsync(final ApiCallback<QueryAclRet> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAclTemplateValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryAclRet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAclTemplate
     * @param id 待更新的ACL模板标识。 (required)
     * @param body 待更新的ACL模板信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAclTemplateCall(String id, UpadateAclDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v3/profile/acl/{id}"
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
    private com.squareup.okhttp.Call updateAclTemplateValidateBeforeCall(String id, UpadateAclDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateAclTemplate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateAclTemplate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateAclTemplateCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 更新ACL模板
     * ## 典型场景 ##  提供更新ACL模板接口。&lt;br&gt; ## 接口功能 ##  更新ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param id 待更新的ACL模板标识。 (required)
     * @param body 待更新的ACL模板信息。 (required)
     * @return UpdateAclRet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateAclRet updateAclTemplate(String id, UpadateAclDto body) throws ApiException {
        ApiResponse<UpdateAclRet> resp = updateAclTemplateWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * 更新ACL模板
     * ## 典型场景 ##  提供更新ACL模板接口。&lt;br&gt; ## 接口功能 ##  更新ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param id 待更新的ACL模板标识。 (required)
     * @param body 待更新的ACL模板信息。 (required)
     * @return ApiResponse&lt;UpdateAclRet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateAclRet> updateAclTemplateWithHttpInfo(String id, UpadateAclDto body) throws ApiException {
        com.squareup.okhttp.Call call = updateAclTemplateValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<UpdateAclRet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新ACL模板 (asynchronously)
     * ## 典型场景 ##  提供更新ACL模板接口。&lt;br&gt; ## 接口功能 ##  更新ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 
     * @param id 待更新的ACL模板标识。 (required)
     * @param body 待更新的ACL模板信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAclTemplateAsync(String id, UpadateAclDto body, final ApiCallback<UpdateAclRet> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAclTemplateValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateAclRet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
