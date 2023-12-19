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

import com.adyen.model.management.CompanyUser
import com.adyen.model.management.CreateCompanyUserRequest
import com.adyen.model.management.CreateCompanyUserResponse
import com.adyen.model.management.ListCompanyUsersResponse
import com.adyen.model.management.RestServiceError
import com.adyen.model.management.UpdateCompanyUserRequest

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

open class UsersCompanyLevelApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get a list of users
     * Returns the list of users for the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     * @param companyId The unique identifier of the company account.
     * @param pageNumber The number of the page to return. (optional)
     * @param pageSize The number of items to have on a page. Maximum value is **100**. The default is **10** items on a page. (optional)
     * @param username The partial or complete username to select all users that match. (optional)
     * @return ListCompanyUsersResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdUsers(companyId: kotlin.String, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, username: kotlin.String? = null): HttpResponse<ListCompanyUsersResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        pageNumber?.apply { localVariableQuery["pageNumber"] = listOf("$pageNumber") }
        pageSize?.apply { localVariableQuery["pageSize"] = listOf("$pageSize") }
        username?.apply { localVariableQuery["username"] = listOf("$username") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/users".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get user details
     * Returns user details for the &#x60;userId&#x60; and the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     * @param companyId The unique identifier of the company account.
     * @param userId The unique identifier of the user.
     * @return CompanyUser
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdUsersUserId(companyId: kotlin.String, userId: kotlin.String): HttpResponse<CompanyUser> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/users/{userId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "userId" + "}", "$userId"),
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
     * Update user details
     * Updates user details for the &#x60;userId&#x60; and the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     * @param companyId The unique identifier of the company account.
     * @param userId The unique identifier of the user.
     * @param updateCompanyUserRequest  (optional)
     * @return CompanyUser
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchCompaniesCompanyIdUsersUserId(companyId: kotlin.String, userId: kotlin.String, updateCompanyUserRequest: UpdateCompanyUserRequest? = null): HttpResponse<CompanyUser> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = updateCompanyUserRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/companies/{companyId}/users/{userId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "userId" + "}", "$userId"),
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
     * Create a new user
     * Creates the user for the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     * @param companyId The unique identifier of the company account.
     * @param createCompanyUserRequest  (optional)
     * @return CreateCompanyUserResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdUsers(companyId: kotlin.String, createCompanyUserRequest: CreateCompanyUserRequest? = null): HttpResponse<CreateCompanyUserResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = createCompanyUserRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/users".replace("{" + "companyId" + "}", "$companyId"),
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
