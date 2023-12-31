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

package com.adyen.model.management


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param status The status of the test request. Possible values are: * **success**, if `data.output`: **[accepted]** and `data.responseCode`: **200**. * **failed**, in all other cases.  You can use the value of the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.
 * @param merchantId Unique identifier of the merchant account that the notification is about.
 * @param output The response your server returned for the test webhook.  Your server must respond with **[accepted]** for the test webhook to be successful (`data.status`: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.
 * @param requestSent The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.
 * @param responseCode The HTTP response code for your server's response to the test webhook.  You can use the value of this field together with the the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.
 * @param responseTime The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.
 */
@Serializable
data class TestOutput (

    /* The status of the test request. Possible values are: * **success**, if `data.output`: **[accepted]** and `data.responseCode`: **200**. * **failed**, in all other cases.  You can use the value of the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks. */
    @SerialName(value = "status") @Required val status: kotlin.String,

    /* Unique identifier of the merchant account that the notification is about. */
    @SerialName(value = "merchantId") val merchantId: kotlin.String? = null,

    /* The response your server returned for the test webhook.  Your server must respond with **[accepted]** for the test webhook to be successful (`data.status`: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks. */
    @SerialName(value = "output") val output: kotlin.String? = null,

    /* The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server. */
    @SerialName(value = "requestSent") val requestSent: kotlin.String? = null,

    /* The HTTP response code for your server's response to the test webhook.  You can use the value of this field together with the the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks. */
    @SerialName(value = "responseCode") val responseCode: kotlin.String? = null,

    /* The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**. */
    @SerialName(value = "responseTime") val responseTime: kotlin.String? = null

)

