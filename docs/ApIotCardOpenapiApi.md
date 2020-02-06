# ApIotCardOpenapiApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardOperation**](ApIotCardOpenapiApi.md#cardOperation) | **POST** /controller/campus/v1/oamservice/apiot/card/operation | 配置AP网口IOT插卡
[**queryEthernetCardList**](ApIotCardOpenapiApi.md#queryEthernetCardList) | **GET** /controller/campus/v1/oamservice/apiot/ethernetcardlist/sites/{siteId} | 查询AP网口IOT插卡


<a name="cardOperation"></a>
# **cardOperation**
> CardOperationOutputDto cardOperation(requestDto)

配置AP网口IOT插卡

## 典型场景 ##   操作插卡。 ## 接口功能 ##   对插卡进行重启、重置网络配置等操作。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApIotCardOpenapiApi;


ApIotCardOpenapiApi apiInstance = new ApIotCardOpenapiApi();
IotCardOperationDto requestDto = new IotCardOperationDto(); // IotCardOperationDto | IOT插卡信息。
try {
    CardOperationOutputDto result = apiInstance.cardOperation(requestDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIotCardOpenapiApi#cardOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestDto** | [**IotCardOperationDto**](IotCardOperationDto.md)| IOT插卡信息。 |

### Return type

[**CardOperationOutputDto**](CardOperationOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryEthernetCardList"></a>
# **queryEthernetCardList**
> EthernetCardOutputDto queryEthernetCardList(siteId, keyword, pageSize, pageIndex)

查询AP网口IOT插卡

## 典型场景 ##   查询AP网口IOT插卡列表。 ## 接口功能 ##   查询AP网口IOT插卡列表。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.ApIotCardOpenapiApi;


ApIotCardOpenapiApi apiInstance = new ApIotCardOpenapiApi();
String siteId = "00000000-0000-0000-0000-000000000000"; // String | 站点ID，UUID格式。
String keyword = "123"; // String | 搜索关键字。匹配字段：设备ESN，是否必填：否。
Integer pageSize = 20; // Integer | 每页展示数量。是否必填：否。
Integer pageIndex = 1; // Integer | 页面索引。是否必填：否。
try {
    EthernetCardOutputDto result = apiInstance.queryEthernetCardList(siteId, keyword, pageSize, pageIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIotCardOpenapiApi#queryEthernetCardList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| 站点ID，UUID格式。 |
 **keyword** | **String**| 搜索关键字。匹配字段：设备ESN，是否必填：否。 | [optional]
 **pageSize** | **Integer**| 每页展示数量。是否必填：否。 | [optional]
 **pageIndex** | **Integer**| 页面索引。是否必填：否。 | [optional]

### Return type

[**EthernetCardOutputDto**](EthernetCardOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

