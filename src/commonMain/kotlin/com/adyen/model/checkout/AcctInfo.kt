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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param chAccAgeInd Length of time that the cardholder has had the account with the 3DS Requestor.  Allowed values: * **01** — No account * **02** — Created during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days
 * @param chAccChange Date that the cardholder’s account with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Format: **YYYYMMDD**
 * @param chAccChangeInd Length of time since the cardholder’s account information with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Allowed values: * **01** — Changed during this transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days
 * @param chAccPwChange Date that cardholder’s account with the 3DS Requestor had a password change or account reset.  Format: **YYYYMMDD**
 * @param chAccPwChangeInd Indicates the length of time since the cardholder’s account with the 3DS Requestor had a password change or account reset.  Allowed values: * **01** — No change * **02** — Changed during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days
 * @param chAccString Date that the cardholder opened the account with the 3DS Requestor.  Format: **YYYYMMDD**
 * @param nbPurchaseAccount Number of purchases with this cardholder account during the previous six months. Max length: 4 characters.
 * @param paymentAccAge String that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Format: **YYYYMMDD**
 * @param paymentAccInd Indicates the length of time that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Allowed values: * **01** — No account (guest checkout) * **02** — During this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days
 * @param provisionAttemptsDay Number of Add Card attempts in the last 24 hours. Max length: 3 characters.
 * @param shipAddressUsage String when the shipping address used for this transaction was first used with the 3DS Requestor.  Format: **YYYYMMDD**
 * @param shipAddressUsageInd Indicates when the shipping address used for this transaction was first used with the 3DS Requestor.  Allowed values: * **01** — This transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days
 * @param shipNameIndicator Indicates if the Cardholder Name on the account is identical to the shipping Name used for this transaction.  Allowed values: * **01** — Account Name identical to shipping Name * **02** — Account Name different to shipping Name
 * @param suspiciousAccActivity Indicates whether the 3DS Requestor has experienced suspicious activity (including previous fraud) on the cardholder account.  Allowed values: * **01** — No suspicious activity has been observed * **02** — Suspicious activity has been observed
 * @param txnActivityDay Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous 24 hours. Max length: 3 characters.
 * @param txnActivityYear Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous year. Max length: 3 characters.
 */
