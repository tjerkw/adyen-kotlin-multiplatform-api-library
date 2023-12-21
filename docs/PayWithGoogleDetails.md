
# PayWithGoogleDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**googlePayToken** | **kotlin.String** | The &#x60;token&#x60; that you obtained from the [Google Pay API](https://developers.google.com/pay/api/web/reference/response-objects#PaymentData) &#x60;PaymentData&#x60; response. | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**type** | [**inline**](#Type) | **paywithgoogle** |  [optional]


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | paywithgoogle



