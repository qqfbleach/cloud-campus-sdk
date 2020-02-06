# ApExtraServiceNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config**](ApExtraServiceNorthboundApi.md#config) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/apextraservice/sites/{siteId}/apextraservices | 修改站点内AP增值服务配置
[**getConfig**](ApExtraServiceNorthboundApi.md#getConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/apextraservice/sites/{siteId}/apextraservices | 获取站点内AP增值服务配置


<a name="config"></a>
# **config**
> ApExtraServiceResponseDto config(siteId, body)

修改站点内AP增值服务配置

## 典型场景 ##    提供配置参数的接口，修改站点内AP增值服务配置。 ## 接口功能 ##    修改站点内AP增值服务配置。 ## 接口约束 ##    该接口必须在站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApExtraServiceNorthboundApi;


ApExtraServiceNorthboundApi apiInstance = new ApExtraServiceNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
ApExtraServiceInputDto body = new ApExtraServiceInputDto(); // ApExtraServiceInputDto | 站点内AP增值服务配置参数体。
try {
    ApExtraServiceResponseDto result = apiInstance.config(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApExtraServiceNorthboundApi#config");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**ApExtraServiceInputDto**](ApExtraServiceInputDto.md)| 站点内AP增值服务配置参数体。 |

### Return type

[**ApExtraServiceResponseDto**](ApExtraServiceResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfig"></a>
# **getConfig**
> ApExtraServiceResponseDto getConfig(siteId)

获取站点内AP增值服务配置

## 典型场景 ##    提供查询配置参数的接口，查询站点内AP增值服务配置。 ## 接口功能 ##    获取站点内AP增值服务配置。 ## 接口约束 ##    该接口必须在站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApExtraServiceNorthboundApi;


ApExtraServiceNorthboundApi apiInstance = new ApExtraServiceNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    ApExtraServiceResponseDto result = apiInstance.getConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApExtraServiceNorthboundApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**ApExtraServiceResponseDto**](ApExtraServiceResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

