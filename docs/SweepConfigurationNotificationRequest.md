
# SweepConfigurationNotificationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**&#x60;data&#x60;** | [**SweepConfigurationNotificationData**](SweepConfigurationNotificationData.md) |  | 
**environment** | **kotlin.String** | The environment from which the webhook originated.  Possible values: **test**, **live**. | 
**type** | [**inline**](#Type) | Type of webhook. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | balancePlatform.balanceAccountSweep.created, balancePlatform.balanceAccountSweep.updated, balancePlatform.balanceAccountSweep.deleted



