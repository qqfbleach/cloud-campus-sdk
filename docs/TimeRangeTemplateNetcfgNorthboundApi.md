# TimeRangeTemplateNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig/timetemplate*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimeRangeTemplate**](TimeRangeTemplateNetcfgNorthboundApi.md#getTimeRangeTemplate) | **GET** /controller/campus/v3/networkconfig/timetemplate/ | 查询时间段模板
[**modifyTimeRangeTemplate**](TimeRangeTemplateNetcfgNorthboundApi.md#modifyTimeRangeTemplate) | **PUT** /controller/campus/v3/networkconfig/timetemplate/ | 修改时间段模板
[**timeRangetemplatePost**](TimeRangeTemplateNetcfgNorthboundApi.md#timeRangetemplatePost) | **POST** /controller/campus/v3/networkconfig/timetemplate/ | 新增时间段模板


<a name="getTimeRangeTemplate"></a>
# **getTimeRangeTemplate**
> TimeInfo getTimeRangeTemplate(name)

查询时间段模板

## 典型场景 ##  提供查询时间段模板接口。 ## 接口功能 ##  查询时间段模板。  ## 接口约束 ##  该接口支持北向接口管理访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeRangeTemplateNetcfgNorthboundApi;


TimeRangeTemplateNetcfgNorthboundApi apiInstance = new TimeRangeTemplateNetcfgNorthboundApi();
String name = "workday template"; // String | 模板名称。
try {
    TimeInfo result = apiInstance.getTimeRangeTemplate(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeRangeTemplateNetcfgNorthboundApi#getTimeRangeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| 模板名称。 | [optional]

### Return type

[**TimeInfo**](TimeInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyTimeRangeTemplate"></a>
# **modifyTimeRangeTemplate**
> TemplateResultDto modifyTimeRangeTemplate(modifyDto)

修改时间段模板

## 典型场景 ##  提供修改时间段模板接口。 ## 接口功能 ##  修改时间段模板。  ## 接口约束 ##  该接口支持北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeRangeTemplateNetcfgNorthboundApi;


TimeRangeTemplateNetcfgNorthboundApi apiInstance = new TimeRangeTemplateNetcfgNorthboundApi();
TimeTemplateDto modifyDto = new TimeTemplateDto(); // TimeTemplateDto | 修改时间段模板入参。
try {
    TemplateResultDto result = apiInstance.modifyTimeRangeTemplate(modifyDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeRangeTemplateNetcfgNorthboundApi#modifyTimeRangeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyDto** | [**TimeTemplateDto**](TimeTemplateDto.md)| 修改时间段模板入参。 |

### Return type

[**TemplateResultDto**](TemplateResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="timeRangetemplatePost"></a>
# **timeRangetemplatePost**
> TemplateResultDto timeRangetemplatePost(timeTemplate)

新增时间段模板

## 典型场景 ##  提供新增时间段模板接口。 ## 接口功能 ##  新增时间段模板。  ## 接口约束 ##  该接口支持北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeRangeTemplateNetcfgNorthboundApi;


TimeRangeTemplateNetcfgNorthboundApi apiInstance = new TimeRangeTemplateNetcfgNorthboundApi();
AddTemplateDto timeTemplate = new AddTemplateDto(); // AddTemplateDto | 增加时间段模板入参。
try {
    TemplateResultDto result = apiInstance.timeRangetemplatePost(timeTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeRangeTemplateNetcfgNorthboundApi#timeRangetemplatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeTemplate** | [**AddTemplateDto**](AddTemplateDto.md)| 增加时间段模板入参。 |

### Return type

[**TemplateResultDto**](TemplateResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

