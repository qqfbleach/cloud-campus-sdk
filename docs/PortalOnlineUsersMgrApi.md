# PortalOnlineUsersMgrApi

All URIs are relative to *https://localhost/controller/campus/v1/accountservice*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cutPortalOnlineUsers**](PortalOnlineUsersMgrApi.md#cutPortalOnlineUsers) | **POST** /controller/campus/v1/accountservice/onlineusers/batch-delete | 管理员强制Portal在线用户下线
[**queryPortalOnlineUser**](PortalOnlineUsersMgrApi.md#queryPortalOnlineUser) | **GET** /controller/campus/v1/accountservice/onlineusers | 查询Portal在线用户


<a name="cutPortalOnlineUsers"></a>
# **cutPortalOnlineUsers**
> CutPortalOnlineUserOutputDto cutPortalOnlineUsers(body)

管理员强制Portal在线用户下线

## 典型场景 ##  提供管理员强制Portal在线用户下线北向接口。 ## 接口功能 ##  管理员强制Portal在线用户下线 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PortalOnlineUsersMgrApi;


PortalOnlineUsersMgrApi apiInstance = new PortalOnlineUsersMgrApi();
CutPortalOnlineUserInputDto body = new CutPortalOnlineUserInputDto(); // CutPortalOnlineUserInputDto | 管理员强制Portal在线用户下线参数。
try {
    CutPortalOnlineUserOutputDto result = apiInstance.cutPortalOnlineUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortalOnlineUsersMgrApi#cutPortalOnlineUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CutPortalOnlineUserInputDto**](CutPortalOnlineUserInputDto.md)| 管理员强制Portal在线用户下线参数。 |

### Return type

[**CutPortalOnlineUserOutputDto**](CutPortalOnlineUserOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryPortalOnlineUser"></a>
# **queryPortalOnlineUser**
> List&lt;QueryPortalOnlineUserInfoOutputDto&gt; queryPortalOnlineUser(userType, authMode, pageIndex, pageSize, userName, beginTimeLong, endTimeLong, accessPolicy, terminalIp, terminalMac, ssid, userGroupId, siteId)

查询Portal在线用户

## 典型场景 ##  提供查询Portal在线用户北向接口。 ## 接口功能 ##  查询Portal在线用户列表。默认按照认证时间降序排列。 ## 接口约束 ##  只有租户管理员获取token并建立会话后才能调用该接口。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PortalOnlineUsersMgrApi;


PortalOnlineUsersMgrApi apiInstance = new PortalOnlineUsersMgrApi();
String userType = "-1"; // String | 用户类型： 0---普通用户 1---短信注册用户 2---自注册用户 4---社交媒体用户 5---微信用户 6---Passcode用户 7---第三方用户 11---PPSK 20---普通访客 64---匿名用户 如果不填，查询所有类型。 
String authMode = "0"; // String | 认证方式： 1---Portal认证 2---Mac优先认证 3---第三方认证 4---PPSK 如果不填，查询所有类型。 
Integer pageIndex = 1; // Integer | 起始页。
Integer pageSize = 20; // Integer | 分页大小。
String userName = "user1"; // String | 用户名。用户名使用模糊查询。
Long beginTimeLong = 1541389780672L; // Long | 查询起始时间。
Long endTimeLong = 1541390000000L; // Long | 查询结束时间。
String accessPolicy = "policy_for_guest"; // String | 认证策略名。
String terminalIp = "10.10.10.10"; // String | 认证终端IP。
String terminalMac = "64-80-99-CF-8A-32"; // String | 认证终端MAC。
String ssid = "portal-guest"; // String | SSID
String userGroupId = "2eab8922-a37d-43b2-9788-33caade63b5a"; // String | 用户组ID。
String siteId = "2eab8922-a37d-43b2-9788-33caade63b5a"; // String | 站点ID。
try {
    List<QueryPortalOnlineUserInfoOutputDto> result = apiInstance.queryPortalOnlineUser(userType, authMode, pageIndex, pageSize, userName, beginTimeLong, endTimeLong, accessPolicy, terminalIp, terminalMac, ssid, userGroupId, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortalOnlineUsersMgrApi#queryPortalOnlineUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userType** | **String**| 用户类型： 0---普通用户 1---短信注册用户 2---自注册用户 4---社交媒体用户 5---微信用户 6---Passcode用户 7---第三方用户 11---PPSK 20---普通访客 64---匿名用户 如果不填，查询所有类型。  | [optional] [default to -1] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 11, 20, 64]
 **authMode** | **String**| 认证方式： 1---Portal认证 2---Mac优先认证 3---第三方认证 4---PPSK 如果不填，查询所有类型。  | [optional] [default to 0] [enum: 1, 2, 3, 4]
 **pageIndex** | **Integer**| 起始页。 | [optional] [default to 1]
 **pageSize** | **Integer**| 分页大小。 | [optional] [default to 20]
 **userName** | **String**| 用户名。用户名使用模糊查询。 | [optional]
 **beginTimeLong** | **Long**| 查询起始时间。 | [optional]
 **endTimeLong** | **Long**| 查询结束时间。 | [optional]
 **accessPolicy** | **String**| 认证策略名。 | [optional]
 **terminalIp** | **String**| 认证终端IP。 | [optional]
 **terminalMac** | **String**| 认证终端MAC。 | [optional]
 **ssid** | **String**| SSID | [optional]
 **userGroupId** | **String**| 用户组ID。 | [optional]
 **siteId** | **String**| 站点ID。 | [optional]

### Return type

[**List&lt;QueryPortalOnlineUserInfoOutputDto&gt;**](QueryPortalOnlineUserInfoOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

