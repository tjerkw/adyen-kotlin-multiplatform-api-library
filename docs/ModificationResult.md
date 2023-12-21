
# ModificationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request. | 
**response** | [**inline**](#Response) | Indicates if the modification request has been received for processing. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be returned in a particular modification response. |  [optional]


<a name="Response"></a>
## Enum: response
Name | Value
---- | -----
response | [capture-received], [cancel-received], [refund-received], [cancelOrRefund-received], [adjustAuthorisation-received], [donation-received], [technical-cancel-received], [voidPendingRefund-received]



