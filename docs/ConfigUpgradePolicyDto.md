
# ConfigUpgradePolicyDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**siteId** | **String** | 站点标识，UUID格式。 | 
**upgradeRegularly** | **Boolean** | 策略是否为周期升级。当upgradeRegularly为true时，upgradeImmediately必须为false；当upgradeRegularly为false时，upgradeImmediately必须为true。 | 
**upgradeImmediately** | **Boolean** | 策略是否为立即升级。当upgradeImmediately为true时，upgradeRegularly必须为false;当upgradeImmediately为false时，upgradeRegularly必须为true。 | 
**upgradeDay** | [**UpgradeDayEnum**](#UpgradeDayEnum) | 策略为周期升级时，周几升级。当upgradeRegularly为true时，upgradeDay生效且必填。 |  [optional]
**upgradeTime** | **String** | 策略为周期升级时，升级的时间点。当upgradeRegularly为true时，upgradeTime生效且必填。 |  [optional]
**signatureDatabaseTypes** | [**List&lt;SignatureDatabaseTypesEnum&gt;**](#List&lt;SignatureDatabaseTypesEnum&gt;) |  | 


<a name="UpgradeDayEnum"></a>
## Enum: UpgradeDayEnum
Name | Value
---- | -----
SUNDAY | &quot;Sunday&quot;
MONDAY | &quot;Monday&quot;
TUESDAY | &quot;Tuesday&quot;
WEDNESDAY | &quot;Wednesday&quot;
THURSDAY | &quot;Thursday&quot;
FRIDAY | &quot;Friday&quot;
SATURDAY | &quot;Saturday&quot;


<a name="List<SignatureDatabaseTypesEnum>"></a>
## Enum: List&lt;SignatureDatabaseTypesEnum&gt;
Name | Value
---- | -----
IP_REPUTATION | &quot;ip-reputation&quot;
ANTIVIRUS | &quot;antivirus&quot;
INTRUSION_PREVENTION | &quot;intrusion-prevention&quot;
FILE_REPUTATION | &quot;file-reputation&quot;
CNC | &quot;cnc&quot;
APPLICATION | &quot;application&quot;



