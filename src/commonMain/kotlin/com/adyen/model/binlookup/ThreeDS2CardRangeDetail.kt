/**
 * Adyen BinLookup API
 *
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
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

package com.adyen.model.binlookup


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param acsInfoInd Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported)
 * @param brandCode Card brand.
 * @param endRange BIN end range.
 * @param startRange BIN start range.
 * @param threeDS2Versions Supported 3D Secure protocol versions
 * @param threeDSMethodURL In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to.
 */
@Serializable
data class ThreeDS2CardRangeDetail (

    /* Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported) */
    @SerialName(value = "acsInfoInd") val acsInfoInd: kotlin.collections.List<kotlin.String>? = null,

    /* Card brand. */
    @SerialName(value = "brandCode") val brandCode: kotlin.String? = null,

    /* BIN end range. */
    @SerialName(value = "endRange") val endRange: kotlin.String? = null,

    /* BIN start range. */
    @SerialName(value = "startRange") val startRange: kotlin.String? = null,

    /* Supported 3D Secure protocol versions */
    @SerialName(value = "threeDS2Versions") val threeDS2Versions: kotlin.collections.List<kotlin.String>? = null,

    /* In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to. */
    @SerialName(value = "threeDSMethodURL") val threeDSMethodURL: kotlin.String? = null

)

