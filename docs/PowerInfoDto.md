
# PowerInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 电源模块编号。 |  [optional]
**mode** | **String** | 电源模式。取值范围：0（AC：交流电源）；1（DC：直流电源）；2（hvdc高压直流电源）；3（NA：表示电源在位但是无法获取模式信息）。 |  [optional]
**state** | **String** | 电源注册状态。取值范围：1（表示NotSupply无电流输出）；0（表示Supply有电流输出）。 |  [optional]
**ratedPower** | **Integer** | 单板额定功率，单位是W。 |  [optional]
**current** | **Integer** | 电源供电电流，单位是A。 |  [optional]
**voltage** | **Integer** | 电源供电电压，单位是V。 |  [optional]
**realtimePower** | **Integer** | 实时功率，单位是W。 |  [optional]
**role** | **String** | 电源模块的角色。取值范围：1（M主用电源）；2（S备用电源）；3（A始终供电电源）；0（-表示电源不在位或未注册）。 |  [optional]



