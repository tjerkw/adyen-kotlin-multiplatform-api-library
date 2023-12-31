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

package com.adyen.service.disputes

import com.adyen.model.disputes.AcceptDisputeRequest
import com.adyen.model.disputes.AcceptDisputeResponse
import com.adyen.model.disputes.DefendDisputeRequest
import com.adyen.model.disputes.DefendDisputeResponse
import com.adyen.model.disputes.DefenseReasonsRequest
import com.adyen.model.disputes.DefenseReasonsResponse
import com.adyen.model.disputes.DeleteDefenseDocumentRequest
import com.adyen.model.disputes.DeleteDefenseDocumentResponse
import com.adyen.model.disputes.ServiceError
import com.adyen.model.disputes.SupplyDefenseDocumentRequest
import com.adyen.model.disputes.SupplyDefenseDocumentResponse

import com.adyen.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class GeneralApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Accept a dispute
     * Accepts a specific dispute.
     * @param acceptDisputeRequest  (optional)
     * @return AcceptDisputeResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postAcceptDispute(acceptDisputeRequest: AcceptDisputeRequest? = null): HttpResponse<AcceptDisputeResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = acceptDisputeRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/acceptDispute",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Defend a dispute
     * Defends a specific dispute.
     * @param defendDisputeRequest  (optional)
     * @return DefendDisputeResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postDefendDispute(defendDisputeRequest: DefendDisputeRequest? = null): HttpResponse<DefendDisputeResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = defendDisputeRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/defendDispute",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Delete a defense document
     * Deletes a specific dispute defense document that was supplied earlier.
     * @param deleteDefenseDocumentRequest  (optional)
     * @return DeleteDefenseDocumentResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postDeleteDisputeDefenseDocument(deleteDefenseDocumentRequest: DeleteDefenseDocumentRequest? = null): HttpResponse<DeleteDefenseDocumentResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = deleteDefenseDocumentRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/deleteDisputeDefenseDocument",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Get applicable defense reasons
     * Returns a list of all applicable defense reasons to defend a specific dispute.
     * @param defenseReasonsRequest  (optional)
     * @return DefenseReasonsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postRetrieveApplicableDefenseReasons(defenseReasonsRequest: DefenseReasonsRequest? = null): HttpResponse<DefenseReasonsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = defenseReasonsRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/retrieveApplicableDefenseReasons",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Supply a defense document
     * Supplies a specific dispute defense document.
     * @param supplyDefenseDocumentRequest  (optional)
     * @return SupplyDefenseDocumentResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postSupplyDefenseDocument(supplyDefenseDocumentRequest: SupplyDefenseDocumentRequest? = null): HttpResponse<SupplyDefenseDocumentResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = supplyDefenseDocumentRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/supplyDefenseDocument",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



}
