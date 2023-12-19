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

import com.adyen.model.configurationwebhooks.CardOrderItemDeliveryStatus

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param balancePlatform The unique identifier of the balance platform.
 * @param card 
 * @param cardOrderItemId The unique identifier of the card order item.
 * @param creationDate The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
 * @param id The ID of the resource.
 * @param paymentInstrumentId The unique identifier of the payment instrument related to the card order item.
 * @param pin 
 * @param shippingMethod Shipping method used to deliver the card or the PIN.
 */
@Serializable
data class CardOrderItem (

    /* The unique identifier of the balance platform. */
    @SerialName(value = "balancePlatform") val balancePlatform: kotlin.String? = null,

    @SerialName(value = "card") val card: CardOrderItemDeliveryStatus? = null,

    /* The unique identifier of the card order item. */
    @SerialName(value = "cardOrderItemId") val cardOrderItemId: kotlin.String? = null,

    /* The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**. */
    @SerialName(value = "creationDate") val creationDate: kotlin.String? = null,

    /* The ID of the resource. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    /* The unique identifier of the payment instrument related to the card order item. */
    @SerialName(value = "paymentInstrumentId") val paymentInstrumentId: kotlin.String? = null,

    @SerialName(value = "pin") val pin: CardOrderItemDeliveryStatus? = null,

    /* Shipping method used to deliver the card or the PIN. */
    @SerialName(value = "shippingMethod") val shippingMethod: kotlin.String? = null

)

