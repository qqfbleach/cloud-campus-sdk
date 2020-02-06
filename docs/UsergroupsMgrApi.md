# UsergroupsMgrApi

All URIs are relative to *https://localhost/controller/campus/v1/accountservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsergroup**](UsergroupsMgrApi.md#addUsergroup) | **POST** /controller/campus/v1/accountservice/usergroups | 新增用户组
[**delUsergroups**](UsergroupsMgrApi.md#delUsergroups) | **DELETE** /controller/campus/v1/accountservice/usergroups/{id} | 删除用户组
[**getUsergroups**](UsergroupsMgrApi.md#getUsergroups) | **GET** /controller/campus/v1/accountservice/usergroups | 查询用户组
[**updateUsergroup**](UsergroupsMgrApi.md#updateUsergroup) | **PUT** /controller/campus/v1/accountservice/usergroups/{id} | 修改用户组


<a name="addUsergroup"></a>
# **addUsergroup**
> AddUsergroupOutputDto addUsergroup(body)

新增用户组

## 典型场景 ##  提供新增用户组北向接口。 ## 接口功能 ##  新增用户组 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UsergroupsMgrApi;


UsergroupsMgrApi apiInstance = new UsergroupsMgrApi();
AddUsergroupInputDto body = new AddUsergroupInputDto(); // AddUsergroupInputDto | 用户组结构。
try {
    AddUsergroupOutputDto result = apiInstance.addUsergroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsMgrApi#addUsergroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddUsergroupInputDto**](AddUsergroupInputDto.md)| 用户组结构。 |

### Return type

[**AddUsergroupOutputDto**](AddUsergroupOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delUsergroups"></a>
# **delUsergroups**
> DeleteUsergroupOutputDto delUsergroups(id)

删除用户组

## 典型场景 ##  提供删除用户组北向接口。 ## 接口功能 ##  删除指定的用户组 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UsergroupsMgrApi;


UsergroupsMgrApi apiInstance = new UsergroupsMgrApi();
String id = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | 用户组ID，UUID格式。
try {
    DeleteUsergroupOutputDto result = apiInstance.delUsergroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsMgrApi#delUsergroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 用户组ID，UUID格式。 |

### Return type

[**DeleteUsergroupOutputDto**](DeleteUsergroupOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsergroups"></a>
# **getUsergroups**
> GetUsergroupsOutputDto getUsergroups(userGroupId, userGroupName, isContainSubGroup, pageIndex, pageSize, sort)

查询用户组

## 典型场景 ##  提供查询用户组北向接口。 ## 接口功能 ##  查询用户组 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UsergroupsMgrApi;


UsergroupsMgrApi apiInstance = new UsergroupsMgrApi();
String userGroupId = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | 用户组ID，UUID格式。
String userGroupName = "user"; // String | 用户组名，支持模糊查询。
Boolean isContainSubGroup = false; // Boolean | 是否包含子用户组，该变量需要和userGroupId一起使用，主要用于查询指定用户组下子部门（只包含当前指定用户组下一层子用户组，更下层的不包含）。
Integer pageIndex = 1; // Integer | 页面索引。
Integer pageSize = 40; // Integer | 页面大小。
String sort = "userGroupName"; // String | 排序字段仅支持‘userGroupName’ +表示升序，-表示降序，默认用升序。
try {
    GetUsergroupsOutputDto result = apiInstance.getUsergroups(userGroupId, userGroupName, isContainSubGroup, pageIndex, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsMgrApi#getUsergroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**| 用户组ID，UUID格式。 | [optional]
 **userGroupName** | **String**| 用户组名，支持模糊查询。 | [optional]
 **isContainSubGroup** | **Boolean**| 是否包含子用户组，该变量需要和userGroupId一起使用，主要用于查询指定用户组下子部门（只包含当前指定用户组下一层子用户组，更下层的不包含）。 | [optional]
 **pageIndex** | **Integer**| 页面索引。 | [optional]
 **pageSize** | **Integer**| 页面大小。 | [optional]
 **sort** | **String**| 排序字段仅支持‘userGroupName’ +表示升序，-表示降序，默认用升序。 | [optional]

### Return type

[**GetUsergroupsOutputDto**](GetUsergroupsOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsergroup"></a>
# **updateUsergroup**
> CommonUsergroupOutputDto updateUsergroup(id, body)

修改用户组

## 典型场景 ##  提供修改用户组北向接口。 ## 接口功能 ##  修改指定的用户组 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UsergroupsMgrApi;


UsergroupsMgrApi apiInstance = new UsergroupsMgrApi();
String id = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | 用户组ID，UUID格式。
UpdateUsergroupInputDto body = new UpdateUsergroupInputDto(); // UpdateUsergroupInputDto | 用户组结构。
try {
    CommonUsergroupOutputDto result = apiInstance.updateUsergroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsMgrApi#updateUsergroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 用户组ID，UUID格式。 |
 **body** | [**UpdateUsergroupInputDto**](UpdateUsergroupInputDto.md)| 用户组结构。 |

### Return type

[**CommonUsergroupOutputDto**](CommonUsergroupOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

