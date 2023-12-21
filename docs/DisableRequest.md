
# DisableRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantAccount** | **kotlin.String** | The merchant account identifier with which you want to process the transaction. | 
**shopperReference** | **kotlin.String** | The ID that uniquely identifies the shopper.  This &#x60;shopperReference&#x60; must be the same as the &#x60;shopperReference&#x60; used in the initial payment. | 
**contract** | **kotlin.String** | Specify the contract if you only want to disable a specific use.  This field can be set to one of the following values, or to their combination (comma-separated): * ONECLICK * RECURRING * PAYOUT |  [optional]
**recurringDetailReference** | **kotlin.String** | The ID that uniquely identifies the recurring detail reference.  If it is not provided, the whole recurring contract of the &#x60;shopperReference&#x60; will be disabled, which includes all recurring details. |  [optional]



