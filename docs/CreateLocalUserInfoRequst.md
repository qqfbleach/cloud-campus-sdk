
# CreateLocalUserInfoRequst

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userName** | **String** | 用户名，只支持半角字符，其中?*”不支持。 | 
**password** | **String** | 用户密码。 | 
**role** | **Integer** | 用户角色（1---Monitor User，15---Manager User）。 | 
**serviceType** | [**List&lt;ServiceTypeEnum&gt;**](#List&lt;ServiceTypeEnum&gt;) | 登录类型（\&quot;http\&quot;，\&quot;ssh\&quot;）。 | 


<a name="List<ServiceTypeEnum>"></a>
## Enum: List&lt;ServiceTypeEnum&gt;
Name | Value
---- | -----
HTTP | &quot;http&quot;
SSH | &quot;ssh&quot;



