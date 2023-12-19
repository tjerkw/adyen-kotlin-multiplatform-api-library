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

import com.adyen.model.balanceplatform.AULocalAccountIdentification
import com.adyen.model.balanceplatform.AdditionalBankIdentification
import com.adyen.model.balanceplatform.BRLocalAccountIdentification
import com.adyen.model.balanceplatform.CALocalAccountIdentification
import com.adyen.model.balanceplatform.CZLocalAccountIdentification
import com.adyen.model.balanceplatform.DKLocalAccountIdentification
import com.adyen.model.balanceplatform.HKLocalAccountIdentification
import com.adyen.model.balanceplatform.HULocalAccountIdentification
import com.adyen.model.balanceplatform.IbanAccountIdentification
import com.adyen.model.balanceplatform.NOLocalAccountIdentification
import com.adyen.model.balanceplatform.NZLocalAccountIdentification
import com.adyen.model.balanceplatform.NumberAndBicAccountIdentification
import com.adyen.model.balanceplatform.PLLocalAccountIdentification
import com.adyen.model.balanceplatform.SELocalAccountIdentification
import com.adyen.model.balanceplatform.SGLocalAccountIdentification
import com.adyen.model.balanceplatform.UKLocalAccountIdentification
import com.adyen.model.balanceplatform.USLocalAccountIdentification

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Bank account identification.
 *
 * @param accountNumber The bank account number, without separators or whitespace.
 * @param bsbCode The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.
 * @param type **usLocal**
 * @param bankCode The 4-digit bank code (Registreringsnummer) (without separators or whitespace).
 * @param branchNumber The bank account branch number, without separators or whitespace.
 * @param institutionNumber The 3-digit institution number, without separators or whitespace.
 * @param transitNumber The 5-digit transit number, without separators or whitespace.
 * @param clearingCode The 3-digit clearing code, without separators or whitespace.
 * @param iban The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.
 * @param bic The bank's 8- or 11-character BIC or SWIFT code.
 * @param clearingNumber The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace.
 * @param sortCode The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace.
 * @param routingNumber The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace.
 * @param accountType The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
 * @param additionalBankIdentification 
 */
@Serializable
data class BankAccountIdentificationValidationRequestAccountIdentification (

    /* The bank account number, without separators or whitespace. */
    @SerialName(value = "accountNumber") @Required val accountNumber: kotlin.String,

    /* The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace. */
    @SerialName(value = "bsbCode") @Required val bsbCode: kotlin.String,

    /* **usLocal** */
    @SerialName(value = "type") @Required val type: BankAccountIdentificationValidationRequestAccountIdentification.Type = Type.UsLocal,

    /* The 4-digit bank code (Registreringsnummer) (without separators or whitespace). */
    @SerialName(value = "bankCode") @Required val bankCode: kotlin.String,

    /* The bank account branch number, without separators or whitespace. */
    @SerialName(value = "branchNumber") @Required val branchNumber: kotlin.String,

    /* The 3-digit institution number, without separators or whitespace. */
    @SerialName(value = "institutionNumber") @Required val institutionNumber: kotlin.String,

    /* The 5-digit transit number, without separators or whitespace. */
    @SerialName(value = "transitNumber") @Required val transitNumber: kotlin.String,

    /* The 3-digit clearing code, without separators or whitespace. */
    @SerialName(value = "clearingCode") @Required val clearingCode: kotlin.String,

    /* The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. */
    @SerialName(value = "iban") @Required val iban: kotlin.String,

    /* The bank's 8- or 11-character BIC or SWIFT code. */
    @SerialName(value = "bic") @Required val bic: kotlin.String,

    /* The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace. */
    @SerialName(value = "clearingNumber") @Required val clearingNumber: kotlin.String,

    /* The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace. */
    @SerialName(value = "sortCode") @Required val sortCode: kotlin.String,

    /* The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. */
    @SerialName(value = "routingNumber") @Required val routingNumber: kotlin.String,

    /* The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. */
    @SerialName(value = "accountType") val accountType: BankAccountIdentificationValidationRequestAccountIdentification.AccountType? = AccountType.Checking,

    @SerialName(value = "additionalBankIdentification") val additionalBankIdentification: AdditionalBankIdentification? = null

) {

    /**
     * **usLocal**
     *
     * Values: UsLocal
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "usLocal") UsLocal("usLocal");
    }
    /**
     * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
     *
     * Values: Checking,Savings
     */
    @Serializable
    enum class AccountType(val value: kotlin.String) {
        @SerialName(value = "checking") Checking("checking"),
        @SerialName(value = "savings") Savings("savings");
    }
}
