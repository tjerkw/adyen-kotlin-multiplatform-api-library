#  Kotlin Multiplatform client library for Adyen's API

A kotlin multiplatform library for Adyen's api generated with openapi-generator based on the "multiplatform" target.

To regenerate, call:

```
make models
```# com.adyen.client - Kotlin client library for Adyen Balance Control API

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

