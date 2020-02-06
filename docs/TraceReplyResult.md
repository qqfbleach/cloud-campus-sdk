
# TraceReplyResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** | trace探测任务ID，格式UUID。 | 
**destination** | **String** | 目的地址。可以是IP地址或域名，域名中不能包含空格。 | 
**status** | **Integer** | 探测状态。 0 --- 已完成 1 --- 执行中 2 --- 超时 3 --- 失败  | 
**traceHopList** | [**TraceReplyResultTraceHopList**](TraceReplyResultTraceHopList.md) |  |  [optional]



