
# UpdateLocalUserInfoRequst

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **String** | 用户密码。 |  [optional]
**role** | **Integer** | 用户角色（1---Monitor User，15---Manager User）。 |  [optional]
**serviceType** | [**List&lt;ServiceTypeEnum&gt;**](#List&lt;ServiceTypeEnum&gt;) | 登录类型（\&quot;http\&quot;，\&quot;ssh\&quot;）。 |  [optional]


<a name="List<ServiceTypeEnum>"></a>
## Enum: List&lt;ServiceTypeEnum&gt;
Name | Value
---- | -----
HTTP | &quot;http&quot;
SSH | &quot;ssh&quot;



