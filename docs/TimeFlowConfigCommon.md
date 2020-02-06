
# TimeFlowConfigCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeFlowName** | **String** | 计费策略名。 | 
**siteId** | **String** | 站点ID，UUID格式。 | 
**enableTrafficLimitMode** | **Boolean** | 启用流量控制。 |  [optional]
**trafficLimitMode** | **Integer** | 流量限制方式（1---每天，2---每月，3---每周，4---每年），启用流量控制后必填。 |  [optional]
**trafficLimit** | [**BigDecimal**](BigDecimal.md) | 流量限制值（兆），启用流量控制后必填。 |  [optional]
**enableDurationLimitMode** | **Boolean** | 启用时长控制。 |  [optional]
**durationLimitMode** | **Integer** | 时长限制方式（1---每天，2---每月，3---每周，4---每年），启用时长控制后必填。 |  [optional]
**durationLimit** | [**BigDecimal**](BigDecimal.md) | 时长限制值（分钟），启用时长控制后必填。 |  [optional]
**isReCount** | **Boolean** | 重认证后流量和时长清零并重新计算。 |  [optional]
**isAnonymous** | **Boolean** | 策略适用于匿名账号。 |  [optional]
**userGroupIds** | [**List&lt;UUID&gt;**](UUID.md) | 用户组ID列表。 |  [optional]
**description** | **String** | 计费策略描述。 |  [optional]



