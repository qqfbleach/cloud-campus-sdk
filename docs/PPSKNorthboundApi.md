# PPSKNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/authconfigservice/accessconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPpskAccount**](PPSKNorthboundApi.md#createPpskAccount) | **POST** /controller/campus/v1/authconfigservice/accessconfig/{siteId}/ppsk | 新增PPSK帐号
[**deletePpskAccount**](PPSKNorthboundApi.md#deletePpskAccount) | **DELETE** /controller/campus/v1/authconfigservice/accessconfig/{siteId}/ppsk/{account} | 删除PPSK帐号
[**getPpskAccount**](PPSKNorthboundApi.md#getPpskAccount) | **GET** /controller/campus/v1/authconfigservice/accessconfig/{siteId}/ppsk | 查询PPSK帐号
[**updatePpskAccount**](PPSKNorthboundApi.md#updatePpskAccount) | **PUT** /controller/campus/v1/authconfigservice/accessconfig/{siteId}/ppsk/{account} | 修改PPSK帐号


<a name="createPpskAccount"></a>
# **createPpskAccount**
> PpskPostOrPutResponseDto createPpskAccount(siteId, body)

新增PPSK帐号

## 典型场景 ##    在一个站点内，一次新增一个PPSK帐号。 ## 接口功能 ##    新增PPSK帐号。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PPSKNorthboundApi;


PPSKNorthboundApi apiInstance = new PPSKNorthboundApi();
String siteId = "fbb684c8-0d37-496f-bafa-4b06d5151e2e"; // String | 站点ID，UUID格式。
PPSKPostRequestDto body = new PPSKPostRequestDto(); // PPSKPostRequestDto | PPSK帐号信息参数体。
try {
    PpskPostOrPutResponseDto result = apiInstance.createPpskAccount(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PPSKNorthboundApi#createPpskAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **body** | [**PPSKPostRequestDto**](PPSKPostRequestDto.md)| PPSK帐号信息参数体。 |

### Return type

[**PpskPostOrPutResponseDto**](PpskPostOrPutResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePpskAccount"></a>
# **deletePpskAccount**
> PpskDeleteResponseDto deletePpskAccount(siteId, account)

删除PPSK帐号

## 典型场景 ##    通过帐号名删除PPSK帐号信息。 ## 接口功能 ##    通过帐号名删除PPSK帐号信息。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PPSKNorthboundApi;


PPSKNorthboundApi apiInstance = new PPSKNorthboundApi();
String siteId = "fbb684c8-0d37-496f-bafa-4b06d5151e2e"; // String | 站点ID，UUID格式。
String account = "PPSK001"; // String | PPSK帐号名称。
try {
    PpskDeleteResponseDto result = apiInstance.deletePpskAccount(siteId, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PPSKNorthboundApi#deletePpskAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **account** | **String**| PPSK帐号名称。 |

### Return type

[**PpskDeleteResponseDto**](PpskDeleteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPpskAccount"></a>
# **getPpskAccount**
> PpskGetResponseDto getPpskAccount(siteId, account, ssidName, vlan, pageIndex, pageSize)

查询PPSK帐号

## 典型场景 ##    通过帐号名、VLAN ID查询PPSK帐号信息。 ## 接口功能 ##    通过帐号名、VLAN ID查询PPSK帐号信息。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PPSKNorthboundApi;


PPSKNorthboundApi apiInstance = new PPSKNorthboundApi();
String siteId = "fbb684c8-0d37-496f-bafa-4b06d5151e2e"; // String | 站点ID，UUID格式。
String account = "PPSK001"; // String | 帐号名称。
String ssidName = "Huawei-Guest"; // String | SSID名称。
Integer vlan = 100; // Integer | 帐号绑定的VLAN。
Integer pageIndex = 1; // Integer | 页面索引。
Integer pageSize = 20; // Integer | 每页显示记录数。
try {
    PpskGetResponseDto result = apiInstance.getPpskAccount(siteId, account, ssidName, vlan, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PPSKNorthboundApi#getPpskAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **account** | **String**| 帐号名称。 | [optional]
 **ssidName** | **String**| SSID名称。 | [optional]
 **vlan** | **Integer**| 帐号绑定的VLAN。 | [optional]
 **pageIndex** | **Integer**| 页面索引。 | [optional]
 **pageSize** | **Integer**| 每页显示记录数。 | [optional]

### Return type

[**PpskGetResponseDto**](PpskGetResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePpskAccount"></a>
# **updatePpskAccount**
> PpskPostOrPutResponseDto updatePpskAccount(siteId, account, body)

修改PPSK帐号

## 典型场景 ##    修改PPSK帐号信息，包括PSK、VLAN ID和帐号描述信息。 ## 接口功能 ##    修改PPSK帐号信息。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PPSKNorthboundApi;


PPSKNorthboundApi apiInstance = new PPSKNorthboundApi();
String siteId = "fbb684c8-0d37-496f-bafa-4b06d5151e2e"; // String | 站点ID，UUID格式。
String account = "PPSK001"; // String | PPSK帐号名称。
PPSKPutRequestDto body = new PPSKPutRequestDto(); // PPSKPutRequestDto | PPSK帐号信息参数体。
try {
    PpskPostOrPutResponseDto result = apiInstance.updatePpskAccount(siteId, account, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PPSKNorthboundApi#updatePpskAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **account** | **String**| PPSK帐号名称。 |
 **body** | [**PPSKPutRequestDto**](PPSKPutRequestDto.md)| PPSK帐号信息参数体。 |

### Return type

[**PpskPostOrPutResponseDto**](PpskPostOrPutResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

