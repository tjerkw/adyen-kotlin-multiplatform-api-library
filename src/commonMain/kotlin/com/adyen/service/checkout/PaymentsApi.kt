/**
 * Adyen Checkout API
 *
 * Adyen Checkout API provides a simple and flexible way to initiate and authorise online payments. You can use the same integration for payments made with cards (including 3D Secure), mobile wallets, and local payment methods (for example, iDEAL and Sofort).  This API reference provides information on available endpoints and how to interact with them. To learn more about the API, visit [online payments documentation](https://docs.adyen.com/online-payments).  ## Authentication Each request to Checkout API must be signed with an API key. For this, [get your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) from your Customer Area, and set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ``` ## Versioning Checkout API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://checkout-test.adyen.com/v71/payments ```  ## Going live  To access the live endpoints, you need an API key from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account, for example: ``` https://{PREFIX}-checkout-live.adyenpayments.com/checkout/v71/payments ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.  When preparing to do live transactions with Checkout API, follow the [go-live checklist](https://docs.adyen.com/online-payments/go-live-checklist) to make sure you've got all the required configuration in place.  ## Release notes Have a look at the [release notes](https://docs.adyen.com/online-payments/release-notes?integration_type=api&version=71) to find out what changed in this version!
 *
 * The version of the OpenAPI document: 71
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

package com.adyen.service.checkout

import com.adyen.model.checkout.CardDetailsRequest
import com.adyen.model.checkout.CardDetailsResponse
import com.adyen.model.checkout.CreateCheckoutSessionRequest
import com.adyen.model.checkout.CreateCheckoutSessionResponse
import com.adyen.model.checkout.DonationPaymentRequest
import com.adyen.model.checkout.DonationPaymentResponse
import com.adyen.model.checkout.PaymentDetailsRequest
import com.adyen.model.checkout.PaymentDetailsResponse
import com.adyen.model.checkout.PaymentMethodsRequest
import com.adyen.model.checkout.PaymentMethodsResponse
import com.adyen.model.checkout.PaymentRequest
import com.adyen.model.checkout.PaymentResponse
import com.adyen.model.checkout.ServiceError
import com.adyen.model.checkout.SessionResultResponse

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

open class PaymentsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get the result of a payment session
     * Returns the status of the payment session with the &#x60;sessionId&#x60; and &#x60;sessionResult&#x60; specified in the path.
     * @param sessionId A unique identifier of the session.
     * @param sessionResult The &#x60;sessionResult&#x60; value from the Drop-in or Component.
     * @return SessionResultResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getSessionsSessionId(sessionId: kotlin.String, sessionResult: kotlin.String): HttpResponse<SessionResultResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        sessionResult?.apply { localVariableQuery["sessionResult"] = listOf("$sessionResult") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/sessions/{sessionId}".replace("{" + "sessionId" + "}", "$sessionId"),
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
     * Get the list of brands on the card
     * Send a request with at least the first 6 digits of the card number to get a response with an array of brands on the card. If you include [your supported brands](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/cardDetails__reqParam_supportedBrands) in the request, the response also tells you if you support each [brand that was identified](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/cardDetails__resParam_details).  If you have an API-only integration and collect card data, use this endpoint to find out if the shopper&#39;s card is co-branded. For co-branded cards, you must let the shopper choose the brand to pay with  if you support both brands.  
     * @param idempotencyKey A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). (optional)
     * @param cardDetailsRequest  (optional)
     * @return CardDetailsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postCardDetails(idempotencyKey: kotlin.String? = null, cardDetailsRequest: CardDetailsRequest? = null): HttpResponse<CardDetailsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = cardDetailsRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        idempotencyKey?.apply { localVariableHeaders["Idempotency-Key"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/cardDetails",
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
     * Start a transaction for donations
     * Takes in the donation token generated by the &#x60;/payments&#x60; request and uses it to make the donation for the donation account specified in the request.  For more information, see [Donations](https://docs.adyen.com/online-payments/donations).
     * @param idempotencyKey A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). (optional)
     * @param donationPaymentRequest  (optional)
     * @return DonationPaymentResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postDonations(idempotencyKey: kotlin.String? = null, donationPaymentRequest: DonationPaymentRequest? = null): HttpResponse<DonationPaymentResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = donationPaymentRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        idempotencyKey?.apply { localVariableHeaders["Idempotency-Key"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/donations",
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
     * Get a list of available payment methods
     * Queries the available payment methods for a transaction based on the transaction context (like amount, country, and currency). Besides giving back a list of the available payment methods, the response also returns which input details you need to collect from the shopper (to be submitted to &#x60;/payments&#x60;).  Although we highly recommend using this endpoint to ensure you are always offering the most up-to-date list of payment methods, its usage is optional. You can, for example, also cache the &#x60;/paymentMethods&#x60; response and update it once a week.
     * @param idempotencyKey A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). (optional)
     * @param paymentMethodsRequest  (optional)
     * @return PaymentMethodsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postPaymentMethods(idempotencyKey: kotlin.String? = null, paymentMethodsRequest: PaymentMethodsRequest? = null): HttpResponse<PaymentMethodsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = paymentMethodsRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        idempotencyKey?.apply { localVariableHeaders["Idempotency-Key"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/paymentMethods",
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
     * Start a transaction
     * Sends payment parameters (like amount, country, and currency) together with other required input details collected from the shopper. To know more about required parameters for specific payment methods, refer to our [payment method guides](https://docs.adyen.com/payment-methods).  The response depends on the [payment flow](https://docs.adyen.com/payment-methods#payment-flow): * For a direct flow, the response includes a &#x60;pspReference&#x60; and a &#x60;resultCode&#x60; with the payment result, for example **Authorised** or **Refused**.  * For a redirect or additional action, the response contains an &#x60;action&#x60; object. 
     * @param idempotencyKey A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). (optional)
     * @param paymentRequest  (optional)
     * @return PaymentResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postPayments(idempotencyKey: kotlin.String? = null, paymentRequest: PaymentRequest? = null): HttpResponse<PaymentResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = paymentRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        idempotencyKey?.apply { localVariableHeaders["Idempotency-Key"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/payments",
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
     * Submit details for a payment
     * Submits details for a payment created using &#x60;/payments&#x60;. This step is only needed when no final state has been reached on the &#x60;/payments&#x60; request, for example when the shopper was redirected to another page to complete the payment.  
     * @param idempotencyKey A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). (optional)
     * @param paymentDetailsRequest  (optional)
     * @return PaymentDetailsResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postPaymentsDetails(idempotencyKey: kotlin.String? = null, paymentDetailsRequest: PaymentDetailsRequest? = null): HttpResponse<PaymentDetailsResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = paymentDetailsRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        idempotencyKey?.apply { localVariableHeaders["Idempotency-Key"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/payments/details",
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
     * Create a payment session
     * Creates a payment session for [Web Drop-in](https://docs.adyen.com/online-payments/web-drop-in) and [Web Components](https://docs.adyen.com/online-payments/web-components) integrations.  The response contains encrypted payment session data. The front end then uses the session data to make any required server-side calls for the payment flow.  You get the payment outcome asynchronously, in an [AUTHORISATION](https://docs.adyen.com/api-explorer/#/Webhooks/latest/post/AUTHORISATION) webhook.
     * @param idempotencyKey A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). (optional)
     * @param createCheckoutSessionRequest  (optional)
     * @return CreateCheckoutSessionResponse
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun postSessions(idempotencyKey: kotlin.String? = null, createCheckoutSessionRequest: CreateCheckoutSessionRequest? = null): HttpResponse<CreateCheckoutSessionResponse> {

        val localVariableAuthNames = listOf<String>("ApiKeyAuth", "BasicAuth")

        val localVariableBody = createCheckoutSessionRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        idempotencyKey?.apply { localVariableHeaders["Idempotency-Key"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/sessions",
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