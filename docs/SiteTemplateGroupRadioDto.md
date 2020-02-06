
# SiteTemplateGroupRadioDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCode** | **String** | 国家码。 |  [optional]
**calibrate** | **String** | 调优模式，只能为manual，auto，schedule其中一种。 |  [optional]
**dcaStartTime** | **String** | 自动调优模式下有效。自动调优开始时间，时间格式hh:mm:ss。 |  [optional]
**dcaInterval** | **Integer** | 自动调优模式下有效。自动调优时间周期，取值范围为30到1440之间的整数，单位（min）。 |  [optional]
**dcaScheduleTime** | **String** | 定时调优模式下有效。定时调优开始时间，时间格式hh:mm:ss。 |  [optional]
**scanDuration** | **String** | 扫描时长，范围60~100，单位（ms）。 |  [optional]
**scanInterval** | **String** | 扫描间隔，范围300~600000，单位（ms）。 |  [optional]
**scanChannel** | **String** | 扫描信道，只能为country-channel，dca-channel，work-channel其中一种。 |  [optional]
**beaconCycle** | **Integer** | beacon周期。取值范围为60到1000之间的整数。单位（TUs）。 |  [optional]
**dynamicSwitch** | **Boolean** | 负载均衡。 |  [optional]
**referenceDataAnalysis** | **Boolean** | 是否基于历史数据进行射频调优，可选值: true(默认)，false。 |  [optional]
**groupRadio2g** | [**GroupRadio2gConfigDto**](GroupRadio2gConfigDto.md) |  |  [optional]
**groupRadio5g** | [**GroupRadio5gConfigDto**](GroupRadio5gConfigDto.md) |  |  [optional]



