
# GetDeviceBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 设备ID。 |  [optional]
**name** | **String** | 设备名称。 |  [optional]
**esn** | **String** | 设备ESN号。 |  [optional]
**deviceModel** | **String** | 设备款型。 |  [optional]
**deviceType** | **String** | 设备类型，支持以下几种：“AR”、“AP”、“FW”或者“LSW”。 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 设备状态，0---正常、1---告警、2---故障、3---离线、4---未注册。 |  [optional]
**siteId** | **String** | 设备所属站点的ID。 |  [optional]
**mac** | **String** | 设备MAC。 |  [optional]
**ip** | **String** | 设备IP。 |  [optional]
**neType** | **String** | 设备款型。 |  [optional]
**version** | **String** | 设备软件版本。 |  [optional]
**vendor** | **String** | 设备制造商。 |  [optional]
**description** | **String** | 设备备注信息。 |  [optional]
**resourceId** | **String** | 资产编号。 |  [optional]
**tenantId** | **String** | 租户ID。 |  [optional]
**tenantName** | **String** | 租户名称。 |  [optional]
**siteName** | **String** | 站点名称。 |  [optional]
**createTime** | **String** | 创建时间。 |  [optional]
**registerTime** | **String** | 设备首次注册时间。 |  [optional]
**modifyTime** | **String** | 修改时间。 |  [optional]
**startupTime** | **String** | 设备重启时间。 |  [optional]
**tags** | **List&lt;String&gt;** | 设备标签列表。 |  [optional]
**systemIp** | **String** | 系统IP地址。 |  [optional]
**patchVersion** | **String** | 设备补丁版本。 |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4



