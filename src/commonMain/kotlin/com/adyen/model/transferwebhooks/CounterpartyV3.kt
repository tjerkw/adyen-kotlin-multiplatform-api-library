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

import com.adyen.model.transferwebhooks.BankAccountV3
import com.adyen.model.transferwebhooks.MerchantData

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param balanceAccountId Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
 * @param bankAccount 
 * @param merchant 
 * @param transferInstrumentId Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
 */
@Serializable
data class CounterpartyV3 (

    /* Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id). */
    @SerialName(value = "balanceAccountId") val balanceAccountId: kotlin.String? = null,

    @SerialName(value = "bankAccount") val bankAccount: BankAccountV3? = null,

    @SerialName(value = "merchant") val merchant: MerchantData? = null,

    /* Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id). */
    @SerialName(value = "transferInstrumentId") val transferInstrumentId: kotlin.String? = null

)

