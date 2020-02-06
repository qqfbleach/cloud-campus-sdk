
# AuthenticationLogDetailOutputDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowKey** | **String** | 数据主键rowkey。 |  [optional]
**accessDeviceGroupName** | **String** | 站点名称。 |  [optional]
**authResult** | **String** | 认证结果（0---成功，1---失败）。 |  [optional]
**onlineTime** | **String** | 用户上线起始时间（接口调用方格林威治时间戳）。 |  [optional]
**offlineTime** | **String** | 用户上线的结束时间（接口调用方格林威治时间戳）。 |  [optional]
**account** | **String** | 用户名。 |  [optional]
**terminalIP** | **String** | 终端IP地址。 |  [optional]
**userGroup** | **String** | 终端用户所属用户组。 |  [optional]
**terminalMac** | **String** | 终端MAC地址。 |  [optional]
**authType** | **String** | 认证方式（1---Portal认证。2---MAC免认证。3---第三方认证）。 |  [optional]
**userType** | **String** | 用户类型（0---普通用户。1---短信用户。2---自注册用户。4---社交媒体用户。5---微信用户。6---Passcode用户。7---第三方用户。20---普通访客。64---匿名用户）。 |  [optional]
**authServerIP** | **String** | 认证服务器IP地址。 |  [optional]
**accessSSID** | **String** | 接入SSID。 |  [optional]
**deviceMac** | **String** | 接入设备MAC地址。 |  [optional]
**deviceIP** | **String** | 接入设备IP。 |  [optional]
**accessPolicy** | **String** | 接入授权策略。 |  [optional]



