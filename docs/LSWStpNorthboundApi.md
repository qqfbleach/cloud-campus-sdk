# LSWStpNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config**](LSWStpNorthboundApi.md#config) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/lswstp/sites/{siteId}/stp | 全量修改站点内交换机的STP配置
[**delete**](LSWStpNorthboundApi.md#delete) | **POST** /controller/campus/v1/networkservice/networkconfig/net/lswstp/sites/{siteId}/action/batch-delete | 删除站点内交换机的STP配置
[**getConfig**](LSWStpNorthboundApi.md#getConfig) | **GET** /controller/campus/v1/networkservice/networkconfig/net/lswstp/sites/{siteId}/stp | 查询站点内交换机的STP配置
[**increConfig**](LSWStpNorthboundApi.md#increConfig) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/lswstp/sites/{siteId}/stp-increment | 增量修改站点内交换机的STP配置


<a name="config"></a>
# **config**
> StpResponseDto config(siteId, body)

全量修改站点内交换机的STP配置

## 典型场景 ##    提供配置参数的接口，修改交换机STP配置。 ## 接口功能 ##    全量修改交换机STP配置，不支持并发。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpNorthboundApi;


LSWStpNorthboundApi apiInstance = new LSWStpNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
StpDto body = new StpDto(); // StpDto | 站点内交换机的STP配置参数体。
try {
    StpResponseDto result = apiInstance.config(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpNorthboundApi#config");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**StpDto**](StpDto.md)| 站点内交换机的STP配置参数体。 |

### Return type

[**StpResponseDto**](StpResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> StpResponseDto delete(siteId, body)

删除站点内交换机的STP配置

## 典型场景 ##    提供配置参数的接口，删除交换机MSTP配置。    1、若只传入regionId，删除对应的MSTPregion；    2、若只传入regionId和instanceId，则删除指定regionId下的instanceId对应的mstpRegionInstance；    3、若只传入regionId和deviceId，则删除指定regionId下的regionDeviceList中的deviceId，且会删除指定regionID下，所有instance下的deviceId对应的regionInstanceDevice；    4、若传入regionId、instanceId和deviceId，只删除指定regionId下指定instanceId下的regionInstanceDevice，instanceId为0的树无法删除。 ## 接口功能 ##    删除交换机STP配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpNorthboundApi;


LSWStpNorthboundApi apiInstance = new LSWStpNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
DelStpDto body = new DelStpDto(); // DelStpDto | 站点内交换机的STP配置参数体。
try {
    StpResponseDto result = apiInstance.delete(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpNorthboundApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**DelStpDto**](DelStpDto.md)| 站点内交换机的STP配置参数体。 |

### Return type

[**StpResponseDto**](StpResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfig"></a>
# **getConfig**
> StpResponseDto getConfig(siteId)

查询站点内交换机的STP配置

## 典型场景 ##    提供查询配置参数的接口，查询LSW的STP配置信息。 ## 接口功能 ##    获取STP配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpNorthboundApi;


LSWStpNorthboundApi apiInstance = new LSWStpNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
try {
    StpResponseDto result = apiInstance.getConfig(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpNorthboundApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |

### Return type

[**StpResponseDto**](StpResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="increConfig"></a>
# **increConfig**
> StpResponseDto increConfig(siteId, body)

增量修改站点内交换机的STP配置

## 典型场景 ##    提供配置参数的接口，增量修改交换机MSTP配置，根据regionId\\instanceId\\deviceId将输入的内容进行修改，未输入的内容保持不变；若要向树中加入该域未包含的设备，需要同时将该设备加入域（regionDeviceList）中。 ## 接口功能 ##    增量修改交换机STP配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LSWStpNorthboundApi;


LSWStpNorthboundApi apiInstance = new LSWStpNorthboundApi();
UUID siteId = new UUID(); // UUID | 站点ID。
IncreStpDto body = new IncreStpDto(); // IncreStpDto | 站点内交换机的STP配置参数体。
try {
    StpResponseDto result = apiInstance.increConfig(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LSWStpNorthboundApi#increConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **body** | [**IncreStpDto**](IncreStpDto.md)| 站点内交换机的STP配置参数体。 |

### Return type

[**StpResponseDto**](StpResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

