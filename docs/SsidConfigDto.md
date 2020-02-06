
# SsidConfigDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | SSID名称。 | 
**tags** | [**List&lt;TagDto&gt;**](TagDto.md) | 设备标签列表，总数不能超过10个。如果指定标签列表，SSID会下发给带有列表中标签的设备。如果不指定，会下发给站点所有设备。 |  [optional]
**enable** | **Boolean** | 工作状态开启。 | 
**connectionMode** | [**ConnectionModeEnum**](#ConnectionModeEnum) | 网络连接方式，大小写不敏感，前后空格忽略，且不能含有全角字符。 | 
**vlans** | [**List&lt;VlanDto&gt;**](VlanDto.md) | SSID所属的VLAN配置信息。当vlans参数为空时系统默认生成一条优先级为0的VLAN配置信息。 |  [optional]
**hidedEnable** | **Boolean** | 是否隐藏SSID。 | 
**relativeRadios** | **Integer** | 射频类型。 1 --- 2.4G(wlan-radio 0/0/0)。 2 --- 5G(wlan-radio 0/0/1)。 3 --- 2.4G(wlan-radio 0/0/0)&amp;5G(wlan-radio 0/0/1)。 4 --- 5G(wlan-radio 0/0/2)。 5 --- 2.4G(wlan-radio 0/0/0)&amp;5G(wlan-radio 0/0/2)。 6 --- 5G(wlan-radio 0/0/1)&amp;5G(wlan-radio 0/0/2)。 7 --- 2.4G(wlan-radio 0/0/0)&amp;5G(wlan-radio 0/0/1)&amp;5G(wlan-radio 0/0/2)。 | 
**frequencyNavigation** | **Boolean** | 是否开启频谱导航。 |  [optional]
**maxUserNumber** | **Integer** | 最大用户数。 | 
**userSeparation** | **Boolean** | 是否用户隔离。 | 
**ssidAuth** | [**AuthContentDto**](AuthContentDto.md) |  | 
**ssidPolicy** | [**PolicyContentDto**](PolicyContentDto.md) |  | 
**dot11r** | **Boolean** | 使能802.11r快速漫游功能。 |  [optional]
**reassociateTimeout** | **Integer** | 重新关联的超时时间，单位为秒。 |  [optional]


<a name="ConnectionModeEnum"></a>
## Enum: ConnectionModeEnum
Name | Value
---- | -----
BRIDGE | &quot;bridge&quot;
NAT | &quot;nat&quot;



