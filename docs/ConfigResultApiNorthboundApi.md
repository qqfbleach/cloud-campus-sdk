# ConfigResultApiNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkconfigservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfigResults**](ConfigResultApiNorthboundApi.md#getConfigResults) | **POST** /controller/campus/v1/networkconfigservice/configresult | 获取配置结果


<a name="getConfigResults"></a>
# **getConfigResults**
> StateResponseDto getConfigResults(batchGetDto)

获取配置结果

## 典型场景 ##    提供配置参数的接口，获取配置结果。 ## 接口功能 ##    获取配置结果。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ConfigResultApiNorthboundApi;


ConfigResultApiNorthboundApi apiInstance = new ConfigResultApiNorthboundApi();
BatchGetDto batchGetDto = new BatchGetDto(); // BatchGetDto | 服务信息。
try {
    StateResponseDto result = apiInstance.getConfigResults(batchGetDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigResultApiNorthboundApi#getConfigResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchGetDto** | [**BatchGetDto**](BatchGetDto.md)| 服务信息。 |

### Return type

[**StateResponseDto**](StateResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

