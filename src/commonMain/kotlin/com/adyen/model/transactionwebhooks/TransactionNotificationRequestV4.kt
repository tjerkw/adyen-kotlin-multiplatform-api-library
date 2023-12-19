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

import com.adyen.model.transactionwebhooks.Transaction

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param `data` 
 * @param environment The environment from which the webhook originated.  Possible values: **test**, **live**.
 * @param type Type of the webhook.
 */
@Serializable
data class TransactionNotificationRequestV4 (

    @SerialName(value = "data") @Required val `data`: Transaction,

    /* The environment from which the webhook originated.  Possible values: **test**, **live**. */
    @SerialName(value = "environment") @Required val environment: kotlin.String,

    /* Type of the webhook. */
    @SerialName(value = "type") val type: TransactionNotificationRequestV4.Type? = null

) {

    /**
     * Type of the webhook.
     *
     * Values: BalancePlatformPeriodTransactionPeriodCreated
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "balancePlatform.transaction.created") BalancePlatformPeriodTransactionPeriodCreated("balancePlatform.transaction.created");
    }
}

