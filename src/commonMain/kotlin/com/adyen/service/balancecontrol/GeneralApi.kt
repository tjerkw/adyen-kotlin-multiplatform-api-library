/**
 * Adyen Balance Control API
 *
 * The Balance Control API lets you transfer funds between merchant accounts that belong to the same legal entity and are under the same company account.  ## Authentication To connect to the Balance Control API, you must authenticate your requests with an [API key or basic auth username and password](https://docs.adyen.com/development-resources/api-authentication). To learn how you can generate these, see [API credentials](https://docs.adyen.com/development-resources/api-credentials).Here is an example of authenticating a request with an API key:  ``` curl -H \"X-API-Key: Your_API_key\" \\ -H \"Content-Type: application/json\" \\ ... ``` Note that when going live, you need to generate API credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Balance Control API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example:  ``` https://pal-test.adyen.com/pal/servlet/BalanceControl/v1/balanceTransfer ``` 
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

package com.adyen.service.balancecontrol

import com.adyen.model.balancecontrol.BalanceTransferRequest
import com.adyen.model.balancecontrol.BalanceTransferResponse

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
     * Start a balance transfer
     * Starts a balance transfer request between merchant accounts. The following conditions must be met before you can successfully transfer balances:  * The source and destination merchant accounts must be under the same company account and legal entity.  * The source merchant account must have sufficient funds.  * The source and destination merchant accounts must have at least one common processing currency.  When sending multiple API requests with the same source and destination merchant accounts, send the requests sequentially and *not* in parallel. Some requests may not be processed if the requests are sent in parallel. 
     * @param balanceTransferRequest  (optional)
     * @return BalanceTransferResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postBalanceTransfer(balanceTransferRequest: BalanceTransferRequest? = null): HttpResponse<BalanceTransferResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = balanceTransferRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/balanceTransfer",
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
