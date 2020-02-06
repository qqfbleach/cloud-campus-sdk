# UpgradeOpenApiApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice/upgrade*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPolicy**](UpgradeOpenApiApi.md#cancelPolicy) | **POST** /controller/campus/v1/oamservice/upgrade/policy/device/cancel | 取消设备升级
[**cancelSitePolicy**](UpgradeOpenApiApi.md#cancelSitePolicy) | **POST** /controller/campus/v1/oamservice/upgrade/policy/site/cancel | 删除站点升级
[**policyConfiguration**](UpgradeOpenApiApi.md#policyConfiguration) | **POST** /controller/campus/v1/oamservice/upgrade/policy | 创建站点升级
[**queryPolicy**](UpgradeOpenApiApi.md#queryPolicy) | **GET** /controller/campus/v1/oamservice/upgrade/policy/{siteId} | 查询站点升级
[**queryPolicyDetail**](UpgradeOpenApiApi.md#queryPolicyDetail) | **GET** /controller/campus/v1/oamservice/upgrade/policy-detail/{siteId} | 查询设备升级
[**queryVersion**](UpgradeOpenApiApi.md#queryVersion) | **GET** /controller/campus/v1/oamservice/upgrade/version | 查询设备文件
[**reUpgrade**](UpgradeOpenApiApi.md#reUpgrade) | **POST** /controller/campus/v1/oamservice/upgrade/reupgrade | 重新升级设备


<a name="cancelPolicy"></a>
# **cancelPolicy**
> CommonResponseBody cancelPolicy(policyDeviceCancelInputList)

取消设备升级

## 典型场景 ##    取消设备升级。 ## 接口功能 ##    取消设备升级。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
PolicyDeviceCancelInputList policyDeviceCancelInputList = new PolicyDeviceCancelInputList(); // PolicyDeviceCancelInputList | 取消设备升级入参。
try {
    CommonResponseBody result = apiInstance.cancelPolicy(policyDeviceCancelInputList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#cancelPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyDeviceCancelInputList** | [**PolicyDeviceCancelInputList**](PolicyDeviceCancelInputList.md)| 取消设备升级入参。 |

### Return type

[**CommonResponseBody**](CommonResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelSitePolicy"></a>
# **cancelSitePolicy**
> CommonResponseBody cancelSitePolicy(policySiteCancelInputList)

删除站点升级

## 典型场景 ##    删除多站点升级计划。 ## 接口功能 ##    删除多站点升级计划。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。    建议先取消所有站点下正在升级的设备。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
PolicySiteCancelInputList policySiteCancelInputList = new PolicySiteCancelInputList(); // PolicySiteCancelInputList | 删除多站点升级计划入参。
try {
    CommonResponseBody result = apiInstance.cancelSitePolicy(policySiteCancelInputList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#cancelSitePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policySiteCancelInputList** | [**PolicySiteCancelInputList**](PolicySiteCancelInputList.md)| 删除多站点升级计划入参。 |

### Return type

[**CommonResponseBody**](CommonResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="policyConfiguration"></a>
# **policyConfiguration**
> PolicyConfigRes policyConfiguration(policyConfig)

创建站点升级

## 典型场景 ##    创建多站点升级计划。 ## 接口功能 ##    创建多站点升级计划。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
PolicyConfig policyConfig = new PolicyConfig(); // PolicyConfig | 多站点升级计划。
try {
    PolicyConfigRes result = apiInstance.policyConfiguration(policyConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#policyConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyConfig** | [**PolicyConfig**](PolicyConfig.md)| 多站点升级计划。 |

### Return type

[**PolicyConfigRes**](PolicyConfigRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryPolicy"></a>
# **queryPolicy**
> PolicyConfigRes queryPolicy(siteId, deviceModel)

查询站点升级

## 典型场景 ##    查询站点升级计划概要。 ## 接口功能 ##    查询站点升级计划概要。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String deviceModel = "AR161FW"; // String | 设备款型。 如果不填就是站点下全量的数据。 如果填写了设备款型，就是该站点下该款型的升级计划。 
try {
    PolicyConfigRes result = apiInstance.queryPolicy(siteId, deviceModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#queryPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **deviceModel** | **String**| 设备款型。 如果不填就是站点下全量的数据。 如果填写了设备款型，就是该站点下该款型的升级计划。  | [optional]

### Return type

[**PolicyConfigRes**](PolicyConfigRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryPolicyDetail"></a>
# **queryPolicyDetail**
> DeviceDetailListRes queryPolicyDetail(siteId, deviceModel)

查询设备升级

## 典型场景 ##    查询站点下具体设备的升级状态。 ## 接口功能 ##    查询站点下具体设备的升级状态。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String deviceModel = "AR161FW"; // String | 设备款型。 如果不填就是站点下全量的数据。 如果填写了设备款型，就是该站点下该款型的升级状态。 
try {
    DeviceDetailListRes result = apiInstance.queryPolicyDetail(siteId, deviceModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#queryPolicyDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **deviceModel** | **String**| 设备款型。 如果不填就是站点下全量的数据。 如果填写了设备款型，就是该站点下该款型的升级状态。  | [optional]

### Return type

[**DeviceDetailListRes**](DeviceDetailListRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryVersion"></a>
# **queryVersion**
> AvailableVersion queryVersion(deviceModel)

查询设备文件

## 典型场景 ##    根据设备款型查询可用文件列表。 ## 接口功能 ##    根据设备款型查询可用文件列表。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
String deviceModel = "AP6050DN"; // String | 设备款型。
try {
    AvailableVersion result = apiInstance.queryVersion(deviceModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#queryVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceModel** | **String**| 设备款型。 |

### Return type

[**AvailableVersion**](AvailableVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reUpgrade"></a>
# **reUpgrade**
> CommonResponseBody reUpgrade(reupgradeRequestBody)

重新升级设备

## 典型场景 ##    升级失败的设备重新升级。 ## 接口功能 ##    升级失败的设备重新升级。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.UpgradeOpenApiApi;


UpgradeOpenApiApi apiInstance = new UpgradeOpenApiApi();
ReupgradeRequestBody reupgradeRequestBody = new ReupgradeRequestBody(); // ReupgradeRequestBody | 重新升级入参。
try {
    CommonResponseBody result = apiInstance.reUpgrade(reupgradeRequestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeOpenApiApi#reUpgrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reupgradeRequestBody** | [**ReupgradeRequestBody**](ReupgradeRequestBody.md)| 重新升级入参。 |

### Return type

[**CommonResponseBody**](CommonResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

