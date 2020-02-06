# SiteTemplateGroupradioNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSiteTemplateGroupRadio**](SiteTemplateGroupradioNetcfgNorthboundApi.md#getSiteTemplateGroupRadio) | **GET** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/apradio | 查询AP站点模板射频配置信息
[**updateSiteTemplateGroupRadio**](SiteTemplateGroupradioNetcfgNorthboundApi.md#updateSiteTemplateGroupRadio) | **PUT** /controller/campus/v3/networkconfig/site-templates/{siteTemplateId}/apradio | 修改AP站点模板射频配置信息


<a name="getSiteTemplateGroupRadio"></a>
# **getSiteTemplateGroupRadio**
> SiteTemplateGroupRadioResponseDto getSiteTemplateGroupRadio(siteTemplateId)

查询AP站点模板射频配置信息

## 典型场景 ##  提供查询AP站点模板射频配置信息接口。 ## 接口功能 ##  查询AP站点模板射频配置信息。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateGroupradioNetcfgNorthboundApi;


SiteTemplateGroupradioNetcfgNorthboundApi apiInstance = new SiteTemplateGroupradioNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板ID，UUID格式。
try {
    SiteTemplateGroupRadioResponseDto result = apiInstance.getSiteTemplateGroupRadio(siteTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateGroupradioNetcfgNorthboundApi#getSiteTemplateGroupRadio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板ID，UUID格式。 |

### Return type

[**SiteTemplateGroupRadioResponseDto**](SiteTemplateGroupRadioResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteTemplateGroupRadio"></a>
# **updateSiteTemplateGroupRadio**
> SiteTemplateGroupRadioResponseDto updateSiteTemplateGroupRadio(siteTemplateId, siteTemplateGroupRadioDto)

修改AP站点模板射频配置信息

## 典型场景 ## 提供修改AP站点模板射频配置信息接口。 ## 接口功能 ## 修改AP站点模板射频配置信息。 ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateGroupradioNetcfgNorthboundApi;


SiteTemplateGroupradioNetcfgNorthboundApi apiInstance = new SiteTemplateGroupradioNetcfgNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点模板ID，UUID格式。
SiteTemplateGroupRadioDto siteTemplateGroupRadioDto = new SiteTemplateGroupRadioDto(); // SiteTemplateGroupRadioDto | 修改AP站点模板射频配置信息。
try {
    SiteTemplateGroupRadioResponseDto result = apiInstance.updateSiteTemplateGroupRadio(siteTemplateId, siteTemplateGroupRadioDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateGroupradioNetcfgNorthboundApi#updateSiteTemplateGroupRadio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板ID，UUID格式。 |
 **siteTemplateGroupRadioDto** | [**SiteTemplateGroupRadioDto**](SiteTemplateGroupRadioDto.md)| 修改AP站点模板射频配置信息。 |

### Return type

[**SiteTemplateGroupRadioResponseDto**](SiteTemplateGroupRadioResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

