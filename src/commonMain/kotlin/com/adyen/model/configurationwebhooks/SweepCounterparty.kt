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
 * @param balanceAccountId The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as `schedule.type` **daily** or **monthly**.
 * @param merchantAccount The merchant account that will be the source of funds.  You can only use this parameter with sweeps of `type` **pull** and `schedule.type` **balance**, and if you are processing payments with Adyen.
 * @param transferInstrumentId The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep `type`  . To [set up automated top-up sweeps to balance accounts](https://docs.adyen.com/marketplaces-and-platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a `merchantAccount` and a sweep `type` of **pull**. Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature.
 */
@Serializable
data class SweepCounterparty (

    /* The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as `schedule.type` **daily** or **monthly**. */
    @SerialName(value = "balanceAccountId") val balanceAccountId: kotlin.String? = null,

    /* The merchant account that will be the source of funds.  You can only use this parameter with sweeps of `type` **pull** and `schedule.type` **balance**, and if you are processing payments with Adyen. */
    @SerialName(value = "merchantAccount") val merchantAccount: kotlin.String? = null,

    /* The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep `type`  . To [set up automated top-up sweeps to balance accounts](https://docs.adyen.com/marketplaces-and-platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a `merchantAccount` and a sweep `type` of **pull**. Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature. */
    @SerialName(value = "transferInstrumentId") val transferInstrumentId: kotlin.String? = null

)
