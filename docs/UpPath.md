
# UpPath

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceModel** | **String** | 设备款型。 | 
**targetSoftwareId** | [**UUID**](UUID.md) | 目标软件版本ID。从/version这个接口的返回的pkgList获取。targetSoftwareId和targetPatchId至少填一个。 |  [optional]
**targetPatchId** | [**UUID**](UUID.md) | 目标补丁ID。从/version这个接口的返回的pkgPatchMap获取。targetSoftwareId和targetPatchId至少填一个。 |  [optional]
**isUninstall** | **Integer** | 是否卸载旧补丁。 1：是 0：否  |  [optional]
**status** | **Integer** | 升级状态。查询站点升级计划和详情时返回。 0：未创建升级任务 1：无需升级 2：升级成功 3：升级失败 4：下载完成 5：升级中 创建多站点升级计划时无需填写。  |  [optional]



