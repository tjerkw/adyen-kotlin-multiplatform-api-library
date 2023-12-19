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

import com.adyen.model.management.CreateCompanyWebhookRequest
import com.adyen.model.management.GenerateHmacKeyResponse
import com.adyen.model.management.ListWebhooksResponse
import com.adyen.model.management.RestServiceError
import com.adyen.model.management.TestCompanyWebhookRequest
import com.adyen.model.management.TestWebhookResponse
import com.adyen.model.management.UpdateCompanyWebhookRequest
import com.adyen.model.management.Webhook

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

open class WebhooksCompanyLevelApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Remove a webhook
     * Remove the configuration for the webhook identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write
     * @param companyId The unique identifier of the company account.
     * @param webhookId Unique identifier of the webhook configuration.
     * @return void
     */
    open suspend fun deleteCompaniesCompanyIdWebhooksWebhookId(companyId: kotlin.String, webhookId: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/companies/{companyId}/webhooks/{webhookId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "webhookId" + "}", "$webhookId"),
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
     * List all webhooks
     * Lists all webhook configurations for the company account.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read * Management API—Webhooks read and write
     * @param companyId Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account).
     * @param pageNumber The number of the page to fetch. (optional)
     * @param pageSize The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
     * @return ListWebhooksResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdWebhooks(companyId: kotlin.String, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null): HttpResponse<ListWebhooksResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        pageNumber?.apply { localVariableQuery["pageNumber"] = listOf("$pageNumber") }
        pageSize?.apply { localVariableQuery["pageSize"] = listOf("$pageSize") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/webhooks".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get a webhook
     * Returns the configuration for the webhook identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read * Management API—Webhooks read and write
     * @param companyId Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account).
     * @param webhookId Unique identifier of the webhook configuration.
     * @return Webhook
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdWebhooksWebhookId(companyId: kotlin.String, webhookId: kotlin.String): HttpResponse<Webhook> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/webhooks/{webhookId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "webhookId" + "}", "$webhookId"),
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
     * Update a webhook
     * Make changes to the configuration of the webhook identified in the path. The request contains the new values you want to have in the webhook configuration. The response contains the full configuration for the webhook, which includes the new values from the request.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write
     * @param companyId The unique identifier of the company account.
     * @param webhookId Unique identifier of the webhook configuration.
     * @param updateCompanyWebhookRequest  (optional)
     * @return Webhook
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchCompaniesCompanyIdWebhooksWebhookId(companyId: kotlin.String, webhookId: kotlin.String, updateCompanyWebhookRequest: UpdateCompanyWebhookRequest? = null): HttpResponse<Webhook> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = updateCompanyWebhookRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/companies/{companyId}/webhooks/{webhookId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "webhookId" + "}", "$webhookId"),
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
     * Set up a webhook
     * Subscribe to receive webhook notifications about events related to your company account. You can add basic authentication to make sure the data is secure.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write
     * @param companyId Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account).
     * @param createCompanyWebhookRequest  (optional)
     * @return Webhook
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdWebhooks(companyId: kotlin.String, createCompanyWebhookRequest: CreateCompanyWebhookRequest? = null): HttpResponse<Webhook> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = createCompanyWebhookRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/webhooks".replace("{" + "companyId" + "}", "$companyId"),
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
     * Generate an HMAC key
     * Returns an [HMAC key](https://en.wikipedia.org/wiki/HMAC) for the webhook identified in the path. This key allows you to check the integrity and the origin of the notifications you receive.By creating an HMAC key, you start receiving [HMAC-signed notifications](https://docs.adyen.com/development-resources/webhooks/verify-hmac-signatures#enable-hmac-signatures) from Adyen. Find out more about how to [verify HMAC signatures](https://docs.adyen.com/development-resources/webhooks/verify-hmac-signatures).  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write
     * @param companyId The unique identifier of the company account.
     * @param webhookId Unique identifier of the webhook configuration.
     * @return GenerateHmacKeyResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac(companyId: kotlin.String, webhookId: kotlin.String): HttpResponse<GenerateHmacKeyResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/webhooks/{webhookId}/generateHmac".replace("{" + "companyId" + "}", "$companyId").replace("{" + "webhookId" + "}", "$webhookId"),
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
     * Test a webhook
     * Sends sample notifications to test if the webhook is set up correctly.  We send sample notifications for maximum 20 of the merchant accounts that the webhook is configured for. If the webhook is configured for more than 20 merchant accounts, use the &#x60;merchantIds&#x60; array to specify a subset of the merchant accounts for which to send test notifications.  We send four test notifications for each event code you choose. They cover success and failure scenarios for the hard-coded currencies EUR and GBP, regardless of the currencies configured in the merchant accounts. For custom notifications, we only send the specified custom notification.  The response describes the result of the test. The &#x60;status&#x60; field tells you if the test was successful or not. You can use the other response fields to troubleshoot unsuccessful tests.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write
     * @param companyId The unique identifier of the company account.
     * @param webhookId Unique identifier of the webhook configuration.
     * @param testCompanyWebhookRequest  (optional)
     * @return TestWebhookResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdWebhooksWebhookIdTest(companyId: kotlin.String, webhookId: kotlin.String, testCompanyWebhookRequest: TestCompanyWebhookRequest? = null): HttpResponse<TestWebhookResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = testCompanyWebhookRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/webhooks/{webhookId}/test".replace("{" + "companyId" + "}", "$companyId").replace("{" + "webhookId" + "}", "$webhookId"),
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
