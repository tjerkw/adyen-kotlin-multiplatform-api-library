/**
 * Adyen Payout API
 *
 * A set of API endpoints that allow you to store payout details, confirm, or decline a payout.  For more information, refer to [Online payouts](https://docs.adyen.com/online-payments/online-payouts). ## Authentication To use the Payout API, you need to have [two API credentials](https://docs.adyen.com/online-payments/online-payouts#payouts-to-bank-accounts-and-wallets): one for storing payout details and submitting payouts, and another one for confirming or declining payouts. If you don't have the required API credentials, contact our [Support Team](https://www.adyen.help/hc/en-us/requests/new).  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using [basic authentication](https://docs.adyen.com/development-resources/api-credentials#basic-authentication).  The following example shows how to authenticate your request with basic authentication when submitting a payout:  ``` curl -U \"storePayout@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payout/v68/payout ```  ## Going live  To authenticate to the live endpoints, you need [API credentials](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payout/v68/payout ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
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

package com.adyen.model.payout


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param bankAccountNumber The bank account number (without separators).
 * @param bankCity The bank city.
 * @param bankLocationId The location id of the bank. The field value is `nil` in most cases.
 * @param bankName The name of the bank.
 * @param bic The [Business Identifier Code](https://en.wikipedia.org/wiki/ISO_9362) (BIC) is the SWIFT address assigned to a bank. The field value is `nil` in most cases.
 * @param countryCode Country code where the bank is located.  A valid value is an ISO two-character country code (e.g. 'NL').
 * @param iban The [International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number) (IBAN).
 * @param ownerName The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don't accept 'ø'. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. > If provided details don't match the required format, the response returns the error message: 203 'Invalid bank account holder name'.
 * @param taxId The bank account holder's tax ID.
 */
@Serializable
data class BankAccount (

    /* The bank account number (without separators). */
    @SerialName(value = "bankAccountNumber") val bankAccountNumber: kotlin.String? = null,

    /* The bank city. */
    @SerialName(value = "bankCity") val bankCity: kotlin.String? = null,

    /* The location id of the bank. The field value is `nil` in most cases. */
    @SerialName(value = "bankLocationId") val bankLocationId: kotlin.String? = null,

    /* The name of the bank. */
    @SerialName(value = "bankName") val bankName: kotlin.String? = null,

    /* The [Business Identifier Code](https://en.wikipedia.org/wiki/ISO_9362) (BIC) is the SWIFT address assigned to a bank. The field value is `nil` in most cases. */
    @SerialName(value = "bic") val bic: kotlin.String? = null,

    /* Country code where the bank is located.  A valid value is an ISO two-character country code (e.g. 'NL'). */
    @SerialName(value = "countryCode") val countryCode: kotlin.String? = null,

    /* The [International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number) (IBAN). */
    @SerialName(value = "iban") val iban: kotlin.String? = null,

    /* The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don't accept 'ø'. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. > If provided details don't match the required format, the response returns the error message: 203 'Invalid bank account holder name'. */
    @SerialName(value = "ownerName") val ownerName: kotlin.String? = null,

    /* The bank account holder's tax ID. */
    @SerialName(value = "taxId") val taxId: kotlin.String? = null

)

