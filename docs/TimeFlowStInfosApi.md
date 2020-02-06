# TimeFlowStInfosApi

All URIs are relative to *https://localhost/controller/campus/v1/accountservice/user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimeFlowStInfoList**](TimeFlowStInfosApi.md#getTimeFlowStInfoList) | **GET** /controller/campus/v1/accountservice/user/timeflowstinfos | 查询用户流量信息


<a name="getTimeFlowStInfoList"></a>
# **getTimeFlowStInfoList**
> TimeFlowStInfosOutputDto getTimeFlowStInfoList(siteId, pageIndex, pageSize, sort, userName, usedTime, usedFlow, beginTime, endTime)

查询用户流量信息

## 典型场景 ##  提供查询指定时间内流量和时长发生变化的用户流量信息分页查询北向接口。 ## 接口功能 ##  根据租户ID查询最后一次计费时间在指定时间范围之内的用户流量信息。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeFlowStInfosApi;


TimeFlowStInfosApi apiInstance = new TimeFlowStInfosApi();
String siteId = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | 站点ID，UUID格式。
Integer pageIndex = 1; // Integer | 当前页数，默认为1。
Integer pageSize = 20; // Integer | 每页显示的最大数量，默认为20。
String sort = "userName"; // String | 排序字段，目前只支持用户名排序。userName为正序，-userName为逆序。
String userName = "zhangsan"; // String | 用户名，最大长度为64。
String usedTime = "20"; // String | 已使用时长(分钟)大于等于当前条件值。
String usedFlow = "10"; // String | 已使用流量(兆)大于等于当前条件值。
String beginTime = "2017-11-24 17:26:55"; // String | 最后一次计费时间起始时间。
String endTime = "2017-11-25 17:26:55"; // String | 最后一次计费时间截止时间。
try {
    TimeFlowStInfosOutputDto result = apiInstance.getTimeFlowStInfoList(siteId, pageIndex, pageSize, sort, userName, usedTime, usedFlow, beginTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeFlowStInfosApi#getTimeFlowStInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 | [optional]
 **pageIndex** | **Integer**| 当前页数，默认为1。 | [optional]
 **pageSize** | **Integer**| 每页显示的最大数量，默认为20。 | [optional]
 **sort** | **String**| 排序字段，目前只支持用户名排序。userName为正序，-userName为逆序。 | [optional]
 **userName** | **String**| 用户名，最大长度为64。 | [optional]
 **usedTime** | **String**| 已使用时长(分钟)大于等于当前条件值。 | [optional]
 **usedFlow** | **String**| 已使用流量(兆)大于等于当前条件值。 | [optional]
 **beginTime** | **String**| 最后一次计费时间起始时间。 | [optional]
 **endTime** | **String**| 最后一次计费时间截止时间。 | [optional]

### Return type

[**TimeFlowStInfosOutputDto**](TimeFlowStInfosOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

