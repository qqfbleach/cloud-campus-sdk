# DomainNameNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config**](DomainNameNorthboundApi.md#config) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/domainname/sites/{siteId}/domainnames | 修改站点内设备域名配置
[**getConfig**](DomainNameNorthboundApi.md#getConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/domainname/sites/{siteId}/domainnames | 获取站点内设备域名配置


<a name="config"></a>
# **config**
> DomainNameResponseDto config(siteId, body)

修改站点内设备域名配置

## 典型场景 ##    提供配置参数的接口，修改站点内设备域名配置。 ## 接口功能 ##    修改站点内设备域名配置。 ## 接口约束 ##    该接口必须在站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DomainNameNorthboundApi;


DomainNameNorthboundApi apiInstance = new DomainNameNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
DomainNameDto body = new DomainNameDto(); // DomainNameDto | 站点内设备域名配置参数体。
try {
    DomainNameResponseDto result = apiInstance.config(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameNorthboundApi#config");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**DomainNameDto**](DomainNameDto.md)| 站点内设备域名配置参数体。 |

### Return type

[**DomainNameResponseDto**](DomainNameResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfig"></a>
# **getConfig**
> DomainNameResponseDto getConfig(siteId)

获取站点内设备域名配置

## 典型场景 ##    提供查询配置参数的接口，查询站点内设备域名配置。 ## 接口功能 ##    获取站点内设备域名配置。 ## 接口约束 ##    该接口必须在站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DomainNameNorthboundApi;


DomainNameNorthboundApi apiInstance = new DomainNameNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    DomainNameResponseDto result = apiInstance.getConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameNorthboundApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**DomainNameResponseDto**](DomainNameResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

