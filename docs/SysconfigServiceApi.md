# SysconfigServiceApi

All URIs are relative to *https://localhost/controller/campus/v3/configresource*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRadioCountryChannel**](SysconfigServiceApi.md#getRadioCountryChannel) | **GET** /controller/campus/v3/configresource/channels | 查询射频管理国家码


<a name="getRadioCountryChannel"></a>
# **getRadioCountryChannel**
> RadioCountryChannelResult getRadioCountryChannel()

查询射频管理国家码

## 典型场景 ##  查询射频管理国家码。 ## 接口功能 ##  查询射频管理国家码。 ## 接口约束 ##  该接口权限点位于“云管理&gt;开放接口&gt;国家码信道”。  

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.SysconfigServiceApi;


SysconfigServiceApi apiInstance = new SysconfigServiceApi();
try {
    RadioCountryChannelResult result = apiInstance.getRadioCountryChannel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SysconfigServiceApi#getRadioCountryChannel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RadioCountryChannelResult**](RadioCountryChannelResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

