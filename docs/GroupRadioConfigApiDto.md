
# GroupRadioConfigApiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCode** | **String** | 国家码。 |  [optional]
**scanDuration** | **String** | 扫描时长，范围60~100，单位（ms）。 |  [optional]
**scanInterval** | **String** | 扫描间隔，范围300~600000，单位（ms）。 |  [optional]
**scanChannel** | **String** | 扫描信道，只能为country-channel，dca-channel，work-channel其中一种。 |  [optional]
**dca2gChannelSet** | **String** | 2.4G调优信道集。 |  [optional]
**dcaBandwidth** | **String** | 5G调优频宽，只能为20mhz，40mhz，80mhz其中一种。 |  [optional]
**dca5gChannelSet** | **String** | 5G调优信道集。 |  [optional]
**calibrate** | **String** | 调优模式，只能为manual，auto，schedule其中一种。 |  [optional]
**dcaStartTime** | **String** | 自动调优模式下开始时间。 |  [optional]
**dcaInterval** | **Integer** | 自动调优模式下周期，单位（min）。 |  [optional]
**dcaScheduleTime** | **String** | 定时调优模式下调优时间。 |  [optional]
**tpcMaxTxPwr** | **Integer** | TPC上限。 |  [optional]
**tpcMinTxPwr** | **Integer** | TPC下限。 |  [optional]
**tpcCoverageThreshold** | **Integer** | TPC阈值。 |  [optional]
**radio2Dot4GuardIntervalMode** | **String** | 2.4G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。 |  [optional]
**radio5GuardIntervalMode** | **String** | 5G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。 |  [optional]
**referenceDataAnalysis** | **Boolean** | 是否基于历史数据进行射频调优，可选值: true(默认)，false。 |  [optional]



