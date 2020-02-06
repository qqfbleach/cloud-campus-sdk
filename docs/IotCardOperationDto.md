
# IotCardOperationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | AP的设备ID，UUID格式。 | 
**slot** | **Integer** | 插卡槽位号。 | 
**operation** | [**OperationEnum**](#OperationEnum) | 下发操作。取值范围：reboot---重启、reset-factory-configuration---恢复出厂配置、switch-firmware---切换分区、reset-network-configuration---重置网络配置。 | 


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
REBOOT | &quot;reboot&quot;
RESET_FACTORY_CONFIGURATION | &quot;reset-factory-configuration&quot;
SWITCH_FIRMWARE | &quot;switch-firmware&quot;
RESET_NETWORK_CONFIGURATION | &quot;reset-network-configuration&quot;



