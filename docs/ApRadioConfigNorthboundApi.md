# ApRadioConfigNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceRadioConfig**](ApRadioConfigNorthboundApi.md#getDeviceRadioConfig) | **GET** /controller/campus/v3/networkconfig/device/{deviceId}/apradio/radios | 查询AP设备射频配置信息
[**updateDeviceRadioConfig**](ApRadioConfigNorthboundApi.md#updateDeviceRadioConfig) | **PUT** /controller/campus/v3/networkconfig/device/{deviceId}/apradio/radios | 修改AP设备射频配置信息


<a name="getDeviceRadioConfig"></a>
# **getDeviceRadioConfig**
> ApDeviceRadioResponsesDto getDeviceRadioConfig(deviceId)

查询AP设备射频配置信息

## 典型场景 ##  提供查询AP设备射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询AP设备射频配置信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;        

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApRadioConfigNorthboundApi;


ApRadioConfigNorthboundApi apiInstance = new ApRadioConfigNorthboundApi();
String deviceId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 设备ID，UUID格式。
try {
    ApDeviceRadioResponsesDto result = apiInstance.getDeviceRadioConfig(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApRadioConfigNorthboundApi#getDeviceRadioConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |

### Return type

[**ApDeviceRadioResponsesDto**](ApDeviceRadioResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeviceRadioConfig"></a>
# **updateDeviceRadioConfig**
> ApDeviceRadioResponsesDto updateDeviceRadioConfig(deviceId, apDeviceRadioApiDto)

修改AP设备射频配置信息

## 典型场景 ##  提供修改AP设备射频配置信息接口。&lt;br&gt;  ## 接口功能 ##  修改AP设备射频配置信息。&lt;br&gt;  ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApRadioConfigNorthboundApi;


ApRadioConfigNorthboundApi apiInstance = new ApRadioConfigNorthboundApi();
String deviceId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 设备ID，UUID格式。
ApDeviceRadioApiDto apDeviceRadioApiDto = new ApDeviceRadioApiDto(); // ApDeviceRadioApiDto | 修改AP设备射频配置入参。
try {
    ApDeviceRadioResponsesDto result = apiInstance.updateDeviceRadioConfig(deviceId, apDeviceRadioApiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApRadioConfigNorthboundApi#updateDeviceRadioConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |
 **apDeviceRadioApiDto** | [**ApDeviceRadioApiDto**](ApDeviceRadioApiDto.md)| 修改AP设备射频配置入参。 |

### Return type

[**ApDeviceRadioResponsesDto**](ApDeviceRadioResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

