/**
 * Transfer webhooks
 *
 * Adyen sends webhooks to inform your system about incoming and outgoing transfers in your platform.  You can use these webhooks to build your implementation. For example, you can use this information to update balances in your own dashboards or to keep track of incoming funds.
 *
 * The version of the OpenAPI document: 4
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

package com.adyen.model.transferwebhooks


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param accountNumber The 5- to 12-digit bank account number, without separators or whitespace.
 * @param institutionNumber The 3-digit institution number, without separators or whitespace.
 * @param transitNumber The 5-digit transit number, without separators or whitespace.
 * @param type **caLocal**
 * @param accountType The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
 */
@Serializable
data class CALocalAccountIdentification (

    /* The 5- to 12-digit bank account number, without separators or whitespace. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The 3-digit institution number, without separators or whitespace. */
    @SerialName(value = "institutionNumber") @Required val institutionNumber: kotlin.String,

    /* The 5-digit transit number, without separators or whitespace. */
    @SerialName(value = "transitNumber") @Required val transitNumber: kotlin.String,

    /* **caLocal** */
    @SerialName(value = "type") @Required val type: CALocalAccountIdentification.Type = Type.CaLocal,

    /* The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. */
    @SerialName(value = "accountType") val accountType: CALocalAccountIdentification.AccountType? = AccountType.Checking

) {

    /**
     * **caLocal**
     *
     * Values: CaLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "caLocal") CaLocal("caLocal");
    }
    /**
     * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
     *
     * Values: Checking,Savings
     */
    @Serializable
    enum class AccountType(val value: kotlin.String) {
        @SerialName(value = "checking") Checking("checking"),
        @SerialName(value = "savings") Savings("savings");
    }
}

