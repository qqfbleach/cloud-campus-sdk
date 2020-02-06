
# ApExtraServiceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mu** | **Boolean** | 是否开启上传功能，将终端位置信息上报到指定服务器。 |  [optional]
**serverIp** | **String** | 服务器IP/域名。当mu为true时，serverIp必填。 |  [optional]
**serverPort** | **Integer** | 端口号，必须为1-65535范围内的整数，不填默认为10031。端口号跟服务器IP/域名要么都填，要么都不填。 |  [optional]
**interver** | **Integer** | 上报周期，单位为ms，必须是500-60000范围内的整数，不填默认为20000。 |  [optional]
**rssi** | **Integer** | 阀值，必须为-95-0范围内的整数，不填默认为-75。 |  [optional]
**enablePsk** | **Boolean** | PSK使能。 |  [optional]
**lastUpdateTime** | **String** | 最后一次更新时间。时间格式：UTC。 |  [optional]
**apLocationEnable** | **Boolean** | 用于标识AP安装位置信息开关是否打开。 | 
**apLocation** | **String** | AP安装位置信息。当apLocationEnable为true时，apLocation必填。 |  [optional]



