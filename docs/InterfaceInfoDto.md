
# InterfaceInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interfaceId** | **String** | 接口ID，UUID格式。 |  [optional]
**ifIndex** | **Integer** | 接口索引。 |  [optional]
**ifName** | **String** | 接口名称。 |  [optional]
**deviceId** | **String** | 设备ID，UUID格式。 |  [optional]
**ifOperStatus** | [**IfOperStatusEnum**](#IfOperStatusEnum) | 接口运行态。 |  [optional]
**ifAdminStatus** | [**IfAdminStatusEnum**](#IfAdminStatusEnum) | 接口管理态。 |  [optional]
**ipAddress** | **String** | 接口IP地址。 |  [optional]
**ifSpeeds** | **String** | 接口速率，单位是bps。 |  [optional]
**ifMtu** | **String** | 接口mtu，单位是Bytes。 |  [optional]
**ifDuplexModel** | [**IfDuplexModelEnum**](#IfDuplexModelEnum) | 双工模式。 |  [optional]
**ifType** | [**IfTypeEnum**](#IfTypeEnum) | 接口类型。 |  [optional]


<a name="IfOperStatusEnum"></a>
## Enum: IfOperStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
TESTING | &quot;TESTING&quot;
UNKOWN | &quot;UNKOWN&quot;
DORMANT | &quot;DORMANT&quot;
NOTPRESENT | &quot;NOTPRESENT&quot;
LOWLAYERDOWN | &quot;LOWLAYERDOWN&quot;


<a name="IfAdminStatusEnum"></a>
## Enum: IfAdminStatusEnum
Name | Value
---- | -----
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;


<a name="IfDuplexModelEnum"></a>
## Enum: IfDuplexModelEnum
Name | Value
---- | -----
FULL | &quot;FULL&quot;
HALF | &quot;HALF&quot;
AUTO | &quot;AUTO&quot;
AUTOFULL | &quot;AUTOFULL&quot;
AUTOHALF | &quot;AUTOHALF&quot;


<a name="IfTypeEnum"></a>
## Enum: IfTypeEnum
Name | Value
---- | -----
STACK_PORT | &quot;STACK-PORT&quot;
ETHERNET | &quot;ETHERNET&quot;
ETH_TRUNK | &quot;ETH-TRUNK&quot;
VIRTUAL_ETHERNET | &quot;VIRTUAL_ETHERNET&quot;
ATM | &quot;ATM&quot;
POS | &quot;POS&quot;
SERIAL | &quot;SERIAL&quot;
VLANIF | &quot;VLANIF&quot;
E1 | &quot;E1&quot;
T1 | &quot;T1&quot;
CPOS | &quot;CPOS&quot;
TUNNEL | &quot;TUNNEL&quot;
LOOPBACK | &quot;LOOPBACK&quot;
IP_TRUNK | &quot;IP-TRUNK&quot;
VIRTUAL_TEMPLATE | &quot;VIRTUAL-TEMPLATE&quot;
RING_IF | &quot;RING-IF&quot;
MFR | &quot;MFR&quot;
MP_GROUP | &quot;MP-GROUP&quot;
AUX | &quot;AUX&quot;
E3 | &quot;E3&quot;
T3 | &quot;T3&quot;
METH | &quot;METH&quot;
NULL | &quot;NULL&quot;
IRPR | &quot;IRPR&quot;
EPON | &quot;EPON&quot;
WLAN_ESS | &quot;WLAN-ESS&quot;
RSERVED1 | &quot;RSERVED1&quot;
WLAN_DBSS | &quot;WLAN-DBSS&quot;
WLAN_MESH | &quot;WLAN-MESH&quot;
VBDIF | &quot;VBDIF&quot;
NVE | &quot;NVE&quot;



