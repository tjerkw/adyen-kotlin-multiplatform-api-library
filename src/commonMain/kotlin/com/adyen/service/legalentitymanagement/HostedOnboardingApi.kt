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

import com.adyen.model.legalentitymanagement.OnboardingLink
import com.adyen.model.legalentitymanagement.OnboardingLinkInfo
import com.adyen.model.legalentitymanagement.OnboardingTheme
import com.adyen.model.legalentitymanagement.OnboardingThemes
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

open class HostedOnboardingApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get a list of hosted onboarding page themes
     * Returns a list of hosted onboarding page themes.  &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  
     * @return OnboardingThemes
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getThemes(): HttpResponse<OnboardingThemes> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/themes",
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
     * Get an onboarding link theme
     * Returns the details of the theme identified in the path.&gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  
     * @param id The unique identifier of the theme
     * @return OnboardingTheme
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getThemesId(id: kotlin.String): HttpResponse<OnboardingTheme> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/themes/{id}".replace("{" + "id" + "}", "$id"),
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
     * Get a link to an Adyen-hosted onboarding page
     * Returns a link to an Adyen-hosted onboarding page where you need to redirect your user.  &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  
     * @param id The unique identifier of the legal entity
     * @param onboardingLinkInfo  (optional)
     * @return OnboardingLink
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postLegalEntitiesIdOnboardingLinks(id: kotlin.String, onboardingLinkInfo: OnboardingLinkInfo? = null): HttpResponse<OnboardingLink> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = onboardingLinkInfo

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/legalEntities/{id}/onboardingLinks".replace("{" + "id" + "}", "$id"),
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
