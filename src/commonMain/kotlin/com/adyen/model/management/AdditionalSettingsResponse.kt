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
 * @param excludeEventCodes Object containing list of event codes for which the notifcation will not be sent. 
 * @param includeEventCodes Object containing list of event codes for which the notifcation will be sent. 
 * @param properties Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, `captureDelayHours`: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.
 */
@Serializable
data class AdditionalSettingsResponse (

    /* Object containing list of event codes for which the notifcation will not be sent.  */
    @SerialName(value = "excludeEventCodes") val excludeEventCodes: kotlin.collections.List<kotlin.String>? = null,

    /* Object containing list of event codes for which the notifcation will be sent.  */
    @SerialName(value = "includeEventCodes") val includeEventCodes: kotlin.collections.List<kotlin.String>? = null,

    /* Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, `captureDelayHours`: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured. */
    @SerialName(value = "properties") val properties: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null

)

