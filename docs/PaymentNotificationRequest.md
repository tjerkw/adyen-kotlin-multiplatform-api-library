
# PaymentNotificationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**&#x60;data&#x60;** | [**PaymentInstrumentNotificationData**](PaymentInstrumentNotificationData.md) |  | 
**environment** | **kotlin.String** | The environment from which the webhook originated.  Possible values: **test**, **live**. | 
**type** | [**inline**](#Type) | Type of webhook. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | balancePlatform.paymentInstrument.created, balancePlatform.paymentInstrument.updated



