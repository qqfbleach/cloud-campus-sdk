# TopoMgrServiceApi

All URIs are relative to *https://localhost/controller/campus/v1/networkresource/topomanager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLacpLagInfo**](TopoMgrServiceApi.md#getLacpLagInfo) | **GET** /controller/campus/v1/networkresource/topomanager/device/{deviceId}/ethtrunk | 查询LACP LAG信息
[**getNeighborsInfo**](TopoMgrServiceApi.md#getNeighborsInfo) | **GET** /controller/campus/v1/networkresource/topomanager/device/{deviceId}/neighbors | 查询LLDP信息


<a name="getLacpLagInfo"></a>
# **getLacpLagInfo**
> LacpLagInfoResultDto getLacpLagInfo(deviceId)

查询LACP LAG信息

## 典型场景 ##  根据设备ID查询LACP LAG信息。 ## 接口功能 ##  查询LACP LAG信息。 ## 接口约束 ##  1、当前仅LSW支持该接口。  2、该接口必须在用户会话建立后使用。  3、该接口需从设备查询信息，数据量大时会导致查询响应慢。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TopoMgrServiceApi;


TopoMgrServiceApi apiInstance = new TopoMgrServiceApi();
String deviceId = "d4e8513d-69f7-41bb-a3f5-b3a0fcc7b6e0"; // String | 设备ID，UUID格式。
try {
    LacpLagInfoResultDto result = apiInstance.getLacpLagInfo(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopoMgrServiceApi#getLacpLagInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |

### Return type

[**LacpLagInfoResultDto**](LacpLagInfoResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNeighborsInfo"></a>
# **getNeighborsInfo**
> NeighborsInfoResultDto getNeighborsInfo(deviceId, localIfName, pageIndex, pageSize)

查询LLDP信息

## 典型场景 ##  根据设备ID查询LLDP信息。 ## 接口功能 ##  查询LLDP信息。 ## 接口约束 ##  1、当前仅LSW和云AP支持该接口。  2、该接口必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.TopoMgrServiceApi;


TopoMgrServiceApi apiInstance = new TopoMgrServiceApi();
String deviceId = "d4e8513d-69f7-41bb-a3f5-b3a0fcc7b6e0"; // String | 设备ID，UUID格式。
String localIfName = "GigabitEthernet0/0/0"; // String | 本端接口名称，值为空时表示查询该设备所有接口的LLDP连接。
Integer pageIndex = 0; // Integer | 分页时，当前页面索引，值<=0时表示获取所有数据。
Integer pageSize = 20; // Integer | 分页时，当前页面设备数据长度；pageIndex为空或<=0时，此参数无意义。
try {
    NeighborsInfoResultDto result = apiInstance.getNeighborsInfo(deviceId, localIfName, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopoMgrServiceApi#getNeighborsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| 设备ID，UUID格式。 |
 **localIfName** | **String**| 本端接口名称，值为空时表示查询该设备所有接口的LLDP连接。 | [optional]
 **pageIndex** | **Integer**| 分页时，当前页面索引，值&lt;&#x3D;0时表示获取所有数据。 | [optional] [default to 0]
 **pageSize** | **Integer**| 分页时，当前页面设备数据长度；pageIndex为空或&lt;&#x3D;0时，此参数无意义。 | [optional] [default to 20]

### Return type

[**NeighborsInfoResultDto**](NeighborsInfoResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

