
# CreateOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**expiresAt** | **kotlin.String** | The date that the order will expire. | 
**orderData** | **kotlin.String** | The encrypted data that will be used by merchant for adding payments to the order. | 
**remainingAmount** | [**Amount**](Amount.md) |  | 
**resultCode** | [**inline**](#ResultCode) | The result of the order creation request.  The value is always **Success**. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** &gt; **Developers** &gt; **Additional data**. |  [optional]
**fraudResult** | [**FraudResult**](FraudResult.md) |  |  [optional]
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request. |  [optional]
**reference** | **kotlin.String** | The reference provided by merchant for creating the order. |  [optional]
**refusalReason** | **kotlin.String** | If the payment&#39;s authorisation is refused or an error occurs during authorisation, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons). |  [optional]


<a name="ResultCode"></a>
## Enum: resultCode
Name | Value
---- | -----
resultCode | Success



