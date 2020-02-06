
# SecurityPolicyConfigDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityAclTmplId** | **String** | 安全ACL模板ID。安全ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。 |  [optional]
**securityAclTmplName** | **String** | ACL模板名称。POST与PUT操作时，该字段无效。 |  [optional]
**ipsecAclTmplId** | **String** | IPSEC ACL模板ID。IPSEC ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。 |  [optional]
**ipsecAclTmplName** | **String** | IPSEC ACL模板名称。POST与PUT操作时，该字段无效。 |  [optional]
**urlFilter** | [**SecurityUrlFilterDto**](SecurityUrlFilterDto.md) |  |  [optional]



