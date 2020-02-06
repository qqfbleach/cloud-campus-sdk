
# LSWEthPortDto

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
**name** | **String** | 接口名称。 | 
**autoNegotiationEnable** | **Boolean** | 接口自协商状态，根据款型确定默认值；端口支持自协商时必填。 |  [optional]
**speed** | **String** | 接口速率。可选值：1Gbps，100Mbps，10Mbps，根据款型确定默认值；自协商关闭时必填。 |  [optional]
**duplex** | **String** | 双工模式， 根据款型确定默认值，自协商关闭时必填。取值：half（半双工）；full（全双工）。 |  [optional]
**stormControl** | **Boolean** | 风暴控制使能。 |  [optional]
**stormControlModel** | **String** | 风暴控制模式。取值：packet（包模式），cir（字节模式）。 |  [optional]
**stormControlMaxRate** | **Integer** | 风暴控制包模式最大阈值，单位pps。当stormControl字段值为true时，该字段必填。 |  [optional]
**stormControlMinRate** | **Integer** | 风暴控制包模式最小阈值，单位pps。当stormControl字段值为true时，该字段必填。 |  [optional]
**stormControlInterval** | **Integer** | 风暴控制检测时间间隔，单位s。当stormControl字段值为true时，该字段必填。 |  [optional]
**poe** | **Boolean** | 端口POE使能，支持poe的端口默认值为true；不支持的端口，不能传参。 |  [optional]
**lldp** | **Boolean** | 端口LLDP使能，默认值为true。若思科的交换机款型需要使用LLDP功能，需要将LLDP置为true，同时CDP为true。 |  [optional]
**cdp** | **Boolean** | 端口CDP使能，默认值为false。 |  [optional]
**loopbackDetectEnabled** | **Boolean** | 环路检测使能开关。 |  [optional]
**loopbackDetectAction** | **String** | 环路检测处理动作。取值范围：shutdown，alarm，block，nolearn，quitvlan。 |  [optional]
**loopbackDetectVlans** | **String** | 环路检测Vlan。1-4094范围内的数字或段，最多支持8个vlan |  [optional]



