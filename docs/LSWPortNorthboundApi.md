# LSWPortNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config**](LSWPortNorthboundApi.md#config) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/lswport/devices/{deviceId}/ethernet-ports | 修改交换机端口配置
[**createEthTrunk**](LSWPortNorthboundApi.md#createEthTrunk) | **POST** /controller/campus/v1/networkservice/networkconfig/net/lswport/devices/{deviceId}/ethtrunk-ports | 创建交换机EthTrunk端口
[**deleteEthTrunk**](LSWPortNorthboundApi.md#deleteEthTrunk) | **DELETE** /controller/campus/v1/networkservice/networkconfig/net/lswport/devices/{deviceId}/ethtrunk-ports/{name} | 删除交换机EthTrunk端口
[**getConfig**](LSWPortNorthboundApi.md#getConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/lswport/devices/{deviceId}/ports | 查询交换机端口配置
[**updateEthTrunk**](LSWPortNorthboundApi.md#updateEthTrunk) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/lswport/devices/{deviceId}/ethtrunk-ports/{name} | 修改交换机EthTrunk端口


<a name="config"></a>
# **config**
> PutResponseDto config(deviceId, body)

修改交换机端口配置

## 典型场景 ##    提供配置参数的接口，修改交换机以太端口配置。 ## 接口功能 ##    修改交换机以太端口配置，支持同时配置多个端口。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWPortNorthboundApi;


LSWPortNorthboundApi apiInstance = new LSWPortNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
List<LSWEthPortDto> body = Arrays.asList(new LSWEthPortDto()); // List<LSWEthPortDto> | 交换机以太端口配置参数体。
try {
    PutResponseDto result = apiInstance.config(deviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWPortNorthboundApi#config");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **body** | [**List&lt;LSWEthPortDto&gt;**](LSWEthPortDto.md)| 交换机以太端口配置参数体。 |

### Return type

[**PutResponseDto**](PutResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEthTrunk"></a>
# **createEthTrunk**
> EthTrunkResponseDto createEthTrunk(deviceId, body)

创建交换机EthTrunk端口

## 典型场景 ##    提供配置参数的接口，创建交换机EthTrunk端口。 ## 接口功能 ##    创建交换机EthTrunk端口，可以同时配置此EthTrunk端口参数。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWPortNorthboundApi;


LSWPortNorthboundApi apiInstance = new LSWPortNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
LSWEthTrunkPortDto body = new LSWEthTrunkPortDto(); // LSWEthTrunkPortDto | 创建交换机EthTrunk端口参数体。
try {
    EthTrunkResponseDto result = apiInstance.createEthTrunk(deviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWPortNorthboundApi#createEthTrunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **body** | [**LSWEthTrunkPortDto**](LSWEthTrunkPortDto.md)| 创建交换机EthTrunk端口参数体。 |

### Return type

[**EthTrunkResponseDto**](EthTrunkResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEthTrunk"></a>
# **deleteEthTrunk**
> ResponseDto deleteEthTrunk(deviceId, name)

删除交换机EthTrunk端口

## 典型场景 ##    提供配置参数的接口，删除交换机EthTrunk端口。 ## 接口功能 ##    删除交换机EthTrunk端口。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWPortNorthboundApi;


LSWPortNorthboundApi apiInstance = new LSWPortNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
String name = "Eth-Trunk0"; // String | EthTrunk端口名称，必须是Eth-Trunk[数字]的格式，数字最大63。
try {
    ResponseDto result = apiInstance.deleteEthTrunk(deviceId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWPortNorthboundApi#deleteEthTrunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **name** | **String**| EthTrunk端口名称，必须是Eth-Trunk[数字]的格式，数字最大63。 |

### Return type

[**ResponseDto**](ResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfig"></a>
# **getConfig**
> GetResponseDto getConfig(deviceId)

查询交换机端口配置

## 典型场景 ##    提供查询配置参数的接口，查询交换机端口配置。 ## 接口功能 ##    查询交换机端口配置（包括以太口和EthTrunk口）。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWPortNorthboundApi;


LSWPortNorthboundApi apiInstance = new LSWPortNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
try {
    GetResponseDto result = apiInstance.getConfig(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWPortNorthboundApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |

### Return type

[**GetResponseDto**](GetResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEthTrunk"></a>
# **updateEthTrunk**
> EthTrunkResponseDto updateEthTrunk(deviceId, name, body)

修改交换机EthTrunk端口

## 典型场景 ##    提供配置参数的接口，修改交换机EthTrunk端口。 ## 接口功能 ##    修改交换机EthTrunk端口，可以同时配置此EthTrunk端口参数。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWPortNorthboundApi;


LSWPortNorthboundApi apiInstance = new LSWPortNorthboundApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
String name = "Eth-Trunk0"; // String | EthTrunk端口名称，必须是Eth-Trunk[数字]的格式，数字最大63。
LSWEthTrunkPortDto body = new LSWEthTrunkPortDto(); // LSWEthTrunkPortDto | 修改交换机EthTrunk端口参数体。
try {
    EthTrunkResponseDto result = apiInstance.updateEthTrunk(deviceId, name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWPortNorthboundApi#updateEthTrunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **name** | **String**| EthTrunk端口名称，必须是Eth-Trunk[数字]的格式，数字最大63。 |
 **body** | [**LSWEthTrunkPortDto**](LSWEthTrunkPortDto.md)| 修改交换机EthTrunk端口参数体。 |

### Return type

[**EthTrunkResponseDto**](EthTrunkResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

