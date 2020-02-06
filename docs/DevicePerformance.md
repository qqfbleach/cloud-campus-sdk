
# DevicePerformance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 设备标识。 |  [optional]
**name** | **String** | 设备名称。 |  [optional]
**esn** | **String** | 设备ESN号。 |  [optional]
**deviceIp** | **String** | 设备IP。 |  [optional]
**neType** | **String** | 具体的设备款型。 |  [optional]
**status** | **Integer** | 设备状态，0---在线、1---告警、2---故障、3---离线、4---未注册。 |  [optional]
**gisLon** | [**BigDecimal**](BigDecimal.md) | 设备位置经度。 |  [optional]
**gisLat** | [**BigDecimal**](BigDecimal.md) | 设备位置纬度。 |  [optional]
**traffic** | [**BigDecimal**](BigDecimal.md) | 总流量，单位：字节。 |  [optional]
**onlineUsers** | **Integer** | 终端连接数。 |  [optional]
**cpuRate** | **Integer** | CPU利用率，单位：百分比。 |  [optional]
**upwardSpeed** | [**BigDecimal**](BigDecimal.md) | 上行速率，单位：bps。 |  [optional]
**downwardSpeed** | [**BigDecimal**](BigDecimal.md) | 下行速率，单位：bps。 |  [optional]
**mac** | **String** | MAC地址。 |  [optional]



