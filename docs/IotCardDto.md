
# IotCardDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardName** | **String** | 插卡名称 |  [optional]
**portType** | [**PortTypeEnum**](#PortTypeEnum) | 端口类型。ethernet---以太网口，serial---串口。 | 
**communicationPort** | **Integer** | 通信端口。 |  [optional]
**communicationProtocol** | [**CommunicationProtocolEnum**](#CommunicationProtocolEnum) | 通信协议。 |  [optional]
**shareKey** | **String** | 共享秘钥，至少包含小写字母、大写字母、数字、特殊符号（除问号和空格）中的两种，不能包含全角字符。 |  [optional]
**trustedHostAddress** | **String** | 信任主机地址，格式为IP/掩码。 |  [optional]
**iotServer2** | **String** | 第二通道IoT服务器，支持域名和IP地址。 |  [optional]
**port2** | **Integer** | 第二通道IoT端口。 |  [optional]
**administrativeStatus** | **Boolean** | 使能管理状态。 |  [optional]
**defaultVlan** | **Integer** | 默认放通VLAN。 |  [optional]
**description** | **String** | 描述，不能输入中文和特殊字符。 |  [optional]
**iotServer1Config** | [**List&lt;IotServer1Dto&gt;**](IotServer1Dto.md) |  |  [optional]


<a name="PortTypeEnum"></a>
## Enum: PortTypeEnum
Name | Value
---- | -----
ETHERNET | &quot;ethernet&quot;
SERIAL | &quot;serial&quot;


<a name="CommunicationProtocolEnum"></a>
## Enum: CommunicationProtocolEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
UDP | &quot;udp&quot;



