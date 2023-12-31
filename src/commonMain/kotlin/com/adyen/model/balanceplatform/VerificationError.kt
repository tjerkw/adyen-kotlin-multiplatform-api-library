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

import com.adyen.model.balanceplatform.RemediatingAction
import com.adyen.model.balanceplatform.VerificationErrorMinusRecursive

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param capabilities Contains the capabilities that the verification error applies to.
 * @param code The verification error code.
 * @param message A description of the error.
 * @param remediatingActions Contains the actions that you can take to resolve the verification error.
 * @param subErrors Contains more granular information about the verification error.
 * @param type The type of error.   Possible values: **invalidInput**, **dataMissing**.
 */
@Serializable
data class VerificationError (

    /* Contains the capabilities that the verification error applies to. */
    @SerialName(value = "capabilities") val capabilities: kotlin.collections.List<VerificationError.Capabilities>? = null,

    /* The verification error code. */
    @SerialName(value = "code") val code: kotlin.String? = null,

    /* A description of the error. */
    @SerialName(value = "message") val message: kotlin.String? = null,

    /* Contains the actions that you can take to resolve the verification error. */
    @SerialName(value = "remediatingActions") val remediatingActions: kotlin.collections.List<RemediatingAction>? = null,

    /* Contains more granular information about the verification error. */
    @SerialName(value = "subErrors") val subErrors: kotlin.collections.List<VerificationErrorMinusRecursive>? = null,

    /* The type of error.   Possible values: **invalidInput**, **dataMissing**. */
    @SerialName(value = "type") val type: VerificationError.Type? = null

) {

    /**
     * Contains the capabilities that the verification error applies to.
     *
     * Values: AcceptExternalFunding,AcceptPspFunding,AcceptTransactionInRestrictedCountries,AcceptTransactionInRestrictedCountriesCommercial,AcceptTransactionInRestrictedCountriesConsumer,AcceptTransactionInRestrictedIndustries,AcceptTransactionInRestrictedIndustriesCommercial,AcceptTransactionInRestrictedIndustriesConsumer,Acquiring,AtmWithdrawal,AtmWithdrawalCommercial,AtmWithdrawalConsumer,AtmWithdrawalInRestrictedCountries,AtmWithdrawalInRestrictedCountriesCommercial,AtmWithdrawalInRestrictedCountriesConsumer,AuthorisedPaymentInstrumentUser,GetGrantOffers,IssueBankAccount,IssueCard,IssueCardCommercial,IssueCardConsumer,LocalAcceptance,Payout,PayoutToTransferInstrument,Processing,ReceiveFromBalanceAccount,ReceiveFromPlatformPayments,ReceiveFromThirdParty,ReceiveFromTransferInstrument,ReceiveGrants,ReceivePayments,SendToBalanceAccount,SendToThirdParty,SendToTransferInstrument,ThirdPartyFunding,UseCard,UseCardCommercial,UseCardConsumer,UseCardInRestrictedCountries,UseCardInRestrictedCountriesCommercial,UseCardInRestrictedCountriesConsumer,UseCardInRestrictedIndustries,UseCardInRestrictedIndustriesCommercial,UseCardInRestrictedIndustriesConsumer,WithdrawFromAtm,WithdrawFromAtmCommercial,WithdrawFromAtmConsumer,WithdrawFromAtmInRestrictedCountries,WithdrawFromAtmInRestrictedCountriesCommercial,WithdrawFromAtmInRestrictedCountriesConsumer
     */
    @Serializable
    enum class Capabilities(val value: kotlin.String) {
        @SerialName(value = "acceptExternalFunding") AcceptExternalFunding("acceptExternalFunding"),
        @SerialName(value = "acceptPspFunding") AcceptPspFunding("acceptPspFunding"),
        @SerialName(value = "acceptTransactionInRestrictedCountries") AcceptTransactionInRestrictedCountries("acceptTransactionInRestrictedCountries"),
        @SerialName(value = "acceptTransactionInRestrictedCountriesCommercial") AcceptTransactionInRestrictedCountriesCommercial("acceptTransactionInRestrictedCountriesCommercial"),
        @SerialName(value = "acceptTransactionInRestrictedCountriesConsumer") AcceptTransactionInRestrictedCountriesConsumer("acceptTransactionInRestrictedCountriesConsumer"),
        @SerialName(value = "acceptTransactionInRestrictedIndustries") AcceptTransactionInRestrictedIndustries("acceptTransactionInRestrictedIndustries"),
        @SerialName(value = "acceptTransactionInRestrictedIndustriesCommercial") AcceptTransactionInRestrictedIndustriesCommercial("acceptTransactionInRestrictedIndustriesCommercial"),
        @SerialName(value = "acceptTransactionInRestrictedIndustriesConsumer") AcceptTransactionInRestrictedIndustriesConsumer("acceptTransactionInRestrictedIndustriesConsumer"),
        @SerialName(value = "acquiring") Acquiring("acquiring"),
        @SerialName(value = "atmWithdrawal") AtmWithdrawal("atmWithdrawal"),
        @SerialName(value = "atmWithdrawalCommercial") AtmWithdrawalCommercial("atmWithdrawalCommercial"),
        @SerialName(value = "atmWithdrawalConsumer") AtmWithdrawalConsumer("atmWithdrawalConsumer"),
        @SerialName(value = "atmWithdrawalInRestrictedCountries") AtmWithdrawalInRestrictedCountries("atmWithdrawalInRestrictedCountries"),
        @SerialName(value = "atmWithdrawalInRestrictedCountriesCommercial") AtmWithdrawalInRestrictedCountriesCommercial("atmWithdrawalInRestrictedCountriesCommercial"),
        @SerialName(value = "atmWithdrawalInRestrictedCountriesConsumer") AtmWithdrawalInRestrictedCountriesConsumer("atmWithdrawalInRestrictedCountriesConsumer"),
        @SerialName(value = "authorisedPaymentInstrumentUser") AuthorisedPaymentInstrumentUser("authorisedPaymentInstrumentUser"),
        @SerialName(value = "getGrantOffers") GetGrantOffers("getGrantOffers"),
        @SerialName(value = "issueBankAccount") IssueBankAccount("issueBankAccount"),
        @SerialName(value = "issueCard") IssueCard("issueCard"),
        @SerialName(value = "issueCardCommercial") IssueCardCommercial("issueCardCommercial"),
        @SerialName(value = "issueCardConsumer") IssueCardConsumer("issueCardConsumer"),
        @SerialName(value = "localAcceptance") LocalAcceptance("localAcceptance"),
        @SerialName(value = "payout") Payout("payout"),
        @SerialName(value = "payoutToTransferInstrument") PayoutToTransferInstrument("payoutToTransferInstrument"),
        @SerialName(value = "processing") Processing("processing"),
        @SerialName(value = "receiveFromBalanceAccount") ReceiveFromBalanceAccount("receiveFromBalanceAccount"),
        @SerialName(value = "receiveFromPlatformPayments") ReceiveFromPlatformPayments("receiveFromPlatformPayments"),
        @SerialName(value = "receiveFromThirdParty") ReceiveFromThirdParty("receiveFromThirdParty"),
        @SerialName(value = "receiveFromTransferInstrument") ReceiveFromTransferInstrument("receiveFromTransferInstrument"),
        @SerialName(value = "receiveGrants") ReceiveGrants("receiveGrants"),
        @SerialName(value = "receivePayments") ReceivePayments("receivePayments"),
        @SerialName(value = "sendToBalanceAccount") SendToBalanceAccount("sendToBalanceAccount"),
        @SerialName(value = "sendToThirdParty") SendToThirdParty("sendToThirdParty"),
        @SerialName(value = "sendToTransferInstrument") SendToTransferInstrument("sendToTransferInstrument"),
        @SerialName(value = "thirdPartyFunding") ThirdPartyFunding("thirdPartyFunding"),
        @SerialName(value = "useCard") UseCard("useCard"),
        @SerialName(value = "useCardCommercial") UseCardCommercial("useCardCommercial"),
        @SerialName(value = "useCardConsumer") UseCardConsumer("useCardConsumer"),
        @SerialName(value = "useCardInRestrictedCountries") UseCardInRestrictedCountries("useCardInRestrictedCountries"),
        @SerialName(value = "useCardInRestrictedCountriesCommercial") UseCardInRestrictedCountriesCommercial("useCardInRestrictedCountriesCommercial"),
        @SerialName(value = "useCardInRestrictedCountriesConsumer") UseCardInRestrictedCountriesConsumer("useCardInRestrictedCountriesConsumer"),
        @SerialName(value = "useCardInRestrictedIndustries") UseCardInRestrictedIndustries("useCardInRestrictedIndustries"),
        @SerialName(value = "useCardInRestrictedIndustriesCommercial") UseCardInRestrictedIndustriesCommercial("useCardInRestrictedIndustriesCommercial"),
        @SerialName(value = "useCardInRestrictedIndustriesConsumer") UseCardInRestrictedIndustriesConsumer("useCardInRestrictedIndustriesConsumer"),
        @SerialName(value = "withdrawFromAtm") WithdrawFromAtm("withdrawFromAtm"),
        @SerialName(value = "withdrawFromAtmCommercial") WithdrawFromAtmCommercial("withdrawFromAtmCommercial"),
        @SerialName(value = "withdrawFromAtmConsumer") WithdrawFromAtmConsumer("withdrawFromAtmConsumer"),
        @SerialName(value = "withdrawFromAtmInRestrictedCountries") WithdrawFromAtmInRestrictedCountries("withdrawFromAtmInRestrictedCountries"),
        @SerialName(value = "withdrawFromAtmInRestrictedCountriesCommercial") WithdrawFromAtmInRestrictedCountriesCommercial("withdrawFromAtmInRestrictedCountriesCommercial"),
        @SerialName(value = "withdrawFromAtmInRestrictedCountriesConsumer") WithdrawFromAtmInRestrictedCountriesConsumer("withdrawFromAtmInRestrictedCountriesConsumer");
    }
    /**
     * The type of error.   Possible values: **invalidInput**, **dataMissing**.
     *
     * Values: DataMissing,InvalidInput,PendingStatus
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "dataMissing") DataMissing("dataMissing"),
        @SerialName(value = "invalidInput") InvalidInput("invalidInput"),
        @SerialName(value = "pendingStatus") PendingStatus("pendingStatus");
    }
}

