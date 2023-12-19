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

import com.adyen.model.checkout.AchDetails
import com.adyen.model.checkout.AfterpayDetails
import com.adyen.model.checkout.AmazonPayDetails
import com.adyen.model.checkout.AndroidPayDetails
import com.adyen.model.checkout.ApplePayDetails
import com.adyen.model.checkout.BacsDirectDebitDetails
import com.adyen.model.checkout.BillDeskDetails
import com.adyen.model.checkout.BlikDetails
import com.adyen.model.checkout.CardDetails
import com.adyen.model.checkout.CellulantDetails
import com.adyen.model.checkout.DokuDetails
import com.adyen.model.checkout.DotpayDetails
import com.adyen.model.checkout.DragonpayDetails
import com.adyen.model.checkout.EcontextVoucherDetails
import com.adyen.model.checkout.GenericIssuerPaymentMethodDetails
import com.adyen.model.checkout.GiropayDetails
import com.adyen.model.checkout.GooglePayDetails
import com.adyen.model.checkout.IdealDetails
import com.adyen.model.checkout.KlarnaDetails
import com.adyen.model.checkout.MasterpassDetails
import com.adyen.model.checkout.MbwayDetails
import com.adyen.model.checkout.MobilePayDetails
import com.adyen.model.checkout.MolPayDetails
import com.adyen.model.checkout.OpenInvoiceDetails
import com.adyen.model.checkout.PayPalDetails
import com.adyen.model.checkout.PayUUpiDetails
import com.adyen.model.checkout.PayWithGoogleDetails
import com.adyen.model.checkout.PaymentDetails
import com.adyen.model.checkout.RatepayDetails
import com.adyen.model.checkout.SamsungPayDetails
import com.adyen.model.checkout.SepaDirectDebitDetails
import com.adyen.model.checkout.StoredPaymentMethodDetails
import com.adyen.model.checkout.UpiCollectDetails
import com.adyen.model.checkout.UpiIntentDetails
import com.adyen.model.checkout.VippsDetails
import com.adyen.model.checkout.VisaCheckoutDetails
import com.adyen.model.checkout.WeChatPayDetails
import com.adyen.model.checkout.WeChatPayMiniProgramDetails
import com.adyen.model.checkout.ZipDetails

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * The type and required details of a payment method to use.
 *
 * @param bankAccountNumber The bank account number (without separators).
 * @param ownerName The name of the bank account holder.
 * @param type **zip**
 * @param applePayToken The stringified and base64 encoded `paymentData` you retrieved from the Apple framework.
 * @param issuer The shopper's bank. Specify this with the issuer value that corresponds to this bank.
 * @param firstName The shopper's first name.
 * @param lastName The shopper's last name.
 * @param shopperEmail 
 * @param telephoneNumber 
 * @param googlePayToken The `token` that you obtained from the [Google Pay API](https://developers.google.com/pay/api/web/reference/response-objects#PaymentData) `PaymentData` response.
 * @param masterpassTransactionId The Masterpass transaction ID.
 * @param samsungPayToken The payload you received from the Samsung Pay SDK response.
 * @param iban The International Bank Account Number (IBAN).
 * @param billingSequenceNumber The sequence number for the debit. For example, send **2** if this is the second debit for the subscription. The sequence number is included in the notification sent to the shopper.
 * @param visaCheckoutCallId The Visa Click to Pay Call ID value. When your shopper selects a payment and/or a shipping address from Visa Click to Pay, you will receive a Visa Click to Pay Call ID.
 * @param bankAccountType The bank account type (checking, savings...).
 * @param bankLocationId The bank routing number of the account.
 * @param checkoutAttemptId The checkout attempt identifier.
 * @param encryptedBankAccountNumber Encrypted bank account number. The bank account number (without separators).
 * @param encryptedBankLocationId Encrypted location id. The bank routing number of the account. The field value is `nil` in most cases.
 * @param recurringDetailReference This is the `recurringDetailReference` returned in the response when you created the token.
 * @param storedPaymentMethodId This is the `recurringDetailReference` returned in the response when you created the token.
 * @param billingAddress The address where to send the invoice.
 * @param deliveryAddress The address where the goods should be delivered.
 * @param personalDetails Shopper name, date of birth, phone number, and email address.
 * @param amazonPayToken This is the `amazonPayToken` that you obtained from the [Get Checkout Session](https://amazon-pay-acquirer-guide.s3-eu-west-1.amazonaws.com/v1/amazon-pay-api-v2/checkout-session.html#get-checkout-session) response. This token is used for API only integration specifically.
 * @param checkoutSessionId The `checkoutSessionId` is used to identify the checkout session at the Amazon Pay side. This field is required only for drop-in and components integration, where it replaces the amazonPayToken.
 * @param fundingSource The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
 * @param holderName The name of the card holder.
 * @param blikCode BLIK code consisting of 6 digits.
 * @param brand Secondary brand of the card. For example: **plastix**, **hmclub**.
 * @param cupsecureplusSmscode 
 * @param cvc The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
 * @param encryptedCardNumber The encrypted card number.
 * @param encryptedExpiryMonth The encrypted card expiry month.
 * @param encryptedExpiryYear The encrypted card expiry year.
 * @param encryptedSecurityCode The encrypted card verification code.
 * @param expiryMonth The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
 * @param expiryYear The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
 * @param networkPaymentReference The network token reference. This is the [`networkTxReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.
 * @param number The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
 * @param shopperNotificationReference The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used for recurring payment only.
 * @param threeDS2SdkVersion Required for mobile integrations. Version of the 3D Secure 2 mobile SDK.
 * @param subtype The type of flow to initiate.
 * @param orderID The unique ID associated with the order.
 * @param payeePreferred IMMEDIATE_PAYMENT_REQUIRED or UNRESTRICTED
 * @param payerID The unique ID associated with the payer.
 * @param payerSelected PAYPAL or PAYPAL_CREDIT
 * @param virtualPaymentAddress The virtual payment address for UPI.
 * @param appId 
 * @param openid 
 * @param clickAndCollect Set this to **true** if the shopper would like to pick up and collect their order, instead of having the goods delivered to them.
 */
@Serializable
data class CheckoutPaymentMethod (

    /* The bank account number (without separators). */
    @SerialName(value = "bankAccountNumber") @Required val bankAccountNumber: kotlin.String,

    /* The name of the bank account holder. */
    @SerialName(value = "ownerName") @Required val ownerName: kotlin.String,

    /* **zip** */
    @SerialName(value = "type") @Required val type: CheckoutPaymentMethod.Type = Type.Zip,

    /* The stringified and base64 encoded `paymentData` you retrieved from the Apple framework. */
    @SerialName(value = "applePayToken") @Required val applePayToken: kotlin.String,

    /* The shopper's bank. Specify this with the issuer value that corresponds to this bank. */
    @SerialName(value = "issuer") @Required val issuer: kotlin.String,

    /* The shopper's first name. */
    @SerialName(value = "firstName") @Required val firstName: kotlin.String,

    /* The shopper's last name. */
    @SerialName(value = "lastName") @Required val lastName: kotlin.String,

    /*  */
    @SerialName(value = "shopperEmail") @Required val shopperEmail: kotlin.String,

    /*  */
    @SerialName(value = "telephoneNumber") @Required val telephoneNumber: kotlin.String,

    /* The `token` that you obtained from the [Google Pay API](https://developers.google.com/pay/api/web/reference/response-objects#PaymentData) `PaymentData` response. */
    @SerialName(value = "googlePayToken") @Required val googlePayToken: kotlin.String,

    /* The Masterpass transaction ID. */
    @SerialName(value = "masterpassTransactionId") @Required val masterpassTransactionId: kotlin.String,

    /* The payload you received from the Samsung Pay SDK response. */
    @SerialName(value = "samsungPayToken") @Required val samsungPayToken: kotlin.String,

    /* The International Bank Account Number (IBAN). */
    @SerialName(value = "iban") @Required val iban: kotlin.String,

    /* The sequence number for the debit. For example, send **2** if this is the second debit for the subscription. The sequence number is included in the notification sent to the shopper. */
    @SerialName(value = "billingSequenceNumber") @Required val billingSequenceNumber: kotlin.String,

    /* The Visa Click to Pay Call ID value. When your shopper selects a payment and/or a shipping address from Visa Click to Pay, you will receive a Visa Click to Pay Call ID. */
    @SerialName(value = "visaCheckoutCallId") @Required val visaCheckoutCallId: kotlin.String,

    /* The bank account type (checking, savings...). */
    @SerialName(value = "bankAccountType") val bankAccountType: CheckoutPaymentMethod.BankAccountType? = null,

    /* The bank routing number of the account. */
    @SerialName(value = "bankLocationId") val bankLocationId: kotlin.String? = null,

    /* The checkout attempt identifier. */
    @SerialName(value = "checkoutAttemptId") val checkoutAttemptId: kotlin.String? = null,

    /* Encrypted bank account number. The bank account number (without separators). */
    @SerialName(value = "encryptedBankAccountNumber") val encryptedBankAccountNumber: kotlin.String? = null,

    /* Encrypted location id. The bank routing number of the account. The field value is `nil` in most cases. */
    @SerialName(value = "encryptedBankLocationId") val encryptedBankLocationId: kotlin.String? = null,

    /* This is the `recurringDetailReference` returned in the response when you created the token. */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "recurringDetailReference") val recurringDetailReference: kotlin.String? = null,

    /* This is the `recurringDetailReference` returned in the response when you created the token. */
    @SerialName(value = "storedPaymentMethodId") val storedPaymentMethodId: kotlin.String? = null,

    /* The address where to send the invoice. */
    @SerialName(value = "billingAddress") val billingAddress: kotlin.String? = null,

    /* The address where the goods should be delivered. */
    @SerialName(value = "deliveryAddress") val deliveryAddress: kotlin.String? = null,

    /* Shopper name, date of birth, phone number, and email address. */
    @SerialName(value = "personalDetails") val personalDetails: kotlin.String? = null,

    /* This is the `amazonPayToken` that you obtained from the [Get Checkout Session](https://amazon-pay-acquirer-guide.s3-eu-west-1.amazonaws.com/v1/amazon-pay-api-v2/checkout-session.html#get-checkout-session) response. This token is used for API only integration specifically. */
    @SerialName(value = "amazonPayToken") val amazonPayToken: kotlin.String? = null,

    /* The `checkoutSessionId` is used to identify the checkout session at the Amazon Pay side. This field is required only for drop-in and components integration, where it replaces the amazonPayToken. */
    @SerialName(value = "checkoutSessionId") val checkoutSessionId: kotlin.String? = null,

    /* The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. */
    @SerialName(value = "fundingSource") val fundingSource: CheckoutPaymentMethod.FundingSource? = null,

    /* The name of the card holder. */
    @SerialName(value = "holderName") val holderName: kotlin.String? = null,

    /* BLIK code consisting of 6 digits. */
    @SerialName(value = "blikCode") val blikCode: kotlin.String? = null,

    /* Secondary brand of the card. For example: **plastix**, **hmclub**. */
    @SerialName(value = "brand") val brand: kotlin.String? = null,

    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "cupsecureplus.smscode") val cupsecureplusSmscode: kotlin.String? = null,

    /* The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). */
    @SerialName(value = "cvc") val cvc: kotlin.String? = null,

    /* The encrypted card number. */
    @SerialName(value = "encryptedCardNumber") val encryptedCardNumber: kotlin.String? = null,

    /* The encrypted card expiry month. */
    @SerialName(value = "encryptedExpiryMonth") val encryptedExpiryMonth: kotlin.String? = null,

    /* The encrypted card expiry year. */
    @SerialName(value = "encryptedExpiryYear") val encryptedExpiryYear: kotlin.String? = null,

    /* The encrypted card verification code. */
    @SerialName(value = "encryptedSecurityCode") val encryptedSecurityCode: kotlin.String? = null,

    /* The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). */
    @SerialName(value = "expiryMonth") val expiryMonth: kotlin.String? = null,

    /* The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). */
    @SerialName(value = "expiryYear") val expiryYear: kotlin.String? = null,

    /* The network token reference. This is the [`networkTxReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment. */
    @SerialName(value = "networkPaymentReference") val networkPaymentReference: kotlin.String? = null,

    /* The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). */
    @SerialName(value = "number") val number: kotlin.String? = null,

    /* The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used for recurring payment only. */
    @SerialName(value = "shopperNotificationReference") val shopperNotificationReference: kotlin.String? = null,

    /* Required for mobile integrations. Version of the 3D Secure 2 mobile SDK. */
    @SerialName(value = "threeDS2SdkVersion") val threeDS2SdkVersion: kotlin.String? = null,

    /* The type of flow to initiate. */
    @SerialName(value = "subtype") val subtype: CheckoutPaymentMethod.Subtype? = null,

    /* The unique ID associated with the order. */
    @SerialName(value = "orderID") val orderID: kotlin.String? = null,

    /* IMMEDIATE_PAYMENT_REQUIRED or UNRESTRICTED */
    @SerialName(value = "payeePreferred") val payeePreferred: kotlin.String? = null,

    /* The unique ID associated with the payer. */
    @SerialName(value = "payerID") val payerID: kotlin.String? = null,

    /* PAYPAL or PAYPAL_CREDIT */
    @SerialName(value = "payerSelected") val payerSelected: kotlin.String? = null,

    /* The virtual payment address for UPI. */
    @SerialName(value = "virtualPaymentAddress") val virtualPaymentAddress: kotlin.String? = null,

    @SerialName(value = "appId") val appId: kotlin.String? = null,

    @SerialName(value = "openid") val openid: kotlin.String? = null,

    /* Set this to **true** if the shopper would like to pick up and collect their order, instead of having the goods delivered to them. */
    @SerialName(value = "clickAndCollect") val clickAndCollect: kotlin.String? = null

) {

    /**
     * **zip**
     *
     * Values: Zip,ZipPos
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "zip") Zip("zip"),
        @SerialName(value = "zip_pos") ZipPos("zip_pos");
    }
    /**
     * The bank account type (checking, savings...).
     *
     * Values: Balance,Checking,Deposit,General,Other,Payment,Savings
     */
    @Serializable
    enum class BankAccountType(val value: kotlin.String) {
        @SerialName(value = "balance") Balance("balance"),
        @SerialName(value = "checking") Checking("checking"),
        @SerialName(value = "deposit") Deposit("deposit"),
        @SerialName(value = "general") General("general"),
        @SerialName(value = "other") Other("other"),
        @SerialName(value = "payment") Payment("payment"),
        @SerialName(value = "savings") Savings("savings");
    }
    /**
     * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
     *
     * Values: Credit,Debit
     */
    @Serializable
    enum class FundingSource(val value: kotlin.String) {
        @SerialName(value = "credit") Credit("credit"),
        @SerialName(value = "debit") Debit("debit");
    }
    /**
     * The type of flow to initiate.
     *
     * Values: Redirect,Sdk
     */
    @Serializable
    enum class Subtype(val value: kotlin.String) {
        @SerialName(value = "redirect") Redirect("redirect"),
        @SerialName(value = "sdk") Sdk("sdk");
    }
}
