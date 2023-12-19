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
 * @param acquirerAccountCode The name of the Adyen acquirer account.  Example: PayPalSandbox_TestAcquirer  > Only relevant for PayPal transactions.
 * @param acquirerCode The name of the acquirer processing the payment request.  Example: TestPmmAcquirer
 * @param acquirerReference The reference number that can be used for reconciliation in case a non-Adyen acquirer is used for settlement.  Example: 7C9N3FNBKT9
 * @param alias The Adyen alias of the card.  Example: H167852639363479
 * @param aliasType The type of the card alias.  Example: Default
 * @param authCode Authorisation code: * When the payment is authorised successfully, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.  Example: 58747
 * @param authorisationMid Merchant ID known by the acquirer.
 * @param authorisedAmountCurrency The currency of the authorised amount, as a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
 * @param authorisedAmountValue Value of the amount authorised.  This amount is represented in minor units according to the [following table](https://docs.adyen.com/development-resources/currency-codes).
 * @param avsResult The AVS result code of the payment, which provides information about the outcome of the AVS check.  For possible values, see [AVS](https://docs.adyen.com/risk-management/configure-standard-risk-rules/consistency-rules#billing-address-does-not-match-cardholder-address-avs).
 * @param avsResultRaw Raw AVS result received from the acquirer, where available.  Example: D
 * @param bic BIC of a bank account.  Example: TESTNL01  > Only relevant for SEPA Direct Debit transactions.
 * @param coBrandedWith Includes the co-branded card information.
 * @param cvcResult The result of CVC verification.
 * @param cvcResultRaw The raw result of CVC verification.
 * @param dsTransID Supported for 3D Secure 2. The unique transaction identifier assigned by the DS to identify a single transaction.
 * @param eci The Electronic Commerce Indicator returned from the schemes for the 3DS payment session.  Example: 02
 * @param expiryDate The expiry date on the card.  Example: 6/2016  > Returned only in case of a card payment.
 * @param extraCostsCurrency The currency of the extra amount charged due to additional amounts set in the skin used in the HPP payment request.  Example: EUR
 * @param extraCostsValue The value of the extra amount charged due to additional amounts set in the skin used in the HPP payment request. The amount is in minor units.
 * @param fraudCheckItemNrFraudCheckname The fraud score due to a particular fraud check. The fraud check name is found in the key of the key-value pair.
 * @param fraudManualReview Indicates if the payment is sent to manual review.
 * @param fraudResultType The fraud result properties of the payment.
 * @param fundingSource Information regarding the funding type of the card. The possible return values are: * CHARGE * CREDIT * DEBIT * PREPAID * PREPAID_RELOADABLE  * PREPAID_NONRELOADABLE * DEFFERED_DEBIT  > This functionality requires additional configuration on Adyen's end. To enable it, contact the Support Team.  For receiving this field in the notification, enable **Include Funding Source** in **Notifications** > **Additional settings**.
 * @param fundsAvailability Indicates availability of funds.  Visa: * \"I\" (fast funds are supported) * \"N\" (otherwise)  Mastercard: * \"I\" (product type is Prepaid or Debit, or issuing country is in CEE/HGEM list) * \"N\" (otherwise)  > Returned when you verify a card BIN or estimate costs, and only if payoutEligible is \"Y\" or \"D\".
 * @param inferredRefusalReason Provides the more granular indication of why a transaction was refused. When a transaction fails with either \"Refused\", \"Restricted Card\", \"Transaction Not Permitted\", \"Not supported\" or \"DeclinedNon Generic\" refusalReason from the issuer, Adyen cross references its PSP-wide data for extra insight into the refusal reason. If an inferred refusal reason is available, the `inferredRefusalReason`, field is populated and the `refusalReason`, is set to \"Not Supported\".  Possible values:  * 3D Secure Mandated * Closed Account * ContAuth Not Supported * CVC Mandated * Ecommerce Not Allowed * Crossborder Not Supported * Card Updated  * Low Authrate Bin * Non-reloadable prepaid card
 * @param isCardCommercial Indicates if the card is used for business purposes only.
 * @param issuerCountry The issuing country of the card based on the BIN list that Adyen maintains.  Example: JP
 * @param liabilityShift A Boolean value indicating whether a liability shift was offered for this payment.
 * @param mcBankNetReferenceNumber The `mcBankNetReferenceNumber`, is a minimum of six characters and a maximum of nine characters long.  > Contact Support Team to enable this field.
 * @param merchantAdviceCode The Merchant Advice Code (MAC) can be returned by Mastercard issuers for refused payments. If present, the MAC contains information about why the payment failed, and whether it can be retried.  For more information see [Mastercard Merchant Advice Codes](https://docs.adyen.com/development-resources/raw-acquirer-responses#mastercard-merchant-advice-codes).
 * @param merchantReference The reference provided for the transaction.
 * @param networkTxReference Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
 * @param ownerName The owner name of a bank account.  Only relevant for SEPA Direct Debit transactions.
 * @param paymentAccountReference The Payment Account Reference (PAR) value links a network token with the underlying primary account number (PAN). The PAR value consists of 29 uppercase alphanumeric characters.
 * @param paymentMethod The payment method used in the transaction.
 * @param paymentMethodVariant The Adyen sub-variant of the payment method used for the payment request.  For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).  Example: mcpro
 * @param payoutEligible Indicates whether a payout is eligible or not for this card.  Visa: * \"Y\" * \"N\"  Mastercard: * \"Y\" (domestic and cross-border)  * \"D\" (only domestic) * \"N\" (no MoneySend) * \"U\" (unknown)
 * @param realtimeAccountUpdaterStatus The response code from the Real Time Account Updater service.  Possible return values are: * CardChanged * CardExpiryChanged * CloseAccount  * ContactCardAccountHolder
 * @param receiptFreeText Message to be displayed on the terminal.
 * @param recurringContractTypes The recurring contract types applicable to the transaction.
 * @param recurringFirstPspReference The `pspReference`, of the first recurring payment that created the recurring detail.  This functionality requires additional configuration on Adyen's end. To enable it, contact the Support Team.
 * @param recurringRecurringDetailReference The reference that uniquely identifies the recurring transaction.
 * @param recurringShopperReference The provided reference of the shopper for a recurring transaction.
 * @param recurringProcessingModel The processing model used for the recurring transaction.
 * @param referred If the payment is referred, this field is set to true.  This field is unavailable if the payment is referred and is usually not returned with ecommerce transactions.  Example: true
 * @param refusalReasonRaw Raw refusal reason received from the acquirer, where available.  Example: AUTHORISED
 * @param requestAmount The amount of the payment request.
 * @param requestCurrencyCode The currency of the payment request.
 * @param shopperInteraction The shopper interaction type of the payment request.  Example: Ecommerce
 * @param shopperReference The shopperReference passed in the payment request.  Example: AdyenTestShopperXX
 * @param terminalId The terminal ID used in a point-of-sale payment.  Example: 06022622
 * @param threeDAuthenticated A Boolean value indicating whether 3DS authentication was completed on this payment.  Example: true
 * @param threeDAuthenticatedResponse The raw 3DS authentication result from the card issuer.  Example: N
 * @param threeDOffered A Boolean value indicating whether 3DS was offered for this payment.  Example: true
 * @param threeDOfferedResponse The raw enrollment result from the 3DS directory services of the card schemes.  Example: Y
 * @param threeDSVersion The 3D Secure 2 version.
 * @param visaTransactionId The `visaTransactionId`, has a fixed length of 15 numeric characters.  > Contact Support Team to enable this field.
 * @param xid The 3DS transaction ID of the 3DS session sent in notifications. The value is Base64-encoded and is returned for transactions with directoryResponse 'N' or 'Y'. If you want to submit the xid in your 3D Secure 1 request, use the `mpiData.xid`, field.  Example: ODgxNDc2MDg2MDExODk5MAAAAAA=
 */
@Serializable
data class ResponseAdditionalDataCommon (

    /* The name of the Adyen acquirer account.  Example: PayPalSandbox_TestAcquirer  > Only relevant for PayPal transactions. */
    @SerialName(value = "acquirerAccountCode") val acquirerAccountCode: kotlin.String? = null,

    /* The name of the acquirer processing the payment request.  Example: TestPmmAcquirer */
    @SerialName(value = "acquirerCode") val acquirerCode: kotlin.String? = null,

    /* The reference number that can be used for reconciliation in case a non-Adyen acquirer is used for settlement.  Example: 7C9N3FNBKT9 */
    @SerialName(value = "acquirerReference") val acquirerReference: kotlin.String? = null,

    /* The Adyen alias of the card.  Example: H167852639363479 */
    @SerialName(value = "alias") val alias: kotlin.String? = null,

    /* The type of the card alias.  Example: Default */
    @SerialName(value = "aliasType") val aliasType: kotlin.String? = null,

    /* Authorisation code: * When the payment is authorised successfully, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.  Example: 58747 */
    @SerialName(value = "authCode") val authCode: kotlin.String? = null,

    /* Merchant ID known by the acquirer. */
    @SerialName(value = "authorisationMid") val authorisationMid: kotlin.String? = null,

    /* The currency of the authorised amount, as a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). */
    @SerialName(value = "authorisedAmountCurrency") val authorisedAmountCurrency: kotlin.String? = null,

    /* Value of the amount authorised.  This amount is represented in minor units according to the [following table](https://docs.adyen.com/development-resources/currency-codes). */
    @SerialName(value = "authorisedAmountValue") val authorisedAmountValue: kotlin.String? = null,

    /* The AVS result code of the payment, which provides information about the outcome of the AVS check.  For possible values, see [AVS](https://docs.adyen.com/risk-management/configure-standard-risk-rules/consistency-rules#billing-address-does-not-match-cardholder-address-avs). */
    @SerialName(value = "avsResult") val avsResult: kotlin.String? = null,

    /* Raw AVS result received from the acquirer, where available.  Example: D */
    @SerialName(value = "avsResultRaw") val avsResultRaw: kotlin.String? = null,

    /* BIC of a bank account.  Example: TESTNL01  > Only relevant for SEPA Direct Debit transactions. */
    @SerialName(value = "bic") val bic: kotlin.String? = null,

    /* Includes the co-branded card information. */
    @SerialName(value = "coBrandedWith") val coBrandedWith: kotlin.String? = null,

    /* The result of CVC verification. */
    @SerialName(value = "cvcResult") val cvcResult: kotlin.String? = null,

    /* The raw result of CVC verification. */
    @SerialName(value = "cvcResultRaw") val cvcResultRaw: kotlin.String? = null,

    /* Supported for 3D Secure 2. The unique transaction identifier assigned by the DS to identify a single transaction. */
    @SerialName(value = "dsTransID") val dsTransID: kotlin.String? = null,

    /* The Electronic Commerce Indicator returned from the schemes for the 3DS payment session.  Example: 02 */
    @SerialName(value = "eci") val eci: kotlin.String? = null,

    /* The expiry date on the card.  Example: 6/2016  > Returned only in case of a card payment. */
    @SerialName(value = "expiryDate") val expiryDate: kotlin.String? = null,

    /* The currency of the extra amount charged due to additional amounts set in the skin used in the HPP payment request.  Example: EUR */
    @SerialName(value = "extraCostsCurrency") val extraCostsCurrency: kotlin.String? = null,

    /* The value of the extra amount charged due to additional amounts set in the skin used in the HPP payment request. The amount is in minor units. */
    @SerialName(value = "extraCostsValue") val extraCostsValue: kotlin.String? = null,

    /* The fraud score due to a particular fraud check. The fraud check name is found in the key of the key-value pair. */
    @SerialName(value = "fraudCheck-[itemNr]-[FraudCheckname]") val fraudCheckItemNrFraudCheckname: kotlin.String? = null,

    /* Indicates if the payment is sent to manual review. */
    @SerialName(value = "fraudManualReview") val fraudManualReview: kotlin.String? = null,

    /* The fraud result properties of the payment. */
    @SerialName(value = "fraudResultType") val fraudResultType: ResponseAdditionalDataCommon.FraudResultType? = null,

    /* Information regarding the funding type of the card. The possible return values are: * CHARGE * CREDIT * DEBIT * PREPAID * PREPAID_RELOADABLE  * PREPAID_NONRELOADABLE * DEFFERED_DEBIT  > This functionality requires additional configuration on Adyen's end. To enable it, contact the Support Team.  For receiving this field in the notification, enable **Include Funding Source** in **Notifications** > **Additional settings**. */
    @SerialName(value = "fundingSource") val fundingSource: kotlin.String? = null,

    /* Indicates availability of funds.  Visa: * \"I\" (fast funds are supported) * \"N\" (otherwise)  Mastercard: * \"I\" (product type is Prepaid or Debit, or issuing country is in CEE/HGEM list) * \"N\" (otherwise)  > Returned when you verify a card BIN or estimate costs, and only if payoutEligible is \"Y\" or \"D\". */
    @SerialName(value = "fundsAvailability") val fundsAvailability: kotlin.String? = null,

    /* Provides the more granular indication of why a transaction was refused. When a transaction fails with either \"Refused\", \"Restricted Card\", \"Transaction Not Permitted\", \"Not supported\" or \"DeclinedNon Generic\" refusalReason from the issuer, Adyen cross references its PSP-wide data for extra insight into the refusal reason. If an inferred refusal reason is available, the `inferredRefusalReason`, field is populated and the `refusalReason`, is set to \"Not Supported\".  Possible values:  * 3D Secure Mandated * Closed Account * ContAuth Not Supported * CVC Mandated * Ecommerce Not Allowed * Crossborder Not Supported * Card Updated  * Low Authrate Bin * Non-reloadable prepaid card */
    @SerialName(value = "inferredRefusalReason") val inferredRefusalReason: kotlin.String? = null,

    /* Indicates if the card is used for business purposes only. */
    @SerialName(value = "isCardCommercial") val isCardCommercial: kotlin.String? = null,

    /* The issuing country of the card based on the BIN list that Adyen maintains.  Example: JP */
    @SerialName(value = "issuerCountry") val issuerCountry: kotlin.String? = null,

    /* A Boolean value indicating whether a liability shift was offered for this payment. */
    @SerialName(value = "liabilityShift") val liabilityShift: kotlin.String? = null,

    /* The `mcBankNetReferenceNumber`, is a minimum of six characters and a maximum of nine characters long.  > Contact Support Team to enable this field. */
    @SerialName(value = "mcBankNetReferenceNumber") val mcBankNetReferenceNumber: kotlin.String? = null,

    /* The Merchant Advice Code (MAC) can be returned by Mastercard issuers for refused payments. If present, the MAC contains information about why the payment failed, and whether it can be retried.  For more information see [Mastercard Merchant Advice Codes](https://docs.adyen.com/development-resources/raw-acquirer-responses#mastercard-merchant-advice-codes). */
    @SerialName(value = "merchantAdviceCode") val merchantAdviceCode: kotlin.String? = null,

    /* The reference provided for the transaction. */
    @SerialName(value = "merchantReference") val merchantReference: kotlin.String? = null,

    /* Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID. */
    @SerialName(value = "networkTxReference") val networkTxReference: kotlin.String? = null,

    /* The owner name of a bank account.  Only relevant for SEPA Direct Debit transactions. */
    @SerialName(value = "ownerName") val ownerName: kotlin.String? = null,

    /* The Payment Account Reference (PAR) value links a network token with the underlying primary account number (PAN). The PAR value consists of 29 uppercase alphanumeric characters. */
    @SerialName(value = "paymentAccountReference") val paymentAccountReference: kotlin.String? = null,

    /* The payment method used in the transaction. */
    @SerialName(value = "paymentMethod") val paymentMethod: kotlin.String? = null,

    /* The Adyen sub-variant of the payment method used for the payment request.  For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).  Example: mcpro */
    @SerialName(value = "paymentMethodVariant") val paymentMethodVariant: kotlin.String? = null,

    /* Indicates whether a payout is eligible or not for this card.  Visa: * \"Y\" * \"N\"  Mastercard: * \"Y\" (domestic and cross-border)  * \"D\" (only domestic) * \"N\" (no MoneySend) * \"U\" (unknown) */
    @SerialName(value = "payoutEligible") val payoutEligible: kotlin.String? = null,

    /* The response code from the Real Time Account Updater service.  Possible return values are: * CardChanged * CardExpiryChanged * CloseAccount  * ContactCardAccountHolder */
    @SerialName(value = "realtimeAccountUpdaterStatus") val realtimeAccountUpdaterStatus: kotlin.String? = null,

    /* Message to be displayed on the terminal. */
    @SerialName(value = "receiptFreeText") val receiptFreeText: kotlin.String? = null,

    /* The recurring contract types applicable to the transaction. */
    @SerialName(value = "recurring.contractTypes") val recurringContractTypes: kotlin.String? = null,

    /* The `pspReference`, of the first recurring payment that created the recurring detail.  This functionality requires additional configuration on Adyen's end. To enable it, contact the Support Team. */
    @SerialName(value = "recurring.firstPspReference") val recurringFirstPspReference: kotlin.String? = null,

    /* The reference that uniquely identifies the recurring transaction. */
    @SerialName(value = "recurring.recurringDetailReference") val recurringRecurringDetailReference: kotlin.String? = null,

    /* The provided reference of the shopper for a recurring transaction. */
    @SerialName(value = "recurring.shopperReference") val recurringShopperReference: kotlin.String? = null,

    /* The processing model used for the recurring transaction. */
    @SerialName(value = "recurringProcessingModel") val recurringProcessingModel: ResponseAdditionalDataCommon.RecurringProcessingModel? = null,

    /* If the payment is referred, this field is set to true.  This field is unavailable if the payment is referred and is usually not returned with ecommerce transactions.  Example: true */
    @SerialName(value = "referred") val referred: kotlin.String? = null,

    /* Raw refusal reason received from the acquirer, where available.  Example: AUTHORISED */
    @SerialName(value = "refusalReasonRaw") val refusalReasonRaw: kotlin.String? = null,

    /* The amount of the payment request. */
    @SerialName(value = "requestAmount") val requestAmount: kotlin.String? = null,

    /* The currency of the payment request. */
    @SerialName(value = "requestCurrencyCode") val requestCurrencyCode: kotlin.String? = null,

    /* The shopper interaction type of the payment request.  Example: Ecommerce */
    @SerialName(value = "shopperInteraction") val shopperInteraction: kotlin.String? = null,

    /* The shopperReference passed in the payment request.  Example: AdyenTestShopperXX */
    @SerialName(value = "shopperReference") val shopperReference: kotlin.String? = null,

    /* The terminal ID used in a point-of-sale payment.  Example: 06022622 */
    @SerialName(value = "terminalId") val terminalId: kotlin.String? = null,

    /* A Boolean value indicating whether 3DS authentication was completed on this payment.  Example: true */
    @SerialName(value = "threeDAuthenticated") val threeDAuthenticated: kotlin.String? = null,

    /* The raw 3DS authentication result from the card issuer.  Example: N */
    @SerialName(value = "threeDAuthenticatedResponse") val threeDAuthenticatedResponse: kotlin.String? = null,

    /* A Boolean value indicating whether 3DS was offered for this payment.  Example: true */
    @SerialName(value = "threeDOffered") val threeDOffered: kotlin.String? = null,

    /* The raw enrollment result from the 3DS directory services of the card schemes.  Example: Y */
    @SerialName(value = "threeDOfferedResponse") val threeDOfferedResponse: kotlin.String? = null,

    /* The 3D Secure 2 version. */
    @SerialName(value = "threeDSVersion") val threeDSVersion: kotlin.String? = null,

    /* The `visaTransactionId`, has a fixed length of 15 numeric characters.  > Contact Support Team to enable this field. */
    @SerialName(value = "visaTransactionId") val visaTransactionId: kotlin.String? = null,

    /* The 3DS transaction ID of the 3DS session sent in notifications. The value is Base64-encoded and is returned for transactions with directoryResponse 'N' or 'Y'. If you want to submit the xid in your 3D Secure 1 request, use the `mpiData.xid`, field.  Example: ODgxNDc2MDg2MDExODk5MAAAAAA= */
    @SerialName(value = "xid") val xid: kotlin.String? = null

) {

    /**
     * The fraud result properties of the payment.
     *
     * Values: GREEN,FRAUD
     */
    @Serializable
    enum class FraudResultType(val value: kotlin.String) {
        @SerialName(value = "GREEN") GREEN("GREEN"),
        @SerialName(value = "FRAUD") FRAUD("FRAUD");
    }
    /**
     * The processing model used for the recurring transaction.
     *
     * Values: CardOnFile,Subscription,UnscheduledCardOnFile
     */
    @Serializable
    enum class RecurringProcessingModel(val value: kotlin.String) {
        @SerialName(value = "CardOnFile") CardOnFile("CardOnFile"),
        @SerialName(value = "Subscription") Subscription("Subscription"),
        @SerialName(value = "UnscheduledCardOnFile") UnscheduledCardOnFile("UnscheduledCardOnFile");
    }
}

