# NetWorkServiceLocalUserApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocaluserInfo**](NetWorkServiceLocalUserApi.md#createLocaluserInfo) | **POST** /controller/campus/v1/networkservice/networkconfig/net/localuser/sites/{siteId}/users | 创建本地用户
[**createTemplateLocaluserInfo**](NetWorkServiceLocalUserApi.md#createTemplateLocaluserInfo) | **POST** /controller/campus/v1/networkservice/networkconfig/net/localuser/site-templates/{siteTemplateId}/users | 创建站点模板的本地用户
[**deleteLocaluserInfo**](NetWorkServiceLocalUserApi.md#deleteLocaluserInfo) | **DELETE** /controller/campus/v1/networkservice/networkconfig/net/localuser/sites/{siteId}/users/{username} | 删除本地用户
[**deleteTemplateLocaluserInfo**](NetWorkServiceLocalUserApi.md#deleteTemplateLocaluserInfo) | **DELETE** /controller/campus/v1/networkservice/networkconfig/net/localuser/site-templates/{siteTemplateId}/users/{username} | 删除本地用户
[**getLocaluserInfo**](NetWorkServiceLocalUserApi.md#getLocaluserInfo) | **GET** /controller/campus/v1/networkservice/networkconfig/net/localuser/sites/{siteId}/users | 查询本地用户
[**getTemplateLocaluserInfo**](NetWorkServiceLocalUserApi.md#getTemplateLocaluserInfo) | **GET** /controller/campus/v1/networkservice/networkconfig/net/localuser/site-templates/{siteTemplateId}/users | 查询站点模板的本地用户
[**initLoginuserInfo**](NetWorkServiceLocalUserApi.md#initLoginuserInfo) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/localuser/users/admin | 配置租户下设备admin账号的默认密码
[**updateLocaluserInfo**](NetWorkServiceLocalUserApi.md#updateLocaluserInfo) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/localuser/sites/{siteId}/users/{username} | 修改本地用户
[**updateTemplateLocaluserInfo**](NetWorkServiceLocalUserApi.md#updateTemplateLocaluserInfo) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/localuser/site-templates/{siteTemplateId}/users/{username} | 修改站点模板的本地用户


<a name="createLocaluserInfo"></a>
# **createLocaluserInfo**
> CreateLocalUserInfoResponse createLocaluserInfo(siteId, body)

创建本地用户

## 典型场景 ##    提供创建配置参数的接口，创建本地用户接口。 ## 接口功能 ##    提供创建配置参数的接口，创建本地用户密码，接入方式（包括monitor和manager设备本地用户）等。 ## 接口约束 ##    该接口功能基于站点发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteId = new UUID(); // UUID | 站点ID。
CreateLocalUserInfoRequst body = new CreateLocalUserInfoRequst(); // CreateLocalUserInfoRequst | 本地用户信息。
try {
    CreateLocalUserInfoResponse result = apiInstance.createLocaluserInfo(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#createLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**CreateLocalUserInfoRequst**](CreateLocalUserInfoRequst.md)| 本地用户信息。 |

### Return type

[**CreateLocalUserInfoResponse**](CreateLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplateLocaluserInfo"></a>
# **createTemplateLocaluserInfo**
> CreateLocalUserInfoResponse createTemplateLocaluserInfo(siteTemplateId, body)

创建站点模板的本地用户

## 典型场景 ##    提供创建配置参数的接口，创建站点模板的本地用户接口。 ## 接口功能 ##    提供创建配置参数的接口，创建站点模板的本地用户密码，接入方式（包括monitor和manager设备本地用户）等。 ## 接口约束 ##    该接口功能基于站点发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteTemplateId = new UUID(); // UUID | 站点模板ID。
CreateLocalUserInfoRequst body = new CreateLocalUserInfoRequst(); // CreateLocalUserInfoRequst | 本地用户信息。
try {
    CreateLocalUserInfoResponse result = apiInstance.createTemplateLocaluserInfo(siteTemplateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#createTemplateLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **UUID**| 站点模板ID。 |
 **body** | [**CreateLocalUserInfoRequst**](CreateLocalUserInfoRequst.md)| 本地用户信息。 |

### Return type

[**CreateLocalUserInfoResponse**](CreateLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocaluserInfo"></a>
# **deleteLocaluserInfo**
> DeleteLocalUserInfoResponse deleteLocaluserInfo(siteId, username)

删除本地用户

## 典型场景 ##    提供删除配置参数的接口，删除本地用户接口。 ## 接口功能 ##    提供删除配置参数的接口，删除本地用户。 ## 接口约束 ##    该接口基于站点发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String username = "test"; // String | 本地用户名，在URL中拼接用户名时，要对特殊字符转义。
try {
    DeleteLocalUserInfoResponse result = apiInstance.deleteLocaluserInfo(siteId, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#deleteLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **username** | **String**| 本地用户名，在URL中拼接用户名时，要对特殊字符转义。 |

### Return type

[**DeleteLocalUserInfoResponse**](DeleteLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplateLocaluserInfo"></a>
# **deleteTemplateLocaluserInfo**
> DeleteLocalUserInfoResponse deleteTemplateLocaluserInfo(siteTemplateId, username)

删除本地用户

## 典型场景 ##    提供删除配置参数的接口，删除本地用户接口。 ## 接口功能 ##    提供删除配置参数的接口，删除本地用户。 ## 接口约束 ##    该接口基于站点发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteTemplateId = new UUID(); // UUID | 站点模板ID。
String username = "test"; // String | 本地用户名，在URL中拼接用户名时，要对特殊字符转义。
try {
    DeleteLocalUserInfoResponse result = apiInstance.deleteTemplateLocaluserInfo(siteTemplateId, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#deleteTemplateLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **UUID**| 站点模板ID。 |
 **username** | **String**| 本地用户名，在URL中拼接用户名时，要对特殊字符转义。 |

### Return type

[**DeleteLocalUserInfoResponse**](DeleteLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocaluserInfo"></a>
# **getLocaluserInfo**
> GetLocalUserInfosResponse getLocaluserInfo(siteId)

查询本地用户

## 典型场景 ##    提供查询配置参数的接口，查询本地用户接口。 ## 接口功能 ##    提供查询配置参数的接口，查询本地用户接口(包括monitor和manager设备本地用户)。 ## 接口约束 ##    该接口基于站点。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    GetLocalUserInfosResponse result = apiInstance.getLocaluserInfo(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#getLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**GetLocalUserInfosResponse**](GetLocalUserInfosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateLocaluserInfo"></a>
# **getTemplateLocaluserInfo**
> GetLocalUserInfosResponse getTemplateLocaluserInfo(siteTemplateId)

查询站点模板的本地用户

## 典型场景 ##    提供查询配置参数的接口，查询站点模板的本地用户接口。 ## 接口功能 ##    提供查询配置参数的接口，查询站点模板的本地用户接口(包括monitor和manager设备本地用户)。 ## 接口约束 ##    该接口基于站点。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteTemplateId = new UUID(); // UUID | 站点模板ID。
try {
    GetLocalUserInfosResponse result = apiInstance.getTemplateLocaluserInfo(siteTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#getTemplateLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **UUID**| 站点模板ID。 |

### Return type

[**GetLocalUserInfosResponse**](GetLocalUserInfosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initLoginuserInfo"></a>
# **initLoginuserInfo**
> InitLocalUserInfoResponse initLoginuserInfo(body)

配置租户下设备admin账号的默认密码

## 典型场景 ##    提供配置租户下设备admin账号的默认密码的接口。 ## 接口功能 ##    提供配置租户下设备admin账号的默认密码的接口。 ## 接口约束 ##    该接口基于租户发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
InitLocalUserInfoRequst body = new InitLocalUserInfoRequst(); // InitLocalUserInfoRequst | 租户下设备admin账号的默认密码配置信息。
try {
    InitLocalUserInfoResponse result = apiInstance.initLoginuserInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#initLoginuserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InitLocalUserInfoRequst**](InitLocalUserInfoRequst.md)| 租户下设备admin账号的默认密码配置信息。 |

### Return type

[**InitLocalUserInfoResponse**](InitLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocaluserInfo"></a>
# **updateLocaluserInfo**
> UpdateLocalUserInfoResponse updateLocaluserInfo(siteId, username, body)

修改本地用户

## 典型场景 ##    提供修改配置参数的接口，修改本地用户接口。 ## 接口功能 ##    提供修改配置参数的接口，修改本地用户密码，接入方式（包括monitor和manager设备本地用户）等。 ## 接口约束 ##    该接口基于租户发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String username = "test"; // String | 本地用户名，在URL中拼接用户名时，要对特殊字符转义。
UpdateLocalUserInfoRequst body = new UpdateLocalUserInfoRequst(); // UpdateLocalUserInfoRequst | 本地用户配置信息。
try {
    UpdateLocalUserInfoResponse result = apiInstance.updateLocaluserInfo(siteId, username, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#updateLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **username** | **String**| 本地用户名，在URL中拼接用户名时，要对特殊字符转义。 |
 **body** | [**UpdateLocalUserInfoRequst**](UpdateLocalUserInfoRequst.md)| 本地用户配置信息。 |

### Return type

[**UpdateLocalUserInfoResponse**](UpdateLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplateLocaluserInfo"></a>
# **updateTemplateLocaluserInfo**
> UpdateLocalUserInfoResponse updateTemplateLocaluserInfo(siteTemplateId, username, body)

修改站点模板的本地用户

## 典型场景 ##    提供修改配置参数的接口，修改站点模板的本地用户接口。 ## 接口功能 ##    提供修改配置参数的接口，修改站点模板的本地用户密码，接入方式（包括monitor和manager设备本地用户）等。 ## 接口约束 ##    该接口基于租户发布和管理。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceLocalUserApi;


NetWorkServiceLocalUserApi apiInstance = new NetWorkServiceLocalUserApi();
UUID siteTemplateId = new UUID(); // UUID | 站点模板ID。
String username = "test"; // String | 本地用户名，在URL中拼接用户名时，要对特殊字符转义。
UpdateLocalUserInfoRequst body = new UpdateLocalUserInfoRequst(); // UpdateLocalUserInfoRequst | 本地用户配置信息。
try {
    UpdateLocalUserInfoResponse result = apiInstance.updateTemplateLocaluserInfo(siteTemplateId, username, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceLocalUserApi#updateTemplateLocaluserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteTemplateId** | **UUID**| 站点模板ID。 |
 **username** | **String**| 本地用户名，在URL中拼接用户名时，要对特殊字符转义。 |
 **body** | [**UpdateLocalUserInfoRequst**](UpdateLocalUserInfoRequst.md)| 本地用户配置信息。 |

### Return type

[**UpdateLocalUserInfoResponse**](UpdateLocalUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

