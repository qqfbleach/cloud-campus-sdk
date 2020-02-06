
# NatSessionLogConfigParam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**natSessionLogEnable** | **Boolean** | Nat日志上报使能开关。当natSessionLogEnable为true时，logInterval，binaryNatSessionLogEnable生效。 |  [optional]
**logInterval** | **Long** | Nat日志上报时间间隔，单位：s，默认30s。 |  [optional]
**binaryNatSessionLogEnable** | **Boolean** | 二进制格式的日志上报开关。当binaryNatSessionLogEnable为true时，binaryLogHostAddress，binaryLogHostPort，binaryLogSrcPort生效。当binaryNatSessionLogEnable为false时，Nat日志上报的格式为文本。 |  [optional]
**binaryLogHostAddress** | **String** | 二进制上报日志目标服务器IP地址。 |  [optional]
**binaryLogHostPort** | **Long** | 二进制上报日志目标服务器端口号，范围为：1-65535。 |  [optional]
**binaryLogSrcPort** | **Long** | 二进制上报日志设备源端口号，范围为：10240-55534。 |  [optional]



