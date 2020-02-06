
# ModifyDeviceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 设备名称，名字为空或者不传时，名字修改为ESN号，设备名称不能包含\&quot;?\&quot;或者制表符TAB。 |  [optional]
**description** | **String** | 描述。 |  [optional]
**resourceId** | **String** | 资产编号。 |  [optional]
**siteId** | **String** | 站点ID，如果传入字符串为空，则从站点中移除设备。修改站点ID后，设备的标签列表会清空。 |  [optional]
**esn** | **String** | 设备ESN，未注册状态的设备可以修改。 |  [optional]
**tags** | **List&lt;String&gt;** | 设备标签列表，修改标签列表时，设备的siteId不能为空，只支持AP设备。 |  [optional]
**systemIp** | **String** | 系统IP地址。SD-WAN场景下，创建TNP、站点激活之后不能修改。 |  [optional]



