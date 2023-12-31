/**
 * Configuration webhooks
 *
 * Adyen sends webhooks to inform your system about events that occur in your platform. These events include, for example, when an account holder's capabilities are updated, or when a sweep configuration is created or updated.  When an event occurs, Adyen makes an HTTP POST request to a URL on your server and includes the details of the event in the request body.  You can use these webhooks to build your implementation. For example, you can use this information to update internal statuses when the status of a capability is changed.
 *
 * The version of the OpenAPI document: 1
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

package com.adyen.model.configurationwebhooks

import com.adyen.model.configurationwebhooks.BulkAddress

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param configurationProfileId The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the `shipmentMethod` to override the logistics company defined in the card configuration profile.
 * @param activation Overrides the activation label design ID defined in the `configurationProfileId`. The activation label is attached to the card and contains the activation instructions.
 * @param activationUrl Your app's URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.
 * @param bulkAddress 
 * @param cardImageId The ID of the card image. This is the image that will be printed on the full front of the card.
 * @param carrier Overrides the carrier design ID defined in the `configurationProfileId`. The carrier is the letter or packaging to which the card is attached.
 * @param carrierImageId The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.
 * @param currency The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.
 * @param envelope Overrides the envelope design ID defined in the `configurationProfileId`. 
 * @param insert Overrides the insert design ID defined in the `configurationProfileId`. An insert is any additional material, such as marketing materials, that are shipped together with the card.
 * @param language The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.
 * @param logoImageId The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.
 * @param pinMailer Overrides the PIN mailer design ID defined in the `configurationProfileId`. The PIN mailer is the letter on which the PIN is printed.
 * @param shipmentMethod Overrides the logistics company defined in the `configurationProfileId`.
 */
@Serializable
data class CardConfiguration (

    /* The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the `shipmentMethod` to override the logistics company defined in the card configuration profile. */
    @SerialName(value = "configurationProfileId") @Required val configurationProfileId: kotlin.String,

    /* Overrides the activation label design ID defined in the `configurationProfileId`. The activation label is attached to the card and contains the activation instructions. */
    @SerialName(value = "activation") val activation: kotlin.String? = null,

    /* Your app's URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters. */
    @SerialName(value = "activationUrl") val activationUrl: kotlin.String? = null,

    @SerialName(value = "bulkAddress") val bulkAddress: BulkAddress? = null,

    /* The ID of the card image. This is the image that will be printed on the full front of the card. */
    @SerialName(value = "cardImageId") val cardImageId: kotlin.String? = null,

    /* Overrides the carrier design ID defined in the `configurationProfileId`. The carrier is the letter or packaging to which the card is attached. */
    @SerialName(value = "carrier") val carrier: kotlin.String? = null,

    /* The ID of the carrier image. This is the image that will printed on the letter to which the card is attached. */
    @SerialName(value = "carrierImageId") val carrierImageId: kotlin.String? = null,

    /* The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**. */
    @SerialName(value = "currency") val currency: kotlin.String? = null,

    /* Overrides the envelope design ID defined in the `configurationProfileId`.  */
    @SerialName(value = "envelope") val envelope: kotlin.String? = null,

    /* Overrides the insert design ID defined in the `configurationProfileId`. An insert is any additional material, such as marketing materials, that are shipped together with the card. */
    @SerialName(value = "insert") val insert: kotlin.String? = null,

    /* The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**. */
    @SerialName(value = "language") val language: kotlin.String? = null,

    /* The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner. */
    @SerialName(value = "logoImageId") val logoImageId: kotlin.String? = null,

    /* Overrides the PIN mailer design ID defined in the `configurationProfileId`. The PIN mailer is the letter on which the PIN is printed. */
    @SerialName(value = "pinMailer") val pinMailer: kotlin.String? = null,

    /* Overrides the logistics company defined in the `configurationProfileId`. */
    @SerialName(value = "shipmentMethod") val shipmentMethod: kotlin.String? = null

)

