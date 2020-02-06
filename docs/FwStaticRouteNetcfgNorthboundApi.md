# FwStaticRouteNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceFwStaticRouteConfig**](FwStaticRouteNetcfgNorthboundApi.md#createDeviceFwStaticRouteConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/fwstaticroute/devices/{deviceId}/staticroute | 创建防火墙设备静态路由配置
[**deleteDeviceFwStaticRouteConfig**](FwStaticRouteNetcfgNorthboundApi.md#deleteDeviceFwStaticRouteConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/fwstaticroute/devices/{deviceId}/staticroute/action/batch-delete | 删除防火墙设备静态路由配置
[**getDeviceFwStaticRouteConfig**](FwStaticRouteNetcfgNorthboundApi.md#getDeviceFwStaticRouteConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/fwstaticroute/devices/{deviceId}/staticroute | 查询防火墙设备静态路由配置
[**updateDeviceFwStaticRouteConfig**](FwStaticRouteNetcfgNorthboundApi.md#updateDeviceFwStaticRouteConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/fwstaticroute/devices/{deviceId}/staticroute | 修改防火墙设备静态路由配置


<a name="createDeviceFwStaticRouteConfig"></a>
# **createDeviceFwStaticRouteConfig**
> FwStaticRouteResponseDto createDeviceFwStaticRouteConfig(deviceId, deviceFwStaticRouteInfoDto)

创建防火墙设备静态路由配置

## 典型场景 ##    提供创建防火墙设备静态路由配置的接口。 ## 接口功能 ##    创建防火墙设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwStaticRouteNetcfgNorthboundApi;


FwStaticRouteNetcfgNorthboundApi apiInstance = new FwStaticRouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
FwRouteInfo deviceFwStaticRouteInfoDto = new FwRouteInfo(); // FwRouteInfo | 创建的防火墙设备静态路由配置。
try {
    FwStaticRouteResponseDto result = apiInstance.createDeviceFwStaticRouteConfig(deviceId, deviceFwStaticRouteInfoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwStaticRouteNetcfgNorthboundApi#createDeviceFwStaticRouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **deviceFwStaticRouteInfoDto** | [**FwRouteInfo**](FwRouteInfo.md)| 创建的防火墙设备静态路由配置。 |

### Return type

[**FwStaticRouteResponseDto**](FwStaticRouteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceFwStaticRouteConfig"></a>
# **deleteDeviceFwStaticRouteConfig**
> FwStaticRouteDeleteResponseDto deleteDeviceFwStaticRouteConfig(deviceId, id)

删除防火墙设备静态路由配置

## 典型场景 ##    提供删除防火墙设备静态路由配置的接口。 ## 接口功能 ##    删除防火墙设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwStaticRouteNetcfgNorthboundApi;


FwStaticRouteNetcfgNorthboundApi apiInstance = new FwStaticRouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
FwStaticRouteDeleteDto id = new FwStaticRouteDeleteDto(); // FwStaticRouteDeleteDto | 要删除的防火墙设备静态路由配置ID列表。
try {
    FwStaticRouteDeleteResponseDto result = apiInstance.deleteDeviceFwStaticRouteConfig(deviceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwStaticRouteNetcfgNorthboundApi#deleteDeviceFwStaticRouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **id** | [**FwStaticRouteDeleteDto**](FwStaticRouteDeleteDto.md)| 要删除的防火墙设备静态路由配置ID列表。 |

### Return type

[**FwStaticRouteDeleteResponseDto**](FwStaticRouteDeleteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceFwStaticRouteConfig"></a>
# **getDeviceFwStaticRouteConfig**
> GetFwStaticRouteResponseDto getDeviceFwStaticRouteConfig(deviceId, pageIndex, pageSize)

查询防火墙设备静态路由配置

## 典型场景 ##    提供查询防火墙设备静态路由配置的接口。 ## 接口功能 ##    查询防火墙设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwStaticRouteNetcfgNorthboundApi;


FwStaticRouteNetcfgNorthboundApi apiInstance = new FwStaticRouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
Integer pageIndex = 1; // Integer | 页面索引。
Integer pageSize = 20; // Integer | 每页显示记录数。
try {
    GetFwStaticRouteResponseDto result = apiInstance.getDeviceFwStaticRouteConfig(deviceId, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwStaticRouteNetcfgNorthboundApi#getDeviceFwStaticRouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **pageIndex** | **Integer**| 页面索引。 |
 **pageSize** | **Integer**| 每页显示记录数。 |

### Return type

[**GetFwStaticRouteResponseDto**](GetFwStaticRouteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeviceFwStaticRouteConfig"></a>
# **updateDeviceFwStaticRouteConfig**
> FwStaticRouteResponseDto updateDeviceFwStaticRouteConfig(deviceId, deviceFwStaticRouteInfoDto)

修改防火墙设备静态路由配置

## 典型场景 ##    提供修改防火墙设备静态路由配置的接口。 ## 接口功能 ##    修改防火墙设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwStaticRouteNetcfgNorthboundApi;


FwStaticRouteNetcfgNorthboundApi apiInstance = new FwStaticRouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
DeviceFwStaticRouteInfoDto deviceFwStaticRouteInfoDto = new DeviceFwStaticRouteInfoDto(); // DeviceFwStaticRouteInfoDto | 修改的防火墙设备静态路由配置。
try {
    FwStaticRouteResponseDto result = apiInstance.updateDeviceFwStaticRouteConfig(deviceId, deviceFwStaticRouteInfoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwStaticRouteNetcfgNorthboundApi#updateDeviceFwStaticRouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **deviceFwStaticRouteInfoDto** | [**DeviceFwStaticRouteInfoDto**](DeviceFwStaticRouteInfoDto.md)| 修改的防火墙设备静态路由配置。 |

### Return type

[**FwStaticRouteResponseDto**](FwStaticRouteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

