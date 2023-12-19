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

import com.adyen.model.management.BcmcInfo
import com.adyen.model.management.CartesBancairesInfo
import com.adyen.model.management.GenericPmWithTdiInfo

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param bcmc 
 * @param cartesBancaires 
 * @param countries The list of countries where a payment method is available. By default, all countries supported by the payment method.
 * @param cup 
 * @param currencies The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
 * @param diners 
 * @param discover 
 * @param eftposAustralia 
 * @param enabled Indicates whether the payment method is enabled (**true**) or disabled (**false**).
 * @param girocard 
 * @param ideal 
 * @param interacCard 
 * @param jcb 
 * @param maestro 
 * @param mc 
 * @param storeIds The list of stores for this payment method
 * @param visa 
 */
@Serializable
data class UpdatePaymentMethodInfo (

    @SerialName(value = "bcmc") val bcmc: BcmcInfo? = null,

    @SerialName(value = "cartesBancaires") val cartesBancaires: CartesBancairesInfo? = null,

    /* The list of countries where a payment method is available. By default, all countries supported by the payment method. */
    @SerialName(value = "countries") val countries: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "cup") val cup: GenericPmWithTdiInfo? = null,

    /* The list of currencies that a payment method supports. By default, all currencies supported by the payment method. */
    @SerialName(value = "currencies") val currencies: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "diners") val diners: GenericPmWithTdiInfo? = null,

    @SerialName(value = "discover") val discover: GenericPmWithTdiInfo? = null,

    @SerialName(value = "eftpos_australia") val eftposAustralia: GenericPmWithTdiInfo? = null,

    /* Indicates whether the payment method is enabled (**true**) or disabled (**false**). */
    @SerialName(value = "enabled") val enabled: kotlin.Boolean? = null,

    @SerialName(value = "girocard") val girocard: GenericPmWithTdiInfo? = null,

    @SerialName(value = "ideal") val ideal: GenericPmWithTdiInfo? = null,

    @SerialName(value = "interac_card") val interacCard: GenericPmWithTdiInfo? = null,

    @SerialName(value = "jcb") val jcb: GenericPmWithTdiInfo? = null,

    @SerialName(value = "maestro") val maestro: GenericPmWithTdiInfo? = null,

    @SerialName(value = "mc") val mc: GenericPmWithTdiInfo? = null,

    /* The list of stores for this payment method */
    @SerialName(value = "storeIds") val storeIds: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "visa") val visa: GenericPmWithTdiInfo? = null

)

