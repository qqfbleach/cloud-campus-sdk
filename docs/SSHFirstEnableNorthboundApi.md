# SSHFirstEnableNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSSHFirstEnableConfig**](SSHFirstEnableNorthboundApi.md#getSSHFirstEnableConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/ssh/sites/{siteId}/sshfirstenable | 查询SSH客户端首次认证免公钥配置
[**updateSSHFirstEnableConfig**](SSHFirstEnableNorthboundApi.md#updateSSHFirstEnableConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/ssh/sites/{siteId}/sshfirstenable | 修改SSH客户端首次认证免公钥配置


<a name="getSSHFirstEnableConfig"></a>
# **getSSHFirstEnableConfig**
> SSHFirstEnableResponseDto getSSHFirstEnableConfig(siteId)

查询SSH客户端首次认证免公钥配置

## 典型场景 ##    提供查询配置参数的接口，查询SSH客户端首次认证免公钥开关是否打开。 ## 接口功能 ##    在某个站点下，查询SSH客户端首次认证免公钥开关是否打开。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SSHFirstEnableNorthboundApi;


SSHFirstEnableNorthboundApi apiInstance = new SSHFirstEnableNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    SSHFirstEnableResponseDto result = apiInstance.getSSHFirstEnableConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SSHFirstEnableNorthboundApi#getSSHFirstEnableConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**SSHFirstEnableResponseDto**](SSHFirstEnableResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSSHFirstEnableConfig"></a>
# **updateSSHFirstEnableConfig**
> SSHFirstEnableResponseDto updateSSHFirstEnableConfig(siteId, body)

修改SSH客户端首次认证免公钥配置

## 典型场景 ##    提供修改配置参数的接口，修改SSH客户端首次认证免公钥开关。 ## 接口功能 ##    在某个站点下，修改SSH客户端首次认证免公钥开关。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SSHFirstEnableNorthboundApi;


SSHFirstEnableNorthboundApi apiInstance = new SSHFirstEnableNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
SSHFirstEnableDto body = new SSHFirstEnableDto(); // SSHFirstEnableDto | SSH客户端首次认证免公钥开关参数体。
try {
    SSHFirstEnableResponseDto result = apiInstance.updateSSHFirstEnableConfig(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SSHFirstEnableNorthboundApi#updateSSHFirstEnableConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**SSHFirstEnableDto**](SSHFirstEnableDto.md)| SSH客户端首次认证免公钥开关参数体。 |

### Return type

[**SSHFirstEnableResponseDto**](SSHFirstEnableResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

