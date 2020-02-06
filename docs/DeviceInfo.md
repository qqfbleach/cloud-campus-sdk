
# DeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 设备ID，格式UUID。 | 
**name** | **String** | 设备名称。 | 
**status** | [**StatusEnum**](#StatusEnum) | 设备状态 0: 正常 1: 告警 2: 故障 3: 离线 4: 未注册  | 
**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | 设备类型。 |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4


<a name="DeviceTypeEnum"></a>
## Enum: DeviceTypeEnum
Name | Value
---- | -----
AP | &quot;AP&quot;
AR | &quot;AR&quot;
FW | &quot;FW&quot;
LSW | &quot;LSW&quot;
AC | &quot;AC&quot;
OLT | &quot;OLT&quot;
ONT | &quot;ONT&quot;



