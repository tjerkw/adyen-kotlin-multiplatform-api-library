/**
 * Management API
 *
 * Configure and manage your Adyen company and merchant accounts, stores, and payment terminals. ## Authentication Each request to the Management API must be signed with an API key. [Generate your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) in the Customer Area and then set this key to the `X-API-Key` header value.  To access the live endpoints, you need to generate a new API key in your live Customer Area. ## Versioning  Management API handles versioning as part of the endpoint URL. For example, to send a request to this version of the `/companies/{companyId}/webhooks` endpoint, use:  ```text https://management-test.adyen.com/v3/companies/{companyId}/webhooks ```  ## Going live  To access the live endpoints, you need an API key from your live Customer Area. Use this API key to make requests to:  ```text https://management-live.adyen.com/v3 ```  ## Release notes Have a look at the [release notes](https://docs.adyen.com/release-notes/management-api) to find out what changed in this version!
 *
 * The version of the OpenAPI document: 3
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

package com.adyen.model.management


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id The unique identifier of the payout setting.
 * @param transferInstrumentId The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.
 * @param allowed Indicates if payouts to the bank account are allowed. This value is set automatically based on the status of the verification process. The value is:  * **true** if `verificationStatus` is **valid**. * **false** for all other values.
 * @param enabled Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both `enabled` and `allowed` must be **true**.
 * @param enabledFromDate The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the `enabled` field indicates if payouts are enabled for this bank account.  If a date is specified and:  * `enabled`: **true**, payouts are enabled starting the specified date. * `enabled`: **false**, payouts are disabled until the specified date. On the specified date, `enabled` changes to **true** and this field is reset to **null**.
 * @param priority Determines how long it takes for the funds to reach the bank account. Adyen pays out based on the [payout frequency](https://docs.adyen.com/account/getting-paid#payout-frequency). Depending on the currencies and banks involved in transferring the money, it may take up to three days for the payout funds to arrive in the bank account.   Possible values: * **first**: same day. * **urgent**: the next day. * **normal**: between 1 and 3 days.
 * @param verificationStatus The status of the verification process for the bank account.  Possible values: * **valid**: the verification was successful. * **pending**: the verification is in progress. * **invalid**: the information provided is not complete. * **rejected**:  there are reasons to refuse working with this entity.
 */
@Serializable
data class PayoutSettings (

    /* The unique identifier of the payout setting. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account. */
    @SerialName(value = "transferInstrumentId") @Required val transferInstrumentId: kotlin.String,

    /* Indicates if payouts to the bank account are allowed. This value is set automatically based on the status of the verification process. The value is:  * **true** if `verificationStatus` is **valid**. * **false** for all other values. */
    @SerialName(value = "allowed") val allowed: kotlin.Boolean? = null,

    /* Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both `enabled` and `allowed` must be **true**. */
    @SerialName(value = "enabled") val enabled: kotlin.Boolean? = null,

    /* The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the `enabled` field indicates if payouts are enabled for this bank account.  If a date is specified and:  * `enabled`: **true**, payouts are enabled starting the specified date. * `enabled`: **false**, payouts are disabled until the specified date. On the specified date, `enabled` changes to **true** and this field is reset to **null**. */
    @SerialName(value = "enabledFromDate") val enabledFromDate: kotlin.String? = null,

    /* Determines how long it takes for the funds to reach the bank account. Adyen pays out based on the [payout frequency](https://docs.adyen.com/account/getting-paid#payout-frequency). Depending on the currencies and banks involved in transferring the money, it may take up to three days for the payout funds to arrive in the bank account.   Possible values: * **first**: same day. * **urgent**: the next day. * **normal**: between 1 and 3 days. */
    @SerialName(value = "priority") val priority: PayoutSettings.Priority? = null,

    /* The status of the verification process for the bank account.  Possible values: * **valid**: the verification was successful. * **pending**: the verification is in progress. * **invalid**: the information provided is not complete. * **rejected**:  there are reasons to refuse working with this entity. */
    @SerialName(value = "verificationStatus") val verificationStatus: PayoutSettings.VerificationStatus? = null

) {

    /**
     * Determines how long it takes for the funds to reach the bank account. Adyen pays out based on the [payout frequency](https://docs.adyen.com/account/getting-paid#payout-frequency). Depending on the currencies and banks involved in transferring the money, it may take up to three days for the payout funds to arrive in the bank account.   Possible values: * **first**: same day. * **urgent**: the next day. * **normal**: between 1 and 3 days.
     *
     * Values: First,Normal,Urgent
     */
    @Serializable
    enum class Priority(val value: kotlin.String) {
        @SerialName(value = "first") First("first"),
        @SerialName(value = "normal") Normal("normal"),
        @SerialName(value = "urgent") Urgent("urgent");
    }
    /**
     * The status of the verification process for the bank account.  Possible values: * **valid**: the verification was successful. * **pending**: the verification is in progress. * **invalid**: the information provided is not complete. * **rejected**:  there are reasons to refuse working with this entity.
     *
     * Values: Invalid,Pending,Rejected,Valid
     */
    @Serializable
    enum class VerificationStatus(val value: kotlin.String) {
        @SerialName(value = "invalid") Invalid("invalid"),
        @SerialName(value = "pending") Pending("pending"),
        @SerialName(value = "rejected") Rejected("rejected"),
        @SerialName(value = "valid") Valid("valid");
    }
}
