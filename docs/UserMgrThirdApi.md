# UserMgrThirdApi

All URIs are relative to *https://localhost/controller/campus/v1/accountservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserThird**](UserMgrThirdApi.md#addUserThird) | **POST** /controller/campus/v1/accountservice/users | 新增用户信息
[**deleteUserThird**](UserMgrThirdApi.md#deleteUserThird) | **POST** /controller/campus/v1/accountservice/users/batch-delete | 删除指定用户
[**getUserThird**](UserMgrThirdApi.md#getUserThird) | **GET** /controller/campus/v1/accountservice/users | 查询内置用户信息
[**updateUserThird**](UserMgrThirdApi.md#updateUserThird) | **PUT** /controller/campus/v1/accountservice/users/{id} | 修改用户信息


<a name="addUserThird"></a>
# **addUserThird**
> AddUserOutputDto addUserThird(body)

新增用户信息

## 典型场景 ##  提供新增用户北向接口。 ## 接口功能 ##  新增用户 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UserMgrThirdApi;


UserMgrThirdApi apiInstance = new UserMgrThirdApi();
AddUserInputDto body = new AddUserInputDto(); // AddUserInputDto | 用户结构。
try {
    AddUserOutputDto result = apiInstance.addUserThird(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMgrThirdApi#addUserThird");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddUserInputDto**](AddUserInputDto.md)| 用户结构。 |

### Return type

[**AddUserOutputDto**](AddUserOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserThird"></a>
# **deleteUserThird**
> DeleteUserOutputDto deleteUserThird(body)

删除指定用户

## 典型场景 ##  提供删除用户北向接口。 ## 接口功能 ##  删除指定的用户 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UserMgrThirdApi;


UserMgrThirdApi apiInstance = new UserMgrThirdApi();
DeleteUserInputDto body = new DeleteUserInputDto(); // DeleteUserInputDto | 删除条件，用户ID。
try {
    DeleteUserOutputDto result = apiInstance.deleteUserThird(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMgrThirdApi#deleteUserThird");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteUserInputDto**](DeleteUserInputDto.md)| 删除条件，用户ID。 |

### Return type

[**DeleteUserOutputDto**](DeleteUserOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserThird"></a>
# **getUserThird**
> DataListDto getUserThird(userGroupId, userName, email, isContainSubGroup, pageIndex, pageSize, sortKey, sortDir)

查询内置用户信息

## 典型场景 ##  提供通过用户组ID、用户帐号等查询内置用户信息。 ## 接口功能 ##  通过用户组ID、用户帐号等查询内置用户信息。 ## 接口约束 ##  该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UserMgrThirdApi;


UserMgrThirdApi apiInstance = new UserMgrThirdApi();
String userGroupId = "51cdcbe3-5e14-492b-ab27-86950b661d19"; // String | 用户组ID。
String userName = "user"; // String | 用户名称，支持模糊查询。
String email = "aaa@huawei.com"; // String | 用户邮箱。
String isContainSubGroup = "false"; // String | 是否包含子用户组。
Integer pageIndex = 1; // Integer | 页面索引。
Integer pageSize = 40; // Integer | 页面大小。
String sortKey = ""; // String | 排序字段，默认是userName。
String sortDir = ""; // String | 升降序字段，支持ASC和DESC，默认是DESC。
try {
    DataListDto result = apiInstance.getUserThird(userGroupId, userName, email, isContainSubGroup, pageIndex, pageSize, sortKey, sortDir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMgrThirdApi#getUserThird");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**| 用户组ID。 | [optional]
 **userName** | **String**| 用户名称，支持模糊查询。 | [optional]
 **email** | **String**| 用户邮箱。 | [optional]
 **isContainSubGroup** | **String**| 是否包含子用户组。 | [optional]
 **pageIndex** | **Integer**| 页面索引。 | [optional]
 **pageSize** | **Integer**| 页面大小。 | [optional]
 **sortKey** | **String**| 排序字段，默认是userName。 | [optional]
 **sortDir** | **String**| 升降序字段，支持ASC和DESC，默认是DESC。 | [optional]

### Return type

[**DataListDto**](DataListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserThird"></a>
# **updateUserThird**
> CommonUserOutputDto updateUserThird(id, body)

修改用户信息

## 典型场景 ##  提供修改用户北向接口。 ## 接口功能 ##  修改指定的用户 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UserMgrThirdApi;


UserMgrThirdApi apiInstance = new UserMgrThirdApi();
String id = "51cdcbe3-5e14-492b-ab27-86950b661d19"; // String | 用户ID。
UserCommonInfo body = new UserCommonInfo(); // UserCommonInfo | 用户信息。
try {
    CommonUserOutputDto result = apiInstance.updateUserThird(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMgrThirdApi#updateUserThird");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 用户ID。 |
 **body** | [**UserCommonInfo**](UserCommonInfo.md)| 用户信息。 |

### Return type

[**CommonUserOutputDto**](CommonUserOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

