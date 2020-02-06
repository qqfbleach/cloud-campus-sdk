# CampusSWOperationOpenapiApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFanInfo**](CampusSWOperationOpenapiApi.md#getFanInfo) | **GET** /controller/campus/v1/oamservice/faninfo/devices/{id}/frame/{frameNo} | 查询设备风扇信息
[**getPowerInfo**](CampusSWOperationOpenapiApi.md#getPowerInfo) | **GET** /controller/campus/v1/oamservice/powerinfo/devices/{id}/frame/{frameNo} | 查询设备电源信息
[**getResetReason**](CampusSWOperationOpenapiApi.md#getResetReason) | **GET** /controller/campus/v1/oamservice/resetreason/devices/{id}/frame/{frameNo}/board/{boardName} | 查询指定单板复位原因
[**getSystemPowerInfo**](CampusSWOperationOpenapiApi.md#getSystemPowerInfo) | **GET** /controller/campus/v1/oamservice/systempowerinfo/devices/{id}/frame/{frameNo} | 查询设备系统电源信息
[**powerSupply**](CampusSWOperationOpenapiApi.md#powerSupply) | **POST** /controller/campus/v1/oamservice/powersupply | 配置单板上下电
[**queryAllBoards**](CampusSWOperationOpenapiApi.md#queryAllBoards) | **GET** /controller/campus/v1/oamservice/boards/devices/{deviceId}/frame/{frameNo} | 查询插卡框式交换机单板信息
[**queryInterfaceDetail**](CampusSWOperationOpenapiApi.md#queryInterfaceDetail) | **GET** /controller/campus/v1/oamservice/interface/devices/{deviceId}/frame/{frameNo}/slot/{slotNo} | 查询单板接口信息
[**resetBoard**](CampusSWOperationOpenapiApi.md#resetBoard) | **POST** /controller/campus/v1/oamservice/reset/devices/{id}/frame/{frameNo}/board/{boardName} | 复位单板
[**resetChassis**](CampusSWOperationOpenapiApi.md#resetChassis) | **PUT** /controller/campus/v1/oamservice/resetchassis/devices/{deviceId}/frame/{frameNo} | 框式交换机整框重启
[**switchover**](CampusSWOperationOpenapiApi.md#switchover) | **PUT** /controller/campus/v1/oamservice/switchover/{deviceId} | 框式交换机主备倒换


<a name="getFanInfo"></a>
# **getFanInfo**
> GetFanInfoOutputDto getFanInfo(id, frameNo)

查询设备风扇信息

## 典型场景 ##   查询设备风扇信息，支持堆叠设备风扇查询。 ## 接口功能 ##   查询设备风扇信息。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String id = "00000000-0000-0000-0000-000000000000"; // String | 设备ID，UUID格式。
Integer frameNo = 1; // Integer | 机框号。
try {
    GetFanInfoOutputDto result = apiInstance.getFanInfo(id, frameNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#getFanInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 设备ID，UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |

### Return type

[**GetFanInfoOutputDto**](GetFanInfoOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPowerInfo"></a>
# **getPowerInfo**
> GetPowerInfoOutputDto getPowerInfo(id, frameNo)

查询设备电源信息

## 典型场景 ##   查询设备电源信息，支持查询堆叠设备的电源信息。 ## 接口功能 ##   查询设备电源信息。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String id = "00000000-0000-0000-0000-000000000000"; // String | 设备ID，UUID格式。
Integer frameNo = 1; // Integer | 机框号。
try {
    GetPowerInfoOutputDto result = apiInstance.getPowerInfo(id, frameNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#getPowerInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 设备ID，UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |

### Return type

[**GetPowerInfoOutputDto**](GetPowerInfoOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResetReason"></a>
# **getResetReason**
> GetResetReasonOutputDto getResetReason(id, frameNo, boardName)

查询指定单板复位原因

## 典型场景 ##   查询指定单板复位原因。 ## 接口功能 ##   查询指定单板复位原因。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String id = "00000000-0000-0000-0000-000000000000"; // String | 设备ID，UUID格式。
Integer frameNo = 1; // Integer | 机框号。
String boardName = "8"; // String | 槽位名称。
try {
    GetResetReasonOutputDto result = apiInstance.getResetReason(id, frameNo, boardName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#getResetReason");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 设备ID，UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |
 **boardName** | **String**| 槽位名称。 |

### Return type

[**GetResetReasonOutputDto**](GetResetReasonOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSystemPowerInfo"></a>
# **getSystemPowerInfo**
> GetSystemPowerInfoOutputDto getSystemPowerInfo(id, frameNo)

查询设备系统电源信息

## 典型场景 ##   查询设备系统电源信息，支持查询堆叠设备的系统电源信息。 ## 接口功能 ##   查询设备系统电源信息。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String id = "00000000-0000-0000-0000-000000000000"; // String | 设备ID，UUID格式。
Integer frameNo = 1; // Integer | 机框号。
try {
    GetSystemPowerInfoOutputDto result = apiInstance.getSystemPowerInfo(id, frameNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#getSystemPowerInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 设备ID，UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |

### Return type

[**GetSystemPowerInfoOutputDto**](GetSystemPowerInfoOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="powerSupply"></a>
# **powerSupply**
> PowerSupplyOutputDto powerSupply(request)

配置单板上下电

## 典型场景 ##   根据设备ID和单板名称，给指定单板上下电。 ## 接口功能 ##   配置单板上下电。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
PowerSupplyDto request = new PowerSupplyDto(); // PowerSupplyDto | 请求参数。
try {
    PowerSupplyOutputDto result = apiInstance.powerSupply(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#powerSupply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PowerSupplyDto**](PowerSupplyDto.md)| 请求参数。 |

### Return type

[**PowerSupplyOutputDto**](PowerSupplyOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryAllBoards"></a>
# **queryAllBoards**
> BoardsInfoOutputDto queryAllBoards(deviceId, frameNo)

查询插卡框式交换机单板信息

## 典型场景 ##    提供查询框式交换机单板信息接口。 ## 接口功能 ##    基于单板维度查询框式交换机单板信息。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID或堆叠ID，UUID格式。
Integer frameNo = 1; // Integer | 机框号。
try {
    BoardsInfoOutputDto result = apiInstance.queryAllBoards(deviceId, frameNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#queryAllBoards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID或堆叠ID，UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |

### Return type

[**BoardsInfoOutputDto**](BoardsInfoOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryInterfaceDetail"></a>
# **queryInterfaceDetail**
> InterfacesInfoOutputDto queryInterfaceDetail(deviceId, frameNo, slotNo)

查询单板接口信息

## 典型场景 ##    根据设备ID和槽位号，查询单板接口信息。 ## 接口功能 ##    基于单板维度查询接口信息。 ## 接口约束 ##    该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID或堆叠ID， UUID格式。
Integer frameNo = 1; // Integer | 机框号。
Integer slotNo = 1; // Integer | 单板索引号，槽位号。
try {
    InterfacesInfoOutputDto result = apiInstance.queryInterfaceDetail(deviceId, frameNo, slotNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#queryInterfaceDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID或堆叠ID， UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |
 **slotNo** | **Integer**| 单板索引号，槽位号。 |

### Return type

[**InterfacesInfoOutputDto**](InterfacesInfoOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetBoard"></a>
# **resetBoard**
> ResetBoardOutputDto resetBoard(id, frameNo, boardName)

复位单板

## 典型场景 ##   根据设备ID和单板名称，复位指定单板。 ## 接口功能 ##   复位单板。 ## 接口约束 ##   该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String id = "00000000-0000-0000-0000-000000000000"; // String | 设备ID，UUID格式。
Integer frameNo = 1; // Integer | 机框号。
String boardName = "8"; // String | 槽位名称。
try {
    ResetBoardOutputDto result = apiInstance.resetBoard(id, frameNo, boardName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#resetBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 设备ID，UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |
 **boardName** | **String**| 槽位名称。 |

### Return type

[**ResetBoardOutputDto**](ResetBoardOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetChassis"></a>
# **resetChassis**
> ResetChassisOutputDto resetChassis(deviceId, frameNo)

框式交换机整框重启

## 典型场景 ##    框式交换机整框重启。 ## 接口功能 ##    框式整框重启。 ## 接口约束 ##    北向接口管理员可以访问。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID或堆叠ID， UUID格式。
Integer frameNo = 1; // Integer | 机框号。
try {
    ResetChassisOutputDto result = apiInstance.resetChassis(deviceId, frameNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#resetChassis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID或堆叠ID， UUID格式。 |
 **frameNo** | **Integer**| 机框号。 |

### Return type

[**ResetChassisOutputDto**](ResetChassisOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="switchover"></a>
# **switchover**
> SwitchoverOutputDto switchover(deviceId)

框式交换机主备倒换

## 典型场景 ##    框式交换机主备倒换。 ## 接口功能 ##    框式或者框式堆叠主备倒换。 ## 接口约束 ##    北向接口管理员可以访问。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.CampusSWOperationOpenapiApi;


CampusSWOperationOpenapiApi apiInstance = new CampusSWOperationOpenapiApi();
String deviceId = "ea25fdbf-8dee-4823-bac2-5bfe8e3359cad"; // String | 设备ID或者堆叠ID， UUID格式。
try {
    SwitchoverOutputDto result = apiInstance.switchover(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampusSWOperationOpenapiApi#switchover");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID或者堆叠ID， UUID格式。 |

### Return type

[**SwitchoverOutputDto**](SwitchoverOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

