/**
 * Adyen Payment API
 *
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.adyen.model.payment

import com.adyen.model.payment.AccountInfo
import com.adyen.model.payment.Address
import com.adyen.model.payment.Amount
import com.adyen.model.payment.ApplicationInfo
import com.adyen.model.payment.BrowserInfo
import com.adyen.model.payment.ForexQuote
import com.adyen.model.payment.Installments
import com.adyen.model.payment.MerchantRiskIndicator
import com.adyen.model.payment.Name
import com.adyen.model.payment.Recurring
import com.adyen.model.payment.Split
import com.adyen.model.payment.ThreeDS2RequestData
import com.adyen.model.payment.ThreeDS2Result

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param amount 
 * @param merchantAccount The merchant account identifier, with which you want to process the transaction.
 * @param reference The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.
 * @param accountInfo 
 * @param additionalAmount 
 * @param additionalData This field contains additional data, which may be required for a particular payment request.  The `additionalData` object consists of entries, each of which includes the key and value.
 * @param applicationInfo 
 * @param billingAddress 
 * @param browserInfo 
 * @param captureDelayHours The delay between the authorisation and scheduled auto-capture, specified in hours.
 * @param dateOfBirth The shopper's date of birth.  Format [ISO-8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DD
 * @param dccQuote 
 * @param deliveryAddress 
 * @param deliveryDate The date and time the purchased goods should be delivered.  Format [ISO 8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DDThh:mm:ss.sssTZD  Example: 2017-07-17T13:42:40.428+01:00
 * @param deviceFingerprint A string containing the shopper's device fingerprint. For more information, refer to [Device fingerprinting](https://docs.adyen.com/risk-management/device-fingerprinting).
 * @param fraudOffset An integer value that is added to the normal fraud score. The value can be either positive or negative.
 * @param installments 
 * @param localizedShopperStatement The `localizedShopperStatement` field lets you use dynamic values for your shopper statement in a local character set. If not supplied, left empty, or for cross-border transactions, **shopperStatement** is used.  Adyen currently supports the ja-Kana character set for Visa and Mastercard payments in Japan using Japanese cards. This character set supports:  * UTF-8 based Katakana, capital letters, numbers and special characters.  * Half-width or full-width characters.
 * @param mcc The [merchant category code](https://en.wikipedia.org/wiki/Merchant_category_code) (MCC) is a four-digit number, which relates to a particular market segment. This code reflects the predominant activity that is conducted by the merchant.
 * @param merchantOrderReference This reference allows linking multiple transactions to each other for reporting purposes (i.e. order auth-rate). The reference should be unique per billing cycle. The same merchant order reference should never be reused after the first authorised attempt. If used, this field should be supplied for all incoming authorisations. > We strongly recommend you send the `merchantOrderReference` value to benefit from linking payment requests when authorisation retries take place. In addition, we recommend you provide `retry.orderAttemptNumber`, `retry.chainAttemptNumber`, and `retry.skipRetry` values in `PaymentRequest.additionalData`.
 * @param merchantRiskIndicator 
 * @param metadata Metadata consists of entries, each of which includes a key and a value. Limits: * Maximum 20 key-value pairs per request. When exceeding, the \"177\" error occurs: \"Metadata size exceeds limit\". * Maximum 20 characters per key. * Maximum 80 characters per value. 
 * @param orderReference When you are doing multiple partial (gift card) payments, this is the `pspReference` of the first payment. We use this to link the multiple payments to each other. As your own reference for linking multiple payments, use the `merchantOrderReference`instead.
 * @param recurring 
 * @param recurringProcessingModel Defines a recurring payment type. Required when creating a token to store payment details or using stored payment details. Allowed values: * `Subscription` – A transaction for a fixed or variable amount, which follows a fixed schedule. * `CardOnFile` – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * `UnscheduledCardOnFile` – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or have variable amounts. For example, automatic top-ups when a cardholder's balance drops below a certain amount. 
 * @param selectedBrand Some payment methods require defining a value for this field to specify how to process the transaction.  For the Bancontact payment method, it can be set to: * `maestro` (default), to be processed like a Maestro card, or * `bcmc`, to be processed like a Bancontact card.
 * @param selectedRecurringDetailReference The `recurringDetailReference` you want to use for this payment. The value `LATEST` can be used to select the most recently stored recurring detail.
 * @param sessionId A session ID used to identify a payment session.
 * @param shopperEmail The shopper's email address. We recommend that you provide this data, as it is used in velocity fraud checks. > For 3D Secure 2 transactions, schemes require `shopperEmail` for all browser-based and mobile implementations.
 * @param shopperIP The shopper's IP address. In general, we recommend that you provide this data, as it is used in a number of risk checks (for instance, number of payment attempts or location-based checks). > For 3D Secure 2 transactions, schemes require `shopperIP` for all browser-based implementations. This field is also mandatory for some merchants depending on your business model. For more information, [contact Support](https://www.adyen.help/hc/en-us/requests/new).
 * @param shopperInteraction Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
 * @param shopperLocale The combination of a language code and a country code to specify the language to be used in the payment.
 * @param shopperName 
 * @param shopperReference Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.
 * @param shopperStatement The text to be shown on the shopper's bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , ' _ - ? + * /_**.
 * @param socialSecurityNumber The shopper's social security number.
 * @param splits An array of objects specifying how the payment should be split when using [Adyen for Platforms](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information) or [Issuing](https://docs.adyen.com/issuing/add-manage-funds#split).
 * @param store The ecommerce or point-of-sale store that is processing the payment. Used in:  * [Partner platform integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for the [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic). * [Platform setup integrations](https://docs.adyen.com/marketplaces-and-platforms/additional-for-platform-setup/route-payment-to-store) for the [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms).
 * @param telephoneNumber The shopper's telephone number.
 * @param threeDS2RequestData 
 * @param threeDS2Result 
 * @param threeDS2Token The ThreeDS2Token that was returned in the /authorise call.
 * @param threeDSAuthenticationOnly If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation.
 * @param totalsGroup The reference value to aggregate sales totals in reporting. When not specified, the store field is used (if available).
 * @param trustedShopper Set to true if the payment should be routed to a trusted MID.
 */
