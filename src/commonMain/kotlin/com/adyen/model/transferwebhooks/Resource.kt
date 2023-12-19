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
 * @param balancePlatform The unique identifier of the balance platform.
 * @param creationDate The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
 * @param id The ID of the resource.
 */
@Serializable
data class Resource (

    /* The unique identifier of the balance platform. */
    @SerialName(value = "balancePlatform") val balancePlatform: kotlin.String? = null,

    /* The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**. */
    @SerialName(value = "creationDate") val creationDate: kotlin.String? = null,

    /* The ID of the resource. */
    @SerialName(value = "id") val id: kotlin.String? = null

)

