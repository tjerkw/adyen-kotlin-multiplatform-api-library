/**
 * Configuration API
 *
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v2/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v2`.
 *
 * The version of the OpenAPI document: 2
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

package com.adyen.model.balanceplatform


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param country The two-character ISO-3166-1 alpha-2 country code. For example, **US**.
 * @param city The name of the city.
 * @param company The name of the company.
 * @param email The email address.
 * @param houseNumberOrName The house number or name.
 * @param mobile The full telephone number.
 * @param postalCode The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
 * @param stateOrProvince The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.
 * @param street The streetname of the house.
 */
@Serializable
data class BulkAddress (

    /* The two-character ISO-3166-1 alpha-2 country code. For example, **US**. */
    @SerialName(value = "country") @Required val country: kotlin.String,

    /* The name of the city. */
    @SerialName(value = "city") val city: kotlin.String? = null,

    /* The name of the company. */
    @SerialName(value = "company") val company: kotlin.String? = null,

    /* The email address. */
    @SerialName(value = "email") val email: kotlin.String? = null,

    /* The house number or name. */
    @SerialName(value = "houseNumberOrName") val houseNumberOrName: kotlin.String? = null,

    /* The full telephone number. */
    @SerialName(value = "mobile") val mobile: kotlin.String? = null,

    /* The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries. */
    @SerialName(value = "postalCode") val postalCode: kotlin.String? = null,

    /* The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US. */
    @SerialName(value = "stateOrProvince") val stateOrProvince: kotlin.String? = null,

    /* The streetname of the house. */
    @SerialName(value = "street") val street: kotlin.String? = null

)

