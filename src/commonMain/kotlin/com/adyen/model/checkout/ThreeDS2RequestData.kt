/**
 * Adyen Checkout API
 *
 * Adyen Checkout API provides a simple and flexible way to initiate and authorise online payments. You can use the same integration for payments made with cards (including 3D Secure), mobile wallets, and local payment methods (for example, iDEAL and Sofort).  This API reference provides information on available endpoints and how to interact with them. To learn more about the API, visit [online payments documentation](https://docs.adyen.com/online-payments).  ## Authentication Each request to Checkout API must be signed with an API key. For this, [get your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) from your Customer Area, and set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ``` ## Versioning Checkout API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://checkout-test.adyen.com/v71/payments ```  ## Going live  To access the live endpoints, you need an API key from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account, for example: ``` https://{PREFIX}-checkout-live.adyenpayments.com/checkout/v71/payments ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.  When preparing to do live transactions with Checkout API, follow the [go-live checklist](https://docs.adyen.com/online-payments/go-live-checklist) to make sure you've got all the required configuration in place.  ## Release notes Have a look at the [release notes](https://docs.adyen.com/online-payments/release-notes?integration_type=api&version=71) to find out what changed in this version!
 *
 * The version of the OpenAPI document: 71
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

package com.adyen.model.checkout

import com.adyen.model.checkout.AcctInfo
import com.adyen.model.checkout.DeviceRenderOptions
import com.adyen.model.checkout.Phone
import com.adyen.model.checkout.SDKEphemPubKey
import com.adyen.model.checkout.ThreeDSRequestorAuthenticationInfo
import com.adyen.model.checkout.ThreeDSRequestorPriorAuthenticationInfo

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param deviceChannel The environment of the shopper. Allowed values: * `app` * `browser`
 * @param acctInfo 
 * @param acctType Indicates the type of account. For example, for a multi-account card product. Length: 2 characters. Allowed values: * **01** — Not applicable * **02** — Credit * **03** — Debit
 * @param acquirerBIN Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The acquiring BIN enrolled for 3D Secure 2. This string should match the value that you will use in the authorisation. Use 123456 on the Test platform.
 * @param acquirerMerchantID Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The merchantId that is enrolled for 3D Secure 2 by the merchant's acquirer. This string should match the value that you will use in the authorisation. Use 123456 on the Test platform.
 * @param addrMatch Indicates whether the Cardholder Shipping Address and Cardholder Billing Address are the same. Allowed values: * **Y** — Shipping Address matches Billing Address. * **N** — Shipping Address does not match Billing Address.
 * @param authenticationOnly If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation.
 * @param challengeIndicator Possibility to specify a preference for receiving a challenge from the issuer. Allowed values: * `noPreference` * `requestNoChallenge` * `requestChallenge` * `requestChallengeAsMandate` 
 * @param deviceRenderOptions 
 * @param homePhone 
 * @param mcc Required for merchants that have been enrolled for 3D Secure 2 by another party than Adyen, mostly [authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The `mcc` is a four-digit code with which the previously given `acquirerMerchantID` is registered at the scheme.
 * @param merchantName Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The merchant name that the issuer presents to the shopper if they get a challenge. We recommend to use the same value that you will use in the authorization. Maximum length is 40 characters. > Optional for a [full 3D Secure 2 integration](https://docs.adyen.com/online-payments/3d-secure/native-3ds2/api-integration). Use this field if you are enrolled for 3D Secure 2 with us and want to override the merchant name already configured on your account.
 * @param messageVersion The `messageVersion` value indicating the 3D Secure 2 protocol version.
 * @param mobilePhone 
 * @param notificationURL URL to where the issuer should send the `CRes`. Required if you are not using components for `channel` **Web** or if you are using classic integration `deviceChannel` **browser**.
 * @param payTokenInd Value **true** indicates that the transaction was de-tokenised prior to being received by the ACS.
 * @param paymentAuthenticationUseCase Indicates the type of payment for which an authentication is requested (message extension)
 * @param purchaseInstalData Indicates the maximum number of authorisations permitted for instalment payments. Length: 1–3 characters.
 * @param recurringExpiry Date after which no further authorisations shall be performed. Format: YYYYMMDD
 * @param recurringFrequency Indicates the minimum number of days between authorisations. Maximum length: 4 characters.
 * @param sdkAppID The `sdkAppID` value as received from the 3D Secure 2 SDK. Required for `deviceChannel` set to **app**.
 * @param sdkEncData The `sdkEncData` value as received from the 3D Secure 2 SDK. Required for `deviceChannel` set to **app**.
 * @param sdkEphemPubKey 
 * @param sdkMaxTimeout The maximum amount of time in minutes for the 3D Secure 2 authentication process. Optional and only for `deviceChannel` set to **app**. Defaults to **60** minutes.
 * @param sdkReferenceNumber The `sdkReferenceNumber` value as received from the 3D Secure 2 SDK. Only for `deviceChannel` set to **app**.
 * @param sdkTransID The `sdkTransID` value as received from the 3D Secure 2 SDK. Only for `deviceChannel` set to **app**.
 * @param sdkVersion Version of the 3D Secure 2 mobile SDK.  Only for `deviceChannel` set to **app**.
 * @param threeDSCompInd Completion indicator for the device fingerprinting.
 * @param threeDSRequestorAuthenticationInd Indicates the type of Authentication request.
 * @param threeDSRequestorAuthenticationInfo 
 * @param threeDSRequestorChallengeInd Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only
 * @param threeDSRequestorID Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only) for Visa. Unique 3D Secure requestor identifier assigned by the Directory Server when you enrol for 3D Secure 2.
 * @param threeDSRequestorName Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only) for Visa. Unique 3D Secure requestor name assigned by the Directory Server when you enrol for 3D Secure 2.
 * @param threeDSRequestorPriorAuthenticationInfo 
 * @param threeDSRequestorURL URL of the (customer service) website that will be shown to the shopper in case of technical errors during the 3D Secure 2 process.
 * @param transType Identifies the type of transaction being authenticated. Length: 2 characters. Allowed values: * **01** — Goods/Service Purchase * **03** — Check Acceptance * **10** — Account Funding * **11** — Quasi-Cash Transaction * **28** — Prepaid Activation and Load
 * @param transactionType Identify the type of the transaction being authenticated.
 * @param whiteListStatus The `whiteListStatus` value returned from a previous 3D Secure 2 transaction, only applicable for 3D Secure 2 protocol version 2.2.0.
 * @param workPhone 
 */
