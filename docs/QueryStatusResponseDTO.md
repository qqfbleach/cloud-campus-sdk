
# QueryStatusResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockId** | **String** | 事件ID，UUID格式。 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 查询状态。NO_DATA--查询不到数据，SUCCESS--成功，RETRY--需要重试，CE_FAILURE--失败。 |  [optional]
**failedPolicyIds** | **List&lt;String&gt;** | 失败策略列表，UUID格式。 |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NO_DATA | &quot;NO_DATA&quot;
SUCCESS | &quot;SUCCESS&quot;
CE_FAILURE | &quot;CE_FAILURE&quot;



