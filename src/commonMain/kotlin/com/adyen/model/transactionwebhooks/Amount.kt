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

