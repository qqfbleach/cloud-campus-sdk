
# SiteTemplateSsidConfigOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | SSID名称。 | 
**enable** | **Boolean** | 工作状态开启。 | 
**timeTemplateId** | **String** | 时间模板ID。时间模板可以通过第三方开放接口https://host:port/controller/campus/v3/networkconfig/timetemplate得到。 |  [optional]
**connectionMode** | [**ConnectionModeEnum**](#ConnectionModeEnum) | 网络连接方式，大小写不敏感，前后空格忽略，且不能含有全角字符。 | 
**vlans** | [**List&lt;SiteTemplateVlanDto&gt;**](SiteTemplateVlanDto.md) | SSID所属的VLAN配置信息。站点模板与站点配置的AP SSID不同，此处站点模板的同一SSID所属VLAN不支持按照标签进行差异化配置，最大仅可以配置一个SiteTemplateVlanDto对象，考虑后续扩展，采用数组方式。 |  [optional]
**hidedEnable** | **Boolean** | 是否隐藏SSID。 | 
**relativeRadios** | **Integer** | 射频类型。 1 --- 2.4G(wlan-radio 0/0/0)。 2 --- 5G(wlan-radio 0/0/1)。 3 --- 2.4G(wlan-radio 0/0/0)&amp;5G(wlan-radio 0/0/1)。 4 --- 5G(wlan-radio 0/0/2)。 5 --- 2.4G(wlan-radio 0/0/0)&amp;5G(wlan-radio 0/0/2)。 6 --- 5G(wlan-radio 0/0/1)&amp;5G(wlan-radio 0/0/2)。 7 --- 2.4G(wlan-radio 0/0/0)&amp;5G(wlan-radio 0/0/1)&amp;5G(wlan-radio 0/0/2)。 | 
**frequencyNavigation** | **Boolean** | 是否开启频谱导航。 |  [optional]
**maxUserNumber** | **Integer** | 最大用户数。 | 
**userSeparation** | **Boolean** | 是否用户隔离。 | 
**ssidAuth** | [**SiteTemplateAuthContentDto**](SiteTemplateAuthContentDto.md) |  | 
**ssidPolicy** | [**SiteTemplatePolicyContentDto**](SiteTemplatePolicyContentDto.md) |  |  [optional]
**dot11r** | **Boolean** | 使能802.11r快速漫游功能。 |  [optional]
**reassociateTimeout** | **Integer** | 重新关联的超时时间，单位为秒。 |  [optional]
**id** | **String** | SSID唯一标识。 |  [optional]


<a name="ConnectionModeEnum"></a>
## Enum: ConnectionModeEnum
Name | Value
---- | -----
BRIDGE | &quot;bridge&quot;
NAT | &quot;nat&quot;



