
# SiteTemplateSecurityUrlFilterDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enable** | **Boolean** | 是否使能URL过滤。创建SSID时，若未填写此字段，默认值为false。 |  [optional]
**mode** | **Integer** | URL过滤类型，当enable为true时mode字段必填且有效。 0---黑名单 1---白名单 |  [optional]
**urls** | **List&lt;String&gt;** | URL列表。URL长度4-80个字符，当enable为true时有效。 |  [optional]



