
# PaymentLinkRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**merchantAccount** | **kotlin.String** | The merchant account identifier for which the payment link is created. | 
**reference** | **kotlin.String** | A reference that is used to uniquely identify the payment in future communications about the payment status. | 
**allowedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60; |  [optional]
**applicationInfo** | [**ApplicationInfo**](ApplicationInfo.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**blockedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60; |  [optional]
**captureDelayHours** | **kotlin.Int** | The delay between the authorisation and scheduled auto-capture, specified in hours. |  [optional]
**countryCode** | **kotlin.String** | The shopper&#39;s two-letter country code. |  [optional]
**dateOfBirth** | **kotlin.String** | The shopper&#39;s date of birth.  Format [ISO-8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DD |  [optional]
**deliverAt** | **kotlin.String** | The date and time when the purchased goods should be delivered.  [ISO 8601](https://www.w3.org/TR/NOTE-datetime) format: YYYY-MM-DDThh:mm:ss+TZD, for example, **2020-12-18T10:15:30+01:00**. |  [optional]
**deliveryAddress** | [**Address**](Address.md) |  |  [optional]
**description** | **kotlin.String** | A short description visible on the payment page. Maximum length: 280 characters. |  [optional]
**expiresAt** | **kotlin.String** | The date when the payment link expires.  [ISO 8601](https://www.w3.org/TR/NOTE-datetime) format with time zone offset: YYYY-MM-DDThh:mm:ss+TZD, for example, **2020-12-18T10:15:30+01:00**.  The maximum expiry date is 70 days after the payment link is created.  If not provided, the payment link expires 24 hours after it was created. |  [optional]
**installmentOptions** | [**kotlin.collections.Map&lt;kotlin.String, InstallmentOption&gt;**](InstallmentOption.md) | A set of key-value pairs that specifies the installment options available per payment method. The key must be a payment method name in lowercase. For example, **card** to specify installment options for all cards, or **visa** or **mc**. The value must be an object containing the installment options. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;LineItem&gt;**](LineItem.md) | Price and product information about the purchased items, to be included on the invoice sent to the shopper. This parameter is required for open invoice (_buy now, pay later_) payment methods such Afterpay, Clearpay, Klarna, RatePay, and Zip. |  [optional]
**manualCapture** | **kotlin.Boolean** | Indicates if the payment must be [captured manually](https://docs.adyen.com/online-payments/capture). |  [optional]
**mcc** | **kotlin.String** | The [merchant category code](https://en.wikipedia.org/wiki/Merchant_category_code) (MCC) is a four-digit number, which relates to a particular market segment. This code reflects the predominant activity that is conducted by the merchant. |  [optional]
**merchantOrderReference** | **kotlin.String** | This reference allows linking multiple transactions to each other for reporting purposes (for example, order auth-rate). The reference should be unique per billing cycle. |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Metadata consists of entries, each of which includes a key and a value. Limitations: * Maximum 20 key-value pairs per request. Otherwise, error \&quot;177\&quot; occurs: \&quot;Metadata size exceeds limit\&quot; * Maximum 20 characters per key. Otherwise, error \&quot;178\&quot; occurs: \&quot;Metadata key size exceeds limit\&quot; * A key cannot have the name &#x60;checkout.linkId&#x60;. Any value that you provide with this key is going to be replaced by the real payment link ID. |  [optional]
**recurringProcessingModel** | [**inline**](#RecurringProcessingModel) | Defines a recurring payment type. Required when &#x60;storePaymentMethodMode&#x60; is set to **askForConsent** or **enabled**. Possible values: * **Subscription** – A transaction for a fixed or variable amount, which follows a fixed schedule. * **CardOnFile** – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * **UnscheduledCardOnFile** – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or has variable amounts. For example, automatic top-ups when a cardholder&#39;s balance drops below a certain amount.  |  [optional]
**requiredShopperFields** | [**inline**](#kotlin.collections.List&lt;RequiredShopperFields&gt;) | List of fields that the shopper has to provide on the payment page before completing the payment. For more information, refer to [Provide shopper information](https://docs.adyen.com/unified-commerce/pay-by-link/payment-links/api#shopper-information).  Possible values: * **billingAddress** – The address where to send the invoice. * **deliveryAddress** – The address where the purchased goods should be delivered. * **shopperEmail** – The shopper&#39;s email address. * **shopperName** – The shopper&#39;s full name. * **telephoneNumber** – The shopper&#39;s phone number.  |  [optional]
**returnUrl** | **kotlin.String** | Website URL used for redirection after payment is completed. If provided, a **Continue** button will be shown on the payment page. If shoppers select the button, they are redirected to the specified URL. |  [optional]
**reusable** | **kotlin.Boolean** | Indicates whether the payment link can be reused for multiple payments. If not provided, this defaults to **false** which means the link can be used for one successful payment only. |  [optional]
**riskData** | [**RiskData**](RiskData.md) |  |  [optional]
**shopperEmail** | **kotlin.String** | The shopper&#39;s email address. |  [optional]
**shopperLocale** | **kotlin.String** | The language to be used in the payment page, specified by a combination of a language and country code. For example, &#x60;en-US&#x60;.  For a list of shopper locales that Pay by Link supports, refer to [Language and localization](https://docs.adyen.com/unified-commerce/pay-by-link/payment-links/api#language). |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperReference** | **kotlin.String** | Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**shopperStatement** | **kotlin.String** | The text to be shown on the shopper&#39;s bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , &#39; _ - ? + * /_**. |  [optional]
**showRemovePaymentMethodButton** | **kotlin.Boolean** | Set to **false** to hide the button that lets the shopper remove a stored payment method. |  [optional]
**socialSecurityNumber** | **kotlin.String** | The shopper&#39;s social security number. |  [optional]
**splitCardFundingSources** | **kotlin.Boolean** | Boolean value indicating whether the card payment method should be split into separate debit and credit options. |  [optional]
**splits** | [**kotlin.collections.List&lt;Split&gt;**](Split.md) | An array of objects specifying how to split a payment when using [Adyen for Platforms](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information), [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic/processing-payments#providing-split-information), or [Issuing](https://docs.adyen.com/issuing/manage-funds#split). |  [optional]
**store** | **kotlin.String** | The physical store, for which this payment is processed. |  [optional]
**storePaymentMethodMode** | [**inline**](#StorePaymentMethodMode) | Indicates if the details of the payment method will be stored for the shopper. Possible values: * **disabled** – No details will be stored (default). * **askForConsent** – If the &#x60;shopperReference&#x60; is provided, the UI lets the shopper choose if they want their payment details to be stored. * **enabled** – If the &#x60;shopperReference&#x60; is provided, the details will be stored without asking the shopper for consent.   When set to **askForConsent** or **enabled**, you must also include the &#x60;recurringProcessingModel&#x60; parameter. |  [optional]
**telephoneNumber** | **kotlin.String** | The shopper&#39;s telephone number. |  [optional]
**themeId** | **kotlin.String** | A [theme](https://docs.adyen.com/unified-commerce/pay-by-link/payment-links/api#themes) to customize the appearance of the payment page. If not specified, the payment page is rendered according to the theme set as default in your Customer Area. |  [optional]


<a name="RecurringProcessingModel"></a>
## Enum: recurringProcessingModel
Name | Value
---- | -----
recurringProcessingModel | CardOnFile, Subscription, UnscheduledCardOnFile


<a name="kotlin.collections.List<RequiredShopperFields>"></a>
## Enum: requiredShopperFields
Name | Value
---- | -----
requiredShopperFields | billingAddress, deliveryAddress, shopperEmail, shopperName, telephoneNumber


<a name="StorePaymentMethodMode"></a>
## Enum: storePaymentMethodMode
Name | Value
---- | -----
storePaymentMethodMode | askForConsent, disabled, enabled



