# ArStaticrouteNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceArStaticrouteConfig**](ArStaticrouteNetcfgNorthboundApi.md#createDeviceArStaticrouteConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/arstaticroute/devices/{deviceId}/staticroute | 创建路由器设备静态路由配置
[**deleteDeviceArStaticrouteConfig**](ArStaticrouteNetcfgNorthboundApi.md#deleteDeviceArStaticrouteConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/arstaticroute/devices/{deviceId}/staticroute/action/batch-delete | 删除路由器设备静态路由配置
[**getDeviceArStaticrouteConfig**](ArStaticrouteNetcfgNorthboundApi.md#getDeviceArStaticrouteConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/arstaticroute/devices/{deviceId}/staticroute | 查询路由器设备静态路由配置
[**updateDeviceArStaticrouteConfig**](ArStaticrouteNetcfgNorthboundApi.md#updateDeviceArStaticrouteConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/arstaticroute/devices/{deviceId}/staticroute | 修改路由器设备静态路由配置


<a name="createDeviceArStaticrouteConfig"></a>
# **createDeviceArStaticrouteConfig**
> ArStaticrouteResponseDto createDeviceArStaticrouteConfig(deviceId, deviceArStaticrouteInfoDto)

创建路由器设备静态路由配置

## 典型场景 ##    提供创建路由器设备静态路由配置的接口。 ## 接口功能 ##    创建路由器设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ArStaticrouteNetcfgNorthboundApi;


ArStaticrouteNetcfgNorthboundApi apiInstance = new ArStaticrouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
RouteInfo deviceArStaticrouteInfoDto = new RouteInfo(); // RouteInfo | 创建的路由器设备静态路由配置。
try {
    ArStaticrouteResponseDto result = apiInstance.createDeviceArStaticrouteConfig(deviceId, deviceArStaticrouteInfoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArStaticrouteNetcfgNorthboundApi#createDeviceArStaticrouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **deviceArStaticrouteInfoDto** | [**RouteInfo**](RouteInfo.md)| 创建的路由器设备静态路由配置。 |

### Return type

[**ArStaticrouteResponseDto**](ArStaticrouteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceArStaticrouteConfig"></a>
# **deleteDeviceArStaticrouteConfig**
> ArStaticrouteDeleteResponseDto deleteDeviceArStaticrouteConfig(deviceId, id)

删除路由器设备静态路由配置

## 典型场景 ##    提供删除路由器设备静态路由配置的接口。 ## 接口功能 ##    删除路由器设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ArStaticrouteNetcfgNorthboundApi;


ArStaticrouteNetcfgNorthboundApi apiInstance = new ArStaticrouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
ArStaticrouteDeleteDto id = new ArStaticrouteDeleteDto(); // ArStaticrouteDeleteDto | 要删除的路由器设备静态路由配置ID列表。
try {
    ArStaticrouteDeleteResponseDto result = apiInstance.deleteDeviceArStaticrouteConfig(deviceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArStaticrouteNetcfgNorthboundApi#deleteDeviceArStaticrouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **id** | [**ArStaticrouteDeleteDto**](ArStaticrouteDeleteDto.md)| 要删除的路由器设备静态路由配置ID列表。 |

### Return type

[**ArStaticrouteDeleteResponseDto**](ArStaticrouteDeleteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceArStaticrouteConfig"></a>
# **getDeviceArStaticrouteConfig**
> GetArStaticrouteResponseDto getDeviceArStaticrouteConfig(deviceId, pageSize, pageIndex)

查询路由器设备静态路由配置

## 典型场景 ##    提供查询路由器设备静态路由配置的接口。 ## 接口功能 ##    查询路由器设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ArStaticrouteNetcfgNorthboundApi;


ArStaticrouteNetcfgNorthboundApi apiInstance = new ArStaticrouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
Integer pageSize = 20; // Integer | 每页显示记录数。
Integer pageIndex = 1; // Integer | 页面索引。
try {
    GetArStaticrouteResponseDto result = apiInstance.getDeviceArStaticrouteConfig(deviceId, pageSize, pageIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArStaticrouteNetcfgNorthboundApi#getDeviceArStaticrouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **pageSize** | **Integer**| 每页显示记录数。 |
 **pageIndex** | **Integer**| 页面索引。 | [optional]

### Return type

[**GetArStaticrouteResponseDto**](GetArStaticrouteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeviceArStaticrouteConfig"></a>
# **updateDeviceArStaticrouteConfig**
> ArStaticrouteResponseDto updateDeviceArStaticrouteConfig(deviceId, deviceArStaticrouteInfoDto)

修改路由器设备静态路由配置

## 典型场景 ##    提供修改路由器设备静态路由配置的接口。 ## 接口功能 ##    修改路由器设备静态路由配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ArStaticrouteNetcfgNorthboundApi;


ArStaticrouteNetcfgNorthboundApi apiInstance = new ArStaticrouteNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
DeviceArStaticrouteInfoDto deviceArStaticrouteInfoDto = new DeviceArStaticrouteInfoDto(); // DeviceArStaticrouteInfoDto | 修改的路由器设备静态路由配置。
try {
    ArStaticrouteResponseDto result = apiInstance.updateDeviceArStaticrouteConfig(deviceId, deviceArStaticrouteInfoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArStaticrouteNetcfgNorthboundApi#updateDeviceArStaticrouteConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **deviceArStaticrouteInfoDto** | [**DeviceArStaticrouteInfoDto**](DeviceArStaticrouteInfoDto.md)| 修改的路由器设备静态路由配置。 |

### Return type

[**ArStaticrouteResponseDto**](ArStaticrouteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

