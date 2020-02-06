# ConfigDeployApiNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkconfigservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployAllConfig**](ConfigDeployApiNorthboundApi.md#deployAllConfig) | **POST** /controller/campus/v1/networkconfigservice/deploy/devices/{deviceId}/alldeploy | 全量下发配置
[**redeployFailConfig**](ConfigDeployApiNorthboundApi.md#redeployFailConfig) | **POST** /controller/campus/v1/networkconfigservice/deploy/devices/{deviceId}/redeploy | 重下发失败配置


<a name="deployAllConfig"></a>
# **deployAllConfig**
> CommonDto deployAllConfig(deviceId)

全量下发配置

## 典型场景 ##    提供配置参数的接口，重新下发设备所有配置。 ## 接口功能 ##    重新下发设备所有配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ConfigDeployApiNorthboundApi;


ConfigDeployApiNorthboundApi apiInstance = new ConfigDeployApiNorthboundApi();
String deviceId = "fbde1c5d-5b94-49e3-a912-18641015e23c"; // String | 设备ID，UUID格式。
try {
    CommonDto result = apiInstance.deployAllConfig(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigDeployApiNorthboundApi#deployAllConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |

### Return type

[**CommonDto**](CommonDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redeployFailConfig"></a>
# **redeployFailConfig**
> CommonDto redeployFailConfig(deviceId)

重下发失败配置

## 典型场景 ##    提供配置参数的接口，重新下发配置结果为失败的配置。 ## 接口功能 ##    重新下发配置结果不为成功的配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ConfigDeployApiNorthboundApi;


ConfigDeployApiNorthboundApi apiInstance = new ConfigDeployApiNorthboundApi();
String deviceId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 设备ID，UUID格式。
try {
    CommonDto result = apiInstance.redeployFailConfig(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigDeployApiNorthboundApi#redeployFailConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |

### Return type

[**CommonDto**](CommonDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

