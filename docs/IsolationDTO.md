
# IsolationDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockId** | **String** | 事件ID，UUID格式。 | 
**vmIp** | **String** | 主机IP，只支持IPV4格式。 | 
**tenant** | **String** | 租户ID，UUID格式。 |  [optional]
**producer** | **String** | 调用者。 |  [optional]
**exceptionIps** | **List&lt;String&gt;** | 例外IP列表，最多支持8个IP列表，支持IPV4和IPV6格式。 |  [optional]



