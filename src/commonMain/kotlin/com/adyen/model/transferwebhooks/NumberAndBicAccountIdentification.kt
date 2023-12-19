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

import com.adyen.model.transferwebhooks.AdditionalBankIdentification

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param accountNumber The bank account number, without separators or whitespace. The length and format depends on the bank or country.
 * @param bic The bank's 8- or 11-character BIC or SWIFT code.
 * @param type **numberAndBic**
 * @param additionalBankIdentification 
 */
@Serializable
data class NumberAndBicAccountIdentification (

    /* The bank account number, without separators or whitespace. The length and format depends on the bank or country. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The bank's 8- or 11-character BIC or SWIFT code. */
    @SerialName(value = "bic") @Required val bic: kotlin.String,

    /* **numberAndBic** */
    @SerialName(value = "type") @Required val type: NumberAndBicAccountIdentification.Type = Type.NumberAndBic,

    @SerialName(value = "additionalBankIdentification") val additionalBankIdentification: AdditionalBankIdentification? = null

) {

    /**
     * **numberAndBic**
     *
     * Values: NumberAndBic
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "numberAndBic") NumberAndBic("numberAndBic");
    }
}
