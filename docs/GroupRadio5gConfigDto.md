
# GroupRadio5gConfigDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dcaBandwidth** | **String** | 5G调优频宽，只能为20mhz，40mhz，80mhz其中一种。 |  [optional]
**dca5gChannelSet** | **String** | 5G调优信道集。当5G调优频宽为20MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161，165； 当5G调优信道为40MHz或80MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161。 为了确保校准结果，请选择至少三个选项。若可选信道少于三个，则此国家不支持配置此调优频宽。 |  [optional]
**radio5gBaseRate** | **String** | 5G基础速率。支持的速率有6，9，12，18，24，36，48，54。单位（Mbps）。至少选择一项。 |  [optional]
**radio5gSupportRate** | **String** | 5G支持速率。支持的速率有6，9，12，18，24，36，48，54。单位（Mbps）。至少选择一项。 |  [optional]
**tpc5gMaxTxPwr** | **Integer** | 5G的TPC上限。取值范围为1到127之间的整数。单位（dBm）。 |  [optional]
**tpc5gMinTxPwr** | **Integer** | 5G的TPC下限。取值范围为1到127之间的整数。单位（dBm）。 |  [optional]
**tpc5gCoverageThreshold** | **Integer** | 5G的TPC阈值。取值范围为-85到-35之间的整数。 |  [optional]
**radio5GuardIntervalMode** | **String** | 5G射频间隔（GI）模式，可填default（默认）、short（短间隔）或normal（普通间隔）。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。 |  [optional]



