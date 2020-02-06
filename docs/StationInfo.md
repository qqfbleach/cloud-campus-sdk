
# StationInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessTime** | **Long** | 用户接入的格林威治时间，单位：秒。 |  [optional]
**accessType** | **Integer** | 接入类型，0---有线接入，1---无线接入。 |  [optional]
**account** | **String** | 用户名称。 |  [optional]
**deviceName** | **String** | 关联设备的名称。 |  [optional]
**authType** | **String** | 接入设备认证方式。 |  [optional]
**channel** | **Integer** | 无线信道。 |  [optional]
**cumulativeTraffic** | **Long** | 累计上下行流量，单位：字节。 |  [optional]
**downwardSpeed** | **Long** | 下行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。 |  [optional]
**dualFrequency** | **Integer** | 双频能力，0-支持2.4G、1-支持5G。 |  [optional]
**frequencyBand** | **Integer** | 关联频段，1-2.4G、2-5G。 |  [optional]
**hostName** | **String** | 终端设备名称。 |  [optional]
**mode** | **Integer** | 模式，0-802.11b、1-802.11g、2-802.11n、3-802.11a、4-802.11ac。 |  [optional]
**onlineStatus** | **Integer** | 在线状态，1---在线、2---离线。 |  [optional]
**onlineTime** | **Long** | 在线时长，单位：秒。 |  [optional]
**packageLossRate** | **Integer** | 丢包率（上报周期内），单位：百分比。 |  [optional]
**portIndex** | **Integer** | 接入端口索引，不推荐使用。 |  [optional]
**retransRate** | **Integer** | 重传率（上报周期内），单位：百分比。 |  [optional]
**rssi** | **Integer** | 信号强度，单位：dBm。 |  [optional]
**sendPackageSpeed** | **Integer** | 实际发包速率（协商速率），单位：bps。 |  [optional]
**signalNoiseRatio** | **Integer** | 信噪比（上报周期内），单位：dB。 |  [optional]
**ssid** | **String** | SSID名称。 |  [optional]
**stickyTags** | **Integer** | 粘性标记，0---no、1---yes，粘性终端标记含义：信号低、速率低且不漫游的终端。 |  [optional]
**terminalIP** | **String** | 终端IP。 |  [optional]
**terminalMac** | **String** | 终端MAC。 |  [optional]
**upwardSpeed** | **Long** | 上行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。 |  [optional]
**vlan** | **Integer** | 接入VLAN。 |  [optional]



