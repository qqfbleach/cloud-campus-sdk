
# PortalContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authTypeSelection** | [**AuthTypeSelectionEnum**](#AuthTypeSelectionEnum) | Portal认证类型。目前只支持portalController。 | 
**fastPushEnable** | **Boolean** | 使能快速推送。 |  [optional]
**portalPageId** | **String** | 页面推送模板ID。当fastPushEnable为true时，portalPageId必填。 |  [optional]
**wechatEnable** | **Boolean** | 使能微信认证。当fastPushEnable为false时，wechatEnable生效。若fastPushEnable为true，则必须先配置微信认证参数。 |  [optional]
**anonymousEnable** | **Boolean** | 使能匿名认证。当fastPushEnable为false时，anonymousEnable生效。 |  [optional]
**passCodeEnable** | **Boolean** | 使能passCode认证。当fastPushEnable为false时，passCodeEnable生效。 |  [optional]
**socialMediaEnable** | **Boolean** | 使能facebook认证。若值为true，则必须先配置facebook认证参数。当fastPushEnable为false时，socialMediaEnable生效。 |  [optional]
**normalEnable** | **Boolean** | 使能用户名密码认证。当fastPushEnable为false时，normalEnable生效。 |  [optional]
**registerEnable** | **Boolean** | 用户自注册使能。当normalEnable为true时，registerEnable生效。 |  [optional]
**registerExpireUnit** | [**RegisterExpireUnitEnum**](#RegisterExpireUnitEnum) | 用户注册有效期单位。当registerEnable为true时，registerExpireUnit生效。 |  [optional]
**registerExpire** | **Integer** | 用户注册有效期。当registerEnable为true时，registerExpire生效。当registerExpireUnit为minute时，registerExpire取值范围为1~59。当registerExpireUnit为hour时，registerExpire取值范围为1~23。当registerExpireUnit为day时，registerExpire取值范围为1~365。 |  [optional]
**userRegisterMaxAccessNumber** | **Integer** | 用户最大接入数。当registerEnable为true时，userRegisterMaxAccessNumber生效。 |  [optional]
**userGroupId** | **String** | 用户名密码认证的自注册用户注册后所属的用户组ID，UUID格式。当registerEnable为true时，userGroupId生效。 |  [optional]
**userGroupName** | **String** | 用户名密码认证的自注册用户注册后所属的用户组名称。当registerEnable为true时，userGroupName生效。 |  [optional]
**freeAuthMode** | [**FreeAuthModeEnum**](#FreeAuthModeEnum) | 有效期内免认证方式。mac表示开启免认证，reAuth则表示不开启免认证。 | 
**authExpire** | **Integer** | Portal认证有效期，当freeAuthMode为mac时，authExpire必填。当authExpireUnit为minute时，authExpire取值范围为1~59。当authExpireUnit为hour时，authExpire取值范围为1~23。当authExpireUnit为day时，authExpire取值范围为1~365。 |  [optional]
**authExpireUnit** | [**AuthExpireUnitEnum**](#AuthExpireUnitEnum) | Portal认证有效期单位，当freeAuthMode为mac时，authExpireUnit必填。只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。 |  [optional]
**smsAuthEnable** | **Boolean** | 是否启用短信认证。若smsAuthEnable值为true，则必须配置短信服务器。当fastPushEnable为false时，smsAuthEnable生效。 |  [optional]
**smsUserExpire** | **Integer** | 短信认证用户有效期，当smsAuthEnable为true时，smsUserExpire生效。当smsUserExpireUnit为minute时，smsUserExpire取值范围为1~59。当smsUserExpireUnit为hour时，smsUserExpire取值范围为1~23。当smsUserExpireUnit为day时，smsUserExpire取值范围为1~365。 |  [optional]
**smsUserExpireUnit** | [**SmsUserExpireUnitEnum**](#SmsUserExpireUnitEnum) | 短信认证用户有效期单位只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。当smsAuthEnable为true时，smsUserExpireUnit生效。 |  [optional]
**smsUserMaxAccessNumber** | **Integer** | 短信认证用户最大接入数。当smsAuthEnable为true时，smsUserMaxAccessNumber生效。 |  [optional]
**smsPasswordExpire** | **Integer** | 密码有效期。当smsAuthEnable为true时，smsUserMaxAccessNumber生效。当smsPasswordExpireUnit为minute时，smsPasswordExpire取值范围为1~59。当smsPasswordExpireUnit为hour时，smsPasswordExpire取值范围为1~23。当smsPasswordExpireUnit为day时，smsPasswordExpire取值范围为1~365。 |  [optional]
**smsPasswordExpireUnit** | [**SmsPasswordExpireUnitEnum**](#SmsPasswordExpireUnitEnum) | 密码有效期单位。只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。当smsAuthEnable为true时，smsUserMaxAccessNumber生效。 |  [optional]
**smsUserGroupId** | **String** | 短信认证用户所属组ID，UUID格式。当smsAuthEnable为true时，smsUserMaxAccessNumber生效。 |  [optional]
**smsUserGroupName** | **String** | 短信认证用户所属组名。当smsAuthEnable为true时，smsUserMaxAccessNumber生效。 |  [optional]
**accountingEnable** | **Boolean** | 使能实时计费。 | 
**accountingExpire** | **Integer** | 实时计费上报周期。当accountingExpireUnit为minute时，范围为1~65535。 accountingEnable为true时，accountingExpire生效。 |  [optional]
**accountingExpireUnit** | [**AccountingExpireUnitEnum**](#AccountingExpireUnitEnum) | 实时计费上报周期单位，只能为minute，大小写不敏感，前后空格忽略，且不能含有全角字符。accountingEnable为true时，accountingExpireUnit生效。 |  [optional]
**ipV6AuthEnable** | **Boolean** | IPV6是否开启。 |  [optional]
**escapeStrategy** | [**EscapeStrategyEnum**](#EscapeStrategyEnum) | 逃生策略。noNew：允许已认证用户继续使用网络，新用户不允许接入。默认值。noAuth：允许已认证用户继续使用网络，新用户需要输入PPSK密钥。注意：此时PPSK用户数控制MCA自动绑定功失效。  | 


<a name="AuthTypeSelectionEnum"></a>
## Enum: AuthTypeSelectionEnum
Name | Value
---- | -----
PORTALCONTROLLER | &quot;portalController&quot;


<a name="RegisterExpireUnitEnum"></a>
## Enum: RegisterExpireUnitEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;


<a name="FreeAuthModeEnum"></a>
## Enum: FreeAuthModeEnum
Name | Value
---- | -----
MAC | &quot;mac&quot;
REAUTH | &quot;reAuth&quot;


<a name="AuthExpireUnitEnum"></a>
## Enum: AuthExpireUnitEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;


<a name="SmsUserExpireUnitEnum"></a>
## Enum: SmsUserExpireUnitEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;


<a name="SmsPasswordExpireUnitEnum"></a>
## Enum: SmsPasswordExpireUnitEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;


<a name="AccountingExpireUnitEnum"></a>
## Enum: AccountingExpireUnitEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;


<a name="EscapeStrategyEnum"></a>
## Enum: EscapeStrategyEnum
Name | Value
---- | -----
NONEW | &quot;noNew&quot;
NOAUTH | &quot;noAuth&quot;



