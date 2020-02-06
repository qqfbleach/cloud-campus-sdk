/*
 * TACACS模板管理
 * TACACS模板配置北向接口，主要特性：  * 创建tacacs模板。 * 修改tacacs模板。 * 查询tacacs模板。 * 删除tacacs模板。 
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


import com.huawei.cloudcampus.api.model.CreateTacacsTmplInfoDto;
import com.huawei.cloudcampus.api.model.CreateTacacsTmplResponse;
import com.huawei.cloudcampus.api.model.DeleteTacacsTmplResponses;
import com.huawei.cloudcampus.api.model.DeleteTacacsTmplReuest;
import com.huawei.cloudcampus.api.model.EditTacacsTmplResponse;
import com.huawei.cloudcampus.api.model.GetTacacsTmplResponse;
import java.util.UUID;
import com.huawei.cloudcampus.api.model.UpdateTacacsTmplInfoDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetWorkServiceTacacsTmplApi {
    private ApiClient apiClient;

    public NetWorkServiceTacacsTmplApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetWorkServiceTacacsTmplApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createTacacsTmpl
     * @param body tacacs服务器模板信息。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTacacsTmplCall(CreateTacacsTmplInfoDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/profile/tacacs/";

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
    private com.squareup.okhttp.Call createTacacsTmplValidateBeforeCall(CreateTacacsTmplInfoDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createTacacsTmpl(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createTacacsTmplCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建TACACS模板
     * ## 典型场景 ##    创建Tacacs模板。 ## 接口功能 ##   Tacacs模板创建接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param body tacacs服务器模板信息。 (required)
     * @return CreateTacacsTmplResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateTacacsTmplResponse createTacacsTmpl(CreateTacacsTmplInfoDto body) throws ApiException {
        ApiResponse<CreateTacacsTmplResponse> resp = createTacacsTmplWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 创建TACACS模板
     * ## 典型场景 ##    创建Tacacs模板。 ## 接口功能 ##   Tacacs模板创建接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param body tacacs服务器模板信息。 (required)
     * @return ApiResponse&lt;CreateTacacsTmplResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateTacacsTmplResponse> createTacacsTmplWithHttpInfo(CreateTacacsTmplInfoDto body) throws ApiException {
        com.squareup.okhttp.Call call = createTacacsTmplValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateTacacsTmplResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建TACACS模板 (asynchronously)
     * ## 典型场景 ##    创建Tacacs模板。 ## 接口功能 ##   Tacacs模板创建接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param body tacacs服务器模板信息。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTacacsTmplAsync(CreateTacacsTmplInfoDto body, final ApiCallback<CreateTacacsTmplResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTacacsTmplValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateTacacsTmplResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTacacsTmpl
     * @param body tacacs服务器模板id列表。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTacacsTmplCall(DeleteTacacsTmplReuest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/profile/tacacs/batch-delete";

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
    private com.squareup.okhttp.Call deleteTacacsTmplValidateBeforeCall(DeleteTacacsTmplReuest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteTacacsTmpl(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteTacacsTmplCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 删除TACACS模板
     * ## 典型场景 ##    删除配置模板列表信息。 ## 接口功能 ##   Tacacs模板删除接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；如果模板被引用不可删除。 
     * @param body tacacs服务器模板id列表。 (required)
     * @return DeleteTacacsTmplResponses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteTacacsTmplResponses deleteTacacsTmpl(DeleteTacacsTmplReuest body) throws ApiException {
        ApiResponse<DeleteTacacsTmplResponses> resp = deleteTacacsTmplWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 删除TACACS模板
     * ## 典型场景 ##    删除配置模板列表信息。 ## 接口功能 ##   Tacacs模板删除接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；如果模板被引用不可删除。 
     * @param body tacacs服务器模板id列表。 (required)
     * @return ApiResponse&lt;DeleteTacacsTmplResponses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteTacacsTmplResponses> deleteTacacsTmplWithHttpInfo(DeleteTacacsTmplReuest body) throws ApiException {
        com.squareup.okhttp.Call call = deleteTacacsTmplValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DeleteTacacsTmplResponses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除TACACS模板 (asynchronously)
     * ## 典型场景 ##    删除配置模板列表信息。 ## 接口功能 ##   Tacacs模板删除接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；如果模板被引用不可删除。 
     * @param body tacacs服务器模板id列表。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTacacsTmplAsync(DeleteTacacsTmplReuest body, final ApiCallback<DeleteTacacsTmplResponses> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTacacsTmplValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteTacacsTmplResponses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editTacacsTmpl
     * @param id tacacs服务器模板Id。 (required)
     * @param body tacacs服务器模板body。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editTacacsTmplCall(UUID id, UpdateTacacsTmplInfoDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/profile/tacacs/{id}"
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
    private com.squareup.okhttp.Call editTacacsTmplValidateBeforeCall(UUID id, UpdateTacacsTmplInfoDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling editTacacsTmpl(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling editTacacsTmpl(Async)");
        }
        
        
        com.squareup.okhttp.Call call = editTacacsTmplCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 修改TACACS模板
     * ## 典型场景 ##    修改Tacacs模板。 ## 接口功能 ##   Tacacs模板修改接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param id tacacs服务器模板Id。 (required)
     * @param body tacacs服务器模板body。 (required)
     * @return EditTacacsTmplResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EditTacacsTmplResponse editTacacsTmpl(UUID id, UpdateTacacsTmplInfoDto body) throws ApiException {
        ApiResponse<EditTacacsTmplResponse> resp = editTacacsTmplWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * 修改TACACS模板
     * ## 典型场景 ##    修改Tacacs模板。 ## 接口功能 ##   Tacacs模板修改接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param id tacacs服务器模板Id。 (required)
     * @param body tacacs服务器模板body。 (required)
     * @return ApiResponse&lt;EditTacacsTmplResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EditTacacsTmplResponse> editTacacsTmplWithHttpInfo(UUID id, UpdateTacacsTmplInfoDto body) throws ApiException {
        com.squareup.okhttp.Call call = editTacacsTmplValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<EditTacacsTmplResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 修改TACACS模板 (asynchronously)
     * ## 典型场景 ##    修改Tacacs模板。 ## 接口功能 ##   Tacacs模板修改接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param id tacacs服务器模板Id。 (required)
     * @param body tacacs服务器模板body。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editTacacsTmplAsync(UUID id, UpdateTacacsTmplInfoDto body, final ApiCallback<EditTacacsTmplResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = editTacacsTmplValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EditTacacsTmplResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTacacsTmpl
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTacacsTmplCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/controller/campus/v1/networkservice/networkconfig/profile/tacacs/";

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
    private com.squareup.okhttp.Call getTacacsTmplValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTacacsTmplCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询TACACS模板
     * ## 典型场景 ##    查询配置模板列表信息。 ## 接口功能 ##   Tacacs模板查询接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @return GetTacacsTmplResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTacacsTmplResponse getTacacsTmpl() throws ApiException {
        ApiResponse<GetTacacsTmplResponse> resp = getTacacsTmplWithHttpInfo();
        return resp.getData();
    }

    /**
     * 查询TACACS模板
     * ## 典型场景 ##    查询配置模板列表信息。 ## 接口功能 ##   Tacacs模板查询接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @return ApiResponse&lt;GetTacacsTmplResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTacacsTmplResponse> getTacacsTmplWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getTacacsTmplValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GetTacacsTmplResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询TACACS模板 (asynchronously)
     * ## 典型场景 ##    查询配置模板列表信息。 ## 接口功能 ##   Tacacs模板查询接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTacacsTmplAsync(final ApiCallback<GetTacacsTmplResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTacacsTmplValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetTacacsTmplResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
