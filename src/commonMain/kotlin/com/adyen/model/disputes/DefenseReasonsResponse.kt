/**
 * Disputes API
 *
 * You can use the [Disputes API](https://docs.adyen.com/risk-management/disputes-api) to automate the dispute handling process so that you can respond to disputes and chargebacks as soon as they are initiated. The Disputes API lets you retrieve defense reasons, supply and delete defense documents, and accept or defend disputes.  ## Authentication Each request to the Disputes API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Disputes API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DisputeService/v30/defendDispute ```
 *
 * The version of the OpenAPI document: 30
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

package com.adyen.model.disputes

import com.adyen.model.disputes.DefenseReason
import com.adyen.model.disputes.DisputeServiceResult

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param disputeServiceResult 
 * @param defenseReasons The defense reasons that can be used to defend the dispute.
 */
@Serializable
data class DefenseReasonsResponse (

    @SerialName(value = "disputeServiceResult") @Required val disputeServiceResult: DisputeServiceResult,

    /* The defense reasons that can be used to defend the dispute. */
    @SerialName(value = "defenseReasons") val defenseReasons: kotlin.collections.List<DefenseReason>? = null

)

