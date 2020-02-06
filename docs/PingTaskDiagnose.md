
# PingTaskDiagnose

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** | ping探测任务ID，格式UUID。 | 
**destination** | **String** | 目的地址。可以是IP地址或域名，域名中不能包含空格。 | 
**status** | **Integer** | 探测状态。当探测状态为1时，会根据任务ID查询任务结果。探测状态取值如下： 0 --- 成功 1 --- 执行中 2 --- 超时  | 



