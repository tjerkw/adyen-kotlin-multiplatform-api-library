
# IssuedCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**panEntryMode** | [**inline**](#PanEntryMode) | Indicates the method used for entering the PAN to initiate a transaction.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **ecommerce**, **token**. |  [optional]
**processingType** | [**inline**](#ProcessingType) | Contains information about how the payment was processed. For example, **ecommerce** for online or **pos** for in-person payments. |  [optional]
**relayedAuthorisationData** | [**RelayedAuthorisationData**](RelayedAuthorisationData.md) |  |  [optional]
**type** | [**inline**](#Type) | **issuedCard** |  [optional]
**validationFacts** | [**kotlin.collections.List&lt;TransferNotificationValidationFact&gt;**](TransferNotificationValidationFact.md) | The evaluation of the validation facts. See [validation checks](https://docs.adyen.com/issuing/validation-checks) for more information. |  [optional]


<a name="PanEntryMode"></a>
## Enum: panEntryMode
Name | Value
---- | -----
panEntryMode | chip, cof, contactless, ecommerce, magstripe, manual, token


<a name="ProcessingType"></a>
## Enum: processingType
Name | Value
---- | -----
processingType | atmWithdraw, balanceInquiry, ecommerce, moto, pos, purchaseWithCashback, recurring, token


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | issuedCard



