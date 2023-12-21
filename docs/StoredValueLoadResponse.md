
# StoredValueLoadResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authCode** | **kotlin.String** | Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty. |  [optional]
**currentBalance** | [**Amount**](Amount.md) |  |  [optional]
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request. |  [optional]
**refusalReason** | **kotlin.String** | If the transaction is refused or an error occurs, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values. |  [optional]
**resultCode** | [**inline**](#ResultCode) | The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.   |  [optional]
**thirdPartyRefusalReason** | **kotlin.String** | Raw refusal reason received from the third party, where available |  [optional]


<a name="ResultCode"></a>
## Enum: resultCode
Name | Value
---- | -----
resultCode | Success, Refused, Error, NotEnoughBalance



