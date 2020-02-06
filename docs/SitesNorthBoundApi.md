# SitesNorthBoundApi

All URIs are relative to *https://localhost/controller/campus/v1/indoormapservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBuildingsInfo**](SitesNorthBoundApi.md#getBuildingsInfo) | **GET** /controller/campus/v1/indoormapservice/sites/{siteId}/buildings | 查询站点中所有楼栋基本信息


<a name="getBuildingsInfo"></a>
# **getBuildingsInfo**
> QueryBuildingsResponse getBuildingsInfo(siteId)

查询站点中所有楼栋基本信息

## 典型场景 ##  查询站点中所有楼栋。 ## 接口功能 ##  查询站点中所有楼栋基本信息，包含楼栋ID，楼栋名称，楼层列表。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SitesNorthBoundApi;


SitesNorthBoundApi apiInstance = new SitesNorthBoundApi();
String siteId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | 站点标识，格式UUID。
try {
    QueryBuildingsResponse result = apiInstance.getBuildingsInfo(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesNorthBoundApi#getBuildingsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，格式UUID。 |

### Return type

[**QueryBuildingsResponse**](QueryBuildingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

