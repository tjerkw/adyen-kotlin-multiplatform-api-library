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

import com.adyen.model.management.TerminalConnectivityBluetooth
import com.adyen.model.management.TerminalConnectivityCellular
import com.adyen.model.management.TerminalConnectivityEthernet
import com.adyen.model.management.TerminalConnectivityWifi

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param bluetooth 
 * @param cellular 
 * @param ethernet 
 * @param wifi 
 */
@Serializable
data class TerminalConnectivity (

    @SerialName(value = "bluetooth") val bluetooth: TerminalConnectivityBluetooth? = null,

    @SerialName(value = "cellular") val cellular: TerminalConnectivityCellular? = null,

    @SerialName(value = "ethernet") val ethernet: TerminalConnectivityEthernet? = null,

    @SerialName(value = "wifi") val wifi: TerminalConnectivityWifi? = null

)