@Serializable
data class AcctInfo (

    /* Length of time that the cardholder has had the account with the 3DS Requestor.  Allowed values: * **01** — No account * **02** — Created during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days */
    @SerialName(value = "chAccAgeInd") val chAccAgeInd: AcctInfo.ChAccAgeInd? = null,

    /* Date that the cardholder’s account with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Format: **YYYYMMDD** */
    @SerialName(value = "chAccChange") val chAccChange: kotlin.String? = null,

    /* Length of time since the cardholder’s account information with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Allowed values: * **01** — Changed during this transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days */
    @SerialName(value = "chAccChangeInd") val chAccChangeInd: AcctInfo.ChAccChangeInd? = null,

    /* Date that cardholder’s account with the 3DS Requestor had a password change or account reset.  Format: **YYYYMMDD** */
    @SerialName(value = "chAccPwChange") val chAccPwChange: kotlin.String? = null,

    /* Indicates the length of time since the cardholder’s account with the 3DS Requestor had a password change or account reset.  Allowed values: * **01** — No change * **02** — Changed during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days */
    @SerialName(value = "chAccPwChangeInd") val chAccPwChangeInd: AcctInfo.ChAccPwChangeInd? = null,

    /* Date that the cardholder opened the account with the 3DS Requestor.  Format: **YYYYMMDD** */
    @SerialName(value = "chAccString") val chAccString: kotlin.String? = null,

    /* Number of purchases with this cardholder account during the previous six months. Max length: 4 characters. */
    @SerialName(value = "nbPurchaseAccount") val nbPurchaseAccount: kotlin.String? = null,

    /* String that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Format: **YYYYMMDD** */
    @SerialName(value = "paymentAccAge") val paymentAccAge: kotlin.String? = null,

    /* Indicates the length of time that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Allowed values: * **01** — No account (guest checkout) * **02** — During this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days */
    @SerialName(value = "paymentAccInd") val paymentAccInd: AcctInfo.PaymentAccInd? = null,

    /* Number of Add Card attempts in the last 24 hours. Max length: 3 characters. */
    @SerialName(value = "provisionAttemptsDay") val provisionAttemptsDay: kotlin.String? = null,

    /* String when the shipping address used for this transaction was first used with the 3DS Requestor.  Format: **YYYYMMDD** */
    @SerialName(value = "shipAddressUsage") val shipAddressUsage: kotlin.String? = null,

    /* Indicates when the shipping address used for this transaction was first used with the 3DS Requestor.  Allowed values: * **01** — This transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days */
    @SerialName(value = "shipAddressUsageInd") val shipAddressUsageInd: AcctInfo.ShipAddressUsageInd? = null,

    /* Indicates if the Cardholder Name on the account is identical to the shipping Name used for this transaction.  Allowed values: * **01** — Account Name identical to shipping Name * **02** — Account Name different to shipping Name */
    @SerialName(value = "shipNameIndicator") val shipNameIndicator: AcctInfo.ShipNameIndicator? = null,

    /* Indicates whether the 3DS Requestor has experienced suspicious activity (including previous fraud) on the cardholder account.  Allowed values: * **01** — No suspicious activity has been observed * **02** — Suspicious activity has been observed */
    @SerialName(value = "suspiciousAccActivity") val suspiciousAccActivity: AcctInfo.SuspiciousAccActivity? = null,

    /* Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous 24 hours. Max length: 3 characters. */
    @SerialName(value = "txnActivityDay") val txnActivityDay: kotlin.String? = null,

    /* Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous year. Max length: 3 characters. */
    @SerialName(value = "txnActivityYear") val txnActivityYear: kotlin.String? = null

) {

    /**
     * Length of time that the cardholder has had the account with the 3DS Requestor.  Allowed values: * **01** — No account * **02** — Created during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days
     *
     * Values: _01,_02,_03,_04,_05
     */
    @Serializable
    enum class ChAccAgeInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04"),
        @SerialName(value = "05") _05("05");
    }
    /**
     * Length of time since the cardholder’s account information with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Allowed values: * **01** — Changed during this transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days
     *
     * Values: _01,_02,_03,_04
     */
    @Serializable
    enum class ChAccChangeInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04");
    }
    /**
     * Indicates the length of time since the cardholder’s account with the 3DS Requestor had a password change or account reset.  Allowed values: * **01** — No change * **02** — Changed during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days
     *
     * Values: _01,_02,_03,_04,_05
     */
    @Serializable
    enum class ChAccPwChangeInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04"),
        @SerialName(value = "05") _05("05");
    }
    /**
     * Indicates the length of time that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Allowed values: * **01** — No account (guest checkout) * **02** — During this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days
     *
     * Values: _01,_02,_03,_04,_05
     */
    @Serializable
    enum class PaymentAccInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04"),
        @SerialName(value = "05") _05("05");
    }
    /**
     * Indicates when the shipping address used for this transaction was first used with the 3DS Requestor.  Allowed values: * **01** — This transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days
     *
     * Values: _01,_02,_03,_04
     */
    @Serializable
    enum class ShipAddressUsageInd(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02"),
        @SerialName(value = "03") _03("03"),
        @SerialName(value = "04") _04("04");
    }
    /**
     * Indicates if the Cardholder Name on the account is identical to the shipping Name used for this transaction.  Allowed values: * **01** — Account Name identical to shipping Name * **02** — Account Name different to shipping Name
     *
     * Values: _01,_02
     */
    @Serializable
    enum class ShipNameIndicator(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02");
    }
    /**
     * Indicates whether the 3DS Requestor has experienced suspicious activity (including previous fraud) on the cardholder account.  Allowed values: * **01** — No suspicious activity has been observed * **02** — Suspicious activity has been observed
     *
     * Values: _01,_02
     */
    @Serializable
    enum class SuspiciousAccActivity(val value: kotlin.String) {
        @SerialName(value = "01") _01("01"),
        @SerialName(value = "02") _02("02");
    }
}
