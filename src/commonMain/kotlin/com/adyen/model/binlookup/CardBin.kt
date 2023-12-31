/**
 * Adyen BinLookup API
 *
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
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

package com.adyen.model.binlookup


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param bin The first 6 digit of the card number. Enable this field via merchant account settings.
 * @param commercial If true, it indicates a commercial card. Enable this field via merchant account settings.
 * @param fundingSource The card funding source. Valid values are: * CHARGE * CREDIT * DEBIT * DEFERRED_DEBIT * PREPAID * PREPAID_RELOADABLE * PREPAID_NONRELOADABLE > Enable this field via merchant account settings.
 * @param fundsAvailability Indicates availability of funds.  Visa: * \"I\" (fast funds are supported) * \"N\" (otherwise)  Mastercard: * \"I\" (product type is Prepaid or Debit, or issuing country is in CEE/HGEM list) * \"N\" (otherwise) > Returned when you verify a card BIN or estimate costs, and only if `payoutEligible` is different from \"N\" or \"U\".
 * @param issuerBin The first 8 digit of the card number. Enable this field via merchant account settings.
 * @param issuingBank The issuing bank of the card.
 * @param issuingCountry The country where the card was issued from.
 * @param issuingCurrency The currency of the card.
 * @param paymentMethod The payment method associated with the card (e.g. visa, mc, or amex).
 * @param payoutEligible Indicates whether a payout is eligible or not for this card.  Visa: * \"Y\" * \"N\"  Mastercard: * \"Y\" (domestic and cross-border) * \"D\" (only domestic) * \"N\" (no MoneySend) * \"U\" (unknown) > Returned when you verify a card BIN or estimate costs, and only if `payoutEligible` is different from \"N\" or \"U\".
 * @param summary The last four digits of the card number.
 */
@Serializable
data class CardBin (

    /* The first 6 digit of the card number. Enable this field via merchant account settings. */
    @SerialName(value = "bin") val bin: kotlin.String? = null,

    /* If true, it indicates a commercial card. Enable this field via merchant account settings. */
    @SerialName(value = "commercial") val commercial: kotlin.Boolean? = null,

    /* The card funding source. Valid values are: * CHARGE * CREDIT * DEBIT * DEFERRED_DEBIT * PREPAID * PREPAID_RELOADABLE * PREPAID_NONRELOADABLE > Enable this field via merchant account settings. */
    @SerialName(value = "fundingSource") val fundingSource: kotlin.String? = null,

    /* Indicates availability of funds.  Visa: * \"I\" (fast funds are supported) * \"N\" (otherwise)  Mastercard: * \"I\" (product type is Prepaid or Debit, or issuing country is in CEE/HGEM list) * \"N\" (otherwise) > Returned when you verify a card BIN or estimate costs, and only if `payoutEligible` is different from \"N\" or \"U\". */
    @SerialName(value = "fundsAvailability") val fundsAvailability: kotlin.String? = null,

    /* The first 8 digit of the card number. Enable this field via merchant account settings. */
    @SerialName(value = "issuerBin") val issuerBin: kotlin.String? = null,

    /* The issuing bank of the card. */
    @SerialName(value = "issuingBank") val issuingBank: kotlin.String? = null,

    /* The country where the card was issued from. */
    @SerialName(value = "issuingCountry") val issuingCountry: kotlin.String? = null,

    /* The currency of the card. */
    @SerialName(value = "issuingCurrency") val issuingCurrency: kotlin.String? = null,

    /* The payment method associated with the card (e.g. visa, mc, or amex). */
    @SerialName(value = "paymentMethod") val paymentMethod: kotlin.String? = null,

    /* Indicates whether a payout is eligible or not for this card.  Visa: * \"Y\" * \"N\"  Mastercard: * \"Y\" (domestic and cross-border) * \"D\" (only domestic) * \"N\" (no MoneySend) * \"U\" (unknown) > Returned when you verify a card BIN or estimate costs, and only if `payoutEligible` is different from \"N\" or \"U\". */
    @SerialName(value = "payoutEligible") val payoutEligible: kotlin.String? = null,

    /* The last four digits of the card number. */
    @SerialName(value = "summary") val summary: kotlin.String? = null

)

