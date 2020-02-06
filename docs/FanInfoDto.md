
# FanInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 风扇ID。 |  [optional]
**onlineState** | **String** | 风扇在线状态。取值范围：0（代表present在位），1（代表absent不在位）。 |  [optional]
**registerState** | **String** | 风扇注册状态。取值范围：0（代表unregisted未注册），1（代表registed已注册）。 |  [optional]
**runningState** | **String** | 风扇运行状态 。取值范围：0（代表unknown未知），1（代表normal正常），2（代表abnormal不正常）。 |  [optional]
**speed** | **Integer** | 风扇转速，转速与全速的百分比，取值范围1-100。 |  [optional]
**mode** | **String** | 风扇模式，取值范围：1（代表AUTO：自动调节转速）；2（代表MANUAL：固定转速）；0（代表UNKNOW：风扇不在位）。 |  [optional]
**airFlow** | **String** | 风扇的风向，取值范围：Back-to-Side（表示风由后面向两侧吹）；Side-to-Back（表示风由两侧向后面吹）；Side-to-Side（表示风由一侧往另外一侧吹）；-（风扇不在位）。 |  [optional]



