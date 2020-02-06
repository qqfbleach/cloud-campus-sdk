# StackManagerApi

All URIs are relative to *https://localhost/controller/campus/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStack**](StackManagerApi.md#createStack) | **POST** /controller/campus/v3/stack | 添加指定ESN设备到指定堆叠


<a name="createStack"></a>
# **createStack**
> CreateStackOutDto createStack(createStackDto)

添加指定ESN设备到指定堆叠

## 典型场景 ## 将指定ESN设备加入指定堆叠。 ## 接口功能 ## 将指定ESN设备加入指定堆叠。若堆叠名称存在则将指定ESN设备加入到堆叠；若堆叠名称不存在则将指定堆叠创建后加入指定ESN设备。 ## 接口约束 ## 该接口必须在用户会话建立后使用。加入同一个堆叠的设备必须在同一个站点内。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.StackManagerApi;


StackManagerApi apiInstance = new StackManagerApi();
CreateStackDto createStackDto = new CreateStackDto(); // CreateStackDto | 创建堆叠入参。
try {
    CreateStackOutDto result = apiInstance.createStack(createStackDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackManagerApi#createStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createStackDto** | [**CreateStackDto**](CreateStackDto.md)| 创建堆叠入参。 |

### Return type

[**CreateStackOutDto**](CreateStackOutDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

