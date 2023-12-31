/**
 * Adyen Data Protection API
 *
 * Adyen Data Protection API provides a way for you to process [Subject Erasure Requests](https://gdpr-info.eu/art-17-gdpr/) as mandated in GDPR.  Use our API to submit a request to delete shopper's data, including payment details and other related information (for example, delivery address or shopper email).## Authentication Each request to the Data Protection API must be signed with an API key. Get your API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate a new API Key to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Data Protection Service API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DataProtectionService/v1/requestSubjectErasure ```
 *
 * The version of the OpenAPI document: 1
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

package com.adyen.model.dataprotection


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param forceErasure Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction.
 * @param merchantAccount Your merchant account
 * @param pspReference The PSP reference of the payment. We will delete all shopper-related data for this payment.
 */
@Serializable
data class SubjectErasureByPspReferenceRequest (

    /* Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction. */
    @SerialName(value = "forceErasure") val forceErasure: kotlin.Boolean? = null,

    /* Your merchant account */
    @SerialName(value = "merchantAccount") val merchantAccount: kotlin.String? = null,

    /* The PSP reference of the payment. We will delete all shopper-related data for this payment. */
    @SerialName(value = "pspReference") val pspReference: kotlin.String? = null

)

