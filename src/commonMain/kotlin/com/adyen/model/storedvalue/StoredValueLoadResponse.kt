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
 * @param authCode Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.
 * @param currentBalance 
 * @param pspReference Adyen's 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
 * @param refusalReason If the transaction is refused or an error occurs, this field holds Adyen's mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.
 * @param resultCode The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the `refusalReason` field.  * **Error** – There was an error when the operation was processed. The reason is given in the `refusalReason` field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
 * @param thirdPartyRefusalReason Raw refusal reason received from the third party, where available
 */
@Serializable
data class StoredValueLoadResponse (

    /* Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty. */
    @SerialName(value = "authCode") val authCode: kotlin.String? = null,

    @SerialName(value = "currentBalance") val currentBalance: Amount? = null,

    /* Adyen's 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request. */
    @SerialName(value = "pspReference") val pspReference: kotlin.String? = null,

    /* If the transaction is refused or an error occurs, this field holds Adyen's mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values. */
    @SerialName(value = "refusalReason") val refusalReason: kotlin.String? = null,

    /* The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the `refusalReason` field.  * **Error** – There was an error when the operation was processed. The reason is given in the `refusalReason` field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.   */
    @SerialName(value = "resultCode") val resultCode: StoredValueLoadResponse.ResultCode? = null,

    /* Raw refusal reason received from the third party, where available */
    @SerialName(value = "thirdPartyRefusalReason") val thirdPartyRefusalReason: kotlin.String? = null

) {

    /**
     * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the `refusalReason` field.  * **Error** – There was an error when the operation was processed. The reason is given in the `refusalReason` field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
     *
     * Values: Success,Refused,Error,NotEnoughBalance
     */
    @Serializable
    enum class ResultCode(val value: kotlin.String) {
        @SerialName(value = "Success") Success("Success"),
        @SerialName(value = "Refused") Refused("Refused"),
        @SerialName(value = "Error") Error("Error"),
        @SerialName(value = "NotEnoughBalance") NotEnoughBalance("NotEnoughBalance");
    }
}

