# EndpointanlsOpenApiApi

All URIs are relative to *https://localhost/controller/campus/v1/performanceservice/endpointbehavior*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceGroupTags**](EndpointanlsOpenApiApi.md#getDeviceGroupTags) | **GET** /controller/campus/v1/performanceservice/endpointbehavior/tags | 获取设备标签
[**getHistoryFlowDistr**](EndpointanlsOpenApiApi.md#getHistoryFlowDistr) | **GET** /controller/campus/v1/performanceservice/endpointbehavior/historyflow | 查询历史接入客户数量
[**getRealtimeFlowDistr**](EndpointanlsOpenApiApi.md#getRealtimeFlowDistr) | **GET** /controller/campus/v1/performanceservice/endpointbehavior/realtimeflow | 查询实时接入客户数量
[**queryCaptureRateDistr**](EndpointanlsOpenApiApi.md#queryCaptureRateDistr) | **GET** /controller/campus/v1/performanceservice/endpointbehavior/capturerate | 查询访客、路人、接入用户的历史趋势
[**queryDwellTimeDistr**](EndpointanlsOpenApiApi.md#queryDwellTimeDistr) | **GET** /controller/campus/v1/performanceservice/endpointbehavior/dwelltime | 查询访客驻留时长的历史趋势
[**queryLoyaltyDistr**](EndpointanlsOpenApiApi.md#queryLoyaltyDistr) | **GET** /controller/campus/v1/performanceservice/endpointbehavior/loyalty | 查询回头客记录


<a name="getDeviceGroupTags"></a>
# **getDeviceGroupTags**
> DeviceGroupTagResp getDeviceGroupTags(siteId, pageSize, pageIndex)

获取设备标签

## 典型场景 ##    提供查询设备标签。           ## 接口功能 ##    查询设备标签，设备标签在监控-&gt;设备360-&gt;AP-AP中创建，单个设备最多可以创建10个标签。 ## 接口约束 ##    1、只有租户管理员获取token并建立会话后才能调用该接口。    2、若pageSize和pageIndex参数不传或者为非法参数，则默认按照pageSize&#x3D;1000，pageIndex&#x3D;0返回查询结果。     

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.EndpointanlsOpenApiApi;


EndpointanlsOpenApiApi apiInstance = new EndpointanlsOpenApiApi();
String siteId = "9dffc44b-1824-42a4-ac48-616e3f0eaa2a"; // String | 站点ID。
Integer pageSize = 20; // Integer | 分页的大小。
Integer pageIndex = 1; // Integer | 分页的序号。
try {
    DeviceGroupTagResp result = apiInstance.getDeviceGroupTags(siteId, pageSize, pageIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointanlsOpenApiApi#getDeviceGroupTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **pageSize** | **Integer**| 分页的大小。 |
 **pageIndex** | **Integer**| 分页的序号。 |

### Return type

[**DeviceGroupTagResp**](DeviceGroupTagResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoryFlowDistr"></a>
# **getHistoryFlowDistr**
> FlowDistrResp getHistoryFlowDistr(siteId, startTime, endTime, tagId)

查询历史接入客户数量

## 典型场景 ##    查询历史客户流量。           ## 接口功能 ##    查询历史接入客户流量。 ## 接口约束 ##    1、只有租户管理员获取token并建立会话后才能调用该接口。    2、若时间差大于一个月小于一年，则以月时间粒度返回查询结果。    3、若时间差小于一个月大于一周，则以天时间维度返回查询结果。    4、若时间差小于一周，则以小时维度返回查询结果。    5、不支持超过一年以上的数据查询。         

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.EndpointanlsOpenApiApi;


EndpointanlsOpenApiApi apiInstance = new EndpointanlsOpenApiApi();
String siteId = "9dffc44b-1824-42a4-ac48-616e3f0eaa2a"; // String | 站点ID。
Long startTime = 1568563200000L; // Long | 时间戳（毫秒），最大时间差不超过一年。
Long endTime = 1568573200000L; // Long | 时间戳（毫秒），最大时间差不超过一年。
String tagId = "31f35021-e656-472a-8937-9c6d6da76e6e"; // String | 标签ID，UUID格式，非必填，若不填，则默认查询站点下所有设备。
try {
    FlowDistrResp result = apiInstance.getHistoryFlowDistr(siteId, startTime, endTime, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointanlsOpenApiApi#getHistoryFlowDistr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **startTime** | **Long**| 时间戳（毫秒），最大时间差不超过一年。 |
 **endTime** | **Long**| 时间戳（毫秒），最大时间差不超过一年。 |
 **tagId** | **String**| 标签ID，UUID格式，非必填，若不填，则默认查询站点下所有设备。 | [optional]

### Return type

[**FlowDistrResp**](FlowDistrResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRealtimeFlowDistr"></a>
# **getRealtimeFlowDistr**
> FlowDistrResp getRealtimeFlowDistr(siteId, tagId)

查询实时接入客户数量

## 典型场景 ##    查询历史实时客户流量。           ## 接口功能 ##    查询历史实时客户数量，返回最近5分钟内接入客户流量。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.EndpointanlsOpenApiApi;


EndpointanlsOpenApiApi apiInstance = new EndpointanlsOpenApiApi();
String siteId = "9dffc44b-1824-42a4-ac48-616e3f0eaa2a"; // String | 站点ID。
String tagId = "31f35021-e656-472a-8937-9c6d6da76e6e"; // String | 标签ID，若不设置，则默认查询站点下所有设备。
try {
    FlowDistrResp result = apiInstance.getRealtimeFlowDistr(siteId, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointanlsOpenApiApi#getRealtimeFlowDistr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **tagId** | **String**| 标签ID，若不设置，则默认查询站点下所有设备。 | [optional]

### Return type

[**FlowDistrResp**](FlowDistrResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryCaptureRateDistr"></a>
# **queryCaptureRateDistr**
> FlowDistrResp queryCaptureRateDistr(tagId, tagType, startTime, endTime, timeUnit)

查询访客、路人、接入用户的历史趋势

## 典型场景 ##    查询访客、路人、接入用户的历史趋势。           ## 接口功能 ##    查询访客、路人、接入用户的历史趋势。    访客：以一小时为周期，一小时内连续5分钟都被探测到的终端，识别为访客。    路人：不满足访客条件的终端，均识别为路人。    接入用户：已关联或已认证的终端，识别为接入用户。 ## 接口约束 ##    1、只有租户管理员获取token并建立会话后才能调用该接口。    2、若时间差大于一个月小于一年，则以月时间粒度返回查询结果。    3、若时间差小于一个月大于一周，则以天时间维度返回查询结果。    4、若时间差小于一周，则以小时维度返回查询结果。    5、不支持超过一年以上的数据查询。            

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.EndpointanlsOpenApiApi;


EndpointanlsOpenApiApi apiInstance = new EndpointanlsOpenApiApi();
String tagId = "9dffc44b-1824-42a4-ac48-616e3f0eaa2a"; // String | 设备标签，若设备标签不存在或查询所有设备，需填写站点ID。
String tagType = "0"; // String | 标签类型：  0---TagID为站点ID。  1---TagID为标签ID。 
Integer startTime = 1567526400; // Integer | 时间戳（秒），最大时间差不超过一年。
Integer endTime = 1567527800; // Integer | 时间戳（秒），最大时间差不超过一年。
String timeUnit = "day"; // String | 时间维度。   day---天维度   week---周维度   month---月维度   custom---自定义维度 
try {
    FlowDistrResp result = apiInstance.queryCaptureRateDistr(tagId, tagType, startTime, endTime, timeUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointanlsOpenApiApi#queryCaptureRateDistr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| 设备标签，若设备标签不存在或查询所有设备，需填写站点ID。 |
 **tagType** | **String**| 标签类型：  0---TagID为站点ID。  1---TagID为标签ID。  | [enum: 0, 1]
 **startTime** | **Integer**| 时间戳（秒），最大时间差不超过一年。 |
 **endTime** | **Integer**| 时间戳（秒），最大时间差不超过一年。 |
 **timeUnit** | **String**| 时间维度。   day---天维度   week---周维度   month---月维度   custom---自定义维度  | [enum: day, week, month, custom]

### Return type

[**FlowDistrResp**](FlowDistrResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryDwellTimeDistr"></a>
# **queryDwellTimeDistr**
> FlowDistrResp queryDwellTimeDistr(tagId, tagType, startTime, endTime, timeUnit)

查询访客驻留时长的历史趋势

## 典型场景 ##    查询访客驻留时长的历史趋势。           ## 接口功能 ##    查询访客驻留时长的历史趋势。 ## 接口约束 ##    1、只有租户管理员获取token并建立会话后才能调用该接口。    2、若时间差大于一个月小于一年，则以月时间粒度返回查询结果。    3、若时间差小于一个月大于一周，则以天时间维度返回查询结果。    4、若时间差小于一周，则以小时维度返回查询结果。    5、不支持超过一年以上的数据查询。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.EndpointanlsOpenApiApi;


EndpointanlsOpenApiApi apiInstance = new EndpointanlsOpenApiApi();
String tagId = "9dffc44b-1824-42a4-ac48-616e3f0eaa2a"; // String | 设备标签，若设备标签不存在或查询所有设备，需填写站点ID。
String tagType = "0"; // String | 标签类型：  0---TagID为站点ID，  1---TagID为标签ID。 
Integer startTime = 1567526400; // Integer | 时间戳（秒），最大时间差不超过一年。
Integer endTime = 1567527800; // Integer | 时间戳（秒），最大时间差不超过一年。
String timeUnit = "day"; // String | 时间维度。   day---天维度   week---周维度   month---月维度   custom---自定义维度 
try {
    FlowDistrResp result = apiInstance.queryDwellTimeDistr(tagId, tagType, startTime, endTime, timeUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointanlsOpenApiApi#queryDwellTimeDistr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| 设备标签，若设备标签不存在或查询所有设备，需填写站点ID。 |
 **tagType** | **String**| 标签类型：  0---TagID为站点ID，  1---TagID为标签ID。  | [enum: 0, 1]
 **startTime** | **Integer**| 时间戳（秒），最大时间差不超过一年。 |
 **endTime** | **Integer**| 时间戳（秒），最大时间差不超过一年。 |
 **timeUnit** | **String**| 时间维度。   day---天维度   week---周维度   month---月维度   custom---自定义维度  | [enum: day, week, month, custom]

### Return type

[**FlowDistrResp**](FlowDistrResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryLoyaltyDistr"></a>
# **queryLoyaltyDistr**
> FlowDistrResp queryLoyaltyDistr(tagId, tagType, startTime, endTime, timeUnit)

查询回头客记录

## 典型场景 ##    查询回头客记录。           ## 接口功能 ##    查询回头客记录。    首次访问是指半年内无访问记录的访客。    偶尔访问是指半年内存在访问记录的访客。    经常访问是指最近一个月内访问超过7天的访客。    频繁访问时指最近一个月内访问超过15天的访客。 ## 接口约束 ##    1、只有租户管理员获取token并建立会话后才能调用该接口。    2、若时间差大于一个月小于一年，则以月时间粒度返回查询结果。    3、若时间差小于一个月大于一周，则以天时间维度返回查询结果。    4、若时间差小于一周，则以小时维度返回查询结果。    5、不支持超过一年以上的数据查询。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.EndpointanlsOpenApiApi;


EndpointanlsOpenApiApi apiInstance = new EndpointanlsOpenApiApi();
String tagId = "9dffc44b-1824-42a4-ac48-616e3f0eaa2a"; // String | 设备标签，若设备标签不存在或查询所有设备，需填写站点ID。
String tagType = "0"; // String | 标签类型：  0---TagID为站点ID，  1---TagID为标签ID。 
Integer startTime = 1567526400; // Integer | 时间戳（秒），最大时间差不超过一年。
Integer endTime = 1567527800; // Integer | 时间戳（秒），最大时间差不超过一年。
String timeUnit = "day"; // String | 时间维度。   day---天维度   week---周维度   month---月维度   custom---自定义维度 
try {
    FlowDistrResp result = apiInstance.queryLoyaltyDistr(tagId, tagType, startTime, endTime, timeUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointanlsOpenApiApi#queryLoyaltyDistr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| 设备标签，若设备标签不存在或查询所有设备，需填写站点ID。 |
 **tagType** | **String**| 标签类型：  0---TagID为站点ID，  1---TagID为标签ID。  | [enum: 0, 1]
 **startTime** | **Integer**| 时间戳（秒），最大时间差不超过一年。 |
 **endTime** | **Integer**| 时间戳（秒），最大时间差不超过一年。 |
 **timeUnit** | **String**| 时间维度。   day---天维度   week---周维度   month---月维度   custom---自定义维度  | [enum: day, week, month, custom]

### Return type

[**FlowDistrResp**](FlowDistrResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

