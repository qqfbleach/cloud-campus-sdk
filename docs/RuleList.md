
# RuleList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | 规则优先级编号，仅高级ACL有效且必填。 |  [optional]
**ip** | **String** | IP地址，仅用户ACL有效且必填。与domain共存时，优先级高于domain。 |  [optional]
**domain** | **String** | 域名，仅用户ACL有效且必填。 |  [optional]
**policy** | [**PolicyEnum**](#PolicyEnum) | 策略，aclType为高级acl时有效且必填，有效值permit，deny。 |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | 协议，aclType为高级acl时有效且必填，有效值udp，tcp，any，icmp。 |  [optional]
**srcIp** | **String** | 源IP地址，可以输入Any表示任意IP，仅高级ACL有效且必填。 |  [optional]
**srcPort** | **String** | 源端口号，或源端口段，仅高级ACL有效，范围：整数（例如1000）或者整数段（1-100），且整数和整数段包含的值在0~65535。 |  [optional]
**dstIp** | **String** | 目的IP地址，可以输入Any表示任意IP，仅高级ACL有效且必填。 |  [optional]
**dstPort** | **String** | 目的端口号，或目的端口段，仅高级ACL有效，范围：整数（例如1000）或者整数段（1-100），且整数和整数段包含的值在0~65535。 |  [optional]
**description** | **String** | 规则描述。 |  [optional]


<a name="PolicyEnum"></a>
## Enum: PolicyEnum
Name | Value
---- | -----
PERMIT | &quot;permit&quot;
DENY | &quot;deny&quot;


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
UDP | &quot;udp&quot;
TCP | &quot;tcp&quot;
ANY | &quot;any&quot;
ICMP | &quot;icmp&quot;



