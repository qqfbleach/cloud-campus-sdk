# LswauthApi

All URIs are relative to *https://localhost/controller/campus/v1/authconfigservice/accessconfig*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLswAuth**](LswauthApi.md#createLswAuth) | **POST** /controller/campus/v1/authconfigservice/accessconfig/lswauth/{siteId}/profiles | 创建站点下交换机有线认证模板配置
[**deleteLswAuth**](LswauthApi.md#deleteLswAuth) | **POST** /controller/campus/v1/authconfigservice/accessconfig/lswauth/{siteId}/profiles/batch-delete | 删除站点下交换机有线认证模板配置
[**getLswAuth**](LswauthApi.md#getLswAuth) | **GET** /controller/campus/v1/authconfigservice/accessconfig/lswauth/{siteId}/profiles | 查询站点下交换机有线认证模板配置
[**updateLswAuth**](LswauthApi.md#updateLswAuth) | **PUT** /controller/campus/v1/authconfigservice/accessconfig/lswauth/{siteId}/profiles/{profileId} | 修改站点下交换机有线认证模板配置
[**updateLswAuthInc**](LswauthApi.md#updateLswAuthInc) | **POST** /controller/campus/v1/authconfigservice/accessconfig/lswauth/{siteId}/profiles/{profileId}/devices | 增量绑定交换机无线认证模板配置
[**updateLswAuthProInc**](LswauthApi.md#updateLswAuthProInc) | **PUT** /controller/campus/v1/authconfigservice/accessconfig/lswauth/{siteId}/profileInfos/{profileId} | 修改站点交换机有线认证部分模板配置


<a name="createLswAuth"></a>
# **createLswAuth**
> LswAuthConfigResponse createLswAuth(lswAuthConfigCore, siteId)

创建站点下交换机有线认证模板配置

## 典型场景 ##  创建站点下交换机有线认证模板配置。&lt;br&gt; ## 接口功能 ##  创建站点下交换机有线认证模板配置。 &lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理员访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LswauthApi;


LswauthApi apiInstance = new LswauthApi();
LswAuthConfigCore lswAuthConfigCore = new LswAuthConfigCore(); // LswAuthConfigCore | 交换机认证模板配置信息。
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
try {
    LswAuthConfigResponse result = apiInstance.createLswAuth(lswAuthConfigCore, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LswauthApi#createLswAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lswAuthConfigCore** | [**LswAuthConfigCore**](LswAuthConfigCore.md)| 交换机认证模板配置信息。 |
 **siteId** | **String**| 站点标识，UUID格式。 |

### Return type

[**LswAuthConfigResponse**](LswAuthConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLswAuth"></a>
# **deleteLswAuth**
> DeleteAuthResponse deleteLswAuth(siteId, ids)

删除站点下交换机有线认证模板配置

## 典型场景 ##  批量删除站点下交换机有线认证模板。&lt;br&gt; ## 接口功能 ##  批量删除站点下交换机有线认证模板。 &lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理员访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LswauthApi;


LswauthApi apiInstance = new LswauthApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
LswAuthDeleteDto ids = new LswAuthDeleteDto(); // LswAuthDeleteDto | 待删除的有线认证模板。
try {
    DeleteAuthResponse result = apiInstance.deleteLswAuth(siteId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LswauthApi#deleteLswAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **ids** | [**LswAuthDeleteDto**](LswAuthDeleteDto.md)| 待删除的有线认证模板。 |

### Return type

[**DeleteAuthResponse**](DeleteAuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLswAuth"></a>
# **getLswAuth**
> LswAuthConfigResponse getLswAuth(siteId, profileName, policyId)

查询站点下交换机有线认证模板配置

## 典型场景 ##  查询指定站点内交换机有线认证模板列表。&lt;br&gt; ## 接口功能 ##  查询站点下交换机有线认证模板列表。 &lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理员访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LswauthApi;


LswauthApi apiInstance = new LswauthApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
String profileName = "policy"; // String | 认证模板名称，支持模糊查询。
String policyId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 认证模板ID，UUID格式。
try {
    LswAuthConfigResponse result = apiInstance.getLswAuth(siteId, profileName, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LswauthApi#getLswAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **profileName** | **String**| 认证模板名称，支持模糊查询。 | [optional]
 **policyId** | **String**| 认证模板ID，UUID格式。 | [optional]

### Return type

[**LswAuthConfigResponse**](LswAuthConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLswAuth"></a>
# **updateLswAuth**
> LswAuthConfigResponse updateLswAuth(siteId, profileId, lswAuthConfig)

修改站点下交换机有线认证模板配置

## 典型场景 ##  修改站点下交换机有线认证模板。&lt;br&gt; ## 接口功能 ##  修改站点下交换机有线认证模板。 &lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理员访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LswauthApi;


LswauthApi apiInstance = new LswauthApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
String profileId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 认证模板ID，UUID格式。
LswAuthConfig lswAuthConfig = new LswAuthConfig(); // LswAuthConfig | 有线认证配置。
try {
    LswAuthConfigResponse result = apiInstance.updateLswAuth(siteId, profileId, lswAuthConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LswauthApi#updateLswAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **profileId** | **String**| 认证模板ID，UUID格式。 |
 **lswAuthConfig** | [**LswAuthConfig**](LswAuthConfig.md)| 有线认证配置。 |

### Return type

[**LswAuthConfigResponse**](LswAuthConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLswAuthInc"></a>
# **updateLswAuthInc**
> LswAuthConfigResponse updateLswAuthInc(siteId, profileId, lswDeviceInfo)

增量绑定交换机无线认证模板配置

## 典型场景 ##  交换机无线认证配置增量绑定设备。&lt;br&gt; ## 接口功能 ##  交换机无线认证配置增量绑定设备。 &lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理员访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LswauthApi;


LswauthApi apiInstance = new LswauthApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
String profileId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 认证模板ID，UUID格式。
LswDeviceInfo lswDeviceInfo = new LswDeviceInfo(); // LswDeviceInfo | 设备接口列表。
try {
    LswAuthConfigResponse result = apiInstance.updateLswAuthInc(siteId, profileId, lswDeviceInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LswauthApi#updateLswAuthInc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **profileId** | **String**| 认证模板ID，UUID格式。 |
 **lswDeviceInfo** | [**LswDeviceInfo**](LswDeviceInfo.md)| 设备接口列表。 |

### Return type

[**LswAuthConfigResponse**](LswAuthConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLswAuthProInc"></a>
# **updateLswAuthProInc**
> LswAuthConfigResponse updateLswAuthProInc(siteId, profileId, lswAuthConfigProfile)

修改站点交换机有线认证部分模板配置

## 典型场景 ##  修改站点交换机有线认证部分模板配置。&lt;br&gt; ## 接口功能 ##  修改站点交换机有线认证部分模板配置。 &lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理员访问，必须在用户会话建立后使用。 &lt;br&gt; 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LswauthApi;


LswauthApi apiInstance = new LswauthApi();
String siteId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 站点标识，UUID格式。
String profileId = "fbde1c5d-5b94-49e3-a912-48641015e45c"; // String | 认证模板ID，UUID格式。
LswAuthConfigProfile lswAuthConfigProfile = new LswAuthConfigProfile(); // LswAuthConfigProfile | 有线认证配置。
try {
    LswAuthConfigResponse result = apiInstance.updateLswAuthProInc(siteId, profileId, lswAuthConfigProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LswauthApi#updateLswAuthProInc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |
 **profileId** | **String**| 认证模板ID，UUID格式。 |
 **lswAuthConfigProfile** | [**LswAuthConfigProfile**](LswAuthConfigProfile.md)| 有线认证配置。 |

### Return type

[**LswAuthConfigResponse**](LswAuthConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

