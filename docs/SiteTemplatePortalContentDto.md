
# SiteTemplatePortalContentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**ModeEnum**](#ModeEnum) | 认证方式。 portalDisable---不启用Portal认证。 portalThirdIndirect---云平台中继认证。 | 
**freeAuthEnable** | **Boolean** | 有效期内免认证是否开启，当mode为portalThirdIndirect时必选。 |  [optional]
**authExpireUnit** | **String** | Portal认证有效期单位，当freeAuthEnable为true时必选。只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。 |  [optional]
**authExpire** | **Integer** | Portal认证有效期，当freeAuthEnable为true时必选。 authExpireUnit为minute时，范围为1~59。 authExpireUnit为hour时，范围为1~23。 authExpireUnit为day时，范围为1~365。 |  [optional]
**escapeStrategy** | **Integer** | 逃生策略，当mode为portalThirdIndirect时有效。 1---允许已认证用户继续使用网络，新用户不允许接入，默认值 2---允许用户接入，不需要认证 |  [optional]
**freeAclTmplId** | **String** | 免认证ACL，当mode为portalThirdIndirect时有效。免认证ACL可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。 |  [optional]
**freeAclTmplName** | **String** | 免认证ACL名称，当mode为portalThirdIndirect时有效。POST与PUT操作时，该字段无效。长度为1至32字节。 |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
PORTALDISABLE | &quot;portalDisable&quot;
PORTALTHIRDINDIRECT | &quot;portalThirdIndirect&quot;



