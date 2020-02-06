
# CreateSiteDtoData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 站点名称。 | 
**description** | **String** | 站点描述。 |  [optional]
**type** | [**List&lt;TypeEnum&gt;**](#List&lt;TypeEnum&gt;) | 混合站点类型集合：默认为AP。可选“AR”、“AP”、“FW”、“AC（Fit AP）”或者“LSW”中一个或多个类型。 |  [optional]
**pattern** | **Integer** | 站点配置模式，取值范围为：1---默认，2---配置文件。 |  [optional]


<a name="List<TypeEnum>"></a>
## Enum: List&lt;TypeEnum&gt;
Name | Value
---- | -----
AP | &quot;AP&quot;
AR | &quot;AR&quot;
LSW | &quot;LSW&quot;
FW | &quot;FW&quot;
AC | &quot;AC&quot;
ONT | &quot;ONT&quot;
OLT | &quot;OLT&quot;



