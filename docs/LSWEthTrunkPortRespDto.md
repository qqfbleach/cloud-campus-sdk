
# LSWEthTrunkPortRespDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **Boolean** | 接口管理状态（true为undo shutdown，false为shutdown）。 |  [optional]
**description** | **String** | 接口描述。 |  [optional]
**linkType** | **String** | 链路类型，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：access；trunk。 |  [optional]
**defaultVlan** | **Integer** | access类型下缺省VLAN；或trunk类型下pvid。若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**allowPassVlan** | **String** | trunk类型下允许通过VLAN，接口为trunk类型时必填。 |  [optional]
**dhcpSnooping** | **Boolean** | DHCP Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**dhcpSnoopingTrusted** | **Boolean** | 配置接口为DHCP Snooping信任状态，默认为非信任状态。 |  [optional]
**ndSnooping** | **Boolean** | ND Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**ndSnoopingTrusted** | **Boolean** | 配置接口为ND Snooping信任状态，默认为非信任状态。 |  [optional]
**portIsolation** | **Boolean** | 端口隔离使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**stp** | **Boolean** | STP功能状态，取值：true（使能）；false（未使能）。当STP为false时，stpEdgedport自动赋值为normal，传入其他参数无效。 |  [optional]
**stpEdgedport** | **String** | STP边缘端口状态，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：enable（使能）；normal（遵从全局状态）；disable（未使能）。 |  [optional]
**enableRelay** | **Boolean** | 堆叠多主检测场景下，设为检测代理设备。 |  [optional]
**enableMadDetection** | **Boolean** | 堆叠多主检测场景下，代理模式双主检测开关。 |  [optional]
**domainId** | **Integer** | 堆叠多主检测场景下，堆叠域编号，两个堆叠互相检测时，堆叠域编号需不同。 |  [optional]
**naMsgCheck** | **Boolean** | NA报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**nsMsgCheck** | **Boolean** | NS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**rsMsgCheck** | **Boolean** | RS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。 |  [optional]
**ipsgCheck** | **Boolean** | IPSG检测使能开关。 |  [optional]
**daiCheck** | **Boolean** | DAI检测使能开关。 |  [optional]
**ipSubnetVlanEnable** | **Boolean** | IP子网划分Vlan开关。 |  [optional]
**ethTrunkMode** | **String** | ethTrunk接口的工作模式。取值：lacp（lacp模式）；manual（手工模式）。 |  [optional]
**portMemberList** | **List&lt;String&gt;** | EthTrunk接口成员列表。 | 
**name** | **String** | EthTrunk端口名称，必须是Eth-Trunk[数字]的格式，数字最大63。 | 



