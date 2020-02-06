# AspfNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAspfConfig**](AspfNorthboundApi.md#getAspfConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/fwaspf/sites/{siteId} | 查询ASPF配置
[**modifyAspfConfig**](AspfNorthboundApi.md#modifyAspfConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/fwaspf/sites/{siteId} | 修改ASPF配置


<a name="getAspfConfig"></a>
# **getAspfConfig**
> AspfConfigRespDto getAspfConfig(siteId)

查询ASPF配置

## 典型场景 ##    提供查询ASPF配置参数的接口。 ## 接口功能 ##    查询ASPF配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AspfNorthboundApi;


AspfNorthboundApi apiInstance = new AspfNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    AspfConfigRespDto result = apiInstance.getAspfConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AspfNorthboundApi#getAspfConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**AspfConfigRespDto**](AspfConfigRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyAspfConfig"></a>
# **modifyAspfConfig**
> AspfConfigRespDto modifyAspfConfig(siteId, body)

修改ASPF配置

## 典型场景 ##    提供修改ASPF配置参数的接口。 ## 接口功能 ##    修改ASPF配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AspfNorthboundApi;


AspfNorthboundApi apiInstance = new AspfNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
AspfConfigDto body = new AspfConfigDto(); // AspfConfigDto | ASPF入参配置结构体。
try {
    AspfConfigRespDto result = apiInstance.modifyAspfConfig(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AspfNorthboundApi#modifyAspfConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**AspfConfigDto**](AspfConfigDto.md)| ASPF入参配置结构体。 |

### Return type

[**AspfConfigRespDto**](AspfConfigRespDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

