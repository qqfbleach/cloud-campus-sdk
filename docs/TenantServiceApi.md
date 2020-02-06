# TenantServiceApi

All URIs are relative to *https://localhost/controller/campus/v1/baseservice/tenants*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSoftcomTenant**](TenantServiceApi.md#createSoftcomTenant) | **POST** /controller/campus/v1/baseservice/tenants/ | 创建租户
[**deleteSoftcomTenant**](TenantServiceApi.md#deleteSoftcomTenant) | **DELETE** /controller/campus/v1/baseservice/tenants/{tenantId} | 删除租户
[**querySoftcomTenants**](TenantServiceApi.md#querySoftcomTenants) | **GET** /controller/campus/v1/baseservice/tenants/ | 查询租户


<a name="createSoftcomTenant"></a>
# **createSoftcomTenant**
> CreateTenantResponseDto createSoftcomTenant(createTenantDto)

创建租户

## 典型场景 ##  创建租户。 ## 接口功能 ##  创建租户。 ## 接口约束 ##  支持MSP下面的北向管理员访问，该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TenantServiceApi;


TenantServiceApi apiInstance = new TenantServiceApi();
CreateTenantDto createTenantDto = new CreateTenantDto(); // CreateTenantDto | 创建租户基本信息。
try {
    CreateTenantResponseDto result = apiInstance.createSoftcomTenant(createTenantDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantServiceApi#createSoftcomTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTenantDto** | [**CreateTenantDto**](CreateTenantDto.md)| 创建租户基本信息。 |

### Return type

[**CreateTenantResponseDto**](CreateTenantResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSoftcomTenant"></a>
# **deleteSoftcomTenant**
> DeleteResponseDto deleteSoftcomTenant(tenantId)

删除租户

## 典型场景 ##  删除租户。 ## 接口功能 ##  通过租户标识删除租户。 ## 接口约束 ##  支持MSP下面的北向管理员访问，该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TenantServiceApi;


TenantServiceApi apiInstance = new TenantServiceApi();
String tenantId = "00000000-0000-0000-0000-000000000000"; // String | 删除租户ID。
try {
    DeleteResponseDto result = apiInstance.deleteSoftcomTenant(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantServiceApi#deleteSoftcomTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| 删除租户ID。 |

### Return type

[**DeleteResponseDto**](DeleteResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="querySoftcomTenants"></a>
# **querySoftcomTenants**
> TenantListDto querySoftcomTenants(pageIndex, pageSize)

查询租户

## 典型场景 ##  查询租户。 ## 接口功能 ##  提供分页查询租户列表功能。 ## 接口约束 ##  支持MSP下面的北向管理员访问，该接口必须在用户会话建立后使用，推荐使用分页查询，如果没有使用分页查询，可能会由于数据量多导致响应时间较长。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TenantServiceApi;


TenantServiceApi apiInstance = new TenantServiceApi();
Integer pageIndex = 0; // Integer | 分页的序号。
Integer pageSize = 20; // Integer | 分页的大小。
try {
    TenantListDto result = apiInstance.querySoftcomTenants(pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantServiceApi#querySoftcomTenants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIndex** | **Integer**| 分页的序号。 | [optional] [default to 0]
 **pageSize** | **Integer**| 分页的大小。 | [optional]

### Return type

[**TenantListDto**](TenantListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

