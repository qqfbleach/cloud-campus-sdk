# BoardNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceBoardConfig**](BoardNetcfgNorthboundApi.md#createDeviceBoardConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/board/devices/{deviceId}/boards | 添加单板配置
[**deleteDeviceBoardConfig**](BoardNetcfgNorthboundApi.md#deleteDeviceBoardConfig) | **POST** /controller/campus/v1/networkservice/networkconfig/net/board/devices/{deviceId}/boards/action/batch-delete | 删除单板配置
[**getDeviceBoardConfig**](BoardNetcfgNorthboundApi.md#getDeviceBoardConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/board/devices/{deviceId}/boards | 查询单板配置


<a name="createDeviceBoardConfig"></a>
# **createDeviceBoardConfig**
> ConfigResponseDto createDeviceBoardConfig(deviceId, boardConfigDto)

添加单板配置

## 典型场景 ##    提供配置单板参数的接口。 ## 接口功能 ##    配置交换机单板。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.BoardNetcfgNorthboundApi;


BoardNetcfgNorthboundApi apiInstance = new BoardNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
BoardConfigDto boardConfigDto = new BoardConfigDto(); // BoardConfigDto | 单板配置信息。
try {
    ConfigResponseDto result = apiInstance.createDeviceBoardConfig(deviceId, boardConfigDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardNetcfgNorthboundApi#createDeviceBoardConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **boardConfigDto** | [**BoardConfigDto**](BoardConfigDto.md)| 单板配置信息。 |

### Return type

[**ConfigResponseDto**](ConfigResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceBoardConfig"></a>
# **deleteDeviceBoardConfig**
> DeleteResponseDto deleteDeviceBoardConfig(deviceId, slot)

删除单板配置

## 典型场景 ## 提供删除单板配置的接口。 ## 接口功能 ## 删除站点内该交换机设备指定槽位的单板配置。 ## 接口约束 ## 只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.BoardNetcfgNorthboundApi;


BoardNetcfgNorthboundApi apiInstance = new BoardNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
BoardDeleteDto slot = new BoardDeleteDto(); // BoardDeleteDto | 待删除的槽位单板。
try {
    DeleteResponseDto result = apiInstance.deleteDeviceBoardConfig(deviceId, slot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardNetcfgNorthboundApi#deleteDeviceBoardConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |
 **slot** | [**BoardDeleteDto**](BoardDeleteDto.md)| 待删除的槽位单板。 |

### Return type

[**DeleteResponseDto**](DeleteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceBoardConfig"></a>
# **getDeviceBoardConfig**
> GetBoardResponseDto getDeviceBoardConfig(deviceId)

查询单板配置

## 典型场景 ##    提供查询单板配置参数的接口。 ## 接口功能 ##    查询交换机单板配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.BoardNetcfgNorthboundApi;


BoardNetcfgNorthboundApi apiInstance = new BoardNetcfgNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备标识，UUID格式。
try {
    GetBoardResponseDto result = apiInstance.getDeviceBoardConfig(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardNetcfgNorthboundApi#getDeviceBoardConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备标识，UUID格式。 |

### Return type

[**GetBoardResponseDto**](GetBoardResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

