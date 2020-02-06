# BootROMNetcfgNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configInitBootRom**](BootROMNetcfgNorthboundApi.md#configInitBootRom) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/bootrom | 配置租户BootROM密码
[**updateSiteBootRomConfig**](BootROMNetcfgNorthboundApi.md#updateSiteBootRomConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/bootrom/sites/{siteId}/bootrom | 配置站点BootROM密码


<a name="configInitBootRom"></a>
# **configInitBootRom**
> BootRomResponse configInitBootRom(body)

配置租户BootROM密码

## 典型场景 ##    提供配置租户BootROM密码的接口。 ## 接口功能 ##    配置租户设备BootROM密码。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.BootROMNetcfgNorthboundApi;


BootROMNetcfgNorthboundApi apiInstance = new BootROMNetcfgNorthboundApi();
BootRomDto body = new BootRomDto(); // BootRomDto | 配置租户BootROM密码。
try {
    BootRomResponse result = apiInstance.configInitBootRom(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BootROMNetcfgNorthboundApi#configInitBootRom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BootRomDto**](BootRomDto.md)| 配置租户BootROM密码。 |

### Return type

[**BootRomResponse**](BootRomResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteBootRomConfig"></a>
# **updateSiteBootRomConfig**
> BootRomResponse updateSiteBootRomConfig(siteId, bootRomDto)

配置站点BootROM密码

## 典型场景 ##    提供配置站点下BootROM密码的接口。 ## 接口功能 ##    配置站点下设备BootROM密码。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.BootROMNetcfgNorthboundApi;


BootROMNetcfgNorthboundApi apiInstance = new BootROMNetcfgNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点标识，UUID格式。
BootRomDto bootRomDto = new BootRomDto(); // BootRomDto | 配置的设备BootROM密码。
try {
    BootRomResponse result = apiInstance.updateSiteBootRomConfig(siteId, bootRomDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BootROMNetcfgNorthboundApi#updateSiteBootRomConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点标识，UUID格式。 |
 **bootRomDto** | [**BootRomDto**](BootRomDto.md)| 配置的设备BootROM密码。 |

### Return type

[**BootRomResponse**](BootRomResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

