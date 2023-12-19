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
 * @param currency The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
 * @param `value` The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).
 */
@Serializable
data class Amount (

    /* The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). */
    @SerialName(value = "currency") @Required val currency: kotlin.String,

    /* The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes). */
    @SerialName(value = "value") @Required val `value`: kotlin.Long

)
