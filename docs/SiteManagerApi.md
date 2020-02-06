# SiteManagerApi

All URIs are relative to *https://localhost/controller/campus/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSites**](SiteManagerApi.md#createSites) | **POST** /controller/campus/v3/sites | 创建站点
[**deleteSites**](SiteManagerApi.md#deleteSites) | **DELETE** /controller/campus/v3/sites | 删除站点
[**querySites**](SiteManagerApi.md#querySites) | **GET** /controller/campus/v3/sites | 查询站点
[**updateSite**](SiteManagerApi.md#updateSite) | **PUT** /controller/campus/v3/sites/{siteId} | 修改站点


<a name="createSites"></a>
# **createSites**
> CreateSiteOut createSites(createSiteDto)

创建站点

## 典型场景 ## 根据站点名称和描述，创建站点。 ## 接口功能 ## 创建站点。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteManagerApi;


SiteManagerApi apiInstance = new SiteManagerApi();
CreateSiteDto createSiteDto = new CreateSiteDto(); // CreateSiteDto | 创建站点入参。
try {
    CreateSiteOut result = apiInstance.createSites(createSiteDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteManagerApi#createSites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSiteDto** | [**CreateSiteDto**](CreateSiteDto.md)| 创建站点入参。 |

### Return type

[**CreateSiteOut**](CreateSiteOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSites"></a>
# **deleteSites**
> DeleteSiteOut deleteSites(deleteSiteDto)

删除站点

## 典型场景 ## 根据站点ID列表，删除对应的站点。 ## 接口功能 ## 删除站点。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteManagerApi;


SiteManagerApi apiInstance = new SiteManagerApi();
DeleteSiteDto deleteSiteDto = new DeleteSiteDto(); // DeleteSiteDto | 删除站点请求体。
try {
    DeleteSiteOut result = apiInstance.deleteSites(deleteSiteDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteManagerApi#deleteSites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteSiteDto** | [**DeleteSiteDto**](DeleteSiteDto.md)| 删除站点请求体。 |

### Return type

[**DeleteSiteOut**](DeleteSiteOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="querySites"></a>
# **querySites**
> QuerySitesOut querySites(pageIndex, pageSize, name)

查询站点

## 典型场景 ## 传入页面索引和页面长度，查询站点信息。 ## 接口功能 ## 查询站点列表。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteManagerApi;


SiteManagerApi apiInstance = new SiteManagerApi();
Integer pageIndex = 1; // Integer | 分页时，当前页面索引，值<=0时默认获取前20条数据。
Integer pageSize = 20; // Integer | 分页时，当前页面设备数据长度；pageIndex为空或<=0时，此参数默认20。
String name = "siteName"; // String | 站点名称模糊查询，支持精确和模糊匹配，不支持正则。
try {
    QuerySitesOut result = apiInstance.querySites(pageIndex, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteManagerApi#querySites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIndex** | **Integer**| 分页时，当前页面索引，值&lt;&#x3D;0时默认获取前20条数据。 | [optional] [default to 1]
 **pageSize** | **Integer**| 分页时，当前页面设备数据长度；pageIndex为空或&lt;&#x3D;0时，此参数默认20。 | [optional] [default to 20]
 **name** | **String**| 站点名称模糊查询，支持精确和模糊匹配，不支持正则。 | [optional]

### Return type

[**QuerySitesOut**](QuerySitesOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSite"></a>
# **updateSite**
> UpdateSitesOut updateSite(siteId, updateSiteDto)

修改站点

## 典型场景 ## 根据站点ID，修改站点的名称和描述信息。 ## 接口功能 ## 修改站点。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SiteManagerApi;


SiteManagerApi apiInstance = new SiteManagerApi();
String siteId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359ca"; // String | 站点ID。
UpdateSitesDto updateSiteDto = new UpdateSitesDto(); // UpdateSitesDto | 修改站点请求体。
try {
    UpdateSitesOut result = apiInstance.updateSite(siteId, updateSiteDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteManagerApi#updateSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **updateSiteDto** | [**UpdateSitesDto**](UpdateSitesDto.md)| 修改站点请求体。 |

### Return type

[**UpdateSitesOut**](UpdateSitesOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

