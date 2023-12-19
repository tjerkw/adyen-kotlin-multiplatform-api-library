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

import com.adyen.model.binlookup.Amount
import com.adyen.model.binlookup.CardBin

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param cardBin 
 * @param costEstimateAmount 
 * @param costEstimateReference Adyen's 16-character reference associated with the request.
 * @param resultCode The result of the cost estimation.
 * @param surchargeType Indicates the way the charges can be passed on to the cardholder. The following values are possible: * `ZERO` - the charges are not allowed to pass on * `PASSTHROUGH` - the charges can be passed on * `UNLIMITED` - there is no limit on how much surcharge is passed on
 */
@Serializable
data class CostEstimateResponse (

    @SerialName(value = "cardBin") val cardBin: CardBin? = null,

    @SerialName(value = "costEstimateAmount") val costEstimateAmount: Amount? = null,

    /* Adyen's 16-character reference associated with the request. */
    @SerialName(value = "costEstimateReference") val costEstimateReference: kotlin.String? = null,

    /* The result of the cost estimation. */
    @SerialName(value = "resultCode") val resultCode: kotlin.String? = null,

    /* Indicates the way the charges can be passed on to the cardholder. The following values are possible: * `ZERO` - the charges are not allowed to pass on * `PASSTHROUGH` - the charges can be passed on * `UNLIMITED` - there is no limit on how much surcharge is passed on */
    @SerialName(value = "surchargeType") val surchargeType: kotlin.String? = null

)

