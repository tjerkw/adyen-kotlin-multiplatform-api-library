/**
 * Legal Entity Management API
 *
 * The Legal Entity Management API enables you to manage legal entities that contain information required for verification.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value. For example:  ``` curl -H \"X-API-Key: YOUR_API_KEY\" \\ -H \"Content-Type: application/json\" \\ ... ``` Alternatively, you can use the username and password of your API credential to connect to the API using basic authentication. For example:  ``` curl -U \"ws_123456@Scope.Company_YOUR_COMPANY_ACCOUNT\":\"YourWsPassword\" \\ -H \"Content-Type: application/json\" \\ ... ``` ## Versioning The Legal Entity Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://kyc-test.adyen.com/lem/v3/legalEntities ``` >If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote=2023-05-01-legal-entity-management-api-3) for your API requests.  ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://kyc-live.adyen.com/lem/v3`.  
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

package com.adyen.model.legalentitymanagement

import com.adyen.model.legalentitymanagement.CapabilitySettings
import com.adyen.model.legalentitymanagement.SupportingEntityCapability

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param allowed Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful.
 * @param allowedLevel The capability level that is allowed for the legal entity.  Possible values: **notApplicable**, **low**, **medium**, **high**.
 * @param allowedSettings 
 * @param requested Indicates whether the capability is requested. To check whether the legal entity is permitted to use the capability, refer to the `allowed` field.
 * @param requestedLevel The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
 * @param requestedSettings 
 * @param transferInstruments The capability status of transfer instruments associated with the legal entity.
 * @param verificationStatus The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
 */
@Serializable
data class LegalEntityCapability (

    /* Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful. */
    @SerialName(value = "allowed") val allowed: kotlin.Boolean? = null,

    /* The capability level that is allowed for the legal entity.  Possible values: **notApplicable**, **low**, **medium**, **high**. */
    @SerialName(value = "allowedLevel") val allowedLevel: LegalEntityCapability.AllowedLevel? = null,

    @SerialName(value = "allowedSettings") val allowedSettings: CapabilitySettings? = null,

    /* Indicates whether the capability is requested. To check whether the legal entity is permitted to use the capability, refer to the `allowed` field. */
    @SerialName(value = "requested") val requested: kotlin.Boolean? = null,

    /* The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**. */
    @SerialName(value = "requestedLevel") val requestedLevel: LegalEntityCapability.RequestedLevel? = null,

    @SerialName(value = "requestedSettings") val requestedSettings: CapabilitySettings? = null,

    /* The capability status of transfer instruments associated with the legal entity. */
    @SerialName(value = "transferInstruments") val transferInstruments: kotlin.collections.List<SupportingEntityCapability>? = null,

    /* The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  */
    @SerialName(value = "verificationStatus") val verificationStatus: kotlin.String? = null

) {

    /**
     * The capability level that is allowed for the legal entity.  Possible values: **notApplicable**, **low**, **medium**, **high**.
     *
     * Values: High,Low,Medium,NotApplicable
     */
    @Serializable
    enum class AllowedLevel(val value: kotlin.String) {
        @SerialName(value = "high") High("high"),
        @SerialName(value = "low") Low("low"),
        @SerialName(value = "medium") Medium("medium"),
        @SerialName(value = "notApplicable") NotApplicable("notApplicable");
    }
    /**
     * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
     *
     * Values: High,Low,Medium,NotApplicable
     */
    @Serializable
    enum class RequestedLevel(val value: kotlin.String) {
        @SerialName(value = "high") High("high"),
        @SerialName(value = "low") Low("low"),
        @SerialName(value = "medium") Medium("medium"),
        @SerialName(value = "notApplicable") NotApplicable("notApplicable");
    }
}

