# MacAccountApi

All URIs are relative to *https://localhost/controller/campus/v1/accountservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMacAccount**](MacAccountApi.md#createMacAccount) | **POST** /controller/campus/v1/accountservice/mac | 创建mac账号
[**deleteMacAccount**](MacAccountApi.md#deleteMacAccount) | **POST** /controller/campus/v1/accountservice/mac/action/batch-delete | 删除mac帐号
[**getMacAccountList**](MacAccountApi.md#getMacAccountList) | **GET** /controller/campus/v1/accountservice/mac | 查询mac帐号
[**updateMacAccount**](MacAccountApi.md#updateMacAccount) | **PUT** /controller/campus/v1/accountservice/mac/{id} | 修改mac帐号


<a name="createMacAccount"></a>
# **createMacAccount**
> DataMacDto createMacAccount(body)

创建mac账号

## 典型场景 ##    创建mac帐号。 ## 接口功能 ##    创建mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.MacAccountApi;


MacAccountApi apiInstance = new MacAccountApi();
MacInputDto body = new MacInputDto(); // MacInputDto | mac账号信息。
try {
    DataMacDto result = apiInstance.createMacAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MacAccountApi#createMacAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MacInputDto**](MacInputDto.md)| mac账号信息。 |

### Return type

[**DataMacDto**](DataMacDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMacAccount"></a>
# **deleteMacAccount**
> DeleteMacsOutput deleteMacAccount(body)

删除mac帐号

## 典型场景 ##    删除mac帐号。 ## 接口功能 ##    批量删除mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.MacAccountApi;


MacAccountApi apiInstance = new MacAccountApi();
Ids body = new Ids(); // Ids | 待删除的mac帐号列表。
try {
    DeleteMacsOutput result = apiInstance.deleteMacAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MacAccountApi#deleteMacAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Ids**](Ids.md)| 待删除的mac帐号列表。 |

### Return type

[**DeleteMacsOutput**](DeleteMacsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMacAccountList"></a>
# **getMacAccountList**
> MacDataList getMacAccountList(pageIndex, pageSize, searchName, id)

查询mac帐号

## 典型场景 ##    查询mac帐号。 ## 接口功能 ##    查询mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、pageSize默认按照1000进行分页。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.MacAccountApi;


MacAccountApi apiInstance = new MacAccountApi();
Integer pageIndex = 1; // Integer | 页面索引。
Integer pageSize = 20; // Integer | 页面大小。
String searchName = "mac"; // String | 名称搜索关键词。该字段支持模糊查询。
String id = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | mac帐号ID，UUID格式。
try {
    MacDataList result = apiInstance.getMacAccountList(pageIndex, pageSize, searchName, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MacAccountApi#getMacAccountList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIndex** | **Integer**| 页面索引。 | [optional]
 **pageSize** | **Integer**| 页面大小。 | [optional]
 **searchName** | **String**| 名称搜索关键词。该字段支持模糊查询。 | [optional]
 **id** | **String**| mac帐号ID，UUID格式。 | [optional]

### Return type

[**MacDataList**](MacDataList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMacAccount"></a>
# **updateMacAccount**
> DataMacDto updateMacAccount(id, body)

修改mac帐号

## 典型场景 ##    修改mac帐号。 ## 接口功能 ##    修改mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、该接口为全量修改接口，按照最新的入参进行全量覆盖。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.MacAccountApi;


MacAccountApi apiInstance = new MacAccountApi();
String id = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | mac帐号ID，UUID格式。
MacInputDto body = new MacInputDto(); // MacInputDto | 修改mac帐号信息。
try {
    DataMacDto result = apiInstance.updateMacAccount(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MacAccountApi#updateMacAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| mac帐号ID，UUID格式。 |
 **body** | [**MacInputDto**](MacInputDto.md)| 修改mac帐号信息。 |

### Return type

[**DataMacDto**](DataMacDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

