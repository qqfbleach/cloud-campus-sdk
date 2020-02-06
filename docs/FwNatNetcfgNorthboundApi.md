# FwNatNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceFwNatConfig**](FwNatNetcfgNorthboundApi.md#createDeviceFwNatConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat | 创建防火墙设备NAT配置
[**deleteDeviceFwNatConfig**](FwNatNetcfgNorthboundApi.md#deleteDeviceFwNatConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat/action/batch-delete | 删除防火墙设备NAT配置
[**getDeviceFwNatConfig**](FwNatNetcfgNorthboundApi.md#getDeviceFwNatConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat | 查询防火墙设备NAT配置
[**updateDeviceFwNatConfig**](FwNatNetcfgNorthboundApi.md#updateDeviceFwNatConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/fwnat/devices/{deviceId}/fwnat | 修改防火墙设备NAT配置


<a name="createDeviceFwNatConfig"></a>
# **createDeviceFwNatConfig**
> FwNatResponseDto createDeviceFwNatConfig(deviceId, deviceFwNatInfoDto)

创建防火墙设备NAT配置

## 典型场景 ##    提供创建防火墙设备NAT配置的接口。 ## 接口功能 ##    创建防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwNatNetcfgNorthboundApi;


FwNatNetcfgNorthboundApi apiInstance = new FwNatNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
DeviceFwNatInfoDto deviceFwNatInfoDto = new DeviceFwNatInfoDto(); // DeviceFwNatInfoDto | 创建的防火墙设备NAT配置。
try {
    FwNatResponseDto result = apiInstance.createDeviceFwNatConfig(deviceId, deviceFwNatInfoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwNatNetcfgNorthboundApi#createDeviceFwNatConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **deviceFwNatInfoDto** | [**DeviceFwNatInfoDto**](DeviceFwNatInfoDto.md)| 创建的防火墙设备NAT配置。 |

### Return type

[**FwNatResponseDto**](FwNatResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceFwNatConfig"></a>
# **deleteDeviceFwNatConfig**
> FwNatDeleteResponseDto deleteDeviceFwNatConfig(deviceId, id)

删除防火墙设备NAT配置

## 典型场景 ##    提供删除防火墙设备NAT配置的接口。 ## 接口功能 ##    删除防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwNatNetcfgNorthboundApi;


FwNatNetcfgNorthboundApi apiInstance = new FwNatNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
FwNatDeleteDto id = new FwNatDeleteDto(); // FwNatDeleteDto | 要删除的防火墙设备NAT配置ID列表。
try {
    FwNatDeleteResponseDto result = apiInstance.deleteDeviceFwNatConfig(deviceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwNatNetcfgNorthboundApi#deleteDeviceFwNatConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **id** | [**FwNatDeleteDto**](FwNatDeleteDto.md)| 要删除的防火墙设备NAT配置ID列表。 |

### Return type

[**FwNatDeleteResponseDto**](FwNatDeleteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceFwNatConfig"></a>
# **getDeviceFwNatConfig**
> GetFwNatResponseDto getDeviceFwNatConfig(deviceId, pageIndex, pageSize)

查询防火墙设备NAT配置

## 典型场景 ##    提供查询防火墙设备NAT配置的接口。 ## 接口功能 ##    查询防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwNatNetcfgNorthboundApi;


FwNatNetcfgNorthboundApi apiInstance = new FwNatNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
Integer pageIndex = 1; // Integer | 页面索引。
Integer pageSize = 20; // Integer | 每页显示记录数。
try {
    GetFwNatResponseDto result = apiInstance.getDeviceFwNatConfig(deviceId, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwNatNetcfgNorthboundApi#getDeviceFwNatConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **pageIndex** | **Integer**| 页面索引。 | [optional]
 **pageSize** | **Integer**| 每页显示记录数。 | [optional]

### Return type

[**GetFwNatResponseDto**](GetFwNatResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeviceFwNatConfig"></a>
# **updateDeviceFwNatConfig**
> FwNatResponseDto updateDeviceFwNatConfig(deviceId, deviceFwNatInfoDto)

修改防火墙设备NAT配置

## 典型场景 ##    提供修改防火墙设备NAT配置的接口。 ## 接口功能 ##    修改防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwNatNetcfgNorthboundApi;


FwNatNetcfgNorthboundApi apiInstance = new FwNatNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
DeviceFwNatInfoDto deviceFwNatInfoDto = new DeviceFwNatInfoDto(); // DeviceFwNatInfoDto | 修改的防火墙设备NAT配置。
try {
    FwNatResponseDto result = apiInstance.updateDeviceFwNatConfig(deviceId, deviceFwNatInfoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwNatNetcfgNorthboundApi#updateDeviceFwNatConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **deviceFwNatInfoDto** | [**DeviceFwNatInfoDto**](DeviceFwNatInfoDto.md)| 修改的防火墙设备NAT配置。 |

### Return type

[**FwNatResponseDto**](FwNatResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

