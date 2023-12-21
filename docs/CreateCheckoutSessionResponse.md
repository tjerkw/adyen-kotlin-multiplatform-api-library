
# CreateCheckoutSessionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**expiresAt** | **kotlin.String** | The date the session expires in [ISO8601](https://www.iso.org/iso-8601-date-and-time-format.html) format. When not specified, the expiry date is set to 1 hour after session creation. You cannot set the session expiry to more than 24 hours after session creation. | 
**id** | **kotlin.String** | A unique identifier of the session. |  [readonly]
**merchantAccount** | **kotlin.String** | The merchant account identifier, with which you want to process the transaction. | 
**reference** | **kotlin.String** | The reference to uniquely identify a payment. | 
**returnUrl** | **kotlin.String** | The URL to return to when a redirect payment is completed. | 
**accountInfo** | [**AccountInfo**](AccountInfo.md) |  |  [optional]
**additionalAmount** | [**Amount**](Amount.md) |  |  [optional]
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value. |  [optional]
**allowedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60; |  [optional]
**applicationInfo** | [**ApplicationInfo**](ApplicationInfo.md) |  |  [optional]
**authenticationData** | [**AuthenticationData**](AuthenticationData.md) |  |  [optional]
**billingAddress** | [**BillingAddress**](BillingAddress.md) |  |  [optional]
**blockedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60; |  [optional]
**captureDelayHours** | **kotlin.Int** | The delay between the authorisation and scheduled auto-capture, specified in hours. |  [optional]
**channel** | [**inline**](#Channel) | The platform where a payment transaction takes place. This field is optional for filtering out payment methods that are only available on specific platforms. If this value is not set, then we will try to infer it from the &#x60;sdkVersion&#x60; or &#x60;token&#x60;.  Possible values: * **iOS** * **Android** * **Web** |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**countryCode** | **kotlin.String** | The shopper&#39;s two-letter country code. |  [optional]
**dateOfBirth** | **kotlin.String** | The shopper&#39;s date of birth in [ISO8601](https://www.iso.org/iso-8601-date-and-time-format.html) format. |  [optional]
**deliverAt** | **kotlin.String** | The date and time when the purchased goods should be delivered.  [ISO 8601](https://www.w3.org/TR/NOTE-datetime) format: YYYY-MM-DDThh:mm:ss+TZD, for example, **2020-12-18T10:15:30+01:00**. |  [optional]
**deliveryAddress** | [**DeliveryAddress**](DeliveryAddress.md) |  |  [optional]
**enableOneClick** | **kotlin.Boolean** | When true and &#x60;shopperReference&#x60; is provided, the shopper will be asked if the payment details should be stored for future one-click payments. |  [optional]
**enablePayOut** | **kotlin.Boolean** | When true and &#x60;shopperReference&#x60; is provided, the payment details will be tokenized for payouts. |  [optional]
**enableRecurring** | **kotlin.Boolean** | When true and &#x60;shopperReference&#x60; is provided, the payment details will be tokenized for recurring payments. |  [optional]
**fundOrigin** | [**FundOrigin**](FundOrigin.md) |  |  [optional]
**fundRecipient** | [**FundRecipient**](FundRecipient.md) |  |  [optional]
**installmentOptions** | [**kotlin.collections.Map&lt;kotlin.String, CheckoutSessionInstallmentOption&gt;**](CheckoutSessionInstallmentOption.md) | A set of key-value pairs that specifies the installment options available per payment method. The key must be a payment method name in lowercase. For example, **card** to specify installment options for all cards, or **visa** or **mc**. The value must be an object containing the installment options. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;LineItem&gt;**](LineItem.md) | Price and product information about the purchased items, to be included on the invoice sent to the shopper. &gt; This field is required for 3x 4x Oney, Affirm, Afterpay, Clearpay, Klarna, Ratepay, and Zip. |  [optional]
**mandate** | [**Mandate**](Mandate.md) |  |  [optional]
**mcc** | **kotlin.String** | The [merchant category code](https://en.wikipedia.org/wiki/Merchant_category_code) (MCC) is a four-digit number, which relates to a particular market segment. This code reflects the predominant activity that is conducted by the merchant. |  [optional]
**merchantOrderReference** | **kotlin.String** | This reference allows linking multiple transactions to each other for reporting purposes (i.e. order auth-rate). The reference should be unique per billing cycle. The same merchant order reference should never be reused after the first authorised attempt. If used, this field should be supplied for all incoming authorisations. &gt; We strongly recommend you send the &#x60;merchantOrderReference&#x60; value to benefit from linking payment requests when authorisation retries take place. In addition, we recommend you provide &#x60;retry.orderAttemptNumber&#x60;, &#x60;retry.chainAttemptNumber&#x60;, and &#x60;retry.skipRetry&#x60; values in &#x60;PaymentRequest.additionalData&#x60;. |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Metadata consists of entries, each of which includes a key and a value. Limits: * Maximum 20 key-value pairs per request. * Maximum 20 characters per key. * Maximum 80 characters per value.  |  [optional]
**mode** | [**inline**](#Mode) | Indicates the type of front end integration. Possible values: * **embedded** (default): Drop-in or Components integration * **hosted**: Hosted Checkout integration |  [optional]
**mpiData** | [**ThreeDSecureData**](ThreeDSecureData.md) |  |  [optional]
**platformChargebackLogic** | [**PlatformChargebackLogic**](PlatformChargebackLogic.md) |  |  [optional]
**recurringExpiry** | **kotlin.String** | Date after which no further authorisations shall be performed. Only for 3D Secure 2. |  [optional]
**recurringFrequency** | **kotlin.String** | Minimum number of days between authorisations. Only for 3D Secure 2. |  [optional]
**recurringProcessingModel** | [**inline**](#RecurringProcessingModel) | Defines a recurring payment type. Required when creating a token to store payment details. Allowed values: * &#x60;Subscription&#x60; – A transaction for a fixed or variable amount, which follows a fixed schedule. * &#x60;CardOnFile&#x60; – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * &#x60;UnscheduledCardOnFile&#x60; – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or have variable amounts. For example, automatic top-ups when a cardholder&#39;s balance drops below a certain amount.  |  [optional]
**redirectFromIssuerMethod** | **kotlin.String** | Specifies the redirect method (GET or POST) when redirecting back from the issuer. |  [optional]
**redirectToIssuerMethod** | **kotlin.String** | Specifies the redirect method (GET or POST) when redirecting to the issuer. |  [optional]
**riskData** | [**RiskData**](RiskData.md) |  |  [optional]
**sessionData** | **kotlin.String** | The payment session data you need to pass to your front end. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper&#39;s email address. |  [optional]
**shopperIP** | **kotlin.String** | The shopper&#39;s IP address. In general, we recommend that you provide this data, as it is used in a number of risk checks (for instance, number of payment attempts or location-based checks). &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperIP&#x60; for all browser-based implementations. This field is also mandatory for some merchants depending on your business model. For more information, [contact Support](https://www.adyen.help/hc/en-us/requests/new). |  [optional]
**shopperInteraction** | [**inline**](#ShopperInteraction) | Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal. |  [optional]
**shopperLocale** | **kotlin.String** | The combination of a language code and a country code to specify the language to be used in the payment. |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperReference** | **kotlin.String** | Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**shopperStatement** | **kotlin.String** | The text to be shown on the shopper&#39;s bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , &#39; _ - ? + * /_**. |  [optional]
**showInstallmentAmount** | **kotlin.Boolean** | Set to true to show the payment amount per installment. |  [optional]
**socialSecurityNumber** | **kotlin.String** | The shopper&#39;s social security number. |  [optional]
**splitCardFundingSources** | **kotlin.Boolean** | Boolean value indicating whether the card payment method should be split into separate debit and credit options. |  [optional]
**splits** | [**kotlin.collections.List&lt;Split&gt;**](Split.md) | An array of objects specifying how to split a payment when using [Adyen for Platforms](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information), [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic/processing-payments#providing-split-information), or [Issuing](https://docs.adyen.com/issuing/manage-funds#split). |  [optional]
**store** | **kotlin.String** | The ecommerce or point-of-sale store that is processing the payment. Used in:  * [Partner platform integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for the [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic). * [Platform setup integrations](https://docs.adyen.com/marketplaces-and-platforms/additional-for-platform-setup/route-payment-to-store) for the [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms). |  [optional]
**storePaymentMethod** | **kotlin.Boolean** | When this is set to **true** and the &#x60;shopperReference&#x60; is provided, the payment details will be stored. |  [optional]
**storePaymentMethodMode** | [**inline**](#StorePaymentMethodMode) | Indicates if the details of the payment method will be stored for the shopper. Possible values: * **disabled** – No details will be stored (default). * **askForConsent** – If the &#x60;shopperReference&#x60; is provided, the UI lets the shopper choose if they want their payment details to be stored. * **enabled** – If the &#x60;shopperReference&#x60; is provided, the details will be stored without asking the shopper for consent. |  [optional]
**telephoneNumber** | **kotlin.String** | The shopper&#39;s telephone number. |  [optional]
**themeId** | **kotlin.String** | Sets a custom theme for [Hosted Checkout](https://docs.adyen.com/online-payments/build-your-integration/?platform&#x3D;Web&amp;integration&#x3D;Hosted+Checkout). The value can be any of the **Theme ID** values from your Customer Area. |  [optional]
**threeDSAuthenticationOnly** | **kotlin.Boolean** | If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. |  [optional]
**trustedShopper** | **kotlin.Boolean** | Set to true if the payment should be routed to a trusted MID. |  [optional]
**url** | **kotlin.String** | The URL for the Hosted Checkout page. Redirect the shopper to this URL so they can make the payment. |  [optional]


<a name="Channel"></a>
## Enum: channel
Name | Value
---- | -----
channel | iOS, Android, Web


<a name="Mode"></a>
## Enum: mode
Name | Value
---- | -----
mode | embedded, hosted


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


<a name="StorePaymentMethodMode"></a>
## Enum: storePaymentMethodMode
Name | Value
---- | -----
storePaymentMethodMode | askForConsent, disabled, enabled



