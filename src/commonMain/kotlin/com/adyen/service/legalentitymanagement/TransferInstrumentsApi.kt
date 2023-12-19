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

import com.adyen.model.legalentitymanagement.ServiceError
import com.adyen.model.legalentitymanagement.TransferInstrument
import com.adyen.model.legalentitymanagement.TransferInstrumentInfo

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

open class TransferInstrumentsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Delete a transfer instrument
     * Deletes a transfer instrument.
     * @param id The unique identifier of the transfer instrument to be deleted.
     * @return void
     */
    open suspend fun deleteTransferInstrumentsId(id: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/transferInstruments/{id}".replace("{" + "id" + "}", "$id"),
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
     * Get a transfer instrument
     * Returns the details of a transfer instrument.
     * @param id The unique identifier of the transfer instrument.
     * @return TransferInstrument
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getTransferInstrumentsId(id: kotlin.String): HttpResponse<TransferInstrument> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/transferInstruments/{id}".replace("{" + "id" + "}", "$id"),
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
     * Update a transfer instrument
     * Updates a transfer instrument.
     * @param id The unique identifier of the transfer instrument.
     * @param xRequestedVerificationCode Use the requested verification code 0_0001 to resolve any suberrors associated with the transfer instrument. Requested verification codes can only be used in your test environment. (optional)
     * @param transferInstrumentInfo  (optional)
     * @return TransferInstrument
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchTransferInstrumentsId(id: kotlin.String, xRequestedVerificationCode: kotlin.String? = null, transferInstrumentInfo: TransferInstrumentInfo? = null): HttpResponse<TransferInstrument> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = transferInstrumentInfo

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        xRequestedVerificationCode?.apply { localVariableHeaders["x-requested-verification-code"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/transferInstruments/{id}".replace("{" + "id" + "}", "$id"),
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
     * Create a transfer instrument
     * Creates a transfer instrument.   A transfer instrument is a bank account that a legal entity owns. Adyen performs verification checks on the transfer instrument as required by payment industry regulations. We inform you of the verification results through webhooks or API responses.  When the transfer instrument passes the verification checks, you can start sending funds from the balance platform to the transfer instrument (such as payouts).
     * @param xRequestedVerificationCode Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment. (optional)
     * @param transferInstrumentInfo  (optional)
     * @return TransferInstrument
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postTransferInstruments(xRequestedVerificationCode: kotlin.String? = null, transferInstrumentInfo: TransferInstrumentInfo? = null): HttpResponse<TransferInstrument> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = transferInstrumentInfo

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        xRequestedVerificationCode?.apply { localVariableHeaders["x-requested-verification-code"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/transferInstruments",
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
