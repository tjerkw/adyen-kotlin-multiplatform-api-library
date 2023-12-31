/**
 * Adyen Payment API
 *
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
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

package com.adyen.model.payment


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param accountAgeIndicator Indicator for the length of time since this shopper account was created in the merchant's environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
 * @param accountChangeDate Date when the shopper's account was last changed.
 * @param accountChangeIndicator Indicator for the length of time since the shopper's account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
 * @param accountCreationDate Date when the shopper's account was created.
 * @param accountType Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit
 * @param addCardAttemptsDay Number of attempts the shopper tried to add a card to their account in the last day.
 * @param deliveryAddressUsageDate Date the selected delivery address was first used.
 * @param deliveryAddressUsageIndicator Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
 * @param homePhone Shopper's home phone number (including the country code).
 * @param mobilePhone Shopper's mobile phone number (including the country code).
 * @param passwordChangeDate Date when the shopper last changed their password.
 * @param passwordChangeIndicator Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
 * @param pastTransactionsDay Number of all transactions (successful and abandoned) from this shopper in the past 24 hours.
 * @param pastTransactionsYear Number of all transactions (successful and abandoned) from this shopper in the past year.
 * @param paymentAccountAge Date this payment method was added to the shopper's account.
 * @param paymentAccountIndicator Indicator for the length of time since this payment method was added to this shopper's account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
 * @param purchasesLast6Months Number of successful purchases in the last six months.
 * @param suspiciousActivity Whether suspicious activity was recorded on this account.
 * @param workPhone Shopper's work phone number (including the country code).
 */
