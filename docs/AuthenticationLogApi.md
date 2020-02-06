# AuthenticationLogApi

All URIs are relative to *https://localhost/controller/campus/v1/accountservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthenticationLogInfoList**](AuthenticationLogApi.md#getAuthenticationLogInfoList) | **GET** /controller/campus/v1/accountservice/user/authenticationlog | 查询用户上下线日志信息


<a name="getAuthenticationLogInfoList"></a>
# **getAuthenticationLogInfoList**
> getAuthenticationLogInfoList(startRowKey, siteId, authResult, lowerOnlineTime, upperOnlineTime, userName, terminalMac, userType, accessSSID)

查询用户上下线日志信息

## 典型场景 ##  提供租户查询指定时间内用户上下线信息，按分页返回查询结果。例如：查询8月1日至8月7号这段时间哪些用户上线过。 ## 接口功能 ##  根据租户ID查询指定时间内用户上下线信息，每次最多返回101条数据，不足101条时表示当前数据已查询完；等于101条表示后续还有数据。下一页查询以上一次查询返回的endRowKey的值作为本次查询条件startRowKey的值。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.AuthenticationLogApi;


AuthenticationLogApi apiInstance = new AuthenticationLogApi();
String startRowKey = "0000000000000000003000000000000000000100000000000000001529648625738B5F4EF82E97A4BD69FFF258082996290"; // String | 起始rowkey（首次查询为空字符串，分页查询时取上一次查询结果endRowKey的值）。
String siteId = "a91e1696-02a2-4a68-bad4-aa639359c8cf"; // String | 站点ID（使用站点查询接口获取站点ID），格式为UUID。
String authResult = "1"; // String | 认证结果（0---成功，1---失败）。
Long lowerOnlineTime = 1529510400000L; // Long | 用户上线起始时间（接口调用方格林威治时间戳）。
Long upperOnlineTime = 1529683199000L; // Long | 用户上线的结束时间（接口调用方格林威治时间戳）。查询时不允许查询时间跨度大于7天的数据。
String userName = "zhangsan"; // String | 用户名（短信认证则为手机号码）。
String terminalMac = "11-22-33-44-55-66"; // String | 接入终端MAC地址（格式：AA-BB-CC-DD-EE-FF）。
String userType = "1"; // String | 用户类型（0---普通用户。1---短信注册用户。2---自注册用户。4---社交媒体用户。5---微信用户。6---Passcode用户。7---三方用户。20---普通访客。64---匿名用户）。
String accessSSID = "guest"; // String | 接入SSID名称。
try {
    apiInstance.getAuthenticationLogInfoList(startRowKey, siteId, authResult, lowerOnlineTime, upperOnlineTime, userName, terminalMac, userType, accessSSID);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationLogApi#getAuthenticationLogInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startRowKey** | **String**| 起始rowkey（首次查询为空字符串，分页查询时取上一次查询结果endRowKey的值）。 |
 **siteId** | **String**| 站点ID（使用站点查询接口获取站点ID），格式为UUID。 |
 **authResult** | **String**| 认证结果（0---成功，1---失败）。 |
 **lowerOnlineTime** | **Long**| 用户上线起始时间（接口调用方格林威治时间戳）。 |
 **upperOnlineTime** | **Long**| 用户上线的结束时间（接口调用方格林威治时间戳）。查询时不允许查询时间跨度大于7天的数据。 |
 **userName** | **String**| 用户名（短信认证则为手机号码）。 | [optional]
 **terminalMac** | **String**| 接入终端MAC地址（格式：AA-BB-CC-DD-EE-FF）。 | [optional]
 **userType** | **String**| 用户类型（0---普通用户。1---短信注册用户。2---自注册用户。4---社交媒体用户。5---微信用户。6---Passcode用户。7---三方用户。20---普通访客。64---匿名用户）。 | [optional]
 **accessSSID** | **String**| 接入SSID名称。 | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

