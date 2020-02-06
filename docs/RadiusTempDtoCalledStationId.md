
# RadiusTempDtoCalledStationId

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enable** | **Boolean** | 是否设置called-station-id属性，创建时，若不填则默认值为false。 |  [optional]
**attributeValue** | **String** | called-station-id属性封装的内容，只能为ap-mac，ap-location，当enable为true时必填。 |  [optional]
**includeSsid** | **Boolean** | called-station-id属性封装内容是否包含SSID，当enable为true时生效，创建时，若不填则默认值为false。 |  [optional]
**delimiter** | **String** | called-station-id属性封装内容包含SSID时，SSID前的分隔符，取值范围： / : &lt; &gt; | @ &#39; % * + - &amp; ! # ^ ~，只能是1位，当includeSsid为true时必填。 |  [optional]



