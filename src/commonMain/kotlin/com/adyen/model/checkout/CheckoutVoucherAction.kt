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

import com.adyen.model.checkout.Amount

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param type **voucher**
 * @param alternativeReference The voucher alternative reference code.
 * @param collectionInstitutionNumber A collection institution number (store number) for Econtext Pay-Easy ATM.
 * @param downloadUrl The URL to download the voucher.
 * @param entity An entity number of Multibanco.
 * @param expiresAt The date time of the voucher expiry.
 * @param initialAmount 
 * @param instructionsUrl The URL to the detailed instructions to make payment using the voucher.
 * @param issuer The issuer of the voucher.
 * @param maskedTelephoneNumber The shopper telephone number (partially masked).
 * @param merchantName The merchant name.
 * @param merchantReference The merchant reference.
 * @param passCreationToken A base64 encoded signature of all properties
 * @param paymentData Encoded payment data.
 * @param paymentMethodType Specifies the payment method.
 * @param reference The voucher reference code.
 * @param shopperEmail The shopper email.
 * @param shopperName The shopper name.
 * @param surcharge 
 * @param totalAmount 
 * @param url Specifies the URL to redirect to.
 */
@Serializable
data class CheckoutVoucherAction (

    /* **voucher** */
    @SerialName(value = "type") @Required val type: CheckoutVoucherAction.Type,

    /* The voucher alternative reference code. */
    @SerialName(value = "alternativeReference") val alternativeReference: kotlin.String? = null,

    /* A collection institution number (store number) for Econtext Pay-Easy ATM. */
    @SerialName(value = "collectionInstitutionNumber") val collectionInstitutionNumber: kotlin.String? = null,

    /* The URL to download the voucher. */
    @SerialName(value = "downloadUrl") val downloadUrl: kotlin.String? = null,

    /* An entity number of Multibanco. */
    @SerialName(value = "entity") val entity: kotlin.String? = null,

    /* The date time of the voucher expiry. */
    @SerialName(value = "expiresAt") val expiresAt: kotlin.String? = null,

    @SerialName(value = "initialAmount") val initialAmount: Amount? = null,

    /* The URL to the detailed instructions to make payment using the voucher. */
    @SerialName(value = "instructionsUrl") val instructionsUrl: kotlin.String? = null,

    /* The issuer of the voucher. */
    @SerialName(value = "issuer") val issuer: kotlin.String? = null,

    /* The shopper telephone number (partially masked). */
    @SerialName(value = "maskedTelephoneNumber") val maskedTelephoneNumber: kotlin.String? = null,

    /* The merchant name. */
    @SerialName(value = "merchantName") val merchantName: kotlin.String? = null,

    /* The merchant reference. */
    @SerialName(value = "merchantReference") val merchantReference: kotlin.String? = null,

    /* A base64 encoded signature of all properties */
    @SerialName(value = "passCreationToken") val passCreationToken: kotlin.String? = null,

    /* Encoded payment data. */
    @SerialName(value = "paymentData") val paymentData: kotlin.String? = null,

    /* Specifies the payment method. */
    @SerialName(value = "paymentMethodType") val paymentMethodType: kotlin.String? = null,

    /* The voucher reference code. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /* The shopper email. */
    @SerialName(value = "shopperEmail") val shopperEmail: kotlin.String? = null,

    /* The shopper name. */
    @SerialName(value = "shopperName") val shopperName: kotlin.String? = null,

    @SerialName(value = "surcharge") val surcharge: Amount? = null,

    @SerialName(value = "totalAmount") val totalAmount: Amount? = null,

    /* Specifies the URL to redirect to. */
    @SerialName(value = "url") val url: kotlin.String? = null

) {

    /**
     * **voucher**
     *
     * Values: Voucher
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "voucher") Voucher("voucher");
    }
}

