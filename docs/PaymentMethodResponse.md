
# PaymentMethodResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemsTotal** | **kotlin.Int** | Total number of items. | 
**pagesTotal** | **kotlin.Int** | Total number of pages. | 
**links** | [**PaginationLinks**](PaginationLinks.md) |  |  [optional]
**&#x60;data&#x60;** | [**kotlin.collections.List&lt;PaymentMethod&gt;**](PaymentMethod.md) | The list of supported payment methods and their details. |  [optional]
**typesWithErrors** | [**inline**](#kotlin.collections.List&lt;TypesWithErrors&gt;) | Payment method types with errors. |  [optional]


<a name="kotlin.collections.List<TypesWithErrors>"></a>
## Enum: typesWithErrors
Name | Value
---- | -----
typesWithErrors | afterpaytouch, alipay, alipay_hk, amex, applepay, bcmc, blik, cartebancaire, clearpay, cup, diners, directdebit_GB, discover, ebanking_FI, eftpos_australia, elo, elocredit, elodebit, girocard, googlepay, hiper, hipercard, ideal, interac_card, jcb, klarna, klarna_account, klarna_paynow, maestro, mbway, mc, mcdebit, mealVoucher_FR, mobilepay, multibanco, onlineBanking_PL, paybybank, paypal, payshop, swish, trustly, twint, twint_pos, vipps, visa, visadebit, vpay, wechatpay, wechatpay_pos



