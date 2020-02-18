/*
 * CIS服务接口
 * CIS操作接口说明： 1、创建CIS隔离 2、创建CIS阻断 3、撤销CIS阻断/隔离 4、阻断隔离应用状态查询 5、CIS策略命中率查询 
 *
 * OpenAPI spec version: v1
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


import com.huawei.cloudcampus.api.model.CisResponseDto;
import com.huawei.cloudcampus.api.model.InterdictionDTO;
import com.huawei.cloudcampus.api.model.IsolationDTO;
import com.huawei.cloudcampus.api.model.PolicyHitsDTO;
import com.huawei.cloudcampus.api.model.QueryHitsResponseDTO;
import com.huawei.cloudcampus.api.model.QueryStatusResponseDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionPolicyApi {
    private ApiClient apiClient;

    public PartitionPolicyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartitionPolicyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteThreatDefense
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteThreatDefenseCall(String blockId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/secm/public/services/fwaas/v1/threatdefense/{blockId}"
            .replaceAll("\\{" + "blockId" + "\\}", apiClient.escapeString(blockId.toString()));

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
    private com.squareup.okhttp.Call deleteThreatDefenseValidateBeforeCall(String blockId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'blockId' is set
        if (blockId == null) {
            throw new ApiException("Missing the required parameter 'blockId' when calling deleteThreatDefense(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteThreatDefenseCall(blockId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 撤销CIS阻断/隔离
     * ## 操作场景 ##   威胁解除，撤销阻断/隔离。 ## 接口功能 ##   撤销CIS阻断/隔离。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @return CisResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CisResponseDto deleteThreatDefense(String blockId) throws ApiException {
        ApiResponse<CisResponseDto> resp = deleteThreatDefenseWithHttpInfo(blockId);
        return resp.getData();
    }

    /**
     * 撤销CIS阻断/隔离
     * ## 操作场景 ##   威胁解除，撤销阻断/隔离。 ## 接口功能 ##   撤销CIS阻断/隔离。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @return ApiResponse&lt;CisResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CisResponseDto> deleteThreatDefenseWithHttpInfo(String blockId) throws ApiException {
        com.squareup.okhttp.Call call = deleteThreatDefenseValidateBeforeCall(blockId, null, null);
        Type localVarReturnType = new TypeToken<CisResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 撤销CIS阻断/隔离 (asynchronously)
     * ## 操作场景 ##   威胁解除，撤销阻断/隔离。 ## 接口功能 ##   撤销CIS阻断/隔离。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteThreatDefenseAsync(String blockId, final ApiCallback<CisResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteThreatDefenseValidateBeforeCall(blockId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CisResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for interdiction
     * @param interdictionDTO 创建CIS阻断输入。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call interdictionCall(InterdictionDTO interdictionDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = interdictionDTO;
        
        // create path and map variables
        String localVarPath = "/secm/public/services/fwaas/v1/threatdefense/interdiction";

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
    private com.squareup.okhttp.Call interdictionValidateBeforeCall(InterdictionDTO interdictionDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'interdictionDTO' is set
        if (interdictionDTO == null) {
            throw new ApiException("Missing the required parameter 'interdictionDTO' when calling interdiction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = interdictionCall(interdictionDTO, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建CIS阻断策略
     * ## 操作场景 ##   向防火墙/交换机下发阻断策略，阻断攻击源。 ## 接口功能 ##   创建CIS阻断策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param interdictionDTO 创建CIS阻断输入。 (required)
     * @return CisResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CisResponseDto interdiction(InterdictionDTO interdictionDTO) throws ApiException {
        ApiResponse<CisResponseDto> resp = interdictionWithHttpInfo(interdictionDTO);
        return resp.getData();
    }

    /**
     * 创建CIS阻断策略
     * ## 操作场景 ##   向防火墙/交换机下发阻断策略，阻断攻击源。 ## 接口功能 ##   创建CIS阻断策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param interdictionDTO 创建CIS阻断输入。 (required)
     * @return ApiResponse&lt;CisResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CisResponseDto> interdictionWithHttpInfo(InterdictionDTO interdictionDTO) throws ApiException {
        com.squareup.okhttp.Call call = interdictionValidateBeforeCall(interdictionDTO, null, null);
        Type localVarReturnType = new TypeToken<CisResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建CIS阻断策略 (asynchronously)
     * ## 操作场景 ##   向防火墙/交换机下发阻断策略，阻断攻击源。 ## 接口功能 ##   创建CIS阻断策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param interdictionDTO 创建CIS阻断输入。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call interdictionAsync(InterdictionDTO interdictionDTO, final ApiCallback<CisResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = interdictionValidateBeforeCall(interdictionDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CisResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for isolateVm
     * @param isolationDTO 创建CIS隔离输入。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call isolateVmCall(IsolationDTO isolationDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = isolationDTO;
        
        // create path and map variables
        String localVarPath = "/secm/public/services/fwaas/v1/threatdefense/isolation";

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
    private com.squareup.okhttp.Call isolateVmValidateBeforeCall(IsolationDTO isolationDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'isolationDTO' is set
        if (isolationDTO == null) {
            throw new ApiException("Missing the required parameter 'isolationDTO' when calling isolateVm(Async)");
        }
        
        
        com.squareup.okhttp.Call call = isolateVmCall(isolationDTO, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 创建CIS隔离策略
     * ## 操作场景 ##   向防火墙/交换机下发创建隔离策略，隔离攻击源。 ## 接口功能 ##   创建CIS隔离策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param isolationDTO 创建CIS隔离输入。 (required)
     * @return CisResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CisResponseDto isolateVm(IsolationDTO isolationDTO) throws ApiException {
        ApiResponse<CisResponseDto> resp = isolateVmWithHttpInfo(isolationDTO);
        return resp.getData();
    }

    /**
     * 创建CIS隔离策略
     * ## 操作场景 ##   向防火墙/交换机下发创建隔离策略，隔离攻击源。 ## 接口功能 ##   创建CIS隔离策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param isolationDTO 创建CIS隔离输入。 (required)
     * @return ApiResponse&lt;CisResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CisResponseDto> isolateVmWithHttpInfo(IsolationDTO isolationDTO) throws ApiException {
        com.squareup.okhttp.Call call = isolateVmValidateBeforeCall(isolationDTO, null, null);
        Type localVarReturnType = new TypeToken<CisResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建CIS隔离策略 (asynchronously)
     * ## 操作场景 ##   向防火墙/交换机下发创建隔离策略，隔离攻击源。 ## 接口功能 ##   创建CIS隔离策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param isolationDTO 创建CIS隔离输入。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call isolateVmAsync(IsolationDTO isolationDTO, final ApiCallback<CisResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = isolateVmValidateBeforeCall(isolationDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CisResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryHits
     * @param policyHitsDTO CIS策略命中率查询输入。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryHitsCall(PolicyHitsDTO policyHitsDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = policyHitsDTO;
        
        // create path and map variables
        String localVarPath = "/secm/public/services/fwaas/v1/threatdefense/policyhits";

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
    private com.squareup.okhttp.Call queryHitsValidateBeforeCall(PolicyHitsDTO policyHitsDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'policyHitsDTO' is set
        if (policyHitsDTO == null) {
            throw new ApiException("Missing the required parameter 'policyHitsDTO' when calling queryHits(Async)");
        }
        
        
        com.squareup.okhttp.Call call = queryHitsCall(policyHitsDTO, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * CIS策略命中率查询
     * ## 操作场景 ##   查询设定时间内CIS策略的命中率。 ## 接口功能 ##   CIS策略命中率查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param policyHitsDTO CIS策略命中率查询输入。 (required)
     * @return QueryHitsResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryHitsResponseDTO queryHits(PolicyHitsDTO policyHitsDTO) throws ApiException {
        ApiResponse<QueryHitsResponseDTO> resp = queryHitsWithHttpInfo(policyHitsDTO);
        return resp.getData();
    }

    /**
     * CIS策略命中率查询
     * ## 操作场景 ##   查询设定时间内CIS策略的命中率。 ## 接口功能 ##   CIS策略命中率查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param policyHitsDTO CIS策略命中率查询输入。 (required)
     * @return ApiResponse&lt;QueryHitsResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryHitsResponseDTO> queryHitsWithHttpInfo(PolicyHitsDTO policyHitsDTO) throws ApiException {
        com.squareup.okhttp.Call call = queryHitsValidateBeforeCall(policyHitsDTO, null, null);
        Type localVarReturnType = new TypeToken<QueryHitsResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * CIS策略命中率查询 (asynchronously)
     * ## 操作场景 ##   查询设定时间内CIS策略的命中率。 ## 接口功能 ##   CIS策略命中率查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param policyHitsDTO CIS策略命中率查询输入。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryHitsAsync(PolicyHitsDTO policyHitsDTO, final ApiCallback<QueryHitsResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryHitsValidateBeforeCall(policyHitsDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryHitsResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryStatus
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryStatusCall(String blockId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/secm/public/services/fwaas/v1/threatdefense/status/{blockId}"
            .replaceAll("\\{" + "blockId" + "\\}", apiClient.escapeString(blockId.toString()));

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
    private com.squareup.okhttp.Call queryStatusValidateBeforeCall(String blockId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'blockId' is set
        if (blockId == null) {
            throw new ApiException("Missing the required parameter 'blockId' when calling queryStatus(Async)");
        }
        
        
        com.squareup.okhttp.Call call = queryStatusCall(blockId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询阻断/隔离应用状态
     * ## 操作场景 ##   查询阻断隔离策略的下发状态。 ## 接口功能 ##   阻断隔离应用状态查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @return QueryStatusResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryStatusResponseDTO queryStatus(String blockId) throws ApiException {
        ApiResponse<QueryStatusResponseDTO> resp = queryStatusWithHttpInfo(blockId);
        return resp.getData();
    }

    /**
     * 查询阻断/隔离应用状态
     * ## 操作场景 ##   查询阻断隔离策略的下发状态。 ## 接口功能 ##   阻断隔离应用状态查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @return ApiResponse&lt;QueryStatusResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryStatusResponseDTO> queryStatusWithHttpInfo(String blockId) throws ApiException {
        com.squareup.okhttp.Call call = queryStatusValidateBeforeCall(blockId, null, null);
        Type localVarReturnType = new TypeToken<QueryStatusResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询阻断/隔离应用状态 (asynchronously)
     * ## 操作场景 ##   查询阻断隔离策略的下发状态。 ## 接口功能 ##   阻断隔离应用状态查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     * @param blockId CIS阻断/隔离ID，UUID格式。 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryStatusAsync(String blockId, final ApiCallback<QueryStatusResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryStatusValidateBeforeCall(blockId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryStatusResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}