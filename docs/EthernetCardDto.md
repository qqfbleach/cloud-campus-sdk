
# EthernetCardDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apName** | **String** | AP名称。 |  [optional]
**apEsn** | **String** | AP序列号。 |  [optional]
**interfaceName** | **String** | 接口名称。 |  [optional]
**cardSlot** | **Integer** | 卡槽号。 |  [optional]
**cardStatus** | [**CardStatusEnum**](#CardStatusEnum) | 卡状态。 |  [optional]
**cardConnectStatus** | [**CardConnectStatusEnum**](#CardConnectStatusEnum) | 卡连接状态。 |  [optional]
**interfaceIndex** | **Integer** | 接口索引。 |  [optional]
**deviceId** | **String** | 设备ID，UUID格式。 |  [optional]
**deviceStatus** | **Integer** | 设备状态。取值范围：0---正常，1---告警，2---故障，3---离线，4---未注册。 |  [optional]
**upwardSpeed** | **Long** | 接口上行速率，单位是bps。 |  [optional]
**downwardSpeed** | **Long** | 接口下行速率，单位是bps。 |  [optional]
**upwardTraffic** | **Long** | 接口上行流量，单位是Bytes。 |  [optional]
**downwardTraffic** | **Long** | 接口下行流量，单位是Bytes。 |  [optional]
**receivePackages** | **Long** | 接口上报周期内接收报文数。 |  [optional]
**sendPackages** | **Long** | 接口上报周期内发送报文数。 |  [optional]
**cardIp** | **String** | 插卡IP。 |  [optional]
**cardMac** | **String** | 插卡MAC。 |  [optional]
**cardSn** | **String** | 插卡SN编号。 |  [optional]
**centeralFrequency** | **Long** | 中心频率，单位是GHz。 |  [optional]
**bandWidth** | **Long** | 带宽，单位是Bytes。 |  [optional]
**serverConnectStatus** | **Integer** | 与服务器连接状态，取值范围：0---建联、1---不建联。 |  [optional]


<a name="CardStatusEnum"></a>
## Enum: CardStatusEnum
Name | Value
---- | -----
PRESENT | &quot;present&quot;
ABSENT | &quot;absent&quot;


<a name="CardConnectStatusEnum"></a>
## Enum: CardConnectStatusEnum
Name | Value
---- | -----
MATCH | &quot;match&quot;
MISMATCH | &quot;mismatch&quot;



