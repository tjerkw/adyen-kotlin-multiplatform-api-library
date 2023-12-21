
# SamsungPayDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**samsungPayToken** | **kotlin.String** | The payload you received from the Samsung Pay SDK response. | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**type** | [**inline**](#Type) | **samsungpay** |  [optional]


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | samsungpay



