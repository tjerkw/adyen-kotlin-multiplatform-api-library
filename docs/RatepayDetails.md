
# RatepayDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **ratepay** | 
**billingAddress** | **kotlin.String** | The address where to send the invoice. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**deliveryAddress** | **kotlin.String** | The address where the goods should be delivered. |  [optional]
**personalDetails** | **kotlin.String** | Shopper name, date of birth, phone number, and email address. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | ratepay, ratepay_directdebit



