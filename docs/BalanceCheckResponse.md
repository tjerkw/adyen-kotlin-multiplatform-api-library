
# BalanceCheckResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | [**Amount**](Amount.md) |  | 
**resultCode** | [**inline**](#ResultCode) | The result of the cancellation request.  Possible values:  * **Success** – Indicates that the balance check was successful. * **NotEnoughBalance** – Commonly indicates that the card did not have enough balance to pay the amount in the request, or that the currency of the balance on the card did not match the currency of the requested amount. * **Failed** – Indicates that the balance check failed. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** &gt; **Developers** &gt; **Additional data**. |  [optional]
**fraudResult** | [**FraudResult**](FraudResult.md) |  |  [optional]
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request. |  [optional]
**refusalReason** | **kotlin.String** | If the payment&#39;s authorisation is refused or an error occurs during authorisation, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons). |  [optional]
**transactionLimit** | [**Amount**](Amount.md) |  |  [optional]


<a name="ResultCode"></a>
## Enum: resultCode
Name | Value
---- | -----
resultCode | Success, NotEnoughBalance, Failed



