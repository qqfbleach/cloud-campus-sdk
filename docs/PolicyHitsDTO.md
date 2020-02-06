
# PolicyHitsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | 开始日期，非空时要求是合法的日期格式；如果开始日期和结束日期同时为空，默认查过去一个月的数据，yyyy-MM-dd HH:mm:ss。 |  [optional]
**endDate** | **String** | 结束日期，非空时要求是合法的日期格式；如果开始日期和结束日期同时为空，默认查过去一个月的数据，yyyy-MM-dd HH:mm:ss。 |  [optional]
**producer** | **String** | 调用者。 |  [optional]
**blockIds** | **List&lt;String&gt;** | 事件ID列表，UUID格式；Campus融合场景，blockIds为必填字段；DCN融合场景，blockIds和policyNames不可同时为空，都传的情况下，以blockIds为准。 | 
**policyNames** | **List&lt;String&gt;** | 策略名称。Campus融合，该字段没有业务上的意义，不需要填写；DCN融合场景，blockIds和policyNames不可同时为空，都传的情况下，以blockIds为准。 |  [optional]



