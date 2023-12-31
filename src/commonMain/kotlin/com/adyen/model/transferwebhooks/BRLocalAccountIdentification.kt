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
 * @param accountNumber The bank account number, without separators or whitespace.
 * @param bankCode The 3-digit bank code, with leading zeros.
 * @param branchNumber The bank account branch number, without separators or whitespace.
 * @param type **brLocal**
 */
@Serializable
data class BRLocalAccountIdentification (

    /* The bank account number, without separators or whitespace. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The 3-digit bank code, with leading zeros. */
    @SerialName(value = "bankCode") @Required val bankCode: kotlin.String,

    /* The bank account branch number, without separators or whitespace. */
    @SerialName(value = "branchNumber") @Required val branchNumber: kotlin.String,

    /* **brLocal** */
    @SerialName(value = "type") @Required val type: BRLocalAccountIdentification.Type = Type.BrLocal

) {

    /**
     * **brLocal**
     *
     * Values: BrLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "brLocal") BrLocal("brLocal");
    }
}

