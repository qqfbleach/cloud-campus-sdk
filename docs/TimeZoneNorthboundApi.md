# TimeZoneNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimezone**](TimeZoneNorthboundApi.md#getTimezone) | **GET** /controller/campus/v1/networkservice/networkconfig/net/timezones | 查询站点内时区资源


<a name="getTimezone"></a>
# **getTimezone**
> TimezoneRespDto getTimezone()

查询站点内时区资源

## 典型场景 ##    提供查询接口，查询时区资源。 ## 接口功能 ##    获取时区资源。 ## 接口约束 ##    该接口必须在租户内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeZoneNorthboundApi;


TimeZoneNorthboundApi apiInstance = new TimeZoneNorthboundApi();
try {
    TimezoneRespDto result = apiInstance.getTimezone();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeZoneNorthboundApi#getTimezone");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TimezoneRespDto**](TimezoneRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

