
# DeviceArStaticrouteInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mask** | **String** | 掩码，0-32。创建后不允许修改。 | 
**description** | **String** | 描述。 |  [optional]
**nextAddress** | **String** | 下一跳地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。当nextInterface为空时，nextAddress必填。 |  [optional]
**destinationIp** | **String** | 目的IP地址，创建后不允许修改。必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。 | 
**priority** | **Integer** | 优先级，取值越小优先级越高。 |  [optional]
**nextInterface** | **String** | 路由出接口。当nextAddress为空时，nextInterface必填。 |  [optional]
**nqaId** | **String** | NQA的ID。 |  [optional]
**nqaAdminName** | **String** | NQA的admin名称。 |  [optional]
**nqaTestName** | **String** | NQA的测试名称。 |  [optional]
**dhcp** | **Boolean** | DHCP开关使能。当nextAddress非空时，dhcp必须为false。 |  [optional]
**nextLogicInterface** | **String** | 逻辑出接口。 |  [optional]
**id** | **String** | 路由器静态路由ID。 |  [optional]



