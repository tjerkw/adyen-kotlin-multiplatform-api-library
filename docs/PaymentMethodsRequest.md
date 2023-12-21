
# PaymentMethodsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantAccount** | **kotlin.String** | The merchant account identifier, with which you want to process the transaction. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value. |  [optional]
**allowedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60; |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**blockedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60; |  [optional]
**channel** | [**inline**](#Channel) | The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web |  [optional]
**countryCode** | **kotlin.String** | The shopper&#39;s country code. |  [optional]
**order** | [**EncryptedOrderData**](EncryptedOrderData.md) |  |  [optional]
**shopperLocale** | **kotlin.String** | The combination of a language code and a country code to specify the language to be used in the payment. |  [optional]
**shopperReference** | **kotlin.String** | Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**splitCardFundingSources** | **kotlin.Boolean** | Boolean value indicating whether the card payment method should be split into separate debit and credit options. |  [optional]
**store** | **kotlin.String** | The ecommerce or point-of-sale store that is processing the payment. Used in:  * [Partner platform integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for the [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic). * [Platform setup integrations](https://docs.adyen.com/marketplaces-and-platforms/additional-for-platform-setup/route-payment-to-store) for the [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms). |  [optional]


<a name="Channel"></a>
## Enum: channel
Name | Value
---- | -----
channel | iOS, Android, Web



