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

import com.adyen.model.management.BillingEntitiesResponse
import com.adyen.model.management.RestServiceError
import com.adyen.model.management.ShippingLocation
import com.adyen.model.management.ShippingLocationsResponse
import com.adyen.model.management.TerminalModelsResponse
import com.adyen.model.management.TerminalOrder
import com.adyen.model.management.TerminalOrderRequest
import com.adyen.model.management.TerminalOrdersResponse
import com.adyen.model.management.TerminalProductsResponse

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

open class TerminalOrdersCompanyLevelApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get a list of billing entities
     * Returns the billing entities of the company identified in the path and all merchant accounts belonging to the company. A billing entity is a legal entity where we charge orders to. An order for terminal products must contain the ID of a billing entity.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param name The name of the billing entity. (optional)
     * @return BillingEntitiesResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdBillingEntities(companyId: kotlin.String, name: kotlin.String? = null): HttpResponse<BillingEntitiesResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        name?.apply { localVariableQuery["name"] = listOf("$name") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/billingEntities".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get a list of shipping locations
     * Returns the shipping locations for the company identified in the path and all merchant accounts belonging to the company. A shipping location includes the address where orders can be delivered, and an ID which you need to specify when ordering terminal products.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param name The name of the shipping location. (optional)
     * @param offset The number of locations to skip. (optional)
     * @param limit The number of locations to return. (optional)
     * @return ShippingLocationsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdShippingLocations(companyId: kotlin.String, name: kotlin.String? = null, offset: kotlin.Int? = null, limit: kotlin.Int? = null): HttpResponse<ShippingLocationsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        name?.apply { localVariableQuery["name"] = listOf("$name") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        limit?.apply { localVariableQuery["limit"] = listOf("$limit") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/shippingLocations".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get a list of terminal models
     * Returns a list of payment terminal models that the company identified in the path has access to. The response includes the terminal model ID, which can be used as a query parameter when getting a list of terminals or a list of products for ordering.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @return TerminalModelsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdTerminalModels(companyId: kotlin.String): HttpResponse<TerminalModelsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/terminalModels".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get a list of orders
     * Returns a lists of terminal products orders for the company identified in the path. To filter the list, use one or more of the query parameters.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param customerOrderReference Your purchase order number. (optional)
     * @param status The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered. (optional)
     * @param offset The number of orders to skip. (optional)
     * @param limit The number of orders to return. (optional)
     * @return TerminalOrdersResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdTerminalOrders(companyId: kotlin.String, customerOrderReference: kotlin.String? = null, status: kotlin.String? = null, offset: kotlin.Int? = null, limit: kotlin.Int? = null): HttpResponse<TerminalOrdersResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        customerOrderReference?.apply { localVariableQuery["customerOrderReference"] = listOf("$customerOrderReference") }
        status?.apply { localVariableQuery["status"] = listOf("$status") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        limit?.apply { localVariableQuery["limit"] = listOf("$limit") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/terminalOrders".replace("{" + "companyId" + "}", "$companyId"),
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
     * Get an order
     * Returns the details of the terminal products order identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param orderId The unique identifier of the order.
     * @return TerminalOrder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdTerminalOrdersOrderId(companyId: kotlin.String, orderId: kotlin.String): HttpResponse<TerminalOrder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/terminalOrders/{orderId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "orderId" + "}", "$orderId"),
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
     * Get a list of terminal products
     * Returns a country-specific list of payment terminal packages and parts that the company identified in the path has access to.   To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param country The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US**
     * @param terminalModelId The terminal model to return products for. Use the ID returned in the [GET &#x60;/terminalModels&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) response. For example, **Verifone.M400** (optional)
     * @param offset The number of products to skip. (optional)
     * @param limit The number of products to return. (optional)
     * @return TerminalProductsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getCompaniesCompanyIdTerminalProducts(companyId: kotlin.String, country: kotlin.String, terminalModelId: kotlin.String? = null, offset: kotlin.Int? = null, limit: kotlin.Int? = null): HttpResponse<TerminalProductsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        country?.apply { localVariableQuery["country"] = listOf("$country") }
        terminalModelId?.apply { localVariableQuery["terminalModelId"] = listOf("$terminalModelId") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        limit?.apply { localVariableQuery["limit"] = listOf("$limit") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/companies/{companyId}/terminalProducts".replace("{" + "companyId" + "}", "$companyId"),
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
     * Update an order
     * Updates the terminal products order identified in the path. Updating is only possible while the order has the status **Placed**.  The request body only needs to contain what you want to change.  However, to update the products in the &#x60;items&#x60; array, you must provide the entire array. For example, if the array has three items:  To remove one item, the array must include the remaining two items. Or to add one item, the array must include all four items.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param orderId The unique identifier of the order.
     * @param terminalOrderRequest  (optional)
     * @return TerminalOrder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun patchCompaniesCompanyIdTerminalOrdersOrderId(companyId: kotlin.String, orderId: kotlin.String, terminalOrderRequest: TerminalOrderRequest? = null): HttpResponse<TerminalOrder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = terminalOrderRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/companies/{companyId}/terminalOrders/{orderId}".replace("{" + "companyId" + "}", "$companyId").replace("{" + "orderId" + "}", "$orderId"),
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
     * Create a shipping location
     * Creates a shipping location for the company identified in the path. A shipping location defines an address where orders can be delivered.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param shippingLocation  (optional)
     * @return ShippingLocation
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdShippingLocations(companyId: kotlin.String, shippingLocation: ShippingLocation? = null): HttpResponse<ShippingLocation> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = shippingLocation

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/shippingLocations".replace("{" + "companyId" + "}", "$companyId"),
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
     * Create an order
     * Creates an order for payment terminal products for the company identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write &gt;Requests to the Management API test endpoint do not create actual orders for test terminals. To order test terminals, you need to [submit a sales order](https://docs.adyen.com/point-of-sale/managing-terminals/order-terminals/#sales-order-steps) in your Customer Area.
     * @param companyId The unique identifier of the company account.
     * @param terminalOrderRequest  (optional)
     * @return TerminalOrder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdTerminalOrders(companyId: kotlin.String, terminalOrderRequest: TerminalOrderRequest? = null): HttpResponse<TerminalOrder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = terminalOrderRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/terminalOrders".replace("{" + "companyId" + "}", "$companyId"),
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
     * Cancel an order
     * Cancels the terminal products order identified in the path. Cancelling is only possible while the order has the status **Placed**. To cancel an order, make a POST call without a request body. The response returns the full order details, but with the status changed to **Cancelled**.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write
     * @param companyId The unique identifier of the company account.
     * @param orderId The unique identifier of the order.
     * @return TerminalOrder
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCompaniesCompanyIdTerminalOrdersOrderIdCancel(companyId: kotlin.String, orderId: kotlin.String): HttpResponse<TerminalOrder> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/companies/{companyId}/terminalOrders/{orderId}/cancel".replace("{" + "companyId" + "}", "$companyId").replace("{" + "orderId" + "}", "$orderId"),
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