@Serializable
data class AccountInfo (

    /* Indicator for the length of time since this shopper account was created in the merchant's environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days */
    @SerialName(value = "accountAgeIndicator") val accountAgeIndicator: AccountInfo.AccountAgeIndicator? = null,

    /* Date when the shopper's account was last changed. */
    @SerialName(value = "accountChangeDate") val accountChangeDate: kotlin.String? = null,

    /* Indicator for the length of time since the shopper's account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days */
    @SerialName(value = "accountChangeIndicator") val accountChangeIndicator: AccountInfo.AccountChangeIndicator? = null,

    /* Date when the shopper's account was created. */
    @SerialName(value = "accountCreationDate") val accountCreationDate: kotlin.String? = null,

    /* Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit */
    @SerialName(value = "accountType") val accountType: AccountInfo.AccountType? = null,

    /* Number of attempts the shopper tried to add a card to their account in the last day. */
    @SerialName(value = "addCardAttemptsDay") val addCardAttemptsDay: kotlin.Int? = null,

    /* Date the selected delivery address was first used. */
    @SerialName(value = "deliveryAddressUsageDate") val deliveryAddressUsageDate: kotlin.String? = null,

    /* Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days */
    @SerialName(value = "deliveryAddressUsageIndicator") val deliveryAddressUsageIndicator: AccountInfo.DeliveryAddressUsageIndicator? = null,

    /* Shopper's home phone number (including the country code). */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "homePhone") val homePhone: kotlin.String? = null,

    /* Shopper's mobile phone number (including the country code). */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "mobilePhone") val mobilePhone: kotlin.String? = null,

    /* Date when the shopper last changed their password. */
    @SerialName(value = "passwordChangeDate") val passwordChangeDate: kotlin.String? = null,

    /* Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days */
    @SerialName(value = "passwordChangeIndicator") val passwordChangeIndicator: AccountInfo.PasswordChangeIndicator? = null,

    /* Number of all transactions (successful and abandoned) from this shopper in the past 24 hours. */
    @SerialName(value = "pastTransactionsDay") val pastTransactionsDay: kotlin.Int? = null,

    /* Number of all transactions (successful and abandoned) from this shopper in the past year. */
    @SerialName(value = "pastTransactionsYear") val pastTransactionsYear: kotlin.Int? = null,

    /* Date this payment method was added to the shopper's account. */
    @SerialName(value = "paymentAccountAge") val paymentAccountAge: kotlin.String? = null,

    /* Indicator for the length of time since this payment method was added to this shopper's account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days */
    @SerialName(value = "paymentAccountIndicator") val paymentAccountIndicator: AccountInfo.PaymentAccountIndicator? = null,

    /* Number of successful purchases in the last six months. */
    @SerialName(value = "purchasesLast6Months") val purchasesLast6Months: kotlin.Int? = null,

    /* Whether suspicious activity was recorded on this account. */
    @SerialName(value = "suspiciousActivity") val suspiciousActivity: kotlin.Boolean? = null,

    /* Shopper's work phone number (including the country code). */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "workPhone") val workPhone: kotlin.String? = null

) {

    /**
     * Indicator for the length of time since this shopper account was created in the merchant's environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
     *
     * Values: NotApplicable,ThisTransaction,LessThan30Days,From30To60Days,MoreThan60Days
     */
    @Serializable
    enum class AccountAgeIndicator(val value: kotlin.String) {
        @SerialName(value = "notApplicable") NotApplicable("notApplicable"),
        @SerialName(value = "thisTransaction") ThisTransaction("thisTransaction"),
        @SerialName(value = "lessThan30Days") LessThan30Days("lessThan30Days"),
        @SerialName(value = "from30To60Days") From30To60Days("from30To60Days"),
        @SerialName(value = "moreThan60Days") MoreThan60Days("moreThan60Days");
    }
    /**
     * Indicator for the length of time since the shopper's account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
     *
     * Values: ThisTransaction,LessThan30Days,From30To60Days,MoreThan60Days
     */
    @Serializable
    enum class AccountChangeIndicator(val value: kotlin.String) {
        @SerialName(value = "thisTransaction") ThisTransaction("thisTransaction"),
        @SerialName(value = "lessThan30Days") LessThan30Days("lessThan30Days"),
        @SerialName(value = "from30To60Days") From30To60Days("from30To60Days"),
        @SerialName(value = "moreThan60Days") MoreThan60Days("moreThan60Days");
    }
    /**
     * Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit
     *
     * Values: NotApplicable,Credit,Debit
     */
    @Serializable
    enum class AccountType(val value: kotlin.String) {
        @SerialName(value = "notApplicable") NotApplicable("notApplicable"),
        @SerialName(value = "credit") Credit("credit"),
        @SerialName(value = "debit") Debit("debit");
    }
    /**
     * Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
     *
     * Values: ThisTransaction,LessThan30Days,From30To60Days,MoreThan60Days
     */
    @Serializable
    enum class DeliveryAddressUsageIndicator(val value: kotlin.String) {
        @SerialName(value = "thisTransaction") ThisTransaction("thisTransaction"),
        @SerialName(value = "lessThan30Days") LessThan30Days("lessThan30Days"),
        @SerialName(value = "from30To60Days") From30To60Days("from30To60Days"),
        @SerialName(value = "moreThan60Days") MoreThan60Days("moreThan60Days");
    }
    /**
     * Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
     *
     * Values: NotApplicable,ThisTransaction,LessThan30Days,From30To60Days,MoreThan60Days
     */
    @Serializable
    enum class PasswordChangeIndicator(val value: kotlin.String) {
        @SerialName(value = "notApplicable") NotApplicable("notApplicable"),
        @SerialName(value = "thisTransaction") ThisTransaction("thisTransaction"),
        @SerialName(value = "lessThan30Days") LessThan30Days("lessThan30Days"),
        @SerialName(value = "from30To60Days") From30To60Days("from30To60Days"),
        @SerialName(value = "moreThan60Days") MoreThan60Days("moreThan60Days");
    }
    /**
     * Indicator for the length of time since this payment method was added to this shopper's account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
     *
     * Values: NotApplicable,ThisTransaction,LessThan30Days,From30To60Days,MoreThan60Days
     */
    @Serializable
    enum class PaymentAccountIndicator(val value: kotlin.String) {
        @SerialName(value = "notApplicable") NotApplicable("notApplicable"),
        @SerialName(value = "thisTransaction") ThisTransaction("thisTransaction"),
        @SerialName(value = "lessThan30Days") LessThan30Days("lessThan30Days"),
        @SerialName(value = "from30To60Days") From30To60Days("from30To60Days"),
        @SerialName(value = "moreThan60Days") MoreThan60Days("moreThan60Days");
    }
}

