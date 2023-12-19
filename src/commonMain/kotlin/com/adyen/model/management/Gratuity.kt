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
 * @param allowCustomAmount Indicates whether one of the predefined tipping options is to let the shopper enter a custom tip. If **true**, only three of the other options defined in `predefinedTipEntries` are shown.
 * @param currency The currency that the tipping settings apply to.
 * @param predefinedTipEntries Tipping options the shopper can choose from if `usePredefinedTipEntries` is **true**. The maximum number of predefined options is four, or three plus the option to enter a custom tip. The options can be a mix of:  - A percentage of the transaction amount. Example: **5%** - A tip amount in [minor units](https://docs.adyen.com/development-resources/currency-codes). Example: **500** for a EUR 5 tip.
 * @param usePredefinedTipEntries Indicates whether the terminal shows a prompt to enter a tip (**false**), or predefined tipping options to choose from (**true**).
 */
@Serializable
data class Gratuity (

    /* Indicates whether one of the predefined tipping options is to let the shopper enter a custom tip. If **true**, only three of the other options defined in `predefinedTipEntries` are shown. */
    @SerialName(value = "allowCustomAmount") val allowCustomAmount: kotlin.Boolean? = null,

    /* The currency that the tipping settings apply to. */
    @SerialName(value = "currency") val currency: kotlin.String? = null,

    /* Tipping options the shopper can choose from if `usePredefinedTipEntries` is **true**. The maximum number of predefined options is four, or three plus the option to enter a custom tip. The options can be a mix of:  - A percentage of the transaction amount. Example: **5%** - A tip amount in [minor units](https://docs.adyen.com/development-resources/currency-codes). Example: **500** for a EUR 5 tip. */
    @SerialName(value = "predefinedTipEntries") val predefinedTipEntries: kotlin.collections.List<kotlin.String>? = null,

    /* Indicates whether the terminal shows a prompt to enter a tip (**false**), or predefined tipping options to choose from (**true**). */
    @SerialName(value = "usePredefinedTipEntries") val usePredefinedTipEntries: kotlin.Boolean? = null

)

