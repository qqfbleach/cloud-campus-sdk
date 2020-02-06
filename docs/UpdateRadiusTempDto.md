
# UpdateRadiusTempDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | RADIUS模板名称不能包含特殊字符 ~ $ @ # &amp; ? &#x3D; + % * ( ) { } &lt; &gt; ] [ ^ ! , : ; &#x60; &#39; / | \\ \&quot;，且不能单独以-或- -作为模板名称。 |  [optional]
**description** | **String** | RADIUS模板描述。 |  [optional]
**masterAuthServer** | [**RadiusTempDtoMasterAuthServer**](RadiusTempDtoMasterAuthServer.md) |  |  [optional]
**slaveAuthServer** | [**RadiusTempDtoSlaveAuthServer**](RadiusTempDtoSlaveAuthServer.md) |  |  [optional]
**masterAccountServer** | [**RadiusTempDtoMasterAccountServer**](RadiusTempDtoMasterAccountServer.md) |  |  [optional]
**slaveAccountServer** | [**RadiusTempDtoSlaveAccountServer**](RadiusTempDtoSlaveAccountServer.md) |  |  [optional]
**realtimeAccounting** | [**RadiusTempDtoRealtimeAccounting**](RadiusTempDtoRealtimeAccounting.md) |  |  [optional]
**prohibitAttribute** | [**RadiusTempDtoProhibitAttribute**](RadiusTempDtoProhibitAttribute.md) |  |  [optional]
**calledStationId** | [**RadiusTempDtoCalledStationId**](RadiusTempDtoCalledStationId.md) |  |  [optional]
**shareKey** | **String** | 密钥（英文字母、数字、除空格和问号外特殊符号，且不能全为*，建议长度为6位以上）。 |  [optional]



