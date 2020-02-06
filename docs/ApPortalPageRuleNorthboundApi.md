# ApPortalPageRuleNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPortalPageRule**](ApPortalPageRuleNorthboundApi.md#addPortalPageRule) | **POST** /controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule | 创建页面推送策略
[**deletePortalPageRule**](ApPortalPageRuleNorthboundApi.md#deletePortalPageRule) | **DELETE** /controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule | 删除页面推送策略
[**getPortalPageRule**](ApPortalPageRuleNorthboundApi.md#getPortalPageRule) | **GET** /controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule | 查询页面推送策略
[**updatePortalPageRule**](ApPortalPageRuleNorthboundApi.md#updatePortalPageRule) | **PUT** /controller/campus/v3/networkconfig/site/{siteId}/apportalpagerule/{id} | 修改页面推送策略


<a name="addPortalPageRule"></a>
# **addPortalPageRule**
> CommonPortalPageRuleOutputDto addPortalPageRule(siteId, body)

创建页面推送策略

## 典型场景 ##  创建AP portal页面推送策略。 ## 接口功能 ##  创建AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApPortalPageRuleNorthboundApi;


ApPortalPageRuleNorthboundApi apiInstance = new ApPortalPageRuleNorthboundApi();
String siteId = "2eab8922-a37d-43b2-9788-33caade63b3d"; // String | 站点ID。
AddPortalPageRuleInputDto body = new AddPortalPageRuleInputDto(); // AddPortalPageRuleInputDto | 策略结构。
try {
    CommonPortalPageRuleOutputDto result = apiInstance.addPortalPageRule(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApPortalPageRuleNorthboundApi#addPortalPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **body** | [**AddPortalPageRuleInputDto**](AddPortalPageRuleInputDto.md)| 策略结构。 |

### Return type

[**CommonPortalPageRuleOutputDto**](CommonPortalPageRuleOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortalPageRule"></a>
# **deletePortalPageRule**
> DeletePortalPageRuleOutputDto deletePortalPageRule(siteId, body)

删除页面推送策略

## 典型场景 ##  删除AP portal页面推送策略。 ## 接口功能 ##  删除AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApPortalPageRuleNorthboundApi;


ApPortalPageRuleNorthboundApi apiInstance = new ApPortalPageRuleNorthboundApi();
String siteId = "2eab8922-a37d-43b2-9788-33caade63b3d"; // String | 站点ID。
DeletePortalPageRuleInputDto body = new DeletePortalPageRuleInputDto(); // DeletePortalPageRuleInputDto | 策略结构。
try {
    DeletePortalPageRuleOutputDto result = apiInstance.deletePortalPageRule(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApPortalPageRuleNorthboundApi#deletePortalPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **body** | [**DeletePortalPageRuleInputDto**](DeletePortalPageRuleInputDto.md)| 策略结构。 |

### Return type

[**DeletePortalPageRuleOutputDto**](DeletePortalPageRuleOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortalPageRule"></a>
# **getPortalPageRule**
> GetPortalPageRuleOutputDto getPortalPageRule(siteId)

查询页面推送策略

## 典型场景 ##  查询AP portal页面推送策略。 ## 接口功能 ##  查询AP portal页面推送策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApPortalPageRuleNorthboundApi;


ApPortalPageRuleNorthboundApi apiInstance = new ApPortalPageRuleNorthboundApi();
String siteId = "2eab8922-a37d-43b2-9788-33caade63b3d"; // String | 站点ID。
try {
    GetPortalPageRuleOutputDto result = apiInstance.getPortalPageRule(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApPortalPageRuleNorthboundApi#getPortalPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |

### Return type

[**GetPortalPageRuleOutputDto**](GetPortalPageRuleOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortalPageRule"></a>
# **updatePortalPageRule**
> CommonPortalPageRuleOutputDto updatePortalPageRule(siteId, id, body)

修改页面推送策略

## 典型场景 ##  修改页面推送策略北向接口。 ## 接口功能 ##  修改页面推送策略 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApPortalPageRuleNorthboundApi;


ApPortalPageRuleNorthboundApi apiInstance = new ApPortalPageRuleNorthboundApi();
String siteId = "2eab8922-a37d-43b2-9788-33caade63b3d"; // String | 站点ID。
String id = "2eab8922a37d43b2978833caade63b5a"; // String | 策略ID，格式为UUID。
UpdatePortalPageRuleInputDto body = new UpdatePortalPageRuleInputDto(); // UpdatePortalPageRuleInputDto | 策略结构。
try {
    CommonPortalPageRuleOutputDto result = apiInstance.updatePortalPageRule(siteId, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApPortalPageRuleNorthboundApi#updatePortalPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID。 |
 **id** | **String**| 策略ID，格式为UUID。 |
 **body** | [**UpdatePortalPageRuleInputDto**](UpdatePortalPageRuleInputDto.md)| 策略结构。 |

### Return type

[**CommonPortalPageRuleOutputDto**](CommonPortalPageRuleOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

