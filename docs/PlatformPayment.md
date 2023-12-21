
# PlatformPayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modificationMerchantReference** | **kotlin.String** | The capture&#39;s merchant reference included in the transfer. |  [optional]
**modificationPspReference** | **kotlin.String** | The capture reference included in the transfer. |  [optional]
**paymentMerchantReference** | **kotlin.String** | The payment&#39;s merchant reference included in the transfer. |  [optional]
**platformPaymentType** | [**inline**](#PlatformPaymentType) | The type of the related split. |  [optional]
**pspPaymentReference** | **kotlin.String** | The payment reference included in the transfer. |  [optional]
**type** | [**inline**](#Type) | **platformPayment** |  [optional]


<a name="PlatformPaymentType"></a>
## Enum: platformPaymentType
Name | Value
---- | -----
platformPaymentType | AcquiringFees, AdyenCommission, AdyenFees, AdyenMarkup, BalanceAccount, Commission, Default, Interchange, PaymentFee, Remainder, SchemeFee, TopUp, VAT


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | platformPayment



