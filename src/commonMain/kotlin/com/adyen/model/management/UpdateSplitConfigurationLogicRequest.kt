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

import com.adyen.model.management.AdditionalCommission
import com.adyen.model.management.Commission

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param commission 
 * @param acquiringFees Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param additionalCommission 
 * @param adyenCommission Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param adyenFees Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param adyenMarkup Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param chargeback Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**.
 * @param chargebackCostAllocation Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**
 * @param interchange Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param paymentFee Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param remainder Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
 * @param schemeFee Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
 * @param splitLogicId Unique identifier of the split logic that is applied when the split configuration conditions are met.
 * @param surcharge Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**
 * @param tip Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
 */
@Serializable
data class UpdateSplitConfigurationLogicRequest (

    @SerialName(value = "commission") @Required val commission: Commission,

    /* Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "acquiringFees") val acquiringFees: UpdateSplitConfigurationLogicRequest.AcquiringFees? = null,

    @SerialName(value = "additionalCommission") val additionalCommission: AdditionalCommission? = null,

    /* Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "adyenCommission") val adyenCommission: UpdateSplitConfigurationLogicRequest.AdyenCommission? = null,

    /* Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "adyenFees") val adyenFees: UpdateSplitConfigurationLogicRequest.AdyenFees? = null,

    /* Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "adyenMarkup") val adyenMarkup: UpdateSplitConfigurationLogicRequest.AdyenMarkup? = null,

    /* Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**. */
    @SerialName(value = "chargeback") val chargeback: UpdateSplitConfigurationLogicRequest.Chargeback? = null,

    /* Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount** */
    @SerialName(value = "chargebackCostAllocation") val chargebackCostAllocation: UpdateSplitConfigurationLogicRequest.ChargebackCostAllocation? = null,

    /* Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "interchange") val interchange: UpdateSplitConfigurationLogicRequest.Interchange? = null,

    /* Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "paymentFee") val paymentFee: UpdateSplitConfigurationLogicRequest.PaymentFee? = null,

    /* Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**. */
    @SerialName(value = "remainder") val remainder: UpdateSplitConfigurationLogicRequest.Remainder? = null,

    /* Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. */
    @SerialName(value = "schemeFee") val schemeFee: UpdateSplitConfigurationLogicRequest.SchemeFee? = null,

    /* Unique identifier of the split logic that is applied when the split configuration conditions are met. */
    @SerialName(value = "splitLogicId") val splitLogicId: kotlin.String? = null,

    /* Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount** */
    @SerialName(value = "surcharge") val surcharge: UpdateSplitConfigurationLogicRequest.Surcharge? = null,

    /* Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**. */
    @SerialName(value = "tip") val tip: UpdateSplitConfigurationLogicRequest.Tip? = null

) {

    /**
     * Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class AcquiringFees(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class AdyenCommission(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class AdyenFees(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class AdyenMarkup(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount,DeductAccordingToSplitRatio
     */
    @Serializable
    enum class Chargeback(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount"),
        @SerialName(value = "deductAccordingToSplitRatio") DeductAccordingToSplitRatio("deductAccordingToSplitRatio");
    }
    /**
     * Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class ChargebackCostAllocation(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class Interchange(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class PaymentFee(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
     *
     * Values: AddToLiableAccount,AddToOneBalanceAccount
     */
    @Serializable
    enum class Remainder(val value: kotlin.String) {
        @SerialName(value = "addToLiableAccount") AddToLiableAccount("addToLiableAccount"),
        @SerialName(value = "addToOneBalanceAccount") AddToOneBalanceAccount("addToOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
     *
     * Values: DeductFromLiableAccount,DeductFromOneBalanceAccount
     */
    @Serializable
    enum class SchemeFee(val value: kotlin.String) {
        @SerialName(value = "deductFromLiableAccount") DeductFromLiableAccount("deductFromLiableAccount"),
        @SerialName(value = "deductFromOneBalanceAccount") DeductFromOneBalanceAccount("deductFromOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**
     *
     * Values: AddToLiableAccount,AddToOneBalanceAccount
     */
    @Serializable
    enum class Surcharge(val value: kotlin.String) {
        @SerialName(value = "addToLiableAccount") AddToLiableAccount("addToLiableAccount"),
        @SerialName(value = "addToOneBalanceAccount") AddToOneBalanceAccount("addToOneBalanceAccount");
    }
    /**
     * Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
     *
     * Values: AddToLiableAccount,AddToOneBalanceAccount
     */
    @Serializable
    enum class Tip(val value: kotlin.String) {
        @SerialName(value = "addToLiableAccount") AddToLiableAccount("addToLiableAccount"),
        @SerialName(value = "addToOneBalanceAccount") AddToOneBalanceAccount("addToOneBalanceAccount");
    }
}

