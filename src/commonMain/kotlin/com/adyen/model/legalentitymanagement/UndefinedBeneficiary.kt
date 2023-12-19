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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param description The details of the undefined beneficiary.
 * @param reference The reference of the undefined beneficiary.
 */
@Serializable
data class UndefinedBeneficiary (

    /* The details of the undefined beneficiary. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* The reference of the undefined beneficiary. */
    @SerialName(value = "reference") val reference: kotlin.String? = null

)

