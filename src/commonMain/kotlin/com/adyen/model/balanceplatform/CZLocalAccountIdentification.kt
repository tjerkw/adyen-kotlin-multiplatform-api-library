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
 * @param accountNumber The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized)
 * @param bankCode The 4-digit bank code (Kód banky), without separators or whitespace.
 * @param type **czLocal**
 */
@Serializable
data class CZLocalAccountIdentification (

    /* The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized) */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The 4-digit bank code (Kód banky), without separators or whitespace. */
    @SerialName(value = "bankCode") @Required val bankCode: kotlin.String,

    /* **czLocal** */
    @SerialName(value = "type") @Required val type: CZLocalAccountIdentification.Type = Type.CzLocal

) {

    /**
     * **czLocal**
     *
     * Values: CzLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "czLocal") CzLocal("czLocal");
    }
}

