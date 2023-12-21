
# SepaDirectDebitDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **kotlin.String** | The International Bank Account Number (IBAN). | 
**ownerName** | **kotlin.String** | The name of the bank account holder. | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**type** | [**inline**](#Type) | **sepadirectdebit** |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | sepadirectdebit, sepadirectdebit_amazonpay



