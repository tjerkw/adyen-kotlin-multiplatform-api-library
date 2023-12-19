/**
 * POS Terminal Management API
 *
 * This API provides endpoints for managing your point-of-sale (POS) payment terminals. You can use the API to obtain information about a specific terminal, retrieve overviews of your terminals and stores, and assign terminals to a merchant account or store.  For more information, refer to [Assign terminals](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api).  ## Authentication Each request to the Terminal Management API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Terminal Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://postfmapi-test.adyen.com/postfmapi/terminal/v1/getTerminalsUnderAccount ``` When using versioned endpoints, Boolean response values are returned in string format: `\"true\"` or `\"false\"`. If you omit the version from the endpoint URL, Boolean response values are returned like this: `true` or `false`.
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

package com.adyen.model.posterminalmanagement


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param errorCode The error code mapped to the error message.
 * @param errorType The category of the error.
 * @param message A short explanation of the issue.
 * @param pspReference The PSP reference of the payment.
 * @param status The HTTP response status.
 */
@Serializable
data class ServiceError (

    /* The error code mapped to the error message. */
    @SerialName(value = "errorCode") val errorCode: kotlin.String? = null,

    /* The category of the error. */
    @SerialName(value = "errorType") val errorType: kotlin.String? = null,

    /* A short explanation of the issue. */
    @SerialName(value = "message") val message: kotlin.String? = null,

    /* The PSP reference of the payment. */
    @SerialName(value = "pspReference") val pspReference: kotlin.String? = null,

    /* The HTTP response status. */
    @SerialName(value = "status") val status: kotlin.Int? = null

)
