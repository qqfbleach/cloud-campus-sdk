
# DeviceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**esn** | **String** | 设备ESN号。 |  [optional]
**name** | **String** | 设备名称，若不传或传值为空，则以ESN号命名设备，设备名称不能包含\&quot;?\&quot;或者制表符TAB。 |  [optional]
**siteId** | **String** | 站点ID，如果不传，则不添加到任意站点。 |  [optional]
**description** | **String** | 设备详情描述。 |  [optional]
**resourceId** | **String** | 资产编号。 |  [optional]
**deviceModel** | **String** | 设备款型。版本支持的设备款型请参考《版本说明书》中的“版本配套说明”章节。 |  [optional]
**systemIp** | **String** | 系统IP地址。若systemIp不传或为空，则从地址池中自动分配IP下发给设备的loopback口；若非空，则将指定的systemIp下发给设备的loopback口。 |  [optional]
**tags** | **List&lt;String&gt;** | 设备标签列表，关联标签列表时，站点ID不能为空，只支持AP设备。 |  [optional]



