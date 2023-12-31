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

import com.adyen.model.balanceplatform.TransactionRuleEntityKey
import com.adyen.model.balanceplatform.TransactionRuleInterval
import com.adyen.model.balanceplatform.TransactionRuleRestrictions

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param description Your description for the transaction rule, maximum 300 characters.
 * @param entityKey 
 * @param interval 
 * @param reference Your reference for the transaction rule, maximum 150 characters.
 * @param ruleRestrictions 
 * @param type The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. 
 * @param aggregationLevel The level at which data must be accumulated, used in rules with `type` **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the `entityKey`.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**.
 * @param endDate The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**.
 * @param id The unique identifier of the transaction rule.
 * @param outcomeType The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the `score` you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.
 * @param requestType Indicates the type of request to which the rule applies. If not provided, by default, this is set to **authorization**.  Possible values: **authorization**, **authentication**, **tokenization**, **bankTransfer**.
 * @param score A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when `outcomeType` is **scoreBased**.  The value must be between **-100** and **100**.
 * @param startDate The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the `startDate` is set to the date when the rule status is set to **active**.   
 * @param status The status of the transaction rule. If you provide a `startDate` in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
 */
@Serializable
data class TransactionRule (

    /* Your description for the transaction rule, maximum 300 characters. */
    @SerialName(value = "description") @Required val description: kotlin.String,

    @SerialName(value = "entityKey") @Required val entityKey: TransactionRuleEntityKey,

    @SerialName(value = "interval") @Required val interval: TransactionRuleInterval,

    /* Your reference for the transaction rule, maximum 150 characters. */
    @SerialName(value = "reference") @Required val reference: kotlin.String,

    @SerialName(value = "ruleRestrictions") @Required val ruleRestrictions: TransactionRuleRestrictions,

    /* The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met.  */
    @SerialName(value = "type") @Required val type: TransactionRule.Type,

    /* The level at which data must be accumulated, used in rules with `type` **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the `entityKey`.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**. */
    @SerialName(value = "aggregationLevel") val aggregationLevel: kotlin.String? = null,

    /* The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**. */
    @SerialName(value = "endDate") val endDate: kotlin.String? = null,

    /* The unique identifier of the transaction rule. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    /* The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the `score` you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined. */
    @SerialName(value = "outcomeType") val outcomeType: TransactionRule.OutcomeType? = null,

    /* Indicates the type of request to which the rule applies. If not provided, by default, this is set to **authorization**.  Possible values: **authorization**, **authentication**, **tokenization**, **bankTransfer**. */
    @SerialName(value = "requestType") val requestType: TransactionRule.RequestType? = null,

    /* A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when `outcomeType` is **scoreBased**.  The value must be between **-100** and **100**. */
    @SerialName(value = "score") val score: kotlin.Int? = null,

    /* The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the `startDate` is set to the date when the rule status is set to **active**.    */
    @SerialName(value = "startDate") val startDate: kotlin.String? = null,

    /* The status of the transaction rule. If you provide a `startDate` in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**. */
    @SerialName(value = "status") val status: TransactionRule.Status? = null

) {

    /**
     * The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. 
     *
     * Values: AllowList,BlockList,MaxUsage,Velocity
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "allowList") AllowList("allowList"),
        @SerialName(value = "blockList") BlockList("blockList"),
        @SerialName(value = "maxUsage") MaxUsage("maxUsage"),
        @SerialName(value = "velocity") Velocity("velocity");
    }
    /**
     * The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the `score` you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.
     *
     * Values: EnforceSCA,HardBlock,ScoreBased
     */
    @Serializable
    enum class OutcomeType(val value: kotlin.String) {
        @SerialName(value = "enforceSCA") EnforceSCA("enforceSCA"),
        @SerialName(value = "hardBlock") HardBlock("hardBlock"),
        @SerialName(value = "scoreBased") ScoreBased("scoreBased");
    }
    /**
     * Indicates the type of request to which the rule applies. If not provided, by default, this is set to **authorization**.  Possible values: **authorization**, **authentication**, **tokenization**, **bankTransfer**.
     *
     * Values: Authentication,Authorization,BankTransfer,Tokenization
     */
    @Serializable
    enum class RequestType(val value: kotlin.String) {
        @SerialName(value = "authentication") Authentication("authentication"),
        @SerialName(value = "authorization") Authorization("authorization"),
        @SerialName(value = "bankTransfer") BankTransfer("bankTransfer"),
        @SerialName(value = "tokenization") Tokenization("tokenization");
    }
    /**
     * The status of the transaction rule. If you provide a `startDate` in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
     *
     * Values: Active,Inactive
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "active") Active("active"),
        @SerialName(value = "inactive") Inactive("inactive");
    }
}

