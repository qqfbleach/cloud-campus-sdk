
# SiteTemplateSnmpDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snmpEnable** | **Boolean** | SNMP使能开关。 | 
**protocolVersion** | **String** | 协议版本，只能为V1、V2C、V3其中一种，当snmpEnable为true时，protocolVersion生效且不能为空。 |  [optional]
**groupName** | **String** | 团体名，当snmpEnable为true且protocolVersion为V1或V2C时，groupName生效且不能为空。 |  [optional]
**userInfos** | [**List&lt;UserInfosDto&gt;**](UserInfosDto.md) | 用户列表，当snmpEnable为true且protocolVersion为V3时，userInfos生效且不能为空。 |  [optional]
**aclIps** | **List&lt;String&gt;** | IP地址限定，当snmpEnable为true时，aclIps生效。 |  [optional]
**trapEnable** | **Boolean** | 告警服务器使能开关，当snmpEnable为true时，trapEnable生效。 |  [optional]
**targetHosts** | [**List&lt;TargetHostsDto&gt;**](TargetHostsDto.md) | 告警服务器列表，当trapEnable为true时，targetHosts生效且不能为空。 |  [optional]



