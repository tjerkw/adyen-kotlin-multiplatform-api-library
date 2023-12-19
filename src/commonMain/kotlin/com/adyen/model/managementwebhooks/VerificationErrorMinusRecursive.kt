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

import com.adyen.model.managementwebhooks.RemediatingAction

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param code The verification error code.
 * @param message The verification error message.
 * @param type The type of verification error.  Possible values: **invalidInput**, **dataMissing**, and **pendingStatus**.
 * @param remediatingActions The actions that you can take to resolve the verification error.
 */
@Serializable
data class VerificationErrorMinusRecursive (

    /* The verification error code. */
    @SerialName(value = "code") val code: kotlin.String? = null,

    /* The verification error message. */
    @SerialName(value = "message") val message: kotlin.String? = null,

    /* The type of verification error.  Possible values: **invalidInput**, **dataMissing**, and **pendingStatus**. */
    @SerialName(value = "type") val type: VerificationErrorMinusRecursive.Type? = null,

    /* The actions that you can take to resolve the verification error. */
    @SerialName(value = "remediatingActions") val remediatingActions: kotlin.collections.List<RemediatingAction>? = null

) {

    /**
     * The type of verification error.  Possible values: **invalidInput**, **dataMissing**, and **pendingStatus**.
     *
     * Values: DataMissing,InvalidInput,PendingStatus
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "dataMissing") DataMissing("dataMissing"),
        @SerialName(value = "invalidInput") InvalidInput("invalidInput"),
        @SerialName(value = "pendingStatus") PendingStatus("pendingStatus");
    }
}

