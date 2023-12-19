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
 * @param accountNumber The 8-digit bank account number, without separators or whitespace.
 * @param sortCode The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace.
 * @param type **ukLocal**
 */
@Serializable
data class UKLocalAccountIdentification (

    /* The 8-digit bank account number, without separators or whitespace. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace. */
    @SerialName(value = "sortCode") @Required val sortCode: kotlin.String,

    /* **ukLocal** */
    @SerialName(value = "type") @Required val type: UKLocalAccountIdentification.Type = Type.UkLocal

) {

    /**
     * **ukLocal**
     *
     * Values: UkLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "ukLocal") UkLocal("ukLocal");
    }
}
