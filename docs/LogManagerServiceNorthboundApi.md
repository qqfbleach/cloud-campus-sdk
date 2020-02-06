# LogManagerServiceNorthboundApi

All URIs are relative to *https://localhost/controller/campus/v1/oamservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryLogData**](LogManagerServiceNorthboundApi.md#queryLogData) | **GET** /controller/campus/v1/oamservice/devicelog | 查询设备上报日志记录


<a name="queryLogData"></a>
# **queryLogData**
> QueryResponse queryLogData(pageSize, siteId, beginTime, endTime, startQueryRowKey, sceneName, deviceMac, stationMac)

查询设备上报日志记录

## 典型场景 ##   查询设备上报日志记录。 ## 接口功能 ##   查询设备上报日志记录。 ## 接口约束 ##   只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.LogManagerServiceNorthboundApi;


LogManagerServiceNorthboundApi apiInstance = new LogManagerServiceNorthboundApi();
Integer pageSize = 10; // Integer | 当页大小。
String siteId = "2682da07-fc14-4866-950b-fad73172a4c6"; // String | 站点ID，UUID格式。
Long beginTime = 1541561948L; // Long | 起始格林威治时间，起始与结束时间不可大于5天。
Long endTime = 1541561948L; // Long | 结束时间格林威治时间，起始与结束时间不可大于5天。
String startQueryRowKey = "0,0,0,0,0,2,0,0,0,0,0,1,0,0,0,0,91,87,38,38,65,65,58,65,65,58,65,65,58,48,48,58,50,48,58,52,53,102,102,53,97,48,48,48,48,32,32,32,32,32,32,52,102,48,50,53,48,98,55,97,97,45,98,98,45,51,51,45,52,52,45,53,53,45,54,54"; // String | 起始rowkey，首次查询可输入空值来查询当页数据，翻页查询时输入的值根据前一次返回值中的nextRowkey填入。
String sceneName = "1"; // String | 场景名称。取值范围：不填表示全部场景。 1、Station login and logout：终端上下线。 2、Login and logout of cloud managed device：云盒上下线。 3、Device operation：设备操作。 4、Wireless radio：无线射频。 5、Hardware fault：硬件故障。 
String deviceMac = "AA-AA-AA-00-20-44"; // String | 设备MAC地址，格式必须是xx-xx-xx-xx-xx-xx，支持大小写模糊。
String stationMac = "D8-8F-76-7D-91-12"; // String | 终端MAC地址，格式必须是xx-xx-xx-xx-xx-xx，支持大小写模糊。 入参stationMac有值时，仅查询终端上下线场景范围内的日志。 
try {
    QueryResponse result = apiInstance.queryLogData(pageSize, siteId, beginTime, endTime, startQueryRowKey, sceneName, deviceMac, stationMac);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogManagerServiceNorthboundApi#queryLogData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| 当页大小。 |
 **siteId** | **String**| 站点ID，UUID格式。 |
 **beginTime** | **Long**| 起始格林威治时间，起始与结束时间不可大于5天。 |
 **endTime** | **Long**| 结束时间格林威治时间，起始与结束时间不可大于5天。 |
 **startQueryRowKey** | **String**| 起始rowkey，首次查询可输入空值来查询当页数据，翻页查询时输入的值根据前一次返回值中的nextRowkey填入。 | [optional]
 **sceneName** | **String**| 场景名称。取值范围：不填表示全部场景。 1、Station login and logout：终端上下线。 2、Login and logout of cloud managed device：云盒上下线。 3、Device operation：设备操作。 4、Wireless radio：无线射频。 5、Hardware fault：硬件故障。  | [optional] [enum: 1, 2, 3, 4, 5]
 **deviceMac** | **String**| 设备MAC地址，格式必须是xx-xx-xx-xx-xx-xx，支持大小写模糊。 | [optional]
 **stationMac** | **String**| 终端MAC地址，格式必须是xx-xx-xx-xx-xx-xx，支持大小写模糊。 入参stationMac有值时，仅查询终端上下线场景范围内的日志。  | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

