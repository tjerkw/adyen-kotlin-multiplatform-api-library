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

import com.adyen.model.management.TerminalAssignment
import com.adyen.model.management.TerminalConnectivity

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param assignment 
 * @param connectivity 
 * @param firmwareVersion The software release currently in use on the terminal.
 * @param id The unique identifier of the terminal.
 * @param lastActivityAt Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago.
 * @param lastTransactionAt Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago.
 * @param model The model name of the terminal.
 * @param serialNumber The serial number of the terminal.
 */
@Serializable
data class Terminal (

    @SerialName(value = "assignment") val assignment: TerminalAssignment? = null,

    @SerialName(value = "connectivity") val connectivity: TerminalConnectivity? = null,

    /* The software release currently in use on the terminal. */
    @SerialName(value = "firmwareVersion") val firmwareVersion: kotlin.String? = null,

    /* The unique identifier of the terminal. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    /* Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago. */
    @SerialName(value = "lastActivityAt") val lastActivityAt: kotlin.String? = null,

    /* Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago. */
    @SerialName(value = "lastTransactionAt") val lastTransactionAt: kotlin.String? = null,

    /* The model name of the terminal. */
    @SerialName(value = "model") val model: kotlin.String? = null,

    /* The serial number of the terminal. */
    @SerialName(value = "serialNumber") val serialNumber: kotlin.String? = null

)

