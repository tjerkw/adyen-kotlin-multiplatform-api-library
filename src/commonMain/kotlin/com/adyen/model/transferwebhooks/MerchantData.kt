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

import com.adyen.model.transferwebhooks.NameLocation

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param acquirerId The unique identifier of the merchant's acquirer.
 * @param mcc The merchant category code.
 * @param merchantId The merchant identifier.
 * @param nameLocation 
 * @param postalCode The merchant postal code.
 */
@Serializable
data class MerchantData (

    /* The unique identifier of the merchant's acquirer. */
    @SerialName(value = "acquirerId") val acquirerId: kotlin.String? = null,

    /* The merchant category code. */
    @SerialName(value = "mcc") val mcc: kotlin.String? = null,

    /* The merchant identifier. */
    @SerialName(value = "merchantId") val merchantId: kotlin.String? = null,

    @SerialName(value = "nameLocation") val nameLocation: NameLocation? = null,

    /* The merchant postal code. */
    @SerialName(value = "postalCode") val postalCode: kotlin.String? = null

)

