
# CreateTacacsTmplInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 名称（不支持$&amp;?&#x3D;+%][^_,#\\相关特殊字符）。 | 
**description** | **String** | 描述。 |  [optional]
**masterAuthenServerIp** | **String** | 主认证服务器IP地址。 | 
**masterAuthenServerPort** | **Integer** | 主认证服务器端口。 | 
**slaveAuthenServerIp** | **String** | 备认证服务器IP地址。 |  [optional]
**slaveAuthenServerPort** | **Integer** | 备认证服务器端口。 |  [optional]
**masterAuthorServerIp** | **String** | 主授权服务器IP地址。 |  [optional]
**masterAuthorServerPort** | **Integer** | 主授权服务器端口。 |  [optional]
**slaveAuthorServerIp** | **String** | 备授权服务器IP地址。 |  [optional]
**slaveAuthorServerPort** | **Integer** | 备授权服务器端口。 |  [optional]
**masterAccServerIp** | **String** | 主计费服务器IP地址。 |  [optional]
**masterAccServerPort** | **Integer** | 主计费服务器端口。 |  [optional]
**slaveAccServerIp** | **String** | 备计费服务器IP地址。 |  [optional]
**slaveAccServerPort** | **Integer** | 备计费服务器端口。 |  [optional]
**includeDomain** | **Boolean** | 向Tacacs服务器发起认证的用户名是否包含域名。 |  [optional]
**shareKey** | **String** | 秘钥（英文字母、数字、除空格和问号外特殊符号，建议长度为6位以上）。 | 



