
# AuthenticationLogOutputDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startRowKey** | **String** | 查询结果中起始rowkey值。 |  [optional]
**endRowKey** | **String** | 查询结果中结束rowkey值。 |  [optional]
**totalRecords** | **Integer** | 本次查询到的总结果数。最大取值为101，不足101条时表示当前数据已查询完；等于101条表示后续还有数据。 |  [optional]
**errcode** | **String** | 错误码。0表示没有错误。 |  [optional]
**errmsg** | **String** | 错误信息描述。 |  [optional]
**searchResultList** | [**List&lt;AuthenticationLogDetailOutputDto&gt;**](AuthenticationLogDetailOutputDto.md) |  |  [optional]



