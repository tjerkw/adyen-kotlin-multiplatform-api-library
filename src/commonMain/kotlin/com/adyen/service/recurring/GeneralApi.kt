/**
 * Adyen Recurring API
 *
 * The Recurring APIs allow you to manage and remove your tokens or saved payment details. Tokens should be created with validation during a payment request.  For more information, refer to our [Tokenization documentation](https://docs.adyen.com/online-payments/tokenization). ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Recurring API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Recurring/v68/disable ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Recurring/v68/disable ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
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

package com.adyen.service.recurring

import com.adyen.model.recurring.CreatePermitRequest
import com.adyen.model.recurring.CreatePermitResult
import com.adyen.model.recurring.DisablePermitRequest
import com.adyen.model.recurring.DisablePermitResult
import com.adyen.model.recurring.DisableRequest
import com.adyen.model.recurring.DisableResult
import com.adyen.model.recurring.NotifyShopperRequest
import com.adyen.model.recurring.NotifyShopperResult
import com.adyen.model.recurring.RecurringDetailsRequest
import com.adyen.model.recurring.RecurringDetailsResult
import com.adyen.model.recurring.ScheduleAccountUpdaterRequest
import com.adyen.model.recurring.ScheduleAccountUpdaterResult
import com.adyen.model.recurring.ServiceError

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
     * Create new permits linked to a recurring contract.
     * Create permits for a recurring contract, including support for defining restrictions.
     * @param createPermitRequest  (optional)
     * @return CreatePermitResult
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCreatePermit(createPermitRequest: CreatePermitRequest? = null): HttpResponse<CreatePermitResult> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = createPermitRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/createPermit",
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
     * Disable stored payment details
     * Disables stored payment details to stop charging a shopper with this particular recurring detail ID.  For more information, refer to [Disable stored details](https://docs.adyen.com/classic-integration/recurring-payments/disable-stored-details/).
     * @param disableRequest  (optional)
     * @return DisableResult
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postDisable(disableRequest: DisableRequest? = null): HttpResponse<DisableResult> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = disableRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/disable",
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
     * Disable an existing permit.
     * Disable a permit that was previously linked to a recurringDetailReference.
     * @param disablePermitRequest  (optional)
     * @return DisablePermitResult
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postDisablePermit(disablePermitRequest: DisablePermitRequest? = null): HttpResponse<DisablePermitResult> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = disablePermitRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/disablePermit",
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
     * Get stored payment details
     * Lists the stored payment details for a shopper, if there are any available. The recurring detail ID can be used with a regular authorisation request to charge the shopper. A summary of the payment detail is returned for presentation to the shopper.  For more information, refer to [Retrieve stored details](https://docs.adyen.com/classic-integration/recurring-payments/retrieve-stored-details/).
     * @param recurringDetailsRequest  (optional)
     * @return RecurringDetailsResult
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postListRecurringDetails(recurringDetailsRequest: RecurringDetailsRequest? = null): HttpResponse<RecurringDetailsResult> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = recurringDetailsRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/listRecurringDetails",
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
     * Ask issuer to notify the shopper
     * Sends a request to the issuer so they can inform the shopper about the upcoming recurring payment. This endpoint is used only for local acquiring in India. For more information, refer to [Recurring card payments in India](https://docs.adyen.com/payment-methods/cards/cards-recurring-india).
     * @param notifyShopperRequest  (optional)
     * @return NotifyShopperResult
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postNotifyShopper(notifyShopperRequest: NotifyShopperRequest? = null): HttpResponse<NotifyShopperResult> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = notifyShopperRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/notifyShopper",
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
     * Schedule running the Account Updater
     * When making the API call, you can submit either the credit card information, or the recurring detail reference and the shopper reference: * If the card information is provided, all the sub-fields for &#x60;card&#x60; are mandatory. * If the recurring detail reference is provided, the fields for &#x60;shopperReference&#x60; and &#x60;selectedRecurringDetailReference&#x60; are mandatory.
     * @param scheduleAccountUpdaterRequest  (optional)
     * @return ScheduleAccountUpdaterResult
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postScheduleAccountUpdater(scheduleAccountUpdaterRequest: ScheduleAccountUpdaterRequest? = null): HttpResponse<ScheduleAccountUpdaterResult> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = scheduleAccountUpdaterRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/scheduleAccountUpdater",
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
