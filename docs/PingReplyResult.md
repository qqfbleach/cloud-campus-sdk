
# PingReplyResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** | ping探测任务ID，格式UUID。 | 
**totalCount** | **Integer** | 总探测次数。 | 
**successCount** | **Integer** | 成功探测次数。 | 
**lossRate** | **Float** | 丢失率。单位：百分比。 | 
**rttAvg** | **Integer** | 报文平均响应时间，单位：毫秒。 | 
**status** | **Integer** | 探测状态。 0 --- 成功 1 --- 执行中 2 --- 超时  | 
**pingReply** | [**PingReplyResultPingReply**](PingReplyResultPingReply.md) |  |  [optional]



