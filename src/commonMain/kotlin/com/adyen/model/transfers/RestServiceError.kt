/**
 * Transfers API
 *
 * >Versions 1 and 2 of the Transfers API are deprecated. If you are just starting your implementation, use the latest version.  This API provides endpoints that you can use to transfer funds, whether when [paying out to a transfer instrument](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/on-demand-payouts), [sending funds to third parties](https://docs.adyen.com/marketplaces-and-platforms/business-accounts/send-receive-funds) for users with business bank accounts, or to [request a payout for a grant offer](https://docs.adyen.com/marketplaces-and-platforms/capital). The API also supports use cases for [getting transactions for business bank accounts](https://docs.adyen.com/marketplaces-and-platforms/business-accounts/transactions-api) and getting [grants and its outstanding balances](https://docs.adyen.com/marketplaces-and-platforms/capital#get-balances). .  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Roles and permissions To use the Transfers API, you need an additional role for your API credential. Transfers must also be enabled for the source balance account. Your Adyen contact will set up the roles and permissions for you. ## Versioning The Transfers API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/btl/v4/transfers ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://balanceplatform-api-live.adyen.com/btl/v4`.  
 *
 * The version of the OpenAPI document: 4
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

package com.adyen.model.transfers

import com.adyen.model.transfers.InvalidField

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param detail A human-readable explanation specific to this occurrence of the problem.
 * @param errorCode A code that identifies the problem type.
 * @param status The HTTP status code.
 * @param title A short, human-readable summary of the problem type.
 * @param type A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
 * @param instance A unique URI that identifies the specific occurrence of the problem.
 * @param invalidFields Detailed explanation of each validation error, when applicable.
 * @param requestId A unique reference for the request, essentially the same as `pspReference`.
 * @param response JSON response payload.
 */
@Serializable
data class RestServiceError (

    /* A human-readable explanation specific to this occurrence of the problem. */
    @SerialName(value = "detail") @Required val detail: kotlin.String,

    /* A code that identifies the problem type. */
    @SerialName(value = "errorCode") @Required val errorCode: kotlin.String,

    /* The HTTP status code. */
    @SerialName(value = "status") @Required val status: kotlin.Int,

    /* A short, human-readable summary of the problem type. */
    @SerialName(value = "title") @Required val title: kotlin.String,

    /* A URI that identifies the problem type, pointing to human-readable documentation on this problem type. */
    @SerialName(value = "type") @Required val type: kotlin.String,

    /* A unique URI that identifies the specific occurrence of the problem. */
    @SerialName(value = "instance") val instance: kotlin.String? = null,

    /* Detailed explanation of each validation error, when applicable. */
    @SerialName(value = "invalidFields") val invalidFields: kotlin.collections.List<InvalidField>? = null,

    /* A unique reference for the request, essentially the same as `pspReference`. */
    @SerialName(value = "requestId") val requestId: kotlin.String? = null,

    /* JSON response payload. */
    @SerialName(value = "response") val response: kotlin.String? = null

)
