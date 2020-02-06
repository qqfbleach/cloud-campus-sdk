# TraceDiagnoseServiceApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTraceTask**](TraceDiagnoseServiceApi.md#createTraceTask) | **POST** /controller/campus/v1/oamservice/trace | 创建Trace探测任务
[**queryTraceTaskByTaskId**](TraceDiagnoseServiceApi.md#queryTraceTaskByTaskId) | **GET** /controller/campus/v1/oamservice/trace/{taskId} | 查询Trace探测结果


<a name="createTraceTask"></a>
# **createTraceTask**
> TraceTaskResponse createTraceTask(request)

创建Trace探测任务

## 典型场景 ##  创建Trace探测任务。 ## 接口功能 ##  创建Trace探测任务。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TraceDiagnoseServiceApi;


TraceDiagnoseServiceApi apiInstance = new TraceDiagnoseServiceApi();
TraceDiagnoseDto request = new TraceDiagnoseDto(); // TraceDiagnoseDto | 请求参数。
try {
    TraceTaskResponse result = apiInstance.createTraceTask(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TraceDiagnoseServiceApi#createTraceTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TraceDiagnoseDto**](TraceDiagnoseDto.md)| 请求参数。 |

### Return type

[**TraceTaskResponse**](TraceTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryTraceTaskByTaskId"></a>
# **queryTraceTaskByTaskId**
> TraceReplyResponse queryTraceTaskByTaskId(taskId)

查询Trace探测结果

## 典型场景 ##  根据taskId查询trace任务。 ## 接口功能 ##  查询Trace探测任务。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TraceDiagnoseServiceApi;


TraceDiagnoseServiceApi apiInstance = new TraceDiagnoseServiceApi();
String taskId = "75ade72a-e7a9-4c81-8fca-894e7ca9c2c2"; // String | Trace探测任务ID，格式UUID。
try {
    TraceReplyResponse result = apiInstance.queryTraceTaskByTaskId(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TraceDiagnoseServiceApi#queryTraceTaskByTaskId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| Trace探测任务ID，格式UUID。 |

### Return type

[**TraceReplyResponse**](TraceReplyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

