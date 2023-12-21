
# TransferDataCategoryData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priority** | [**inline**](#Priority) | The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with &#x60;category&#x60; **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN). |  [optional]
**type** | [**inline**](#Type) | **platformPayment** |  [optional]
**modificationMerchantReference** | **kotlin.String** | The capture&#39;s merchant reference included in the transfer. |  [optional]
**modificationPspReference** | **kotlin.String** | The capture reference included in the transfer. |  [optional]
**panEntryMode** | [**inline**](#PanEntryMode) | Indicates the method used for entering the PAN to initiate a transaction.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **ecommerce**, **token**. |  [optional]
**processingType** | [**inline**](#ProcessingType) | Contains information about how the payment was processed. For example, **ecommerce** for online or **pos** for in-person payments. |  [optional]
**relayedAuthorisationData** | [**RelayedAuthorisationData**](RelayedAuthorisationData.md) |  |  [optional]
**validationFacts** | [**kotlin.collections.List&lt;TransferNotificationValidationFact&gt;**](TransferNotificationValidationFact.md) | The evaluation of the validation facts. See [validation checks](https://docs.adyen.com/issuing/validation-checks) for more information. |  [optional]
**paymentMerchantReference** | **kotlin.String** | The payment&#39;s merchant reference included in the transfer. |  [optional]
**platformPaymentType** | [**inline**](#PlatformPaymentType) | The type of the related split. |  [optional]
**pspPaymentReference** | **kotlin.String** | The payment reference included in the transfer. |  [optional]


<a name="Priority"></a>
## Enum: priority
Name | Value
---- | -----
priority | crossBorder, fast, instant, internal, regular, wire


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | platformPayment


<a name="PanEntryMode"></a>
## Enum: panEntryMode
Name | Value
---- | -----
panEntryMode | chip, cof, contactless, ecommerce, magstripe, manual, token


<a name="ProcessingType"></a>
## Enum: processingType
Name | Value
---- | -----
processingType | atmWithdraw, balanceInquiry, ecommerce, moto, pos, purchaseWithCashback, recurring, token


<a name="PlatformPaymentType"></a>
## Enum: platformPaymentType
Name | Value
---- | -----
platformPaymentType | AcquiringFees, AdyenCommission, AdyenFees, AdyenMarkup, BalanceAccount, Commission, Default, Interchange, PaymentFee, Remainder, SchemeFee, TopUp, VAT



