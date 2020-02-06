
# ApDeviceRadioResultApiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**radio2dot4Enabled** | **Boolean** | 2.4G射频使能状态。 | 
**radio2dot4Power** | **String** | 2.4G射频发射功率，auto，[1,127]。 | 
**radio2dot4Channel** | **String** | 2.4G射频信道，不同国家码，对应不同的射频信道范围。 | 
**radio2dot4Bandwidth** | [**Radio2dot4BandwidthEnum**](#Radio2dot4BandwidthEnum) | 2.4G调优频宽。 | 
**antenna2Dot4Gain** | **String** | 2.4G射频天线增益，0~30，室内AP天线增益不支持修改。 | 
**radio5Enabled** | **Boolean** | 5G射频使能状态。 | 
**radio5Power** | **String** | 5G射频发射功率，auto，[1,127]。 | 
**radio5Channel** | **String** | 5G射频信道，不同国家码，对应不同的射频信道范围。 | 
**antenna5Gain** | **String** | 5G射频天线增益，0~30，室内AP天线增益不支持修改。 | 
**radio5Bandwidth** | [**Radio5BandwidthEnum**](#Radio5BandwidthEnum) | 5G射频频宽。 | 
**deviceId** | **String** | 设备ID。 |  [optional]
**deviceName** | **String** | 设备名称。 |  [optional]


<a name="Radio2dot4BandwidthEnum"></a>
## Enum: Radio2dot4BandwidthEnum
Name | Value
---- | -----
_20MHZ | &quot;20mhz&quot;
_40MHZ_PLUS | &quot;40mhz-plus&quot;
_40MHZ_MINUS | &quot;40mhz-minus&quot;


<a name="Radio5BandwidthEnum"></a>
## Enum: Radio5BandwidthEnum
Name | Value
---- | -----
_20MHZ | &quot;20mhz&quot;
_40MHZ_PLUS | &quot;40mhz-plus&quot;
_40MHZ_MINUS | &quot;40mhz-minus&quot;
_80MHZ | &quot;80mhz&quot;



