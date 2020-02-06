
# DeviceFwNatInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | NAT策略ID。创建时不能填写，修改时必须填写。 |  [optional]
**name** | **String** | 名称，不能包含?、双引号和空格。 |  [optional]
**description** | **String** | 描述。 |  [optional]
**conversionMode** | **Integer** | 转换模式（不允许修改）。取值范围：1---仅转换源地址。2---仅转换目的地址。3---源地址和目的地址同时转换。 |  [optional]
**destinationMode** | **String** | 目的地址转换方式。取值范围：address-to-address---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）数量一致。port-to-address---转换前目的地址（oldDestinationIp）为单个ip，转换后目的端口（destinationPort）为单个端口，转换前服务目的端口（destPort）与转换后目的地址（newDestinationIpGroup）数量一致。port-to-port---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）都为单个ip，转换前服务目的端口（destPort）和转换后目的端口（destinationPort）数量保持一致。address-to-port---转换前目的地址（oldDestinationIp）和转换后目的端口（destinationPort）数量一致，转换前服务目的端口（destPort）为单个端口，转换后目的地址（newDestinationIpGroup）为单个ip。 |  [optional]
**priority** | **Integer** | 优先级。取值越小优先等级越高。 |  [optional]
**oldSourceIp** | **String** | 转换前源地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或10.2.0.6/24。 |  [optional]
**oldDestinationIp** | **String** | 转换前目的地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或1.1.1.10。 |  [optional]
**sourceConvert** | **Integer** | 源地址转换为。转换模式（conversionMode）为1或3时必填，取值范围：0---出接口地址。1---地址池中地址。 |  [optional]
**newSourceIpGroup** | **List&lt;String&gt;** | 转换后源地址池列表。转换模式（conversionMode）为1或3，并且源地址转化为（sourceConvert）1时必填。 |  [optional]
**newDestinationIpGroup** | **List&lt;String&gt;** | 转换后目的地址池列表。转换模式（conversionMode）为2或3时必填。 |  [optional]
**destinationPort** | **String** | 目的端口。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。 |  [optional]
**serviceList** | [**List&lt;ServiceListInfoDto&gt;**](ServiceListInfoDto.md) | 服务配置信息列表。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。 |  [optional]



