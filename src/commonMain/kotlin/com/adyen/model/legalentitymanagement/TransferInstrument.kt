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

import com.adyen.model.legalentitymanagement.BankAccountInfo
import com.adyen.model.legalentitymanagement.CapabilityProblem
import com.adyen.model.legalentitymanagement.DocumentReference
import com.adyen.model.legalentitymanagement.SupportingEntityCapability

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param bankAccount 
 * @param id The unique identifier of the transfer instrument.
 * @param legalEntityId The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument.
 * @param type The type of transfer instrument.  Possible value: **bankAccount**.
 * @param capabilities List of capabilities for this transfer instrument.
 * @param documentDetails List of documents uploaded for the transfer instrument.
 * @param problems The verification errors related to capabilities for this transfer instrument.
 */
@Serializable
data class TransferInstrument (

    @SerialName(value = "bankAccount") @Required val bankAccount: BankAccountInfo,

    /* The unique identifier of the transfer instrument. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument. */
    @SerialName(value = "legalEntityId") @Required val legalEntityId: kotlin.String,

    /* The type of transfer instrument.  Possible value: **bankAccount**. */
    @SerialName(value = "type") @Required val type: TransferInstrument.Type,

    /* List of capabilities for this transfer instrument. */
    @SerialName(value = "capabilities") val capabilities: kotlin.collections.Map<kotlin.String, SupportingEntityCapability>? = null,

    /* List of documents uploaded for the transfer instrument. */
    @SerialName(value = "documentDetails") val documentDetails: kotlin.collections.List<DocumentReference>? = null,

    /* The verification errors related to capabilities for this transfer instrument. */
    @SerialName(value = "problems") val problems: kotlin.collections.List<CapabilityProblem>? = null

) {

    /**
     * The type of transfer instrument.  Possible value: **bankAccount**.
     *
     * Values: BankAccount,RecurringDetail
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "bankAccount") BankAccount("bankAccount"),
        @SerialName(value = "recurringDetail") RecurringDetail("recurringDetail");
    }
}

