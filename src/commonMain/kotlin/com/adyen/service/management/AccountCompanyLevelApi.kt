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

import com.adyen.model.management.Company
import com.adyen.model.management.ListCompanyResponse
import com.adyen.model.management.ListMerchantResponse
import com.adyen.model.management.RestServiceError

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

open class AccountCompanyLevelApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get a list of company accounts
     * Returns the list of company accounts that your API credential has access to. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions):  * Management API—Account read
     * @param pageNumber The number of the page to fetch. (optional)
     * @param pageSize The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
     * @return ListCompanyResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompanies(pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null): HttpResponse<ListCompanyResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        pageNumber?.apply { localVariableQuery["pageNumber"] = listOf("$pageNumber") }
        pageSize?.apply { localVariableQuery["pageSize"] = listOf("$pageSize") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies",
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
     * Get a company account
     * Returns the company account specified in the path. Your API credential must have access to the company account.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read
     * @param companyId The unique identifier of the company account.
     * @return Company
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyId(companyId: kotlin.String): HttpResponse<Company> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get a list of merchant accounts
     * Returns the list of merchant accounts under the company account specified in the path. The list only includes merchant accounts that your API credential has access to. The list is grouped into pages as defined by the query parameters.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read
     * @param companyId The unique identifier of the company account.
     * @param pageNumber The number of the page to fetch. (optional)
     * @param pageSize The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
     * @return ListMerchantResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdMerchants(companyId: kotlin.String, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null): HttpResponse<ListMerchantResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        pageNumber?.apply { localVariableQuery["pageNumber"] = listOf("$pageNumber") }
        pageSize?.apply { localVariableQuery["pageSize"] = listOf("$pageSize") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/merchants".replace("{" + "companyId" + "}", "$companyId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
