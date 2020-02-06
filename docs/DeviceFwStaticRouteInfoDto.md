
# DeviceFwStaticRouteInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mask** | **Integer** | 掩码。 | 
**destinationPrefixIp** | **String** | 目的地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。 |  [optional]
**nextHopAddress** | **String** | 下一跳地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。当nextInterface为空时，nextHopAddress必填。 |  [optional]
**nextInterface** | **String** | 设备出接口。当nextHopAddress为空时，nextInterface必填。 |  [optional]
**trackIplinkId** | **String** | IP链接ID。 |  [optional]
**preference** | **Integer** | 优先级。取值越小，优先等级越高。 |  [optional]
**id** | **String** | 防火墙静态路由ID。 |  [optional]



