# DevicesNorthBoundApi

All URIs are relative to *https://localhost/controller/campus/v1/indoormapservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceLocatonInfo**](DevicesNorthBoundApi.md#getDeviceLocatonInfo) | **GET** /controller/campus/v1/indoormapservice/devices/{deviceId}/location-info | 查询楼层已布放设备位置信息


<a name="getDeviceLocatonInfo"></a>
# **getDeviceLocatonInfo**
> QueryDeviceLocationInfoResponse getDeviceLocatonInfo(deviceId)

查询楼层已布放设备位置信息

## 典型场景 ##  查询设备位置信息。 ## 接口功能 ##  查询设备位置信息，包含设备所在楼栋，楼层和布放坐标等。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DevicesNorthBoundApi;


DevicesNorthBoundApi apiInstance = new DevicesNorthBoundApi();
UUID deviceId = new UUID(); // UUID | 设备ID，格式UUID。
try {
    QueryDeviceLocationInfoResponse result = apiInstance.getDeviceLocatonInfo(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesNorthBoundApi#getDeviceLocatonInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID，格式UUID。 |

### Return type

[**QueryDeviceLocationInfoResponse**](QueryDeviceLocationInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

