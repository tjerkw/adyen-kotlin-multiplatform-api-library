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

import com.adyen.model.balanceplatform.Amount
import com.adyen.model.balanceplatform.Fee
import com.adyen.model.balanceplatform.Repayment

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param accountHolderId The identifier of the account holder to which the grant is offered.
 * @param amount 
 * @param contractType The contract type of the grant offer. Possible value: **cashAdvance**, **loan**.
 * @param expiresAt 
 * @param fee 
 * @param id The unique identifier of the grant offer.
 * @param repayment 
 * @param startsAt 
 */
@Serializable
data class GrantOffer (

    /* The identifier of the account holder to which the grant is offered. */
    @SerialName(value = "accountHolderId") @Required val accountHolderId: kotlin.String,

    @SerialName(value = "amount") val amount: Amount? = null,

    /* The contract type of the grant offer. Possible value: **cashAdvance**, **loan**. */
    @SerialName(value = "contractType") val contractType: GrantOffer.ContractType? = null,

    @SerialName(value = "expiresAt") val expiresAt: kotlin.String? = null,

    @SerialName(value = "fee") val fee: Fee? = null,

    /* The unique identifier of the grant offer. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "repayment") val repayment: Repayment? = null,

    @SerialName(value = "startsAt") val startsAt: kotlin.String? = null

) {

    /**
     * The contract type of the grant offer. Possible value: **cashAdvance**, **loan**.
     *
     * Values: CashAdvance,Loan
     */
    @Serializable
    enum class ContractType(val value: kotlin.String) {
        @SerialName(value = "cashAdvance") CashAdvance("cashAdvance"),
        @SerialName(value = "loan") Loan("loan");
    }
}

