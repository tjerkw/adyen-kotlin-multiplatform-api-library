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

import com.adyen.model.legalentitymanagement.CapabilityProblem
import com.adyen.model.legalentitymanagement.DocumentReference
import com.adyen.model.legalentitymanagement.EntityReference
import com.adyen.model.legalentitymanagement.Individual
import com.adyen.model.legalentitymanagement.LegalEntityAssociation
import com.adyen.model.legalentitymanagement.LegalEntityCapability
import com.adyen.model.legalentitymanagement.Organization
import com.adyen.model.legalentitymanagement.SoleProprietorship
import com.adyen.model.legalentitymanagement.TransferInstrumentReference
import com.adyen.model.legalentitymanagement.Trust
import com.adyen.model.legalentitymanagement.UnincorporatedPartnership
import com.adyen.model.legalentitymanagement.VerificationDeadline

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id The unique identifier of the legal entity.
 * @param capabilities Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
 * @param documentDetails List of documents uploaded for the legal entity.
 * @param documents List of documents uploaded for the legal entity.
 * @param entityAssociations List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.
 * @param individual 
 * @param organization 
 * @param problems List of verification errors related to capabilities for the legal entity.
 * @param reference Your reference for the legal entity, maximum 150 characters.
 * @param soleProprietorship 
 * @param transferInstruments List of transfer instruments that the legal entity owns.
 * @param trust 
 * @param type The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.
 * @param unincorporatedPartnership 
 * @param verificationDeadlines List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved.
 * @param verificationPlan A key-value pair that specifies the [verification process](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details/) for a legal entity. Set to **upfront** for [upfront verification](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details#upfront).
 */
@Serializable
data class LegalEntity (

    /* The unique identifier of the legal entity. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. */
    @SerialName(value = "capabilities") val capabilities: kotlin.collections.Map<kotlin.String, LegalEntityCapability>? = null,

    /* List of documents uploaded for the legal entity. */
    @SerialName(value = "documentDetails") val documentDetails: kotlin.collections.List<DocumentReference>? = null,

    /* List of documents uploaded for the legal entity. */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "documents") val documents: kotlin.collections.List<EntityReference>? = null,

    /* List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories. */
    @SerialName(value = "entityAssociations") val entityAssociations: kotlin.collections.List<LegalEntityAssociation>? = null,

    @SerialName(value = "individual") val individual: Individual? = null,

    @SerialName(value = "organization") val organization: Organization? = null,

    /* List of verification errors related to capabilities for the legal entity. */
    @SerialName(value = "problems") val problems: kotlin.collections.List<CapabilityProblem>? = null,

    /* Your reference for the legal entity, maximum 150 characters. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    @SerialName(value = "soleProprietorship") val soleProprietorship: SoleProprietorship? = null,

    /* List of transfer instruments that the legal entity owns. */
    @SerialName(value = "transferInstruments") val transferInstruments: kotlin.collections.List<TransferInstrumentReference>? = null,

    @SerialName(value = "trust") val trust: Trust? = null,

    /* The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**. */
    @SerialName(value = "type") val type: LegalEntity.Type? = null,

    @SerialName(value = "unincorporatedPartnership") val unincorporatedPartnership: UnincorporatedPartnership? = null,

    /* List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved. */
    @SerialName(value = "verificationDeadlines") val verificationDeadlines: kotlin.collections.List<VerificationDeadline>? = null,

    /* A key-value pair that specifies the [verification process](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details/) for a legal entity. Set to **upfront** for [upfront verification](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details#upfront). */
    @SerialName(value = "verificationPlan") val verificationPlan: kotlin.String? = null

) {

    /**
     * The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.
     *
     * Values: Individual,Organization,SoleProprietorship,Trust,UnincorporatedPartnership
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "individual") Individual("individual"),
        @SerialName(value = "organization") Organization("organization"),
        @SerialName(value = "soleProprietorship") SoleProprietorship("soleProprietorship"),
        @SerialName(value = "trust") Trust("trust"),
        @SerialName(value = "unincorporatedPartnership") UnincorporatedPartnership("unincorporatedPartnership");
    }
}

