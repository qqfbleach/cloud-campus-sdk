# BuildingsNorthBoundApi

All URIs are relative to *https://localhost/controller/campus/v1/indoormapservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFloorsByBuildingId**](BuildingsNorthBoundApi.md#getFloorsByBuildingId) | **GET** /controller/campus/v1/indoormapservice/buildings/{buildingId}/floors | 查询楼栋中所有楼层基本信息


<a name="getFloorsByBuildingId"></a>
# **getFloorsByBuildingId**
> QueryFloorsResponse getFloorsByBuildingId(buildingId)

查询楼栋中所有楼层基本信息

## 典型场景 ##  查询楼栋中所有楼层。 ## 接口功能 ##  查询楼栋中所有楼层基本信息，包含楼层ID，楼层号，楼层名称。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.BuildingsNorthBoundApi;


BuildingsNorthBoundApi apiInstance = new BuildingsNorthBoundApi();
String buildingId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | 楼栋ID，格式UUID。
try {
    QueryFloorsResponse result = apiInstance.getFloorsByBuildingId(buildingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuildingsNorthBoundApi#getFloorsByBuildingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buildingId** | **String**| 楼栋ID，格式UUID。 |

### Return type

[**QueryFloorsResponse**](QueryFloorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

