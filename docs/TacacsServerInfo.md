
# TacacsServerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tacacsEnable** | **Boolean** | 是否应用TACACS服务器模板。 | 
**tacacsServerTmplId** | **String** | TACACS服务器模板ID。字符串为UUID格式。 |  [optional]
**escape** | **List&lt;Integer&gt;** | 逃生策略（0---TACACS认证通道断链后，转入本地模式，1---TACACS授权通道断链后，转入本地模式（TACACS服务器需要配置授权），2---计费（TACACS服务器需要配置计费））。 |  [optional]



