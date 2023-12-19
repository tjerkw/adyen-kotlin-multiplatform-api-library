/**
 * Adyen Checkout API
 *
 * Adyen Checkout API provides a simple and flexible way to initiate and authorise online payments. You can use the same integration for payments made with cards (including 3D Secure), mobile wallets, and local payment methods (for example, iDEAL and Sofort).  This API reference provides information on available endpoints and how to interact with them. To learn more about the API, visit [online payments documentation](https://docs.adyen.com/online-payments).  ## Authentication Each request to Checkout API must be signed with an API key. For this, [get your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) from your Customer Area, and set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ``` ## Versioning Checkout API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://checkout-test.adyen.com/v71/payments ```  ## Going live  To access the live endpoints, you need an API key from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account, for example: ``` https://{PREFIX}-checkout-live.adyenpayments.com/checkout/v71/payments ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.  When preparing to do live transactions with Checkout API, follow the [go-live checklist](https://docs.adyen.com/online-payments/go-live-checklist) to make sure you've got all the required configuration in place.  ## Release notes Have a look at the [release notes](https://docs.adyen.com/online-payments/release-notes?integration_type=api&version=71) to find out what changed in this version!
 *
 * The version of the OpenAPI document: 71
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

package com.adyen.model.checkout


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param cardBin The first six digits of the card number.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with a six-digit BIN.  Example: 521234
 * @param cardHolderName The cardholder name passed in the payment request.
 * @param cardIssuingBank The bank or the financial institution granting lines of credit through card association branded payment cards. This information can be included when available.
 * @param cardIssuingCountry The country where the card was issued.  Example: US
 * @param cardIssuingCurrency The currency in which the card is issued, if this information is available. Provided as the currency code or currency number from the ISO-4217 standard.   Example: USD
 * @param cardPaymentMethod The card payment method used for the transaction.  Example: amex
 * @param cardSummary The last four digits of a card number.  > Returned only in case of a card payment.
 * @param issuerBin The first eight digits of the card number. Only returned if the card number is 16 digits or more.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with an eight-digit BIN.  Example: 52123423
 */
@Serializable
data class ResponseAdditionalDataCard (

    /* The first six digits of the card number.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with a six-digit BIN.  Example: 521234 */
    @SerialName(value = "cardBin") val cardBin: kotlin.String? = null,

    /* The cardholder name passed in the payment request. */
    @SerialName(value = "cardHolderName") val cardHolderName: kotlin.String? = null,

    /* The bank or the financial institution granting lines of credit through card association branded payment cards. This information can be included when available. */
    @SerialName(value = "cardIssuingBank") val cardIssuingBank: kotlin.String? = null,

    /* The country where the card was issued.  Example: US */
    @SerialName(value = "cardIssuingCountry") val cardIssuingCountry: kotlin.String? = null,

    /* The currency in which the card is issued, if this information is available. Provided as the currency code or currency number from the ISO-4217 standard.   Example: USD */
    @SerialName(value = "cardIssuingCurrency") val cardIssuingCurrency: kotlin.String? = null,

    /* The card payment method used for the transaction.  Example: amex */
    @SerialName(value = "cardPaymentMethod") val cardPaymentMethod: kotlin.String? = null,

    /* The last four digits of a card number.  > Returned only in case of a card payment. */
    @SerialName(value = "cardSummary") val cardSummary: kotlin.String? = null,

    /* The first eight digits of the card number. Only returned if the card number is 16 digits or more.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with an eight-digit BIN.  Example: 52123423 */
    @SerialName(value = "issuerBin") val issuerBin: kotlin.String? = null

)

