
# UpdatePortalPageRuleInputDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 名称。 | 
**description** | **String** | 描述。 |  [optional]
**priority** | **String** | 优先级。如果priority的值与修改前相同，那么修改操作只处理除priority以外的信息，否则修改操作只处理优先级。优先级数值越小，越优先匹配。 |  [optional]
**ssIds** | **List&lt;String&gt;** | SSID列表，如果参数为空，则页面推送策略适用于站点下所有SSID，格式为UUID。 |  [optional]
**pushMode** | **Integer** | 推送方式，当前只支持0：第三方认证。 | 
**thirdPageUrl** | **String** | 第三方推送URL，当pushMode为0时，必填。 |  [optional]



