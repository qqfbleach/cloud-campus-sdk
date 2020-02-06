
# UserAuthorizationInputDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceMac** | **String** | 设备MAC地址，MAC和ESN至少有一个必填。 |  [optional]
**deviceEsn** | **String** | 设备ESN地址，MAC和ESN至少有一个必填。 |  [optional]
**apMac** | **String** | AP的MAC地址。 |  [optional]
**ssid** | **String** | AP ssid名称的BASE64编码。 | 
**policyName** | **String** | 访问控制策略名称，为空时不做访问策略控制。 |  [optional]
**terminalIpV4** | **String** | 终端IPV4地址，terminalIpV4和terminalIpV6有且只有一个必填。 |  [optional]
**terminalIpV6** | **String** | 终端IPV6地址，terminalIpV4和terminalIpV6有且只有一个必填。 |  [optional]
**terminalMac** | **String** | 终端MAC。 | 
**userName** | **String** | 用户名。 | 
**nodeIp** | **String** | 授权节点地址。 | 
**temPermitTime** | **Integer** | 临时放行时长，单位秒。报文中不传递此参数或取值为0时，终端用户访问网络无时间限制。 |  [optional]



