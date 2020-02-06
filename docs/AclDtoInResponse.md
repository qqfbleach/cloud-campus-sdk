
# AclDtoInResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | ACL模板名称，包括汉字、字母、数字、下划线、.、@、-不能与已有的名称重复。 | 
**aclNumber** | **String** | ACL模板编号，必须为数字，aclType为Advanced时，aclNumber范围：3000-3999，aclType为User时，aclNumber范围：6000-6031。 | 
**description** | **String** | ACL模板描述。 |  [optional]
**aclType** | [**AclTypeEnum**](#AclTypeEnum) | ACL模板类型。 | 
**ruleList** | [**List&lt;RuleList&gt;**](RuleList.md) | 规则列表。 | 
**id** | **String** | ACL模板标识，UUID格式。 | 


<a name="AclTypeEnum"></a>
## Enum: AclTypeEnum
Name | Value
---- | -----
ADVANCED | &quot;Advanced&quot;
USER | &quot;User&quot;



