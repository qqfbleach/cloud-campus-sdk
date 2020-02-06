
# LswAuthConfigProfileCore

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authTemplateName** | **String** | 认证模板名称。 | 
**authMode** | [**AuthModeEnum**](#AuthModeEnum) | 认证模式（开放网络，半开放网络---dot1x，安全网络---mac）。 | 
**radiusTemplateId** | **String** | RADIUS模板ID，UUID格式。 |  [optional]
**portal** | [**PortalContent**](PortalContent.md) |  |  [optional]


<a name="AuthModeEnum"></a>
## Enum: AuthModeEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
MAC | &quot;mac&quot;
DOT1X | &quot;dot1x&quot;



