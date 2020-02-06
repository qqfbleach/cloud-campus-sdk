# AuthenProfileNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3/networkconfig/openprofile*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenProfile**](AuthenProfileNorthboundApi.md#createAuthenProfile) | **POST** /controller/campus/v3/networkconfig/openprofile/authenprofile | 创建认证模板
[**deleteAuthenProfile**](AuthenProfileNorthboundApi.md#deleteAuthenProfile) | **POST** /controller/campus/v3/networkconfig/openprofile/authenprofile/batch-delete | 删除认证模板
[**getAuthenProfile**](AuthenProfileNorthboundApi.md#getAuthenProfile) | **GET** /controller/campus/v3/networkconfig/openprofile/authenprofile | 查询认证模板
[**getAuthenProfileById**](AuthenProfileNorthboundApi.md#getAuthenProfileById) | **GET** /controller/campus/v3/networkconfig/openprofile/authenprofile/{id} | 根据ID查询认证模板
[**updateAuthenProfile**](AuthenProfileNorthboundApi.md#updateAuthenProfile) | **PUT** /controller/campus/v3/networkconfig/openprofile/authenprofile/{id} | 更新认证模板


<a name="createAuthenProfile"></a>
# **createAuthenProfile**
> AuthenRespDto createAuthenProfile(authenProfileDto)

创建认证模板

## 典型场景 ##  提供创建认证模板的接口。&lt;br&gt; ## 接口功能 ##  提供创建认证模板的接口。 &lt;br&gt; ## 接口约束 ##  该接口支持租户管理员下北向接口管理访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AuthenProfileNorthboundApi;


AuthenProfileNorthboundApi apiInstance = new AuthenProfileNorthboundApi();
AuthenProfileDto authenProfileDto = new AuthenProfileDto(); // AuthenProfileDto | 创建认证模板北向入参。
try {
    AuthenRespDto result = apiInstance.createAuthenProfile(authenProfileDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenProfileNorthboundApi#createAuthenProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenProfileDto** | [**AuthenProfileDto**](AuthenProfileDto.md)| 创建认证模板北向入参。 |

### Return type

[**AuthenRespDto**](AuthenRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthenProfile"></a>
# **deleteAuthenProfile**
> AuthenProfileDeleteRespDto deleteAuthenProfile(authenProfileDeleteDto)

删除认证模板

## 典型场景 ##  提供批量删除认证模板的接口。&lt;br&gt; ## 接口功能 ##  提供批量删除认证模板的接口。 &lt;br&gt; ## 接口约束 ##  该接口支持租户管理员下北向接口管理访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AuthenProfileNorthboundApi;


AuthenProfileNorthboundApi apiInstance = new AuthenProfileNorthboundApi();
AuthenProfileDeleteDto authenProfileDeleteDto = new AuthenProfileDeleteDto(); // AuthenProfileDeleteDto | 删除认证模板北向入参。
try {
    AuthenProfileDeleteRespDto result = apiInstance.deleteAuthenProfile(authenProfileDeleteDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenProfileNorthboundApi#deleteAuthenProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenProfileDeleteDto** | [**AuthenProfileDeleteDto**](AuthenProfileDeleteDto.md)| 删除认证模板北向入参。 |

### Return type

[**AuthenProfileDeleteRespDto**](AuthenProfileDeleteRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthenProfile"></a>
# **getAuthenProfile**
> AuthenProfileQueryResultDto getAuthenProfile(pageNum, pageSize, queryValue)

查询认证模板

## 典型场景 ##  提供查询认证模板的接口。&lt;br&gt; ## 接口功能 ##  提供查询认证模板的接口。 &lt;br&gt; ## 接口约束 ##  该接口支持租户管理员下北向接口管理访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AuthenProfileNorthboundApi;


AuthenProfileNorthboundApi apiInstance = new AuthenProfileNorthboundApi();
Integer pageNum = 56; // Integer | 页码。
Integer pageSize = 56; // Integer | 分页尺寸。
String queryValue = "queryValue_example"; // String | 认证模板名称模糊查询，支持精确和模糊匹配，不支持正则。
try {
    AuthenProfileQueryResultDto result = apiInstance.getAuthenProfile(pageNum, pageSize, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenProfileNorthboundApi#getAuthenProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| 页码。 | [optional]
 **pageSize** | **Integer**| 分页尺寸。 | [optional]
 **queryValue** | **String**| 认证模板名称模糊查询，支持精确和模糊匹配，不支持正则。 | [optional]

### Return type

[**AuthenProfileQueryResultDto**](AuthenProfileQueryResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthenProfileById"></a>
# **getAuthenProfileById**
> AuthenRespDto getAuthenProfileById(id)

根据ID查询认证模板

## 典型场景 ##  提供根据ID查询认证模板的接口。&lt;br&gt; ## 接口功能 ##  提供根据ID查询认证模板的接口。 &lt;br&gt; ## 接口约束 ##  该接口支持租户管理员下北向接口管理访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AuthenProfileNorthboundApi;


AuthenProfileNorthboundApi apiInstance = new AuthenProfileNorthboundApi();
String id = "fbb684c8-0d37-496f-bafa-4b06db151e2e"; // String | 认证模板ID。
try {
    AuthenRespDto result = apiInstance.getAuthenProfileById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenProfileNorthboundApi#getAuthenProfileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 认证模板ID。 |

### Return type

[**AuthenRespDto**](AuthenRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuthenProfile"></a>
# **updateAuthenProfile**
> AuthenRespDto updateAuthenProfile(id, authenProfileDto)

更新认证模板

## 典型场景 ##  提供更新认证模板的接口。&lt;br&gt; ## 接口功能 ##  提供更新认证模板的接口。 &lt;br&gt; ## 接口约束 ##  该接口支持租户管理员下北向接口管理访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AuthenProfileNorthboundApi;


AuthenProfileNorthboundApi apiInstance = new AuthenProfileNorthboundApi();
String id = "fbb684c8-0d37-496f-bafa-4b06db151e2e"; // String | 认证模板ID。
AuthenProfileDto authenProfileDto = new AuthenProfileDto(); // AuthenProfileDto | 更新认证模板北向入参。
try {
    AuthenRespDto result = apiInstance.updateAuthenProfile(id, authenProfileDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenProfileNorthboundApi#updateAuthenProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 认证模板ID。 |
 **authenProfileDto** | [**AuthenProfileDto**](AuthenProfileDto.md)| 更新认证模板北向入参。 |

### Return type

[**AuthenRespDto**](AuthenRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

