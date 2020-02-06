
# CreateTenantDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantName** | **String** | 租户名称。 |  [optional]
**tenantEmail** | **String** | 租户服务邮箱。 |  [optional]
**tenantPhone** | **String** | 租户服务电话。 |  [optional]
**tenantDescription** | **String** | 租户描述。 |  [optional]
**tenantAddress** | **String** | 租户地址。 |  [optional]
**limitAccountNum** | **Integer** | 帐号数量限制，默认值：20。 |  [optional]
**userAccount** | **String** | 租户默认管理员帐号。 |  [optional]
**userEmail** | **String** | 租户默认管理员邮箱，用于接收初始化密码邮件。如未填，将按照租户默认管理员帐号发送邮件。 |  [optional]
**sendInitEmailEnable** | **Boolean** | 是否发送初始化邮件，默认：true。 |  [optional]
**countryCode** | **String** | 国家码，不填默认CN。 |  [optional]
**isLogoInherit** | **Boolean** | 租户logo是否继承自MSP。 |  [optional]
**userPassword** | **String** | 用户密码，如未填，会生成随机密码。 |  [optional]



