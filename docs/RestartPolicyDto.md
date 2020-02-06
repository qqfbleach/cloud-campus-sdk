
# RestartPolicyDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | 重启策略，immediately（立即重启），weektime（周期重启）二者之一。 如果是立即重启场景，type填写immediately； 如果是周期重启场景，type填写|weektime，day，dayTime和timeZoneOffSet会生效。  |  [optional]
**day** | **String** | 周几。 |  [optional]
**daytime** | **String** | 按周重启，配置重启时间，格式为hh:mm:ss。 |  [optional]
**timeZoneOffSet** | **String** | 时区，UTC+08:00。 |  [optional]



