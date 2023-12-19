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

import com.adyen.model.balanceplatform.ActiveNetworkTokensRestriction
import com.adyen.model.balanceplatform.BrandVariantsRestriction
import com.adyen.model.balanceplatform.CounterpartyBankRestriction
import com.adyen.model.balanceplatform.CountriesRestriction
import com.adyen.model.balanceplatform.DayOfWeekRestriction
import com.adyen.model.balanceplatform.DifferentCurrenciesRestriction
import com.adyen.model.balanceplatform.EntryModesRestriction
import com.adyen.model.balanceplatform.InternationalTransactionRestriction
import com.adyen.model.balanceplatform.MatchingTransactionsRestriction
import com.adyen.model.balanceplatform.MccsRestriction
import com.adyen.model.balanceplatform.MerchantNamesRestriction
import com.adyen.model.balanceplatform.MerchantsRestriction
import com.adyen.model.balanceplatform.ProcessingTypesRestriction
import com.adyen.model.balanceplatform.SameAmountRestriction
import com.adyen.model.balanceplatform.SameCounterpartyRestriction
import com.adyen.model.balanceplatform.TimeOfDayRestriction
import com.adyen.model.balanceplatform.TotalAmountRestriction

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param activeNetworkTokens 
 * @param brandVariants 
 * @param counterpartyBank 
 * @param countries 
 * @param dayOfWeek 
 * @param differentCurrencies 
 * @param entryModes 
 * @param internationalTransaction 
 * @param matchingTransactions 
 * @param mccs 
 * @param merchantNames 
 * @param merchants 
 * @param processingTypes 
 * @param sameAmountRestriction 
 * @param sameCounterpartyRestriction 
 * @param timeOfDay 
 * @param totalAmount 
 */
@Serializable
data class TransactionRuleRestrictions (

    @SerialName(value = "activeNetworkTokens") val activeNetworkTokens: ActiveNetworkTokensRestriction? = null,

    @SerialName(value = "brandVariants") val brandVariants: BrandVariantsRestriction? = null,

    @SerialName(value = "counterpartyBank") val counterpartyBank: CounterpartyBankRestriction? = null,

    @SerialName(value = "countries") val countries: CountriesRestriction? = null,

    @SerialName(value = "dayOfWeek") val dayOfWeek: DayOfWeekRestriction? = null,

    @SerialName(value = "differentCurrencies") val differentCurrencies: DifferentCurrenciesRestriction? = null,

    @SerialName(value = "entryModes") val entryModes: EntryModesRestriction? = null,

    @SerialName(value = "internationalTransaction") val internationalTransaction: InternationalTransactionRestriction? = null,

    @SerialName(value = "matchingTransactions") val matchingTransactions: MatchingTransactionsRestriction? = null,

    @SerialName(value = "mccs") val mccs: MccsRestriction? = null,

    @SerialName(value = "merchantNames") val merchantNames: MerchantNamesRestriction? = null,

    @SerialName(value = "merchants") val merchants: MerchantsRestriction? = null,

    @SerialName(value = "processingTypes") val processingTypes: ProcessingTypesRestriction? = null,

    @SerialName(value = "sameAmountRestriction") val sameAmountRestriction: SameAmountRestriction? = null,

    @SerialName(value = "sameCounterpartyRestriction") val sameCounterpartyRestriction: SameCounterpartyRestriction? = null,

    @SerialName(value = "timeOfDay") val timeOfDay: TimeOfDayRestriction? = null,

    @SerialName(value = "totalAmount") val totalAmount: TotalAmountRestriction? = null

)
