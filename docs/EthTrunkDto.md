
# EthTrunkDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lagId** | **Integer** | LAG ID。 |  [optional]
**mode** | **String** | trunk模式：lacp、manual。 |  [optional]
**hash** | **String** | 端口负载均衡的hash算法：dst-ip、dst-mac、src-ip、src-mac、src-dst-ip、src-dst-mac、enhanced、diffluence。 |  [optional]
**leastActive** | **Integer** | Eth-trunk中活动链路数量的下限。 |  [optional]
**maxActive** | **Integer** | 最大激活链路数。 |  [optional]
**opStatus** | **String** | 操作状态：up、down。 |  [optional]
**portCount** | **Integer** | Eth-trunk上行端口数量。 |  [optional]
**sysPrio** | **Integer** | 本地系统优先级。 |  [optional]
**sysId** | **String** | 本地系统ID。 |  [optional]
**interfaces** | [**List&lt;EthTrunkInterfacesDto&gt;**](EthTrunkInterfacesDto.md) | 接口列表。 |  [optional]



