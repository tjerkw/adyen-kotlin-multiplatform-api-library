
# PaymentMethodSetupInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). | 
**afterpayTouch** | [**AfterpayTouchInfo**](AfterpayTouchInfo.md) |  |  [optional]
**applePay** | [**ApplePayInfo**](ApplePayInfo.md) |  |  [optional]
**bcmc** | [**BcmcInfo**](BcmcInfo.md) |  |  [optional]
**businessLineId** | **kotlin.String** | The unique identifier of the business line. |  [optional]
**cartesBancaires** | [**CartesBancairesInfo**](CartesBancairesInfo.md) |  |  [optional]
**clearpay** | [**ClearpayInfo**](ClearpayInfo.md) |  |  [optional]
**countries** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of countries where a payment method is available. By default, all countries supported by the payment method. |  [optional]
**cup** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**currencies** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of currencies that a payment method supports. By default, all currencies supported by the payment method. |  [optional]
**customRoutingFlags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of custom routing flags to route payment to the intended acquirer. |  [optional]
**diners** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**discover** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**eftposAustralia** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**giroPay** | [**GiroPayInfo**](GiroPayInfo.md) |  |  [optional]
**girocard** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**googlePay** | [**GooglePayInfo**](GooglePayInfo.md) |  |  [optional]
**ideal** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**interacCard** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**jcb** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**klarna** | [**KlarnaInfo**](KlarnaInfo.md) |  |  [optional]
**maestro** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**mc** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]
**mealVoucherFR** | [**MealVoucherFRInfo**](MealVoucherFRInfo.md) |  |  [optional]
**paypal** | [**PayPalInfo**](PayPalInfo.md) |  |  [optional]
**reference** | **kotlin.String** | Your reference for the payment method. Supported characters a-z, A-Z, 0-9. |  [optional]
**shopperInteraction** | [**inline**](#ShopperInteraction) | The sales channel. Required if the merchant account does not have a sales channel. When you provide this field, it overrides the default sales channel set on the merchant account.  Possible values: **eCommerce**, **pos**, **contAuth**, and **moto**.  |  [optional]
**sofort** | [**SofortInfo**](SofortInfo.md) |  |  [optional]
**storeIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The unique identifier of the store for which to configure the payment method, if any. |  [optional]
**swish** | [**SwishInfo**](SwishInfo.md) |  |  [optional]
**twint** | [**TwintInfo**](TwintInfo.md) |  |  [optional]
**vipps** | [**VippsInfo**](VippsInfo.md) |  |  [optional]
**visa** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | afterpaytouch, alipay, alipay_hk, amex, applepay, bcmc, blik, cartebancaire, clearpay, cup, diners, directdebit_GB, discover, ebanking_FI, eftpos_australia, elo, elocredit, elodebit, girocard, googlepay, hiper, hipercard, ideal, interac_card, jcb, klarna, klarna_account, klarna_paynow, maestro, mbway, mc, mcdebit, mealVoucher_FR, mobilepay, multibanco, onlineBanking_PL, paybybank, paypal, payshop, swish, trustly, twint, twint_pos, vipps, visa, visadebit, vpay, wechatpay, wechatpay_pos


<a name="ShopperInteraction"></a>
## Enum: shopperInteraction
Name | Value
---- | -----
shopperInteraction | eCommerce, pos, moto, contAuth



