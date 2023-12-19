/**
 * Configuration API
 *
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v2/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v2`.
 *
 * The version of the OpenAPI document: 2
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

package com.adyen.model.balanceplatform

import com.adyen.model.balanceplatform.AccountHolderCapability
import com.adyen.model.balanceplatform.ContactDetails
import com.adyen.model.balanceplatform.VerificationDeadline

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id The unique identifier of the account holder.
 * @param legalEntityId The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder.
 * @param balancePlatform The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms.
 * @param capabilities Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability.
 * @param contactDetails 
 * @param description Your description for the account holder, maximum 300 characters.
 * @param metadata A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. > Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
 * @param migratedAccountHolderCode The unique identifier of the migrated account holder in the classic integration.
 * @param primaryBalanceAccount The ID of the account holder's primary balance account. By default, this is set to the first balance account that you create for the account holder. To assign a different balance account, send a PATCH request.
 * @param reference Your reference for the account holder, maximum 150 characters.
 * @param status The status of the account holder.  Possible values:    * **active**: The account holder is active. This is the default status when creating an account holder.    * **inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **closed**: The account holder is permanently deactivated by you. This action cannot be undone.
 * @param timeZone The time zone of the account holder. For example, **Europe/Amsterdam**. Defaults to the time zone of the balance platform if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
 * @param verificationDeadlines List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved.
 */
@Serializable
data class AccountHolder (

    /* The unique identifier of the account holder. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder. */
    @SerialName(value = "legalEntityId") @Required val legalEntityId: kotlin.String,

    /* The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms. */
    @SerialName(value = "balancePlatform") val balancePlatform: kotlin.String? = null,

    /* Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability. */
    @SerialName(value = "capabilities") val capabilities: kotlin.collections.Map<kotlin.String, AccountHolderCapability>? = null,

    @SerialName(value = "contactDetails") val contactDetails: ContactDetails? = null,

    /* Your description for the account holder, maximum 300 characters. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. > Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs. */
    @SerialName(value = "metadata") val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* The unique identifier of the migrated account holder in the classic integration. */
    @SerialName(value = "migratedAccountHolderCode") val migratedAccountHolderCode: kotlin.String? = null,

    /* The ID of the account holder's primary balance account. By default, this is set to the first balance account that you create for the account holder. To assign a different balance account, send a PATCH request. */
    @SerialName(value = "primaryBalanceAccount") val primaryBalanceAccount: kotlin.String? = null,

    /* Your reference for the account holder, maximum 150 characters. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /* The status of the account holder.  Possible values:    * **active**: The account holder is active. This is the default status when creating an account holder.    * **inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **closed**: The account holder is permanently deactivated by you. This action cannot be undone. */
    @SerialName(value = "status") val status: AccountHolder.Status? = null,

    /* The time zone of the account holder. For example, **Europe/Amsterdam**. Defaults to the time zone of the balance platform if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). */
    @SerialName(value = "timeZone") val timeZone: kotlin.String? = null,

    /* List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved. */
    @SerialName(value = "verificationDeadlines") val verificationDeadlines: kotlin.collections.List<VerificationDeadline>? = null

) {

    /**
     * The status of the account holder.  Possible values:    * **active**: The account holder is active. This is the default status when creating an account holder.    * **inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **closed**: The account holder is permanently deactivated by you. This action cannot be undone.
     *
     * Values: Active,Closed,Inactive,Suspended
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "active") Active("active"),
        @SerialName(value = "closed") Closed("closed"),
        @SerialName(value = "inactive") Inactive("inactive"),
        @SerialName(value = "suspended") Suspended("suspended");
    }
}

