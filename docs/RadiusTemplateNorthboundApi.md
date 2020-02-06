# RadiusTemplateNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/networkservice/networkconfig/profile*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRadiusTemplate**](RadiusTemplateNorthboundApi.md#createRadiusTemplate) | **POST** /controller/campus/v1/networkservice/networkconfig/profile/radius | 创建RADIUS模板
[**deleteRadiusTemplate**](RadiusTemplateNorthboundApi.md#deleteRadiusTemplate) | **POST** /controller/campus/v1/networkservice/networkconfig/profile/radius/batch-delete | 删除RADIUS模板
[**getRadiusTemplate**](RadiusTemplateNorthboundApi.md#getRadiusTemplate) | **GET** /controller/campus/v1/networkservice/networkconfig/profile/radius | 查询RADIUS模板
[**updateRadiusTemplate**](RadiusTemplateNorthboundApi.md#updateRadiusTemplate) | **PUT** /controller/campus/v1/networkservice/networkconfig/profile/radius/{id} | 修改RADIUS模板


<a name="createRadiusTemplate"></a>
# **createRadiusTemplate**
> CreateRadiusTempResponseDto createRadiusTemplate(body)

创建RADIUS模板

## 典型场景 ##    创建RADIUS模板。 ## 接口功能 ##    RADIUS模板创建接口。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.RadiusTemplateNorthboundApi;


RadiusTemplateNorthboundApi apiInstance = new RadiusTemplateNorthboundApi();
CreateRadiusTempDto body = new CreateRadiusTempDto(); // CreateRadiusTempDto | RADIUS服务器模板信息。
try {
    CreateRadiusTempResponseDto result = apiInstance.createRadiusTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadiusTemplateNorthboundApi#createRadiusTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRadiusTempDto**](CreateRadiusTempDto.md)| RADIUS服务器模板信息。 |

### Return type

[**CreateRadiusTempResponseDto**](CreateRadiusTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRadiusTemplate"></a>
# **deleteRadiusTemplate**
> DeleteRadiusTempResponseDto deleteRadiusTemplate(body)

删除RADIUS模板

## 典型场景 ##    删除RADIUS模板信息。 ## 接口功能 ##    RADIUS模板删除接口。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.RadiusTemplateNorthboundApi;


RadiusTemplateNorthboundApi apiInstance = new RadiusTemplateNorthboundApi();
DeleteRadiusTempDto body = new DeleteRadiusTempDto(); // DeleteRadiusTempDto | RADIUS服务器模板ID列表。
try {
    DeleteRadiusTempResponseDto result = apiInstance.deleteRadiusTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadiusTemplateNorthboundApi#deleteRadiusTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRadiusTempDto**](DeleteRadiusTempDto.md)| RADIUS服务器模板ID列表。 |

### Return type

[**DeleteRadiusTempResponseDto**](DeleteRadiusTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRadiusTemplate"></a>
# **getRadiusTemplate**
> GetRadiusTempResponseDto getRadiusTemplate(pageSize, pageIndex)

查询RADIUS模板

## 典型场景 ##    查询RADIUS模板列表信息。 ## 接口功能 ##    RADIUS模板查询接口。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.RadiusTemplateNorthboundApi;


RadiusTemplateNorthboundApi apiInstance = new RadiusTemplateNorthboundApi();
Integer pageSize = 20; // Integer | 每页大小。
Integer pageIndex = 1; // Integer | 页码。
try {
    GetRadiusTempResponseDto result = apiInstance.getRadiusTemplate(pageSize, pageIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadiusTemplateNorthboundApi#getRadiusTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| 每页大小。 | [optional]
 **pageIndex** | **Integer**| 页码。 | [optional]

### Return type

[**GetRadiusTempResponseDto**](GetRadiusTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRadiusTemplate"></a>
# **updateRadiusTemplate**
> UpdateRadiusTempResponseDto updateRadiusTemplate(id, body)

修改RADIUS模板

## 典型场景 ##    修改RADIUS模板。 ## 接口功能 ##    RADIUS模板修改接口。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.RadiusTemplateNorthboundApi;


RadiusTemplateNorthboundApi apiInstance = new RadiusTemplateNorthboundApi();
String id = "fbb684c8-0d37-496f-bafa-4b06db151e2e"; // String | RADIUS服务器模板ID，UUID格式。
UpdateRadiusTempDto body = new UpdateRadiusTempDto(); // UpdateRadiusTempDto | RADIUS服务器模板信息。
try {
    UpdateRadiusTempResponseDto result = apiInstance.updateRadiusTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadiusTemplateNorthboundApi#updateRadiusTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| RADIUS服务器模板ID，UUID格式。 |
 **body** | [**UpdateRadiusTempDto**](UpdateRadiusTempDto.md)| RADIUS服务器模板信息。 |

### Return type

[**UpdateRadiusTempResponseDto**](UpdateRadiusTempResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

