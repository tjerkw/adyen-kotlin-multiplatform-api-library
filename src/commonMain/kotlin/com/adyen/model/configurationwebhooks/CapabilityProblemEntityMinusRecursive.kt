/**
 * Configuration webhooks
 *
 * Adyen sends webhooks to inform your system about events that occur in your platform. These events include, for example, when an account holder's capabilities are updated, or when a sweep configuration is created or updated.  When an event occurs, Adyen makes an HTTP POST request to a URL on your server and includes the details of the event in the request body.  You can use these webhooks to build your implementation. For example, you can use this information to update internal statuses when the status of a capability is changed.
 *
 * The version of the OpenAPI document: 1
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

package com.adyen.model.configurationwebhooks


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param documents List of document IDs to which the verification errors related to the capabilities correspond to.
 * @param id The ID of the entity.
 * @param type Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**.
 */
@Serializable
data class CapabilityProblemEntityMinusRecursive (

    /* List of document IDs to which the verification errors related to the capabilities correspond to. */
    @SerialName(value = "documents") val documents: kotlin.collections.List<kotlin.String>? = null,

    /* The ID of the entity. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    /* Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**. */
    @SerialName(value = "type") val type: CapabilityProblemEntityMinusRecursive.Type? = null

) {

    /**
     * Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**.
     *
     * Values: BankAccount,Document,LegalEntity
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "BankAccount") BankAccount("BankAccount"),
        @SerialName(value = "Document") Document("Document"),
        @SerialName(value = "LegalEntity") LegalEntity("LegalEntity");
    }
}

