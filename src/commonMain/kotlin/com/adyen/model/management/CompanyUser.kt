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

import com.adyen.model.management.Links
import com.adyen.model.management.Name

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param email The email address of the user.
 * @param id The unique identifier of the user.
 * @param roles The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
 * @param timeZoneCode The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
 * @param username The username for this user.
 * @param links 
 * @param accountGroups The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
 * @param active Indicates whether this user is active.
 * @param apps Set of apps available to this user
 * @param associatedMerchantAccounts The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.
 * @param name 
 */
@Serializable
data class CompanyUser (

    /* The email address of the user. */
    @SerialName(value = "email") @Required val email: kotlin.String,

    /* The unique identifier of the user. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The list of [roles](https://docs.adyen.com/account/user-roles) for this user. */
    @SerialName(value = "roles") @Required val roles: kotlin.collections.List<kotlin.String>,

    /* The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**. */
    @SerialName(value = "timeZoneCode") @Required val timeZoneCode: kotlin.String,

    /* The username for this user. */
    @SerialName(value = "username") @Required val username: kotlin.String,

    @SerialName(value = "_links") val links: Links? = null,

    /* The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user. */
    @SerialName(value = "accountGroups") val accountGroups: kotlin.collections.List<kotlin.String>? = null,

    /* Indicates whether this user is active. */
    @SerialName(value = "active") val active: kotlin.Boolean? = null,

    /* Set of apps available to this user */
    @SerialName(value = "apps") val apps: kotlin.collections.List<kotlin.String>? = null,

    /* The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user. */
    @SerialName(value = "associatedMerchantAccounts") val associatedMerchantAccounts: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "name") val name: Name? = null

)

