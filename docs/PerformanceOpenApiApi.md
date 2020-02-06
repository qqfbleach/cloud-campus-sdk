# PerformanceOpenApiApi

All URIs are relative to *https://localhost/controller/campus/v1/performanceservice/basicperformance*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryDeviceCountTrend**](PerformanceOpenApiApi.md#queryDeviceCountTrend) | **GET** /controller/campus/v1/performanceservice/basicperformance/devicecounttrend | 查询租户维度下设备状态历史数据列表
[**queryDeviceStationStatistic**](PerformanceOpenApiApi.md#queryDeviceStationStatistic) | **GET** /controller/campus/v1/performanceservice/basicperformance/station/device/{deviceId} | 查询设备连接终端数历史数据
[**queryDeviceTraffic**](PerformanceOpenApiApi.md#queryDeviceTraffic) | **GET** /controller/campus/v1/performanceservice/basicperformance/devicetraffic/statistic/site/{siteId} | 查询站点维度TopN设备或者全部设备的上行流量、下行流量
[**queryNetworkTraffic**](PerformanceOpenApiApi.md#queryNetworkTraffic) | **GET** /controller/campus/v1/performanceservice/basicperformance/networktraffic | 查询设备网络速率历史数据
[**querySiteStationStatistic**](PerformanceOpenApiApi.md#querySiteStationStatistic) | **GET** /controller/campus/v1/performanceservice/basicperformance/station/sites/{siteId} | 查询站点维度设备连接终端数历史数据
[**singleDevicePerformanceDetail**](PerformanceOpenApiApi.md#singleDevicePerformanceDetail) | **GET** /controller/campus/v1/performanceservice/basicperformance/device/{deviceId} | 查询单设备的性能数据


<a name="queryDeviceCountTrend"></a>
# **queryDeviceCountTrend**
> DeviceCountTrendResp queryDeviceCountTrend(mode, timeDimension, beginTime, endTime)

查询租户维度下设备状态历史数据列表

## 典型场景 ##    提供查询租户维度下设备状态历史数据             ## 接口功能 ##    查询租户维度下设备状态历史数据 ## 接口约束 ##    无。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PerformanceOpenApiApi;


PerformanceOpenApiApi apiInstance = new PerformanceOpenApiApi();
String mode = "tenant"; // String | 查询维度，tenant---租户。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月。
Long beginTime = 1537408636L; // Long | 起始格林威治时间（时间精度对应到秒）。
Long endTime = 1537495036L; // Long | 结束格林威治时间（时间精度对应到秒）。
try {
    DeviceCountTrendResp result = apiInstance.queryDeviceCountTrend(mode, timeDimension, beginTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceOpenApiApi#queryDeviceCountTrend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **String**| 查询维度，tenant---租户。 | [enum: tenant]
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月。 | [enum: day, week, month]
 **beginTime** | **Long**| 起始格林威治时间（时间精度对应到秒）。 |
 **endTime** | **Long**| 结束格林威治时间（时间精度对应到秒）。 |

### Return type

[**DeviceCountTrendResp**](DeviceCountTrendResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryDeviceStationStatistic"></a>
# **queryDeviceStationStatistic**
> DeviceStationStatisticResp queryDeviceStationStatistic(deviceId, timeDimension, beginTime, endTime)

查询设备连接终端数历史数据

## 典型场景 ##    提供查询设备连接终端数历史数据的接口。 ## 接口功能 ##    支持查询设备连接终端数历史数据。 ## 接口约束 ##    无。   

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PerformanceOpenApiApi;


PerformanceOpenApiApi apiInstance = new PerformanceOpenApiApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月、year---年。
Long beginTime = 1537408636L; // Long | 起始格林威治时间（时间精度对应到秒）。
Long endTime = 1537495036L; // Long | 结束格林威治时间（时间精度对应到秒）。
try {
    DeviceStationStatisticResp result = apiInstance.queryDeviceStationStatistic(deviceId, timeDimension, beginTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceOpenApiApi#queryDeviceStationStatistic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月、year---年。 | [enum: day, week, month, year]
 **beginTime** | **Long**| 起始格林威治时间（时间精度对应到秒）。 |
 **endTime** | **Long**| 结束格林威治时间（时间精度对应到秒）。 |

### Return type

[**DeviceStationStatisticResp**](DeviceStationStatisticResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryDeviceTraffic"></a>
# **queryDeviceTraffic**
> DeviceTrafficStatisticResp queryDeviceTraffic(siteId, timeDimension, top, beginTime, endTime)

查询站点维度TopN设备或者全部设备的上行流量、下行流量

## 典型场景 ##    提供查询站点维度TopN设备或者全部设备的上行流量、下行流量的接口。           ## 接口功能 ##    支持查询站点维度TopN设备或者全部设备的上行流量、下行流量。 ## 接口约束 ##    无。   

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PerformanceOpenApiApi;


PerformanceOpenApiApi apiInstance = new PerformanceOpenApiApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月、year---年。
Integer top = 5; // Integer | top数据个数，支持0、5、10、15、20。0代表查询全部设备的上下行流量。
Long beginTime = 1537408636L; // Long | 起始格林威治时间（时间精度对应到秒）。
Long endTime = 1537495036L; // Long | 结束格林威治时间（时间精度对应到秒）。
try {
    DeviceTrafficStatisticResp result = apiInstance.queryDeviceTraffic(siteId, timeDimension, top, beginTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceOpenApiApi#queryDeviceTraffic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月、year---年。 | [enum: day, week, month, year]
 **top** | **Integer**| top数据个数，支持0、5、10、15、20。0代表查询全部设备的上下行流量。 | [enum: 0, 5, 10, 15, 20]
 **beginTime** | **Long**| 起始格林威治时间（时间精度对应到秒）。 |
 **endTime** | **Long**| 结束格林威治时间（时间精度对应到秒）。 |

### Return type

[**DeviceTrafficStatisticResp**](DeviceTrafficStatisticResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryNetworkTraffic"></a>
# **queryNetworkTraffic**
> NetworkTrafficResp queryNetworkTraffic(mode, id, timeDimension, beginTime, endTime)

查询设备网络速率历史数据

## 典型场景 ##    提供查询设备网络速率历史数据的接口。           ## 接口功能 ##    查询设备网络速率历史数据。 ## 接口约束 ##    无。   

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PerformanceOpenApiApi;


PerformanceOpenApiApi apiInstance = new PerformanceOpenApiApi();
String mode = "device"; // String | 查询维度，device---设备、site---站点。
UUID id = new UUID(); // UUID | mode为device时该ID为设备ID，mode为site时，该ID为站点ID。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月。
Long beginTime = 1537408636L; // Long | 起始格林威治时间（时间精度对应到秒）。
Long endTime = 1537495036L; // Long | 结束格林威治时间（时间精度对应到秒）。
try {
    NetworkTrafficResp result = apiInstance.queryNetworkTraffic(mode, id, timeDimension, beginTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceOpenApiApi#queryNetworkTraffic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **String**| 查询维度，device---设备、site---站点。 | [enum: device, site]
 **id** | **UUID**| mode为device时该ID为设备ID，mode为site时，该ID为站点ID。 |
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月。 | [enum: day, week, month]
 **beginTime** | **Long**| 起始格林威治时间（时间精度对应到秒）。 |
 **endTime** | **Long**| 结束格林威治时间（时间精度对应到秒）。 |

### Return type

[**NetworkTrafficResp**](NetworkTrafficResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="querySiteStationStatistic"></a>
# **querySiteStationStatistic**
> SiteStationStatisticResp querySiteStationStatistic(siteId, timeDimension, beginTime, endTime, deviceType)

查询站点维度设备连接终端数历史数据

## 典型场景 ##    提供查询站点维度设备连接终端数历史数据的接口。           ## 接口功能 ##    支持查询站点维度设备连接终端数历史数据。 ## 接口约束 ##    无。   

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PerformanceOpenApiApi;


PerformanceOpenApiApi apiInstance = new PerformanceOpenApiApi();
UUID siteId = new UUID(); // UUID | 站点ID。
String timeDimension = "day"; // String | 统计周期，day---天、week---周、month---月、year---年。
Long beginTime = 1537408636L; // Long | 起始格林威治时间（时间精度对应到秒）。
Long endTime = 1537495036L; // Long | 结束格林威治时间（时间精度对应到秒）。
String deviceType = "AP"; // String | 查询过滤的设备类型，AP---AP设备、FW---FW设备、AC---AC（Fit AP）设备、ALL---所有设备。
try {
    SiteStationStatisticResp result = apiInstance.querySiteStationStatistic(siteId, timeDimension, beginTime, endTime, deviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceOpenApiApi#querySiteStationStatistic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **UUID**| 站点ID。 |
 **timeDimension** | **String**| 统计周期，day---天、week---周、month---月、year---年。 | [enum: day, week, month, year]
 **beginTime** | **Long**| 起始格林威治时间（时间精度对应到秒）。 |
 **endTime** | **Long**| 结束格林威治时间（时间精度对应到秒）。 |
 **deviceType** | **String**| 查询过滤的设备类型，AP---AP设备、FW---FW设备、AC---AC（Fit AP）设备、ALL---所有设备。 | [enum: AP, FW, AC, ALL]

### Return type

[**SiteStationStatisticResp**](SiteStationStatisticResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="singleDevicePerformanceDetail"></a>
# **singleDevicePerformanceDetail**
> DevicePerformanceResp singleDevicePerformanceDetail(deviceId)

查询单设备的性能数据

## 典型场景 ##  查询单个设备基本信息、总流量以及最近一次设备上报的终端连接数、CPU利用率、上行速率、下行速率。           ## 接口功能 ##  单个设备基本信息、总流量以及最近一次设备上报的终端连接数、CPU利用率、上行速率、下行速率。 ## 接口约束 ##  无。   

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PerformanceOpenApiApi;


PerformanceOpenApiApi apiInstance = new PerformanceOpenApiApi();
UUID deviceId = new UUID(); // UUID | 设备ID。
try {
    DevicePerformanceResp result = apiInstance.singleDevicePerformanceDetail(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceOpenApiApi#singleDevicePerformanceDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **UUID**| 设备ID。 |

### Return type

[**DevicePerformanceResp**](DevicePerformanceResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

