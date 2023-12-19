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

import com.adyen.model.payment.Amount
import com.adyen.model.payment.PlatformChargebackLogic
import com.adyen.model.payment.Split
import com.adyen.model.payment.ThreeDSecureData

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param merchantAccount The merchant account that is used to process the payment.
 * @param modificationAmount 
 * @param originalReference The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  
 * @param additionalData This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.
 * @param mpiData 
 * @param originalMerchantReference The original merchant reference to cancel.
 * @param platformChargebackLogic 
 * @param reference Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
 * @param splits An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).
 * @param tenderReference The transaction reference provided by the PED. For point-of-sale integrations only.
 * @param uniqueTerminalId Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.
 */
@Serializable
data class CaptureRequest (

    /* The merchant account that is used to process the payment. */
    @SerialName(value = "merchantAccount") @Required val merchantAccount: kotlin.String,

    @SerialName(value = "modificationAmount") @Required val modificationAmount: Amount,

    /* The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification   */
    @SerialName(value = "originalReference") @Required val originalReference: kotlin.String,

    /* This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value. */
    @SerialName(value = "additionalData") val additionalData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerialName(value = "mpiData") val mpiData: ThreeDSecureData? = null,

    /* The original merchant reference to cancel. */
    @SerialName(value = "originalMerchantReference") val originalMerchantReference: kotlin.String? = null,

    @SerialName(value = "platformChargebackLogic") val platformChargebackLogic: PlatformChargebackLogic? = null,

    /* Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /* An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information). */
    @SerialName(value = "splits") val splits: kotlin.collections.List<Split>? = null,

    /* The transaction reference provided by the PED. For point-of-sale integrations only. */
    @SerialName(value = "tenderReference") val tenderReference: kotlin.String? = null,

    /* Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only. */
    @SerialName(value = "uniqueTerminalId") val uniqueTerminalId: kotlin.String? = null

)
