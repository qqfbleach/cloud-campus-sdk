
# StpDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stpMode** | **Integer** | STP模式。1表示MSTP，2表示RSTP。 | 
**mstpRegions** | [**List&lt;MstpRegion&gt;**](MstpRegion.md) | MST域集合。MSTP模式下需要配置。 |  [optional]
**rstpConfig** | [**List&lt;RegionInstanceDevice&gt;**](RegionInstanceDevice.md) | RSTP优先级。RSTP模式下需要配置。 |  [optional]



