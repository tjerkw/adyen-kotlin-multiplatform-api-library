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
 * @param retryChainAttemptNumber The number of times the transaction (not order) has been retried between different payment service providers. For instance, the `chainAttemptNumber` set to 2 means that this transaction has been recently tried on another provider before being sent to Adyen.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together.
 * @param retryOrderAttemptNumber The index of the attempt to bill a particular order, which is identified by the `merchantOrderReference` field. For example, if a recurring transaction fails and is retried one day later, then the order number for these attempts would be 1 and 2, respectively.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together.
 * @param retrySkipRetry The Boolean value indicating whether Adyen should skip or retry this transaction, if possible.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together.
 */
@Serializable
data class AdditionalDataRetry (

    /* The number of times the transaction (not order) has been retried between different payment service providers. For instance, the `chainAttemptNumber` set to 2 means that this transaction has been recently tried on another provider before being sent to Adyen.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together. */
    @SerialName(value = "retry.chainAttemptNumber") val retryChainAttemptNumber: kotlin.String? = null,

    /* The index of the attempt to bill a particular order, which is identified by the `merchantOrderReference` field. For example, if a recurring transaction fails and is retried one day later, then the order number for these attempts would be 1 and 2, respectively.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together. */
    @SerialName(value = "retry.orderAttemptNumber") val retryOrderAttemptNumber: kotlin.String? = null,

    /* The Boolean value indicating whether Adyen should skip or retry this transaction, if possible.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together. */
    @SerialName(value = "retry.skipRetry") val retrySkipRetry: kotlin.String? = null

)
