
# PayPalDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **paypal** | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**orderID** | **kotlin.String** | The unique ID associated with the order. |  [optional]
**payeePreferred** | **kotlin.String** | IMMEDIATE_PAYMENT_REQUIRED or UNRESTRICTED |  [optional]
**payerID** | **kotlin.String** | The unique ID associated with the payer. |  [optional]
**payerSelected** | **kotlin.String** | PAYPAL or PAYPAL_CREDIT |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**subtype** | [**inline**](#Subtype) | The type of flow to initiate. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | paypal


<a name="Subtype"></a>
## Enum: subtype
Name | Value
---- | -----
subtype | redirect, sdk