@Serializable
data class PaymentRequest3ds2 (

    @SerialName(value = "amount") @Required val amount: Amount,

    /* The merchant account identifier, with which you want to process the transaction. */
    @SerialName(value = "merchantAccount") @Required val merchantAccount: kotlin.String,

    /* The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters. */
    @SerialName(value = "reference") @Required val reference: kotlin.String,

    @SerialName(value = "accountInfo") val accountInfo: AccountInfo? = null,

    @SerialName(value = "additionalAmount") val additionalAmount: Amount? = null,

    /* This field contains additional data, which may be required for a particular payment request.  The `additionalData` object consists of entries, each of which includes the key and value. */
    @SerialName(value = "additionalData") val additionalData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerialName(value = "applicationInfo") val applicationInfo: ApplicationInfo? = null,

    @SerialName(value = "billingAddress") val billingAddress: Address? = null,

    @SerialName(value = "browserInfo") val browserInfo: BrowserInfo? = null,

    /* The delay between the authorisation and scheduled auto-capture, specified in hours. */
    @SerialName(value = "captureDelayHours") val captureDelayHours: kotlin.Int? = null,

    /* The shopper's date of birth.  Format [ISO-8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DD */
    @SerialName(value = "dateOfBirth") val dateOfBirth: kotlin.String? = null,

    @SerialName(value = "dccQuote") val dccQuote: ForexQuote? = null,

    @SerialName(value = "deliveryAddress") val deliveryAddress: Address? = null,

    /* The date and time the purchased goods should be delivered.  Format [ISO 8601](https://www.w3.org/TR/NOTE-datetime): YYYY-MM-DDThh:mm:ss.sssTZD  Example: 2017-07-17T13:42:40.428+01:00 */
    @SerialName(value = "deliveryDate") val deliveryDate: kotlin.String? = null,

    /* A string containing the shopper's device fingerprint. For more information, refer to [Device fingerprinting](https://docs.adyen.com/risk-management/device-fingerprinting). */
    @SerialName(value = "deviceFingerprint") val deviceFingerprint: kotlin.String? = null,

    /* An integer value that is added to the normal fraud score. The value can be either positive or negative. */
    @SerialName(value = "fraudOffset") val fraudOffset: kotlin.Int? = null,

    @SerialName(value = "installments") val installments: Installments? = null,

    /* The `localizedShopperStatement` field lets you use dynamic values for your shopper statement in a local character set. If not supplied, left empty, or for cross-border transactions, **shopperStatement** is used.  Adyen currently supports the ja-Kana character set for Visa and Mastercard payments in Japan using Japanese cards. This character set supports:  * UTF-8 based Katakana, capital letters, numbers and special characters.  * Half-width or full-width characters. */
    @SerialName(value = "localizedShopperStatement") val localizedShopperStatement: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* The [merchant category code](https://en.wikipedia.org/wiki/Merchant_category_code) (MCC) is a four-digit number, which relates to a particular market segment. This code reflects the predominant activity that is conducted by the merchant. */
    @SerialName(value = "mcc") val mcc: kotlin.String? = null,

    /* This reference allows linking multiple transactions to each other for reporting purposes (i.e. order auth-rate). The reference should be unique per billing cycle. The same merchant order reference should never be reused after the first authorised attempt. If used, this field should be supplied for all incoming authorisations. > We strongly recommend you send the `merchantOrderReference` value to benefit from linking payment requests when authorisation retries take place. In addition, we recommend you provide `retry.orderAttemptNumber`, `retry.chainAttemptNumber`, and `retry.skipRetry` values in `PaymentRequest.additionalData`. */
    @SerialName(value = "merchantOrderReference") val merchantOrderReference: kotlin.String? = null,

    @SerialName(value = "merchantRiskIndicator") val merchantRiskIndicator: MerchantRiskIndicator? = null,

    /* Metadata consists of entries, each of which includes a key and a value. Limits: * Maximum 20 key-value pairs per request. When exceeding, the \"177\" error occurs: \"Metadata size exceeds limit\". * Maximum 20 characters per key. * Maximum 80 characters per value.  */
    @SerialName(value = "metadata") val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* When you are doing multiple partial (gift card) payments, this is the `pspReference` of the first payment. We use this to link the multiple payments to each other. As your own reference for linking multiple payments, use the `merchantOrderReference`instead. */
    @SerialName(value = "orderReference") val orderReference: kotlin.String? = null,

    @SerialName(value = "recurring") val recurring: Recurring? = null,

    /* Defines a recurring payment type. Required when creating a token to store payment details or using stored payment details. Allowed values: * `Subscription` – A transaction for a fixed or variable amount, which follows a fixed schedule. * `CardOnFile` – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * `UnscheduledCardOnFile` – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or have variable amounts. For example, automatic top-ups when a cardholder's balance drops below a certain amount.  */
    @SerialName(value = "recurringProcessingModel") val recurringProcessingModel: PaymentRequest3ds2.RecurringProcessingModel? = null,

    /* Some payment methods require defining a value for this field to specify how to process the transaction.  For the Bancontact payment method, it can be set to: * `maestro` (default), to be processed like a Maestro card, or * `bcmc`, to be processed like a Bancontact card. */
    @SerialName(value = "selectedBrand") val selectedBrand: kotlin.String? = null,

    /* The `recurringDetailReference` you want to use for this payment. The value `LATEST` can be used to select the most recently stored recurring detail. */
    @SerialName(value = "selectedRecurringDetailReference") val selectedRecurringDetailReference: kotlin.String? = null,

    /* A session ID used to identify a payment session. */
    @SerialName(value = "sessionId") val sessionId: kotlin.String? = null,

    /* The shopper's email address. We recommend that you provide this data, as it is used in velocity fraud checks. > For 3D Secure 2 transactions, schemes require `shopperEmail` for all browser-based and mobile implementations. */
    @SerialName(value = "shopperEmail") val shopperEmail: kotlin.String? = null,

    /* The shopper's IP address. In general, we recommend that you provide this data, as it is used in a number of risk checks (for instance, number of payment attempts or location-based checks). > For 3D Secure 2 transactions, schemes require `shopperIP` for all browser-based implementations. This field is also mandatory for some merchants depending on your business model. For more information, [contact Support](https://www.adyen.help/hc/en-us/requests/new). */
    @SerialName(value = "shopperIP") val shopperIP: kotlin.String? = null,

    /* Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal. */
    @SerialName(value = "shopperInteraction") val shopperInteraction: PaymentRequest3ds2.ShopperInteraction? = null,

    /* The combination of a language code and a country code to specify the language to be used in the payment. */
    @SerialName(value = "shopperLocale") val shopperLocale: kotlin.String? = null,

    @SerialName(value = "shopperName") val shopperName: Name? = null,

    /* Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address. */
    @SerialName(value = "shopperReference") val shopperReference: kotlin.String? = null,

    /* The text to be shown on the shopper's bank statement.  We recommend sending a maximum of 22 characters, otherwise banks might truncate the string.  Allowed characters: **a-z**, **A-Z**, **0-9**, spaces, and special characters **. , ' _ - ? + * /_**. */
    @SerialName(value = "shopperStatement") val shopperStatement: kotlin.String? = null,

    /* The shopper's social security number. */
    @SerialName(value = "socialSecurityNumber") val socialSecurityNumber: kotlin.String? = null,

    /* An array of objects specifying how the payment should be split when using [Adyen for Platforms](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information) or [Issuing](https://docs.adyen.com/issuing/add-manage-funds#split). */
    @SerialName(value = "splits") val splits: kotlin.collections.List<Split>? = null,

    /* The ecommerce or point-of-sale store that is processing the payment. Used in:  * [Partner platform integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for the [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic). * [Platform setup integrations](https://docs.adyen.com/marketplaces-and-platforms/additional-for-platform-setup/route-payment-to-store) for the [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms). */
    @SerialName(value = "store") val store: kotlin.String? = null,

    /* The shopper's telephone number. */
    @SerialName(value = "telephoneNumber") val telephoneNumber: kotlin.String? = null,

    @SerialName(value = "threeDS2RequestData") val threeDS2RequestData: ThreeDS2RequestData? = null,

    @SerialName(value = "threeDS2Result") val threeDS2Result: ThreeDS2Result? = null,

    /* The ThreeDS2Token that was returned in the /authorise call. */
    @SerialName(value = "threeDS2Token") val threeDS2Token: kotlin.String? = null,

    /* If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. */
    @SerialName(value = "threeDSAuthenticationOnly") val threeDSAuthenticationOnly: kotlin.Boolean? = false,

    /* The reference value to aggregate sales totals in reporting. When not specified, the store field is used (if available). */
    @SerialName(value = "totalsGroup") val totalsGroup: kotlin.String? = null,

    /* Set to true if the payment should be routed to a trusted MID. */
    @SerialName(value = "trustedShopper") val trustedShopper: kotlin.Boolean? = null

) {

    /**
     * Defines a recurring payment type. Required when creating a token to store payment details or using stored payment details. Allowed values: * `Subscription` – A transaction for a fixed or variable amount, which follows a fixed schedule. * `CardOnFile` – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * `UnscheduledCardOnFile` – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or have variable amounts. For example, automatic top-ups when a cardholder's balance drops below a certain amount. 
     *
     * Values: CardOnFile,Subscription,UnscheduledCardOnFile
     */
    @Serializable
    enum class RecurringProcessingModel(val value: kotlin.String) {
        @SerialName(value = "CardOnFile") CardOnFile("CardOnFile"),
        @SerialName(value = "Subscription") Subscription("Subscription"),
        @SerialName(value = "UnscheduledCardOnFile") UnscheduledCardOnFile("UnscheduledCardOnFile");
    }
    /**
     * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
     *
     * Values: Ecommerce,ContAuth,Moto,POS
     */
    @Serializable
    enum class ShopperInteraction(val value: kotlin.String) {
        @SerialName(value = "Ecommerce") Ecommerce("Ecommerce"),
        @SerialName(value = "ContAuth") ContAuth("ContAuth"),
        @SerialName(value = "Moto") Moto("Moto"),
        @SerialName(value = "POS") POS("POS");
    }
}

