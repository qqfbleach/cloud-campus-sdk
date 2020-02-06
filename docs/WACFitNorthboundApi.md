# WACFitNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFitAps**](WACFitNorthboundApi.md#addFitAps) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/wac/{acId}/bind-fitaps | 关联指定的WAC设备和Fit AP列表
[**deleteFitAps**](WACFitNorthboundApi.md#deleteFitAps) | **PUT** /controller/campus/v1/networkservice/networkconfig/net/wac/{acId}/unbind-fitaps | 解除关联指定的WAC设备和Fit AP列表
[**getFitAps**](WACFitNorthboundApi.md#getFitAps) | **GET** /controller/campus/v1/networkservice/networkconfig/net/wac/{acId}/fitaps | 查询指定的WAC设备下关联的Fit AP列表


<a name="addFitAps"></a>
# **addFitAps**
> WACFitApResponseDto addFitAps(acId, body)

关联指定的WAC设备和Fit AP列表

## 典型场景 ##    提供指定的WAC关联Fit AP的接口。 ## 接口功能 ##    提供指定的WAC关联Fit AP的接口。 ## 接口约束 ##    无。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.WACFitNorthboundApi;


WACFitNorthboundApi apiInstance = new WACFitNorthboundApi();
UUID acId = new UUID(); // UUID | WAC设备ID。
WACFitApDto body = new WACFitApDto(); // WACFitApDto | 添加的Fit AP设备信息。
try {
    WACFitApResponseDto result = apiInstance.addFitAps(acId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WACFitNorthboundApi#addFitAps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acId** | **UUID**| WAC设备ID。 |
 **body** | [**WACFitApDto**](WACFitApDto.md)| 添加的Fit AP设备信息。 |

### Return type

[**WACFitApResponseDto**](WACFitApResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFitAps"></a>
# **deleteFitAps**
> WACFitApResponseDto deleteFitAps(acId, body)

解除关联指定的WAC设备和Fit AP列表

## 典型场景 ##    提供指定的WAC解除关联的Fit AP的接口。 ## 接口功能 ##    提供指定的WAC解除关联的Fit AP的接口。 ## 接口约束 ##    无。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.WACFitNorthboundApi;


WACFitNorthboundApi apiInstance = new WACFitNorthboundApi();
UUID acId = new UUID(); // UUID | WAC或SW设备ID。
WACFitApDto body = new WACFitApDto(); // WACFitApDto | 移除关联的Fit AP设备信息。
try {
    WACFitApResponseDto result = apiInstance.deleteFitAps(acId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WACFitNorthboundApi#deleteFitAps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acId** | **UUID**| WAC或SW设备ID。 |
 **body** | [**WACFitApDto**](WACFitApDto.md)| 移除关联的Fit AP设备信息。 |

### Return type

[**WACFitApResponseDto**](WACFitApResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFitAps"></a>
# **getFitAps**
> WACFitQueryResponseDto getFitAps(acId, pageSize, pageIndex)

查询指定的WAC设备下关联的Fit AP列表

## 典型场景 ##    提供查询指定WAC设备下关联的Fit AP列表的接口。 ## 接口功能 ##    根据指定的WAC设备的ID查询关联的Fit AP列表。 ## 接口约束 ##    无。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.WACFitNorthboundApi;


WACFitNorthboundApi apiInstance = new WACFitNorthboundApi();
UUID acId = new UUID(); // UUID | WAC设备ID。
Integer pageSize = 20; // Integer | 分页的大小。
Integer pageIndex = 1; // Integer | 分页的序号。
try {
    WACFitQueryResponseDto result = apiInstance.getFitAps(acId, pageSize, pageIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WACFitNorthboundApi#getFitAps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acId** | **UUID**| WAC设备ID。 |
 **pageSize** | **Integer**| 分页的大小。 |
 **pageIndex** | **Integer**| 分页的序号。 |

### Return type

[**WACFitQueryResponseDto**](WACFitQueryResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

