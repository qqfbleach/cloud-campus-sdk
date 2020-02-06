
# DeviceRadioEntityApiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | 设备ID。 | 
**deviceName** | **String** | 设备名称。 | 
**radio2dot4Enabled** | **Boolean** | 2.4G射频使能。 | 
**radio2dot4Power** | **String** | 2.4G射频发射功率，auto，[1,127]。 | 
**radio2dot4Channel** | **String** | 2.4G射频信道，不同国家码，对应不同的射频信道范围。 | 
**radio2Support** | **Boolean** | 是否支持2.4G射频。 | 
**antenna2Dot4Gain** | **String** | 2.4G射频天线增益，0~30。 | 
**radio2Dot4Bandwidth** | [**Radio2Dot4BandwidthEnum**](#Radio2Dot4BandwidthEnum) | 2.4G射频频宽。 | 
**radio5Enabled** | **Boolean** | 5G射频使能。 | 
**radio5Power** | **String** | 5G射频发射功率，auto，[1,127]。 | 
**radio5Channel** | **String** | 5G射频信道，不同国家码，对应不同的射频信道范围。 | 
**radio5Support** | **Boolean** | 是否支持5G射频。 | 
**antenna5Gain** | **String** | 5G射频天线增益，0~30。 | 
**radio5Bandwidth** | [**Radio5BandwidthEnum**](#Radio5BandwidthEnum) | 5G射频频宽。 | 


<a name="Radio2Dot4BandwidthEnum"></a>
## Enum: Radio2Dot4BandwidthEnum
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



