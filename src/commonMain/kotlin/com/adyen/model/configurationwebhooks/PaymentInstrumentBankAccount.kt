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

import com.adyen.model.configurationwebhooks.IbanAccountIdentification
import com.adyen.model.configurationwebhooks.USLocalAccountIdentification

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Contains the business account details. Returned when you create a payment instrument with `type` **bankAccount**.
 *
 * @param iban The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.
 * @param type **usLocal**
 * @param accountNumber The bank account number, without separators or whitespace.
 * @param routingNumber The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace.
 * @param accountType The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
 */
@Serializable
data class PaymentInstrumentBankAccount (

    /* The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. */
    @SerialName(value = "iban") @Required val iban: kotlin.String,

    /* **usLocal** */
    @SerialName(value = "type") @Required val type: PaymentInstrumentBankAccount.Type = Type.UsLocal,

    /* The bank account number, without separators or whitespace. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. */
    @SerialName(value = "routingNumber") @Required val routingNumber: kotlin.String,

    /* The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. */
    @SerialName(value = "accountType") val accountType: PaymentInstrumentBankAccount.AccountType? = AccountType.Checking

) {

    /**
     * **usLocal**
     *
     * Values: UsLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "usLocal") UsLocal("usLocal");
    }
    /**
     * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
     *
     * Values: Checking,Savings
     */
    @Serializable
    enum class AccountType(val value: kotlin.String) {
        @SerialName(value = "checking") Checking("checking"),
        @SerialName(value = "savings") Savings("savings");
    }
}
