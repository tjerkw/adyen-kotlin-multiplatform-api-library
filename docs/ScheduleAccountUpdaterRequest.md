
# ScheduleAccountUpdaterRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantAccount** | **kotlin.String** | Account of the merchant. | 
**reference** | **kotlin.String** | A reference that merchants can apply for the call. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be required for a particular request. |  [optional]
**card** | [**Card**](Card.md) |  |  [optional]
**selectedRecurringDetailReference** | **kotlin.String** | The selected detail recurring reference.  Optional if &#x60;card&#x60; is provided. |  [optional]
**shopperReference** | **kotlin.String** | The reference of the shopper that owns the recurring contract.  Optional if &#x60;card&#x60; is provided. |  [optional]



