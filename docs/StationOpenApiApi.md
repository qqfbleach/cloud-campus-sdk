# StationOpenApiApi

All URIs are relative to *https://localhost/controller/campus/v1/performanceservice/station*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryDeviceStationInfo**](StationOpenApiApi.md#queryDeviceStationInfo) | **GET** /controller/campus/v1/performanceservice/station/client/device/{deviceId} | 查询设备维度下终端用户信息
[**querySiteStationInfo**](StationOpenApiApi.md#querySiteStationInfo) | **GET** /controller/campus/v1/performanceservice/station/client/site/{siteId} | 查询站点维度下终端用户信息
[**queryTrafficStatisticInfo**](StationOpenApiApi.md#queryTrafficStatisticInfo) | **GET** /controller/campus/v1/performanceservice/station/traffic/statistic/site/{siteId} | 查询站点维度下TopN终端流量数据


<a name="queryDeviceStationInfo"></a>
# **queryDeviceStationInfo**
> StationDataResp queryDeviceStationInfo(deviceId, pageIndex, pageSize, status, terminalMac, terminalIP, ssid, sortKey, account)

查询设备维度下终端用户信息

## 典型场景 ##    设备维度下终端用户信息查询接口。 ## 接口功能 ##    基于单设备查询用户列表。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.StationOpenApiApi;


StationOpenApiApi apiInstance = new StationOpenApiApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
Integer pageIndex = 1; // Integer | 分页查询的页码。
Integer pageSize = 20; // Integer | 分页查询每页数量。
String status = "status_example"; // String | 用户在线状态，online---在线、offline---离线，不填代表查询全部状态。
String terminalMac = "b006-000a-69f5"; // String | 终端MAC。
String terminalIP = "192.168.1.2"; // String | 终端IP。
String ssid = "wifi"; // String | WiFi名。
String sortKey = "+accessTime"; // String | 排序列，所有支持accessTime/accessType/account/ap/authType/channel/cumulativeTraffic/downwardSpeed/dualFrequency/frequencyBand/hostName/mode/onlineStatus/onlineTime/packageLossRate/retransRate/rssi/sendPackageSpeed/signalNoiseRatio/ssid/stickyTags/terminalIP/terminalMac/timeStamp/upwardSpeed/vlan均支持排序。如：+accessTime:按accesstime升序，-accessTime:按accessTime降序。
String account = "test"; // String | 用户名。
try {
    StationDataResp result = apiInstance.queryDeviceStationInfo(deviceId, pageIndex, pageSize, status, terminalMac, terminalIP, ssid, sortKey, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationOpenApiApi#queryDeviceStationInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **pageIndex** | **Integer**| 分页查询的页码。 |
 **pageSize** | **Integer**| 分页查询每页数量。 |
 **status** | **String**| 用户在线状态，online---在线、offline---离线，不填代表查询全部状态。 | [optional] [enum: online, offline]
 **terminalMac** | **String**| 终端MAC。 | [optional]
 **terminalIP** | **String**| 终端IP。 | [optional]
 **ssid** | **String**| WiFi名。 | [optional]
 **sortKey** | **String**| 排序列，所有支持accessTime/accessType/account/ap/authType/channel/cumulativeTraffic/downwardSpeed/dualFrequency/frequencyBand/hostName/mode/onlineStatus/onlineTime/packageLossRate/retransRate/rssi/sendPackageSpeed/signalNoiseRatio/ssid/stickyTags/terminalIP/terminalMac/timeStamp/upwardSpeed/vlan均支持排序。如：+accessTime:按accesstime升序，-accessTime:按accessTime降序。 | [optional]
 **account** | **String**| 用户名。 | [optional]

### Return type

[**StationDataResp**](StationDataResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="querySiteStationInfo"></a>
# **querySiteStationInfo**
> StationDataResp querySiteStationInfo(siteId, pageIndex, pageSize, status, terminalMac, terminalIP, ssid, sortKey, account)

查询站点维度下终端用户信息

## 典型场景 ##    提供站点维度查询终端用户信息列表的接口。 ## 接口功能 ##    基于站点查询终端用户列表。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.StationOpenApiApi;


StationOpenApiApi apiInstance = new StationOpenApiApi();
UUID siteId = new UUID(); // UUID | 站点ID。
Integer pageIndex = 1; // Integer | 分页查询的页码。
Integer pageSize = 20; // Integer | 分页查询每页数量。
String status = "status_example"; // String | 用户在线状态，online---在线、offline---离线，不填代表查询全部状态。
String terminalMac = "B0:06:00:0A:69:F5"; // String | 终端MAC，需要符合MAC地址的格式，例如B0:06:00:0A:69:F5，需要区分大小写字母。
String terminalIP = "192.168.1.2"; // String | 终端IP，需要符合IP地址的格式，例如192.168.1.2。
String ssid = "wifi"; // String | SSID名称。
String sortKey = "+accessTime"; // String | 排序字段名称以及排序方式。支持按如下字段之一排序：accessTime/accessType/account/deviceName/authType/channel/cumulativeTraffic/downwardSpeed/dualFrequency/frequencyBand/hostName/mode/onlineStatus/onlineTime/packageLossRate/retransRate/rssi/sendPackageSpeed/signalNoiseRatio/ssid/stickyTags/terminalIP/terminalMac/timeStamp/upwardSpeed/vlan。如：+accessTime:按accesstime升序，-accessTime:按accessTime降序。
String account = "user1"; // String | 用户名称。
try {
    StationDataResp result = apiInstance.querySiteStationInfo(siteId, pageIndex, pageSize, status, terminalMac, terminalIP, ssid, sortKey, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationOpenApiApi#querySiteStationInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **pageIndex** | **Integer**| 分页查询的页码。 |
 **pageSize** | **Integer**| 分页查询每页数量。 |
 **status** | **String**| 用户在线状态，online---在线、offline---离线，不填代表查询全部状态。 | [optional] [enum: online, offline]
 **terminalMac** | **String**| 终端MAC，需要符合MAC地址的格式，例如B0:06:00:0A:69:F5，需要区分大小写字母。 | [optional]
 **terminalIP** | **String**| 终端IP，需要符合IP地址的格式，例如192.168.1.2。 | [optional]
 **ssid** | **String**| SSID名称。 | [optional]
 **sortKey** | **String**| 排序字段名称以及排序方式。支持按如下字段之一排序：accessTime/accessType/account/deviceName/authType/channel/cumulativeTraffic/downwardSpeed/dualFrequency/frequencyBand/hostName/mode/onlineStatus/onlineTime/packageLossRate/retransRate/rssi/sendPackageSpeed/signalNoiseRatio/ssid/stickyTags/terminalIP/terminalMac/timeStamp/upwardSpeed/vlan。如：+accessTime:按accesstime升序，-accessTime:按accessTime降序。 | [optional]
 **account** | **String**| 用户名称。 | [optional]

### Return type

[**StationDataResp**](StationDataResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryTrafficStatisticInfo"></a>
# **queryTrafficStatisticInfo**
> TrafficStatisticDataResp queryTrafficStatisticInfo(siteId, deviceType, timeDimension, top, beginTime, endTime)

查询站点维度下TopN终端流量数据

## 典型场景 ##    提供查询指定站点的按照终端流量大小的Top N终端数据。 ## 接口功能 ##    基于站点查询TopN终端流量数据。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.StationOpenApiApi;


StationOpenApiApi apiInstance = new StationOpenApiApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String deviceType = "AP"; // String | 查询过滤的设备类型，AP---AP设备、FW---FW设备、AC---AC（Fit AP）设备、ALL---所有设备。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月、year---年。
Integer top = 5; // Integer | top数据个数，支持0、5、10、15、20。0代表查询所有终端流量。
Long beginTime = 1537408636L; // Long | 起始格林威治时间。
Long endTime = 1537495036L; // Long | 结束格林威治时间。
try {
    TrafficStatisticDataResp result = apiInstance.queryTrafficStatisticInfo(siteId, deviceType, timeDimension, top, beginTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationOpenApiApi#queryTrafficStatisticInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **deviceType** | **String**| 查询过滤的设备类型，AP---AP设备、FW---FW设备、AC---AC（Fit AP）设备、ALL---所有设备。 | [enum: AP, FW, AC, ALL]
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月、year---年。 | [enum: day, week, month, year]
 **top** | **Integer**| top数据个数，支持0、5、10、15、20。0代表查询所有终端流量。 | [enum: 0, 5, 10, 15, 20]
 **beginTime** | **Long**| 起始格林威治时间。 |
 **endTime** | **Long**| 结束格林威治时间。 |

### Return type

[**TrafficStatisticDataResp**](TrafficStatisticDataResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

