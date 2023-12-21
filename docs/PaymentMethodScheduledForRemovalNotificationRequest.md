
# PaymentMethodScheduledForRemovalNotificationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **kotlin.String** | Timestamp for when the webhook was created. | 
**&#x60;data&#x60;** | [**MidServiceNotificationData**](MidServiceNotificationData.md) |  | 
**environment** | **kotlin.String** | The environment from which the webhook originated.  Possible values: **test**, **live**. | 
**type** | [**inline**](#Type) | Type of notification. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | paymentMethod.requestScheduledForRemoval



