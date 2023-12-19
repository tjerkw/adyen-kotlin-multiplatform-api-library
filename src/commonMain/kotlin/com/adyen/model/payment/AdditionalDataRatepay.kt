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
 * @param ratepayInstallmentAmount Amount the customer has to pay each month.
 * @param ratepayInterestRate Interest rate of this installment.
 * @param ratepayLastInstallmentAmount Amount of the last installment.
 * @param ratepayPaymentFirstday Calendar day of the first payment.
 * @param ratepaydataDeliveryDate Date the merchant delivered the goods to the customer.
 * @param ratepaydataDueDate Date by which the customer must settle the payment.
 * @param ratepaydataInvoiceDate Invoice date, defined by the merchant. If not included, the invoice date is set to the delivery date.
 * @param ratepaydataInvoiceId Identification name or number for the invoice, defined by the merchant.
 */
@Serializable
data class AdditionalDataRatepay (

    /* Amount the customer has to pay each month. */
    @SerialName(value = "ratepay.installmentAmount") val ratepayInstallmentAmount: kotlin.String? = null,

    /* Interest rate of this installment. */
    @SerialName(value = "ratepay.interestRate") val ratepayInterestRate: kotlin.String? = null,

    /* Amount of the last installment. */
    @SerialName(value = "ratepay.lastInstallmentAmount") val ratepayLastInstallmentAmount: kotlin.String? = null,

    /* Calendar day of the first payment. */
    @SerialName(value = "ratepay.paymentFirstday") val ratepayPaymentFirstday: kotlin.String? = null,

    /* Date the merchant delivered the goods to the customer. */
    @SerialName(value = "ratepaydata.deliveryDate") val ratepaydataDeliveryDate: kotlin.String? = null,

    /* Date by which the customer must settle the payment. */
    @SerialName(value = "ratepaydata.dueDate") val ratepaydataDueDate: kotlin.String? = null,

    /* Invoice date, defined by the merchant. If not included, the invoice date is set to the delivery date. */
    @SerialName(value = "ratepaydata.invoiceDate") val ratepaydataInvoiceDate: kotlin.String? = null,

    /* Identification name or number for the invoice, defined by the merchant. */
    @SerialName(value = "ratepaydata.invoiceId") val ratepaydataInvoiceId: kotlin.String? = null

)
