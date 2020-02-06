
# PoePowerStateData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interfaceId** | **String** | 接口ID，UUID格式。 |  [optional]
**interfaceName** | **String** | 接口名。 |  [optional]
**portLegacy** | **Boolean** | 接口是否使能兼容性检测功能(true，false)。 |  [optional]
**portEnable** | **Boolean** | 接口是否使能PoE供电功能(true，false)。 |  [optional]
**portPower** | **Boolean** | 接口是否供电(true，false)。 |  [optional]
**portStatus** | **String** | 接口的供电状态：Test mode(测试状态)、Detecting(检测状态)、Disabled(接口PoE功能未使能状态)、Chip fault(芯片故障状态)、Power-deny(参考功率大于接口最大输出功率)、Classification overcurrent(分级过流)、Unknown class(未知分级)、Power overcurrent(接口过流)、Power-on failed(上电失败)、Power-ready(接口供电就绪)、Powering(正在上电)、Powered(上电结束)、Over loaded(功率过载)、Time-range power-off(接口处于下电时间段)、Unstable voltage(接口电压不稳定)。 |  [optional]
**portClass** | **Integer** | 接口接入设备PD的分级，系统自动根据PD设备的最大功率给PD分类，分为0～4级。 |  [optional]
**portRef** | **Integer** | 接口的参考功率（系统会自动识别PD设备的最大功率，并给PD设备归类，定义各类别的参考功率。PD类型和参考功率的对应关系为：0-参考功率为15400mW。1-参考功率为4000mW。2-参考功率为7000mW。3-参考功率为15400mW。4-参考功率为30000mW。）。 |  [optional]
**portPriority** | **String** | 接口供电的优先级，有三种取值：Critical-最高的优先级，High-次高的优先级，Low-最低的优先级。 |  [optional]
**portMax** | **Integer** | 接口最大输出功率，如果最大输出功率为15400mW，说明此设备支持802.3af标准；如果最大输出功率为30000mW，说明此设备支持802.3at标准。 |  [optional]
**portCurrentMW** | **Integer** | 接口当前的输出功率。 |  [optional]
**portPeak** | **Integer** | 接口的峰值输出功率。 |  [optional]
**portAverage** | **Integer** | 接口的平均输出功率。 |  [optional]
**portCurrentMA** | [**BigDecimal**](BigDecimal.md) | 接口的输出电流。 |  [optional]
**portVoltage** | [**BigDecimal**](BigDecimal.md) | 接口的输出电压。 |  [optional]



