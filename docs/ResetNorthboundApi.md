# ResetNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetDevice**](ResetNorthboundApi.md#resetDevice) | **POST** /controller/campus/v1/oamservice/reset/device-configurations | 批量恢复设备出厂设置


<a name="resetDevice"></a>
# **resetDevice**
> ResetDeviceResponse resetDevice(request)

批量恢复设备出厂设置

## 典型场景 ## 批量恢复设备出厂设置。 ## 接口功能 ## 批量恢复设备出厂设置，设备恢复出厂设置后，会从站点中移除。 ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。该接口为同步接口，接口耗时与设备网络状态有关，超时时间为1分钟。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ResetNorthboundApi;


ResetNorthboundApi apiInstance = new ResetNorthboundApi();
ResetDeviceRequest request = new ResetDeviceRequest(); // ResetDeviceRequest | 批量恢复设备出厂设置请求。
try {
    ResetDeviceResponse result = apiInstance.resetDevice(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResetNorthboundApi#resetDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ResetDeviceRequest**](ResetDeviceRequest.md)| 批量恢复设备出厂设置请求。 |

### Return type

[**ResetDeviceResponse**](ResetDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

