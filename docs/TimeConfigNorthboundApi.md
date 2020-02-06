# TimeConfigNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config**](TimeConfigNorthboundApi.md#config) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/time/sites/{siteId}/times | 修改站点内时间配置
[**getConfig**](TimeConfigNorthboundApi.md#getConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/time/sites/{siteId}/times | 查询站点内时间配置


<a name="config"></a>
# **config**
> TimeConfigRespDto config(siteId, body)

修改站点内时间配置

## 典型场景 ##    提供配置参数的接口，进行时间配置。 ## 接口功能 ##    修改时间配置。    配置NTP时，设备通过NTP进行时间同步；否则设备通过控制器进行时间同步。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeConfigNorthboundApi;


TimeConfigNorthboundApi apiInstance = new TimeConfigNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
TimeConfigDto body = new TimeConfigDto(); // TimeConfigDto | 站点内时间配置参数体。
try {
    TimeConfigRespDto result = apiInstance.config(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeConfigNorthboundApi#config");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**TimeConfigDto**](TimeConfigDto.md)| 站点内时间配置参数体。 |

### Return type

[**TimeConfigRespDto**](TimeConfigRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfig"></a>
# **getConfig**
> TimeConfigRespDto getConfig(siteId)

查询站点内时间配置

## 典型场景 ##    提供查询配置参数的接口，查询时间配置信息。 ## 接口功能 ##    获取时间配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeConfigNorthboundApi;


TimeConfigNorthboundApi apiInstance = new TimeConfigNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    TimeConfigRespDto result = apiInstance.getConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeConfigNorthboundApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**TimeConfigRespDto**](TimeConfigRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

