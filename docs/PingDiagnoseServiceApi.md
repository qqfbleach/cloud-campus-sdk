# PingDiagnoseServiceApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPingTask**](PingDiagnoseServiceApi.md#createPingTask) | **POST** /controller/campus/v1/oamservice/ping | 创建ping探测任务
[**queryPingTaskByTaskId**](PingDiagnoseServiceApi.md#queryPingTaskByTaskId) | **GET** /controller/campus/v1/oamservice/ping/{taskId} | 查询ping探测结果


<a name="createPingTask"></a>
# **createPingTask**
> PingTaskResponse createPingTask(request)

创建ping探测任务

## 典型场景 ##  创建ping探测任务。 ## 接口功能 ##  1、创建一个ping任务，并返回任务ID。通过任务ID，可得知本次任务的执行结果。  2、ping间隔500ms，超时时间2000ms，默认ping 5次。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PingDiagnoseServiceApi;


PingDiagnoseServiceApi apiInstance = new PingDiagnoseServiceApi();
PingDiagnoseDto request = new PingDiagnoseDto(); // PingDiagnoseDto | 请求参数。
try {
    PingTaskResponse result = apiInstance.createPingTask(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PingDiagnoseServiceApi#createPingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PingDiagnoseDto**](PingDiagnoseDto.md)| 请求参数。 |

### Return type

[**PingTaskResponse**](PingTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryPingTaskByTaskId"></a>
# **queryPingTaskByTaskId**
> PingReplyResponse queryPingTaskByTaskId(taskId)

查询ping探测结果

## 典型场景 ##  根据任务ID查询ping探测结果。 ## 接口功能 ##  查询ping探测结果。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PingDiagnoseServiceApi;


PingDiagnoseServiceApi apiInstance = new PingDiagnoseServiceApi();
String taskId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | ping探测任务ID，格式UUID。
try {
    PingReplyResponse result = apiInstance.queryPingTaskByTaskId(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PingDiagnoseServiceApi#queryPingTaskByTaskId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ping探测任务ID，格式UUID。 |

### Return type

[**PingReplyResponse**](PingReplyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

