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

package com.adyen.service.legalentitymanagement

import com.adyen.model.legalentitymanagement.BusinessLine
import com.adyen.model.legalentitymanagement.BusinessLineInfo
import com.adyen.model.legalentitymanagement.BusinessLineInfoUpdate
import com.adyen.model.legalentitymanagement.ServiceError

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

open class BusinessLinesApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Delete a business line
     * Deletes a business line.   &gt;If you delete a business line linked to a [payment method](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api), it can affect your merchant account&#39;s ability to use the [payment method](https://docs.adyen.com/api-explorer/Management/latest/post/merchants/_merchantId_/paymentMethodSettings). The business line is removed from all linked merchant accounts.
     * @param id The unique identifier of the business line to be deleted.
     * @return void
     */
    open suspend fun deleteBusinessLinesId(id: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/businessLines/{id}".replace("{" + "id" + "}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get a business line
     * Returns the detail of a business line.
     * @param id The unique identifier of the business line.
     * @return BusinessLine
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getBusinessLinesId(id: kotlin.String): HttpResponse<BusinessLine> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/businessLines/{id}".replace("{" + "id" + "}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Update a business line
     * Updates a business line.
     * @param id The unique identifier of the business line.
     * @param businessLineInfoUpdate  (optional)
     * @return BusinessLine
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchBusinessLinesId(id: kotlin.String, businessLineInfoUpdate: BusinessLineInfoUpdate? = null): HttpResponse<BusinessLine> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = businessLineInfoUpdate

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/businessLines/{id}".replace("{" + "id" + "}", "$id"),
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
     * Create a business line
     * Creates a business line.   This resource contains information about your user&#39;s line of business, including their industry and their source of funds. Adyen uses this information to verify your users as required by payment industry regulations. Adyen informs you of the verification results through webhooks or API responses.  &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  
     * @param businessLineInfo  (optional)
     * @return BusinessLine
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postBusinessLines(businessLineInfo: BusinessLineInfo? = null): HttpResponse<BusinessLine> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = businessLineInfo

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/businessLines",
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
