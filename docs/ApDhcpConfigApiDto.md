
# ApDhcpConfigApiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip** | **String** | 单播IP地址。 | 
**mask** | [**MaskEnum**](#MaskEnum) | 子网掩码。 | 
**tenancyConfig** | [**TenancyConfigApiDto**](TenancyConfigApiDto.md) |  |  [optional]
**masterWins** | **String** | 主wins，单播IP地址（主，备wins不能重复）。 |  [optional]
**slaveWins** | **String** | 备wins，单播IP地址。 |  [optional]
**ipBindingMacConfigList** | [**List&lt;IpBindingMacConfigApiDto&gt;**](IpBindingMacConfigApiDto.md) | 静态绑定列表，最大8条。IP，MAC都不能重复。 |  [optional]
**lanVlanId** | **Integer** | 不能是已配置的业务VLAN，且修改该VLAN会造成NAT、IPSec用户下线。 | 


<a name="MaskEnum"></a>
## Enum: MaskEnum
Name | Value
---- | -----
_252_0 | &quot;255.255.252.0&quot;
_254_0 | &quot;255.255.254.0&quot;
_255_0 | &quot;255.255.255.0&quot;
_255_128 | &quot;255.255.255.128&quot;
_255_192 | &quot;255.255.255.192&quot;
_255_224 | &quot;255.255.255.224&quot;
_255_240 | &quot;255.255.255.240&quot;
_255_248 | &quot;255.255.255.248&quot;
_255_252 | &quot;255.255.255.252&quot;



