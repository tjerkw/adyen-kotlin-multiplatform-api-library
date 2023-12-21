
# TransferNotificationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**&#x60;data&#x60;** | [**TransferData**](TransferData.md) |  | 
**environment** | **kotlin.String** | The environment from which the webhook originated.  Possible values: **test**, **live**. | 
**type** | [**inline**](#Type) | The type of webhook. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | balancePlatform.transfer.created, balancePlatform.transfer.updated



