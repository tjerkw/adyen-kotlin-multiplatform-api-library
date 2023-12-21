
# BacsDirectDebitDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccountNumber** | **kotlin.String** | The bank account number (without separators). |  [optional]
**bankLocationId** | **kotlin.String** | The bank routing number of the account. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**holderName** | **kotlin.String** | The name of the bank account holder. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**type** | [**inline**](#Type) | **directdebit_GB** |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | directdebit_GB



