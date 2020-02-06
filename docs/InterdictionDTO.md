
# InterdictionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockId** | **String** | 事件ID，UUID格式，必填。 | 
**tenant** | **String** | 租户ID，UUID格式。 |  [optional]
**producer** | **String** | 调用者。 |  [optional]
**direction** | **Integer** | 流量方向，0-单向，1-双向，默认为0，必填。 | 
**srcIps** | **List&lt;String&gt;** | 源IP列表，非必填；非空必须满足合法的IPV4，IPV6格式，最多8个IP；源IP列表和目的IP列表不可同时为空。 |  [optional]
**dstIps** | **List&lt;String&gt;** | 目的IP列表，非必填；非空必须满足合法的IPV4，IPV6格式，最多只能填1个目的IP；源IP列表和目的IP列表不可同时为空。 |  [optional]



