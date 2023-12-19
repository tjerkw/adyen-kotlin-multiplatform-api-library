/**
 * Management Webhooks
 *
 * Adyen uses webhooks to inform your system about events that happen with your Adyen company and merchant accounts, stores, payment terminals, and payment methods when using [Management API](https://docs.adyen.com/api-explorer/#/ManagementService/latest/overview).  When an event occurs, Adyen makes an HTTP POST request to a URL on your server and includes the details of the event in the request body.  See [Webhooks](https://docs.adyen.com/development-resources/webhooks) for more information.
 *
 * The version of the OpenAPI document: 3
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

package com.adyen.model.managementwebhooks

import com.adyen.model.managementwebhooks.CapabilityProblemEntity
import com.adyen.model.managementwebhooks.VerificationError

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param entity 
 * @param verificationErrors List of verification errors.
 */
@Serializable
data class CapabilityProblem (

    @SerialName(value = "entity") val entity: CapabilityProblemEntity? = null,

    /* List of verification errors. */
    @SerialName(value = "verificationErrors") val verificationErrors: kotlin.collections.List<VerificationError>? = null

)
