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
 * @param notificationResponse Respond with **HTTP 200 OK** and `[accepted]` in the response body to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).
 */
@Serializable
data class BalancePlatformNotificationResponse (

    /* Respond with **HTTP 200 OK** and `[accepted]` in the response body to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications). */
    @SerialName(value = "notificationResponse") val notificationResponse: kotlin.String? = null

)

