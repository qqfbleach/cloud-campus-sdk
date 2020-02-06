# ApSsidNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSiteSsidConfig**](ApSsidNorthboundApi.md#createSiteSsidConfig) | **POST** /controller/campus/v3/networkconfig/site/{siteId}/apssid | 创建指定站点的SSID配置
[**deleteSiteSsidConfig**](ApSsidNorthboundApi.md#deleteSiteSsidConfig) | **DELETE** /controller/campus/v3/networkconfig/site/{siteId}/apssid | 删除指定站点的SSID配置
[**getSiteSsidConfig**](ApSsidNorthboundApi.md#getSiteSsidConfig) | **GET** /controller/campus/v3/networkconfig/site/{siteId}/apssid | 查询指定站点的SSID配置
[**updateSiteSsidConfig**](ApSsidNorthboundApi.md#updateSiteSsidConfig) | **PUT** /controller/campus/v3/networkconfig/site/{siteId}/apssid/{id} | 修改指定站点的SSID配置


<a name="createSiteSsidConfig"></a>
# **createSiteSsidConfig**
> ConfigSsidResponse createSiteSsidConfig(siteId, ssidConfigDto)

创建指定站点的SSID配置

## 典型场景 ##   提供在指定站点，新增AP的SSID配置的接口。&lt;br&gt; ## 接口功能 ##   新增站点内AP的SSID配置。&lt;br&gt; ## 接口约束 ##   该接口租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApSsidNorthboundApi;


ApSsidNorthboundApi apiInstance = new ApSsidNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
SsidConfigDto ssidConfigDto = new SsidConfigDto(); // SsidConfigDto | SSID配置
try {
    ConfigSsidResponse result = apiInstance.createSiteSsidConfig(siteId, ssidConfigDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApSsidNorthboundApi#createSiteSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **ssidConfigDto** | [**SsidConfigDto**](SsidConfigDto.md)| SSID配置 |

### Return type

[**ConfigSsidResponse**](ConfigSsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSiteSsidConfig"></a>
# **deleteSiteSsidConfig**
> DeleteSsidResponse deleteSiteSsidConfig(siteId, id)

删除指定站点的SSID配置

## 典型场景 ##   删除AP的SSID配置的接口。&lt;br&gt; ## 接口功能 ##   删除站点内AP的SSID配置。&lt;br&gt; ## 接口约束 ##   该接口租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApSsidNorthboundApi;


ApSsidNorthboundApi apiInstance = new ApSsidNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
SsidDeleteDto id = new SsidDeleteDto(); // SsidDeleteDto | 待删除的ID。
try {
    DeleteSsidResponse result = apiInstance.deleteSiteSsidConfig(siteId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApSsidNorthboundApi#deleteSiteSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **id** | [**SsidDeleteDto**](SsidDeleteDto.md)| 待删除的ID。 |

### Return type

[**DeleteSsidResponse**](DeleteSsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSiteSsidConfig"></a>
# **getSiteSsidConfig**
> QuerySsidResponse getSiteSsidConfig(siteId)

查询指定站点的SSID配置

## 典型场景 ##   提供siteId查询站点内AP的SSID配置列表。&lt;br&gt; ## 接口功能 ##   查询站点内AP的SSID配置列表。&lt;br&gt; ## 接口约束 ##   该接口租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApSsidNorthboundApi;


ApSsidNorthboundApi apiInstance = new ApSsidNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
try {
    QuerySsidResponse result = apiInstance.getSiteSsidConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApSsidNorthboundApi#getSiteSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |

### Return type

[**QuerySsidResponse**](QuerySsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteSsidConfig"></a>
# **updateSiteSsidConfig**
> ConfigSsidResponse updateSiteSsidConfig(siteId, id, ssidConfigDto)

修改指定站点的SSID配置

## 典型场景 ##   提供在指定站点，修改AP的SSID配置的接口。&lt;br&gt; ## 接口功能 ##   修改站点内AP的SSID配置。&lt;br&gt; ## 接口约束 ##   该接口租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApSsidNorthboundApi;


ApSsidNorthboundApi apiInstance = new ApSsidNorthboundApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
String id = "de5813f8ff1e41f5ba9c324da70b49ed"; // String | SSID标识，创建或查询Response中的ID字段。
SsidConfigDto ssidConfigDto = new SsidConfigDto(); // SsidConfigDto | ssid配置。
try {
    ConfigSsidResponse result = apiInstance.updateSiteSsidConfig(siteId, id, ssidConfigDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApSsidNorthboundApi#updateSiteSsidConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **id** | **String**| SSID标识，创建或查询Response中的ID字段。 |
 **ssidConfigDto** | [**SsidConfigDto**](SsidConfigDto.md)| ssid配置。 |

### Return type

[**ConfigSsidResponse**](ConfigSsidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

