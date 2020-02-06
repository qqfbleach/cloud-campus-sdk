
# FloorLocationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 楼层名称。 | 
**buildingName** | **String** | 楼层所属楼栋名称。 | 
**image** | **byte[]** | 楼层图纸。 | 
**scale** | **Double** | 比例尺，表示图上距离与实际距离的比，例如：图上0.01米代表实际1米，则比例尺为0.01。 |  [optional]
**locatedDeviceList** | [**List&lt;LocatedDeviceInfo&gt;**](LocatedDeviceInfo.md) | 已布放设备列表。 | 
**unLocatedDeviceList** | [**List&lt;DeviceInfo&gt;**](DeviceInfo.md) | 未布放设备列表。 | 



