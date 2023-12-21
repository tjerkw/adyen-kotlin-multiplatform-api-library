
# CostEstimateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardBin** | [**CardBin**](CardBin.md) |  |  [optional]
**costEstimateAmount** | [**Amount**](Amount.md) |  |  [optional]
**costEstimateReference** | **kotlin.String** | Adyen&#39;s 16-character reference associated with the request. |  [optional]
**resultCode** | **kotlin.String** | The result of the cost estimation. |  [optional]
**surchargeType** | **kotlin.String** | Indicates the way the charges can be passed on to the cardholder. The following values are possible: * &#x60;ZERO&#x60; - the charges are not allowed to pass on * &#x60;PASSTHROUGH&#x60; - the charges can be passed on * &#x60;UNLIMITED&#x60; - there is no limit on how much surcharge is passed on |  [optional]



