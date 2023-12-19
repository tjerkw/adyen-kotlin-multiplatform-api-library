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

package com.adyen.service.management

import com.adyen.model.management.ApiCredential
import com.adyen.model.management.CreateApiCredentialResponse
import com.adyen.model.management.CreateMerchantApiCredentialRequest
import com.adyen.model.management.ListMerchantApiCredentialsResponse
import com.adyen.model.management.RestServiceError
import com.adyen.model.management.UpdateMerchantApiCredentialRequest

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

open class APICredentialsMerchantLevelApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get a list of API credentials
     * Returns the list of [API credentials](https://docs.adyen.com/development-resources/api-credentials) for the merchant account. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param merchantId The unique identifier of the merchant account.
     * @param pageNumber The number of the page to fetch. (optional)
     * @param pageSize The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
     * @return ListMerchantApiCredentialsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getMerchantsMerchantIdApiCredentials(merchantId: kotlin.String, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null): HttpResponse<ListMerchantApiCredentialsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        pageNumber?.apply { localVariableQuery["pageNumber"] = listOf("$pageNumber") }
        pageSize?.apply { localVariableQuery["pageSize"] = listOf("$pageSize") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/merchants/{merchantId}/apiCredentials".replace("{" + "merchantId" + "}", "$merchantId"),
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
     * Get an API credential
     * Returns the [API credential](https://docs.adyen.com/development-resources/api-credentials) identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param merchantId The unique identifier of the merchant account.
     * @param apiCredentialId Unique identifier of the API credential.
     * @return ApiCredential
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getMerchantsMerchantIdApiCredentialsApiCredentialId(merchantId: kotlin.String, apiCredentialId: kotlin.String): HttpResponse<ApiCredential> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/merchants/{merchantId}/apiCredentials/{apiCredentialId}".replace("{" + "merchantId" + "}", "$merchantId").replace("{" + "apiCredentialId" + "}", "$apiCredentialId"),
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
     * Update an API credential
     * Changes the API credential&#39;s roles, or allowed origins. The request has the new values for the fields you want to change. The response contains the full updated API credential, including the new values from the request.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param merchantId The unique identifier of the merchant account.
     * @param apiCredentialId Unique identifier of the API credential.
     * @param updateMerchantApiCredentialRequest  (optional)
     * @return ApiCredential
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchMerchantsMerchantIdApiCredentialsApiCredentialId(merchantId: kotlin.String, apiCredentialId: kotlin.String, updateMerchantApiCredentialRequest: UpdateMerchantApiCredentialRequest? = null): HttpResponse<ApiCredential> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = updateMerchantApiCredentialRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/merchants/{merchantId}/apiCredentials/{apiCredentialId}".replace("{" + "merchantId" + "}", "$merchantId").replace("{" + "apiCredentialId" + "}", "$apiCredentialId"),
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
     * Create an API credential
     * Creates an [API credential](https://docs.adyen.com/development-resources/api-credentials) for the company account identified in the path. In the request, you can specify the roles and allowed origins for the new API credential.  The response includes the: * [API key](https://docs.adyen.com/development-resources/api-authentication#api-key-authentication): used for API request authentication. * [Client key](https://docs.adyen.com/development-resources/client-side-authentication#how-it-works): public key used for client-side authentication. * [Username and password](https://docs.adyen.com/development-resources/api-authentication#using-basic-authentication): used for basic authentication.  &gt; Make sure you store the API key securely in your system. You won&#39;t be able to retrieve it later.  If your API key is lost or compromised, you need to [generate a new API key](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateApiKey).  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param merchantId The unique identifier of the merchant account.
     * @param createMerchantApiCredentialRequest  (optional)
     * @return CreateApiCredentialResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postMerchantsMerchantIdApiCredentials(merchantId: kotlin.String, createMerchantApiCredentialRequest: CreateMerchantApiCredentialRequest? = null): HttpResponse<CreateApiCredentialResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = createMerchantApiCredentialRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/merchants/{merchantId}/apiCredentials".replace("{" + "merchantId" + "}", "$merchantId"),
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