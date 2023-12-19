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
 * @param openinvoicedataMerchantData Holds different merchant data points like product, purchase, customer, and so on. It takes data in a Base64 encoded string.  The `merchantData` parameter needs to be added to the `openinvoicedata` signature at the end.  Since the field is optional, if it's not included it does not impact computing the merchant signature.  Applies only to Klarna.  You can contact Klarna for the format and structure of the string.
 * @param openinvoicedataNumberOfLines The number of invoice lines included in `openinvoicedata`.  There needs to be at least one line, so `numberOfLines` needs to be at least 1.
 * @param openinvoicedataRecipientFirstName First name of the recipient. If the delivery address and the billing address are different, specify the `recipientFirstName` and `recipientLastName` to share the delivery address with Klarna. Otherwise, only the billing address is shared with Klarna.
 * @param openinvoicedataRecipientLastName Last name of the recipient. If the delivery address and the billing address are different, specify the `recipientFirstName` and `recipientLastName` to share the delivery address with Klarna. Otherwise, only the billing address is shared with Klarna.
 * @param openinvoicedataLineItemNrCurrencyCode The three-character ISO currency code.
 * @param openinvoicedataLineItemNrDescription A text description of the product the invoice line refers to.
 * @param openinvoicedataLineItemNrItemAmount The price for one item in the invoice line, represented in minor units.  The due amount for the item, VAT excluded.
 * @param openinvoicedataLineItemNrItemId A unique id for this item. Required for RatePay if the description of each item is not unique.
 * @param openinvoicedataLineItemNrItemVatAmount The VAT due for one item in the invoice line, represented in minor units.
 * @param openinvoicedataLineItemNrItemVatPercentage The VAT percentage for one item in the invoice line, represented in minor units.  For example, 19% VAT is specified as 1900.
 * @param openinvoicedataLineItemNrNumberOfItems The number of units purchased of a specific product.
 * @param openinvoicedataLineItemNrReturnShippingCompany Name of the shipping company handling the the return shipment.
 * @param openinvoicedataLineItemNrReturnTrackingNumber The tracking number for the return of the shipment.
 * @param openinvoicedataLineItemNrReturnTrackingUri URI where the customer can track the return of their shipment.
 * @param openinvoicedataLineItemNrShippingCompany Name of the shipping company handling the delivery.
 * @param openinvoicedataLineItemNrShippingMethod Shipping method.
 * @param openinvoicedataLineItemNrTrackingNumber The tracking number for the shipment.
 * @param openinvoicedataLineItemNrTrackingUri URI where the customer can track their shipment.
 */
@Serializable
data class AdditionalDataOpenInvoice (

    /* Holds different merchant data points like product, purchase, customer, and so on. It takes data in a Base64 encoded string.  The `merchantData` parameter needs to be added to the `openinvoicedata` signature at the end.  Since the field is optional, if it's not included it does not impact computing the merchant signature.  Applies only to Klarna.  You can contact Klarna for the format and structure of the string. */
    @SerialName(value = "openinvoicedata.merchantData") val openinvoicedataMerchantData: kotlin.String? = null,

    /* The number of invoice lines included in `openinvoicedata`.  There needs to be at least one line, so `numberOfLines` needs to be at least 1. */
    @SerialName(value = "openinvoicedata.numberOfLines") val openinvoicedataNumberOfLines: kotlin.String? = null,

    /* First name of the recipient. If the delivery address and the billing address are different, specify the `recipientFirstName` and `recipientLastName` to share the delivery address with Klarna. Otherwise, only the billing address is shared with Klarna. */
    @SerialName(value = "openinvoicedata.recipientFirstName") val openinvoicedataRecipientFirstName: kotlin.String? = null,

    /* Last name of the recipient. If the delivery address and the billing address are different, specify the `recipientFirstName` and `recipientLastName` to share the delivery address with Klarna. Otherwise, only the billing address is shared with Klarna. */
    @SerialName(value = "openinvoicedata.recipientLastName") val openinvoicedataRecipientLastName: kotlin.String? = null,

    /* The three-character ISO currency code. */
    @SerialName(value = "openinvoicedataLine[itemNr].currencyCode") val openinvoicedataLineItemNrCurrencyCode: kotlin.String? = null,

    /* A text description of the product the invoice line refers to. */
    @SerialName(value = "openinvoicedataLine[itemNr].description") val openinvoicedataLineItemNrDescription: kotlin.String? = null,

    /* The price for one item in the invoice line, represented in minor units.  The due amount for the item, VAT excluded. */
    @SerialName(value = "openinvoicedataLine[itemNr].itemAmount") val openinvoicedataLineItemNrItemAmount: kotlin.String? = null,

    /* A unique id for this item. Required for RatePay if the description of each item is not unique. */
    @SerialName(value = "openinvoicedataLine[itemNr].itemId") val openinvoicedataLineItemNrItemId: kotlin.String? = null,

    /* The VAT due for one item in the invoice line, represented in minor units. */
    @SerialName(value = "openinvoicedataLine[itemNr].itemVatAmount") val openinvoicedataLineItemNrItemVatAmount: kotlin.String? = null,

    /* The VAT percentage for one item in the invoice line, represented in minor units.  For example, 19% VAT is specified as 1900. */
    @SerialName(value = "openinvoicedataLine[itemNr].itemVatPercentage") val openinvoicedataLineItemNrItemVatPercentage: kotlin.String? = null,

    /* The number of units purchased of a specific product. */
    @SerialName(value = "openinvoicedataLine[itemNr].numberOfItems") val openinvoicedataLineItemNrNumberOfItems: kotlin.String? = null,

    /* Name of the shipping company handling the the return shipment. */
    @SerialName(value = "openinvoicedataLine[itemNr].returnShippingCompany") val openinvoicedataLineItemNrReturnShippingCompany: kotlin.String? = null,

    /* The tracking number for the return of the shipment. */
    @SerialName(value = "openinvoicedataLine[itemNr].returnTrackingNumber") val openinvoicedataLineItemNrReturnTrackingNumber: kotlin.String? = null,

    /* URI where the customer can track the return of their shipment. */
    @SerialName(value = "openinvoicedataLine[itemNr].returnTrackingUri") val openinvoicedataLineItemNrReturnTrackingUri: kotlin.String? = null,

    /* Name of the shipping company handling the delivery. */
    @SerialName(value = "openinvoicedataLine[itemNr].shippingCompany") val openinvoicedataLineItemNrShippingCompany: kotlin.String? = null,

    /* Shipping method. */
    @SerialName(value = "openinvoicedataLine[itemNr].shippingMethod") val openinvoicedataLineItemNrShippingMethod: kotlin.String? = null,

    /* The tracking number for the shipment. */
    @SerialName(value = "openinvoicedataLine[itemNr].trackingNumber") val openinvoicedataLineItemNrTrackingNumber: kotlin.String? = null,

    /* URI where the customer can track their shipment. */
    @SerialName(value = "openinvoicedataLine[itemNr].trackingUri") val openinvoicedataLineItemNrTrackingUri: kotlin.String? = null

)
