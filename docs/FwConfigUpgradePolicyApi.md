# FwConfigUpgradePolicyApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice/saupgrade*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configUpgradePolicy**](FwConfigUpgradePolicyApi.md#configUpgradePolicy) | **POST** /controller/campus/v1/oamservice/saupgrade/sites | 配置防火墙站点特征库升级策略
[**getUpgradePolicy**](FwConfigUpgradePolicyApi.md#getUpgradePolicy) | **GET** /controller/campus/v1/oamservice/saupgrade/sites/{siteId} | 查询防火墙站点特征库升级策略


<a name="configUpgradePolicy"></a>
# **configUpgradePolicy**
> ConfigPolicyResponse configUpgradePolicy(configUpgradePolicyListDto)

配置防火墙站点特征库升级策略

## 典型场景 ##   提供配置防火墙站点特征库升级策略接口。 ## 接口功能 ##   配置防火墙站点特征库升级策略。 ## 接口约束 ##   该接口必须在存在防火墙的站点下使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwConfigUpgradePolicyApi;


FwConfigUpgradePolicyApi apiInstance = new FwConfigUpgradePolicyApi();
ConfigUpgradePolicyListDto configUpgradePolicyListDto = new ConfigUpgradePolicyListDto(); // ConfigUpgradePolicyListDto | 防火墙站点特征库升级策略配置信息。
try {
    ConfigPolicyResponse result = apiInstance.configUpgradePolicy(configUpgradePolicyListDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwConfigUpgradePolicyApi#configUpgradePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configUpgradePolicyListDto** | [**ConfigUpgradePolicyListDto**](ConfigUpgradePolicyListDto.md)| 防火墙站点特征库升级策略配置信息。 |

### Return type

[**ConfigPolicyResponse**](ConfigPolicyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpgradePolicy"></a>
# **getUpgradePolicy**
> GetPolicyResponse getUpgradePolicy(siteId)

查询防火墙站点特征库升级策略

## 典型场景 ##   提供查询防火墙站点特征库升级策略接口。 ## 接口功能 ##   查询防火墙站点特征库升级策略。 ## 接口约束 ##   该接口必须在存在防火墙的站点下使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.FwConfigUpgradePolicyApi;


FwConfigUpgradePolicyApi apiInstance = new FwConfigUpgradePolicyApi();
String siteId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 站点标识，UUID格式。
try {
    GetPolicyResponse result = apiInstance.getUpgradePolicy(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FwConfigUpgradePolicyApi#getUpgradePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点标识，UUID格式。 |

### Return type

[**GetPolicyResponse**](GetPolicyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

