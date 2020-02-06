# LSWGlobalVlanNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLswGlobalVlanInfo**](LSWGlobalVlanNorthboundApi.md#createLswGlobalVlanInfo) | **POST** /controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan | 创建交换机的全局VLAN配置
[**deleteLswGlobalVlanInfo**](LSWGlobalVlanNorthboundApi.md#deleteLswGlobalVlanInfo) | **DELETE** /controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan/{recordId} | 删除交换机的全局VLAN配置
[**getLswGlobalVlanInfos**](LSWGlobalVlanNorthboundApi.md#getLswGlobalVlanInfos) | **GET** /controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan | 查询交换机的全局VLAN配置
[**updateLswGlobalVlanInfo**](LSWGlobalVlanNorthboundApi.md#updateLswGlobalVlanInfo) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/lswglobalvlan/devices/{deviceId}/globalvlan | 修改交换机的全局VLAN配置


<a name="createLswGlobalVlanInfo"></a>
# **createLswGlobalVlanInfo**
> LswGlobalVlanResponseDto createLswGlobalVlanInfo(deviceId, body)

创建交换机的全局VLAN配置

## 典型场景 ##    提供配置参数的接口，创建交换机的全局VLAN配置。 ## 接口功能 ##    创建交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWGlobalVlanNorthboundApi;


LSWGlobalVlanNorthboundApi apiInstance = new LSWGlobalVlanNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
LswGlobalVlanDto body = new LswGlobalVlanDto(); // LswGlobalVlanDto | 全局VLAN配置。
try {
    LswGlobalVlanResponseDto result = apiInstance.createLswGlobalVlanInfo(deviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWGlobalVlanNorthboundApi#createLswGlobalVlanInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **body** | [**LswGlobalVlanDto**](LswGlobalVlanDto.md)| 全局VLAN配置。 |

### Return type

[**LswGlobalVlanResponseDto**](LswGlobalVlanResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLswGlobalVlanInfo"></a>
# **deleteLswGlobalVlanInfo**
> LswGlobalVlanDelRespDto deleteLswGlobalVlanInfo(deviceId, recordId)

删除交换机的全局VLAN配置

## 典型场景 ##    提供配置参数的接口，删除交换机的全局VLAN配置。 ## 接口功能 ##    删除交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWGlobalVlanNorthboundApi;


LSWGlobalVlanNorthboundApi apiInstance = new LSWGlobalVlanNorthboundApi();
String deviceId = "ffce359c-cf08-4717-bc26-c6e6af8f0ec3"; // String | 设备ID。
String recordId = "813a76d4-6eec-4264-ae45-a6f261482b60"; // String | VLAN ID，UUID格式。
try {
    LswGlobalVlanDelRespDto result = apiInstance.deleteLswGlobalVlanInfo(deviceId, recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWGlobalVlanNorthboundApi#deleteLswGlobalVlanInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID。 |
 **recordId** | **String**| VLAN ID，UUID格式。 |

### Return type

[**LswGlobalVlanDelRespDto**](LswGlobalVlanDelRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLswGlobalVlanInfos"></a>
# **getLswGlobalVlanInfos**
> LswGlobalVlanAllRespDto getLswGlobalVlanInfos(deviceId)

查询交换机的全局VLAN配置

## 典型场景 ##    提供查询配置参数的接口，查询LSW的全局VLAN配置信息。 ## 接口功能 ##    查询全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWGlobalVlanNorthboundApi;


LSWGlobalVlanNorthboundApi apiInstance = new LSWGlobalVlanNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
try {
    LswGlobalVlanAllRespDto result = apiInstance.getLswGlobalVlanInfos(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWGlobalVlanNorthboundApi#getLswGlobalVlanInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |

### Return type

[**LswGlobalVlanAllRespDto**](LswGlobalVlanAllRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLswGlobalVlanInfo"></a>
# **updateLswGlobalVlanInfo**
> LswGlobalVlanResponseDto updateLswGlobalVlanInfo(deviceId, body)

修改交换机的全局VLAN配置

## 典型场景 ##    提供配置参数的接口，修改交换机的全局VLAN配置。 ## 接口功能 ##    修改交换机全局VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWGlobalVlanNorthboundApi;


LSWGlobalVlanNorthboundApi apiInstance = new LSWGlobalVlanNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
LswGlobalVlanUpdateDto body = new LswGlobalVlanUpdateDto(); // LswGlobalVlanUpdateDto | 交换机的全局VLAN配置。
try {
    LswGlobalVlanResponseDto result = apiInstance.updateLswGlobalVlanInfo(deviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWGlobalVlanNorthboundApi#updateLswGlobalVlanInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **body** | [**LswGlobalVlanUpdateDto**](LswGlobalVlanUpdateDto.md)| 交换机的全局VLAN配置。 |

### Return type

[**LswGlobalVlanResponseDto**](LswGlobalVlanResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

