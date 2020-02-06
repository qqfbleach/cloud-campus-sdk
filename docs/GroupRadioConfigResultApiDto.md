
# GroupRadioConfigResultApiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCode** | **String** | 国家码。 | 
**scanDuration** | **String** | 扫描时长，范围60~100，单位（ms）。 | 
**scanInterval** | **String** | 扫描间隔，范围300~600000，单位（ms）。 | 
**scanChannel** | [**ScanChannelEnum**](#ScanChannelEnum) | 扫描信道。 | 
**dca2gChannelSet** | **String** | 2.4G调优信道集。 | 
**dcaBandwidth** | [**DcaBandwidthEnum**](#DcaBandwidthEnum) | 5G调优频宽。 | 
**dca5gChannelSet** | **String** | 5G调优信道集。 | 
**calibrate** | [**CalibrateEnum**](#CalibrateEnum) | 调优模式。 | 
**dcaStartTime** | **String** | 自动调优模式下开始时间。 | 
**dcaInterval** | **Integer** | 自动调优模式下周期，单位（min）。 | 
**dcaScheduleTime** | **String** | 定时调优模式下调优时间。 | 
**tpcMaxTxPwr** | **Integer** | TPC上限。 | 
**tpcMinTxPwr** | **Integer** | TPC下限。 | 
**tpcCoverageThreshold** | **Integer** | TPC阈值。 | 
**radio2Dot4GuardIntervalMode** | **String** | 2.4G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。 |  [optional]
**radio5GuardIntervalMode** | **String** | 5G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。 |  [optional]
**referenceDataAnalysis** | **Boolean** | 是否基于历史数据进行射频调优，可选值: true(默认)，false。 |  [optional]


<a name="ScanChannelEnum"></a>
## Enum: ScanChannelEnum
Name | Value
---- | -----
COUNTRY_CHANNEL | &quot;country-channel&quot;
DCA_CHANNEL | &quot;dca-channel&quot;
WORK_CHANNEL | &quot;work-channel&quot;


<a name="DcaBandwidthEnum"></a>
## Enum: DcaBandwidthEnum
Name | Value
---- | -----
_20MHZ | &quot;20mhz&quot;
_40MHZ | &quot;40mhz&quot;
_80MHZ | &quot;80mhz&quot;


<a name="CalibrateEnum"></a>
## Enum: CalibrateEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
AUTO | &quot;auto&quot;
SCHEDULE | &quot;schedule&quot;



