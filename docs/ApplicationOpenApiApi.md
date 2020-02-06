# ApplicationOpenApiApi

All URIs are relative to *https://localhost/controller/campus/v1/performanceservice/application*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryApplicationInfo**](ApplicationOpenApiApi.md#queryApplicationInfo) | **GET** /controller/campus/v1/performanceservice/application/apptraffic/topapp | 查询终端TopN应用流量


<a name="queryApplicationInfo"></a>
# **queryApplicationInfo**
> ApplicationInfoResp queryApplicationInfo(appDimension, timeDimension, top, siteId)

查询终端TopN应用流量

## 典型场景 ##    提供查询终端TopN应用流量列表的接口。           ## 接口功能 ##    查询终端TopN应用流量列表。 ## 接口约束 ##    1、当前只支持Top5查询，后续扩展更多维度。    2、当前不支持自由选择时间段统计数据，只支持当前一天，当前一周或者当前一个月的数据查询。     

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApplicationOpenApiApi;


ApplicationOpenApiApi apiInstance = new ApplicationOpenApiApi();
String appDimension = "apptype"; // String | 查询维度，app---应用名称、apptype---应用类型。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月。
Integer top = 5; // Integer | top流量数据个数，当前目前只支持范围5。
UUID siteId = new UUID(); // UUID | 站点ID，如果为空，代表租户维度。
try {
    ApplicationInfoResp result = apiInstance.queryApplicationInfo(appDimension, timeDimension, top, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationOpenApiApi#queryApplicationInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appDimension** | **String**| 查询维度，app---应用名称、apptype---应用类型。 | [enum: app, apptype]
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月。 | [enum: day, week, month]
 **top** | **Integer**| top流量数据个数，当前目前只支持范围5。 | [enum: 5]
 **siteId** | **UUID**| 站点ID，如果为空，代表租户维度。 | [optional]

### Return type

[**ApplicationInfoResp**](ApplicationInfoResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

