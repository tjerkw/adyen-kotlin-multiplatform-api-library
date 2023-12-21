
# PaymentRefundRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**merchantAccount** | **kotlin.String** | The merchant account that is used to process the payment. | 
**applicationInfo** | [**ApplicationInfo**](ApplicationInfo.md) |  |  [optional]
**lineItems** | [**kotlin.collections.List&lt;LineItem&gt;**](LineItem.md) | Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip. |  [optional]
**merchantRefundReason** | [**inline**](#MerchantRefundReason) | Your reason for the refund request |  [optional]
**reference** | **kotlin.String** | Your reference for the refund request. Maximum length: 80 characters. |  [optional]
**splits** | [**kotlin.collections.List&lt;Split&gt;**](Split.md) | An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information). |  [optional]
**store** | **kotlin.String** | The online store or [physical store](https://docs.adyen.com/point-of-sale/design-your-integration/determine-account-structure/#create-stores) that is processing the refund. This must be the same as the store name configured in your Customer Area.  Otherwise, you get an error and the refund fails. |  [optional]


<a name="MerchantRefundReason"></a>
## Enum: merchantRefundReason
Name | Value
---- | -----
merchantRefundReason | FRAUD, CUSTOMER REQUEST, RETURN, DUPLICATE, OTHER



