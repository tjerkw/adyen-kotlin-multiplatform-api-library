
# PaymentAmountUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**merchantAccount** | **kotlin.String** | The merchant account that is used to process the payment. | 
**applicationInfo** | [**ApplicationInfo**](ApplicationInfo.md) |  |  [optional]
**industryUsage** | [**inline**](#IndustryUsage) | The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment** |  [optional]
**lineItems** | [**kotlin.collections.List&lt;LineItem&gt;**](LineItem.md) | Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip. |  [optional]
**reference** | **kotlin.String** | Your reference for the amount update request. Maximum length: 80 characters. |  [optional]
**splits** | [**kotlin.collections.List&lt;Split&gt;**](Split.md) | An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information). |  [optional]


<a name="IndustryUsage"></a>
## Enum: industryUsage
Name | Value
---- | -----
industryUsage | delayedCharge, installment, noShow



