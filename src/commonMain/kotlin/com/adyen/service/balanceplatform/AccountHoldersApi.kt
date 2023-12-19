/**
 * Configuration API
 *
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v2/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v2`.
 *
 * The version of the OpenAPI document: 2
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

package com.adyen.service.balanceplatform

import com.adyen.model.balanceplatform.AccountHolder
import com.adyen.model.balanceplatform.AccountHolderInfo
import com.adyen.model.balanceplatform.AccountHolderUpdateRequest
import com.adyen.model.balanceplatform.GetTaxFormResponse
import com.adyen.model.balanceplatform.PaginatedBalanceAccountsResponse
import com.adyen.model.balanceplatform.RestServiceError

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

open class AccountHoldersApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get an account holder
     * Returns an account holder.
     * @param id The unique identifier of the account holder.
     * @return AccountHolder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getAccountHoldersId(id: kotlin.String): HttpResponse<AccountHolder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/accountHolders/{id}".replace("{" + "id" + "}", "$id"),
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
     * Get all balance accounts of an account holder
     * Returns a paginated list of the balance accounts associated with an account holder. To fetch multiple pages, use the query parameters.   For example, to limit the page to 5 balance accounts and skip the first 10, use &#x60;/accountHolders/{id}/balanceAccounts?limit&#x3D;5&amp;offset&#x3D;10&#x60;.
     * @param id The unique identifier of the account holder.
     * @param offset The number of items that you want to skip. (optional)
     * @param limit The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. (optional)
     * @return PaginatedBalanceAccountsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getAccountHoldersIdBalanceAccounts(id: kotlin.String, offset: kotlin.Int? = null, limit: kotlin.Int? = null): HttpResponse<PaginatedBalanceAccountsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        limit?.apply { localVariableQuery["limit"] = listOf("$limit") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/accountHolders/{id}/balanceAccounts".replace("{" + "id" + "}", "$id"),
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
     * Get a tax form
     * Generates a tax form for account holders operating in the US. For more information, refer to [Providing tax forms](https://docs.adyen.com/marketplaces-and-platforms/us-tax-forms/).
     * @param id The unique identifier of the account holder.
     * @param formType The type of tax form you want to retrieve. Accepted values are **US1099k** and **US1099nec**
     * @param year The tax year in YYYY format for the tax form you want to retrieve
     * @return GetTaxFormResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getAccountHoldersIdTaxForms(id: kotlin.String, formType: kotlin.String, year: kotlin.Int): HttpResponse<GetTaxFormResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        formType?.apply { localVariableQuery["formType"] = listOf("$formType") }
        year?.apply { localVariableQuery["year"] = listOf("$year") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/accountHolders/{id}/taxForms".replace("{" + "id" + "}", "$id"),
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
     * Update an account holder
     * Updates an account holder. When updating an account holder resource, if a parameter is not provided in the request, it is left unchanged.
     * @param id The unique identifier of the account holder.
     * @param accountHolderUpdateRequest  (optional)
     * @return AccountHolder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchAccountHoldersId(id: kotlin.String, accountHolderUpdateRequest: AccountHolderUpdateRequest? = null): HttpResponse<AccountHolder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = accountHolderUpdateRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/accountHolders/{id}".replace("{" + "id" + "}", "$id"),
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
     * Create an account holder
     * Creates an account holder linked to a [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).  
     * @param accountHolderInfo  (optional)
     * @return AccountHolder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postAccountHolders(accountHolderInfo: AccountHolderInfo? = null): HttpResponse<AccountHolder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = accountHolderInfo

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/accountHolders",
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