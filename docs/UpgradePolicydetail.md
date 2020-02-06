
# UpgradePolicydetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | 设备标识，UUID格式。 |  [optional]
**signatureDatabaseType** | [**SignatureDatabaseTypeEnum**](#SignatureDatabaseTypeEnum) | 设备特征库升级类型。 |  [optional]
**version** | **String** | 设备特征库版本。 |  [optional]
**status** | **Integer** | 设备特征库升级状态。取值如下：-1---升级失败，0---未配置，1---初始化 ，10---升级完成，11---升级中。 |  [optional]
**lastUpgradeTime** | **Long** | 上次特征库升级时间，UTC时间格式。 |  [optional]
**nextUpgradeTime** | **Long** | 下次特征库升级时间，UTC时间格式。 |  [optional]


<a name="SignatureDatabaseTypeEnum"></a>
## Enum: SignatureDatabaseTypeEnum
Name | Value
---- | -----
IP_REPUTATION | &quot;ip-reputation&quot;
ANTIVIRUS | &quot;antivirus&quot;
INTRUSION_PREVENTION | &quot;intrusion-prevention&quot;
FILE_REPUTATION | &quot;file-reputation&quot;
CNC | &quot;cnc&quot;
APPLICATION | &quot;application&quot;



