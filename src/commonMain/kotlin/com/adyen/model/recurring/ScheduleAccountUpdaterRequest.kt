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

import com.adyen.model.recurring.Card

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param merchantAccount Account of the merchant.
 * @param reference A reference that merchants can apply for the call.
 * @param additionalData This field contains additional data, which may be required for a particular request.
 * @param card 
 * @param selectedRecurringDetailReference The selected detail recurring reference.  Optional if `card` is provided.
 * @param shopperReference The reference of the shopper that owns the recurring contract.  Optional if `card` is provided.
 */
@Serializable
data class ScheduleAccountUpdaterRequest (

    /* Account of the merchant. */
    @SerialName(value = "merchantAccount") @Required val merchantAccount: kotlin.String,

    /* A reference that merchants can apply for the call. */
    @SerialName(value = "reference") @Required val reference: kotlin.String,

    /* This field contains additional data, which may be required for a particular request. */
    @SerialName(value = "additionalData") val additionalData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerialName(value = "card") val card: Card? = null,

    /* The selected detail recurring reference.  Optional if `card` is provided. */
    @SerialName(value = "selectedRecurringDetailReference") val selectedRecurringDetailReference: kotlin.String? = null,

    /* The reference of the shopper that owns the recurring contract.  Optional if `card` is provided. */
    @SerialName(value = "shopperReference") val shopperReference: kotlin.String? = null

)
