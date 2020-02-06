# LSWStpProtectionNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStpProtection**](LSWStpProtectionNorthboundApi.md#createStpProtection) | **POST** /controller/campus/v1/networkservice/networkconfig/net/lswstpprotection/sites/{siteId}/stpprotection | 创建交换机STP保护配置
[**deleteStpProtection**](LSWStpProtectionNorthboundApi.md#deleteStpProtection) | **POST** /controller/campus/v1/networkservice/networkconfig/net/lswstpprotection/sites/{siteId}/stpprotection/batch-delete | 删除交换机STP保护配置
[**getStpProtection**](LSWStpProtectionNorthboundApi.md#getStpProtection) | **GET** /controller/campus/v1/networkservice/networkconfig/net/lswstpprotection/sites/{siteId}/stpprotection | 查询交换机STP保护配置
[**updateStpProtection**](LSWStpProtectionNorthboundApi.md#updateStpProtection) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/lswstpprotection/sites/{siteId}/stpprotection | 修改交换机STP保护配置


<a name="createStpProtection"></a>
# **createStpProtection**
> StpProtectionResponseDto createStpProtection(siteId, body)

创建交换机STP保护配置

## 典型场景 ##    提供配置参数的接口，创建交换机STP保护配置。 ## 接口功能 ##    创建交换机STP保护配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpProtectionNorthboundApi;


LSWStpProtectionNorthboundApi apiInstance = new LSWStpProtectionNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
StpProtectionRequestDto body = new StpProtectionRequestDto(); // StpProtectionRequestDto | 创建交换机STP保护配置信息。
try {
    StpProtectionResponseDto result = apiInstance.createStpProtection(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpProtectionNorthboundApi#createStpProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**StpProtectionRequestDto**](StpProtectionRequestDto.md)| 创建交换机STP保护配置信息。 |

### Return type

[**StpProtectionResponseDto**](StpProtectionResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStpProtection"></a>
# **deleteStpProtection**
> DeleteStpProtectionResponseDto deleteStpProtection(siteId, body)

删除交换机STP保护配置

## 典型场景 ##    提供删除配置参数的接口，删除交换机STP保护配置。 ## 接口功能 ##    删除交换机STP保护配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpProtectionNorthboundApi;


LSWStpProtectionNorthboundApi apiInstance = new LSWStpProtectionNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
DeleteStpProtectionRequestDto body = new DeleteStpProtectionRequestDto(); // DeleteStpProtectionRequestDto | 删除交换机STP保护配置请求参数体。
try {
    DeleteStpProtectionResponseDto result = apiInstance.deleteStpProtection(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpProtectionNorthboundApi#deleteStpProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**DeleteStpProtectionRequestDto**](DeleteStpProtectionRequestDto.md)| 删除交换机STP保护配置请求参数体。 |

### Return type

[**DeleteStpProtectionResponseDto**](DeleteStpProtectionResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStpProtection"></a>
# **getStpProtection**
> GetStpProtectionResponseDto getStpProtection(siteId)

查询交换机STP保护配置

## 典型场景 ##    提供查询配置参数的接口，查询交换机STP保护配置信息。 ## 接口功能 ##    查询交换机STP保护配置信息。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpProtectionNorthboundApi;


LSWStpProtectionNorthboundApi apiInstance = new LSWStpProtectionNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    GetStpProtectionResponseDto result = apiInstance.getStpProtection(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpProtectionNorthboundApi#getStpProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**GetStpProtectionResponseDto**](GetStpProtectionResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStpProtection"></a>
# **updateStpProtection**
> StpProtectionResponseDto updateStpProtection(siteId, body)

修改交换机STP保护配置

## 典型场景 ##    提供配置参数的接口，修改交换机STP保护配置。 ## 接口功能 ##    修改交换机STP保护配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpProtectionNorthboundApi;


LSWStpProtectionNorthboundApi apiInstance = new LSWStpProtectionNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
StpProtectionRequestDto body = new StpProtectionRequestDto(); // StpProtectionRequestDto | 修改交换机STP保护配置参数体。
try {
    StpProtectionResponseDto result = apiInstance.updateStpProtection(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpProtectionNorthboundApi#updateStpProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**StpProtectionRequestDto**](StpProtectionRequestDto.md)| 修改交换机STP保护配置参数体。 |

### Return type

[**StpProtectionResponseDto**](StpProtectionResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

