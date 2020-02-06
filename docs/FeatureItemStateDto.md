
# FeatureItemStateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 单个特性ID。 |  [optional]
**name** | **String** | 单个特性名称。 |  [optional]
**messageId** | **String** | 下发单个特性的报文ID。 |  [optional]
**operation** | **Integer** | 单个特性对应的操作类型，取值范围：0---新增(Add)；1---删除(Delete)；2---修改(Update)。 |  [optional]
**state** | **Integer** | 单个特性的配置下发状态，取值范围：0---成功；1---告警；2---预配置；3---失败；4---正在下发。 |  [optional]
**errorMessage** | **String** | 错误信息。 |  [optional]
**updateTime** | **String** | 更新时间。 |  [optional]



