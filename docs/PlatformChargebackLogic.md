
# PlatformChargebackLogic

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**behavior** | [**inline**](#Behavior) | The method of handling the chargeback.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**. |  [optional]
**costAllocationAccount** | **kotlin.String** | The unique identifier of the balance account to which the chargeback fees are booked. By default, the chargeback fees are booked to your liable balance account. |  [optional]
**targetAccount** | **kotlin.String** | The unique identifier of the balance account against which the disputed amount is booked.  Required if &#x60;behavior&#x60; is **deductFromOneBalanceAccount**. |  [optional]


<a name="Behavior"></a>
## Enum: behavior
Name | Value
---- | -----
behavior | deductAccordingToSplitRatio, deductFromLiableAccount, deductFromOneBalanceAccount



