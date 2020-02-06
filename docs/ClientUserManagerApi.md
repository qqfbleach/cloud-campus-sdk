# ClientUserManagerApi

All URIs are relative to *https://localhost/controller/cloud/v2/northbound/accessuser/haca*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cutUser**](ClientUserManagerApi.md#cutUser) | **POST** /controller/cloud/v2/northbound/accessuser/haca/cutuser | 强制用户下线
[**getAuthorizationresult**](ClientUserManagerApi.md#getAuthorizationresult) | **GET** /controller/cloud/v2/northbound/accessuser/haca/authorizationresult/{psessionid} | 查询授权结果
[**userAuthorization**](ClientUserManagerApi.md#userAuthorization) | **POST** /controller/cloud/v2/northbound/accessuser/haca/authorization | 授权终端用户


<a name="cutUser"></a>
# **cutUser**
> CutUserOutputDto cutUser(body)

强制用户下线

## 典型场景 ##  提供强制用户下线北向接口。 ## 接口功能 ##  强制用户下线 ## 接口约束 ##  该接口支持北向操作管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ClientUserManagerApi;


ClientUserManagerApi apiInstance = new ClientUserManagerApi();
CutUserInputDto body = new CutUserInputDto(); // CutUserInputDto | 用户信息。
try {
    CutUserOutputDto result = apiInstance.cutUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientUserManagerApi#cutUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CutUserInputDto**](CutUserInputDto.md)| 用户信息。 |

### Return type

[**CutUserOutputDto**](CutUserOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthorizationresult"></a>
# **getAuthorizationresult**
> CommonAuthorizationOutputDto getAuthorizationresult(psessionid, nodeIp)

查询授权结果

## 典型场景 ##  提供授权结果查询北向接口。 ## 接口功能 ##  根据授权回话ID，查询授权结果 ## 接口约束 ##  该接口支持北向操作管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ClientUserManagerApi;


ClientUserManagerApi apiInstance = new ClientUserManagerApi();
String psessionid = "5ea660be98a84618fa3d6d03f65f47ab578ba3b4216790186a932f9e8c8c880d"; // String | 会话ID。
String nodeIp = "192.168.211.236"; // String | 授权节点地址。
try {
    CommonAuthorizationOutputDto result = apiInstance.getAuthorizationresult(psessionid, nodeIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientUserManagerApi#getAuthorizationresult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psessionid** | **String**| 会话ID。 |
 **nodeIp** | **String**| 授权节点地址。 |

### Return type

[**CommonAuthorizationOutputDto**](CommonAuthorizationOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userAuthorization"></a>
# **userAuthorization**
> CommonAuthorizationOutputDto userAuthorization(body)

授权终端用户

## 典型场景 ##  用户授权接口。 ## 接口功能 ##  根据认证用户信息，授予用户对应权限。 ## 接口约束 ##  该接口支持北向操作管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ClientUserManagerApi;


ClientUserManagerApi apiInstance = new ClientUserManagerApi();
UserAuthorizationInputDto body = new UserAuthorizationInputDto(); // UserAuthorizationInputDto | 授权信息。
try {
    CommonAuthorizationOutputDto result = apiInstance.userAuthorization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientUserManagerApi#userAuthorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAuthorizationInputDto**](UserAuthorizationInputDto.md)| 授权信息。 |

### Return type

[**CommonAuthorizationOutputDto**](CommonAuthorizationOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

