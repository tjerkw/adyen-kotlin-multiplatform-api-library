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
 * @param iban The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.
 * @param type **iban**
 */
@Serializable
data class IbanAccountIdentification (

    /* The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. */
    @SerialName(value = "iban") @Required val iban: kotlin.String,

    /* **iban** */
    @SerialName(value = "type") @Required val type: IbanAccountIdentification.Type = Type.Iban

) {

    /**
     * **iban**
     *
     * Values: Iban
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "iban") Iban("iban");
    }
}

