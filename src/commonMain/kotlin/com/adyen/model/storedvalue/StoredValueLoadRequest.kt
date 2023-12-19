/**
 * Adyen Stored Value API
 *
 * A set of API endpoints to manage stored value products.
 *
 * The version of the OpenAPI document: 46
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

package com.adyen.model.storedvalue

import com.adyen.model.storedvalue.Amount

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param amount 
 * @param merchantAccount The merchant account identifier, with which you want to process the transaction.
 * @param paymentMethod The collection that contains the type of the payment method and its specific information if available
 * @param reference The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.
 * @param loadType The type of load you are trying to do, when absent we default to 'Load'
 * @param recurringDetailReference 
 * @param shopperInteraction Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
 * @param shopperReference 
 * @param store The physical store, for which this payment is processed.
 */
@Serializable
data class StoredValueLoadRequest (

    @SerialName(value = "amount") @Required val amount: Amount,

    /* The merchant account identifier, with which you want to process the transaction. */
    @SerialName(value = "merchantAccount") @Required val merchantAccount: kotlin.String,

    /* The collection that contains the type of the payment method and its specific information if available */
    @SerialName(value = "paymentMethod") @Required val paymentMethod: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters. */
    @SerialName(value = "reference") @Required val reference: kotlin.String,

    /* The type of load you are trying to do, when absent we default to 'Load' */
    @SerialName(value = "loadType") val loadType: StoredValueLoadRequest.LoadType? = null,

    @SerialName(value = "recurringDetailReference") val recurringDetailReference: kotlin.String? = null,

    /* Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal. */
    @SerialName(value = "shopperInteraction") val shopperInteraction: StoredValueLoadRequest.ShopperInteraction? = null,

    @SerialName(value = "shopperReference") val shopperReference: kotlin.String? = null,

    /* The physical store, for which this payment is processed. */
    @SerialName(value = "store") val store: kotlin.String? = null

) {

    /**
     * The type of load you are trying to do, when absent we default to 'Load'
     *
     * Values: MerchandiseReturn,Load
     */
    @Serializable
    enum class LoadType(val value: kotlin.String) {
        @SerialName(value = "merchandiseReturn") MerchandiseReturn("merchandiseReturn"),
        @SerialName(value = "load") Load("load");
    }
    /**
     * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
     *
     * Values: Ecommerce,ContAuth,Moto,POS
     */
    @Serializable
    enum class ShopperInteraction(val value: kotlin.String) {
        @SerialName(value = "Ecommerce") Ecommerce("Ecommerce"),
        @SerialName(value = "ContAuth") ContAuth("ContAuth"),
        @SerialName(value = "Moto") Moto("Moto"),
        @SerialName(value = "POS") POS("POS");
    }
}

