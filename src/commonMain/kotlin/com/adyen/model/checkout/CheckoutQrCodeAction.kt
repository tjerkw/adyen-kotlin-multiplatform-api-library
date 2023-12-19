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
 * @param type **qrCode**
 * @param expiresAt Expiry time of the QR code.
 * @param paymentData Encoded payment data.
 * @param paymentMethodType Specifies the payment method.
 * @param qrCodeData The contents of the QR code as a UTF8 string.
 * @param url Specifies the URL to redirect to.
 */
@Serializable
data class CheckoutQrCodeAction (

    /* **qrCode** */
    @SerialName(value = "type") @Required val type: CheckoutQrCodeAction.Type,

    /* Expiry time of the QR code. */
    @SerialName(value = "expiresAt") val expiresAt: kotlin.String? = null,

    /* Encoded payment data. */
    @SerialName(value = "paymentData") val paymentData: kotlin.String? = null,

    /* Specifies the payment method. */
    @SerialName(value = "paymentMethodType") val paymentMethodType: kotlin.String? = null,

    /* The contents of the QR code as a UTF8 string. */
    @SerialName(value = "qrCodeData") val qrCodeData: kotlin.String? = null,

    /* Specifies the URL to redirect to. */
    @SerialName(value = "url") val url: kotlin.String? = null

) {

    /**
     * **qrCode**
     *
     * Values: QrCode
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "qrCode") QrCode("qrCode");
    }
}

