
# AddPortalPageRuleInputDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 名称。 | 
**description** | **String** | 描述。 |  [optional]
**ssIds** | **List&lt;String&gt;** | SSID列表，如果参数为空，则页面推送策略适用于站点下所有SSID，格式为UUID。 |  [optional]
**pushMode** | **Integer** | 推送方式，当前只支持0：第三方认证。 | 
**thirdPageUrl** | **String** | 第三方推送URL，当pushMode为0时，必填。 |  [optional]



