
# AuthenProfileDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 认证模板ID，UUID格式，创建的时候非必填，更新则不允许修改此值。 |  [optional]
**name** | **String** | 认证模板名称，创建不允许创建相同的名称，更新不允许修改。 | 
**portalEnable** | **Boolean** | portal认证是否使能，默认为false。 | 
**macEnable** | **Boolean** | mac认证是否使能，默认为false。 | 
**dot1xEnable** | **Boolean** | dot1x认证是否使能，默认为false。 | 
**radiusProfileId** | **String** | RADIUS模板ID，UUID格式。 | 
**radiusName** | **String** | RADIUS模板名称，要和radiusProfileId同属于同一个RADIUS模板。 | 
**portalProfileId** | **String** | Portal模板ID，UUID格式。 |  [optional]
**portalName** | **String** | Portal模板名称，要和portalProfileId同属于同一个portal模板。 |  [optional]
**domain** | **String** | 域名称。 |  [optional]
**radiusAuthor** | **Integer** | RADIUS动态授权服务器模式，0表示默认，1表示自定义。 | 
**authorServerAddress** | **String** | 动态授权服务器IP，当radiusAuthor为0时，authorServerAddress不生效；当radiusAuthor为1时，authorServerAddress必填。 |  [optional]
**authorServerKey** | **String** | 动态授权服务器密码，当radiusAuthor为0时，authorServerKey；当radiusAuthor为1时，authorServerKey必填。 |  [optional]
**voiceAuthEnable** | **Boolean** | 话机认证是否使能，默认为false。 |  [optional]



