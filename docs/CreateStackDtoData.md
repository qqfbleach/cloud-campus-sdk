
# CreateStackDtoData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stackName** | **String** | 堆叠名称。如果堆叠名称已存在，则将设备加入堆叠；否则，创建堆叠并加入设备。堆叠名称不能包含\&quot;?\&quot;或者制表符TAB。 | 
**stackMember** | [**List&lt;StackMemberInput&gt;**](StackMemberInput.md) | 堆叠成员。 | 
**stackRoles** | [**StackRolesEnum**](#StackRolesEnum) | 堆叠角色信息。非必填，默认为ACC。 |  [optional]


<a name="StackRolesEnum"></a>
## Enum: StackRolesEnum
Name | Value
---- | -----
GATEWAY | &quot;Gateway&quot;
CORE | &quot;CORE&quot;
GATEWAY_CORE | &quot;Gateway+CORE&quot;
GATEWAY_VRR | &quot;Gateway+vRR&quot;
FIREWALL | &quot;Firewall&quot;
WAC | &quot;WAC&quot;
AGG | &quot;AGG&quot;
ACC | &quot;ACC&quot;
WIRELESS_ACCESS | &quot;Wireless Access&quot;



