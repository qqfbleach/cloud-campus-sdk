# SiteTemplateApssidNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSiteTemplateSsidConfig**](SiteTemplateApssidNetcfgNorthboundApi.md#createSiteTemplateSsidConfig) | **POST** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/apssid | 新增该站点模板的SSID配置
[**deleteSiteTemplateSsidConfig**](SiteTemplateApssidNetcfgNorthboundApi.md#deleteSiteTemplateSsidConfig) | **POST** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/apssid/batch-delete | 删除该站点模板的SSID配置
[**getSiteTemplateSsidConfig**](SiteTemplateApssidNetcfgNorthboundApi.md#getSiteTemplateSsidConfig) | **GET** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/apssid | 查询该站点模板的SSID配置
[**updateSiteTemplateSsidConfig**](SiteTemplateApssidNetcfgNorthboundApi.md#updateSiteTemplateSsidConfig) | **PUT** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/apssid/{id} | 修改该站点模板的SSID配置


<a name="createSiteTemplateSsidConfig"></a>
# **createSiteTemplateSsidConfig**
> SiteTemplateConfigSsidResponse createSiteTemplateSsidConfig(siteTemplateId, siteTemplateSsidConfigDto)

新增该站点模板的SSID配置

## 典型场景 ##   提供新增站点模板内AP的SSID配置列表接口。 ## 接口功能 ##   新增站点模板内AP的SSID配置列表。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateApssidNetcfgNorthboundApi;


SiteTemplateApssidNetcfgNorthboundApi apiInstance = new SiteTemplateApssidNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板标识，UUID格式。
SiteTemplateSsidConfigDto siteTemplateSsidConfigDto = new SiteTemplateSsidConfigDto(); // SiteTemplateSsidConfigDto | 站点模板SSID配置参数。
try {
    SiteTemplateConfigSsidResponse result = apiInstance.createSiteTemplateSsidConfig(siteTemplateId, siteTemplateSsidConfigDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateApssidNetcfgNorthboundApi#createSiteTemplateSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板标识，UUID格式。 |
 **siteTemplateSsidConfigDto** | [**SiteTemplateSsidConfigDto**](SiteTemplateSsidConfigDto.md)| 站点模板SSID配置参数。 |

### Return type

[**SiteTemplateConfigSsidResponse**](SiteTemplateConfigSsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSiteTemplateSsidConfig"></a>
# **deleteSiteTemplateSsidConfig**
> SiteTemplateDeleteSsidResponse deleteSiteTemplateSsidConfig(siteTemplateId, siteTemplateSsidDeleteDto)

删除该站点模板的SSID配置

## 典型场景 ##   提供删除站点模板内AP的SSID配置列表接口。 ## 接口功能 ##   删除站点模板内AP的SSID配置列表。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateApssidNetcfgNorthboundApi;


SiteTemplateApssidNetcfgNorthboundApi apiInstance = new SiteTemplateApssidNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板标识，UUID格式。
SiteTemplateSsidDeleteDto siteTemplateSsidDeleteDto = new SiteTemplateSsidDeleteDto(); // SiteTemplateSsidDeleteDto | 站点模板SSID删除参数。
try {
    SiteTemplateDeleteSsidResponse result = apiInstance.deleteSiteTemplateSsidConfig(siteTemplateId, siteTemplateSsidDeleteDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateApssidNetcfgNorthboundApi#deleteSiteTemplateSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板标识，UUID格式。 |
 **siteTemplateSsidDeleteDto** | [**SiteTemplateSsidDeleteDto**](SiteTemplateSsidDeleteDto.md)| 站点模板SSID删除参数。 |

### Return type

[**SiteTemplateDeleteSsidResponse**](SiteTemplateDeleteSsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSiteTemplateSsidConfig"></a>
# **getSiteTemplateSsidConfig**
> SiteTemplateQuerySsidResponse getSiteTemplateSsidConfig(siteTemplateId)

查询该站点模板的SSID配置

## 典型场景 ##   提供查询站点模板内AP的SSID配置列表接口。 ## 接口功能 ##   查询站点模板内AP的SSID配置列表。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateApssidNetcfgNorthboundApi;


SiteTemplateApssidNetcfgNorthboundApi apiInstance = new SiteTemplateApssidNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板标识，UUID格式。
try {
    SiteTemplateQuerySsidResponse result = apiInstance.getSiteTemplateSsidConfig(siteTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateApssidNetcfgNorthboundApi#getSiteTemplateSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板标识，UUID格式。 |

### Return type

[**SiteTemplateQuerySsidResponse**](SiteTemplateQuerySsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteTemplateSsidConfig"></a>
# **updateSiteTemplateSsidConfig**
> SiteTemplateConfigSsidResponse updateSiteTemplateSsidConfig(siteTemplateId, id, siteTemplateSsidConfigDto)

修改该站点模板的SSID配置

## 典型场景 ##   提供修改站点模板内AP的SSID配置列表接口。 ## 接口功能 ##   修改站点模板内AP的SSID配置。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateApssidNetcfgNorthboundApi;


SiteTemplateApssidNetcfgNorthboundApi apiInstance = new SiteTemplateApssidNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板标识，UUID格式。
String id = "de5813f8ff1e41f5ba9c324da70b49ed"; // String | SSID标识，创建或查询Response中的ID字段。
SiteTemplateSsidConfigDto siteTemplateSsidConfigDto = new SiteTemplateSsidConfigDto(); // SiteTemplateSsidConfigDto | 站点模板SSID配置参数。
try {
    SiteTemplateConfigSsidResponse result = apiInstance.updateSiteTemplateSsidConfig(siteTemplateId, id, siteTemplateSsidConfigDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateApssidNetcfgNorthboundApi#updateSiteTemplateSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板标识，UUID格式。 |
 **id** | **String**| SSID标识，创建或查询Response中的ID字段。 |
 **siteTemplateSsidConfigDto** | [**SiteTemplateSsidConfigDto**](SiteTemplateSsidConfigDto.md)| 站点模板SSID配置参数。 |

### Return type

[**SiteTemplateConfigSsidResponse**](SiteTemplateConfigSsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

