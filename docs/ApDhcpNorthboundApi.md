# ApDhcpNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSiteDhcpConfig**](ApDhcpNorthboundApi.md#getSiteDhcpConfig) | **GET** /controller/campus/v3/networkconfig/site/{siteId}/apdhcp | 查询站点全局DHCP配置
[**updateSiteDhcpConfig**](ApDhcpNorthboundApi.md#updateSiteDhcpConfig) | **PUT** /controller/campus/v3/networkconfig/site/{siteId}/apdhcp | 修改站点全局DHCP配置


<a name="getSiteDhcpConfig"></a>
# **getSiteDhcpConfig**
> ApDhcpConfigResponsesDto getSiteDhcpConfig(siteId)

查询站点全局DHCP配置

## 典型场景 ##  提供查询AP DHCP接口。&lt;br&gt; ## 接口功能 ##  查询AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApDhcpNorthboundApi;


ApDhcpNorthboundApi apiInstance = new ApDhcpNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点ID，UUID格式。
try {
    ApDhcpConfigResponsesDto result = apiInstance.getSiteDhcpConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApDhcpNorthboundApi#getSiteDhcpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |

### Return type

[**ApDhcpConfigResponsesDto**](ApDhcpConfigResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteDhcpConfig"></a>
# **updateSiteDhcpConfig**
> ApDhcpConfigResponsesDto updateSiteDhcpConfig(siteId, apDhcpConfigApiDto)

修改站点全局DHCP配置

## 典型场景 ##  提供修改AP DHCP接口。&lt;br&gt;  ## 接口功能 ##  修改AP DHCP。&lt;br&gt;  ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApDhcpNorthboundApi;


ApDhcpNorthboundApi apiInstance = new ApDhcpNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点ID，UUID格式。
ApDhcpConfigApiDto apDhcpConfigApiDto = new ApDhcpConfigApiDto(); // ApDhcpConfigApiDto | 修改站点全局DHCP配置入参。
try {
    ApDhcpConfigResponsesDto result = apiInstance.updateSiteDhcpConfig(siteId, apDhcpConfigApiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApDhcpNorthboundApi#updateSiteDhcpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **apDhcpConfigApiDto** | [**ApDhcpConfigApiDto**](ApDhcpConfigApiDto.md)| 修改站点全局DHCP配置入参。 |

### Return type

[**ApDhcpConfigResponsesDto**](ApDhcpConfigResponsesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

