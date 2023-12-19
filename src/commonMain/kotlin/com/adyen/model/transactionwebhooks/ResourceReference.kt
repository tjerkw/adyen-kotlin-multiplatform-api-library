/**
 * Transaction webhooks
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

package com.adyen.model.transactionwebhooks


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param description The description of the resource.
 * @param id The unique identifier of the resource.
 * @param reference The reference for the resource.
 */
@Serializable
data class ResourceReference (

    /* The description of the resource. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* The unique identifier of the resource. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    /* The reference for the resource. */
    @SerialName(value = "reference") val reference: kotlin.String? = null

)

