
# LocatedDeviceDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | 设备ID，格式UUID。 | 
**name** | **String** | 设备名称。 | 
**status** | [**StatusEnum**](#StatusEnum) | 设备状态 0: 正常 1: 告警 2: 故障 3: 离线 4: 未注册  | 
**esn** | **String** | 设备ESN号。 |  [optional]
**mac** | **String** | MAC地址。 |  [optional]
**description** | **String** | 设备备注信息。 |  [optional]
**apType** | [**ApTypeEnum**](#ApTypeEnum) | AP分类 cloud AP：云AP distributed AP：云分布式AP cloud central AP：云中心AP  |  [optional]
**positionX** | **Integer** | 设备布放坐标X，单位：像素。 |  [optional]
**positionY** | **Integer** | 设备布放坐标Y，单位：像素。 |  [optional]
**planPositionX** | **Integer** | 设备规划坐标X，单位：像素。 |  [optional]
**planPositionY** | **Integer** | 设备规划坐标Y，单位：像素。 |  [optional]
**planPointId** | **String** | 网规规划点ID，格式UUID。 |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4


<a name="ApTypeEnum"></a>
## Enum: ApTypeEnum
Name | Value
---- | -----
CLOUD_AP | &quot;cloud AP&quot;
DISTRIBUTED_AP | &quot;distributed AP&quot;
CLOUD_CENTRAL_AP | &quot;cloud central AP&quot;



