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
 * @param contract The type of recurring contract to be used. Possible values: * `ONECLICK` – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * `RECURRING` – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * `ONECLICK,RECURRING` – Payment details can be used regardless of whether the shopper is on your site or not. * `PAYOUT` – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).
 * @param recurringDetailName A descriptive name for this detail.
 * @param recurringExpiry Date after which no further authorisations shall be performed. Only for 3D Secure 2.
 * @param recurringFrequency Minimum number of days between authorisations. Only for 3D Secure 2.
 * @param tokenService The name of the token service.
 */
@Serializable
data class Recurring (

    /* The type of recurring contract to be used. Possible values: * `ONECLICK` – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * `RECURRING` – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * `ONECLICK,RECURRING` – Payment details can be used regardless of whether the shopper is on your site or not. * `PAYOUT` – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts). */
    @SerialName(value = "contract") val contract: Recurring.Contract? = null,

    /* A descriptive name for this detail. */
    @SerialName(value = "recurringDetailName") val recurringDetailName: kotlin.String? = null,

    /* Date after which no further authorisations shall be performed. Only for 3D Secure 2. */
    @SerialName(value = "recurringExpiry") val recurringExpiry: kotlin.String? = null,

    /* Minimum number of days between authorisations. Only for 3D Secure 2. */
    @SerialName(value = "recurringFrequency") val recurringFrequency: kotlin.String? = null,

    /* The name of the token service. */
    @SerialName(value = "tokenService") val tokenService: Recurring.TokenService? = null

) {

    /**
     * The type of recurring contract to be used. Possible values: * `ONECLICK` – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * `RECURRING` – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * `ONECLICK,RECURRING` – Payment details can be used regardless of whether the shopper is on your site or not. * `PAYOUT` – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).
     *
     * Values: ONECLICK,RECURRING,PAYOUT
     */
    @Serializable
    enum class Contract(val value: kotlin.String) {
        @SerialName(value = "ONECLICK") ONECLICK("ONECLICK"),
        @SerialName(value = "RECURRING") RECURRING("RECURRING"),
        @SerialName(value = "PAYOUT") PAYOUT("PAYOUT");
    }
    /**
     * The name of the token service.
     *
     * Values: VISATOKENSERVICE,MCTOKENSERVICE,AMEXTOKENSERVICE,TOKENSHARING
     */
    @Serializable
    enum class TokenService(val value: kotlin.String) {
        @SerialName(value = "VISATOKENSERVICE") VISATOKENSERVICE("VISATOKENSERVICE"),
        @SerialName(value = "MCTOKENSERVICE") MCTOKENSERVICE("MCTOKENSERVICE"),
        @SerialName(value = "AMEXTOKENSERVICE") AMEXTOKENSERVICE("AMEXTOKENSERVICE"),
        @SerialName(value = "TOKEN_SHARING") TOKENSHARING("TOKEN_SHARING");
    }
}

