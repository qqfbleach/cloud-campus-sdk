# NetWorkServiceTacacsTmplApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/profile*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTacacsTmpl**](NetWorkServiceTacacsTmplApi.md#createTacacsTmpl) | **POST** /controller/campus/v1/networkservice/networkconfig/profile/tacacs/ | 创建TACACS模板
[**deleteTacacsTmpl**](NetWorkServiceTacacsTmplApi.md#deleteTacacsTmpl) | **POST** /controller/campus/v1/networkservice/networkconfig/profile/tacacs/batch-delete | 删除TACACS模板
[**editTacacsTmpl**](NetWorkServiceTacacsTmplApi.md#editTacacsTmpl) | **PUT** /controller/campus/v1/networkservice/networkconfig/profile/tacacs/{id} | 修改TACACS模板
[**getTacacsTmpl**](NetWorkServiceTacacsTmplApi.md#getTacacsTmpl) | **GET** /controller/campus/v1/networkservice/networkconfig/profile/tacacs/ | 查询TACACS模板


<a name="createTacacsTmpl"></a>
# **createTacacsTmpl**
> CreateTacacsTmplResponse createTacacsTmpl(body)

创建TACACS模板

## 典型场景 ##    创建Tacacs模板。 ## 接口功能 ##   Tacacs模板创建接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceTacacsTmplApi;


NetWorkServiceTacacsTmplApi apiInstance = new NetWorkServiceTacacsTmplApi();
CreateTacacsTmplInfoDto body = new CreateTacacsTmplInfoDto(); // CreateTacacsTmplInfoDto | tacacs服务器模板信息。
try {
    CreateTacacsTmplResponse result = apiInstance.createTacacsTmpl(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceTacacsTmplApi#createTacacsTmpl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTacacsTmplInfoDto**](CreateTacacsTmplInfoDto.md)| tacacs服务器模板信息。 |

### Return type

[**CreateTacacsTmplResponse**](CreateTacacsTmplResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTacacsTmpl"></a>
# **deleteTacacsTmpl**
> DeleteTacacsTmplResponses deleteTacacsTmpl(body)

删除TACACS模板

## 典型场景 ##    删除配置模板列表信息。 ## 接口功能 ##   Tacacs模板删除接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；如果模板被引用不可删除。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceTacacsTmplApi;


NetWorkServiceTacacsTmplApi apiInstance = new NetWorkServiceTacacsTmplApi();
DeleteTacacsTmplReuest body = new DeleteTacacsTmplReuest(); // DeleteTacacsTmplReuest | tacacs服务器模板id列表。
try {
    DeleteTacacsTmplResponses result = apiInstance.deleteTacacsTmpl(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceTacacsTmplApi#deleteTacacsTmpl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTacacsTmplReuest**](DeleteTacacsTmplReuest.md)| tacacs服务器模板id列表。 |

### Return type

[**DeleteTacacsTmplResponses**](DeleteTacacsTmplResponses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editTacacsTmpl"></a>
# **editTacacsTmpl**
> EditTacacsTmplResponse editTacacsTmpl(id, body)

修改TACACS模板

## 典型场景 ##    修改Tacacs模板。 ## 接口功能 ##   Tacacs模板修改接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceTacacsTmplApi;


NetWorkServiceTacacsTmplApi apiInstance = new NetWorkServiceTacacsTmplApi();
UUID id = new UUID(); // UUID | tacacs服务器模板Id。
UpdateTacacsTmplInfoDto body = new UpdateTacacsTmplInfoDto(); // UpdateTacacsTmplInfoDto | tacacs服务器模板body。
try {
    EditTacacsTmplResponse result = apiInstance.editTacacsTmpl(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceTacacsTmplApi#editTacacsTmpl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| tacacs服务器模板Id。 |
 **body** | [**UpdateTacacsTmplInfoDto**](UpdateTacacsTmplInfoDto.md)| tacacs服务器模板body。 |

### Return type

[**EditTacacsTmplResponse**](EditTacacsTmplResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTacacsTmpl"></a>
# **getTacacsTmpl**
> GetTacacsTmplResponse getTacacsTmpl()

查询TACACS模板

## 典型场景 ##    查询配置模板列表信息。 ## 接口功能 ##   Tacacs模板查询接口（包含Tacacs模板对应的名称、描述、认证服务器地址、端口等）。 ## 接口约束 ##    该接口基于租户下；优先配置主服务器地址/端口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NetWorkServiceTacacsTmplApi;


NetWorkServiceTacacsTmplApi apiInstance = new NetWorkServiceTacacsTmplApi();
try {
    GetTacacsTmplResponse result = apiInstance.getTacacsTmpl();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetWorkServiceTacacsTmplApi#getTacacsTmpl");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTacacsTmplResponse**](GetTacacsTmplResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

