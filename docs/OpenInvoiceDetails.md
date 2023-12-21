
# OpenInvoiceDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingAddress** | **kotlin.String** | The address where to send the invoice. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**deliveryAddress** | **kotlin.String** | The address where the goods should be delivered. |  [optional]
**personalDetails** | **kotlin.String** | Shopper name, date of birth, phone number, and email address. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**type** | [**inline**](#Type) | **openinvoice** |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | openinvoice, afterpay_directdebit, atome_pos



