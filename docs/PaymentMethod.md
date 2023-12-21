
# PaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The identifier of the resource. | 
**afterpayTouch** | [**AfterpayTouchInfo**](AfterpayTouchInfo.md) |  |  [optional]
**allowed** | **kotlin.Boolean** | Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account. |  [optional]
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
**enabled** | **kotlin.Boolean** | Indicates whether the payment method is enabled (**true**) or disabled (**false**). |  [optional]
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
**shopperInteraction** | **kotlin.String** | The sales channel. |  [optional]
**sofort** | [**SofortInfo**](SofortInfo.md) |  |  [optional]
**storeIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The unique identifier of the store for which to configure the payment method, if any. |  [optional]
**swish** | [**SwishInfo**](SwishInfo.md) |  |  [optional]
**twint** | [**TwintInfo**](TwintInfo.md) |  |  [optional]
**type** | **kotlin.String** | Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). |  [optional]
**verificationStatus** | [**inline**](#VerificationStatus) | Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected** |  [optional]
**vipps** | [**VippsInfo**](VippsInfo.md) |  |  [optional]
**visa** | [**GenericPmWithTdiInfo**](GenericPmWithTdiInfo.md) |  |  [optional]


<a name="VerificationStatus"></a>
## Enum: verificationStatus
Name | Value
---- | -----
verificationStatus | valid, pending, invalid, rejected



