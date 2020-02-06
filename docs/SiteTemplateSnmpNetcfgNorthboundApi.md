# SiteTemplateSnmpNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSiteTemplateSnmp**](SiteTemplateSnmpNetcfgNorthboundApi.md#getSiteTemplateSnmp) | **GET** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/snmp | 查询该站点模板SNMP配置信息
[**updateSiteTemplateSnmp**](SiteTemplateSnmpNetcfgNorthboundApi.md#updateSiteTemplateSnmp) | **PUT** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/snmp | 修改该站点模板SNMP配置信息


<a name="getSiteTemplateSnmp"></a>
# **getSiteTemplateSnmp**
> SiteTemplateSnmpResponseDto getSiteTemplateSnmp(siteTemplateId)

查询该站点模板SNMP配置信息

## 典型场景 ##   提供查询该站点模板SNMP配置信息接口。 ## 接口功能 ##   查询该站点模板SNMP配置信息。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateSnmpNetcfgNorthboundApi;


SiteTemplateSnmpNetcfgNorthboundApi apiInstance = new SiteTemplateSnmpNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板标识，UUID格式。
try {
    SiteTemplateSnmpResponseDto result = apiInstance.getSiteTemplateSnmp(siteTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateSnmpNetcfgNorthboundApi#getSiteTemplateSnmp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板标识，UUID格式。 |

### Return type

[**SiteTemplateSnmpResponseDto**](SiteTemplateSnmpResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteTemplateSnmp"></a>
# **updateSiteTemplateSnmp**
> SiteTemplateSnmpResponseDto updateSiteTemplateSnmp(siteTemplateId, siteTemplateSnmpDto)

修改该站点模板SNMP配置信息

## 典型场景 ##   提供修改该站点模板SNMP配置信息接口 ## 接口功能 ##   修改该站点模板SNMP配置信息。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateSnmpNetcfgNorthboundApi;


SiteTemplateSnmpNetcfgNorthboundApi apiInstance = new SiteTemplateSnmpNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板标识，UUID格式。
SiteTemplateSnmpDto siteTemplateSnmpDto = new SiteTemplateSnmpDto(); // SiteTemplateSnmpDto | 站点模板SNMP配置信息
try {
    SiteTemplateSnmpResponseDto result = apiInstance.updateSiteTemplateSnmp(siteTemplateId, siteTemplateSnmpDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateSnmpNetcfgNorthboundApi#updateSiteTemplateSnmp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板标识，UUID格式。 |
 **siteTemplateSnmpDto** | [**SiteTemplateSnmpDto**](SiteTemplateSnmpDto.md)| 站点模板SNMP配置信息 |

### Return type

[**SiteTemplateSnmpResponseDto**](SiteTemplateSnmpResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

