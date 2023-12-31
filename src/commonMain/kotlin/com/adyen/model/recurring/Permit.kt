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

package com.adyen.model.recurring

import com.adyen.model.recurring.PermitRestriction

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param partnerId Partner ID (when using the permit-per-partner token sharing model).
 * @param profileReference The profile to apply to this permit (when using the shared permits model).
 * @param restriction 
 * @param resultKey The key to link permit requests to permit results.
 * @param validTillDate The expiry date for this permit.
 */
@Serializable
data class Permit (

    /* Partner ID (when using the permit-per-partner token sharing model). */
    @SerialName(value = "partnerId") val partnerId: kotlin.String? = null,

    /* The profile to apply to this permit (when using the shared permits model). */
    @SerialName(value = "profileReference") val profileReference: kotlin.String? = null,

    @SerialName(value = "restriction") val restriction: PermitRestriction? = null,

    /* The key to link permit requests to permit results. */
    @SerialName(value = "resultKey") val resultKey: kotlin.String? = null,

    /* The expiry date for this permit. */
    @SerialName(value = "validTillDate") val validTillDate: kotlin.String? = null

)

