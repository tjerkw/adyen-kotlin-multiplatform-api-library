
# PaymentRequest3d

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**md** | **kotlin.String** | The payment session identifier returned by the card issuer. | 
**merchantAccount** | **kotlin.String** | The merchant account identifier, with which you want to process the transaction. | 
**paResponse** | **kotlin.String** | Payment authorisation response returned by the card issuer. The &#x60;paResponse&#x60; field holds the PaRes value received from the card issuer. | 
**accountInfo** | [**AccountInfo**](AccountInfo.md) |  |  [optional]
**additionalAmount** | [**Amount**](Amount.md) |  |  [optional]
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value. |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**applicationInfo** | [**ApplicationInfo**](ApplicationInfo.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**browserInfo** | [**BrowserInfo**](BrowserInfo.md) |  |  [optional]
**captureDelayHours** | **kotlin.Int** | The delay between the authorisation and scheduled auto-capture, specified in hours. |  [optional]
**dateOfBirth** | **kotlin.String** | The shopper&#39;s date of birth.  Format [ISO-8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DD |  [optional]
**dccQuote** | [**ForexQuote**](ForexQuote.md) |  |  [optional]
**deliveryAddress** | [**Address**](Address.md) |  |  [optional]
**deliveryDate** | **kotlin.String** | The date and time the purchased goods should be delivered.  Format [ISO 8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DDThh:mm:ss.sssTZD  Example: 2017-07-17T13:42:40.428+01:00 |  [optional]
**deviceFingerprint** | **kotlin.String** | A string containing the shopper&#39;s device fingerprint. For more information, refer to [Device fingerprinting](https://docs.adyen.com/risk-management/device-fingerprinting). |  [optional]
**fraudOffset** | **kotlin.Int** | An integer value that is added to the normal fraud score. The value can be either positive or negative. |  [optional]
**installments** | [**Installments**](Installments.md) |  |  [optional]
**localizedShopperStatement** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | The &#x60;localizedShopperStatement&#x60; field lets you use dynamic values for your shopper statement in a local character set. If not supplied, left empty, or for cross-border transactions, **shopperStatement** is used.  Adyen currently supports the ja-Kana character set for Visa and Mastercard payments in Japan using Japanese cards. This character set supports:  * UTF-8 based Katakana, capital letters, numbers and special characters.  * Half-width or full-width characters. |  [optional]
**mcc** | **kotlin.String** | The [merchant category code](https://en.wikipedia.org/wiki/Merchant_category_code) (MCC) is a four-digit number, which relates to a particular market segment. This code reflects the predominant activity that is conducted by the merchant. |  [optional]
**merchantOrderReference** | **kotlin.String** | This reference allows linking multiple transactions to each other for reporting purposes (i.e. order auth-rate). The reference should be unique per billing cycle. The same merchant order reference should never be reused after the first authorised attempt. If used, this field should be supplied for all incoming authorisations. &gt; We strongly recommend you send the &#x60;merchantOrderReference&#x60; value to benefit from linking payment requests when authorisation retries take place. In addition, we recommend you provide &#x60;retry.orderAttemptNumber&#x60;, &#x60;retry.chainAttemptNumber&#x60;, and &#x60;retry.skipRetry&#x60; values in &#x60;PaymentRequest.additionalData&#x60;. |  [optional]
**merchantRiskIndicator** | [**MerchantRiskIndicator**](MerchantRiskIndicator.md) |  |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Metadata consists of entries, each of which includes a key and a value. Limits: * Maximum 20 key-value pairs per request. When exceeding, the \&quot;177\&quot; error occurs: \&quot;Metadata size exceeds limit\&quot;. * Maximum 20 characters per key. * Maximum 80 characters per value.  |  [optional]
**orderReference** | **kotlin.String** | When you are doing multiple partial (gift card) payments, this is the &#x60;pspReference&#x60; of the first payment. We use this to link the multiple payments to each other. As your own reference for linking multiple payments, use the &#x60;merchantOrderReference&#x60;instead. |  [optional]
**recurring** | [**Recurring**](Recurring.md) |  |  [optional]
**recurringProcessingModel** | [**inline**](#RecurringProcessingModel) | Defines a recurring payment type. Required when creating a token to store payment details or using stored payment details. Allowed values: * &#x60;Subscription&#x60; – A transaction for a fixed or variable amount, which follows a fixed schedule. * &#x60;CardOnFile&#x60; – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * &#x60;UnscheduledCardOnFile&#x60; – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or have variable amounts. For example, automatic top-ups when a cardholder&#39;s balance drops below a certain amount.  |  [optional]
**reference** | **kotlin.String** | The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters. |  [optional]
**selectedBrand** | **kotlin.String** | Some payment methods require defining a value for this field to specify how to process the transaction.  For the Bancontact payment method, it can be set to: * &#x60;maestro&#x60; (default), to be processed like a Maestro card, or * &#x60;bcmc&#x60;, to be processed like a Bancontact card. |  [optional]
**selectedRecurringDetailReference** | **kotlin.String** | The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail. |  [optional]
**sessionId** | **kotlin.String** | A session ID used to identify a payment session. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper&#39;s email address. We recommend that you provide this data, as it is used in velocity fraud checks. &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperEmail&#x60; for all browser-based and mobile implementations. |  [optional]
**shopperIP** | **kotlin.String** | The shopper&#39;s IP address. In general, we recommend that you provide this data, as it is used in a number of risk checks (for instance, number of payment attempts or location-based checks). &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperIP&#x60; for all browser-based implementations. This field is also mandatory for some merchants depending on your business model. For more information, [contact Support](https://www.adyen.help/hc/en-us/requests/new). |  [optional]
**shopperInteraction** | [**inline**](#ShopperInteraction) | Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal. |  [optional]
**shopperLocale** | **kotlin.String** | The combination of a language code and a country code to specify the language to be used in the payment. |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperReference** | **kotlin.String** | Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**shopperStatement** | **kotlin.String** | The text to be shown on the shopper&#39;s bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , &#39; _ - ? + * /_**. |  [optional]
**socialSecurityNumber** | **kotlin.String** | The shopper&#39;s social security number. |  [optional]
**splits** | [**kotlin.collections.List&lt;Split&gt;**](Split.md) | An array of objects specifying how the payment should be split when using [Adyen for Platforms](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information) or [Issuing](https://docs.adyen.com/issuing/add-manage-funds#split). |  [optional]
**store** | **kotlin.String** | The ecommerce or point-of-sale store that is processing the payment. Used in:  * [Partner platform integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for the [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic). * [Platform setup integrations](https://docs.adyen.com/marketplaces-and-platforms/additional-for-platform-setup/route-payment-to-store) for the [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms). |  [optional]
**telephoneNumber** | **kotlin.String** | The shopper&#39;s telephone number. |  [optional]
**threeDS2RequestData** | [**ThreeDS2RequestData**](ThreeDS2RequestData.md) |  |  [optional]
**threeDSAuthenticationOnly** | **kotlin.Boolean** | If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. |  [optional]
**totalsGroup** | **kotlin.String** | The reference value to aggregate sales totals in reporting. When not specified, the store field is used (if available). |  [optional]
**trustedShopper** | **kotlin.Boolean** | Set to true if the payment should be routed to a trusted MID. |  [optional]


<a name="RecurringProcessingModel"></a>
## Enum: recurringProcessingModel
Name | Value
---- | -----
recurringProcessingModel | CardOnFile, Subscription, UnscheduledCardOnFile


<a name="ShopperInteraction"></a>
## Enum: shopperInteraction
Name | Value
---- | -----
shopperInteraction | Ecommerce, ContAuth, Moto, POS



