
# ThreeDS2RequestFields

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acctInfo** | [**AcctInfo**](AcctInfo.md) |  |  [optional]
**acctType** | [**inline**](#AcctType) | Indicates the type of account. For example, for a multi-account card product. Length: 2 characters. Allowed values: * **01** — Not applicable * **02** — Credit * **03** — Debit |  [optional]
**acquirerBIN** | **kotlin.String** | Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The acquiring BIN enrolled for 3D Secure 2. This string should match the value that you will use in the authorisation. Use 123456 on the Test platform. |  [optional]
**acquirerMerchantID** | **kotlin.String** | Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The merchantId that is enrolled for 3D Secure 2 by the merchant&#39;s acquirer. This string should match the value that you will use in the authorisation. Use 123456 on the Test platform. |  [optional]
**addrMatch** | [**inline**](#AddrMatch) | Indicates whether the Cardholder Shipping Address and Cardholder Billing Address are the same. Allowed values: * **Y** — Shipping Address matches Billing Address. * **N** — Shipping Address does not match Billing Address. |  [optional]
**authenticationOnly** | **kotlin.Boolean** | If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. |  [optional]
**challengeIndicator** | [**inline**](#ChallengeIndicator) | Possibility to specify a preference for receiving a challenge from the issuer. Allowed values: * &#x60;noPreference&#x60; * &#x60;requestNoChallenge&#x60; * &#x60;requestChallenge&#x60; * &#x60;requestChallengeAsMandate&#x60;  |  [optional]
**deviceRenderOptions** | [**DeviceRenderOptions**](DeviceRenderOptions.md) |  |  [optional]
**homePhone** | [**Phone**](Phone.md) |  |  [optional]
**mcc** | **kotlin.String** | Required for merchants that have been enrolled for 3D Secure 2 by another party than Adyen, mostly [authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The &#x60;mcc&#x60; is a four-digit code with which the previously given &#x60;acquirerMerchantID&#x60; is registered at the scheme. |  [optional]
**merchantName** | **kotlin.String** | Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The merchant name that the issuer presents to the shopper if they get a challenge. We recommend to use the same value that you will use in the authorization. Maximum length is 40 characters. &gt; Optional for a [full 3D Secure 2 integration](https://docs.adyen.com/online-payments/3d-secure/native-3ds2/api-integration). Use this field if you are enrolled for 3D Secure 2 with us and want to override the merchant name already configured on your account. |  [optional]
**messageVersion** | **kotlin.String** | The &#x60;messageVersion&#x60; value indicating the 3D Secure 2 protocol version. |  [optional]
**mobilePhone** | [**Phone**](Phone.md) |  |  [optional]
**notificationURL** | **kotlin.String** | URL to where the issuer should send the &#x60;CRes&#x60;. Required if you are not using components for &#x60;channel&#x60; **Web** or if you are using classic integration &#x60;deviceChannel&#x60; **browser**. |  [optional]
**payTokenInd** | **kotlin.Boolean** | Value **true** indicates that the transaction was de-tokenised prior to being received by the ACS. |  [optional]
**paymentAuthenticationUseCase** | **kotlin.String** | Indicates the type of payment for which an authentication is requested (message extension) |  [optional]
**purchaseInstalData** | **kotlin.String** | Indicates the maximum number of authorisations permitted for instalment payments. Length: 1–3 characters. |  [optional]
**recurringExpiry** | **kotlin.String** | Date after which no further authorisations shall be performed. Format: YYYYMMDD |  [optional]
**recurringFrequency** | **kotlin.String** | Indicates the minimum number of days between authorisations. Maximum length: 4 characters. |  [optional]
**sdkAppID** | **kotlin.String** | The &#x60;sdkAppID&#x60; value as received from the 3D Secure 2 SDK. |  [optional]
**sdkEphemPubKey** | [**SDKEphemPubKey**](SDKEphemPubKey.md) |  |  [optional]
**sdkMaxTimeout** | **kotlin.Int** | The maximum amount of time in minutes for the 3D Secure 2 authentication process. Optional and only for &#x60;deviceChannel&#x60; set to **app**. Defaults to **60** minutes. |  [optional]
**sdkReferenceNumber** | **kotlin.String** | The &#x60;sdkReferenceNumber&#x60; value as received from the 3D Secure 2 SDK. |  [optional]
**sdkTransID** | **kotlin.String** | The &#x60;sdkTransID&#x60; value as received from the 3D Secure 2 SDK. |  [optional]
**threeDSCompInd** | **kotlin.String** | Completion indicator for the device fingerprinting. |  [optional]
**threeDSRequestorAuthenticationInd** | **kotlin.String** | Indicates the type of Authentication request. |  [optional]
**threeDSRequestorAuthenticationInfo** | [**ThreeDSRequestorAuthenticationInfo**](ThreeDSRequestorAuthenticationInfo.md) |  |  [optional]
**threeDSRequestorChallengeInd** | [**inline**](#ThreeDSRequestorChallengeInd) | Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only |  [optional]
**threeDSRequestorID** | **kotlin.String** | Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only) for Visa. Unique 3D Secure requestor identifier assigned by the Directory Server when you enrol for 3D Secure 2. |  [optional]
**threeDSRequestorName** | **kotlin.String** | Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only) for Visa. Unique 3D Secure requestor name assigned by the Directory Server when you enrol for 3D Secure 2. |  [optional]
**threeDSRequestorPriorAuthenticationInfo** | [**ThreeDSRequestorPriorAuthenticationInfo**](ThreeDSRequestorPriorAuthenticationInfo.md) |  |  [optional]
**threeDSRequestorURL** | **kotlin.String** | URL of the (customer service) website that will be shown to the shopper in case of technical errors during the 3D Secure 2 process. |  [optional]
**transType** | [**inline**](#TransType) | Identifies the type of transaction being authenticated. Length: 2 characters. Allowed values: * **01** — Goods/Service Purchase * **03** — Check Acceptance * **10** — Account Funding * **11** — Quasi-Cash Transaction * **28** — Prepaid Activation and Load |  [optional]
**transactionType** | [**inline**](#TransactionType) | Identify the type of the transaction being authenticated. |  [optional]
**whiteListStatus** | **kotlin.String** | The &#x60;whiteListStatus&#x60; value returned from a previous 3D Secure 2 transaction, only applicable for 3D Secure 2 protocol version 2.2.0. |  [optional]
**workPhone** | [**Phone**](Phone.md) |  |  [optional]


<a name="AcctType"></a>
## Enum: acctType
Name | Value
---- | -----
acctType | 01, 02, 03


<a name="AddrMatch"></a>
## Enum: addrMatch
Name | Value
---- | -----
addrMatch | Y, N


<a name="ChallengeIndicator"></a>
## Enum: challengeIndicator
Name | Value
---- | -----
challengeIndicator | noPreference, requestNoChallenge, requestChallenge, requestChallengeAsMandate


<a name="ThreeDSRequestorChallengeInd"></a>
## Enum: threeDSRequestorChallengeInd
Name | Value
---- | -----
threeDSRequestorChallengeInd | 01, 02, 03, 04, 05, 06


<a name="TransType"></a>
## Enum: transType
Name | Value
---- | -----
transType | 01, 03, 10, 11, 28


<a name="TransactionType"></a>
## Enum: transactionType
Name | Value
---- | -----
transactionType | goodsOrServicePurchase, checkAcceptance, accountFunding, quasiCashTransaction, prepaidActivationAndLoad



