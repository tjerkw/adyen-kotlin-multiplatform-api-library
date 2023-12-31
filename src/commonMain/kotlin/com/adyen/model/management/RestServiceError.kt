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

import com.adyen.model.management.InvalidField

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param detail A human-readable explanation specific to this occurrence of the problem.
 * @param errorCode A code that identifies the problem type.
 * @param status The HTTP status code.
 * @param title A short, human-readable summary of the problem type.
 * @param type A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
 * @param instance A unique URI that identifies the specific occurrence of the problem.
 * @param invalidFields Detailed explanation of each validation error, when applicable.
 * @param requestId A unique reference for the request, essentially the same as `pspReference`.
 * @param response 
 */
@Serializable
data class RestServiceError (

    /* A human-readable explanation specific to this occurrence of the problem. */
    @SerialName(value = "detail") @Required val detail: kotlin.String,

    /* A code that identifies the problem type. */
    @SerialName(value = "errorCode") @Required val errorCode: kotlin.String,

    /* The HTTP status code. */
    @SerialName(value = "status") @Required val status: kotlin.Int,

    /* A short, human-readable summary of the problem type. */
    @SerialName(value = "title") @Required val title: kotlin.String,

    /* A URI that identifies the problem type, pointing to human-readable documentation on this problem type. */
    @SerialName(value = "type") @Required val type: kotlin.String,

    /* A unique URI that identifies the specific occurrence of the problem. */
    @SerialName(value = "instance") val instance: kotlin.String? = null,

    /* Detailed explanation of each validation error, when applicable. */
    @SerialName(value = "invalidFields") val invalidFields: kotlin.collections.List<InvalidField>? = null,

    /* A unique reference for the request, essentially the same as `pspReference`. */
    @SerialName(value = "requestId") val requestId: kotlin.String? = null,

    @SerialName(value = "response") val response: kotlin.String? = null

)

