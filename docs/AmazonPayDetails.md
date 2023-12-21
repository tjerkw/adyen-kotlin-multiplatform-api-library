
# AmazonPayDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazonPayToken** | **kotlin.String** | This is the &#x60;amazonPayToken&#x60; that you obtained from the [Get Checkout Session](https://amazon-pay-acquirer-guide.s3-eu-west-1.amazonaws.com/v1/amazon-pay-api-v2/checkout-session.html#get-checkout-session) response. This token is used for API only integration specifically. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**checkoutSessionId** | **kotlin.String** | The &#x60;checkoutSessionId&#x60; is used to identify the checkout session at the Amazon Pay side. This field is required only for drop-in and components integration, where it replaces the amazonPayToken. |  [optional]
**type** | [**inline**](#Type) | **amazonpay** |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | amazonpay



