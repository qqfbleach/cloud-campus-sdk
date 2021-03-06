/*
 * 网络设备管理
 * 提供北向查询网络设备服务。 
 *
 * OpenAPI spec version: 1.0.0
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


import com.huawei.cloudcampus.api.model.NeListOpenApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NeListOpenApiServiceApi {
    private ApiClient apiClient;

    public NeListOpenApiServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NeListOpenApiServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for queryNeList
     * @param nedn 设备DN。 (optional)
     * @param neid 设备ID。 (optional)
     * @param aliasname 网管名称。 (optional)
     * @param nename 设备名称。 (optional)
     * @param necategory 设备分类。 (optional)
     * @param netype 设备类型。 (optional)
     * @param nevendorname 设备厂商信息(设备厂商ID)。 (optional)
     * @param neesn 设备序列号。 (optional)
     * @param neip 设备IP地址。 (optional)
     * @param nemac 设备MAC地址。 (optional)
     * @param version 设备版本。 (optional)
     * @param nepatchversion 补丁版本。 (optional)
     * @param nesysoid 设备sysoid。 (optional)
     * @param nestate 网络设备状态，可以是如下值之一： 0：未管理 1：在线 2：离线 3：未知 4：snmp不可达 5：错误  (optional)
     * @param lastpolltime 上次同步时间。 (optional)
     * @param createtime 设备创建时间。 (optional)
     * @param timezoneid 设备时区。 (optional)
     * @param neiptype ip地址类型，可以是如下值之一： 0：IPv4 1：IPv6  (optional)
     * @param subnet 所属子网。 (optional)
     * @param negroupname 所属分组名称。 (optional)
     * @param neosversion 软件版本。 (optional)
     * @param necontact 设备联系人。 (optional)
     * @param neposition 设备位置。 (optional)
     * @param memo 设备备注。 (optional)
     * @param maintainunit 维保单位。 (optional)
     * @param putintoactiontime 投入使用时间。 (optional)
     * @param usefullife 维保到期时间。 (optional)
     * @param neruntime 设备启动时间。 (optional)
     * @param nedescribe 设备描述。 (optional)
     * @param assetManager 资产管理人。 (optional)
     * @param assetNumber 资产编号。 (optional)
     * @param assetDate 购买日期。 (optional)
     * @param start 指定从哪个起始记录位置开始返回查询结果集，缺省值是0。 说明： 如果值小于0，将使用缺省值。  (optional)
     * @param size 指定返回查询结果集总数。缺省值是20。 说明： 1、如果值小于0，将使用缺省值。 2、数据的size，最大建议10000条。  (optional)
     * @param orderby 指定查询结果集采用的排序字段。缺省排序字段是nedn。 可指定的排序字段包括：nedn、nename、necategory、netype、neip、nesysoid、nestate。  (optional)
     * @param desc 指定查询结果是否按降序排序。缺省值是false。 说明： 此请求参数只有指定了“orderby”请求参数后才有效。  (optional)
     * @param fields 指定查询结果所包含的列。需要查询的列名为fields参数的值，多个列名时可用英文逗号隔开。 说明： 此请求参数只有指定了“fields”请求参数后才有效，不指定默认返回所有字段。  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryNeListCall(String nedn, String neid, String aliasname, String nename, String necategory, String netype, String nevendorname, String neesn, String neip, String nemac, String version, String nepatchversion, String nesysoid, Integer nestate, String lastpolltime, String createtime, String timezoneid, Integer neiptype, String subnet, String negroupname, String neosversion, String necontact, String neposition, String memo, String maintainunit, String putintoactiontime, String usefullife, String neruntime, String nedescribe, String assetManager, String assetNumber, String assetDate, Integer start, Integer size, String orderby, Boolean desc, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/openapi/network/nedevice";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (nedn != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nedn", nedn));
        if (neid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neid", neid));
        if (aliasname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "aliasname", aliasname));
        if (nename != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nename", nename));
        if (necategory != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "necategory", necategory));
        if (netype != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "netype", netype));
        if (nevendorname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nevendorname", nevendorname));
        if (neesn != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neesn", neesn));
        if (neip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neip", neip));
        if (nemac != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nemac", nemac));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        if (nepatchversion != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nepatchversion", nepatchversion));
        if (nesysoid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nesysoid", nesysoid));
        if (nestate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nestate", nestate));
        if (lastpolltime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastpolltime", lastpolltime));
        if (createtime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createtime", createtime));
        if (timezoneid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezoneid", timezoneid));
        if (neiptype != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neiptype", neiptype));
        if (subnet != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "subnet", subnet));
        if (negroupname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "negroupname", negroupname));
        if (neosversion != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neosversion", neosversion));
        if (necontact != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "necontact", necontact));
        if (neposition != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neposition", neposition));
        if (memo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memo", memo));
        if (maintainunit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maintainunit", maintainunit));
        if (putintoactiontime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "putintoactiontime", putintoactiontime));
        if (usefullife != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "usefullife", usefullife));
        if (neruntime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "neruntime", neruntime));
        if (nedescribe != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nedescribe", nedescribe));
        if (assetManager != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetManager", assetManager));
        if (assetNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetNumber", assetNumber));
        if (assetDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetDate", assetDate));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderby", orderby));
        if (desc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "desc", desc));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

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
    private com.squareup.okhttp.Call queryNeListValidateBeforeCall(String nedn, String neid, String aliasname, String nename, String necategory, String netype, String nevendorname, String neesn, String neip, String nemac, String version, String nepatchversion, String nesysoid, Integer nestate, String lastpolltime, String createtime, String timezoneid, Integer neiptype, String subnet, String negroupname, String neosversion, String necontact, String neposition, String memo, String maintainunit, String putintoactiontime, String usefullife, String neruntime, String nedescribe, String assetManager, String assetNumber, String assetDate, Integer start, Integer size, String orderby, Boolean desc, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = queryNeListCall(nedn, neid, aliasname, nename, necategory, netype, nevendorname, neesn, neip, nemac, version, nepatchversion, nesysoid, nestate, lastpolltime, createtime, timezoneid, neiptype, subnet, negroupname, neosversion, necontact, neposition, memo, maintainunit, putintoactiontime, usefullife, neruntime, nedescribe, assetManager, assetNumber, assetDate, start, size, orderby, desc, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 查询列表信息
     * ## 典型场景 ##  查询网络设备信息时使用。 ## 接口功能 ##  查询网络设备信息，包括设备网元id，网元dn，网元名称，网元别名，网元IP，网元状态， 网元具体类型，设备类型，厂商名称， 序列号。 ## 接口约束 ##  该接口的查询条件参数可以为空。 
     * @param nedn 设备DN。 (optional)
     * @param neid 设备ID。 (optional)
     * @param aliasname 网管名称。 (optional)
     * @param nename 设备名称。 (optional)
     * @param necategory 设备分类。 (optional)
     * @param netype 设备类型。 (optional)
     * @param nevendorname 设备厂商信息(设备厂商ID)。 (optional)
     * @param neesn 设备序列号。 (optional)
     * @param neip 设备IP地址。 (optional)
     * @param nemac 设备MAC地址。 (optional)
     * @param version 设备版本。 (optional)
     * @param nepatchversion 补丁版本。 (optional)
     * @param nesysoid 设备sysoid。 (optional)
     * @param nestate 网络设备状态，可以是如下值之一： 0：未管理 1：在线 2：离线 3：未知 4：snmp不可达 5：错误  (optional)
     * @param lastpolltime 上次同步时间。 (optional)
     * @param createtime 设备创建时间。 (optional)
     * @param timezoneid 设备时区。 (optional)
     * @param neiptype ip地址类型，可以是如下值之一： 0：IPv4 1：IPv6  (optional)
     * @param subnet 所属子网。 (optional)
     * @param negroupname 所属分组名称。 (optional)
     * @param neosversion 软件版本。 (optional)
     * @param necontact 设备联系人。 (optional)
     * @param neposition 设备位置。 (optional)
     * @param memo 设备备注。 (optional)
     * @param maintainunit 维保单位。 (optional)
     * @param putintoactiontime 投入使用时间。 (optional)
     * @param usefullife 维保到期时间。 (optional)
     * @param neruntime 设备启动时间。 (optional)
     * @param nedescribe 设备描述。 (optional)
     * @param assetManager 资产管理人。 (optional)
     * @param assetNumber 资产编号。 (optional)
     * @param assetDate 购买日期。 (optional)
     * @param start 指定从哪个起始记录位置开始返回查询结果集，缺省值是0。 说明： 如果值小于0，将使用缺省值。  (optional)
     * @param size 指定返回查询结果集总数。缺省值是20。 说明： 1、如果值小于0，将使用缺省值。 2、数据的size，最大建议10000条。  (optional)
     * @param orderby 指定查询结果集采用的排序字段。缺省排序字段是nedn。 可指定的排序字段包括：nedn、nename、necategory、netype、neip、nesysoid、nestate。  (optional)
     * @param desc 指定查询结果是否按降序排序。缺省值是false。 说明： 此请求参数只有指定了“orderby”请求参数后才有效。  (optional)
     * @param fields 指定查询结果所包含的列。需要查询的列名为fields参数的值，多个列名时可用英文逗号隔开。 说明： 此请求参数只有指定了“fields”请求参数后才有效，不指定默认返回所有字段。  (optional)
     * @return NeListOpenApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NeListOpenApiResponse queryNeList(String nedn, String neid, String aliasname, String nename, String necategory, String netype, String nevendorname, String neesn, String neip, String nemac, String version, String nepatchversion, String nesysoid, Integer nestate, String lastpolltime, String createtime, String timezoneid, Integer neiptype, String subnet, String negroupname, String neosversion, String necontact, String neposition, String memo, String maintainunit, String putintoactiontime, String usefullife, String neruntime, String nedescribe, String assetManager, String assetNumber, String assetDate, Integer start, Integer size, String orderby, Boolean desc, String fields) throws ApiException {
        ApiResponse<NeListOpenApiResponse> resp = queryNeListWithHttpInfo(nedn, neid, aliasname, nename, necategory, netype, nevendorname, neesn, neip, nemac, version, nepatchversion, nesysoid, nestate, lastpolltime, createtime, timezoneid, neiptype, subnet, negroupname, neosversion, necontact, neposition, memo, maintainunit, putintoactiontime, usefullife, neruntime, nedescribe, assetManager, assetNumber, assetDate, start, size, orderby, desc, fields);
        return resp.getData();
    }

    /**
     * 查询列表信息
     * ## 典型场景 ##  查询网络设备信息时使用。 ## 接口功能 ##  查询网络设备信息，包括设备网元id，网元dn，网元名称，网元别名，网元IP，网元状态， 网元具体类型，设备类型，厂商名称， 序列号。 ## 接口约束 ##  该接口的查询条件参数可以为空。 
     * @param nedn 设备DN。 (optional)
     * @param neid 设备ID。 (optional)
     * @param aliasname 网管名称。 (optional)
     * @param nename 设备名称。 (optional)
     * @param necategory 设备分类。 (optional)
     * @param netype 设备类型。 (optional)
     * @param nevendorname 设备厂商信息(设备厂商ID)。 (optional)
     * @param neesn 设备序列号。 (optional)
     * @param neip 设备IP地址。 (optional)
     * @param nemac 设备MAC地址。 (optional)
     * @param version 设备版本。 (optional)
     * @param nepatchversion 补丁版本。 (optional)
     * @param nesysoid 设备sysoid。 (optional)
     * @param nestate 网络设备状态，可以是如下值之一： 0：未管理 1：在线 2：离线 3：未知 4：snmp不可达 5：错误  (optional)
     * @param lastpolltime 上次同步时间。 (optional)
     * @param createtime 设备创建时间。 (optional)
     * @param timezoneid 设备时区。 (optional)
     * @param neiptype ip地址类型，可以是如下值之一： 0：IPv4 1：IPv6  (optional)
     * @param subnet 所属子网。 (optional)
     * @param negroupname 所属分组名称。 (optional)
     * @param neosversion 软件版本。 (optional)
     * @param necontact 设备联系人。 (optional)
     * @param neposition 设备位置。 (optional)
     * @param memo 设备备注。 (optional)
     * @param maintainunit 维保单位。 (optional)
     * @param putintoactiontime 投入使用时间。 (optional)
     * @param usefullife 维保到期时间。 (optional)
     * @param neruntime 设备启动时间。 (optional)
     * @param nedescribe 设备描述。 (optional)
     * @param assetManager 资产管理人。 (optional)
     * @param assetNumber 资产编号。 (optional)
     * @param assetDate 购买日期。 (optional)
     * @param start 指定从哪个起始记录位置开始返回查询结果集，缺省值是0。 说明： 如果值小于0，将使用缺省值。  (optional)
     * @param size 指定返回查询结果集总数。缺省值是20。 说明： 1、如果值小于0，将使用缺省值。 2、数据的size，最大建议10000条。  (optional)
     * @param orderby 指定查询结果集采用的排序字段。缺省排序字段是nedn。 可指定的排序字段包括：nedn、nename、necategory、netype、neip、nesysoid、nestate。  (optional)
     * @param desc 指定查询结果是否按降序排序。缺省值是false。 说明： 此请求参数只有指定了“orderby”请求参数后才有效。  (optional)
     * @param fields 指定查询结果所包含的列。需要查询的列名为fields参数的值，多个列名时可用英文逗号隔开。 说明： 此请求参数只有指定了“fields”请求参数后才有效，不指定默认返回所有字段。  (optional)
     * @return ApiResponse&lt;NeListOpenApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NeListOpenApiResponse> queryNeListWithHttpInfo(String nedn, String neid, String aliasname, String nename, String necategory, String netype, String nevendorname, String neesn, String neip, String nemac, String version, String nepatchversion, String nesysoid, Integer nestate, String lastpolltime, String createtime, String timezoneid, Integer neiptype, String subnet, String negroupname, String neosversion, String necontact, String neposition, String memo, String maintainunit, String putintoactiontime, String usefullife, String neruntime, String nedescribe, String assetManager, String assetNumber, String assetDate, Integer start, Integer size, String orderby, Boolean desc, String fields) throws ApiException {
        com.squareup.okhttp.Call call = queryNeListValidateBeforeCall(nedn, neid, aliasname, nename, necategory, netype, nevendorname, neesn, neip, nemac, version, nepatchversion, nesysoid, nestate, lastpolltime, createtime, timezoneid, neiptype, subnet, negroupname, neosversion, necontact, neposition, memo, maintainunit, putintoactiontime, usefullife, neruntime, nedescribe, assetManager, assetNumber, assetDate, start, size, orderby, desc, fields, null, null);
        Type localVarReturnType = new TypeToken<NeListOpenApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询列表信息 (asynchronously)
     * ## 典型场景 ##  查询网络设备信息时使用。 ## 接口功能 ##  查询网络设备信息，包括设备网元id，网元dn，网元名称，网元别名，网元IP，网元状态， 网元具体类型，设备类型，厂商名称， 序列号。 ## 接口约束 ##  该接口的查询条件参数可以为空。 
     * @param nedn 设备DN。 (optional)
     * @param neid 设备ID。 (optional)
     * @param aliasname 网管名称。 (optional)
     * @param nename 设备名称。 (optional)
     * @param necategory 设备分类。 (optional)
     * @param netype 设备类型。 (optional)
     * @param nevendorname 设备厂商信息(设备厂商ID)。 (optional)
     * @param neesn 设备序列号。 (optional)
     * @param neip 设备IP地址。 (optional)
     * @param nemac 设备MAC地址。 (optional)
     * @param version 设备版本。 (optional)
     * @param nepatchversion 补丁版本。 (optional)
     * @param nesysoid 设备sysoid。 (optional)
     * @param nestate 网络设备状态，可以是如下值之一： 0：未管理 1：在线 2：离线 3：未知 4：snmp不可达 5：错误  (optional)
     * @param lastpolltime 上次同步时间。 (optional)
     * @param createtime 设备创建时间。 (optional)
     * @param timezoneid 设备时区。 (optional)
     * @param neiptype ip地址类型，可以是如下值之一： 0：IPv4 1：IPv6  (optional)
     * @param subnet 所属子网。 (optional)
     * @param negroupname 所属分组名称。 (optional)
     * @param neosversion 软件版本。 (optional)
     * @param necontact 设备联系人。 (optional)
     * @param neposition 设备位置。 (optional)
     * @param memo 设备备注。 (optional)
     * @param maintainunit 维保单位。 (optional)
     * @param putintoactiontime 投入使用时间。 (optional)
     * @param usefullife 维保到期时间。 (optional)
     * @param neruntime 设备启动时间。 (optional)
     * @param nedescribe 设备描述。 (optional)
     * @param assetManager 资产管理人。 (optional)
     * @param assetNumber 资产编号。 (optional)
     * @param assetDate 购买日期。 (optional)
     * @param start 指定从哪个起始记录位置开始返回查询结果集，缺省值是0。 说明： 如果值小于0，将使用缺省值。  (optional)
     * @param size 指定返回查询结果集总数。缺省值是20。 说明： 1、如果值小于0，将使用缺省值。 2、数据的size，最大建议10000条。  (optional)
     * @param orderby 指定查询结果集采用的排序字段。缺省排序字段是nedn。 可指定的排序字段包括：nedn、nename、necategory、netype、neip、nesysoid、nestate。  (optional)
     * @param desc 指定查询结果是否按降序排序。缺省值是false。 说明： 此请求参数只有指定了“orderby”请求参数后才有效。  (optional)
     * @param fields 指定查询结果所包含的列。需要查询的列名为fields参数的值，多个列名时可用英文逗号隔开。 说明： 此请求参数只有指定了“fields”请求参数后才有效，不指定默认返回所有字段。  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryNeListAsync(String nedn, String neid, String aliasname, String nename, String necategory, String netype, String nevendorname, String neesn, String neip, String nemac, String version, String nepatchversion, String nesysoid, Integer nestate, String lastpolltime, String createtime, String timezoneid, Integer neiptype, String subnet, String negroupname, String neosversion, String necontact, String neposition, String memo, String maintainunit, String putintoactiontime, String usefullife, String neruntime, String nedescribe, String assetManager, String assetNumber, String assetDate, Integer start, Integer size, String orderby, Boolean desc, String fields, final ApiCallback<NeListOpenApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryNeListValidateBeforeCall(nedn, neid, aliasname, nename, necategory, netype, nevendorname, neesn, neip, nemac, version, nepatchversion, nesysoid, nestate, lastpolltime, createtime, timezoneid, neiptype, subnet, negroupname, neosversion, necontact, neposition, memo, maintainunit, putintoactiontime, usefullife, neruntime, nedescribe, assetManager, assetNumber, assetDate, start, size, orderby, desc, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NeListOpenApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
