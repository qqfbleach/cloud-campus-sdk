
# DownloadPolicyDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | 下载策略，immediately（立即下载），weektime（周期下载）二者之一。 如果是立即下载场景，type填写immediately，其余字段不用填写； 如果是周期下载场景，type填写weektime，day，dayTime和timeZoneOffSet会生效。  |  [optional]
**day** | **String** | 周几。 |  [optional]
**daytime** | **String** | 按周下载，配置下载时间，格式为hh:mm:ss。 |  [optional]
**timeZoneOffSet** | **String** | 时区，UTC+08:00。 |  [optional]



