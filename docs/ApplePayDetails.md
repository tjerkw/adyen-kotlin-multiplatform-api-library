
# ApplePayDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applePayToken** | **kotlin.String** | The stringified and base64 encoded &#x60;paymentData&#x60; you retrieved from the Apple framework. | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**type** | [**inline**](#Type) | **applepay** |  [optional]


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | applepay



