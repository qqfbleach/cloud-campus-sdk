# ApGroupRadioNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDeviceRadioConfig**](ApGroupRadioNorthboundApi.md#getAllDeviceRadioConfig) | **GET** /controller/campus/v3/networkconfig/site/{siteId}/apradio/radios | 查询站点下所有AP设备射频配置信息
[**getGroupRadioConfig**](ApGroupRadioNorthboundApi.md#getGroupRadioConfig) | **GET** /controller/campus/v3/networkconfig/site/{siteId}/apradio | 查询AP站点射频配置信息
[**updateGroupRadioConfig**](ApGroupRadioNorthboundApi.md#updateGroupRadioConfig) | **PUT** /controller/campus/v3/networkconfig/site/{siteId}/apradio | 修改AP站点射频配置信息


<a name="getAllDeviceRadioConfig"></a>
# **getAllDeviceRadioConfig**
> DeviceRadioConfigResponsesDto getAllDeviceRadioConfig(siteId)

查询站点下所有AP设备射频配置信息

## 典型场景 ##  提供查询站点下所有AP设备射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询站点下所有AP设备射频信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApGroupRadioNorthboundApi;


ApGroupRadioNorthboundApi apiInstance = new ApGroupRadioNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点ID，UUID格式。
try {
    DeviceRadioConfigResponsesDto result = apiInstance.getAllDeviceRadioConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApGroupRadioNorthboundApi#getAllDeviceRadioConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |

### Return type

[**DeviceRadioConfigResponsesDto**](DeviceRadioConfigResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupRadioConfig"></a>
# **getGroupRadioConfig**
> GroupRadioConfigResponsesDto getGroupRadioConfig(siteId)

查询AP站点射频配置信息

## 典型场景 ##  提供查询AP站点射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询AP站点射频配置信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;          

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApGroupRadioNorthboundApi;


ApGroupRadioNorthboundApi apiInstance = new ApGroupRadioNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点ID，UUID格式。
try {
    GroupRadioConfigResponsesDto result = apiInstance.getGroupRadioConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApGroupRadioNorthboundApi#getGroupRadioConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |

### Return type

[**GroupRadioConfigResponsesDto**](GroupRadioConfigResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupRadioConfig"></a>
# **updateGroupRadioConfig**
> GroupRadioConfigResponsesDto updateGroupRadioConfig(siteId, groupRadioConfigApiDto)

修改AP站点射频配置信息

## 典型场景 ##  提供修改AP射频配置信息接口。&lt;br&gt;  ## 接口功能 ##  修改AP站点射频配置信息。&lt;br&gt;  ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;          

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApGroupRadioNorthboundApi;


ApGroupRadioNorthboundApi apiInstance = new ApGroupRadioNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点ID，UUID格式。
GroupRadioConfigApiDto groupRadioConfigApiDto = new GroupRadioConfigApiDto(); // GroupRadioConfigApiDto | 修改AP站点射频配置入参。
try {
    GroupRadioConfigResponsesDto result = apiInstance.updateGroupRadioConfig(siteId, groupRadioConfigApiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApGroupRadioNorthboundApi#updateGroupRadioConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **groupRadioConfigApiDto** | [**GroupRadioConfigApiDto**](GroupRadioConfigApiDto.md)| 修改AP站点射频配置入参。 |

### Return type

[**GroupRadioConfigResponsesDto**](GroupRadioConfigResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

