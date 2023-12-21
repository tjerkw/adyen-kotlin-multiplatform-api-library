#  Kotlin Multiplatform client library for Adyen's API

A kotlin multiplatform library for Adyen's api generated with openapi-generator based on the "multiplatform" target.

To regenerate, call:

```
make models
```



# Missing Crypto for Terminals

Note, this library is missing the crypto need for api calls to terminals.

See: https://github.com/Adyen/adyen-java-api-library/blob/main/src/main/java/com/adyen/terminal/security/NexoCrypto.java

This still needs to be implemented.

# com.adyen.client - Kotlin client library for Adyen Balance Control API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/BalanceControl/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postBalanceTransfer**](docs/GeneralApi.md#postbalancetransfer) | **POST** /balanceTransfer | Start a balance transfer


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.balancecontrol.Amount](docs/Amount.md)
 - [com.adyen.model.balancecontrol.BalanceTransferRequest](docs/BalanceTransferRequest.md)
 - [com.adyen.model.balancecontrol.BalanceTransferResponse](docs/BalanceTransferResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Configuration API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountHoldersApi* | [**getAccountHoldersId**](docs/AccountHoldersApi.md#getaccountholdersid) | **GET** /accountHolders/{id} | Get an account holder
*AccountHoldersApi* | [**getAccountHoldersIdBalanceAccounts**](docs/AccountHoldersApi.md#getaccountholdersidbalanceaccounts) | **GET** /accountHolders/{id}/balanceAccounts | Get all balance accounts of an account holder
*AccountHoldersApi* | [**getAccountHoldersIdTaxForms**](docs/AccountHoldersApi.md#getaccountholdersidtaxforms) | **GET** /accountHolders/{id}/taxForms | Get a tax form
*AccountHoldersApi* | [**patchAccountHoldersId**](docs/AccountHoldersApi.md#patchaccountholdersid) | **PATCH** /accountHolders/{id} | Update an account holder
*AccountHoldersApi* | [**postAccountHolders**](docs/AccountHoldersApi.md#postaccountholders) | **POST** /accountHolders | Create an account holder
*BalanceAccountsApi* | [**deleteBalanceAccountsBalanceAccountIdSweepsSweepId**](docs/BalanceAccountsApi.md#deletebalanceaccountsbalanceaccountidsweepssweepid) | **DELETE** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Delete a sweep
*BalanceAccountsApi* | [**getBalanceAccountsBalanceAccountIdSweeps**](docs/BalanceAccountsApi.md#getbalanceaccountsbalanceaccountidsweeps) | **GET** /balanceAccounts/{balanceAccountId}/sweeps | Get all sweeps for a balance account
*BalanceAccountsApi* | [**getBalanceAccountsBalanceAccountIdSweepsSweepId**](docs/BalanceAccountsApi.md#getbalanceaccountsbalanceaccountidsweepssweepid) | **GET** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Get a sweep
*BalanceAccountsApi* | [**getBalanceAccountsId**](docs/BalanceAccountsApi.md#getbalanceaccountsid) | **GET** /balanceAccounts/{id} | Get a balance account
*BalanceAccountsApi* | [**getBalanceAccountsIdPaymentInstruments**](docs/BalanceAccountsApi.md#getbalanceaccountsidpaymentinstruments) | **GET** /balanceAccounts/{id}/paymentInstruments | Get all payment instruments for a balance account
*BalanceAccountsApi* | [**patchBalanceAccountsBalanceAccountIdSweepsSweepId**](docs/BalanceAccountsApi.md#patchbalanceaccountsbalanceaccountidsweepssweepid) | **PATCH** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Update a sweep
*BalanceAccountsApi* | [**patchBalanceAccountsId**](docs/BalanceAccountsApi.md#patchbalanceaccountsid) | **PATCH** /balanceAccounts/{id} | Update a balance account
*BalanceAccountsApi* | [**postBalanceAccounts**](docs/BalanceAccountsApi.md#postbalanceaccounts) | **POST** /balanceAccounts | Create a balance account
*BalanceAccountsApi* | [**postBalanceAccountsBalanceAccountIdSweeps**](docs/BalanceAccountsApi.md#postbalanceaccountsbalanceaccountidsweeps) | **POST** /balanceAccounts/{balanceAccountId}/sweeps | Create a sweep
*BankAccountValidationApi* | [**postValidateBankAccountIdentification**](docs/BankAccountValidationApi.md#postvalidatebankaccountidentification) | **POST** /validateBankAccountIdentification | Validate a bank account
*GrantAccountsApi* | [**getGrantAccountsId**](docs/GrantAccountsApi.md#getgrantaccountsid) | **GET** /grantAccounts/{id} | Get a grant account
*GrantOffersApi* | [**getGrantOffers**](docs/GrantOffersApi.md#getgrantoffers) | **GET** /grantOffers | Get all available grant offers
*GrantOffersApi* | [**getGrantOffersGrantOfferId**](docs/GrantOffersApi.md#getgrantoffersgrantofferid) | **GET** /grantOffers/{grantOfferId} | Get a grant offer
*NetworkTokensApi* | [**getNetworkTokensNetworkTokenId**](docs/NetworkTokensApi.md#getnetworktokensnetworktokenid) | **GET** /networkTokens/{networkTokenId} | Get a network token
*NetworkTokensApi* | [**patchNetworkTokensNetworkTokenId**](docs/NetworkTokensApi.md#patchnetworktokensnetworktokenid) | **PATCH** /networkTokens/{networkTokenId} | Update a network token
*PaymentInstrumentGroupsApi* | [**getPaymentInstrumentGroupsId**](docs/PaymentInstrumentGroupsApi.md#getpaymentinstrumentgroupsid) | **GET** /paymentInstrumentGroups/{id} | Get a payment instrument group
*PaymentInstrumentGroupsApi* | [**getPaymentInstrumentGroupsIdTransactionRules**](docs/PaymentInstrumentGroupsApi.md#getpaymentinstrumentgroupsidtransactionrules) | **GET** /paymentInstrumentGroups/{id}/transactionRules | Get all transaction rules for a payment instrument group
*PaymentInstrumentGroupsApi* | [**postPaymentInstrumentGroups**](docs/PaymentInstrumentGroupsApi.md#postpaymentinstrumentgroups) | **POST** /paymentInstrumentGroups | Create a payment instrument group
*PaymentInstrumentsApi* | [**getPaymentInstrumentsId**](docs/PaymentInstrumentsApi.md#getpaymentinstrumentsid) | **GET** /paymentInstruments/{id} | Get a payment instrument
*PaymentInstrumentsApi* | [**getPaymentInstrumentsIdNetworkTokens**](docs/PaymentInstrumentsApi.md#getpaymentinstrumentsidnetworktokens) | **GET** /paymentInstruments/{id}/networkTokens | List network tokens
*PaymentInstrumentsApi* | [**getPaymentInstrumentsIdReveal**](docs/PaymentInstrumentsApi.md#getpaymentinstrumentsidreveal) | **GET** /paymentInstruments/{id}/reveal | Get the PAN of a payment instrument
*PaymentInstrumentsApi* | [**getPaymentInstrumentsIdTransactionRules**](docs/PaymentInstrumentsApi.md#getpaymentinstrumentsidtransactionrules) | **GET** /paymentInstruments/{id}/transactionRules | Get all transaction rules for a payment instrument
*PaymentInstrumentsApi* | [**patchPaymentInstrumentsId**](docs/PaymentInstrumentsApi.md#patchpaymentinstrumentsid) | **PATCH** /paymentInstruments/{id} | Update a payment instrument
*PaymentInstrumentsApi* | [**postPaymentInstruments**](docs/PaymentInstrumentsApi.md#postpaymentinstruments) | **POST** /paymentInstruments | Create a payment instrument
*PlatformApi* | [**getBalancePlatformsId**](docs/PlatformApi.md#getbalanceplatformsid) | **GET** /balancePlatforms/{id} | Get a balance platform
*PlatformApi* | [**getBalancePlatformsIdAccountHolders**](docs/PlatformApi.md#getbalanceplatformsidaccountholders) | **GET** /balancePlatforms/{id}/accountHolders | Get all account holders under a balance platform
*TransactionRulesApi* | [**deleteTransactionRulesTransactionRuleId**](docs/TransactionRulesApi.md#deletetransactionrulestransactionruleid) | **DELETE** /transactionRules/{transactionRuleId} | Delete a transaction rule
*TransactionRulesApi* | [**getTransactionRulesTransactionRuleId**](docs/TransactionRulesApi.md#gettransactionrulestransactionruleid) | **GET** /transactionRules/{transactionRuleId} | Get a transaction rule
*TransactionRulesApi* | [**patchTransactionRulesTransactionRuleId**](docs/TransactionRulesApi.md#patchtransactionrulestransactionruleid) | **PATCH** /transactionRules/{transactionRuleId} | Update a transaction rule
*TransactionRulesApi* | [**postTransactionRules**](docs/TransactionRulesApi.md#posttransactionrules) | **POST** /transactionRules | Create a transaction rule
*TransferRoutesApi* | [**postTransferRoutesCalculate**](docs/TransferRoutesApi.md#posttransferroutescalculate) | **POST** /transferRoutes/calculate | Calculate transfer routes


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.balanceplatform.AULocalAccountIdentification](docs/AULocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.AccountHolder](docs/AccountHolder.md)
 - [com.adyen.model.balanceplatform.AccountHolderCapability](docs/AccountHolderCapability.md)
 - [com.adyen.model.balanceplatform.AccountHolderInfo](docs/AccountHolderInfo.md)
 - [com.adyen.model.balanceplatform.AccountHolderUpdateRequest](docs/AccountHolderUpdateRequest.md)
 - [com.adyen.model.balanceplatform.AccountSupportingEntityCapability](docs/AccountSupportingEntityCapability.md)
 - [com.adyen.model.balanceplatform.ActiveNetworkTokensRestriction](docs/ActiveNetworkTokensRestriction.md)
 - [com.adyen.model.balanceplatform.AdditionalBankIdentification](docs/AdditionalBankIdentification.md)
 - [com.adyen.model.balanceplatform.Address](docs/Address.md)
 - [com.adyen.model.balanceplatform.AddressRequirement](docs/AddressRequirement.md)
 - [com.adyen.model.balanceplatform.Amount](docs/Amount.md)
 - [com.adyen.model.balanceplatform.AmountMinMaxRequirement](docs/AmountMinMaxRequirement.md)
 - [com.adyen.model.balanceplatform.Authentication](docs/Authentication.md)
 - [com.adyen.model.balanceplatform.BRLocalAccountIdentification](docs/BRLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.Balance](docs/Balance.md)
 - [com.adyen.model.balanceplatform.BalanceAccount](docs/BalanceAccount.md)
 - [com.adyen.model.balanceplatform.BalanceAccountBase](docs/BalanceAccountBase.md)
 - [com.adyen.model.balanceplatform.BalanceAccountInfo](docs/BalanceAccountInfo.md)
 - [com.adyen.model.balanceplatform.BalanceAccountUpdateRequest](docs/BalanceAccountUpdateRequest.md)
 - [com.adyen.model.balanceplatform.BalancePlatform](docs/BalancePlatform.md)
 - [com.adyen.model.balanceplatform.BalanceSweepConfigurationsResponse](docs/BalanceSweepConfigurationsResponse.md)
 - [com.adyen.model.balanceplatform.BankAccount](docs/BankAccount.md)
 - [com.adyen.model.balanceplatform.BankAccountAccountIdentification](docs/BankAccountAccountIdentification.md)
 - [com.adyen.model.balanceplatform.BankAccountIdentificationTypeRequirement](docs/BankAccountIdentificationTypeRequirement.md)
 - [com.adyen.model.balanceplatform.BankAccountIdentificationValidationRequest](docs/BankAccountIdentificationValidationRequest.md)
 - [com.adyen.model.balanceplatform.BankAccountIdentificationValidationRequestAccountIdentification](docs/BankAccountIdentificationValidationRequestAccountIdentification.md)
 - [com.adyen.model.balanceplatform.BankIdentification](docs/BankIdentification.md)
 - [com.adyen.model.balanceplatform.BrandVariantsRestriction](docs/BrandVariantsRestriction.md)
 - [com.adyen.model.balanceplatform.BulkAddress](docs/BulkAddress.md)
 - [com.adyen.model.balanceplatform.CALocalAccountIdentification](docs/CALocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.CZLocalAccountIdentification](docs/CZLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.CapabilityProblem](docs/CapabilityProblem.md)
 - [com.adyen.model.balanceplatform.CapabilityProblemEntity](docs/CapabilityProblemEntity.md)
 - [com.adyen.model.balanceplatform.CapabilityProblemEntityMinusRecursive](docs/CapabilityProblemEntityMinusRecursive.md)
 - [com.adyen.model.balanceplatform.CapabilitySettings](docs/CapabilitySettings.md)
 - [com.adyen.model.balanceplatform.CapitalBalance](docs/CapitalBalance.md)
 - [com.adyen.model.balanceplatform.CapitalGrantAccount](docs/CapitalGrantAccount.md)
 - [com.adyen.model.balanceplatform.Card](docs/Card.md)
 - [com.adyen.model.balanceplatform.CardConfiguration](docs/CardConfiguration.md)
 - [com.adyen.model.balanceplatform.CardInfo](docs/CardInfo.md)
 - [com.adyen.model.balanceplatform.ContactDetails](docs/ContactDetails.md)
 - [com.adyen.model.balanceplatform.Counterparty](docs/Counterparty.md)
 - [com.adyen.model.balanceplatform.CounterpartyBankRestriction](docs/CounterpartyBankRestriction.md)
 - [com.adyen.model.balanceplatform.CountriesRestriction](docs/CountriesRestriction.md)
 - [com.adyen.model.balanceplatform.CreateSweepConfigurationV2](docs/CreateSweepConfigurationV2.md)
 - [com.adyen.model.balanceplatform.DKLocalAccountIdentification](docs/DKLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.DayOfWeekRestriction](docs/DayOfWeekRestriction.md)
 - [com.adyen.model.balanceplatform.DeliveryAddress](docs/DeliveryAddress.md)
 - [com.adyen.model.balanceplatform.DeliveryContact](docs/DeliveryContact.md)
 - [com.adyen.model.balanceplatform.DeviceInfo](docs/DeviceInfo.md)
 - [com.adyen.model.balanceplatform.DifferentCurrenciesRestriction](docs/DifferentCurrenciesRestriction.md)
 - [com.adyen.model.balanceplatform.Duration](docs/Duration.md)
 - [com.adyen.model.balanceplatform.EntryModesRestriction](docs/EntryModesRestriction.md)
 - [com.adyen.model.balanceplatform.Expiry](docs/Expiry.md)
 - [com.adyen.model.balanceplatform.Fee](docs/Fee.md)
 - [com.adyen.model.balanceplatform.GetNetworkTokenResponse](docs/GetNetworkTokenResponse.md)
 - [com.adyen.model.balanceplatform.GetTaxFormResponse](docs/GetTaxFormResponse.md)
 - [com.adyen.model.balanceplatform.GrantLimit](docs/GrantLimit.md)
 - [com.adyen.model.balanceplatform.GrantOffer](docs/GrantOffer.md)
 - [com.adyen.model.balanceplatform.GrantOffers](docs/GrantOffers.md)
 - [com.adyen.model.balanceplatform.HKLocalAccountIdentification](docs/HKLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.HULocalAccountIdentification](docs/HULocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.IbanAccountIdentification](docs/IbanAccountIdentification.md)
 - [com.adyen.model.balanceplatform.InternationalTransactionRestriction](docs/InternationalTransactionRestriction.md)
 - [com.adyen.model.balanceplatform.InvalidField](docs/InvalidField.md)
 - [com.adyen.model.balanceplatform.ListNetworkTokensResponse](docs/ListNetworkTokensResponse.md)
 - [com.adyen.model.balanceplatform.MatchingTransactionsRestriction](docs/MatchingTransactionsRestriction.md)
 - [com.adyen.model.balanceplatform.MccsRestriction](docs/MccsRestriction.md)
 - [com.adyen.model.balanceplatform.MerchantAcquirerPair](docs/MerchantAcquirerPair.md)
 - [com.adyen.model.balanceplatform.MerchantNamesRestriction](docs/MerchantNamesRestriction.md)
 - [com.adyen.model.balanceplatform.MerchantsRestriction](docs/MerchantsRestriction.md)
 - [com.adyen.model.balanceplatform.NOLocalAccountIdentification](docs/NOLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.NZLocalAccountIdentification](docs/NZLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.Name](docs/Name.md)
 - [com.adyen.model.balanceplatform.NetworkToken](docs/NetworkToken.md)
 - [com.adyen.model.balanceplatform.NumberAndBicAccountIdentification](docs/NumberAndBicAccountIdentification.md)
 - [com.adyen.model.balanceplatform.PLLocalAccountIdentification](docs/PLLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.PaginatedAccountHoldersResponse](docs/PaginatedAccountHoldersResponse.md)
 - [com.adyen.model.balanceplatform.PaginatedBalanceAccountsResponse](docs/PaginatedBalanceAccountsResponse.md)
 - [com.adyen.model.balanceplatform.PaginatedPaymentInstrumentsResponse](docs/PaginatedPaymentInstrumentsResponse.md)
 - [com.adyen.model.balanceplatform.PaymentInstrument](docs/PaymentInstrument.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentBankAccount](docs/PaymentInstrumentBankAccount.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentGroup](docs/PaymentInstrumentGroup.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentGroupInfo](docs/PaymentInstrumentGroupInfo.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentInfo](docs/PaymentInstrumentInfo.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentRequirement](docs/PaymentInstrumentRequirement.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentRevealInfo](docs/PaymentInstrumentRevealInfo.md)
 - [com.adyen.model.balanceplatform.PaymentInstrumentUpdateRequest](docs/PaymentInstrumentUpdateRequest.md)
 - [com.adyen.model.balanceplatform.Phone](docs/Phone.md)
 - [com.adyen.model.balanceplatform.PhoneNumber](docs/PhoneNumber.md)
 - [com.adyen.model.balanceplatform.PlatformPaymentConfiguration](docs/PlatformPaymentConfiguration.md)
 - [com.adyen.model.balanceplatform.ProcessingTypesRestriction](docs/ProcessingTypesRestriction.md)
 - [com.adyen.model.balanceplatform.RemediatingAction](docs/RemediatingAction.md)
 - [com.adyen.model.balanceplatform.Repayment](docs/Repayment.md)
 - [com.adyen.model.balanceplatform.RepaymentTerm](docs/RepaymentTerm.md)
 - [com.adyen.model.balanceplatform.RestServiceError](docs/RestServiceError.md)
 - [com.adyen.model.balanceplatform.SELocalAccountIdentification](docs/SELocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.SGLocalAccountIdentification](docs/SGLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.SameAmountRestriction](docs/SameAmountRestriction.md)
 - [com.adyen.model.balanceplatform.SameCounterpartyRestriction](docs/SameCounterpartyRestriction.md)
 - [com.adyen.model.balanceplatform.StringMatch](docs/StringMatch.md)
 - [com.adyen.model.balanceplatform.SweepConfigurationV2](docs/SweepConfigurationV2.md)
 - [com.adyen.model.balanceplatform.SweepCounterparty](docs/SweepCounterparty.md)
 - [com.adyen.model.balanceplatform.SweepSchedule](docs/SweepSchedule.md)
 - [com.adyen.model.balanceplatform.ThresholdRepayment](docs/ThresholdRepayment.md)
 - [com.adyen.model.balanceplatform.TimeOfDay](docs/TimeOfDay.md)
 - [com.adyen.model.balanceplatform.TimeOfDayRestriction](docs/TimeOfDayRestriction.md)
 - [com.adyen.model.balanceplatform.TotalAmountRestriction](docs/TotalAmountRestriction.md)
 - [com.adyen.model.balanceplatform.TransactionRule](docs/TransactionRule.md)
 - [com.adyen.model.balanceplatform.TransactionRuleEntityKey](docs/TransactionRuleEntityKey.md)
 - [com.adyen.model.balanceplatform.TransactionRuleInfo](docs/TransactionRuleInfo.md)
 - [com.adyen.model.balanceplatform.TransactionRuleInterval](docs/TransactionRuleInterval.md)
 - [com.adyen.model.balanceplatform.TransactionRuleResponse](docs/TransactionRuleResponse.md)
 - [com.adyen.model.balanceplatform.TransactionRuleRestrictions](docs/TransactionRuleRestrictions.md)
 - [com.adyen.model.balanceplatform.TransactionRulesResponse](docs/TransactionRulesResponse.md)
 - [com.adyen.model.balanceplatform.TransferRoute](docs/TransferRoute.md)
 - [com.adyen.model.balanceplatform.TransferRouteRequest](docs/TransferRouteRequest.md)
 - [com.adyen.model.balanceplatform.TransferRouteRequirements](docs/TransferRouteRequirements.md)
 - [com.adyen.model.balanceplatform.TransferRouteResponse](docs/TransferRouteResponse.md)
 - [com.adyen.model.balanceplatform.UKLocalAccountIdentification](docs/UKLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.USLocalAccountIdentification](docs/USLocalAccountIdentification.md)
 - [com.adyen.model.balanceplatform.UpdateNetworkTokenRequest](docs/UpdateNetworkTokenRequest.md)
 - [com.adyen.model.balanceplatform.UpdatePaymentInstrument](docs/UpdatePaymentInstrument.md)
 - [com.adyen.model.balanceplatform.UpdateSweepConfigurationV2](docs/UpdateSweepConfigurationV2.md)
 - [com.adyen.model.balanceplatform.VerificationDeadline](docs/VerificationDeadline.md)
 - [com.adyen.model.balanceplatform.VerificationError](docs/VerificationError.md)
 - [com.adyen.model.balanceplatform.VerificationErrorMinusRecursive](docs/VerificationErrorMinusRecursive.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen BinLookup API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/BinLookup/v54*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postGet3dsAvailability**](docs/GeneralApi.md#postget3dsavailability) | **POST** /get3dsAvailability | Check if 3D Secure is available
*GeneralApi* | [**postGetCostEstimate**](docs/GeneralApi.md#postgetcostestimate) | **POST** /getCostEstimate | Get a fees cost estimate


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.binlookup.Amount](docs/Amount.md)
 - [com.adyen.model.binlookup.BinDetail](docs/BinDetail.md)
 - [com.adyen.model.binlookup.CardBin](docs/CardBin.md)
 - [com.adyen.model.binlookup.CostEstimateAssumptions](docs/CostEstimateAssumptions.md)
 - [com.adyen.model.binlookup.CostEstimateRequest](docs/CostEstimateRequest.md)
 - [com.adyen.model.binlookup.CostEstimateResponse](docs/CostEstimateResponse.md)
 - [com.adyen.model.binlookup.DSPublicKeyDetail](docs/DSPublicKeyDetail.md)
 - [com.adyen.model.binlookup.MerchantDetails](docs/MerchantDetails.md)
 - [com.adyen.model.binlookup.Recurring](docs/Recurring.md)
 - [com.adyen.model.binlookup.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.binlookup.ThreeDS2CardRangeDetail](docs/ThreeDS2CardRangeDetail.md)
 - [com.adyen.model.binlookup.ThreeDSAvailabilityRequest](docs/ThreeDSAvailabilityRequest.md)
 - [com.adyen.model.binlookup.ThreeDSAvailabilityResponse](docs/ThreeDSAvailabilityResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen Checkout API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://checkout-test.adyen.com/v71*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClassicCheckoutSDKApi* | [**postPaymentSession**](docs/ClassicCheckoutSDKApi.md#postpaymentsession) | **POST** /paymentSession | Create a payment session
*ClassicCheckoutSDKApi* | [**postPaymentsResult**](docs/ClassicCheckoutSDKApi.md#postpaymentsresult) | **POST** /payments/result | Verify a payment result
*ModificationsApi* | [**postCancels**](docs/ModificationsApi.md#postcancels) | **POST** /cancels | Cancel an authorised payment
*ModificationsApi* | [**postPaymentsPaymentPspReferenceAmountUpdates**](docs/ModificationsApi.md#postpaymentspaymentpspreferenceamountupdates) | **POST** /payments/{paymentPspReference}/amountUpdates | Update an authorised amount
*ModificationsApi* | [**postPaymentsPaymentPspReferenceCancels**](docs/ModificationsApi.md#postpaymentspaymentpspreferencecancels) | **POST** /payments/{paymentPspReference}/cancels | Cancel an authorised payment
*ModificationsApi* | [**postPaymentsPaymentPspReferenceCaptures**](docs/ModificationsApi.md#postpaymentspaymentpspreferencecaptures) | **POST** /payments/{paymentPspReference}/captures | Capture an authorised payment
*ModificationsApi* | [**postPaymentsPaymentPspReferenceRefunds**](docs/ModificationsApi.md#postpaymentspaymentpspreferencerefunds) | **POST** /payments/{paymentPspReference}/refunds | Refund a captured payment
*ModificationsApi* | [**postPaymentsPaymentPspReferenceReversals**](docs/ModificationsApi.md#postpaymentspaymentpspreferencereversals) | **POST** /payments/{paymentPspReference}/reversals | Refund or cancel a payment
*OrdersApi* | [**postOrders**](docs/OrdersApi.md#postorders) | **POST** /orders | Create an order
*OrdersApi* | [**postOrdersCancel**](docs/OrdersApi.md#postorderscancel) | **POST** /orders/cancel | Cancel an order
*OrdersApi* | [**postPaymentMethodsBalance**](docs/OrdersApi.md#postpaymentmethodsbalance) | **POST** /paymentMethods/balance | Get the balance of a gift card
*PaymentLinksApi* | [**getPaymentLinksLinkId**](docs/PaymentLinksApi.md#getpaymentlinkslinkid) | **GET** /paymentLinks/{linkId} | Get a payment link
*PaymentLinksApi* | [**patchPaymentLinksLinkId**](docs/PaymentLinksApi.md#patchpaymentlinkslinkid) | **PATCH** /paymentLinks/{linkId} | Update the status of a payment link
*PaymentLinksApi* | [**postPaymentLinks**](docs/PaymentLinksApi.md#postpaymentlinks) | **POST** /paymentLinks | Create a payment link
*PaymentsApi* | [**getSessionsSessionId**](docs/PaymentsApi.md#getsessionssessionid) | **GET** /sessions/{sessionId} | Get the result of a payment session
*PaymentsApi* | [**postCardDetails**](docs/PaymentsApi.md#postcarddetails) | **POST** /cardDetails | Get the list of brands on the card
*PaymentsApi* | [**postDonations**](docs/PaymentsApi.md#postdonations) | **POST** /donations | Start a transaction for donations
*PaymentsApi* | [**postPaymentMethods**](docs/PaymentsApi.md#postpaymentmethods) | **POST** /paymentMethods | Get a list of available payment methods
*PaymentsApi* | [**postPayments**](docs/PaymentsApi.md#postpayments) | **POST** /payments | Start a transaction
*PaymentsApi* | [**postPaymentsDetails**](docs/PaymentsApi.md#postpaymentsdetails) | **POST** /payments/details | Submit details for a payment
*PaymentsApi* | [**postSessions**](docs/PaymentsApi.md#postsessions) | **POST** /sessions | Create a payment session
*RecurringApi* | [**deleteStoredPaymentMethodsStoredPaymentMethodId**](docs/RecurringApi.md#deletestoredpaymentmethodsstoredpaymentmethodid) | **DELETE** /storedPaymentMethods/{storedPaymentMethodId} | Delete a token for stored payment details
*RecurringApi* | [**getStoredPaymentMethods**](docs/RecurringApi.md#getstoredpaymentmethods) | **GET** /storedPaymentMethods | Get tokens for stored payment details
*UtilityApi* | [**postApplePaySessions**](docs/UtilityApi.md#postapplepaysessions) | **POST** /applePay/sessions | Get an Apple Pay session
*UtilityApi* | [**postOriginKeys**](docs/UtilityApi.md#postoriginkeys) | **POST** /originKeys | Create originKey values for domains


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.checkout.AccountInfo](docs/AccountInfo.md)
 - [com.adyen.model.checkout.AcctInfo](docs/AcctInfo.md)
 - [com.adyen.model.checkout.AchDetails](docs/AchDetails.md)
 - [com.adyen.model.checkout.AdditionalData3DSecure](docs/AdditionalData3DSecure.md)
 - [com.adyen.model.checkout.AdditionalDataAirline](docs/AdditionalDataAirline.md)
 - [com.adyen.model.checkout.AdditionalDataCarRental](docs/AdditionalDataCarRental.md)
 - [com.adyen.model.checkout.AdditionalDataCommon](docs/AdditionalDataCommon.md)
 - [com.adyen.model.checkout.AdditionalDataLevel23](docs/AdditionalDataLevel23.md)
 - [com.adyen.model.checkout.AdditionalDataLodging](docs/AdditionalDataLodging.md)
 - [com.adyen.model.checkout.AdditionalDataOpenInvoice](docs/AdditionalDataOpenInvoice.md)
 - [com.adyen.model.checkout.AdditionalDataOpi](docs/AdditionalDataOpi.md)
 - [com.adyen.model.checkout.AdditionalDataRatepay](docs/AdditionalDataRatepay.md)
 - [com.adyen.model.checkout.AdditionalDataRetry](docs/AdditionalDataRetry.md)
 - [com.adyen.model.checkout.AdditionalDataRisk](docs/AdditionalDataRisk.md)
 - [com.adyen.model.checkout.AdditionalDataRiskStandalone](docs/AdditionalDataRiskStandalone.md)
 - [com.adyen.model.checkout.AdditionalDataSubMerchant](docs/AdditionalDataSubMerchant.md)
 - [com.adyen.model.checkout.AdditionalDataTemporaryServices](docs/AdditionalDataTemporaryServices.md)
 - [com.adyen.model.checkout.AdditionalDataWallets](docs/AdditionalDataWallets.md)
 - [com.adyen.model.checkout.Address](docs/Address.md)
 - [com.adyen.model.checkout.AfterpayDetails](docs/AfterpayDetails.md)
 - [com.adyen.model.checkout.AmazonPayDetails](docs/AmazonPayDetails.md)
 - [com.adyen.model.checkout.Amount](docs/Amount.md)
 - [com.adyen.model.checkout.AndroidPayDetails](docs/AndroidPayDetails.md)
 - [com.adyen.model.checkout.ApplePayDetails](docs/ApplePayDetails.md)
 - [com.adyen.model.checkout.ApplePaySessionRequest](docs/ApplePaySessionRequest.md)
 - [com.adyen.model.checkout.ApplePaySessionResponse](docs/ApplePaySessionResponse.md)
 - [com.adyen.model.checkout.ApplicationInfo](docs/ApplicationInfo.md)
 - [com.adyen.model.checkout.AuthenticationData](docs/AuthenticationData.md)
 - [com.adyen.model.checkout.Avs](docs/Avs.md)
 - [com.adyen.model.checkout.BacsDirectDebitDetails](docs/BacsDirectDebitDetails.md)
 - [com.adyen.model.checkout.BalanceCheckRequest](docs/BalanceCheckRequest.md)
 - [com.adyen.model.checkout.BalanceCheckResponse](docs/BalanceCheckResponse.md)
 - [com.adyen.model.checkout.BankAccount](docs/BankAccount.md)
 - [com.adyen.model.checkout.BillDeskDetails](docs/BillDeskDetails.md)
 - [com.adyen.model.checkout.BillingAddress](docs/BillingAddress.md)
 - [com.adyen.model.checkout.BlikDetails](docs/BlikDetails.md)
 - [com.adyen.model.checkout.BrowserInfo](docs/BrowserInfo.md)
 - [com.adyen.model.checkout.CancelOrderRequest](docs/CancelOrderRequest.md)
 - [com.adyen.model.checkout.CancelOrderResponse](docs/CancelOrderResponse.md)
 - [com.adyen.model.checkout.Card](docs/Card.md)
 - [com.adyen.model.checkout.CardBrandDetails](docs/CardBrandDetails.md)
 - [com.adyen.model.checkout.CardDetails](docs/CardDetails.md)
 - [com.adyen.model.checkout.CardDetailsRequest](docs/CardDetailsRequest.md)
 - [com.adyen.model.checkout.CardDetailsResponse](docs/CardDetailsResponse.md)
 - [com.adyen.model.checkout.CellulantDetails](docs/CellulantDetails.md)
 - [com.adyen.model.checkout.CheckoutAwaitAction](docs/CheckoutAwaitAction.md)
 - [com.adyen.model.checkout.CheckoutDelegatedAuthenticationAction](docs/CheckoutDelegatedAuthenticationAction.md)
 - [com.adyen.model.checkout.CheckoutNativeRedirectAction](docs/CheckoutNativeRedirectAction.md)
 - [com.adyen.model.checkout.CheckoutOrderResponse](docs/CheckoutOrderResponse.md)
 - [com.adyen.model.checkout.CheckoutPaymentMethod](docs/CheckoutPaymentMethod.md)
 - [com.adyen.model.checkout.CheckoutQrCodeAction](docs/CheckoutQrCodeAction.md)
 - [com.adyen.model.checkout.CheckoutRedirectAction](docs/CheckoutRedirectAction.md)
 - [com.adyen.model.checkout.CheckoutSDKAction](docs/CheckoutSDKAction.md)
 - [com.adyen.model.checkout.CheckoutSessionInstallmentOption](docs/CheckoutSessionInstallmentOption.md)
 - [com.adyen.model.checkout.CheckoutThreeDS2Action](docs/CheckoutThreeDS2Action.md)
 - [com.adyen.model.checkout.CheckoutVoucherAction](docs/CheckoutVoucherAction.md)
 - [com.adyen.model.checkout.CommonField](docs/CommonField.md)
 - [com.adyen.model.checkout.Company](docs/Company.md)
 - [com.adyen.model.checkout.Configuration](docs/Configuration.md)
 - [com.adyen.model.checkout.CreateCheckoutSessionRequest](docs/CreateCheckoutSessionRequest.md)
 - [com.adyen.model.checkout.CreateCheckoutSessionResponse](docs/CreateCheckoutSessionResponse.md)
 - [com.adyen.model.checkout.CreateOrderRequest](docs/CreateOrderRequest.md)
 - [com.adyen.model.checkout.CreateOrderResponse](docs/CreateOrderResponse.md)
 - [com.adyen.model.checkout.DeliveryAddress](docs/DeliveryAddress.md)
 - [com.adyen.model.checkout.DetailsRequestAuthenticationData](docs/DetailsRequestAuthenticationData.md)
 - [com.adyen.model.checkout.DeviceRenderOptions](docs/DeviceRenderOptions.md)
 - [com.adyen.model.checkout.DokuDetails](docs/DokuDetails.md)
 - [com.adyen.model.checkout.DonationPaymentMethod](docs/DonationPaymentMethod.md)
 - [com.adyen.model.checkout.DonationPaymentRequest](docs/DonationPaymentRequest.md)
 - [com.adyen.model.checkout.DonationPaymentResponse](docs/DonationPaymentResponse.md)
 - [com.adyen.model.checkout.DotpayDetails](docs/DotpayDetails.md)
 - [com.adyen.model.checkout.DragonpayDetails](docs/DragonpayDetails.md)
 - [com.adyen.model.checkout.EcontextVoucherDetails](docs/EcontextVoucherDetails.md)
 - [com.adyen.model.checkout.EncryptedOrderData](docs/EncryptedOrderData.md)
 - [com.adyen.model.checkout.ExternalPlatform](docs/ExternalPlatform.md)
 - [com.adyen.model.checkout.ForexQuote](docs/ForexQuote.md)
 - [com.adyen.model.checkout.FraudCheckResult](docs/FraudCheckResult.md)
 - [com.adyen.model.checkout.FraudResult](docs/FraudResult.md)
 - [com.adyen.model.checkout.FundOrigin](docs/FundOrigin.md)
 - [com.adyen.model.checkout.FundRecipient](docs/FundRecipient.md)
 - [com.adyen.model.checkout.GenericIssuerPaymentMethodDetails](docs/GenericIssuerPaymentMethodDetails.md)
 - [com.adyen.model.checkout.GiropayDetails](docs/GiropayDetails.md)
 - [com.adyen.model.checkout.GooglePayDetails](docs/GooglePayDetails.md)
 - [com.adyen.model.checkout.IdealDetails](docs/IdealDetails.md)
 - [com.adyen.model.checkout.InputDetail](docs/InputDetail.md)
 - [com.adyen.model.checkout.InstallmentOption](docs/InstallmentOption.md)
 - [com.adyen.model.checkout.Installments](docs/Installments.md)
 - [com.adyen.model.checkout.InstallmentsNumber](docs/InstallmentsNumber.md)
 - [com.adyen.model.checkout.Item](docs/Item.md)
 - [com.adyen.model.checkout.KlarnaDetails](docs/KlarnaDetails.md)
 - [com.adyen.model.checkout.LineItem](docs/LineItem.md)
 - [com.adyen.model.checkout.ListStoredPaymentMethodsResponse](docs/ListStoredPaymentMethodsResponse.md)
 - [com.adyen.model.checkout.Mandate](docs/Mandate.md)
 - [com.adyen.model.checkout.MasterpassDetails](docs/MasterpassDetails.md)
 - [com.adyen.model.checkout.MbwayDetails](docs/MbwayDetails.md)
 - [com.adyen.model.checkout.MerchantDevice](docs/MerchantDevice.md)
 - [com.adyen.model.checkout.MerchantRiskIndicator](docs/MerchantRiskIndicator.md)
 - [com.adyen.model.checkout.MobilePayDetails](docs/MobilePayDetails.md)
 - [com.adyen.model.checkout.MolPayDetails](docs/MolPayDetails.md)
 - [com.adyen.model.checkout.Name](docs/Name.md)
 - [com.adyen.model.checkout.OpenInvoiceDetails](docs/OpenInvoiceDetails.md)
 - [com.adyen.model.checkout.PayPalDetails](docs/PayPalDetails.md)
 - [com.adyen.model.checkout.PayUUpiDetails](docs/PayUUpiDetails.md)
 - [com.adyen.model.checkout.PayWithGoogleDetails](docs/PayWithGoogleDetails.md)
 - [com.adyen.model.checkout.PaymentAmountUpdateRequest](docs/PaymentAmountUpdateRequest.md)
 - [com.adyen.model.checkout.PaymentAmountUpdateResponse](docs/PaymentAmountUpdateResponse.md)
 - [com.adyen.model.checkout.PaymentCancelRequest](docs/PaymentCancelRequest.md)
 - [com.adyen.model.checkout.PaymentCancelResponse](docs/PaymentCancelResponse.md)
 - [com.adyen.model.checkout.PaymentCaptureRequest](docs/PaymentCaptureRequest.md)
 - [com.adyen.model.checkout.PaymentCaptureResponse](docs/PaymentCaptureResponse.md)
 - [com.adyen.model.checkout.PaymentCompletionDetails](docs/PaymentCompletionDetails.md)
 - [com.adyen.model.checkout.PaymentDetails](docs/PaymentDetails.md)
 - [com.adyen.model.checkout.PaymentDetailsRequest](docs/PaymentDetailsRequest.md)
 - [com.adyen.model.checkout.PaymentDetailsResponse](docs/PaymentDetailsResponse.md)
 - [com.adyen.model.checkout.PaymentLinkRequest](docs/PaymentLinkRequest.md)
 - [com.adyen.model.checkout.PaymentLinkResponse](docs/PaymentLinkResponse.md)
 - [com.adyen.model.checkout.PaymentMethod](docs/PaymentMethod.md)
 - [com.adyen.model.checkout.PaymentMethodGroup](docs/PaymentMethodGroup.md)
 - [com.adyen.model.checkout.PaymentMethodIssuer](docs/PaymentMethodIssuer.md)
 - [com.adyen.model.checkout.PaymentMethodsRequest](docs/PaymentMethodsRequest.md)
 - [com.adyen.model.checkout.PaymentMethodsResponse](docs/PaymentMethodsResponse.md)
 - [com.adyen.model.checkout.PaymentRefundRequest](docs/PaymentRefundRequest.md)
 - [com.adyen.model.checkout.PaymentRefundResponse](docs/PaymentRefundResponse.md)
 - [com.adyen.model.checkout.PaymentRequest](docs/PaymentRequest.md)
 - [com.adyen.model.checkout.PaymentResponse](docs/PaymentResponse.md)
 - [com.adyen.model.checkout.PaymentResponseAction](docs/PaymentResponseAction.md)
 - [com.adyen.model.checkout.PaymentReversalRequest](docs/PaymentReversalRequest.md)
 - [com.adyen.model.checkout.PaymentReversalResponse](docs/PaymentReversalResponse.md)
 - [com.adyen.model.checkout.PaymentSetupRequest](docs/PaymentSetupRequest.md)
 - [com.adyen.model.checkout.PaymentSetupResponse](docs/PaymentSetupResponse.md)
 - [com.adyen.model.checkout.PaymentVerificationRequest](docs/PaymentVerificationRequest.md)
 - [com.adyen.model.checkout.PaymentVerificationResponse](docs/PaymentVerificationResponse.md)
 - [com.adyen.model.checkout.Phone](docs/Phone.md)
 - [com.adyen.model.checkout.PlatformChargebackLogic](docs/PlatformChargebackLogic.md)
 - [com.adyen.model.checkout.RatepayDetails](docs/RatepayDetails.md)
 - [com.adyen.model.checkout.Recurring](docs/Recurring.md)
 - [com.adyen.model.checkout.RecurringDetail](docs/RecurringDetail.md)
 - [com.adyen.model.checkout.ResponseAdditionalData3DSecure](docs/ResponseAdditionalData3DSecure.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataBillingAddress](docs/ResponseAdditionalDataBillingAddress.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataCard](docs/ResponseAdditionalDataCard.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataCommon](docs/ResponseAdditionalDataCommon.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataDomesticError](docs/ResponseAdditionalDataDomesticError.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataInstallments](docs/ResponseAdditionalDataInstallments.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataNetworkTokens](docs/ResponseAdditionalDataNetworkTokens.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataOpi](docs/ResponseAdditionalDataOpi.md)
 - [com.adyen.model.checkout.ResponseAdditionalDataSepa](docs/ResponseAdditionalDataSepa.md)
 - [com.adyen.model.checkout.ResponsePaymentMethod](docs/ResponsePaymentMethod.md)
 - [com.adyen.model.checkout.RiskData](docs/RiskData.md)
 - [com.adyen.model.checkout.SDKEphemPubKey](docs/SDKEphemPubKey.md)
 - [com.adyen.model.checkout.SamsungPayDetails](docs/SamsungPayDetails.md)
 - [com.adyen.model.checkout.SepaDirectDebitDetails](docs/SepaDirectDebitDetails.md)
 - [com.adyen.model.checkout.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.checkout.ServiceErrorDetails](docs/ServiceErrorDetails.md)
 - [com.adyen.model.checkout.SessionResultResponse](docs/SessionResultResponse.md)
 - [com.adyen.model.checkout.ShopperInput](docs/ShopperInput.md)
 - [com.adyen.model.checkout.ShopperInteractionDevice](docs/ShopperInteractionDevice.md)
 - [com.adyen.model.checkout.Split](docs/Split.md)
 - [com.adyen.model.checkout.SplitAmount](docs/SplitAmount.md)
 - [com.adyen.model.checkout.StandalonePaymentCancelRequest](docs/StandalonePaymentCancelRequest.md)
 - [com.adyen.model.checkout.StandalonePaymentCancelResponse](docs/StandalonePaymentCancelResponse.md)
 - [com.adyen.model.checkout.StoredDetails](docs/StoredDetails.md)
 - [com.adyen.model.checkout.StoredPaymentMethod](docs/StoredPaymentMethod.md)
 - [com.adyen.model.checkout.StoredPaymentMethodDetails](docs/StoredPaymentMethodDetails.md)
 - [com.adyen.model.checkout.StoredPaymentMethodResource](docs/StoredPaymentMethodResource.md)
 - [com.adyen.model.checkout.SubInputDetail](docs/SubInputDetail.md)
 - [com.adyen.model.checkout.SubMerchant](docs/SubMerchant.md)
 - [com.adyen.model.checkout.SubMerchantInfo](docs/SubMerchantInfo.md)
 - [com.adyen.model.checkout.ThreeDS2RequestData](docs/ThreeDS2RequestData.md)
 - [com.adyen.model.checkout.ThreeDS2RequestFields](docs/ThreeDS2RequestFields.md)
 - [com.adyen.model.checkout.ThreeDS2ResponseData](docs/ThreeDS2ResponseData.md)
 - [com.adyen.model.checkout.ThreeDS2Result](docs/ThreeDS2Result.md)
 - [com.adyen.model.checkout.ThreeDSRequestData](docs/ThreeDSRequestData.md)
 - [com.adyen.model.checkout.ThreeDSRequestorAuthenticationInfo](docs/ThreeDSRequestorAuthenticationInfo.md)
 - [com.adyen.model.checkout.ThreeDSRequestorPriorAuthenticationInfo](docs/ThreeDSRequestorPriorAuthenticationInfo.md)
 - [com.adyen.model.checkout.ThreeDSecureData](docs/ThreeDSecureData.md)
 - [com.adyen.model.checkout.UpdatePaymentLinkRequest](docs/UpdatePaymentLinkRequest.md)
 - [com.adyen.model.checkout.UpiCollectDetails](docs/UpiCollectDetails.md)
 - [com.adyen.model.checkout.UpiIntentDetails](docs/UpiIntentDetails.md)
 - [com.adyen.model.checkout.UtilityRequest](docs/UtilityRequest.md)
 - [com.adyen.model.checkout.UtilityResponse](docs/UtilityResponse.md)
 - [com.adyen.model.checkout.VippsDetails](docs/VippsDetails.md)
 - [com.adyen.model.checkout.VisaCheckoutDetails](docs/VisaCheckoutDetails.md)
 - [com.adyen.model.checkout.WeChatPayDetails](docs/WeChatPayDetails.md)
 - [com.adyen.model.checkout.WeChatPayMiniProgramDetails](docs/WeChatPayMiniProgramDetails.md)
 - [com.adyen.model.checkout.ZipDetails](docs/ZipDetails.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen Data Protection API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://ca-test.adyen.com/ca/services/DataProtectionService/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postRequestSubjectErasure**](docs/GeneralApi.md#postrequestsubjecterasure) | **POST** /requestSubjectErasure | Submit a Subject Erasure Request.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.dataprotection.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.dataprotection.SubjectErasureByPspReferenceRequest](docs/SubjectErasureByPspReferenceRequest.md)
 - [com.adyen.model.dataprotection.SubjectErasureResponse](docs/SubjectErasureResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Legal Entity Management API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BusinessLinesApi* | [**deleteBusinessLinesId**](docs/BusinessLinesApi.md#deletebusinesslinesid) | **DELETE** /businessLines/{id} | Delete a business line
*BusinessLinesApi* | [**getBusinessLinesId**](docs/BusinessLinesApi.md#getbusinesslinesid) | **GET** /businessLines/{id} | Get a business line
*BusinessLinesApi* | [**patchBusinessLinesId**](docs/BusinessLinesApi.md#patchbusinesslinesid) | **PATCH** /businessLines/{id} | Update a business line
*BusinessLinesApi* | [**postBusinessLines**](docs/BusinessLinesApi.md#postbusinesslines) | **POST** /businessLines | Create a business line
*DocumentsApi* | [**deleteDocumentsId**](docs/DocumentsApi.md#deletedocumentsid) | **DELETE** /documents/{id} | Delete a document
*DocumentsApi* | [**getDocumentsId**](docs/DocumentsApi.md#getdocumentsid) | **GET** /documents/{id} | Get a document
*DocumentsApi* | [**patchDocumentsId**](docs/DocumentsApi.md#patchdocumentsid) | **PATCH** /documents/{id} | Update a document
*DocumentsApi* | [**postDocuments**](docs/DocumentsApi.md#postdocuments) | **POST** /documents | Upload a document for verification checks
*HostedOnboardingApi* | [**getThemes**](docs/HostedOnboardingApi.md#getthemes) | **GET** /themes | Get a list of hosted onboarding page themes
*HostedOnboardingApi* | [**getThemesId**](docs/HostedOnboardingApi.md#getthemesid) | **GET** /themes/{id} | Get an onboarding link theme
*HostedOnboardingApi* | [**postLegalEntitiesIdOnboardingLinks**](docs/HostedOnboardingApi.md#postlegalentitiesidonboardinglinks) | **POST** /legalEntities/{id}/onboardingLinks | Get a link to an Adyen-hosted onboarding page
*LegalEntitiesApi* | [**getLegalEntitiesId**](docs/LegalEntitiesApi.md#getlegalentitiesid) | **GET** /legalEntities/{id} | Get a legal entity
*LegalEntitiesApi* | [**getLegalEntitiesIdBusinessLines**](docs/LegalEntitiesApi.md#getlegalentitiesidbusinesslines) | **GET** /legalEntities/{id}/businessLines | Get all business lines under a legal entity
*LegalEntitiesApi* | [**patchLegalEntitiesId**](docs/LegalEntitiesApi.md#patchlegalentitiesid) | **PATCH** /legalEntities/{id} | Update a legal entity
*LegalEntitiesApi* | [**postLegalEntities**](docs/LegalEntitiesApi.md#postlegalentities) | **POST** /legalEntities | Create a legal entity
*LegalEntitiesApi* | [**postLegalEntitiesIdCheckVerificationErrors**](docs/LegalEntitiesApi.md#postlegalentitiesidcheckverificationerrors) | **POST** /legalEntities/{id}/checkVerificationErrors | Check a legal entity's verification errors
*LegalEntitiesApi* | [**postLegalEntitiesIdConfirmDataReview**](docs/LegalEntitiesApi.md#postlegalentitiesidconfirmdatareview) | **POST** /legalEntities/{id}/confirmDataReview | Confirm data review
*PCIQuestionnairesApi* | [**getLegalEntitiesIdPciQuestionnaires**](docs/PCIQuestionnairesApi.md#getlegalentitiesidpciquestionnaires) | **GET** /legalEntities/{id}/pciQuestionnaires | Get PCI questionnaire details
*PCIQuestionnairesApi* | [**getLegalEntitiesIdPciQuestionnairesPciid**](docs/PCIQuestionnairesApi.md#getlegalentitiesidpciquestionnairespciid) | **GET** /legalEntities/{id}/pciQuestionnaires/{pciid} | Get PCI questionnaire
*PCIQuestionnairesApi* | [**postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates**](docs/PCIQuestionnairesApi.md#postlegalentitiesidpciquestionnairesgeneratepcitemplates) | **POST** /legalEntities/{id}/pciQuestionnaires/generatePciTemplates | Generate PCI questionnaire
*PCIQuestionnairesApi* | [**postLegalEntitiesIdPciQuestionnairesSignPciTemplates**](docs/PCIQuestionnairesApi.md#postlegalentitiesidpciquestionnairessignpcitemplates) | **POST** /legalEntities/{id}/pciQuestionnaires/signPciTemplates | Sign PCI questionnaire
*TermsOfServiceApi* | [**getLegalEntitiesIdTermsOfServiceAcceptanceInfos**](docs/TermsOfServiceApi.md#getlegalentitiesidtermsofserviceacceptanceinfos) | **GET** /legalEntities/{id}/termsOfServiceAcceptanceInfos | Get Terms of Service information for a legal entity
*TermsOfServiceApi* | [**getLegalEntitiesIdTermsOfServiceStatus**](docs/TermsOfServiceApi.md#getlegalentitiesidtermsofservicestatus) | **GET** /legalEntities/{id}/termsOfServiceStatus | Get Terms of Service status
*TermsOfServiceApi* | [**patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid**](docs/TermsOfServiceApi.md#patchlegalentitiesidtermsofservicetermsofservicedocumentid) | **PATCH** /legalEntities/{id}/termsOfService/{termsofservicedocumentid} | Accept Terms of Service
*TermsOfServiceApi* | [**postLegalEntitiesIdTermsOfService**](docs/TermsOfServiceApi.md#postlegalentitiesidtermsofservice) | **POST** /legalEntities/{id}/termsOfService | Get Terms of Service document
*TransferInstrumentsApi* | [**deleteTransferInstrumentsId**](docs/TransferInstrumentsApi.md#deletetransferinstrumentsid) | **DELETE** /transferInstruments/{id} | Delete a transfer instrument
*TransferInstrumentsApi* | [**getTransferInstrumentsId**](docs/TransferInstrumentsApi.md#gettransferinstrumentsid) | **GET** /transferInstruments/{id} | Get a transfer instrument
*TransferInstrumentsApi* | [**patchTransferInstrumentsId**](docs/TransferInstrumentsApi.md#patchtransferinstrumentsid) | **PATCH** /transferInstruments/{id} | Update a transfer instrument
*TransferInstrumentsApi* | [**postTransferInstruments**](docs/TransferInstrumentsApi.md#posttransferinstruments) | **POST** /transferInstruments | Create a transfer instrument


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.legalentitymanagement.AULocalAccountIdentification](docs/AULocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.AcceptTermsOfServiceRequest](docs/AcceptTermsOfServiceRequest.md)
 - [com.adyen.model.legalentitymanagement.AcceptTermsOfServiceResponse](docs/AcceptTermsOfServiceResponse.md)
 - [com.adyen.model.legalentitymanagement.AdditionalBankIdentification](docs/AdditionalBankIdentification.md)
 - [com.adyen.model.legalentitymanagement.Address](docs/Address.md)
 - [com.adyen.model.legalentitymanagement.Amount](docs/Amount.md)
 - [com.adyen.model.legalentitymanagement.Attachment](docs/Attachment.md)
 - [com.adyen.model.legalentitymanagement.BankAccountInfo](docs/BankAccountInfo.md)
 - [com.adyen.model.legalentitymanagement.BankAccountInfoAccountIdentification](docs/BankAccountInfoAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.BirthData](docs/BirthData.md)
 - [com.adyen.model.legalentitymanagement.BusinessLine](docs/BusinessLine.md)
 - [com.adyen.model.legalentitymanagement.BusinessLineInfo](docs/BusinessLineInfo.md)
 - [com.adyen.model.legalentitymanagement.BusinessLineInfoUpdate](docs/BusinessLineInfoUpdate.md)
 - [com.adyen.model.legalentitymanagement.BusinessLines](docs/BusinessLines.md)
 - [com.adyen.model.legalentitymanagement.CALocalAccountIdentification](docs/CALocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.CZLocalAccountIdentification](docs/CZLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.CalculateTermsOfServiceStatusResponse](docs/CalculateTermsOfServiceStatusResponse.md)
 - [com.adyen.model.legalentitymanagement.CapabilityProblem](docs/CapabilityProblem.md)
 - [com.adyen.model.legalentitymanagement.CapabilityProblemEntity](docs/CapabilityProblemEntity.md)
 - [com.adyen.model.legalentitymanagement.CapabilityProblemEntityMinusRecursive](docs/CapabilityProblemEntityMinusRecursive.md)
 - [com.adyen.model.legalentitymanagement.CapabilitySettings](docs/CapabilitySettings.md)
 - [com.adyen.model.legalentitymanagement.DKLocalAccountIdentification](docs/DKLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.DataReviewConfirmationResponse](docs/DataReviewConfirmationResponse.md)
 - [com.adyen.model.legalentitymanagement.Document](docs/Document.md)
 - [com.adyen.model.legalentitymanagement.DocumentPage](docs/DocumentPage.md)
 - [com.adyen.model.legalentitymanagement.DocumentReference](docs/DocumentReference.md)
 - [com.adyen.model.legalentitymanagement.EntityReference](docs/EntityReference.md)
 - [com.adyen.model.legalentitymanagement.GeneratePciDescriptionRequest](docs/GeneratePciDescriptionRequest.md)
 - [com.adyen.model.legalentitymanagement.GeneratePciDescriptionResponse](docs/GeneratePciDescriptionResponse.md)
 - [com.adyen.model.legalentitymanagement.GetPciQuestionnaireInfosResponse](docs/GetPciQuestionnaireInfosResponse.md)
 - [com.adyen.model.legalentitymanagement.GetPciQuestionnaireResponse](docs/GetPciQuestionnaireResponse.md)
 - [com.adyen.model.legalentitymanagement.GetTermsOfServiceAcceptanceInfosResponse](docs/GetTermsOfServiceAcceptanceInfosResponse.md)
 - [com.adyen.model.legalentitymanagement.GetTermsOfServiceDocumentRequest](docs/GetTermsOfServiceDocumentRequest.md)
 - [com.adyen.model.legalentitymanagement.GetTermsOfServiceDocumentResponse](docs/GetTermsOfServiceDocumentResponse.md)
 - [com.adyen.model.legalentitymanagement.HKLocalAccountIdentification](docs/HKLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.HULocalAccountIdentification](docs/HULocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.IbanAccountIdentification](docs/IbanAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.IdentificationData](docs/IdentificationData.md)
 - [com.adyen.model.legalentitymanagement.Individual](docs/Individual.md)
 - [com.adyen.model.legalentitymanagement.LegalEntity](docs/LegalEntity.md)
 - [com.adyen.model.legalentitymanagement.LegalEntityAssociation](docs/LegalEntityAssociation.md)
 - [com.adyen.model.legalentitymanagement.LegalEntityCapability](docs/LegalEntityCapability.md)
 - [com.adyen.model.legalentitymanagement.LegalEntityInfo](docs/LegalEntityInfo.md)
 - [com.adyen.model.legalentitymanagement.LegalEntityInfoRequiredType](docs/LegalEntityInfoRequiredType.md)
 - [com.adyen.model.legalentitymanagement.NOLocalAccountIdentification](docs/NOLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.NZLocalAccountIdentification](docs/NZLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.Name](docs/Name.md)
 - [com.adyen.model.legalentitymanagement.NumberAndBicAccountIdentification](docs/NumberAndBicAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.OnboardingLink](docs/OnboardingLink.md)
 - [com.adyen.model.legalentitymanagement.OnboardingLinkInfo](docs/OnboardingLinkInfo.md)
 - [com.adyen.model.legalentitymanagement.OnboardingTheme](docs/OnboardingTheme.md)
 - [com.adyen.model.legalentitymanagement.OnboardingThemes](docs/OnboardingThemes.md)
 - [com.adyen.model.legalentitymanagement.Organization](docs/Organization.md)
 - [com.adyen.model.legalentitymanagement.OwnerEntity](docs/OwnerEntity.md)
 - [com.adyen.model.legalentitymanagement.PLLocalAccountIdentification](docs/PLLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.PciDocumentInfo](docs/PciDocumentInfo.md)
 - [com.adyen.model.legalentitymanagement.PciSigningRequest](docs/PciSigningRequest.md)
 - [com.adyen.model.legalentitymanagement.PciSigningResponse](docs/PciSigningResponse.md)
 - [com.adyen.model.legalentitymanagement.PhoneNumber](docs/PhoneNumber.md)
 - [com.adyen.model.legalentitymanagement.RemediatingAction](docs/RemediatingAction.md)
 - [com.adyen.model.legalentitymanagement.SELocalAccountIdentification](docs/SELocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.SGLocalAccountIdentification](docs/SGLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.legalentitymanagement.SoleProprietorship](docs/SoleProprietorship.md)
 - [com.adyen.model.legalentitymanagement.SourceOfFunds](docs/SourceOfFunds.md)
 - [com.adyen.model.legalentitymanagement.StockData](docs/StockData.md)
 - [com.adyen.model.legalentitymanagement.SupportingEntityCapability](docs/SupportingEntityCapability.md)
 - [com.adyen.model.legalentitymanagement.TaxInformation](docs/TaxInformation.md)
 - [com.adyen.model.legalentitymanagement.TaxReportingClassification](docs/TaxReportingClassification.md)
 - [com.adyen.model.legalentitymanagement.TermsOfServiceAcceptanceInfo](docs/TermsOfServiceAcceptanceInfo.md)
 - [com.adyen.model.legalentitymanagement.TransferInstrument](docs/TransferInstrument.md)
 - [com.adyen.model.legalentitymanagement.TransferInstrumentInfo](docs/TransferInstrumentInfo.md)
 - [com.adyen.model.legalentitymanagement.TransferInstrumentReference](docs/TransferInstrumentReference.md)
 - [com.adyen.model.legalentitymanagement.Trust](docs/Trust.md)
 - [com.adyen.model.legalentitymanagement.UKLocalAccountIdentification](docs/UKLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.USLocalAccountIdentification](docs/USLocalAccountIdentification.md)
 - [com.adyen.model.legalentitymanagement.UndefinedBeneficiary](docs/UndefinedBeneficiary.md)
 - [com.adyen.model.legalentitymanagement.UnincorporatedPartnership](docs/UnincorporatedPartnership.md)
 - [com.adyen.model.legalentitymanagement.VerificationDeadline](docs/VerificationDeadline.md)
 - [com.adyen.model.legalentitymanagement.VerificationError](docs/VerificationError.md)
 - [com.adyen.model.legalentitymanagement.VerificationErrorMinusRecursive](docs/VerificationErrorMinusRecursive.md)
 - [com.adyen.model.legalentitymanagement.VerificationErrors](docs/VerificationErrors.md)
 - [com.adyen.model.legalentitymanagement.WebData](docs/WebData.md)
 - [com.adyen.model.legalentitymanagement.WebDataExemption](docs/WebDataExemption.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Management API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://management-test.adyen.com/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*APICredentialsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentials**](docs/APICredentialsCompanyLevelApi.md#getcompaniescompanyidapicredentials) | **GET** /companies/{companyId}/apiCredentials | Get a list of API credentials
*APICredentialsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentialsApiCredentialId**](docs/APICredentialsCompanyLevelApi.md#getcompaniescompanyidapicredentialsapicredentialid) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId} | Get an API credential
*APICredentialsCompanyLevelApi* | [**patchCompaniesCompanyIdApiCredentialsApiCredentialId**](docs/APICredentialsCompanyLevelApi.md#patchcompaniescompanyidapicredentialsapicredentialid) | **PATCH** /companies/{companyId}/apiCredentials/{apiCredentialId} | Update an API credential.
*APICredentialsCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentials**](docs/APICredentialsCompanyLevelApi.md#postcompaniescompanyidapicredentials) | **POST** /companies/{companyId}/apiCredentials | Create an API credential.
*APICredentialsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentials**](docs/APICredentialsMerchantLevelApi.md#getmerchantsmerchantidapicredentials) | **GET** /merchants/{merchantId}/apiCredentials | Get a list of API credentials
*APICredentialsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentialsApiCredentialId**](docs/APICredentialsMerchantLevelApi.md#getmerchantsmerchantidapicredentialsapicredentialid) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId} | Get an API credential
*APICredentialsMerchantLevelApi* | [**patchMerchantsMerchantIdApiCredentialsApiCredentialId**](docs/APICredentialsMerchantLevelApi.md#patchmerchantsmerchantidapicredentialsapicredentialid) | **PATCH** /merchants/{merchantId}/apiCredentials/{apiCredentialId} | Update an API credential
*APICredentialsMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentials**](docs/APICredentialsMerchantLevelApi.md#postmerchantsmerchantidapicredentials) | **POST** /merchants/{merchantId}/apiCredentials | Create an API credential
*APIKeyCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey**](docs/APIKeyCompanyLevelApi.md#postcompaniescompanyidapicredentialsapicredentialidgenerateapikey) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/generateApiKey | Generate new API key
*APIKeyMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey**](docs/APIKeyMerchantLevelApi.md#postmerchantsmerchantidapicredentialsapicredentialidgenerateapikey) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateApiKey | Generate new API key
*AccountCompanyLevelApi* | [**getCompanies**](docs/AccountCompanyLevelApi.md#getcompanies) | **GET** /companies | Get a list of company accounts
*AccountCompanyLevelApi* | [**getCompaniesCompanyId**](docs/AccountCompanyLevelApi.md#getcompaniescompanyid) | **GET** /companies/{companyId} | Get a company account
*AccountCompanyLevelApi* | [**getCompaniesCompanyIdMerchants**](docs/AccountCompanyLevelApi.md#getcompaniescompanyidmerchants) | **GET** /companies/{companyId}/merchants | Get a list of merchant accounts
*AccountMerchantLevelApi* | [**getMerchants**](docs/AccountMerchantLevelApi.md#getmerchants) | **GET** /merchants | Get a list of merchant accounts
*AccountMerchantLevelApi* | [**getMerchantsMerchantId**](docs/AccountMerchantLevelApi.md#getmerchantsmerchantid) | **GET** /merchants/{merchantId} | Get a merchant account
*AccountMerchantLevelApi* | [**postMerchants**](docs/AccountMerchantLevelApi.md#postmerchants) | **POST** /merchants | Create a merchant account
*AccountMerchantLevelApi* | [**postMerchantsMerchantIdActivate**](docs/AccountMerchantLevelApi.md#postmerchantsmerchantidactivate) | **POST** /merchants/{merchantId}/activate | Request to activate a merchant account
*AccountStoreLevelApi* | [**getMerchantsMerchantIdStores**](docs/AccountStoreLevelApi.md#getmerchantsmerchantidstores) | **GET** /merchants/{merchantId}/stores | Get a list of stores
*AccountStoreLevelApi* | [**getMerchantsMerchantIdStoresStoreId**](docs/AccountStoreLevelApi.md#getmerchantsmerchantidstoresstoreid) | **GET** /merchants/{merchantId}/stores/{storeId} | Get a store
*AccountStoreLevelApi* | [**getStores**](docs/AccountStoreLevelApi.md#getstores) | **GET** /stores | Get a list of stores
*AccountStoreLevelApi* | [**getStoresStoreId**](docs/AccountStoreLevelApi.md#getstoresstoreid) | **GET** /stores/{storeId} | Get a store
*AccountStoreLevelApi* | [**patchMerchantsMerchantIdStoresStoreId**](docs/AccountStoreLevelApi.md#patchmerchantsmerchantidstoresstoreid) | **PATCH** /merchants/{merchantId}/stores/{storeId} | Update a store
*AccountStoreLevelApi* | [**patchStoresStoreId**](docs/AccountStoreLevelApi.md#patchstoresstoreid) | **PATCH** /stores/{storeId} | Update a store
*AccountStoreLevelApi* | [**postMerchantsMerchantIdStores**](docs/AccountStoreLevelApi.md#postmerchantsmerchantidstores) | **POST** /merchants/{merchantId}/stores | Create a store
*AccountStoreLevelApi* | [**postStores**](docs/AccountStoreLevelApi.md#poststores) | **POST** /stores | Create a store
*AllowedOriginsCompanyLevelApi* | [**deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsCompanyLevelApi.md#deletecompaniescompanyidapicredentialsapicredentialidallowedoriginsoriginid) | **DELETE** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Delete an allowed origin
*AllowedOriginsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsCompanyLevelApi.md#getcompaniescompanyidapicredentialsapicredentialidallowedorigins) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins | Get a list of allowed origins
*AllowedOriginsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsCompanyLevelApi.md#getcompaniescompanyidapicredentialsapicredentialidallowedoriginsoriginid) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Get an allowed origin
*AllowedOriginsCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsCompanyLevelApi.md#postcompaniescompanyidapicredentialsapicredentialidallowedorigins) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins | Create an allowed origin
*AllowedOriginsMerchantLevelApi* | [**deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsMerchantLevelApi.md#deletemerchantsmerchantidapicredentialsapicredentialidallowedoriginsoriginid) | **DELETE** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Delete an allowed origin
*AllowedOriginsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsMerchantLevelApi.md#getmerchantsmerchantidapicredentialsapicredentialidallowedorigins) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins | Get a list of allowed origins
*AllowedOriginsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsMerchantLevelApi.md#getmerchantsmerchantidapicredentialsapicredentialidallowedoriginsoriginid) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Get an allowed origin
*AllowedOriginsMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsMerchantLevelApi.md#postmerchantsmerchantidapicredentialsapicredentialidallowedorigins) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins | Create an allowed origin
*AndroidFilesCompanyLevelApi* | [**getCompaniesCompanyIdAndroidApps**](docs/AndroidFilesCompanyLevelApi.md#getcompaniescompanyidandroidapps) | **GET** /companies/{companyId}/androidApps | Get a list of Android apps
*AndroidFilesCompanyLevelApi* | [**getCompaniesCompanyIdAndroidAppsId**](docs/AndroidFilesCompanyLevelApi.md#getcompaniescompanyidandroidappsid) | **GET** /companies/{companyId}/androidApps/{id} | Get Android app
*AndroidFilesCompanyLevelApi* | [**getCompaniesCompanyIdAndroidCertificates**](docs/AndroidFilesCompanyLevelApi.md#getcompaniescompanyidandroidcertificates) | **GET** /companies/{companyId}/androidCertificates | Get a list of Android certificates
*AndroidFilesCompanyLevelApi* | [**postCompaniesCompanyIdAndroidApps**](docs/AndroidFilesCompanyLevelApi.md#postcompaniescompanyidandroidapps) | **POST** /companies/{companyId}/androidApps | Upload Android App
*ClientKeyCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateClientKey**](docs/ClientKeyCompanyLevelApi.md#postcompaniescompanyidapicredentialsapicredentialidgenerateclientkey) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/generateClientKey | Generate new client key
*ClientKeyMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey**](docs/ClientKeyMerchantLevelApi.md#postmerchantsmerchantidapicredentialsapicredentialidgenerateclientkey) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateClientKey | Generate new client key
*MyAPICredentialApi* | [**deleteMeAllowedOriginsOriginId**](docs/MyAPICredentialApi.md#deletemeallowedoriginsoriginid) | **DELETE** /me/allowedOrigins/{originId} | Remove allowed origin
*MyAPICredentialApi* | [**getMe**](docs/MyAPICredentialApi.md#getme) | **GET** /me | Get API credential details
*MyAPICredentialApi* | [**getMeAllowedOrigins**](docs/MyAPICredentialApi.md#getmeallowedorigins) | **GET** /me/allowedOrigins | Get allowed origins
*MyAPICredentialApi* | [**getMeAllowedOriginsOriginId**](docs/MyAPICredentialApi.md#getmeallowedoriginsoriginid) | **GET** /me/allowedOrigins/{originId} | Get allowed origin details
*MyAPICredentialApi* | [**postMeAllowedOrigins**](docs/MyAPICredentialApi.md#postmeallowedorigins) | **POST** /me/allowedOrigins | Add allowed origin
*MyAPICredentialApi* | [**postMeGenerateClientKey**](docs/MyAPICredentialApi.md#postmegenerateclientkey) | **POST** /me/generateClientKey | Generate a client key
*PaymentMethodsMerchantLevelApi* | [**getMerchantsMerchantIdPaymentMethodSettings**](docs/PaymentMethodsMerchantLevelApi.md#getmerchantsmerchantidpaymentmethodsettings) | **GET** /merchants/{merchantId}/paymentMethodSettings | Get all payment methods
*PaymentMethodsMerchantLevelApi* | [**getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](docs/PaymentMethodsMerchantLevelApi.md#getmerchantsmerchantidpaymentmethodsettingspaymentmethodid) | **GET** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Get payment method details
*PaymentMethodsMerchantLevelApi* | [**getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains**](docs/PaymentMethodsMerchantLevelApi.md#getmerchantsmerchantidpaymentmethodsettingspaymentmethodidgetapplepaydomains) | **GET** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId}/getApplePayDomains | Get Apple Pay domains
*PaymentMethodsMerchantLevelApi* | [**patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](docs/PaymentMethodsMerchantLevelApi.md#patchmerchantsmerchantidpaymentmethodsettingspaymentmethodid) | **PATCH** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Update a payment method
*PaymentMethodsMerchantLevelApi* | [**postMerchantsMerchantIdPaymentMethodSettings**](docs/PaymentMethodsMerchantLevelApi.md#postmerchantsmerchantidpaymentmethodsettings) | **POST** /merchants/{merchantId}/paymentMethodSettings | Request a payment method
*PaymentMethodsMerchantLevelApi* | [**postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains**](docs/PaymentMethodsMerchantLevelApi.md#postmerchantsmerchantidpaymentmethodsettingspaymentmethodidaddapplepaydomains) | **POST** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId}/addApplePayDomains | Add an Apple Pay domain
*PayoutSettingsMerchantLevelApi* | [**deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](docs/PayoutSettingsMerchantLevelApi.md#deletemerchantsmerchantidpayoutsettingspayoutsettingsid) | **DELETE** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Delete a payout setting
*PayoutSettingsMerchantLevelApi* | [**getMerchantsMerchantIdPayoutSettings**](docs/PayoutSettingsMerchantLevelApi.md#getmerchantsmerchantidpayoutsettings) | **GET** /merchants/{merchantId}/payoutSettings | Get a list of payout settings
*PayoutSettingsMerchantLevelApi* | [**getMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](docs/PayoutSettingsMerchantLevelApi.md#getmerchantsmerchantidpayoutsettingspayoutsettingsid) | **GET** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Get a payout setting
*PayoutSettingsMerchantLevelApi* | [**patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](docs/PayoutSettingsMerchantLevelApi.md#patchmerchantsmerchantidpayoutsettingspayoutsettingsid) | **PATCH** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Update a payout setting
*PayoutSettingsMerchantLevelApi* | [**postMerchantsMerchantIdPayoutSettings**](docs/PayoutSettingsMerchantLevelApi.md#postmerchantsmerchantidpayoutsettings) | **POST** /merchants/{merchantId}/payoutSettings | Add a payout setting
*SplitConfigurationMerchantLevelApi* | [**deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](docs/SplitConfigurationMerchantLevelApi.md#deletemerchantsmerchantidsplitconfigurationssplitconfigurationid) | **DELETE** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Delete a split configuration
*SplitConfigurationMerchantLevelApi* | [**deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId**](docs/SplitConfigurationMerchantLevelApi.md#deletemerchantsmerchantidsplitconfigurationssplitconfigurationidrulesruleid) | **DELETE** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId}/rules/{ruleId} | Delete a split configuration rule
*SplitConfigurationMerchantLevelApi* | [**getMerchantsMerchantIdSplitConfigurations**](docs/SplitConfigurationMerchantLevelApi.md#getmerchantsmerchantidsplitconfigurations) | **GET** /merchants/{merchantId}/splitConfigurations | Get a list of split configurations
*SplitConfigurationMerchantLevelApi* | [**getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](docs/SplitConfigurationMerchantLevelApi.md#getmerchantsmerchantidsplitconfigurationssplitconfigurationid) | **GET** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Get a split configuration
*SplitConfigurationMerchantLevelApi* | [**patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](docs/SplitConfigurationMerchantLevelApi.md#patchmerchantsmerchantidsplitconfigurationssplitconfigurationid) | **PATCH** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Update split configuration description
*SplitConfigurationMerchantLevelApi* | [**patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId**](docs/SplitConfigurationMerchantLevelApi.md#patchmerchantsmerchantidsplitconfigurationssplitconfigurationidrulesruleid) | **PATCH** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId}/rules/{ruleId} | Update split conditions
*SplitConfigurationMerchantLevelApi* | [**patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId**](docs/SplitConfigurationMerchantLevelApi.md#patchmerchantsmerchantidsplitconfigurationssplitconfigurationidrulesruleidsplitlogicsplitlogicid) | **PATCH** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId}/rules/{ruleId}/splitLogic/{splitLogicId} | Update the split logic
*SplitConfigurationMerchantLevelApi* | [**postMerchantsMerchantIdSplitConfigurations**](docs/SplitConfigurationMerchantLevelApi.md#postmerchantsmerchantidsplitconfigurations) | **POST** /merchants/{merchantId}/splitConfigurations | Create a split configuration
*SplitConfigurationMerchantLevelApi* | [**postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](docs/SplitConfigurationMerchantLevelApi.md#postmerchantsmerchantidsplitconfigurationssplitconfigurationid) | **POST** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Create a rule
*TerminalActionsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalActions**](docs/TerminalActionsCompanyLevelApi.md#getcompaniescompanyidterminalactions) | **GET** /companies/{companyId}/terminalActions | Get a list of terminal actions
*TerminalActionsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalActionsActionId**](docs/TerminalActionsCompanyLevelApi.md#getcompaniescompanyidterminalactionsactionid) | **GET** /companies/{companyId}/terminalActions/{actionId} | Get terminal action
*TerminalActionsTerminalLevelApi* | [**postTerminalsScheduleActions**](docs/TerminalActionsTerminalLevelApi.md#postterminalsscheduleactions) | **POST** /terminals/scheduleActions | Create a terminal action
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdBillingEntities**](docs/TerminalOrdersCompanyLevelApi.md#getcompaniescompanyidbillingentities) | **GET** /companies/{companyId}/billingEntities | Get a list of billing entities
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdShippingLocations**](docs/TerminalOrdersCompanyLevelApi.md#getcompaniescompanyidshippinglocations) | **GET** /companies/{companyId}/shippingLocations | Get a list of shipping locations
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalModels**](docs/TerminalOrdersCompanyLevelApi.md#getcompaniescompanyidterminalmodels) | **GET** /companies/{companyId}/terminalModels | Get a list of terminal models
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalOrders**](docs/TerminalOrdersCompanyLevelApi.md#getcompaniescompanyidterminalorders) | **GET** /companies/{companyId}/terminalOrders | Get a list of orders
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalOrdersOrderId**](docs/TerminalOrdersCompanyLevelApi.md#getcompaniescompanyidterminalordersorderid) | **GET** /companies/{companyId}/terminalOrders/{orderId} | Get an order
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalProducts**](docs/TerminalOrdersCompanyLevelApi.md#getcompaniescompanyidterminalproducts) | **GET** /companies/{companyId}/terminalProducts | Get a list of terminal products
*TerminalOrdersCompanyLevelApi* | [**patchCompaniesCompanyIdTerminalOrdersOrderId**](docs/TerminalOrdersCompanyLevelApi.md#patchcompaniescompanyidterminalordersorderid) | **PATCH** /companies/{companyId}/terminalOrders/{orderId} | Update an order
*TerminalOrdersCompanyLevelApi* | [**postCompaniesCompanyIdShippingLocations**](docs/TerminalOrdersCompanyLevelApi.md#postcompaniescompanyidshippinglocations) | **POST** /companies/{companyId}/shippingLocations | Create a shipping location
*TerminalOrdersCompanyLevelApi* | [**postCompaniesCompanyIdTerminalOrders**](docs/TerminalOrdersCompanyLevelApi.md#postcompaniescompanyidterminalorders) | **POST** /companies/{companyId}/terminalOrders | Create an order
*TerminalOrdersCompanyLevelApi* | [**postCompaniesCompanyIdTerminalOrdersOrderIdCancel**](docs/TerminalOrdersCompanyLevelApi.md#postcompaniescompanyidterminalordersorderidcancel) | **POST** /companies/{companyId}/terminalOrders/{orderId}/cancel | Cancel an order
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdBillingEntities**](docs/TerminalOrdersMerchantLevelApi.md#getmerchantsmerchantidbillingentities) | **GET** /merchants/{merchantId}/billingEntities | Get a list of billing entities
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdShippingLocations**](docs/TerminalOrdersMerchantLevelApi.md#getmerchantsmerchantidshippinglocations) | **GET** /merchants/{merchantId}/shippingLocations | Get a list of shipping locations
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalModels**](docs/TerminalOrdersMerchantLevelApi.md#getmerchantsmerchantidterminalmodels) | **GET** /merchants/{merchantId}/terminalModels | Get a list of terminal models
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalOrders**](docs/TerminalOrdersMerchantLevelApi.md#getmerchantsmerchantidterminalorders) | **GET** /merchants/{merchantId}/terminalOrders | Get a list of orders
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalOrdersOrderId**](docs/TerminalOrdersMerchantLevelApi.md#getmerchantsmerchantidterminalordersorderid) | **GET** /merchants/{merchantId}/terminalOrders/{orderId} | Get an order
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalProducts**](docs/TerminalOrdersMerchantLevelApi.md#getmerchantsmerchantidterminalproducts) | **GET** /merchants/{merchantId}/terminalProducts | Get a list of terminal products
*TerminalOrdersMerchantLevelApi* | [**patchMerchantsMerchantIdTerminalOrdersOrderId**](docs/TerminalOrdersMerchantLevelApi.md#patchmerchantsmerchantidterminalordersorderid) | **PATCH** /merchants/{merchantId}/terminalOrders/{orderId} | Update an order
*TerminalOrdersMerchantLevelApi* | [**postMerchantsMerchantIdShippingLocations**](docs/TerminalOrdersMerchantLevelApi.md#postmerchantsmerchantidshippinglocations) | **POST** /merchants/{merchantId}/shippingLocations | Create a shipping location
*TerminalOrdersMerchantLevelApi* | [**postMerchantsMerchantIdTerminalOrders**](docs/TerminalOrdersMerchantLevelApi.md#postmerchantsmerchantidterminalorders) | **POST** /merchants/{merchantId}/terminalOrders | Create an order
*TerminalOrdersMerchantLevelApi* | [**postMerchantsMerchantIdTerminalOrdersOrderIdCancel**](docs/TerminalOrdersMerchantLevelApi.md#postmerchantsmerchantidterminalordersorderidcancel) | **POST** /merchants/{merchantId}/terminalOrders/{orderId}/cancel | Cancel an order
*TerminalSettingsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalLogos**](docs/TerminalSettingsCompanyLevelApi.md#getcompaniescompanyidterminallogos) | **GET** /companies/{companyId}/terminalLogos | Get the terminal logo
*TerminalSettingsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalSettings**](docs/TerminalSettingsCompanyLevelApi.md#getcompaniescompanyidterminalsettings) | **GET** /companies/{companyId}/terminalSettings | Get terminal settings
*TerminalSettingsCompanyLevelApi* | [**patchCompaniesCompanyIdTerminalLogos**](docs/TerminalSettingsCompanyLevelApi.md#patchcompaniescompanyidterminallogos) | **PATCH** /companies/{companyId}/terminalLogos | Update the terminal logo
*TerminalSettingsCompanyLevelApi* | [**patchCompaniesCompanyIdTerminalSettings**](docs/TerminalSettingsCompanyLevelApi.md#patchcompaniescompanyidterminalsettings) | **PATCH** /companies/{companyId}/terminalSettings | Update terminal settings
*TerminalSettingsMerchantLevelApi* | [**getMerchantsMerchantIdTerminalLogos**](docs/TerminalSettingsMerchantLevelApi.md#getmerchantsmerchantidterminallogos) | **GET** /merchants/{merchantId}/terminalLogos | Get the terminal logo
*TerminalSettingsMerchantLevelApi* | [**getMerchantsMerchantIdTerminalSettings**](docs/TerminalSettingsMerchantLevelApi.md#getmerchantsmerchantidterminalsettings) | **GET** /merchants/{merchantId}/terminalSettings | Get terminal settings
*TerminalSettingsMerchantLevelApi* | [**patchMerchantsMerchantIdTerminalLogos**](docs/TerminalSettingsMerchantLevelApi.md#patchmerchantsmerchantidterminallogos) | **PATCH** /merchants/{merchantId}/terminalLogos | Update the terminal logo
*TerminalSettingsMerchantLevelApi* | [**patchMerchantsMerchantIdTerminalSettings**](docs/TerminalSettingsMerchantLevelApi.md#patchmerchantsmerchantidterminalsettings) | **PATCH** /merchants/{merchantId}/terminalSettings | Update terminal settings
*TerminalSettingsStoreLevelApi* | [**getMerchantsMerchantIdStoresReferenceTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#getmerchantsmerchantidstoresreferenceterminallogos) | **GET** /merchants/{merchantId}/stores/{reference}/terminalLogos | Get the terminal logo
*TerminalSettingsStoreLevelApi* | [**getMerchantsMerchantIdStoresReferenceTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#getmerchantsmerchantidstoresreferenceterminalsettings) | **GET** /merchants/{merchantId}/stores/{reference}/terminalSettings | Get terminal settings
*TerminalSettingsStoreLevelApi* | [**getStoresStoreIdTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#getstoresstoreidterminallogos) | **GET** /stores/{storeId}/terminalLogos | Get the terminal logo
*TerminalSettingsStoreLevelApi* | [**getStoresStoreIdTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#getstoresstoreidterminalsettings) | **GET** /stores/{storeId}/terminalSettings | Get terminal settings
*TerminalSettingsStoreLevelApi* | [**patchMerchantsMerchantIdStoresReferenceTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#patchmerchantsmerchantidstoresreferenceterminallogos) | **PATCH** /merchants/{merchantId}/stores/{reference}/terminalLogos | Update the terminal logo
*TerminalSettingsStoreLevelApi* | [**patchMerchantsMerchantIdStoresReferenceTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#patchmerchantsmerchantidstoresreferenceterminalsettings) | **PATCH** /merchants/{merchantId}/stores/{reference}/terminalSettings | Update terminal settings
*TerminalSettingsStoreLevelApi* | [**patchStoresStoreIdTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#patchstoresstoreidterminallogos) | **PATCH** /stores/{storeId}/terminalLogos | Update the terminal logo
*TerminalSettingsStoreLevelApi* | [**patchStoresStoreIdTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#patchstoresstoreidterminalsettings) | **PATCH** /stores/{storeId}/terminalSettings | Update terminal settings
*TerminalSettingsTerminalLevelApi* | [**getTerminalsTerminalIdTerminalLogos**](docs/TerminalSettingsTerminalLevelApi.md#getterminalsterminalidterminallogos) | **GET** /terminals/{terminalId}/terminalLogos | Get the terminal logo
*TerminalSettingsTerminalLevelApi* | [**getTerminalsTerminalIdTerminalSettings**](docs/TerminalSettingsTerminalLevelApi.md#getterminalsterminalidterminalsettings) | **GET** /terminals/{terminalId}/terminalSettings | Get terminal settings
*TerminalSettingsTerminalLevelApi* | [**patchTerminalsTerminalIdTerminalLogos**](docs/TerminalSettingsTerminalLevelApi.md#patchterminalsterminalidterminallogos) | **PATCH** /terminals/{terminalId}/terminalLogos | Update the logo
*TerminalSettingsTerminalLevelApi* | [**patchTerminalsTerminalIdTerminalSettings**](docs/TerminalSettingsTerminalLevelApi.md#patchterminalsterminalidterminalsettings) | **PATCH** /terminals/{terminalId}/terminalSettings | Update terminal settings
*TerminalsTerminalLevelApi* | [**getTerminals**](docs/TerminalsTerminalLevelApi.md#getterminals) | **GET** /terminals | Get a list of terminals
*TerminalsTerminalLevelApi* | [**postTerminalsTerminalIdReassign**](docs/TerminalsTerminalLevelApi.md#postterminalsterminalidreassign) | **POST** /terminals/{terminalId}/reassign | Reassign a terminal
*UsersCompanyLevelApi* | [**getCompaniesCompanyIdUsers**](docs/UsersCompanyLevelApi.md#getcompaniescompanyidusers) | **GET** /companies/{companyId}/users | Get a list of users
*UsersCompanyLevelApi* | [**getCompaniesCompanyIdUsersUserId**](docs/UsersCompanyLevelApi.md#getcompaniescompanyidusersuserid) | **GET** /companies/{companyId}/users/{userId} | Get user details
*UsersCompanyLevelApi* | [**patchCompaniesCompanyIdUsersUserId**](docs/UsersCompanyLevelApi.md#patchcompaniescompanyidusersuserid) | **PATCH** /companies/{companyId}/users/{userId} | Update user details
*UsersCompanyLevelApi* | [**postCompaniesCompanyIdUsers**](docs/UsersCompanyLevelApi.md#postcompaniescompanyidusers) | **POST** /companies/{companyId}/users | Create a new user
*UsersMerchantLevelApi* | [**getMerchantsMerchantIdUsers**](docs/UsersMerchantLevelApi.md#getmerchantsmerchantidusers) | **GET** /merchants/{merchantId}/users | Get a list of users
*UsersMerchantLevelApi* | [**getMerchantsMerchantIdUsersUserId**](docs/UsersMerchantLevelApi.md#getmerchantsmerchantidusersuserid) | **GET** /merchants/{merchantId}/users/{userId} | Get user details
*UsersMerchantLevelApi* | [**patchMerchantsMerchantIdUsersUserId**](docs/UsersMerchantLevelApi.md#patchmerchantsmerchantidusersuserid) | **PATCH** /merchants/{merchantId}/users/{userId} | Update a user
*UsersMerchantLevelApi* | [**postMerchantsMerchantIdUsers**](docs/UsersMerchantLevelApi.md#postmerchantsmerchantidusers) | **POST** /merchants/{merchantId}/users | Create a new user
*WebhooksCompanyLevelApi* | [**deleteCompaniesCompanyIdWebhooksWebhookId**](docs/WebhooksCompanyLevelApi.md#deletecompaniescompanyidwebhookswebhookid) | **DELETE** /companies/{companyId}/webhooks/{webhookId} | Remove a webhook
*WebhooksCompanyLevelApi* | [**getCompaniesCompanyIdWebhooks**](docs/WebhooksCompanyLevelApi.md#getcompaniescompanyidwebhooks) | **GET** /companies/{companyId}/webhooks | List all webhooks
*WebhooksCompanyLevelApi* | [**getCompaniesCompanyIdWebhooksWebhookId**](docs/WebhooksCompanyLevelApi.md#getcompaniescompanyidwebhookswebhookid) | **GET** /companies/{companyId}/webhooks/{webhookId} | Get a webhook
*WebhooksCompanyLevelApi* | [**patchCompaniesCompanyIdWebhooksWebhookId**](docs/WebhooksCompanyLevelApi.md#patchcompaniescompanyidwebhookswebhookid) | **PATCH** /companies/{companyId}/webhooks/{webhookId} | Update a webhook
*WebhooksCompanyLevelApi* | [**postCompaniesCompanyIdWebhooks**](docs/WebhooksCompanyLevelApi.md#postcompaniescompanyidwebhooks) | **POST** /companies/{companyId}/webhooks | Set up a webhook
*WebhooksCompanyLevelApi* | [**postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac**](docs/WebhooksCompanyLevelApi.md#postcompaniescompanyidwebhookswebhookidgeneratehmac) | **POST** /companies/{companyId}/webhooks/{webhookId}/generateHmac | Generate an HMAC key
*WebhooksCompanyLevelApi* | [**postCompaniesCompanyIdWebhooksWebhookIdTest**](docs/WebhooksCompanyLevelApi.md#postcompaniescompanyidwebhookswebhookidtest) | **POST** /companies/{companyId}/webhooks/{webhookId}/test | Test a webhook
*WebhooksMerchantLevelApi* | [**deleteMerchantsMerchantIdWebhooksWebhookId**](docs/WebhooksMerchantLevelApi.md#deletemerchantsmerchantidwebhookswebhookid) | **DELETE** /merchants/{merchantId}/webhooks/{webhookId} | Remove a webhook
*WebhooksMerchantLevelApi* | [**getMerchantsMerchantIdWebhooks**](docs/WebhooksMerchantLevelApi.md#getmerchantsmerchantidwebhooks) | **GET** /merchants/{merchantId}/webhooks | List all webhooks
*WebhooksMerchantLevelApi* | [**getMerchantsMerchantIdWebhooksWebhookId**](docs/WebhooksMerchantLevelApi.md#getmerchantsmerchantidwebhookswebhookid) | **GET** /merchants/{merchantId}/webhooks/{webhookId} | Get a webhook
*WebhooksMerchantLevelApi* | [**patchMerchantsMerchantIdWebhooksWebhookId**](docs/WebhooksMerchantLevelApi.md#patchmerchantsmerchantidwebhookswebhookid) | **PATCH** /merchants/{merchantId}/webhooks/{webhookId} | Update a webhook
*WebhooksMerchantLevelApi* | [**postMerchantsMerchantIdWebhooks**](docs/WebhooksMerchantLevelApi.md#postmerchantsmerchantidwebhooks) | **POST** /merchants/{merchantId}/webhooks | Set up a webhook
*WebhooksMerchantLevelApi* | [**postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac**](docs/WebhooksMerchantLevelApi.md#postmerchantsmerchantidwebhookswebhookidgeneratehmac) | **POST** /merchants/{merchantId}/webhooks/{webhookId}/generateHmac | Generate an HMAC key
*WebhooksMerchantLevelApi* | [**postMerchantsMerchantIdWebhooksWebhookIdTest**](docs/WebhooksMerchantLevelApi.md#postmerchantsmerchantidwebhookswebhookidtest) | **POST** /merchants/{merchantId}/webhooks/{webhookId}/test | Test a webhook


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.management.AdditionalCommission](docs/AdditionalCommission.md)
 - [com.adyen.model.management.AdditionalSettings](docs/AdditionalSettings.md)
 - [com.adyen.model.management.AdditionalSettingsResponse](docs/AdditionalSettingsResponse.md)
 - [com.adyen.model.management.Address](docs/Address.md)
 - [com.adyen.model.management.AfterpayTouchInfo](docs/AfterpayTouchInfo.md)
 - [com.adyen.model.management.AllowedOrigin](docs/AllowedOrigin.md)
 - [com.adyen.model.management.AllowedOriginsResponse](docs/AllowedOriginsResponse.md)
 - [com.adyen.model.management.Amount](docs/Amount.md)
 - [com.adyen.model.management.AndroidApp](docs/AndroidApp.md)
 - [com.adyen.model.management.AndroidAppsResponse](docs/AndroidAppsResponse.md)
 - [com.adyen.model.management.AndroidCertificate](docs/AndroidCertificate.md)
 - [com.adyen.model.management.AndroidCertificatesResponse](docs/AndroidCertificatesResponse.md)
 - [com.adyen.model.management.ApiCredential](docs/ApiCredential.md)
 - [com.adyen.model.management.ApiCredentialLinks](docs/ApiCredentialLinks.md)
 - [com.adyen.model.management.ApplePayInfo](docs/ApplePayInfo.md)
 - [com.adyen.model.management.BcmcInfo](docs/BcmcInfo.md)
 - [com.adyen.model.management.BillingEntitiesResponse](docs/BillingEntitiesResponse.md)
 - [com.adyen.model.management.BillingEntity](docs/BillingEntity.md)
 - [com.adyen.model.management.CardholderReceipt](docs/CardholderReceipt.md)
 - [com.adyen.model.management.CartesBancairesInfo](docs/CartesBancairesInfo.md)
 - [com.adyen.model.management.ClearpayInfo](docs/ClearpayInfo.md)
 - [com.adyen.model.management.Commission](docs/Commission.md)
 - [com.adyen.model.management.Company](docs/Company.md)
 - [com.adyen.model.management.CompanyApiCredential](docs/CompanyApiCredential.md)
 - [com.adyen.model.management.CompanyLinks](docs/CompanyLinks.md)
 - [com.adyen.model.management.CompanyUser](docs/CompanyUser.md)
 - [com.adyen.model.management.Configuration](docs/Configuration.md)
 - [com.adyen.model.management.Connectivity](docs/Connectivity.md)
 - [com.adyen.model.management.Contact](docs/Contact.md)
 - [com.adyen.model.management.CreateAllowedOriginRequest](docs/CreateAllowedOriginRequest.md)
 - [com.adyen.model.management.CreateApiCredentialResponse](docs/CreateApiCredentialResponse.md)
 - [com.adyen.model.management.CreateCompanyApiCredentialRequest](docs/CreateCompanyApiCredentialRequest.md)
 - [com.adyen.model.management.CreateCompanyApiCredentialResponse](docs/CreateCompanyApiCredentialResponse.md)
 - [com.adyen.model.management.CreateCompanyUserRequest](docs/CreateCompanyUserRequest.md)
 - [com.adyen.model.management.CreateCompanyUserResponse](docs/CreateCompanyUserResponse.md)
 - [com.adyen.model.management.CreateCompanyWebhookRequest](docs/CreateCompanyWebhookRequest.md)
 - [com.adyen.model.management.CreateMerchantApiCredentialRequest](docs/CreateMerchantApiCredentialRequest.md)
 - [com.adyen.model.management.CreateMerchantRequest](docs/CreateMerchantRequest.md)
 - [com.adyen.model.management.CreateMerchantResponse](docs/CreateMerchantResponse.md)
 - [com.adyen.model.management.CreateMerchantUserRequest](docs/CreateMerchantUserRequest.md)
 - [com.adyen.model.management.CreateMerchantWebhookRequest](docs/CreateMerchantWebhookRequest.md)
 - [com.adyen.model.management.CreateUserResponse](docs/CreateUserResponse.md)
 - [com.adyen.model.management.Currency](docs/Currency.md)
 - [com.adyen.model.management.CustomNotification](docs/CustomNotification.md)
 - [com.adyen.model.management.DataCenter](docs/DataCenter.md)
 - [com.adyen.model.management.EventUrl](docs/EventUrl.md)
 - [com.adyen.model.management.ExternalTerminalAction](docs/ExternalTerminalAction.md)
 - [com.adyen.model.management.GenerateApiKeyResponse](docs/GenerateApiKeyResponse.md)
 - [com.adyen.model.management.GenerateClientKeyResponse](docs/GenerateClientKeyResponse.md)
 - [com.adyen.model.management.GenerateHmacKeyResponse](docs/GenerateHmacKeyResponse.md)
 - [com.adyen.model.management.GenericPmWithTdiInfo](docs/GenericPmWithTdiInfo.md)
 - [com.adyen.model.management.GiroPayInfo](docs/GiroPayInfo.md)
 - [com.adyen.model.management.GooglePayInfo](docs/GooglePayInfo.md)
 - [com.adyen.model.management.Gratuity](docs/Gratuity.md)
 - [com.adyen.model.management.Hardware](docs/Hardware.md)
 - [com.adyen.model.management.IdName](docs/IdName.md)
 - [com.adyen.model.management.InstallAndroidAppDetails](docs/InstallAndroidAppDetails.md)
 - [com.adyen.model.management.InstallAndroidCertificateDetails](docs/InstallAndroidCertificateDetails.md)
 - [com.adyen.model.management.InvalidField](docs/InvalidField.md)
 - [com.adyen.model.management.Key](docs/Key.md)
 - [com.adyen.model.management.KlarnaInfo](docs/KlarnaInfo.md)
 - [com.adyen.model.management.Links](docs/Links.md)
 - [com.adyen.model.management.LinksElement](docs/LinksElement.md)
 - [com.adyen.model.management.ListCompanyApiCredentialsResponse](docs/ListCompanyApiCredentialsResponse.md)
 - [com.adyen.model.management.ListCompanyResponse](docs/ListCompanyResponse.md)
 - [com.adyen.model.management.ListCompanyUsersResponse](docs/ListCompanyUsersResponse.md)
 - [com.adyen.model.management.ListExternalTerminalActionsResponse](docs/ListExternalTerminalActionsResponse.md)
 - [com.adyen.model.management.ListMerchantApiCredentialsResponse](docs/ListMerchantApiCredentialsResponse.md)
 - [com.adyen.model.management.ListMerchantResponse](docs/ListMerchantResponse.md)
 - [com.adyen.model.management.ListMerchantUsersResponse](docs/ListMerchantUsersResponse.md)
 - [com.adyen.model.management.ListStoresResponse](docs/ListStoresResponse.md)
 - [com.adyen.model.management.ListTerminalsResponse](docs/ListTerminalsResponse.md)
 - [com.adyen.model.management.ListWebhooksResponse](docs/ListWebhooksResponse.md)
 - [com.adyen.model.management.Localization](docs/Localization.md)
 - [com.adyen.model.management.Logo](docs/Logo.md)
 - [com.adyen.model.management.MeApiCredential](docs/MeApiCredential.md)
 - [com.adyen.model.management.MealVoucherFRInfo](docs/MealVoucherFRInfo.md)
 - [com.adyen.model.management.Merchant](docs/Merchant.md)
 - [com.adyen.model.management.MerchantLinks](docs/MerchantLinks.md)
 - [com.adyen.model.management.MinorUnitsMonetaryValue](docs/MinorUnitsMonetaryValue.md)
 - [com.adyen.model.management.Name](docs/Name.md)
 - [com.adyen.model.management.Name2](docs/Name2.md)
 - [com.adyen.model.management.Nexo](docs/Nexo.md)
 - [com.adyen.model.management.Notification](docs/Notification.md)
 - [com.adyen.model.management.NotificationUrl](docs/NotificationUrl.md)
 - [com.adyen.model.management.OfflineProcessing](docs/OfflineProcessing.md)
 - [com.adyen.model.management.Opi](docs/Opi.md)
 - [com.adyen.model.management.OrderItem](docs/OrderItem.md)
 - [com.adyen.model.management.PaginationLinks](docs/PaginationLinks.md)
 - [com.adyen.model.management.Passcodes](docs/Passcodes.md)
 - [com.adyen.model.management.PayAtTable](docs/PayAtTable.md)
 - [com.adyen.model.management.PayPalInfo](docs/PayPalInfo.md)
 - [com.adyen.model.management.Payment](docs/Payment.md)
 - [com.adyen.model.management.PaymentMethod](docs/PaymentMethod.md)
 - [com.adyen.model.management.PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [com.adyen.model.management.PaymentMethodSetupInfo](docs/PaymentMethodSetupInfo.md)
 - [com.adyen.model.management.PayoutSettings](docs/PayoutSettings.md)
 - [com.adyen.model.management.PayoutSettingsRequest](docs/PayoutSettingsRequest.md)
 - [com.adyen.model.management.PayoutSettingsResponse](docs/PayoutSettingsResponse.md)
 - [com.adyen.model.management.Profile](docs/Profile.md)
 - [com.adyen.model.management.ReceiptOptions](docs/ReceiptOptions.md)
 - [com.adyen.model.management.ReceiptPrinting](docs/ReceiptPrinting.md)
 - [com.adyen.model.management.ReleaseUpdateDetails](docs/ReleaseUpdateDetails.md)
 - [com.adyen.model.management.RequestActivationResponse](docs/RequestActivationResponse.md)
 - [com.adyen.model.management.RestServiceError](docs/RestServiceError.md)
 - [com.adyen.model.management.ScheduleTerminalActionsRequest](docs/ScheduleTerminalActionsRequest.md)
 - [com.adyen.model.management.ScheduleTerminalActionsRequestActionDetails](docs/ScheduleTerminalActionsRequestActionDetails.md)
 - [com.adyen.model.management.ScheduleTerminalActionsResponse](docs/ScheduleTerminalActionsResponse.md)
 - [com.adyen.model.management.Settings](docs/Settings.md)
 - [com.adyen.model.management.ShippingLocation](docs/ShippingLocation.md)
 - [com.adyen.model.management.ShippingLocationsResponse](docs/ShippingLocationsResponse.md)
 - [com.adyen.model.management.Signature](docs/Signature.md)
 - [com.adyen.model.management.SofortInfo](docs/SofortInfo.md)
 - [com.adyen.model.management.SplitConfiguration](docs/SplitConfiguration.md)
 - [com.adyen.model.management.SplitConfigurationList](docs/SplitConfigurationList.md)
 - [com.adyen.model.management.SplitConfigurationLogic](docs/SplitConfigurationLogic.md)
 - [com.adyen.model.management.SplitConfigurationRule](docs/SplitConfigurationRule.md)
 - [com.adyen.model.management.Standalone](docs/Standalone.md)
 - [com.adyen.model.management.Store](docs/Store.md)
 - [com.adyen.model.management.StoreCreationRequest](docs/StoreCreationRequest.md)
 - [com.adyen.model.management.StoreCreationWithMerchantCodeRequest](docs/StoreCreationWithMerchantCodeRequest.md)
 - [com.adyen.model.management.StoreLocation](docs/StoreLocation.md)
 - [com.adyen.model.management.StoreSplitConfiguration](docs/StoreSplitConfiguration.md)
 - [com.adyen.model.management.Surcharge](docs/Surcharge.md)
 - [com.adyen.model.management.SwishInfo](docs/SwishInfo.md)
 - [com.adyen.model.management.TapToPay](docs/TapToPay.md)
 - [com.adyen.model.management.Terminal](docs/Terminal.md)
 - [com.adyen.model.management.TerminalActionScheduleDetail](docs/TerminalActionScheduleDetail.md)
 - [com.adyen.model.management.TerminalAssignment](docs/TerminalAssignment.md)
 - [com.adyen.model.management.TerminalConnectivity](docs/TerminalConnectivity.md)
 - [com.adyen.model.management.TerminalConnectivityBluetooth](docs/TerminalConnectivityBluetooth.md)
 - [com.adyen.model.management.TerminalConnectivityCellular](docs/TerminalConnectivityCellular.md)
 - [com.adyen.model.management.TerminalConnectivityEthernet](docs/TerminalConnectivityEthernet.md)
 - [com.adyen.model.management.TerminalConnectivityWifi](docs/TerminalConnectivityWifi.md)
 - [com.adyen.model.management.TerminalModelsResponse](docs/TerminalModelsResponse.md)
 - [com.adyen.model.management.TerminalOrder](docs/TerminalOrder.md)
 - [com.adyen.model.management.TerminalOrderRequest](docs/TerminalOrderRequest.md)
 - [com.adyen.model.management.TerminalOrdersResponse](docs/TerminalOrdersResponse.md)
 - [com.adyen.model.management.TerminalProduct](docs/TerminalProduct.md)
 - [com.adyen.model.management.TerminalProductPrice](docs/TerminalProductPrice.md)
 - [com.adyen.model.management.TerminalProductsResponse](docs/TerminalProductsResponse.md)
 - [com.adyen.model.management.TerminalReassignmentRequest](docs/TerminalReassignmentRequest.md)
 - [com.adyen.model.management.TerminalReassignmentTarget](docs/TerminalReassignmentTarget.md)
 - [com.adyen.model.management.TerminalSettings](docs/TerminalSettings.md)
 - [com.adyen.model.management.TestCompanyWebhookRequest](docs/TestCompanyWebhookRequest.md)
 - [com.adyen.model.management.TestOutput](docs/TestOutput.md)
 - [com.adyen.model.management.TestWebhookRequest](docs/TestWebhookRequest.md)
 - [com.adyen.model.management.TestWebhookResponse](docs/TestWebhookResponse.md)
 - [com.adyen.model.management.Timeouts](docs/Timeouts.md)
 - [com.adyen.model.management.TransactionDescriptionInfo](docs/TransactionDescriptionInfo.md)
 - [com.adyen.model.management.TwintInfo](docs/TwintInfo.md)
 - [com.adyen.model.management.UninstallAndroidAppDetails](docs/UninstallAndroidAppDetails.md)
 - [com.adyen.model.management.UninstallAndroidCertificateDetails](docs/UninstallAndroidCertificateDetails.md)
 - [com.adyen.model.management.UpdatableAddress](docs/UpdatableAddress.md)
 - [com.adyen.model.management.UpdateCompanyApiCredentialRequest](docs/UpdateCompanyApiCredentialRequest.md)
 - [com.adyen.model.management.UpdateCompanyUserRequest](docs/UpdateCompanyUserRequest.md)
 - [com.adyen.model.management.UpdateCompanyWebhookRequest](docs/UpdateCompanyWebhookRequest.md)
 - [com.adyen.model.management.UpdateMerchantApiCredentialRequest](docs/UpdateMerchantApiCredentialRequest.md)
 - [com.adyen.model.management.UpdateMerchantUserRequest](docs/UpdateMerchantUserRequest.md)
 - [com.adyen.model.management.UpdateMerchantWebhookRequest](docs/UpdateMerchantWebhookRequest.md)
 - [com.adyen.model.management.UpdatePaymentMethodInfo](docs/UpdatePaymentMethodInfo.md)
 - [com.adyen.model.management.UpdatePayoutSettingsRequest](docs/UpdatePayoutSettingsRequest.md)
 - [com.adyen.model.management.UpdateSplitConfigurationLogicRequest](docs/UpdateSplitConfigurationLogicRequest.md)
 - [com.adyen.model.management.UpdateSplitConfigurationRequest](docs/UpdateSplitConfigurationRequest.md)
 - [com.adyen.model.management.UpdateSplitConfigurationRuleRequest](docs/UpdateSplitConfigurationRuleRequest.md)
 - [com.adyen.model.management.UpdateStoreRequest](docs/UpdateStoreRequest.md)
 - [com.adyen.model.management.UploadAndroidAppResponse](docs/UploadAndroidAppResponse.md)
 - [com.adyen.model.management.Url](docs/Url.md)
 - [com.adyen.model.management.User](docs/User.md)
 - [com.adyen.model.management.VippsInfo](docs/VippsInfo.md)
 - [com.adyen.model.management.Webhook](docs/Webhook.md)
 - [com.adyen.model.management.WebhookLinks](docs/WebhookLinks.md)
 - [com.adyen.model.management.WifiProfiles](docs/WifiProfiles.md)
 - [com.adyen.model.management.com.adyen.client.infrastructure.OctetByteArray](docs/com.adyen.client.infrastructure.OctetByteArray.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen Payment API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payment/v68*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ModificationsApi* | [**postAdjustAuthorisation**](docs/ModificationsApi.md#postadjustauthorisation) | **POST** /adjustAuthorisation | Change the authorised amount
*ModificationsApi* | [**postCancel**](docs/ModificationsApi.md#postcancel) | **POST** /cancel | Cancel an authorisation
*ModificationsApi* | [**postCancelOrRefund**](docs/ModificationsApi.md#postcancelorrefund) | **POST** /cancelOrRefund | Cancel or refund a payment
*ModificationsApi* | [**postCapture**](docs/ModificationsApi.md#postcapture) | **POST** /capture | Capture an authorisation
*ModificationsApi* | [**postDonate**](docs/ModificationsApi.md#postdonate) | **POST** /donate | Create a donation
*ModificationsApi* | [**postRefund**](docs/ModificationsApi.md#postrefund) | **POST** /refund | Refund a captured payment
*ModificationsApi* | [**postTechnicalCancel**](docs/ModificationsApi.md#posttechnicalcancel) | **POST** /technicalCancel | Cancel an authorisation using your reference
*ModificationsApi* | [**postVoidPendingRefund**](docs/ModificationsApi.md#postvoidpendingrefund) | **POST** /voidPendingRefund | Cancel an in-person refund
*PaymentsApi* | [**postAuthorise**](docs/PaymentsApi.md#postauthorise) | **POST** /authorise | Create an authorisation
*PaymentsApi* | [**postAuthorise3d**](docs/PaymentsApi.md#postauthorise3d) | **POST** /authorise3d | Complete a 3DS authorisation
*PaymentsApi* | [**postAuthorise3ds2**](docs/PaymentsApi.md#postauthorise3ds2) | **POST** /authorise3ds2 | Complete a 3DS2 authorisation
*PaymentsApi* | [**postGetAuthenticationResult**](docs/PaymentsApi.md#postgetauthenticationresult) | **POST** /getAuthenticationResult | Get the 3DS authentication result
*PaymentsApi* | [**postRetrieve3ds2Result**](docs/PaymentsApi.md#postretrieve3ds2result) | **POST** /retrieve3ds2Result | Get the 3DS2 authentication result


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.payment.AccountInfo](docs/AccountInfo.md)
 - [com.adyen.model.payment.AcctInfo](docs/AcctInfo.md)
 - [com.adyen.model.payment.AdditionalData3DSecure](docs/AdditionalData3DSecure.md)
 - [com.adyen.model.payment.AdditionalDataAirline](docs/AdditionalDataAirline.md)
 - [com.adyen.model.payment.AdditionalDataCarRental](docs/AdditionalDataCarRental.md)
 - [com.adyen.model.payment.AdditionalDataCommon](docs/AdditionalDataCommon.md)
 - [com.adyen.model.payment.AdditionalDataLevel23](docs/AdditionalDataLevel23.md)
 - [com.adyen.model.payment.AdditionalDataLodging](docs/AdditionalDataLodging.md)
 - [com.adyen.model.payment.AdditionalDataModifications](docs/AdditionalDataModifications.md)
 - [com.adyen.model.payment.AdditionalDataOpenInvoice](docs/AdditionalDataOpenInvoice.md)
 - [com.adyen.model.payment.AdditionalDataOpi](docs/AdditionalDataOpi.md)
 - [com.adyen.model.payment.AdditionalDataRatepay](docs/AdditionalDataRatepay.md)
 - [com.adyen.model.payment.AdditionalDataRetry](docs/AdditionalDataRetry.md)
 - [com.adyen.model.payment.AdditionalDataRisk](docs/AdditionalDataRisk.md)
 - [com.adyen.model.payment.AdditionalDataRiskStandalone](docs/AdditionalDataRiskStandalone.md)
 - [com.adyen.model.payment.AdditionalDataSubMerchant](docs/AdditionalDataSubMerchant.md)
 - [com.adyen.model.payment.AdditionalDataTemporaryServices](docs/AdditionalDataTemporaryServices.md)
 - [com.adyen.model.payment.AdditionalDataWallets](docs/AdditionalDataWallets.md)
 - [com.adyen.model.payment.Address](docs/Address.md)
 - [com.adyen.model.payment.AdjustAuthorisationRequest](docs/AdjustAuthorisationRequest.md)
 - [com.adyen.model.payment.Amount](docs/Amount.md)
 - [com.adyen.model.payment.ApplicationInfo](docs/ApplicationInfo.md)
 - [com.adyen.model.payment.AuthenticationResultRequest](docs/AuthenticationResultRequest.md)
 - [com.adyen.model.payment.AuthenticationResultResponse](docs/AuthenticationResultResponse.md)
 - [com.adyen.model.payment.BankAccount](docs/BankAccount.md)
 - [com.adyen.model.payment.BrowserInfo](docs/BrowserInfo.md)
 - [com.adyen.model.payment.CancelOrRefundRequest](docs/CancelOrRefundRequest.md)
 - [com.adyen.model.payment.CancelRequest](docs/CancelRequest.md)
 - [com.adyen.model.payment.CaptureRequest](docs/CaptureRequest.md)
 - [com.adyen.model.payment.Card](docs/Card.md)
 - [com.adyen.model.payment.CommonField](docs/CommonField.md)
 - [com.adyen.model.payment.DeviceRenderOptions](docs/DeviceRenderOptions.md)
 - [com.adyen.model.payment.DonationRequest](docs/DonationRequest.md)
 - [com.adyen.model.payment.ExternalPlatform](docs/ExternalPlatform.md)
 - [com.adyen.model.payment.ForexQuote](docs/ForexQuote.md)
 - [com.adyen.model.payment.FraudCheckResult](docs/FraudCheckResult.md)
 - [com.adyen.model.payment.FraudCheckResultWrapper](docs/FraudCheckResultWrapper.md)
 - [com.adyen.model.payment.FraudResult](docs/FraudResult.md)
 - [com.adyen.model.payment.FundDestination](docs/FundDestination.md)
 - [com.adyen.model.payment.FundSource](docs/FundSource.md)
 - [com.adyen.model.payment.Installments](docs/Installments.md)
 - [com.adyen.model.payment.Mandate](docs/Mandate.md)
 - [com.adyen.model.payment.MerchantDevice](docs/MerchantDevice.md)
 - [com.adyen.model.payment.MerchantRiskIndicator](docs/MerchantRiskIndicator.md)
 - [com.adyen.model.payment.ModificationResult](docs/ModificationResult.md)
 - [com.adyen.model.payment.Name](docs/Name.md)
 - [com.adyen.model.payment.PaymentRequest](docs/PaymentRequest.md)
 - [com.adyen.model.payment.PaymentRequest3d](docs/PaymentRequest3d.md)
 - [com.adyen.model.payment.PaymentRequest3ds2](docs/PaymentRequest3ds2.md)
 - [com.adyen.model.payment.PaymentResult](docs/PaymentResult.md)
 - [com.adyen.model.payment.Phone](docs/Phone.md)
 - [com.adyen.model.payment.PlatformChargebackLogic](docs/PlatformChargebackLogic.md)
 - [com.adyen.model.payment.Recurring](docs/Recurring.md)
 - [com.adyen.model.payment.RefundRequest](docs/RefundRequest.md)
 - [com.adyen.model.payment.ResponseAdditionalData3DSecure](docs/ResponseAdditionalData3DSecure.md)
 - [com.adyen.model.payment.ResponseAdditionalDataBillingAddress](docs/ResponseAdditionalDataBillingAddress.md)
 - [com.adyen.model.payment.ResponseAdditionalDataCard](docs/ResponseAdditionalDataCard.md)
 - [com.adyen.model.payment.ResponseAdditionalDataCommon](docs/ResponseAdditionalDataCommon.md)
 - [com.adyen.model.payment.ResponseAdditionalDataDomesticError](docs/ResponseAdditionalDataDomesticError.md)
 - [com.adyen.model.payment.ResponseAdditionalDataInstallments](docs/ResponseAdditionalDataInstallments.md)
 - [com.adyen.model.payment.ResponseAdditionalDataNetworkTokens](docs/ResponseAdditionalDataNetworkTokens.md)
 - [com.adyen.model.payment.ResponseAdditionalDataOpi](docs/ResponseAdditionalDataOpi.md)
 - [com.adyen.model.payment.ResponseAdditionalDataSepa](docs/ResponseAdditionalDataSepa.md)
 - [com.adyen.model.payment.SDKEphemPubKey](docs/SDKEphemPubKey.md)
 - [com.adyen.model.payment.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.payment.ShopperInteractionDevice](docs/ShopperInteractionDevice.md)
 - [com.adyen.model.payment.Split](docs/Split.md)
 - [com.adyen.model.payment.SplitAmount](docs/SplitAmount.md)
 - [com.adyen.model.payment.SubMerchant](docs/SubMerchant.md)
 - [com.adyen.model.payment.TechnicalCancelRequest](docs/TechnicalCancelRequest.md)
 - [com.adyen.model.payment.ThreeDS1Result](docs/ThreeDS1Result.md)
 - [com.adyen.model.payment.ThreeDS2RequestData](docs/ThreeDS2RequestData.md)
 - [com.adyen.model.payment.ThreeDS2Result](docs/ThreeDS2Result.md)
 - [com.adyen.model.payment.ThreeDS2ResultRequest](docs/ThreeDS2ResultRequest.md)
 - [com.adyen.model.payment.ThreeDS2ResultResponse](docs/ThreeDS2ResultResponse.md)
 - [com.adyen.model.payment.ThreeDSRequestorAuthenticationInfo](docs/ThreeDSRequestorAuthenticationInfo.md)
 - [com.adyen.model.payment.ThreeDSRequestorPriorAuthenticationInfo](docs/ThreeDSRequestorPriorAuthenticationInfo.md)
 - [com.adyen.model.payment.ThreeDSecureData](docs/ThreeDSecureData.md)
 - [com.adyen.model.payment.VoidPendingRefundRequest](docs/VoidPendingRefundRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen Payout API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payout/v68*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InitializationApi* | [**postStoreDetail**](docs/InitializationApi.md#poststoredetail) | **POST** /storeDetail | Store payout details
*InitializationApi* | [**postStoreDetailAndSubmitThirdParty**](docs/InitializationApi.md#poststoredetailandsubmitthirdparty) | **POST** /storeDetailAndSubmitThirdParty | Store details and submit a payout
*InitializationApi* | [**postSubmitThirdParty**](docs/InitializationApi.md#postsubmitthirdparty) | **POST** /submitThirdParty | Submit a payout
*InstantPayoutsApi* | [**postPayout**](docs/InstantPayoutsApi.md#postpayout) | **POST** /payout | Make an instant card payout
*ReviewingApi* | [**postConfirmThirdParty**](docs/ReviewingApi.md#postconfirmthirdparty) | **POST** /confirmThirdParty | Confirm a payout
*ReviewingApi* | [**postDeclineThirdParty**](docs/ReviewingApi.md#postdeclinethirdparty) | **POST** /declineThirdParty | Cancel a payout


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.payout.Address](docs/Address.md)
 - [com.adyen.model.payout.Amount](docs/Amount.md)
 - [com.adyen.model.payout.BankAccount](docs/BankAccount.md)
 - [com.adyen.model.payout.Card](docs/Card.md)
 - [com.adyen.model.payout.FraudCheckResult](docs/FraudCheckResult.md)
 - [com.adyen.model.payout.FraudCheckResultWrapper](docs/FraudCheckResultWrapper.md)
 - [com.adyen.model.payout.FraudResult](docs/FraudResult.md)
 - [com.adyen.model.payout.FundSource](docs/FundSource.md)
 - [com.adyen.model.payout.ModifyRequest](docs/ModifyRequest.md)
 - [com.adyen.model.payout.ModifyResponse](docs/ModifyResponse.md)
 - [com.adyen.model.payout.Name](docs/Name.md)
 - [com.adyen.model.payout.PayoutRequest](docs/PayoutRequest.md)
 - [com.adyen.model.payout.PayoutResponse](docs/PayoutResponse.md)
 - [com.adyen.model.payout.Recurring](docs/Recurring.md)
 - [com.adyen.model.payout.ResponseAdditionalData3DSecure](docs/ResponseAdditionalData3DSecure.md)
 - [com.adyen.model.payout.ResponseAdditionalDataBillingAddress](docs/ResponseAdditionalDataBillingAddress.md)
 - [com.adyen.model.payout.ResponseAdditionalDataCard](docs/ResponseAdditionalDataCard.md)
 - [com.adyen.model.payout.ResponseAdditionalDataCommon](docs/ResponseAdditionalDataCommon.md)
 - [com.adyen.model.payout.ResponseAdditionalDataDomesticError](docs/ResponseAdditionalDataDomesticError.md)
 - [com.adyen.model.payout.ResponseAdditionalDataInstallments](docs/ResponseAdditionalDataInstallments.md)
 - [com.adyen.model.payout.ResponseAdditionalDataNetworkTokens](docs/ResponseAdditionalDataNetworkTokens.md)
 - [com.adyen.model.payout.ResponseAdditionalDataOpi](docs/ResponseAdditionalDataOpi.md)
 - [com.adyen.model.payout.ResponseAdditionalDataSepa](docs/ResponseAdditionalDataSepa.md)
 - [com.adyen.model.payout.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.payout.StoreDetailAndSubmitRequest](docs/StoreDetailAndSubmitRequest.md)
 - [com.adyen.model.payout.StoreDetailAndSubmitResponse](docs/StoreDetailAndSubmitResponse.md)
 - [com.adyen.model.payout.StoreDetailRequest](docs/StoreDetailRequest.md)
 - [com.adyen.model.payout.StoreDetailResponse](docs/StoreDetailResponse.md)
 - [com.adyen.model.payout.SubmitRequest](docs/SubmitRequest.md)
 - [com.adyen.model.payout.SubmitResponse](docs/SubmitResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for POS Terminal Management API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://postfmapi-test.adyen.com/postfmapi/terminal/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postAssignTerminals**](docs/GeneralApi.md#postassignterminals) | **POST** /assignTerminals | Assign terminals
*GeneralApi* | [**postFindTerminal**](docs/GeneralApi.md#postfindterminal) | **POST** /findTerminal | Get the account or store of a terminal
*GeneralApi* | [**postGetStoresUnderAccount**](docs/GeneralApi.md#postgetstoresunderaccount) | **POST** /getStoresUnderAccount | Get the stores of an account
*GeneralApi* | [**postGetTerminalDetails**](docs/GeneralApi.md#postgetterminaldetails) | **POST** /getTerminalDetails | Get the details of a terminal
*GeneralApi* | [**postGetTerminalsUnderAccount**](docs/GeneralApi.md#postgetterminalsunderaccount) | **POST** /getTerminalsUnderAccount | Get the list of terminals


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.posterminalmanagement.Address](docs/Address.md)
 - [com.adyen.model.posterminalmanagement.AssignTerminalsRequest](docs/AssignTerminalsRequest.md)
 - [com.adyen.model.posterminalmanagement.AssignTerminalsResponse](docs/AssignTerminalsResponse.md)
 - [com.adyen.model.posterminalmanagement.FindTerminalRequest](docs/FindTerminalRequest.md)
 - [com.adyen.model.posterminalmanagement.FindTerminalResponse](docs/FindTerminalResponse.md)
 - [com.adyen.model.posterminalmanagement.GetStoresUnderAccountRequest](docs/GetStoresUnderAccountRequest.md)
 - [com.adyen.model.posterminalmanagement.GetStoresUnderAccountResponse](docs/GetStoresUnderAccountResponse.md)
 - [com.adyen.model.posterminalmanagement.GetTerminalDetailsRequest](docs/GetTerminalDetailsRequest.md)
 - [com.adyen.model.posterminalmanagement.GetTerminalDetailsResponse](docs/GetTerminalDetailsResponse.md)
 - [com.adyen.model.posterminalmanagement.GetTerminalsUnderAccountRequest](docs/GetTerminalsUnderAccountRequest.md)
 - [com.adyen.model.posterminalmanagement.GetTerminalsUnderAccountResponse](docs/GetTerminalsUnderAccountResponse.md)
 - [com.adyen.model.posterminalmanagement.MerchantAccount](docs/MerchantAccount.md)
 - [com.adyen.model.posterminalmanagement.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.posterminalmanagement.Store](docs/Store.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen Recurring API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Recurring/v68*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postCreatePermit**](docs/GeneralApi.md#postcreatepermit) | **POST** /createPermit | Create new permits linked to a recurring contract.
*GeneralApi* | [**postDisable**](docs/GeneralApi.md#postdisable) | **POST** /disable | Disable stored payment details
*GeneralApi* | [**postDisablePermit**](docs/GeneralApi.md#postdisablepermit) | **POST** /disablePermit | Disable an existing permit.
*GeneralApi* | [**postListRecurringDetails**](docs/GeneralApi.md#postlistrecurringdetails) | **POST** /listRecurringDetails | Get stored payment details
*GeneralApi* | [**postNotifyShopper**](docs/GeneralApi.md#postnotifyshopper) | **POST** /notifyShopper | Ask issuer to notify the shopper
*GeneralApi* | [**postScheduleAccountUpdater**](docs/GeneralApi.md#postscheduleaccountupdater) | **POST** /scheduleAccountUpdater | Schedule running the Account Updater


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.recurring.Address](docs/Address.md)
 - [com.adyen.model.recurring.Amount](docs/Amount.md)
 - [com.adyen.model.recurring.BankAccount](docs/BankAccount.md)
 - [com.adyen.model.recurring.Card](docs/Card.md)
 - [com.adyen.model.recurring.CreatePermitRequest](docs/CreatePermitRequest.md)
 - [com.adyen.model.recurring.CreatePermitResult](docs/CreatePermitResult.md)
 - [com.adyen.model.recurring.DisablePermitRequest](docs/DisablePermitRequest.md)
 - [com.adyen.model.recurring.DisablePermitResult](docs/DisablePermitResult.md)
 - [com.adyen.model.recurring.DisableRequest](docs/DisableRequest.md)
 - [com.adyen.model.recurring.DisableResult](docs/DisableResult.md)
 - [com.adyen.model.recurring.Name](docs/Name.md)
 - [com.adyen.model.recurring.NotifyShopperRequest](docs/NotifyShopperRequest.md)
 - [com.adyen.model.recurring.NotifyShopperResult](docs/NotifyShopperResult.md)
 - [com.adyen.model.recurring.Permit](docs/Permit.md)
 - [com.adyen.model.recurring.PermitRestriction](docs/PermitRestriction.md)
 - [com.adyen.model.recurring.PermitResult](docs/PermitResult.md)
 - [com.adyen.model.recurring.Recurring](docs/Recurring.md)
 - [com.adyen.model.recurring.RecurringDetail](docs/RecurringDetail.md)
 - [com.adyen.model.recurring.RecurringDetailWrapper](docs/RecurringDetailWrapper.md)
 - [com.adyen.model.recurring.RecurringDetailsRequest](docs/RecurringDetailsRequest.md)
 - [com.adyen.model.recurring.RecurringDetailsResult](docs/RecurringDetailsResult.md)
 - [com.adyen.model.recurring.ScheduleAccountUpdaterRequest](docs/ScheduleAccountUpdaterRequest.md)
 - [com.adyen.model.recurring.ScheduleAccountUpdaterResult](docs/ScheduleAccountUpdaterResult.md)
 - [com.adyen.model.recurring.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.recurring.TokenDetails](docs/TokenDetails.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Transfers API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://balanceplatform-api-test.adyen.com/btl/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CapitalApi* | [**getGrants**](docs/CapitalApi.md#getgrants) | **GET** /grants | Get a capital account
*CapitalApi* | [**getGrantsId**](docs/CapitalApi.md#getgrantsid) | **GET** /grants/{id} | Get grant reference details
*CapitalApi* | [**postGrants**](docs/CapitalApi.md#postgrants) | **POST** /grants | Request a grant payout
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#gettransactions) | **GET** /transactions | Get all transactions
*TransactionsApi* | [**getTransactionsId**](docs/TransactionsApi.md#gettransactionsid) | **GET** /transactions/{id} | Get a transaction
*TransfersApi* | [**postTransfers**](docs/TransfersApi.md#posttransfers) | **POST** /transfers | Transfer funds
*TransfersApi* | [**postTransfersIdReturns**](docs/TransfersApi.md#posttransfersidreturns) | **POST** /transfers/{id}/returns | Return a transfer


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.transfers.AULocalAccountIdentification](docs/AULocalAccountIdentification.md)
 - [com.adyen.model.transfers.AdditionalBankIdentification](docs/AdditionalBankIdentification.md)
 - [com.adyen.model.transfers.Address](docs/Address.md)
 - [com.adyen.model.transfers.Amount](docs/Amount.md)
 - [com.adyen.model.transfers.BRLocalAccountIdentification](docs/BRLocalAccountIdentification.md)
 - [com.adyen.model.transfers.BankAccountV3](docs/BankAccountV3.md)
 - [com.adyen.model.transfers.BankAccountV3AccountIdentification](docs/BankAccountV3AccountIdentification.md)
 - [com.adyen.model.transfers.BankCategoryData](docs/BankCategoryData.md)
 - [com.adyen.model.transfers.CALocalAccountIdentification](docs/CALocalAccountIdentification.md)
 - [com.adyen.model.transfers.CZLocalAccountIdentification](docs/CZLocalAccountIdentification.md)
 - [com.adyen.model.transfers.CapitalBalance](docs/CapitalBalance.md)
 - [com.adyen.model.transfers.CapitalGrant](docs/CapitalGrant.md)
 - [com.adyen.model.transfers.CapitalGrantInfo](docs/CapitalGrantInfo.md)
 - [com.adyen.model.transfers.CapitalGrants](docs/CapitalGrants.md)
 - [com.adyen.model.transfers.Counterparty](docs/Counterparty.md)
 - [com.adyen.model.transfers.CounterpartyInfoV3](docs/CounterpartyInfoV3.md)
 - [com.adyen.model.transfers.CounterpartyV3](docs/CounterpartyV3.md)
 - [com.adyen.model.transfers.DKLocalAccountIdentification](docs/DKLocalAccountIdentification.md)
 - [com.adyen.model.transfers.Fee](docs/Fee.md)
 - [com.adyen.model.transfers.HKLocalAccountIdentification](docs/HKLocalAccountIdentification.md)
 - [com.adyen.model.transfers.HULocalAccountIdentification](docs/HULocalAccountIdentification.md)
 - [com.adyen.model.transfers.IbanAccountIdentification](docs/IbanAccountIdentification.md)
 - [com.adyen.model.transfers.InternalCategoryData](docs/InternalCategoryData.md)
 - [com.adyen.model.transfers.InvalidField](docs/InvalidField.md)
 - [com.adyen.model.transfers.IssuedCard](docs/IssuedCard.md)
 - [com.adyen.model.transfers.Link](docs/Link.md)
 - [com.adyen.model.transfers.Links](docs/Links.md)
 - [com.adyen.model.transfers.MerchantData](docs/MerchantData.md)
 - [com.adyen.model.transfers.NOLocalAccountIdentification](docs/NOLocalAccountIdentification.md)
 - [com.adyen.model.transfers.NZLocalAccountIdentification](docs/NZLocalAccountIdentification.md)
 - [com.adyen.model.transfers.NameLocation](docs/NameLocation.md)
 - [com.adyen.model.transfers.NumberAndBicAccountIdentification](docs/NumberAndBicAccountIdentification.md)
 - [com.adyen.model.transfers.PLLocalAccountIdentification](docs/PLLocalAccountIdentification.md)
 - [com.adyen.model.transfers.PartyIdentification](docs/PartyIdentification.md)
 - [com.adyen.model.transfers.PaymentInstrument](docs/PaymentInstrument.md)
 - [com.adyen.model.transfers.PlatformPayment](docs/PlatformPayment.md)
 - [com.adyen.model.transfers.RelayedAuthorisationData](docs/RelayedAuthorisationData.md)
 - [com.adyen.model.transfers.Repayment](docs/Repayment.md)
 - [com.adyen.model.transfers.RepaymentTerm](docs/RepaymentTerm.md)
 - [com.adyen.model.transfers.ResourceReference](docs/ResourceReference.md)
 - [com.adyen.model.transfers.RestServiceError](docs/RestServiceError.md)
 - [com.adyen.model.transfers.ReturnTransferRequest](docs/ReturnTransferRequest.md)
 - [com.adyen.model.transfers.ReturnTransferResponse](docs/ReturnTransferResponse.md)
 - [com.adyen.model.transfers.SELocalAccountIdentification](docs/SELocalAccountIdentification.md)
 - [com.adyen.model.transfers.SGLocalAccountIdentification](docs/SGLocalAccountIdentification.md)
 - [com.adyen.model.transfers.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.transfers.ThresholdRepayment](docs/ThresholdRepayment.md)
 - [com.adyen.model.transfers.Transaction](docs/Transaction.md)
 - [com.adyen.model.transfers.TransactionSearchResponse](docs/TransactionSearchResponse.md)
 - [com.adyen.model.transfers.Transfer](docs/Transfer.md)
 - [com.adyen.model.transfers.TransferCategoryData](docs/TransferCategoryData.md)
 - [com.adyen.model.transfers.TransferData](docs/TransferData.md)
 - [com.adyen.model.transfers.TransferInfo](docs/TransferInfo.md)
 - [com.adyen.model.transfers.TransferNotificationValidationFact](docs/TransferNotificationValidationFact.md)
 - [com.adyen.model.transfers.UKLocalAccountIdentification](docs/UKLocalAccountIdentification.md)
 - [com.adyen.model.transfers.USLocalAccountIdentification](docs/USLocalAccountIdentification.md)
 - [com.adyen.model.transfers.UltimatePartyIdentification](docs/UltimatePartyIdentification.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Adyen Stored Value API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/StoredValue/v46*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postChangeStatus**](docs/GeneralApi.md#postchangestatus) | **POST** /changeStatus | Changes the status of the payment method.
*GeneralApi* | [**postCheckBalance**](docs/GeneralApi.md#postcheckbalance) | **POST** /checkBalance | Checks the balance.
*GeneralApi* | [**postIssue**](docs/GeneralApi.md#postissue) | **POST** /issue | Issues a new card.
*GeneralApi* | [**postLoad**](docs/GeneralApi.md#postload) | **POST** /load | Loads the payment method.
*GeneralApi* | [**postMergeBalance**](docs/GeneralApi.md#postmergebalance) | **POST** /mergeBalance | Merge the balance of two cards.
*GeneralApi* | [**postVoidTransaction**](docs/GeneralApi.md#postvoidtransaction) | **POST** /voidTransaction | Voids a transaction.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.storedvalue.Amount](docs/Amount.md)
 - [com.adyen.model.storedvalue.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.storedvalue.StoredValueBalanceCheckRequest](docs/StoredValueBalanceCheckRequest.md)
 - [com.adyen.model.storedvalue.StoredValueBalanceCheckResponse](docs/StoredValueBalanceCheckResponse.md)
 - [com.adyen.model.storedvalue.StoredValueBalanceMergeRequest](docs/StoredValueBalanceMergeRequest.md)
 - [com.adyen.model.storedvalue.StoredValueBalanceMergeResponse](docs/StoredValueBalanceMergeResponse.md)
 - [com.adyen.model.storedvalue.StoredValueIssueRequest](docs/StoredValueIssueRequest.md)
 - [com.adyen.model.storedvalue.StoredValueIssueResponse](docs/StoredValueIssueResponse.md)
 - [com.adyen.model.storedvalue.StoredValueLoadRequest](docs/StoredValueLoadRequest.md)
 - [com.adyen.model.storedvalue.StoredValueLoadResponse](docs/StoredValueLoadResponse.md)
 - [com.adyen.model.storedvalue.StoredValueStatusChangeRequest](docs/StoredValueStatusChangeRequest.md)
 - [com.adyen.model.storedvalue.StoredValueStatusChangeResponse](docs/StoredValueStatusChangeResponse.md)
 - [com.adyen.model.storedvalue.StoredValueVoidRequest](docs/StoredValueVoidRequest.md)
 - [com.adyen.model.storedvalue.StoredValueVoidResponse](docs/StoredValueVoidResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

# com.adyen.client - Kotlin client library for Disputes API

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://ca-test.adyen.com/ca/services/DisputeService/v30*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**postAcceptDispute**](docs/GeneralApi.md#postacceptdispute) | **POST** /acceptDispute | Accept a dispute
*GeneralApi* | [**postDefendDispute**](docs/GeneralApi.md#postdefenddispute) | **POST** /defendDispute | Defend a dispute
*GeneralApi* | [**postDeleteDisputeDefenseDocument**](docs/GeneralApi.md#postdeletedisputedefensedocument) | **POST** /deleteDisputeDefenseDocument | Delete a defense document
*GeneralApi* | [**postRetrieveApplicableDefenseReasons**](docs/GeneralApi.md#postretrieveapplicabledefensereasons) | **POST** /retrieveApplicableDefenseReasons | Get applicable defense reasons
*GeneralApi* | [**postSupplyDefenseDocument**](docs/GeneralApi.md#postsupplydefensedocument) | **POST** /supplyDefenseDocument | Supply a defense document


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.adyen.model.disputes.AcceptDisputeRequest](docs/AcceptDisputeRequest.md)
 - [com.adyen.model.disputes.AcceptDisputeResponse](docs/AcceptDisputeResponse.md)
 - [com.adyen.model.disputes.DefendDisputeRequest](docs/DefendDisputeRequest.md)
 - [com.adyen.model.disputes.DefendDisputeResponse](docs/DefendDisputeResponse.md)
 - [com.adyen.model.disputes.DefenseDocument](docs/DefenseDocument.md)
 - [com.adyen.model.disputes.DefenseDocumentType](docs/DefenseDocumentType.md)
 - [com.adyen.model.disputes.DefenseReason](docs/DefenseReason.md)
 - [com.adyen.model.disputes.DefenseReasonsRequest](docs/DefenseReasonsRequest.md)
 - [com.adyen.model.disputes.DefenseReasonsResponse](docs/DefenseReasonsResponse.md)
 - [com.adyen.model.disputes.DeleteDefenseDocumentRequest](docs/DeleteDefenseDocumentRequest.md)
 - [com.adyen.model.disputes.DeleteDefenseDocumentResponse](docs/DeleteDefenseDocumentResponse.md)
 - [com.adyen.model.disputes.DisputeServiceResult](docs/DisputeServiceResult.md)
 - [com.adyen.model.disputes.ServiceError](docs/ServiceError.md)
 - [com.adyen.model.disputes.SupplyDefenseDocumentRequest](docs/SupplyDefenseDocumentRequest.md)
 - [com.adyen.model.disputes.SupplyDefenseDocumentResponse](docs/SupplyDefenseDocumentResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

