# TimeFlowConfigApi

All URIs are relative to *https://localhost/controller/campus/v1/authconfigservice/accessconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTimeFlowConfig**](TimeFlowConfigApi.md#addTimeFlowConfig) | **POST** /controller/campus/v1/authconfigservice/accessconfig/timeflowconfig | 新增计费策略
[**delTimeFlowConfig**](TimeFlowConfigApi.md#delTimeFlowConfig) | **POST** /controller/campus/v1/authconfigservice/accessconfig/timeflowconfig/batch-delete | 删除计费策略
[**getTimeFlowConfig**](TimeFlowConfigApi.md#getTimeFlowConfig) | **GET** /controller/campus/v1/authconfigservice/accessconfig/timeflowconfig | 查询计费策略
[**modifyTimeFlowConfig**](TimeFlowConfigApi.md#modifyTimeFlowConfig) | **PUT** /controller/campus/v1/authconfigservice/accessconfig/timeflowconfig/{id} | 修改计费策略


<a name="addTimeFlowConfig"></a>
# **addTimeFlowConfig**
> TimeFlowConfigsOutputDto addTimeFlowConfig(body)

新增计费策略

## 操作场景 ##  提供新增计费策略北向接口。 ## 接口功能 ##  为指定的租户的站点新增计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeFlowConfigApi;


TimeFlowConfigApi apiInstance = new TimeFlowConfigApi();
TimeFlowConfigCommon body = new TimeFlowConfigCommon(); // TimeFlowConfigCommon | 计费信息。
try {
    TimeFlowConfigsOutputDto result = apiInstance.addTimeFlowConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeFlowConfigApi#addTimeFlowConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeFlowConfigCommon**](TimeFlowConfigCommon.md)| 计费信息。 |

### Return type

[**TimeFlowConfigsOutputDto**](TimeFlowConfigsOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delTimeFlowConfig"></a>
# **delTimeFlowConfig**
> DeleteTimeFlowConfigOutputDto delTimeFlowConfig(body)

删除计费策略

## 操作场景 ##  提供删除计费策略北向接口。 ## 接口功能 ##  为指定的租户的站点删除计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeFlowConfigApi;


TimeFlowConfigApi apiInstance = new TimeFlowConfigApi();
TimeFlowConfigDeleteDto body = new TimeFlowConfigDeleteDto(); // TimeFlowConfigDeleteDto | 删除条件，策略ID列表。
try {
    DeleteTimeFlowConfigOutputDto result = apiInstance.delTimeFlowConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeFlowConfigApi#delTimeFlowConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeFlowConfigDeleteDto**](TimeFlowConfigDeleteDto.md)| 删除条件，策略ID列表。 |

### Return type

[**DeleteTimeFlowConfigOutputDto**](DeleteTimeFlowConfigOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTimeFlowConfig"></a>
# **getTimeFlowConfig**
> TimeFlowConfigsOutputDto getTimeFlowConfig(siteId, id, timeFlowName)

查询计费策略

## 操作场景 ##  提供查询计费策略北向接口。 ## 接口功能 ##  查询计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeFlowConfigApi;


TimeFlowConfigApi apiInstance = new TimeFlowConfigApi();
String siteId = "75f8ed0f-810a-4ff5-8e64-67c81312d01c"; // String | 站点ID，UUID格式。
String id = "75f8ed0f810a4ff58e6467c81312d01c"; // String | 计费策略ID，UUID格式。
String timeFlowName = "policy"; // String | 计费策略名称，模糊查询。
try {
    TimeFlowConfigsOutputDto result = apiInstance.getTimeFlowConfig(siteId, id, timeFlowName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeFlowConfigApi#getTimeFlowConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **id** | **String**| 计费策略ID，UUID格式。 | [optional]
 **timeFlowName** | **String**| 计费策略名称，模糊查询。 | [optional]

### Return type

[**TimeFlowConfigsOutputDto**](TimeFlowConfigsOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyTimeFlowConfig"></a>
# **modifyTimeFlowConfig**
> CommonTimeFlowConfigDto modifyTimeFlowConfig(id, body)

修改计费策略

## 操作场景 ##  提供修改计费策略北向接口。 ## 接口功能 ##  为指定的租户的站点修改计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TimeFlowConfigApi;


TimeFlowConfigApi apiInstance = new TimeFlowConfigApi();
String id = "75f8ed0f810a4ff58e6467c81312d01c"; // String | 修改条件，计费策略ID。
TimeFlowConfigCommon body = new TimeFlowConfigCommon(); // TimeFlowConfigCommon | 修改内容。
try {
    CommonTimeFlowConfigDto result = apiInstance.modifyTimeFlowConfig(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeFlowConfigApi#modifyTimeFlowConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 修改条件，计费策略ID。 |
 **body** | [**TimeFlowConfigCommon**](TimeFlowConfigCommon.md)| 修改内容。 |

### Return type

[**CommonTimeFlowConfigDto**](CommonTimeFlowConfigDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

