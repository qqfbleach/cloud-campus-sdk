# AclTemplateNBNorthBoundApi

All URIs are relative to *https://localhost/controller/campus/v3/profile/acl*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAclTemplate**](AclTemplateNBNorthBoundApi.md#addAclTemplate) | **POST** /controller/campus/v3/profile/acl/ | 创建ACL模板
[**deleteAclTemplate**](AclTemplateNBNorthBoundApi.md#deleteAclTemplate) | **DELETE** /controller/campus/v3/profile/acl/ | 删除ACL模板
[**getAclTemplate**](AclTemplateNBNorthBoundApi.md#getAclTemplate) | **GET** /controller/campus/v3/profile/acl/ | 查询ACL模板
[**updateAclTemplate**](AclTemplateNBNorthBoundApi.md#updateAclTemplate) | **PUT** /controller/campus/v3/profile/acl/{id} | 更新ACL模板


<a name="addAclTemplate"></a>
# **addAclTemplate**
> UpdateAclRet addAclTemplate(body)

创建ACL模板

## 典型场景 ##  提供创建ACL模板接口。&lt;br&gt; ## 接口功能 ##  创建ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AclTemplateNBNorthBoundApi;


AclTemplateNBNorthBoundApi apiInstance = new AclTemplateNBNorthBoundApi();
AclDtoDetail body = new AclDtoDetail(); // AclDtoDetail | 待创建的ACL模板信息。
try {
    UpdateAclRet result = apiInstance.addAclTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclTemplateNBNorthBoundApi#addAclTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AclDtoDetail**](AclDtoDetail.md)| 待创建的ACL模板信息。 |

### Return type

[**UpdateAclRet**](UpdateAclRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAclTemplate"></a>
# **deleteAclTemplate**
> DeleteAclRet deleteAclTemplate(body)

删除ACL模板

## 典型场景 ##  提供删除ACL模板接口。&lt;br&gt; ## 接口功能 ##  删除ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AclTemplateNBNorthBoundApi;


AclTemplateNBNorthBoundApi apiInstance = new AclTemplateNBNorthBoundApi();
DeleteTemplateDto body = new DeleteTemplateDto(); // DeleteTemplateDto | 待删除的ACL模板标识。
try {
    DeleteAclRet result = apiInstance.deleteAclTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclTemplateNBNorthBoundApi#deleteAclTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTemplateDto**](DeleteTemplateDto.md)| 待删除的ACL模板标识。 |

### Return type

[**DeleteAclRet**](DeleteAclRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAclTemplate"></a>
# **getAclTemplate**
> QueryAclRet getAclTemplate()

查询ACL模板

## 典型场景 ##  提供查询ACL模板接口。&lt;br&gt; ## 接口功能 ##  查询ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AclTemplateNBNorthBoundApi;


AclTemplateNBNorthBoundApi apiInstance = new AclTemplateNBNorthBoundApi();
try {
    QueryAclRet result = apiInstance.getAclTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclTemplateNBNorthBoundApi#getAclTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QueryAclRet**](QueryAclRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAclTemplate"></a>
# **updateAclTemplate**
> UpdateAclRet updateAclTemplate(id, body)

更新ACL模板

## 典型场景 ##  提供更新ACL模板接口。&lt;br&gt; ## 接口功能 ##  更新ACL模板。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AclTemplateNBNorthBoundApi;


AclTemplateNBNorthBoundApi apiInstance = new AclTemplateNBNorthBoundApi();
String id = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 待更新的ACL模板标识。
UpadateAclDto body = new UpadateAclDto(); // UpadateAclDto | 待更新的ACL模板信息。
try {
    UpdateAclRet result = apiInstance.updateAclTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclTemplateNBNorthBoundApi#updateAclTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 待更新的ACL模板标识。 |
 **body** | [**UpadateAclDto**](UpadateAclDto.md)| 待更新的ACL模板信息。 |

### Return type

[**UpdateAclRet**](UpdateAclRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

