# NatSessionLogServiceApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configapNatSessionLog**](NatSessionLogServiceApi.md#configapNatSessionLog) | **PUT** /controller/campus/v1/oamservice/site/{siteId}/apnatsessionlog | 配置站点内AP设备Nat日志上报信息
[**getApNatSessionLogConfig**](NatSessionLogServiceApi.md#getApNatSessionLogConfig) | **GET** /controller/campus/v1/oamservice/site/{siteId}/apnatsessionlog | 查询站点内AP设备Nat日志上报配置


<a name="configapNatSessionLog"></a>
# **configapNatSessionLog**
> NatSessionLogConfigResult configapNatSessionLog(siteId, configParam)

配置站点内AP设备Nat日志上报信息

## 典型场景 ##  配置站点内AP设备Nat日志上报信息。 ## 接口功能 ##  配置站点内AP设备Nat日志上报信息。 ## 接口约束 ##  该接口支持北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NatSessionLogServiceApi;


NatSessionLogServiceApi apiInstance = new NatSessionLogServiceApi();
String siteId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359ca"; // String | 站点标识，UUID格式。
NatSessionLogConfigParam configParam = new NatSessionLogConfigParam(); // NatSessionLogConfigParam | 配置参数。
try {
    NatSessionLogConfigResult result = apiInstance.configapNatSessionLog(siteId, configParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NatSessionLogServiceApi#configapNatSessionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **configParam** | [**NatSessionLogConfigParam**](NatSessionLogConfigParam.md)| 配置参数。 |

### Return type

[**NatSessionLogConfigResult**](NatSessionLogConfigResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApNatSessionLogConfig"></a>
# **getApNatSessionLogConfig**
> NatSessionLogConfigResult getApNatSessionLogConfig(siteId)

查询站点内AP设备Nat日志上报配置

## 典型场景 ##  查询站点内AP设备的Nat日志上报的配置。 ## 接口功能 ##  查询站点内AP设备的Nat日志上报的配置。 ## 接口约束 ##  该接口支持北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.NatSessionLogServiceApi;


NatSessionLogServiceApi apiInstance = new NatSessionLogServiceApi();
String siteId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359ca"; // String | 站点标识，UUID格式。
try {
    NatSessionLogConfigResult result = apiInstance.getApNatSessionLogConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NatSessionLogServiceApi#getApNatSessionLogConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |

### Return type

[**NatSessionLogConfigResult**](NatSessionLogConfigResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

