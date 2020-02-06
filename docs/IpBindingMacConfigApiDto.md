
# IpBindingMacConfigApiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**staticIpAddress** | **String** | IP地址，不能与列表中其他IP重复。IP为上面网段（IP+mask计算得出）中的可分配IP地址，且不能为网关IP（上面配置IP）。 | 
**staticMacAddress** | **String** | MAC地址，不能与列表中其他MAC地址重复。MAC不能为广播（全F），组播（第一段2进制表示以“1”结尾）。 | 



