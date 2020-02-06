# PeriodRebootDeviceApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRebootTaskStatus**](PeriodRebootDeviceApi.md#getRebootTaskStatus) | **GET** /controller/campus/v1/oamservice/device-reboot/{deviceId} | 查询设备定时重启任务
[**periodRebootDevice**](PeriodRebootDeviceApi.md#periodRebootDevice) | **PUT** /controller/campus/v1/oamservice/device-reboot/{deviceId} | 设置设备定时重启任务


<a name="getRebootTaskStatus"></a>
# **getRebootTaskStatus**
> GetRebootStatusResp getRebootTaskStatus(deviceId)

查询设备定时重启任务

## 典型场景 ##    查询重启任务状态。 ## 接口功能 ##    基于设备维度查询重启任务状态。 ## 接口约束 ##    北向接口管理员可以访问。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiClient;
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.Configuration;
//import com.huawei.cloudcampus.api.auth.*;
//import com.huawei.cloudcampus.api.service.PeriodRebootDeviceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

PeriodRebootDeviceApi apiInstance = new PeriodRebootDeviceApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID，UUID格式。
try {
    GetRebootStatusResp result = apiInstance.getRebootTaskStatus(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeriodRebootDeviceApi#getRebootTaskStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |

### Return type

[**GetRebootStatusResp**](GetRebootStatusResp.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="periodRebootDevice"></a>
# **periodRebootDevice**
> PeriodRebootDeviceResp periodRebootDevice(deviceId, taskParam)

设置设备定时重启任务

## 典型场景 ##    提供创建或更新定时重启设备任务接口。 ## 接口功能 ##    基于设备维度创建或更新定时重启设备任务。 ## 接口约束 ##    北向接口管理员可以访问。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiClient;
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.Configuration;
//import com.huawei.cloudcampus.api.auth.*;
//import com.huawei.cloudcampus.api.service.PeriodRebootDeviceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

PeriodRebootDeviceApi apiInstance = new PeriodRebootDeviceApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID，UUID格式。
ReriodRebootDeviceParam taskParam = new ReriodRebootDeviceParam(); // ReriodRebootDeviceParam | 参数。
try {
    PeriodRebootDeviceResp result = apiInstance.periodRebootDevice(deviceId, taskParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeriodRebootDeviceApi#periodRebootDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |
 **taskParam** | [**ReriodRebootDeviceParam**](ReriodRebootDeviceParam.md)| 参数。 |

### Return type

[**PeriodRebootDeviceResp**](PeriodRebootDeviceResp.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

