/**
 * Configuration API
 *
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v2/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v2`.
 *
 * The version of the OpenAPI document: 2
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

package com.adyen.model.balanceplatform

import com.adyen.model.balanceplatform.Amount
import com.adyen.model.balanceplatform.SweepCounterparty
import com.adyen.model.balanceplatform.SweepSchedule

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param counterparty 
 * @param currency The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).
 * @param id The unique identifier of the sweep.
 * @param schedule 
 * @param category The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting `priorities`.
 * @param description The message that will be used in the sweep transfer's description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.
 * @param priorities The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that's not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set `category` to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).
 * @param reason The reason for disabling the sweep.
 * @param status The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
 * @param sweepAmount 
 * @param targetAmount 
 * @param triggerAmount 
 * @param type The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
 */
@Serializable
data class SweepConfigurationV2 (

    @SerialName(value = "counterparty") @Required val counterparty: SweepCounterparty,

    /* The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances). */
    @SerialName(value = "currency") @Required val currency: kotlin.String,

    /* The unique identifier of the sweep. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "schedule") @Required val schedule: SweepSchedule,

    /* The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting `priorities`. */
    @SerialName(value = "category") val category: SweepConfigurationV2.Category? = null,

    /* The message that will be used in the sweep transfer's description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that's not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set `category` to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup). */
    @SerialName(value = "priorities") val priorities: kotlin.collections.List<SweepConfigurationV2.Priorities>? = null,

    /* The reason for disabling the sweep. */
    @SerialName(value = "reason") val reason: SweepConfigurationV2.Reason? = null,

    /* The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.    */
    @SerialName(value = "status") val status: SweepConfigurationV2.Status? = null,

    @SerialName(value = "sweepAmount") val sweepAmount: Amount? = null,

    @SerialName(value = "targetAmount") val targetAmount: Amount? = null,

    @SerialName(value = "triggerAmount") val triggerAmount: Amount? = null,

    /* The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account. */
    @SerialName(value = "type") val type: SweepConfigurationV2.Type? = Type.Push

) {

    /**
     * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting `priorities`.
     *
     * Values: Bank,Internal,PlatformPayment
     */
    @Serializable
    enum class Category(val value: kotlin.String) {
        @SerialName(value = "bank") Bank("bank"),
        @SerialName(value = "internal") Internal("internal"),
        @SerialName(value = "platformPayment") PlatformPayment("platformPayment");
    }
    /**
     * The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that's not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set `category` to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).
     *
     * Values: CrossBorder,Fast,Instant,Internal,Regular,Wire
     */
    @Serializable
    enum class Priorities(val value: kotlin.String) {
        @SerialName(value = "crossBorder") CrossBorder("crossBorder"),
        @SerialName(value = "fast") Fast("fast"),
        @SerialName(value = "instant") Instant("instant"),
        @SerialName(value = "internal") Internal("internal"),
        @SerialName(value = "regular") Regular("regular"),
        @SerialName(value = "wire") Wire("wire");
    }
    /**
     * The reason for disabling the sweep.
     *
     * Values: AmountLimitExceeded,Approved,BalanceAccountTemporarilyBlockedByTransactionRule,CounterpartyAccountBlocked,CounterpartyAccountClosed,CounterpartyAccountNotFound,CounterpartyAddressRequired,CounterpartyBankTimedOut,CounterpartyBankUnavailable,DeclinedByTransactionRule,Error,NotEnoughBalance,RefusedByCounterpartyBank,RouteNotFound,ScaFailed,Unknown
     */
    @Serializable
    enum class Reason(val value: kotlin.String) {
        @SerialName(value = "amountLimitExceeded") AmountLimitExceeded("amountLimitExceeded"),
        @SerialName(value = "approved") Approved("approved"),
        @SerialName(value = "balanceAccountTemporarilyBlockedByTransactionRule") BalanceAccountTemporarilyBlockedByTransactionRule("balanceAccountTemporarilyBlockedByTransactionRule"),
        @SerialName(value = "counterpartyAccountBlocked") CounterpartyAccountBlocked("counterpartyAccountBlocked"),
        @SerialName(value = "counterpartyAccountClosed") CounterpartyAccountClosed("counterpartyAccountClosed"),
        @SerialName(value = "counterpartyAccountNotFound") CounterpartyAccountNotFound("counterpartyAccountNotFound"),
        @SerialName(value = "counterpartyAddressRequired") CounterpartyAddressRequired("counterpartyAddressRequired"),
        @SerialName(value = "counterpartyBankTimedOut") CounterpartyBankTimedOut("counterpartyBankTimedOut"),
        @SerialName(value = "counterpartyBankUnavailable") CounterpartyBankUnavailable("counterpartyBankUnavailable"),
        @SerialName(value = "declinedByTransactionRule") DeclinedByTransactionRule("declinedByTransactionRule"),
        @SerialName(value = "error") Error("error"),
        @SerialName(value = "notEnoughBalance") NotEnoughBalance("notEnoughBalance"),
        @SerialName(value = "refusedByCounterpartyBank") RefusedByCounterpartyBank("refusedByCounterpartyBank"),
        @SerialName(value = "routeNotFound") RouteNotFound("routeNotFound"),
        @SerialName(value = "scaFailed") ScaFailed("scaFailed"),
        @SerialName(value = "unknown") Unknown("unknown");
    }
    /**
     * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
     *
     * Values: Active,Inactive
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "active") Active("active"),
        @SerialName(value = "inactive") Inactive("inactive");
    }
    /**
     * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
     *
     * Values: Pull,Push
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "pull") Pull("pull"),
        @SerialName(value = "push") Push("push");
    }
}

