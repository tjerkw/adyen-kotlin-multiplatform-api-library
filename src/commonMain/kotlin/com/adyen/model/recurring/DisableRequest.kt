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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param merchantAccount The merchant account identifier with which you want to process the transaction.
 * @param shopperReference The ID that uniquely identifies the shopper.  This `shopperReference` must be the same as the `shopperReference` used in the initial payment.
 * @param contract Specify the contract if you only want to disable a specific use.  This field can be set to one of the following values, or to their combination (comma-separated): * ONECLICK * RECURRING * PAYOUT
 * @param recurringDetailReference The ID that uniquely identifies the recurring detail reference.  If it is not provided, the whole recurring contract of the `shopperReference` will be disabled, which includes all recurring details.
 */
@Serializable
data class DisableRequest (

    /* The merchant account identifier with which you want to process the transaction. */
    @SerialName(value = "merchantAccount") @Required val merchantAccount: kotlin.String,

    /* The ID that uniquely identifies the shopper.  This `shopperReference` must be the same as the `shopperReference` used in the initial payment. */
    @SerialName(value = "shopperReference") @Required val shopperReference: kotlin.String,

    /* Specify the contract if you only want to disable a specific use.  This field can be set to one of the following values, or to their combination (comma-separated): * ONECLICK * RECURRING * PAYOUT */
    @SerialName(value = "contract") val contract: kotlin.String? = null,

    /* The ID that uniquely identifies the recurring detail reference.  If it is not provided, the whole recurring contract of the `shopperReference` will be disabled, which includes all recurring details. */
    @SerialName(value = "recurringDetailReference") val recurringDetailReference: kotlin.String? = null

)

