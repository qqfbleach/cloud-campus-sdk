# NetWorkServiceTacacsApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTacacsConfig**](NetWorkServiceTacacsApi.md#getTacacsConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/tacacs/sites/{siteId}/tacacs | 查询TACACS信息
[**updateTacacsConfig**](NetWorkServiceTacacsApi.md#updateTacacsConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/tacacs/sites/{siteId}/tacacs | 修改TACACS信息


<a name="getTacacsConfig"></a>
# **getTacacsConfig**
> GetTacacsConfigResponse getTacacsConfig(siteId)

查询TACACS信息

## 典型场景 ##    TACACS查询接口，查询TACACS配置。 ## 接口功能 ##    获取TACACS配置（包含TACACS模板对应的配置信息和逃生策略）。 ## 接口约束 ##    该接口操作范围仅限当前租户下的指定站点。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceTacacsApi;


NetWorkServiceTacacsApi apiInstance = new NetWorkServiceTacacsApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    GetTacacsConfigResponse result = apiInstance.getTacacsConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceTacacsApi#getTacacsConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**GetTacacsConfigResponse**](GetTacacsConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTacacsConfig"></a>
# **updateTacacsConfig**
> EditTacacsConfigResponse updateTacacsConfig(siteId, body)

修改TACACS信息

## 典型场景 ##    修改TACACS接口。 ## 接口功能 ##    进行TACACS修改（包含TACACS模板对应的配置信息和逃生策略）。 ## 接口约束 ##    该接口操作范围仅限当前租户下的指定站点。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceTacacsApi;


NetWorkServiceTacacsApi apiInstance = new NetWorkServiceTacacsApi();
UUID siteId = new UUID(); // UUID | 站点ID。
TacacsServerInfo body = new TacacsServerInfo(); // TacacsServerInfo | 配置参数。
try {
    EditTacacsConfigResponse result = apiInstance.updateTacacsConfig(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceTacacsApi#updateTacacsConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**TacacsServerInfo**](TacacsServerInfo.md)| 配置参数。 |

### Return type

[**EditTacacsConfigResponse**](EditTacacsConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

