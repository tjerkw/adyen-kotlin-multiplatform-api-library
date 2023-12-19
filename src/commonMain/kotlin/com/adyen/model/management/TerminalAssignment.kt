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

import com.adyen.model.management.TerminalReassignmentTarget

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param companyId The unique identifier of the company account to which terminal is assigned.
 * @param status The status of the reassignment. Possible values:   * `reassignmentInProgress`: the terminal was boarded and is now scheduled to remove the configuration. Wait for the terminal to synchronize with the Adyen platform.  * `deployed`: the terminal is deployed and reassigned.   * `inventory`: the terminal is in inventory and cannot process transactions.   * `boarded`: the terminal is boarded to a store, or a merchant account representing a store, and can process transactions.  
 * @param merchantId The unique identifier of the merchant account to which terminal is assigned.
 * @param reassignmentTarget 
 * @param storeId The unique identifier of the store to which terminal is assigned.
 */
@Serializable
data class TerminalAssignment (

    /* The unique identifier of the company account to which terminal is assigned. */
    @SerialName(value = "companyId") @Required val companyId: kotlin.String,

    /* The status of the reassignment. Possible values:   * `reassignmentInProgress`: the terminal was boarded and is now scheduled to remove the configuration. Wait for the terminal to synchronize with the Adyen platform.  * `deployed`: the terminal is deployed and reassigned.   * `inventory`: the terminal is in inventory and cannot process transactions.   * `boarded`: the terminal is boarded to a store, or a merchant account representing a store, and can process transactions.   */
    @SerialName(value = "status") @Required val status: TerminalAssignment.Status,

    /* The unique identifier of the merchant account to which terminal is assigned. */
    @SerialName(value = "merchantId") val merchantId: kotlin.String? = null,

    @SerialName(value = "reassignmentTarget") val reassignmentTarget: TerminalReassignmentTarget? = null,

    /* The unique identifier of the store to which terminal is assigned. */
    @SerialName(value = "storeId") val storeId: kotlin.String? = null

) {

    /**
     * The status of the reassignment. Possible values:   * `reassignmentInProgress`: the terminal was boarded and is now scheduled to remove the configuration. Wait for the terminal to synchronize with the Adyen platform.  * `deployed`: the terminal is deployed and reassigned.   * `inventory`: the terminal is in inventory and cannot process transactions.   * `boarded`: the terminal is boarded to a store, or a merchant account representing a store, and can process transactions.  
     *
     * Values: Boarded,Deployed,Inventory,ReassignmentInProgress
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "boarded") Boarded("boarded"),
        @SerialName(value = "deployed") Deployed("deployed"),
        @SerialName(value = "inventory") Inventory("inventory"),
        @SerialName(value = "reassignmentInProgress") ReassignmentInProgress("reassignmentInProgress");
    }
}
