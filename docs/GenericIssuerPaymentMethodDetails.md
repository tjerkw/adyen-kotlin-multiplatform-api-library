
# GenericIssuerPaymentMethodDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **kotlin.String** | The issuer id of the shopper&#39;s selected bank. | 
**type** | [**inline**](#Type) | **genericissuer** | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | onlineBanking_PL, eps, onlineBanking_SK, onlineBanking_CZ



