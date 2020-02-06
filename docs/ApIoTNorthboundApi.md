# ApIoTNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config**](ApIoTNorthboundApi.md#config) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/apiot/sites/{siteId}/apiot | 配置站点内AP的IOT配置
[**getConfig**](ApIoTNorthboundApi.md#getConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/apiot/sites/{siteId}/apiot | 查询站点内AP的IOT配置


<a name="config"></a>
# **config**
> IoTResponseDto config(siteId, body)

配置站点内AP的IOT配置

## 典型场景 ##    提供配置参数的接口，配置AP的IOT信息。 ## 接口功能 ##    配置AP的IOT信息。 ## 接口约束 ##    该接口必须在租户内，存在AP设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApIoTNorthboundApi;


ApIoTNorthboundApi apiInstance = new ApIoTNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
IoTDto body = new IoTDto(); // IoTDto | 站点内AP的IOT配置参数体。
try {
    IoTResponseDto result = apiInstance.config(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIoTNorthboundApi#config");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**IoTDto**](IoTDto.md)| 站点内AP的IOT配置参数体。 |

### Return type

[**IoTResponseDto**](IoTResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfig"></a>
# **getConfig**
> IoTResponseDto getConfig(siteId)

查询站点内AP的IOT配置

## 典型场景 ##    提供查询AP的IOT配置信息接口。 ## 接口功能 ##    查询IOT配置。 ## 接口约束 ##    该接口必须在租户内，存在AP设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApIoTNorthboundApi;


ApIoTNorthboundApi apiInstance = new ApIoTNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    IoTResponseDto result = apiInstance.getConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIoTNorthboundApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**IoTResponseDto**](IoTResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

