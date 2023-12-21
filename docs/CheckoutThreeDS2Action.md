
# CheckoutThreeDS2Action

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **threeDS2** | 
**authorisationToken** | **kotlin.String** | A token needed to authorise a payment. |  [optional]
**paymentData** | **kotlin.String** | Encoded payment data. |  [optional]
**paymentMethodType** | **kotlin.String** | Specifies the payment method. |  [optional]
**subtype** | **kotlin.String** | A subtype of the token. |  [optional]
**token** | **kotlin.String** | A token to pass to the 3DS2 Component to get the fingerprint. |  [optional]
**url** | **kotlin.String** | Specifies the URL to redirect to. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | threeDS2



