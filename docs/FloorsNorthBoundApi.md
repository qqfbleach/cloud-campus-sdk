# FloorsNorthBoundApi

All URIs are relative to *https://localhost/controller/campus/v1/indoormapservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceDetailsByFloorId**](FloorsNorthBoundApi.md#getDeviceDetailsByFloorId) | **GET** /controller/campus/v1/indoormapservice/floors/{floorId}/devices-details | 查询楼栋中楼层已布放设备详细信息
[**getFloorDetails**](FloorsNorthBoundApi.md#getFloorDetails) | **GET** /controller/campus/v1/indoormapservice/floors/{floorId} | 查询楼栋中所有楼层详细信息
[**getFloorLocationDetails**](FloorsNorthBoundApi.md#getFloorLocationDetails) | **GET** /controller/campus/v1/indoormapservice/floors/{floorId}/locaion-details | 查询楼栋中楼层和设备布放信息


<a name="getDeviceDetailsByFloorId"></a>
# **getDeviceDetailsByFloorId**
> QueryLocatedDeviceDetailsResponse getDeviceDetailsByFloorId(floorId, deviceType)

查询楼栋中楼层已布放设备详细信息

## 典型场景 ##  查询楼层已布放设备详细信息。 ## 接口功能 ##  查询楼层已布放设备详细信息，支持基于设备类型查询。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FloorsNorthBoundApi;


FloorsNorthBoundApi apiInstance = new FloorsNorthBoundApi();
String floorId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | 楼层ID，格式UUID。
String deviceType = "deviceType_example"; // String | 设备类型，类型取值范围：\"AP\"，\"LSW\"，\"ALL\"。
try {
    QueryLocatedDeviceDetailsResponse result = apiInstance.getDeviceDetailsByFloorId(floorId, deviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloorsNorthBoundApi#getDeviceDetailsByFloorId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **floorId** | **String**| 楼层ID，格式UUID。 |
 **deviceType** | **String**| 设备类型，类型取值范围：\&quot;AP\&quot;，\&quot;LSW\&quot;，\&quot;ALL\&quot;。 | [optional] [enum: AP, LSW, ALL]

### Return type

[**QueryLocatedDeviceDetailsResponse**](QueryLocatedDeviceDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFloorDetails"></a>
# **getFloorDetails**
> QueryFloorDetailsResponse getFloorDetails(floorId)

查询楼栋中所有楼层详细信息

## 典型场景 ##  查询楼层详细信息。 ## 接口功能 ##  查询楼层详细信息，包含楼层名称，楼层号，楼层图纸和比例尺。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FloorsNorthBoundApi;


FloorsNorthBoundApi apiInstance = new FloorsNorthBoundApi();
String floorId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | 楼层ID，格式UUID。
try {
    QueryFloorDetailsResponse result = apiInstance.getFloorDetails(floorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloorsNorthBoundApi#getFloorDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **floorId** | **String**| 楼层ID，格式UUID。 |

### Return type

[**QueryFloorDetailsResponse**](QueryFloorDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFloorLocationDetails"></a>
# **getFloorLocationDetails**
> QueryFloorLocationDetailsResponse getFloorLocationDetails(floorId)

查询楼栋中楼层和设备布放信息

## 典型场景 ##  查询楼层和设备布放信息。 ## 接口功能 ##  查询楼层和设备布放信息，包含楼层名称，楼层所属楼栋名称，楼层图纸，比例尺，已布放设备列表和未布放设备列表。 ## 接口约束 ##  1、只有租户管理员获取token并建立会话后才能调用该接口。  2、楼层未添加图纸时，该接口不能使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FloorsNorthBoundApi;


FloorsNorthBoundApi apiInstance = new FloorsNorthBoundApi();
String floorId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | 楼层ID，格式UUID。
try {
    QueryFloorLocationDetailsResponse result = apiInstance.getFloorLocationDetails(floorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloorsNorthBoundApi#getFloorLocationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **floorId** | **String**| 楼层ID，格式UUID。 |

### Return type

[**QueryFloorLocationDetailsResponse**](QueryFloorLocationDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

