
# StoreDetailAndSubmitResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pspReference** | **kotlin.String** | A new reference to uniquely identify this request. | 
**resultCode** | **kotlin.String** | The response:  * In case of success is payout-submit-received. * In case of an error, an informational message is returned. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be returned in a particular response. |  [optional]
**refusalReason** | **kotlin.String** | In case of refusal, an informational message for the reason. |  [optional]



