
# UpgradeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | [**UUID**](UUID.md) | 设备ID。 |  [optional]
**deviceName** | **String** | 设备名称。 |  [optional]
**esn** | **String** | 设备ESN。 |  [optional]
**deviceStatus** | **Integer** | 设备状态。 0：正常 1：告警 2：故障 3：离线 4：未注册  |  [optional]
**deviceModel** | **String** | 设备款型。 |  [optional]
**deviceType** | **String** | 设备类型，取值为AP，AR，LSW，FW其中之一。 |  [optional]
**siteName** | **String** | 站点名称。 |  [optional]
**pkgVer** | **String** | 软件包版本。 |  [optional]
**pkgPercent** | **Integer** | 软件包下载进度。 |  [optional]
**pkgUpStatus** | **Integer** | 大包升级状态。 0：已创建升级任务，未升级 1：正在下载 2：已下载 5：升级完成 6：无需升级 8：升级失败 9：等待重启上线 10：正在激活大包 11：激活完成 16：取消升级成功 17：取消升级失败 18：下载停止  |  [optional]
**patVer** | **String** | 补丁版本。 |  [optional]
**patPercent** | **Integer** | 补丁下载进度。 |  [optional]
**patUpStatus** | **Integer** | 补丁升级状态。 0：已创建升级任务，未升级 1：正在下载 2：已下载 5：升级完成 6：无需升级 8：升级失败 9：等待重启上线 12：正在补丁操作 13：补丁操作完成 16：取消升级成功 17：取消升级失败 18：下载停止  |  [optional]
**failureCause** | **String** | 失败原因。 |  [optional]
**rebootTime** | **Long** | 重启时间。UTC时间。 |  [optional]
**downloadTime** | **Long** | 下载时间。UTC时间。 |  [optional]



