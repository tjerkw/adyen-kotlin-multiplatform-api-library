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

import com.adyen.model.balanceplatform.Card
import com.adyen.model.balanceplatform.PaymentInstrumentBankAccount

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param balanceAccountId The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.
 * @param id The unique identifier of the payment instrument.
 * @param issuingCountryCode The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.
 * @param type Type of payment instrument.  Possible value: **card**, **bankAccount**. 
 * @param bankAccount 
 * @param card 
 * @param description Your description for the payment instrument, maximum 300 characters.
 * @param paymentInstrumentGroupId The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.
 * @param reference Your reference for the payment instrument, maximum 150 characters.
 * @param status The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
 * @param statusReason The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the `statusComment` parameter describing the status change.
 */
@Serializable
data class PaymentInstrument (

    /* The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument. */
    @SerialName(value = "balanceAccountId") @Required val balanceAccountId: kotlin.String,

    /* The unique identifier of the payment instrument. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**. */
    @SerialName(value = "issuingCountryCode") @Required val issuingCountryCode: kotlin.String,

    /* Type of payment instrument.  Possible value: **card**, **bankAccount**.  */
    @SerialName(value = "type") @Required val type: PaymentInstrument.Type,

    @SerialName(value = "bankAccount") val bankAccount: PaymentInstrumentBankAccount? = null,

    @SerialName(value = "card") val card: Card? = null,

    /* Your description for the payment instrument, maximum 300 characters. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs. */
    @SerialName(value = "paymentInstrumentGroupId") val paymentInstrumentGroupId: kotlin.String? = null,

    /* Your reference for the payment instrument, maximum 150 characters. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /* The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.    */
    @SerialName(value = "status") val status: PaymentInstrument.Status? = null,

    /* The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the `statusComment` parameter describing the status change. */
    @SerialName(value = "statusReason") val statusReason: PaymentInstrument.StatusReason? = null

) {

    /**
     * Type of payment instrument.  Possible value: **card**, **bankAccount**. 
     *
     * Values: BankAccount,Card
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "bankAccount") BankAccount("bankAccount"),
        @SerialName(value = "card") Card("card");
    }
    /**
     * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
     *
     * Values: Active,Closed,Inactive,Suspended
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "active") Active("active"),
        @SerialName(value = "closed") Closed("closed"),
        @SerialName(value = "inactive") Inactive("inactive"),
        @SerialName(value = "suspended") Suspended("suspended");
    }
    /**
     * The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the `statusComment` parameter describing the status change.
     *
     * Values: AccountClosure,Damaged,EndOfLife,Expired,Lost,Other,Stolen,SuspectedFraud,TransactionRule
     */
    @Serializable
    enum class StatusReason(val value: kotlin.String) {
        @SerialName(value = "accountClosure") AccountClosure("accountClosure"),
        @SerialName(value = "damaged") Damaged("damaged"),
        @SerialName(value = "endOfLife") EndOfLife("endOfLife"),
        @SerialName(value = "expired") Expired("expired"),
        @SerialName(value = "lost") Lost("lost"),
        @SerialName(value = "other") Other("other"),
        @SerialName(value = "stolen") Stolen("stolen"),
        @SerialName(value = "suspectedFraud") SuspectedFraud("suspectedFraud"),
        @SerialName(value = "transactionRule") TransactionRule("transactionRule");
    }
}

