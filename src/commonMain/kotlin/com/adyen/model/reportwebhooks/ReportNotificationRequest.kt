/**
 * Report webhooks
 *
 * Adyen sends webhooks to inform your system that reports were generated and are ready to be downloaded.  You can download reports programmatically by making an HTTP GET request, or manually from your [Balance Platform Customer Area](https://balanceplatform-test.adyen.com/balanceplatform).
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

package com.adyen.model.reportwebhooks

import com.adyen.model.reportwebhooks.ReportNotificationData

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param `data` 
 * @param environment The environment from which the webhook originated.  Possible values: **test**, **live**.
 * @param type Type of webhook.
 */
@Serializable
data class ReportNotificationRequest (

    @SerialName(value = "data") @Required val `data`: ReportNotificationData,

    /* The environment from which the webhook originated.  Possible values: **test**, **live**. */
    @SerialName(value = "environment") @Required val environment: kotlin.String,

    /* Type of webhook. */
    @SerialName(value = "type") @Required val type: ReportNotificationRequest.Type

) {

    /**
     * Type of webhook.
     *
     * Values: BalancePlatformPeriodReportPeriodCreated
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "balancePlatform.report.created") BalancePlatformPeriodReportPeriodCreated("balancePlatform.report.created");
    }
}

