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
import com.adyen.model.legalentitymanagement.SourceOfFunds
import com.adyen.model.legalentitymanagement.WebData
import com.adyen.model.legalentitymanagement.WebDataExemption

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id The unique identifier of the business line.
 * @param industryCode A code that represents the industry of the legal entity. For example, **4431A** for computer software stores.
 * @param legalEntityId Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
 * @param service The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
 * @param capability The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
 * @param problems The verification errors related to capabilities for this supporting entity.
 * @param salesChannels A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the `service` **paymentProcessing**.
 * @param sourceOfFunds 
 * @param webData List of website URLs where your user's goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the `webDataExemption` object.
 * @param webDataExemption 
 */
@Serializable
data class BusinessLine (

    /* The unique identifier of the business line. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* A code that represents the industry of the legal entity. For example, **4431A** for computer software stores. */
    @SerialName(value = "industryCode") @Required val industryCode: kotlin.String,

    /* Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line. */
    @SerialName(value = "legalEntityId") @Required val legalEntityId: kotlin.String,

    /* The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**   */
    @SerialName(value = "service") @Required val service: BusinessLine.Service,

    /* The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount** */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "capability") val capability: BusinessLine.Capability? = null,

    /* The verification errors related to capabilities for this supporting entity. */
    @SerialName(value = "problems") val problems: kotlin.collections.List<CapabilityProblem>? = null,

    /* A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the `service` **paymentProcessing**. */
    @SerialName(value = "salesChannels") val salesChannels: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "sourceOfFunds") val sourceOfFunds: SourceOfFunds? = null,

    /* List of website URLs where your user's goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the `webDataExemption` object. */
    @SerialName(value = "webData") val webData: kotlin.collections.List<WebData>? = null,

    @SerialName(value = "webDataExemption") val webDataExemption: WebDataExemption? = null

) {

    /**
     * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
     *
     * Values: PaymentProcessing,Banking
     */
    @Serializable
    enum class Service(val value: kotlin.String) {
        @SerialName(value = "paymentProcessing") PaymentProcessing("paymentProcessing"),
        @SerialName(value = "banking") Banking("banking");
    }
    /**
     * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
     *
     * Values: ReceivePayments,ReceiveFromPlatformPayments,IssueBankAccount
     */
    @Serializable
    enum class Capability(val value: kotlin.String) {
        @SerialName(value = "receivePayments") ReceivePayments("receivePayments"),
        @SerialName(value = "receiveFromPlatformPayments") ReceiveFromPlatformPayments("receiveFromPlatformPayments"),
        @SerialName(value = "issueBankAccount") IssueBankAccount("issueBankAccount");
    }
}

