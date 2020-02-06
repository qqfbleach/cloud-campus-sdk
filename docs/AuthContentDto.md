
# AuthContentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**ModeEnum**](#ModeEnum) | 关联SSID时的认证模式。 | 
**pskEncryptType** | [**PskEncryptTypeEnum**](#PskEncryptTypeEnum) | 加密模式，当mode为psk或ppsk时必选。大小写不敏感，前后空格忽略，且不能含有全角字符。当mode为ppsk时加密方式不支持wep。 |  [optional]
**securityKey** | **String** | psk密钥，当mode为psk时必选。查询始终为null。 当pskEncryptType为wep时，5位字符与数字组合的字符串。 当pskEncryptType为wpa1AndWpa2或wpa2时，8-63位字母、数字及除问号与空格外的特殊字符组合。 |  [optional]
**securityKeyType** | [**SecurityKeyTypeEnum**](#SecurityKeyTypeEnum) | wpa2加密方法，当pskEncryptType为wpa2时必选，默认值为AES。大小写不敏感，前后空格忽略，且不能含有全角字符。 |  [optional]
**dot1xEncryptType** | [**Dot1xEncryptTypeEnum**](#Dot1xEncryptTypeEnum) | dot1x加密模式，当mode为dot1x时必选。大小写不敏感，前后空格忽略，且不能含有全角字符。 |  [optional]
**portal** | [**PortalContentDto**](PortalContentDto.md) |  |  [optional]
**radius** | [**RadiusContentDto**](RadiusContentDto.md) |  |  [optional]
**macAutoBinding** | **Boolean** | 是否MAC自动绑定。当mode为psk或ppsk时，此参数必填。若值为true，则开启MAC自动绑定。 |  [optional]
**escapeStrategy** | [**EscapeStrategyEnum**](#EscapeStrategyEnum) | 逃生策略。当mode为ppsk时，此参数必填。 noNew：允许已认证用户继续使用网络，新用户不允许接入。默认值。 noAuth：允许已认证用户继续使用网络，新用户需要输入PPSK密钥。注意：此时PPSK用户数控制、MCA自动绑定功失效。  |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
PSK | &quot;psk&quot;
PPSK | &quot;ppsk&quot;
DOT1X | &quot;dot1x&quot;
MAC | &quot;mac&quot;


<a name="PskEncryptTypeEnum"></a>
## Enum: PskEncryptTypeEnum
Name | Value
---- | -----
WEP | &quot;wep&quot;
WPA1ANDWPA2 | &quot;wpa1AndWpa2&quot;
WPA2 | &quot;wpa2&quot;


<a name="SecurityKeyTypeEnum"></a>
## Enum: SecurityKeyTypeEnum
Name | Value
---- | -----
AES | &quot;AES&quot;
AES_TKIP | &quot;AES-TKIP&quot;
TKIP | &quot;TKIP&quot;


<a name="Dot1xEncryptTypeEnum"></a>
## Enum: Dot1xEncryptTypeEnum
Name | Value
---- | -----
WPA1ANDWPA2 | &quot;wpa1AndWpa2&quot;
WPA2 | &quot;wpa2&quot;


<a name="EscapeStrategyEnum"></a>
## Enum: EscapeStrategyEnum
Name | Value
---- | -----
NONEW | &quot;noNew&quot;
NOAUTH | &quot;noAuth&quot;



