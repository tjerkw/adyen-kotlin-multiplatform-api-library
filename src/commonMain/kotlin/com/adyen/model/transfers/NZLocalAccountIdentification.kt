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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param accountNumber The 15-16 digit bank account number. The first 2 digits are the bank number, the next 4 digits are the branch number, the next 7 digits are the account number, and the final 2-3 digits are the suffix.
 * @param type **nzLocal**
 */
@Serializable
data class NZLocalAccountIdentification (

    /* The 15-16 digit bank account number. The first 2 digits are the bank number, the next 4 digits are the branch number, the next 7 digits are the account number, and the final 2-3 digits are the suffix. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* **nzLocal** */
    @SerialName(value = "type") @Required val type: NZLocalAccountIdentification.Type = Type.NzLocal

) {

    /**
     * **nzLocal**
     *
     * Values: NzLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "nzLocal") NzLocal("nzLocal");
    }
}

