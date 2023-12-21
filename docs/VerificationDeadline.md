
# VerificationDeadline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**inline**](#kotlin.collections.List&lt;Capabilities&gt;) | The names of the capabilities to be disallowed. | 
**expiresAt** | **kotlin.String** | The date that verification is due by before capabilities are disallowed. | 
**entityIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The unique identifiers of the bank account(s) that the deadline applies to |  [optional]


<a name="kotlin.collections.List<Capabilities>"></a>
## Enum: capabilities
Name | Value
---- | -----
capabilities | acceptExternalFunding, acceptPspFunding, acceptTransactionInRestrictedCountries, acceptTransactionInRestrictedCountriesCommercial, acceptTransactionInRestrictedCountriesConsumer, acceptTransactionInRestrictedIndustries, acceptTransactionInRestrictedIndustriesCommercial, acceptTransactionInRestrictedIndustriesConsumer, acquiring, atmWithdrawal, atmWithdrawalCommercial, atmWithdrawalConsumer, atmWithdrawalInRestrictedCountries, atmWithdrawalInRestrictedCountriesCommercial, atmWithdrawalInRestrictedCountriesConsumer, authorisedPaymentInstrumentUser, getGrantOffers, issueBankAccount, issueCard, issueCardCommercial, issueCardConsumer, localAcceptance, payout, payoutToTransferInstrument, processing, receiveFromBalanceAccount, receiveFromPlatformPayments, receiveFromThirdParty, receiveFromTransferInstrument, receiveGrants, receivePayments, sendToBalanceAccount, sendToThirdParty, sendToTransferInstrument, thirdPartyFunding, useCard, useCardCommercial, useCardConsumer, useCardInRestrictedCountries, useCardInRestrictedCountriesCommercial, useCardInRestrictedCountriesConsumer, useCardInRestrictedIndustries, useCardInRestrictedIndustriesCommercial, useCardInRestrictedIndustriesConsumer, withdrawFromAtm, withdrawFromAtmCommercial, withdrawFromAtmConsumer, withdrawFromAtmInRestrictedCountries, withdrawFromAtmInRestrictedCountriesCommercial, withdrawFromAtmInRestrictedCountriesConsumer



