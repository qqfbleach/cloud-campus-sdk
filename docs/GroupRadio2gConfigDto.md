
# GroupRadio2gConfigDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dca2gChannelSet** | **String** | 2.4G调优信道集。可选\&quot;1，6，11\&quot;和\&quot;1，5，9，13\&quot;两种信道集。 |  [optional]
**radio2gBaseRate** | **String** | 2.4基础速率。支持的速率有1，2，5.5，6，9，11，12，18，24，36，48，54。单位（Mbps）。至少选择一项。 |  [optional]
**radio2gSupportRate** | **String** | 2.4G支持速率。支持的速率有1，2，5.5，6，9，11，12，18，24，36，48，54。单位（Mbps）。至少选择一项。 |  [optional]
**tpc2gMaxTxPwr** | **Integer** | 2.4G的TPC上限。取值范围为1到127之间的整数。单位（dBm）。 |  [optional]
**tpc2gMinTxPwr** | **Integer** | 2.4G的TPC上限。取值范围为1到127之间的整数。单位（dBm）。 |  [optional]
**tpc2gCoverageThreshold** | **Integer** | 2.4G的TPC阈值。取值范围为-85到-35之间的整数。 |  [optional]
**radio2Dot4GuardIntervalMode** | **String** | 2.4G射频间隔（GI）模式，可填default（默认）、short（短间隔）或normal（普通间隔）。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。 |  [optional]



