/**
 * Adyen Payment API
 *
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
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

package com.adyen.model.payment


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param authenticationValue The `authenticationValue` value as defined in the 3D Secure 2 specification.
 * @param cavvAlgorithm The algorithm used by the ACS to calculate the authentication value, only for Cartes Bancaires integrations.
 * @param challengeCancel Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
 * @param dsTransID The `dsTransID` value as defined in the 3D Secure 2 specification.
 * @param eci The `eci` value as defined in the 3D Secure 2 specification.
 * @param exemptionIndicator Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * `lowValue` * `secureCorporate` * `trustedBeneficiary` * `transactionRiskAnalysis` 
 * @param messageVersion The `messageVersion` value as defined in the 3D Secure 2 specification.
 * @param riskScore Risk score calculated by Cartes Bancaires Directory Server (DS).
 * @param threeDSRequestorChallengeInd Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only
 * @param threeDSServerTransID The `threeDSServerTransID` value as defined in the 3D Secure 2 specification.
 * @param timestamp The `timestamp` value of the 3D Secure 2 authentication.
 * @param transStatus The `transStatus` value as defined in the 3D Secure 2 specification.
 * @param transStatusReason Provides information on why the `transStatus` field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values).
 * @param whiteListStatus The `whiteListStatus` value as defined in the 3D Secure 2 specification.
 */
@Serializable
data class ThreeDS2Result (

    /* The `authenticationValue` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "authenticationValue") val authenticationValue: kotlin.String? = null,

    /* The algorithm used by the ACS to calculate the authentication value, only for Cartes Bancaires integrations. */
    @SerialName(value = "cavvAlgorithm") val cavvAlgorithm: kotlin.String? = null,

    /* Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata). */
    @SerialName(value = "challengeCancel") val challengeCancel: ThreeDS2Result.ChallengeCancel? = null,

    /* The `dsTransID` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "dsTransID") val dsTransID: kotlin.String? = null,

    /* The `eci` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "eci") val eci: kotlin.String? = null,

    /* Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * `lowValue` * `secureCorporate` * `trustedBeneficiary` * `transactionRiskAnalysis`  */
    @SerialName(value = "exemptionIndicator") val exemptionIndicator: ThreeDS2Result.ExemptionIndicator? = null,

    /* The `messageVersion` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "messageVersion") val messageVersion: kotlin.String? = null,

    /* Risk score calculated by Cartes Bancaires Directory Server (DS). */
    @SerialName(value = "riskScore") val riskScore: kotlin.String? = null,

    /* Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only */
    @SerialName(value = "threeDSRequestorChallengeInd") val threeDSRequestorChallengeInd: ThreeDS2Result.ThreeDSRequestorChallengeInd? = null,

    /* The `threeDSServerTransID` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "threeDSServerTransID") val threeDSServerTransID: kotlin.String? = null,

    /* The `timestamp` value of the 3D Secure 2 authentication. */
    @SerialName(value = "timestamp") val timestamp: kotlin.String? = null,

    /* The `transStatus` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "transStatus") val transStatus: kotlin.String? = null,

    /* Provides information on why the `transStatus` field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values). */
    @SerialName(value = "transStatusReason") val transStatusReason: kotlin.String? = null,

    /* The `whiteListStatus` value as defined in the 3D Secure 2 specification. */
    @SerialName(value = "whiteListStatus") val whiteListStatus: kotlin.String? = null

) {

    /**
     * Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata).
     *
     * Values: _01,_02,_03,_04,_05,_06,_07
     */
    @Serializable
    enum class ChallengeCancel(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04"),
        @SerialName(value = "05") _05("05"),
        @SerialName(value = "06") _06("06"),
        @SerialName(value = "07") _07("07");
    }
    /**
     * Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * `lowValue` * `secureCorporate` * `trustedBeneficiary` * `transactionRiskAnalysis` 
     *
     * Values: LowValue,SecureCorporate,TrustedBeneficiary,TransactionRiskAnalysis
     */
    @Serializable
    enum class ExemptionIndicator(val value: kotlin.String) {
        @SerialName(value = "lowValue") LowValue("lowValue"),
        @SerialName(value = "secureCorporate") SecureCorporate("secureCorporate"),
        @SerialName(value = "trustedBeneficiary") TrustedBeneficiary("trustedBeneficiary"),
        @SerialName(value = "transactionRiskAnalysis") TransactionRiskAnalysis("transactionRiskAnalysis");
    }
    /**
     * Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only
     *
     * Values: _01,_02,_03,_04,_05,_06
     */
    @Serializable
    enum class ThreeDSRequestorChallengeInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04"),
        @SerialName(value = "05") _05("05"),
        @SerialName(value = "06") _06("06");
    }
}

