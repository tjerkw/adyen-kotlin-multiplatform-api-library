/**
 * Management API
 *
 * Configure and manage your Adyen company and merchant accounts, stores, and payment terminals. ## Authentication Each request to the Management API must be signed with an API key. [Generate your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) in the Customer Area and then set this key to the `X-API-Key` header value.  To access the live endpoints, you need to generate a new API key in your live Customer Area. ## Versioning  Management API handles versioning as part of the endpoint URL. For example, to send a request to this version of the `/companies/{companyId}/webhooks` endpoint, use:  ```text https://management-test.adyen.com/v3/companies/{companyId}/webhooks ```  ## Going live  To access the live endpoints, you need an API key from your live Customer Area. Use this API key to make requests to:  ```text https://management-live.adyen.com/v3 ```  ## Release notes Have a look at the [release notes](https://docs.adyen.com/release-notes/management-api) to find out what changed in this version!
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

package com.adyen.model.management

import com.adyen.model.management.AfterpayTouchInfo
import com.adyen.model.management.ApplePayInfo
import com.adyen.model.management.BcmcInfo
import com.adyen.model.management.CartesBancairesInfo
import com.adyen.model.management.ClearpayInfo
import com.adyen.model.management.GenericPmWithTdiInfo
import com.adyen.model.management.GiroPayInfo
import com.adyen.model.management.GooglePayInfo
import com.adyen.model.management.KlarnaInfo
import com.adyen.model.management.MealVoucherFRInfo
import com.adyen.model.management.PayPalInfo
import com.adyen.model.management.SofortInfo
import com.adyen.model.management.SwishInfo
import com.adyen.model.management.TwintInfo
import com.adyen.model.management.VippsInfo

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id The identifier of the resource.
 * @param afterpayTouch 
 * @param allowed Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
 * @param applePay 
 * @param bcmc 
 * @param businessLineId The unique identifier of the business line.
 * @param cartesBancaires 
 * @param clearpay 
 * @param countries The list of countries where a payment method is available. By default, all countries supported by the payment method.
 * @param cup 
 * @param currencies The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
 * @param customRoutingFlags The list of custom routing flags to route payment to the intended acquirer.
 * @param diners 
 * @param discover 
 * @param eftposAustralia 
 * @param enabled Indicates whether the payment method is enabled (**true**) or disabled (**false**).
 * @param giroPay 
 * @param girocard 
 * @param googlePay 
 * @param ideal 
 * @param interacCard 
 * @param jcb 
 * @param klarna 
 * @param maestro 
 * @param mc 
 * @param mealVoucherFR 
 * @param paypal 
 * @param reference Your reference for the payment method. Supported characters a-z, A-Z, 0-9.
 * @param shopperInteraction The sales channel.
 * @param sofort 
 * @param storeIds The unique identifier of the store for which to configure the payment method, if any.
 * @param swish 
 * @param twint 
 * @param type Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
 * @param verificationStatus Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
 * @param vipps 
 * @param visa 
 */
@Serializable
data class PaymentMethod (

    /* The identifier of the resource. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "afterpayTouch") val afterpayTouch: AfterpayTouchInfo? = null,

    /* Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account. */
    @SerialName(value = "allowed") val allowed: kotlin.Boolean? = null,

    @SerialName(value = "applePay") val applePay: ApplePayInfo? = null,

    @SerialName(value = "bcmc") val bcmc: BcmcInfo? = null,

    /* The unique identifier of the business line. */
    @SerialName(value = "businessLineId") val businessLineId: kotlin.String? = null,

    @SerialName(value = "cartesBancaires") val cartesBancaires: CartesBancairesInfo? = null,

    @SerialName(value = "clearpay") val clearpay: ClearpayInfo? = null,

    /* The list of countries where a payment method is available. By default, all countries supported by the payment method. */
    @SerialName(value = "countries") val countries: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "cup") val cup: GenericPmWithTdiInfo? = null,

    /* The list of currencies that a payment method supports. By default, all currencies supported by the payment method. */
    @SerialName(value = "currencies") val currencies: kotlin.collections.List<kotlin.String>? = null,

    /* The list of custom routing flags to route payment to the intended acquirer. */
    @SerialName(value = "customRoutingFlags") val customRoutingFlags: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "diners") val diners: GenericPmWithTdiInfo? = null,

    @SerialName(value = "discover") val discover: GenericPmWithTdiInfo? = null,

    @SerialName(value = "eftpos_australia") val eftposAustralia: GenericPmWithTdiInfo? = null,

    /* Indicates whether the payment method is enabled (**true**) or disabled (**false**). */
    @SerialName(value = "enabled") val enabled: kotlin.Boolean? = null,

    @SerialName(value = "giroPay") val giroPay: GiroPayInfo? = null,

    @SerialName(value = "girocard") val girocard: GenericPmWithTdiInfo? = null,

    @SerialName(value = "googlePay") val googlePay: GooglePayInfo? = null,

    @SerialName(value = "ideal") val ideal: GenericPmWithTdiInfo? = null,

    @SerialName(value = "interac_card") val interacCard: GenericPmWithTdiInfo? = null,

    @SerialName(value = "jcb") val jcb: GenericPmWithTdiInfo? = null,

    @SerialName(value = "klarna") val klarna: KlarnaInfo? = null,

    @SerialName(value = "maestro") val maestro: GenericPmWithTdiInfo? = null,

    @SerialName(value = "mc") val mc: GenericPmWithTdiInfo? = null,

    @SerialName(value = "mealVoucher_FR") val mealVoucherFR: MealVoucherFRInfo? = null,

    @SerialName(value = "paypal") val paypal: PayPalInfo? = null,

    /* Your reference for the payment method. Supported characters a-z, A-Z, 0-9. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /* The sales channel. */
    @SerialName(value = "shopperInteraction") val shopperInteraction: kotlin.String? = null,

    @SerialName(value = "sofort") val sofort: SofortInfo? = null,

    /* The unique identifier of the store for which to configure the payment method, if any. */
    @SerialName(value = "storeIds") val storeIds: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "swish") val swish: SwishInfo? = null,

    @SerialName(value = "twint") val twint: TwintInfo? = null,

    /* Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). */
    @SerialName(value = "type") val type: kotlin.String? = null,

    /* Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected** */
    @SerialName(value = "verificationStatus") val verificationStatus: PaymentMethod.VerificationStatus? = null,

    @SerialName(value = "vipps") val vipps: VippsInfo? = null,

    @SerialName(value = "visa") val visa: GenericPmWithTdiInfo? = null

) {

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
