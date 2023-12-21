
# KlarnaDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **klarna** | 
**billingAddress** | **kotlin.String** | The address where to send the invoice. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**deliveryAddress** | **kotlin.String** | The address where the goods should be delivered. |  [optional]
**personalDetails** | **kotlin.String** | Shopper name, date of birth, phone number, and email address. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**subtype** | **kotlin.String** | The type of flow to initiate. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | klarna, klarnapayments, klarnapayments_account, klarnapayments_b2b, klarna_paynow, klarna_account, klarna_b2b



