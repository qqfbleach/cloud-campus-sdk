# GetPoePowerStateApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPoePowerState**](GetPoePowerStateApi.md#getPoePowerState) | **GET** /controller/campus/v1/oamservice/poe/{deviceId} | 查询PoE电源状态


<a name="getPoePowerState"></a>
# **getPoePowerState**
> GetPoePowerStateResp getPoePowerState(deviceId)

查询PoE电源状态

## 典型场景 ##    查询PoE电源状态。 ## 接口功能 ##    查询PoE电源状态。 ## 接口约束 ##    北向接口管理员可以访问。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.GetPoePowerStateApi;


GetPoePowerStateApi apiInstance = new GetPoePowerStateApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID，UUID格式。
try {
    GetPoePowerStateResp result = apiInstance.getPoePowerState(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetPoePowerStateApi#getPoePowerState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |

### Return type

[**GetPoePowerStateResp**](GetPoePowerStateResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

