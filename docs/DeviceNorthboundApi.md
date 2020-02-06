# DeviceNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchModifyDevices**](DeviceNorthboundApi.md#batchModifyDevices) | **PUT** /controller/campus/v3/devices | 批量修改设备
[**createDevices**](DeviceNorthboundApi.md#createDevices) | **POST** /controller/campus/v3/devices | 创建设备
[**deleteDevices**](DeviceNorthboundApi.md#deleteDevices) | **DELETE** /controller/campus/v3/devices | 删除设备
[**getDeviceModels**](DeviceNorthboundApi.md#getDeviceModels) | **GET** /controller/campus/v3/device-models | 查询设备款型
[**getSiteDevice**](DeviceNorthboundApi.md#getSiteDevice) | **GET** /controller/campus/v3/devices | 查询设备
[**modifyDevices**](DeviceNorthboundApi.md#modifyDevices) | **PUT** /controller/campus/v3/devices/{deviceId} | 修改设备
[**replaceDevice**](DeviceNorthboundApi.md#replaceDevice) | **POST** /controller/campus/v3/devices/replace | 替换设备
[**replaceOriginalDevice**](DeviceNorthboundApi.md#replaceOriginalDevice) | **POST** /controller/campus/v3/devices/replacement | 替换设备款型


<a name="batchModifyDevices"></a>
# **batchModifyDevices**
> BatchModifyDeviceBean batchModifyDevices(batchModifyDeviceDto)

批量修改设备

## 典型场景 ## 批量修改设备的名称、站点等信息。 ## 接口功能 ##   批量修改设备。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
BatchModifyDeviceDto batchModifyDeviceDto = new BatchModifyDeviceDto(); // BatchModifyDeviceDto | 批量修改设备入参模型。
try {
    BatchModifyDeviceBean result = apiInstance.batchModifyDevices(batchModifyDeviceDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#batchModifyDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchModifyDeviceDto** | [**BatchModifyDeviceDto**](BatchModifyDeviceDto.md)| 批量修改设备入参模型。 |

### Return type

[**BatchModifyDeviceBean**](BatchModifyDeviceBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDevices"></a>
# **createDevices**
> CreateDeviceBean createDevices(createDeviceDto)

创建设备

## 典型场景 ##  根据设备ESN、设备名称、设备描述、站点ID等进行设备创建。 ## 接口功能 ##  创建设备。 ## 接口约束 ##  该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
CreateDeviceDto createDeviceDto = new CreateDeviceDto(); // CreateDeviceDto | 创建设备入参信息。
try {
    CreateDeviceBean result = apiInstance.createDevices(createDeviceDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#createDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeviceDto** | [**CreateDeviceDto**](CreateDeviceDto.md)| 创建设备入参信息。 |

### Return type

[**CreateDeviceBean**](CreateDeviceBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDevices"></a>
# **deleteDevices**
> DeleteDeviceBean deleteDevices(deviceIds)

删除设备

## 典型场景 ##  根据设备ID删除设备。 ## 接口功能 ##  删除设备。 ## 接口约束 ##  该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
DeleteDeviceDto deviceIds = new DeleteDeviceDto(); // DeleteDeviceDto | 设备ID列表。
try {
    DeleteDeviceBean result = apiInstance.deleteDevices(deviceIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#deleteDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceIds** | [**DeleteDeviceDto**](DeleteDeviceDto.md)| 设备ID列表。 |

### Return type

[**DeleteDeviceBean**](DeleteDeviceBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceModels"></a>
# **getDeviceModels**
> GetDeviceModelEntityList getDeviceModels()

查询设备款型

## 典型场景 ## 在控制器上查询设备款型信息时使用。 ## 接口功能 ## 查询设备款型信息。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
try {
    GetDeviceModelEntityList result = apiInstance.getDeviceModels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#getDeviceModels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDeviceModelEntityList**](GetDeviceModelEntityList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSiteDevice"></a>
# **getSiteDevice**
> GetDeviceResponseBean getSiteDevice(pageIndex, pageSize, neType, deviceType, siteId, sort, name)

查询设备

## 典型场景 ##   查询设备信息。 ## 接口功能 ##   查询设备信息（真实设备和虚拟设备），包括所属站点、设备类型、设备名称、设备状态等拓扑信息，支持基于站点查询，支持基于字段排序。 ## 接口约束 ##   1、该接口支持租户下北向接口管理访问，必须在用户会话建立后使用;   2、若pageSize和pageIndex参数不传或者为非法参数，则默认按照pageSize&#x3D;1000，pageIndex&#x3D;1返回查询结果。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
Integer pageIndex = 1; // Integer | 分页的序号。
Integer pageSize = 1000; // Integer | 分页的大小。
String neType = "AP,AR"; // String | 设备类型，类型可以是'AR'，'AP'，'LSW'，'FW'，如果多个类型用逗号分隔（如：AR，AP）。不推荐使用，请尽量以deviceType为主。
String deviceType = "AP,AR"; // String | 设备类型，类型可以是'AR'，'AP'，'LSW'，'FW'，如果多个类型用逗号分隔（如：AR，AP）。如果跟neType同时出现，以deviceType为主。
String siteId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359ca"; // String | 站点ID，查询单个站点下设备列表，为空查询所有设备。
String sort = "name"; // String | 排序字段，支持name，esn，deviceModel，deviceType，status，mac，ip，neType，version，description，createTime，registerTime，modifyTime。
String name = "deviceName"; // String | 设备名称模糊查询，支持精确和模糊匹配，不支持正则。
try {
    GetDeviceResponseBean result = apiInstance.getSiteDevice(pageIndex, pageSize, neType, deviceType, siteId, sort, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#getSiteDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIndex** | **Integer**| 分页的序号。 | [optional] [default to 1]
 **pageSize** | **Integer**| 分页的大小。 | [optional] [default to 1000]
 **neType** | **String**| 设备类型，类型可以是&#39;AR&#39;，&#39;AP&#39;，&#39;LSW&#39;，&#39;FW&#39;，如果多个类型用逗号分隔（如：AR，AP）。不推荐使用，请尽量以deviceType为主。 | [optional]
 **deviceType** | **String**| 设备类型，类型可以是&#39;AR&#39;，&#39;AP&#39;，&#39;LSW&#39;，&#39;FW&#39;，如果多个类型用逗号分隔（如：AR，AP）。如果跟neType同时出现，以deviceType为主。 | [optional]
 **siteId** | **String**| 站点ID，查询单个站点下设备列表，为空查询所有设备。 | [optional]
 **sort** | **String**| 排序字段，支持name，esn，deviceModel，deviceType，status，mac，ip，neType，version，description，createTime，registerTime，modifyTime。 | [optional]
 **name** | **String**| 设备名称模糊查询，支持精确和模糊匹配，不支持正则。 | [optional]

### Return type

[**GetDeviceResponseBean**](GetDeviceResponseBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyDevices"></a>
# **modifyDevices**
> ModifyDeviceBean modifyDevices(deviceId, modifyDeviceDto)

修改设备

## 典型场景 ##  修改设备基本信息时使用。 ## 接口功能 ##  修改设备基本信息。 ## 接口约束 ##  该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
String deviceId = "00000000-0000-0000-0000-000000000000"; // String | 设备ID。
ModifyDeviceDto modifyDeviceDto = new ModifyDeviceDto(); // ModifyDeviceDto | 修改设备入参模型。
try {
    ModifyDeviceBean result = apiInstance.modifyDevices(deviceId, modifyDeviceDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#modifyDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID。 |
 **modifyDeviceDto** | [**ModifyDeviceDto**](ModifyDeviceDto.md)| 修改设备入参模型。 |

### Return type

[**ModifyDeviceBean**](ModifyDeviceBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceDevice"></a>
# **replaceDevice**
> CommonResponseBean replaceDevice(replaceDeviceDto)

替换设备

## 操作场景 ##  设备替换。 ## 接口功能 ##  设备替换。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用， 替换前后设备款型必须一致。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
ReplaceDeviceDto replaceDeviceDto = new ReplaceDeviceDto(); // ReplaceDeviceDto | 设备替换入参模型。
try {
    CommonResponseBean result = apiInstance.replaceDevice(replaceDeviceDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#replaceDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replaceDeviceDto** | [**ReplaceDeviceDto**](ReplaceDeviceDto.md)| 设备替换入参模型。 |

### Return type

[**CommonResponseBean**](CommonResponseBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceOriginalDevice"></a>
# **replaceOriginalDevice**
> CommonResponseBean replaceOriginalDevice(replaceOriginalDeviceDto)

替换设备款型

## 典型场景 ##  设备款型替换。 ## 接口功能 ##  支持替换款型，支持无ESN替换 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用， 替换前后设备款型必须一致。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;


DeviceNorthboundApi apiInstance = new DeviceNorthboundApi();
ReplaceOriginalDeviceDto replaceOriginalDeviceDto = new ReplaceOriginalDeviceDto(); // ReplaceOriginalDeviceDto | 设备替换入参模型。
try {
    CommonResponseBean result = apiInstance.replaceOriginalDevice(replaceOriginalDeviceDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceNorthboundApi#replaceOriginalDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replaceOriginalDeviceDto** | [**ReplaceOriginalDeviceDto**](ReplaceOriginalDeviceDto.md)| 设备替换入参模型。 |

### Return type

[**CommonResponseBean**](CommonResponseBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