@Serializable
data class ThreeDS2RequestData (

    /* The environment of the shopper. Allowed values: * `app` * `browser` */
    @SerialName(value = "deviceChannel") @Required val deviceChannel: kotlin.String,

    @SerialName(value = "acctInfo") val acctInfo: AcctInfo? = null,

    /* Indicates the type of account. For example, for a multi-account card product. Length: 2 characters. Allowed values: * **01** — Not applicable * **02** — Credit * **03** — Debit */
    @SerialName(value = "acctType") val acctType: ThreeDS2RequestData.AcctType? = null,

    /* Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The acquiring BIN enrolled for 3D Secure 2. This string should match the value that you will use in the authorisation. Use 123456 on the Test platform. */
    @SerialName(value = "acquirerBIN") val acquirerBIN: kotlin.String? = null,

    /* Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The merchantId that is enrolled for 3D Secure 2 by the merchant's acquirer. This string should match the value that you will use in the authorisation. Use 123456 on the Test platform. */
    @SerialName(value = "acquirerMerchantID") val acquirerMerchantID: kotlin.String? = null,

    /* Indicates whether the Cardholder Shipping Address and Cardholder Billing Address are the same. Allowed values: * **Y** — Shipping Address matches Billing Address. * **N** — Shipping Address does not match Billing Address. */
    @SerialName(value = "addrMatch") val addrMatch: ThreeDS2RequestData.AddrMatch? = null,

    /* If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "authenticationOnly") val authenticationOnly: kotlin.Boolean? = false,

    /* Possibility to specify a preference for receiving a challenge from the issuer. Allowed values: * `noPreference` * `requestNoChallenge` * `requestChallenge` * `requestChallengeAsMandate`  */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "challengeIndicator") val challengeIndicator: ThreeDS2RequestData.ChallengeIndicator? = null,

    @SerialName(value = "deviceRenderOptions") val deviceRenderOptions: DeviceRenderOptions? = null,

    @SerialName(value = "homePhone") val homePhone: Phone? = null,

    /* Required for merchants that have been enrolled for 3D Secure 2 by another party than Adyen, mostly [authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The `mcc` is a four-digit code with which the previously given `acquirerMerchantID` is registered at the scheme. */
    @SerialName(value = "mcc") val mcc: kotlin.String? = null,

    /* Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). The merchant name that the issuer presents to the shopper if they get a challenge. We recommend to use the same value that you will use in the authorization. Maximum length is 40 characters. > Optional for a [full 3D Secure 2 integration](https://docs.adyen.com/online-payments/3d-secure/native-3ds2/api-integration). Use this field if you are enrolled for 3D Secure 2 with us and want to override the merchant name already configured on your account. */
    @SerialName(value = "merchantName") val merchantName: kotlin.String? = null,

    /* The `messageVersion` value indicating the 3D Secure 2 protocol version. */
    @SerialName(value = "messageVersion") val messageVersion: kotlin.String? = null,

    @SerialName(value = "mobilePhone") val mobilePhone: Phone? = null,

    /* URL to where the issuer should send the `CRes`. Required if you are not using components for `channel` **Web** or if you are using classic integration `deviceChannel` **browser**. */
    @SerialName(value = "notificationURL") val notificationURL: kotlin.String? = null,

    /* Value **true** indicates that the transaction was de-tokenised prior to being received by the ACS. */
    @SerialName(value = "payTokenInd") val payTokenInd: kotlin.Boolean? = null,

    /* Indicates the type of payment for which an authentication is requested (message extension) */
    @SerialName(value = "paymentAuthenticationUseCase") val paymentAuthenticationUseCase: kotlin.String? = null,

    /* Indicates the maximum number of authorisations permitted for instalment payments. Length: 1–3 characters. */
    @SerialName(value = "purchaseInstalData") val purchaseInstalData: kotlin.String? = null,

    /* Date after which no further authorisations shall be performed. Format: YYYYMMDD */
    @SerialName(value = "recurringExpiry") val recurringExpiry: kotlin.String? = null,

    /* Indicates the minimum number of days between authorisations. Maximum length: 4 characters. */
    @SerialName(value = "recurringFrequency") val recurringFrequency: kotlin.String? = null,

    /* The `sdkAppID` value as received from the 3D Secure 2 SDK. Required for `deviceChannel` set to **app**. */
    @SerialName(value = "sdkAppID") val sdkAppID: kotlin.String? = null,

    /* The `sdkEncData` value as received from the 3D Secure 2 SDK. Required for `deviceChannel` set to **app**. */
    @SerialName(value = "sdkEncData") val sdkEncData: kotlin.String? = null,

    @SerialName(value = "sdkEphemPubKey") val sdkEphemPubKey: SDKEphemPubKey? = null,

    /* The maximum amount of time in minutes for the 3D Secure 2 authentication process. Optional and only for `deviceChannel` set to **app**. Defaults to **60** minutes. */
    @SerialName(value = "sdkMaxTimeout") val sdkMaxTimeout: kotlin.Int? = 60,

    /* The `sdkReferenceNumber` value as received from the 3D Secure 2 SDK. Only for `deviceChannel` set to **app**. */
    @SerialName(value = "sdkReferenceNumber") val sdkReferenceNumber: kotlin.String? = null,

    /* The `sdkTransID` value as received from the 3D Secure 2 SDK. Only for `deviceChannel` set to **app**. */
    @SerialName(value = "sdkTransID") val sdkTransID: kotlin.String? = null,

    /* Version of the 3D Secure 2 mobile SDK.  Only for `deviceChannel` set to **app**. */
    @SerialName(value = "sdkVersion") val sdkVersion: kotlin.String? = null,

    /* Completion indicator for the device fingerprinting. */
    @SerialName(value = "threeDSCompInd") val threeDSCompInd: kotlin.String? = null,

    /* Indicates the type of Authentication request. */
    @SerialName(value = "threeDSRequestorAuthenticationInd") val threeDSRequestorAuthenticationInd: kotlin.String? = null,

    @SerialName(value = "threeDSRequestorAuthenticationInfo") val threeDSRequestorAuthenticationInfo: ThreeDSRequestorAuthenticationInfo? = null,

    /* Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only */
    @SerialName(value = "threeDSRequestorChallengeInd") val threeDSRequestorChallengeInd: ThreeDS2RequestData.ThreeDSRequestorChallengeInd? = null,

    /* Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only) for Visa. Unique 3D Secure requestor identifier assigned by the Directory Server when you enrol for 3D Secure 2. */
    @SerialName(value = "threeDSRequestorID") val threeDSRequestorID: kotlin.String? = null,

    /* Required for [authentication-only integration](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only) for Visa. Unique 3D Secure requestor name assigned by the Directory Server when you enrol for 3D Secure 2. */
    @SerialName(value = "threeDSRequestorName") val threeDSRequestorName: kotlin.String? = null,

    @SerialName(value = "threeDSRequestorPriorAuthenticationInfo") val threeDSRequestorPriorAuthenticationInfo: ThreeDSRequestorPriorAuthenticationInfo? = null,

    /* URL of the (customer service) website that will be shown to the shopper in case of technical errors during the 3D Secure 2 process. */
    @SerialName(value = "threeDSRequestorURL") val threeDSRequestorURL: kotlin.String? = null,

    /* Identifies the type of transaction being authenticated. Length: 2 characters. Allowed values: * **01** — Goods/Service Purchase * **03** — Check Acceptance * **10** — Account Funding * **11** — Quasi-Cash Transaction * **28** — Prepaid Activation and Load */
    @SerialName(value = "transType") val transType: ThreeDS2RequestData.TransType? = null,

    /* Identify the type of the transaction being authenticated. */
    @SerialName(value = "transactionType") val transactionType: ThreeDS2RequestData.TransactionType? = null,

    /* The `whiteListStatus` value returned from a previous 3D Secure 2 transaction, only applicable for 3D Secure 2 protocol version 2.2.0. */
    @SerialName(value = "whiteListStatus") val whiteListStatus: kotlin.String? = null,

    @SerialName(value = "workPhone") val workPhone: Phone? = null

) {

    /**
     * Indicates the type of account. For example, for a multi-account card product. Length: 2 characters. Allowed values: * **01** — Not applicable * **02** — Credit * **03** — Debit
     *
     * Values: _01,_02,_03
     */
    @Serializable
    enum class AcctType(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03");
    }
    /**
     * Indicates whether the Cardholder Shipping Address and Cardholder Billing Address are the same. Allowed values: * **Y** — Shipping Address matches Billing Address. * **N** — Shipping Address does not match Billing Address.
     *
     * Values: Y,N
     */
    @Serializable
    enum class AddrMatch(val value: kotlin.String) {
        @SerialName(value = "Y") Y("Y"),
        @SerialName(value = "N") N("N");
    }
    /**
     * Possibility to specify a preference for receiving a challenge from the issuer. Allowed values: * `noPreference` * `requestNoChallenge` * `requestChallenge` * `requestChallengeAsMandate` 
     *
     * Values: NoPreference,RequestNoChallenge,RequestChallenge,RequestChallengeAsMandate
     */
    @Serializable
    enum class ChallengeIndicator(val value: kotlin.String) {
        @SerialName(value = "noPreference") NoPreference("noPreference"),
        @SerialName(value = "requestNoChallenge") RequestNoChallenge("requestNoChallenge"),
        @SerialName(value = "requestChallenge") RequestChallenge("requestChallenge"),
        @SerialName(value = "requestChallengeAsMandate") RequestChallengeAsMandate("requestChallengeAsMandate");
    }
    /**
     * Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only
     *
     * Values: _01,_02,_03,_04,_05,_06
     */
    @Serializable
    enum class ThreeDSRequestorChallengeInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04"),
        @SerialName(value = "05") _05("05"),
        @SerialName(value = "06") _06("06");
    }
    /**
     * Identifies the type of transaction being authenticated. Length: 2 characters. Allowed values: * **01** — Goods/Service Purchase * **03** — Check Acceptance * **10** — Account Funding * **11** — Quasi-Cash Transaction * **28** — Prepaid Activation and Load
     *
     * Values: _01,_03,_10,_11,_28
     */
    @Serializable
    enum class TransType(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "10") _10("10"),
        @SerialName(value = "11") _11("11"),
        @SerialName(value = "28") _28("28");
    }
    /**
     * Identify the type of the transaction being authenticated.
     *
     * Values: GoodsOrServicePurchase,CheckAcceptance,AccountFunding,QuasiCashTransaction,PrepaidActivationAndLoad
     */
    @Serializable
    enum class TransactionType(val value: kotlin.String) {
        @SerialName(value = "goodsOrServicePurchase") GoodsOrServicePurchase("goodsOrServicePurchase"),
        @SerialName(value = "checkAcceptance") CheckAcceptance("checkAcceptance"),
        @SerialName(value = "accountFunding") AccountFunding("accountFunding"),
        @SerialName(value = "quasiCashTransaction") QuasiCashTransaction("quasiCashTransaction"),
        @SerialName(value = "prepaidActivationAndLoad") PrepaidActivationAndLoad("prepaidActivationAndLoad");
    }
}

