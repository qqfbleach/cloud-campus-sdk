# LicenseServiceApi

All URIs are relative to *https://localhost/controller/campus/v3/license*

Method | HTTP request | Description
------------- | ------------- | -------------
[**importActiveCode**](LicenseServiceApi.md#importActiveCode) | **PUT** /controller/campus/v3/license/package/activecode/{id} | 导入激活码


<a name="importActiveCode"></a>
# **importActiveCode**
> ImportActiveCodeOut importActiveCode(id, importActiveCodeDto)

导入激活码

## 典型场景 ##  用户为license导入激活码时使用。 ## 接口功能 ##  给license导入激活码，可以选择延期或者扩容方式，默认选择延期方式导入。 ## 接口约束 ##  该接口必须在用户会话建立后使用，本接口响应时间较长，最长300秒。本接口支持单次导入激活码数量上限为10个。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LicenseServiceApi;


LicenseServiceApi apiInstance = new LicenseServiceApi();
String id = "ea25fdbf-8dee-4823-bac2-5bfe8e3359ca"; // String | license的ID。
ImportActiveCodeDto importActiveCodeDto = new ImportActiveCodeDto(); // ImportActiveCodeDto | 导入激活码请求体。
try {
    ImportActiveCodeOut result = apiInstance.importActiveCode(id, importActiveCodeDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseServiceApi#importActiveCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| license的ID。 |
 **importActiveCodeDto** | [**ImportActiveCodeDto**](ImportActiveCodeDto.md)| 导入激活码请求体。 |

### Return type

[**ImportActiveCodeOut**](ImportActiveCodeOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

