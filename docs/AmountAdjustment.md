
# AmountAdjustment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  |  [optional]
**amountAdjustmentType** | [**inline**](#AmountAdjustmentType) | The type of markup that is applied to an authorised payment.  Possible values: **exchange**, **forexMarkup**, **authHoldReserve**, **atmMarkup**. |  [optional]
**basepoints** | **kotlin.Int** | The basepoints associated with the applied markup. |  [optional]


<a name="AmountAdjustmentType"></a>
## Enum: amountAdjustmentType
Name | Value
---- | -----
amountAdjustmentType | atmMarkup, authHoldReserve, exchange, forexMarkup



