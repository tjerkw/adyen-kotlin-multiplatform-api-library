/**
 * Management Webhooks
 *
 * Adyen uses webhooks to inform your system about events that happen with your Adyen company and merchant accounts, stores, payment terminals, and payment methods when using [Management API](https://docs.adyen.com/api-explorer/#/ManagementService/latest/overview).  When an event occurs, Adyen makes an HTTP POST request to a URL on your server and includes the details of the event in the request body.  See [Webhooks](https://docs.adyen.com/development-resources/webhooks) for more information.
 *
 * The version of the OpenAPI document: 3
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

package com.adyen.model.managementwebhooks


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id The unique identifier of the resource.
 * @param merchantId The unique identifier of the merchant account.
 * @param status The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. 
 * @param type Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
 * @param allowed Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
 * @param enabled Indicates whether the payment method is enabled (**true**) or disabled (**false**).
 * @param reference Your reference for the payment method.
 * @param storeId The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any.
 * @param verificationStatus Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
 */
@Serializable
data class MidServiceNotificationData (

    /* The unique identifier of the resource. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The unique identifier of the merchant account. */
    @SerialName(value = "merchantId") @Required val merchantId: kotlin.String,

    /* The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed.  */
    @SerialName(value = "status") @Required val status: MidServiceNotificationData.Status,

    /* Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). */
    @SerialName(value = "type") @Required val type: kotlin.String,

    /* Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account. */
    @SerialName(value = "allowed") val allowed: kotlin.Boolean? = null,

    /* Indicates whether the payment method is enabled (**true**) or disabled (**false**). */
    @SerialName(value = "enabled") val enabled: kotlin.Boolean? = null,

    /* Your reference for the payment method. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /* The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any. */
    @SerialName(value = "storeId") val storeId: kotlin.String? = null,

    /* Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected** */
    @SerialName(value = "verificationStatus") val verificationStatus: MidServiceNotificationData.VerificationStatus? = null

) {

    /**
     * The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed. 
     *
     * Values: Success,Failure,CapabilityPending,DataRequired,UpdatesExpected
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "success") Success("success"),
        @SerialName(value = "failure") Failure("failure"),
        @SerialName(value = "capabilityPending") CapabilityPending("capabilityPending"),
        @SerialName(value = "dataRequired") DataRequired("dataRequired"),
        @SerialName(value = "updatesExpected") UpdatesExpected("updatesExpected");
    }
    /**
     * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
     *
     * Values: Valid,Pending,Invalid,Rejected
     */
    @Serializable
    enum class VerificationStatus(val value: kotlin.String) {
        @SerialName(value = "valid") Valid("valid"),
        @SerialName(value = "pending") Pending("pending"),
        @SerialName(value = "invalid") Invalid("invalid"),
        @SerialName(value = "rejected") Rejected("rejected");
    }
}
