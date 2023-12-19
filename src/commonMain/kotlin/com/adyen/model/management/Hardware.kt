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
 * @param displayMaximumBackLight The brightness of the display when the terminal is being used, expressed as a percentage.
 * @param restartHour The hour of the day when the terminal is set to reboot to apply the configuration and software updates. By default, the restart hour is at 6:00 AM in the timezone of the terminal Minimum vaoue: 0, maximum value: 23.
 */
@Serializable
data class Hardware (

    /* The brightness of the display when the terminal is being used, expressed as a percentage. */
    @SerialName(value = "displayMaximumBackLight") val displayMaximumBackLight: kotlin.Int? = null,

    /* The hour of the day when the terminal is set to reboot to apply the configuration and software updates. By default, the restart hour is at 6:00 AM in the timezone of the terminal Minimum vaoue: 0, maximum value: 23. */
    @SerialName(value = "restartHour") val restartHour: kotlin.Int? = null

)

