
# PayUUpiDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **payu_IN_upi** | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**shopperNotificationReference** | **kotlin.String** | The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used for recurring payment only. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**virtualPaymentAddress** | **kotlin.String** | The virtual payment address for UPI. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | payu_IN_upi



