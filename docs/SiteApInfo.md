
# SiteApInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectAll** | **Boolean** | 是否全选该站点的所有Fit AP。 当selectAll为true时，apDeviceIdList不生效，unselectedApDeviceIdList生效，表示将siteId下，且ID不在unselectedApDeviceIdList的Fit AP和指定的WAC设备创建/解除关联关系；当selectAll为false时，apDeviceIdList生效，unselectedApDeviceIdList不生效，表示将siteId下，且ID在apDeviceIdList的Fit AP和指定的WAC设备创建/解除关联关系。 | 
**siteId** | [**UUID**](UUID.md) | 站点的ID。 | 
**apDeviceIdList** | [**List&lt;UUID&gt;**](UUID.md) | Fit AP的ID的列表。 |  [optional]
**unselectedApDeviceIdList** | [**List&lt;UUID&gt;**](UUID.md) | 未选择的Fit AP的ID的列表。 |  [optional]



