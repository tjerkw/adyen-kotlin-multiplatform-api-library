
# PaymentCancelResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantAccount** | **kotlin.String** | The merchant account that is used to process the payment. | 
**paymentPspReference** | **kotlin.String** | The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to cancel.  | 
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character reference associated with the cancel request. | 
**status** | [**inline**](#Status) | The status of your request. This will always have the value **received**. | 
**reference** | **kotlin.String** | Your reference for the cancel request. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | received



