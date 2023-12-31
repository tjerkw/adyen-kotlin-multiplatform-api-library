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

import com.adyen.model.management.Name

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param email The email address of the user.
 * @param name 
 * @param username The user's email address that will be their username. Must be the same as the one in the `email` field.
 * @param accountGroups The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
 * @param associatedMerchantAccounts The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.
 * @param roles The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
 * @param timeZoneCode The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
 */
@Serializable
data class CreateCompanyUserRequest (

    /* The email address of the user. */
    @SerialName(value = "email") @Required val email: kotlin.String,

    @SerialName(value = "name") @Required val name: Name,

    /* The user's email address that will be their username. Must be the same as the one in the `email` field. */
    @SerialName(value = "username") @Required val username: kotlin.String,

    /* The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user. */
    @SerialName(value = "accountGroups") val accountGroups: kotlin.collections.List<kotlin.String>? = null,

    /* The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user. */
    @SerialName(value = "associatedMerchantAccounts") val associatedMerchantAccounts: kotlin.collections.List<kotlin.String>? = null,

    /* The list of [roles](https://docs.adyen.com/account/user-roles) for this user. */
    @SerialName(value = "roles") val roles: kotlin.collections.List<kotlin.String>? = null,

    /* The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**. */
    @SerialName(value = "timeZoneCode") val timeZoneCode: kotlin.String? = null

)

