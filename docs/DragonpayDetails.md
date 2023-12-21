
# DragonpayDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **kotlin.String** | The Dragonpay issuer value of the shopper&#39;s selected bank. Set this to an **id** of a Dragonpay issuer to preselect it. | 
**type** | [**inline**](#Type) | **dragonpay** | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper’s email address. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | dragonpay_ebanking, dragonpay_otc_banking, dragonpay_otc_non_banking, dragonpay_otc_philippines



