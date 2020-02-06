# SiteTemplateNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSiteTemplate**](SiteTemplateNorthboundApi.md#addSiteTemplate) | **POST** /controller/campus/v1/networkservice/networkconfig/site-templates | 创建站点模板
[**bindSiteTemplate**](SiteTemplateNorthboundApi.md#bindSiteTemplate) | **POST** /controller/campus/v1/networkservice/networkconfig/site-template-binding-relationship/{siteTemplateId} | 绑定一个或多个站点到站点模板
[**deleteSiteTemplates**](SiteTemplateNorthboundApi.md#deleteSiteTemplates) | **POST** /controller/campus/v1/networkservice/networkconfig/site-templates/batch-delete | 删除站点模板
[**getBindingSiteList**](SiteTemplateNorthboundApi.md#getBindingSiteList) | **GET** /controller/campus/v1/networkservice/networkconfig/site-template-binding-relationship/{siteTemplateId}/sites | 根据站点模板ID查询绑定的站点
[**getBindingSiteTemplate**](SiteTemplateNorthboundApi.md#getBindingSiteTemplate) | **GET** /controller/campus/v1/networkservice/networkconfig/site-template-binding-relationship/{siteId}/site-template | 根据站点ID查询绑定的站点模板
[**getSiteTemplates**](SiteTemplateNorthboundApi.md#getSiteTemplates) | **GET** /controller/campus/v1/networkservice/networkconfig/site-templates | 查询站点模板
[**unbindSiteTemplate**](SiteTemplateNorthboundApi.md#unbindSiteTemplate) | **POST** /controller/campus/v1/networkservice/networkconfig/site-template-binding-relationship/{siteTemplateId}/batch-delete | 站点模板解绑定一个或多个站点
[**updateSiteTemplate**](SiteTemplateNorthboundApi.md#updateSiteTemplate) | **PUT** /controller/campus/v1/networkservice/networkconfig/site-templates/{siteTemplateId} | 修改站点模板


<a name="addSiteTemplate"></a>
# **addSiteTemplate**
> CreateSiteTempResponseDto addSiteTemplate(body)

创建站点模板

## 典型场景 ##  提供创建站点模板接口。 ## 接口功能 ##  创建站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
CreateSiteTempDto body = new CreateSiteTempDto(); // CreateSiteTempDto | 待创建的站点模板信息。
try {
    CreateSiteTempResponseDto result = apiInstance.addSiteTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#addSiteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSiteTempDto**](CreateSiteTempDto.md)| 待创建的站点模板信息。 |

### Return type

[**CreateSiteTempResponseDto**](CreateSiteTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bindSiteTemplate"></a>
# **bindSiteTemplate**
> SiteTemplateAndSiteListResponseDto bindSiteTemplate(siteTemplateId, body)

绑定一个或多个站点到站点模板

## 典型场景 ##  提供绑定一个或多个站点到站点模板接口。 ## 接口功能 ##  绑定一个或多个站点到站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e451"; // String | 站点模板ID，UUID格式。
BindingSiteListDto body = new BindingSiteListDto(); // BindingSiteListDto | 站点ID列表。
try {
    SiteTemplateAndSiteListResponseDto result = apiInstance.bindSiteTemplate(siteTemplateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#bindSiteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板ID，UUID格式。 |
 **body** | [**BindingSiteListDto**](BindingSiteListDto.md)| 站点ID列表。 |

### Return type

[**SiteTemplateAndSiteListResponseDto**](SiteTemplateAndSiteListResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSiteTemplates"></a>
# **deleteSiteTemplates**
> DeleteSiteTempResponseDto deleteSiteTemplates(body)

删除站点模板

## 典型场景 ##  提供删除站点模板接口。 ## 接口功能 ##  删除站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
DeleteSiteTempDto body = new DeleteSiteTempDto(); // DeleteSiteTempDto | 待删除的站点模板ID列表。
try {
    DeleteSiteTempResponseDto result = apiInstance.deleteSiteTemplates(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#deleteSiteTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteSiteTempDto**](DeleteSiteTempDto.md)| 待删除的站点模板ID列表。 |

### Return type

[**DeleteSiteTempResponseDto**](DeleteSiteTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBindingSiteList"></a>
# **getBindingSiteList**
> GetSiteListDto getBindingSiteList(siteTemplateId, pageSize, pageIndex, sort)

根据站点模板ID查询绑定的站点

## 典型场景 ##  提供根据站点模板ID查询绑定的站点接口。 ## 接口功能 ##  根据站点模板ID查询绑定的站点。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e451"; // String | 站点模板ID，UUID格式。
Integer pageSize = 20; // Integer | 每页大小。
Integer pageIndex = 1; // Integer | 页码。
String sort = "name"; // String | 排序字段，支持name。
try {
    GetSiteListDto result = apiInstance.getBindingSiteList(siteTemplateId, pageSize, pageIndex, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#getBindingSiteList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板ID，UUID格式。 |
 **pageSize** | **Integer**| 每页大小。 | [optional]
 **pageIndex** | **Integer**| 页码。 | [optional]
 **sort** | **String**| 排序字段，支持name。 | [optional]

### Return type

[**GetSiteListDto**](GetSiteListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBindingSiteTemplate"></a>
# **getBindingSiteTemplate**
> GetSiteTempDto getBindingSiteTemplate(siteId)

根据站点ID查询绑定的站点模板

## 典型场景 ##  提供根据站点ID查询绑定的站点模板接口。 ## 接口功能 ##  根据站点ID查询绑定的站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e451"; // String | 站点ID，UUID格式。
try {
    GetSiteTempDto result = apiInstance.getBindingSiteTemplate(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#getBindingSiteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |

### Return type

[**GetSiteTempDto**](GetSiteTempDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSiteTemplates"></a>
# **getSiteTemplates**
> GetSiteTempResponseDto getSiteTemplates(pageSize, pageIndex, sort)

查询站点模板

## 典型场景 ##  提供查询站点模板接口。 ## 接口功能 ##  查询站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
Integer pageSize = 20; // Integer | 每页大小。
Integer pageIndex = 1; // Integer | 页码。
String sort = "name"; // String | 排序字段，支持name和type，开头带有+表示升序，带有-表示降序，若不设置，默认以name升序返回。
try {
    GetSiteTempResponseDto result = apiInstance.getSiteTemplates(pageSize, pageIndex, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#getSiteTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| 每页大小。 | [optional]
 **pageIndex** | **Integer**| 页码。 | [optional]
 **sort** | **String**| 排序字段，支持name和type，开头带有+表示升序，带有-表示降序，若不设置，默认以name升序返回。 | [optional]

### Return type

[**GetSiteTempResponseDto**](GetSiteTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unbindSiteTemplate"></a>
# **unbindSiteTemplate**
> SiteTemplateAndSiteListResponseDto unbindSiteTemplate(siteTemplateId, body)

站点模板解绑定一个或多个站点

## 典型场景 ##  提供站点模板解绑定一个或多个站点接口。 ## 接口功能 ##  站点模板解绑定一个或多个站点。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e451"; // String | 站点模板ID，UUID格式。
BindingSiteListDto body = new BindingSiteListDto(); // BindingSiteListDto | 站点ID列表。
try {
    SiteTemplateAndSiteListResponseDto result = apiInstance.unbindSiteTemplate(siteTemplateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#unbindSiteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板ID，UUID格式。 |
 **body** | [**BindingSiteListDto**](BindingSiteListDto.md)| 站点ID列表。 |

### Return type

[**SiteTemplateAndSiteListResponseDto**](SiteTemplateAndSiteListResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteTemplate"></a>
# **updateSiteTemplate**
> UpdateSiteTempResponseDto updateSiteTemplate(siteTemplateId, body)

修改站点模板

## 典型场景 ##  提供修改站点模板接口。 ## 接口功能 ##  修改站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteTemplateNorthboundApi;


SiteTemplateNorthboundApi apiInstance = new SiteTemplateNorthboundApi();
String siteTemplateId = "fbde1c5d-5b94-49e3-a912-48641015e451"; // String | 站点模板ID，UUID格式。
UpdateSiteTempDto body = new UpdateSiteTempDto(); // UpdateSiteTempDto | 站点模板修改内容。
try {
    UpdateSiteTempResponseDto result = apiInstance.updateSiteTemplate(siteTemplateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteTemplateNorthboundApi#updateSiteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **String**| 站点模板ID，UUID格式。 |
 **body** | [**UpdateSiteTempDto**](UpdateSiteTempDto.md)| 站点模板修改内容。 |

### Return type

[**UpdateSiteTempResponseDto**](UpdateSiteTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

