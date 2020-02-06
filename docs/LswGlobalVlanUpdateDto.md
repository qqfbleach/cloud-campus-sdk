
# LswGlobalVlanUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vlanId** | **Integer** | VLAN ID。取值范围1~4094整数。 | 
**vlanName** | **String** | VLAN名称。1~31个字符，不能包含空格、制表符、？或中文字符。不允许重复。 |  [optional]
**vlanDesc** | **String** | VLAN描述。可选字段，支持不超过80个字符，不能包含制表符、？和中文字符。 |  [optional]
**ipSubnetVlan** | **List&lt;String&gt;** | IP子网划分VLAN。 |  [optional]
**id** | **String** | 全局VLAN的标识，UUID格式。 | 



