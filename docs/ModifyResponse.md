
# ModifyResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character string reference associated with the transaction. This value is globally unique; quote it when communicating with us about this response. | 
**response** | **kotlin.String** | The response: * In case of success, it is either &#x60;payout-confirm-received&#x60; or &#x60;payout-decline-received&#x60;. * In case of an error, an informational message is returned. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be returned in a particular response. |  [optional]



