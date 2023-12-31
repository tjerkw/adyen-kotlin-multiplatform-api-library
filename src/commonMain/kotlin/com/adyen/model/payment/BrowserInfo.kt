/**
 * Adyen Payment API
 *
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
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

package com.adyen.model.payment


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param acceptHeader The accept header value of the shopper's browser.
 * @param colorDepth The color depth of the shopper's browser in bits per pixel. This should be obtained by using the browser's `screen.colorDepth` property. Accepted values: 1, 4, 8, 15, 16, 24, 30, 32 or 48 bit color depth.
 * @param javaEnabled Boolean value indicating if the shopper's browser is able to execute Java.
 * @param language The `navigator.language` value of the shopper's browser (as defined in IETF BCP 47).
 * @param screenHeight The total height of the shopper's device screen in pixels.
 * @param screenWidth The total width of the shopper's device screen in pixels.
 * @param timeZoneOffset Time difference between UTC time and the shopper's browser local time, in minutes.
 * @param userAgent The user agent value of the shopper's browser.
 * @param javaScriptEnabled Boolean value indicating if the shopper's browser is able to execute JavaScript. A default 'true' value is assumed if the field is not present.
 */
@Serializable
data class BrowserInfo (

    /* The accept header value of the shopper's browser. */
    @SerialName(value = "acceptHeader") @Required val acceptHeader: kotlin.String,

    /* The color depth of the shopper's browser in bits per pixel. This should be obtained by using the browser's `screen.colorDepth` property. Accepted values: 1, 4, 8, 15, 16, 24, 30, 32 or 48 bit color depth. */
    @SerialName(value = "colorDepth") @Required val colorDepth: kotlin.Int,

    /* Boolean value indicating if the shopper's browser is able to execute Java. */
    @SerialName(value = "javaEnabled") @Required val javaEnabled: kotlin.Boolean,

    /* The `navigator.language` value of the shopper's browser (as defined in IETF BCP 47). */
    @SerialName(value = "language") @Required val language: kotlin.String,

    /* The total height of the shopper's device screen in pixels. */
    @SerialName(value = "screenHeight") @Required val screenHeight: kotlin.Int,

    /* The total width of the shopper's device screen in pixels. */
    @SerialName(value = "screenWidth") @Required val screenWidth: kotlin.Int,

    /* Time difference between UTC time and the shopper's browser local time, in minutes. */
    @SerialName(value = "timeZoneOffset") @Required val timeZoneOffset: kotlin.Int,

    /* The user agent value of the shopper's browser. */
    @SerialName(value = "userAgent") @Required val userAgent: kotlin.String,

    /* Boolean value indicating if the shopper's browser is able to execute JavaScript. A default 'true' value is assumed if the field is not present. */
    @SerialName(value = "javaScriptEnabled") val javaScriptEnabled: kotlin.Boolean? = true

)

