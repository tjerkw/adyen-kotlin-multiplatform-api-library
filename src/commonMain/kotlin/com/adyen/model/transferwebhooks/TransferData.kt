/**
 * Transfer webhooks
 *
 * Adyen sends webhooks to inform your system about incoming and outgoing transfers in your platform.  You can use these webhooks to build your implementation. For example, you can use this information to update balances in your own dashboards or to keep track of incoming funds.
 *
 * The version of the OpenAPI document: 4
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

package com.adyen.model.transferwebhooks

import com.adyen.model.transferwebhooks.Amount
import com.adyen.model.transferwebhooks.BalanceMutation
import com.adyen.model.transferwebhooks.CounterpartyV3
import com.adyen.model.transferwebhooks.PaymentInstrument
import com.adyen.model.transferwebhooks.ResourceReference
import com.adyen.model.transferwebhooks.TransactionRulesResult
import com.adyen.model.transferwebhooks.TransferDataCategoryData
import com.adyen.model.transferwebhooks.TransferEvent
import com.adyen.model.transferwebhooks.TransferNotificationTransferTracking

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param amount 
 * @param category The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.
 * @param status The result of the transfer.   For example, **authorised**, **refused**, or **error**.
 * @param accountHolder 
 * @param balanceAccount 
 * @param balancePlatform The unique identifier of the balance platform.
 * @param balances The list of the latest balance statuses in the transfer.
 * @param categoryData 
 * @param counterparty 
 * @param creationDate The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
 * @param description Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , ' + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] & $ % # @** **~ = + - _ ' \" ! ?**
 * @param direction The direction of the transfer.  Possible values: **incoming**, **outgoing**.
 * @param events The list of events leading up to the current status of the transfer.
 * @param id The ID of the resource.
 * @param paymentInstrument 
 * @param reason Additional information about the status of the transfer.
 * @param reference Your reference for the transfer, used internally within your platform. If you don't provide this in the request, Adyen generates a unique reference.
 * @param referenceForBeneficiary  A reference that is sent to the recipient. This reference is also sent in all webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the `category`.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others.
 * @param sequenceNumber The sequence number of the transfer notification. The numbers start from 1 and increase with each new notification for a specific transfer.  It can help you restore the correct sequence of events even if they arrive out of order.
 * @param tracking 
 * @param transactionRulesResult 
 * @param type The type of transfer or transaction. For example, **refund**, **payment**, **internalTransfer**, **bankTransfer**.
 */
@Serializable
data class TransferData (

    @SerialName(value = "amount") @Required val amount: Amount,

    /* The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users. */
    @SerialName(value = "category") @Required val category: TransferData.Category,

    /* The result of the transfer.   For example, **authorised**, **refused**, or **error**. */
    @SerialName(value = "status") @Required val status: TransferData.Status,

    @SerialName(value = "accountHolder") val accountHolder: ResourceReference? = null,

    @SerialName(value = "balanceAccount") val balanceAccount: ResourceReference? = null,

    /* The unique identifier of the balance platform. */
    @SerialName(value = "balancePlatform") val balancePlatform: kotlin.String? = null,

    /* The list of the latest balance statuses in the transfer. */
    @SerialName(value = "balances") val balances: kotlin.collections.List<BalanceMutation>? = null,

    @SerialName(value = "categoryData") val categoryData: TransferDataCategoryData? = null,

    @SerialName(value = "counterparty") val counterparty: CounterpartyV3? = null,

    /* The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**. */
    @SerialName(value = "creationDate") val creationDate: kotlin.String? = null,

    /* Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , ' + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] & $ % # @** **~ = + - _ ' \" ! ?** */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* The direction of the transfer.  Possible values: **incoming**, **outgoing**. */
    @SerialName(value = "direction") val direction: TransferData.Direction? = null,

    /* The list of events leading up to the current status of the transfer. */
    @SerialName(value = "events") val events: kotlin.collections.List<TransferEvent>? = null,

    /* The ID of the resource. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "paymentInstrument") val paymentInstrument: PaymentInstrument? = null,

    /* Additional information about the status of the transfer. */
    @SerialName(value = "reason") val reason: TransferData.Reason? = null,

    /* Your reference for the transfer, used internally within your platform. If you don't provide this in the request, Adyen generates a unique reference. */
    @SerialName(value = "reference") val reference: kotlin.String? = null,

    /*  A reference that is sent to the recipient. This reference is also sent in all webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the `category`.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others. */
    @SerialName(value = "referenceForBeneficiary") val referenceForBeneficiary: kotlin.String? = null,

    /* The sequence number of the transfer notification. The numbers start from 1 and increase with each new notification for a specific transfer.  It can help you restore the correct sequence of events even if they arrive out of order. */
    @SerialName(value = "sequenceNumber") val sequenceNumber: kotlin.Int? = null,

    @SerialName(value = "tracking") val tracking: TransferNotificationTransferTracking? = null,

    @SerialName(value = "transactionRulesResult") val transactionRulesResult: TransactionRulesResult? = null,

    /* The type of transfer or transaction. For example, **refund**, **payment**, **internalTransfer**, **bankTransfer**. */
    @SerialName(value = "type") val type: TransferData.Type? = null

) {

    /**
     * The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.
     *
     * Values: Bank,Internal,IssuedCard,PlatformPayment
     */
    @Serializable
    enum class Category(val value: kotlin.String) {
        @SerialName(value = "bank") Bank("bank"),
        @SerialName(value = "internal") Internal("internal"),
        @SerialName(value = "issuedCard") IssuedCard("issuedCard"),
        @SerialName(value = "platformPayment") PlatformPayment("platformPayment");
    }
    /**
     * The result of the transfer.   For example, **authorised**, **refused**, or **error**.
     *
     * Values: ApprovalPending,AtmWithdrawal,AtmWithdrawalReversalPending,AtmWithdrawalReversed,AuthAdjustmentAuthorised,AuthAdjustmentError,AuthAdjustmentRefused,Authorised,BankTransfer,BankTransferPending,Booked,BookingPending,Cancelled,CapturePending,CaptureReversalPending,CaptureReversed,Captured,CapturedExternally,Chargeback,ChargebackExternally,ChargebackPending,ChargebackReversalPending,ChargebackReversed,Credited,DepositCorrection,DepositCorrectionPending,Dispute,DisputeClosed,DisputeExpired,DisputeNeedsReview,Error,Expired,Failed,Fee,FeePending,InternalTransfer,InternalTransferPending,InvoiceDeduction,InvoiceDeductionPending,ManualCorrectionPending,ManuallyCorrected,MatchedStatement,MatchedStatementPending,MerchantPayin,MerchantPayinPending,MerchantPayinReversed,MerchantPayinReversedPending,MiscCost,MiscCostPending,PaymentCost,PaymentCostPending,Received,RefundPending,RefundReversalPending,RefundReversed,Refunded,RefundedExternally,Refused,ReserveAdjustment,ReserveAdjustmentPending,Returned,SecondChargeback,SecondChargebackPending,Undefined
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "approvalPending") ApprovalPending("approvalPending"),
        @SerialName(value = "atmWithdrawal") AtmWithdrawal("atmWithdrawal"),
        @SerialName(value = "atmWithdrawalReversalPending") AtmWithdrawalReversalPending("atmWithdrawalReversalPending"),
        @SerialName(value = "atmWithdrawalReversed") AtmWithdrawalReversed("atmWithdrawalReversed"),
        @SerialName(value = "authAdjustmentAuthorised") AuthAdjustmentAuthorised("authAdjustmentAuthorised"),
        @SerialName(value = "authAdjustmentError") AuthAdjustmentError("authAdjustmentError"),
        @SerialName(value = "authAdjustmentRefused") AuthAdjustmentRefused("authAdjustmentRefused"),
        @SerialName(value = "authorised") Authorised("authorised"),
        @SerialName(value = "bankTransfer") BankTransfer("bankTransfer"),
        @SerialName(value = "bankTransferPending") BankTransferPending("bankTransferPending"),
        @SerialName(value = "booked") Booked("booked"),
        @SerialName(value = "bookingPending") BookingPending("bookingPending"),
        @SerialName(value = "cancelled") Cancelled("cancelled"),
        @SerialName(value = "capturePending") CapturePending("capturePending"),
        @SerialName(value = "captureReversalPending") CaptureReversalPending("captureReversalPending"),
        @SerialName(value = "captureReversed") CaptureReversed("captureReversed"),
        @SerialName(value = "captured") Captured("captured"),
        @SerialName(value = "capturedExternally") CapturedExternally("capturedExternally"),
        @SerialName(value = "chargeback") Chargeback("chargeback"),
        @SerialName(value = "chargebackExternally") ChargebackExternally("chargebackExternally"),
        @SerialName(value = "chargebackPending") ChargebackPending("chargebackPending"),
        @SerialName(value = "chargebackReversalPending") ChargebackReversalPending("chargebackReversalPending"),
        @SerialName(value = "chargebackReversed") ChargebackReversed("chargebackReversed"),
        @SerialName(value = "credited") Credited("credited"),
        @SerialName(value = "depositCorrection") DepositCorrection("depositCorrection"),
        @SerialName(value = "depositCorrectionPending") DepositCorrectionPending("depositCorrectionPending"),
        @SerialName(value = "dispute") Dispute("dispute"),
        @SerialName(value = "disputeClosed") DisputeClosed("disputeClosed"),
        @SerialName(value = "disputeExpired") DisputeExpired("disputeExpired"),
        @SerialName(value = "disputeNeedsReview") DisputeNeedsReview("disputeNeedsReview"),
        @SerialName(value = "error") Error("error"),
        @SerialName(value = "expired") Expired("expired"),
        @SerialName(value = "failed") Failed("failed"),
        @SerialName(value = "fee") Fee("fee"),
        @SerialName(value = "feePending") FeePending("feePending"),
        @SerialName(value = "internalTransfer") InternalTransfer("internalTransfer"),
        @SerialName(value = "internalTransferPending") InternalTransferPending("internalTransferPending"),
        @SerialName(value = "invoiceDeduction") InvoiceDeduction("invoiceDeduction"),
        @SerialName(value = "invoiceDeductionPending") InvoiceDeductionPending("invoiceDeductionPending"),
        @SerialName(value = "manualCorrectionPending") ManualCorrectionPending("manualCorrectionPending"),
        @SerialName(value = "manuallyCorrected") ManuallyCorrected("manuallyCorrected"),
        @SerialName(value = "matchedStatement") MatchedStatement("matchedStatement"),
        @SerialName(value = "matchedStatementPending") MatchedStatementPending("matchedStatementPending"),
        @SerialName(value = "merchantPayin") MerchantPayin("merchantPayin"),
        @SerialName(value = "merchantPayinPending") MerchantPayinPending("merchantPayinPending"),
        @SerialName(value = "merchantPayinReversed") MerchantPayinReversed("merchantPayinReversed"),
        @SerialName(value = "merchantPayinReversedPending") MerchantPayinReversedPending("merchantPayinReversedPending"),
        @SerialName(value = "miscCost") MiscCost("miscCost"),
        @SerialName(value = "miscCostPending") MiscCostPending("miscCostPending"),
        @SerialName(value = "paymentCost") PaymentCost("paymentCost"),
        @SerialName(value = "paymentCostPending") PaymentCostPending("paymentCostPending"),
        @SerialName(value = "received") Received("received"),
        @SerialName(value = "refundPending") RefundPending("refundPending"),
        @SerialName(value = "refundReversalPending") RefundReversalPending("refundReversalPending"),
        @SerialName(value = "refundReversed") RefundReversed("refundReversed"),
        @SerialName(value = "refunded") Refunded("refunded"),
        @SerialName(value = "refundedExternally") RefundedExternally("refundedExternally"),
        @SerialName(value = "refused") Refused("refused"),
        @SerialName(value = "reserveAdjustment") ReserveAdjustment("reserveAdjustment"),
        @SerialName(value = "reserveAdjustmentPending") ReserveAdjustmentPending("reserveAdjustmentPending"),
        @SerialName(value = "returned") Returned("returned"),
        @SerialName(value = "secondChargeback") SecondChargeback("secondChargeback"),
        @SerialName(value = "secondChargebackPending") SecondChargebackPending("secondChargebackPending"),
        @SerialName(value = "undefined") Undefined("undefined");
    }
    /**
     * The direction of the transfer.  Possible values: **incoming**, **outgoing**.
     *
     * Values: Incoming,Outgoing
     */
    @Serializable
    enum class Direction(val value: kotlin.String) {
        @SerialName(value = "incoming") Incoming("incoming"),
        @SerialName(value = "outgoing") Outgoing("outgoing");
    }
    /**
     * Additional information about the status of the transfer.
     *
     * Values: AmountLimitExceeded,Approved,BalanceAccountTemporarilyBlockedByTransactionRule,CounterpartyAccountBlocked,CounterpartyAccountClosed,CounterpartyAccountNotFound,CounterpartyAddressRequired,CounterpartyBankTimedOut,CounterpartyBankUnavailable,DeclinedByTransactionRule,Error,NotEnoughBalance,RefusedByCounterpartyBank,RouteNotFound,ScaFailed,Unknown
     */
    @Serializable
    enum class Reason(val value: kotlin.String) {
        @SerialName(value = "amountLimitExceeded") AmountLimitExceeded("amountLimitExceeded"),
        @SerialName(value = "approved") Approved("approved"),
        @SerialName(value = "balanceAccountTemporarilyBlockedByTransactionRule") BalanceAccountTemporarilyBlockedByTransactionRule("balanceAccountTemporarilyBlockedByTransactionRule"),
        @SerialName(value = "counterpartyAccountBlocked") CounterpartyAccountBlocked("counterpartyAccountBlocked"),
        @SerialName(value = "counterpartyAccountClosed") CounterpartyAccountClosed("counterpartyAccountClosed"),
        @SerialName(value = "counterpartyAccountNotFound") CounterpartyAccountNotFound("counterpartyAccountNotFound"),
        @SerialName(value = "counterpartyAddressRequired") CounterpartyAddressRequired("counterpartyAddressRequired"),
        @SerialName(value = "counterpartyBankTimedOut") CounterpartyBankTimedOut("counterpartyBankTimedOut"),
        @SerialName(value = "counterpartyBankUnavailable") CounterpartyBankUnavailable("counterpartyBankUnavailable"),
        @SerialName(value = "declinedByTransactionRule") DeclinedByTransactionRule("declinedByTransactionRule"),
        @SerialName(value = "error") Error("error"),
        @SerialName(value = "notEnoughBalance") NotEnoughBalance("notEnoughBalance"),
        @SerialName(value = "refusedByCounterpartyBank") RefusedByCounterpartyBank("refusedByCounterpartyBank"),
        @SerialName(value = "routeNotFound") RouteNotFound("routeNotFound"),
        @SerialName(value = "scaFailed") ScaFailed("scaFailed"),
        @SerialName(value = "unknown") Unknown("unknown");
    }
    /**
     * The type of transfer or transaction. For example, **refund**, **payment**, **internalTransfer**, **bankTransfer**.
     *
     * Values: AtmWithdrawal,AtmWithdrawalReversal,BalanceAdjustment,BalanceMigration,BalanceRollover,BankTransfer,Capture,CaptureReversal,CardTransfer,CashOutFee,CashOutFunding,CashOutInstruction,Chargeback,ChargebackCorrection,ChargebackReversal,ChargebackReversalCorrection,DepositCorrection,Fee,Grant,Installment,InstallmentReversal,InternalTransfer,InvoiceDeduction,Leftover,ManualCorrection,MiscCost,Payment,PaymentCost,Refund,RefundReversal,Repayment,ReserveAdjustment,SecondChargeback,SecondChargebackCorrection
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "atmWithdrawal") AtmWithdrawal("atmWithdrawal"),
        @SerialName(value = "atmWithdrawalReversal") AtmWithdrawalReversal("atmWithdrawalReversal"),
        @SerialName(value = "balanceAdjustment") BalanceAdjustment("balanceAdjustment"),
        @SerialName(value = "balanceMigration") BalanceMigration("balanceMigration"),
        @SerialName(value = "balanceRollover") BalanceRollover("balanceRollover"),
        @SerialName(value = "bankTransfer") BankTransfer("bankTransfer"),
        @SerialName(value = "capture") Capture("capture"),
        @SerialName(value = "captureReversal") CaptureReversal("captureReversal"),
        @SerialName(value = "cardTransfer") CardTransfer("cardTransfer"),
        @SerialName(value = "cashOutFee") CashOutFee("cashOutFee"),
        @SerialName(value = "cashOutFunding") CashOutFunding("cashOutFunding"),
        @SerialName(value = "cashOutInstruction") CashOutInstruction("cashOutInstruction"),
        @SerialName(value = "chargeback") Chargeback("chargeback"),
        @SerialName(value = "chargebackCorrection") ChargebackCorrection("chargebackCorrection"),
        @SerialName(value = "chargebackReversal") ChargebackReversal("chargebackReversal"),
        @SerialName(value = "chargebackReversalCorrection") ChargebackReversalCorrection("chargebackReversalCorrection"),
        @SerialName(value = "depositCorrection") DepositCorrection("depositCorrection"),
        @SerialName(value = "fee") Fee("fee"),
        @SerialName(value = "grant") Grant("grant"),
        @SerialName(value = "installment") Installment("installment"),
        @SerialName(value = "installmentReversal") InstallmentReversal("installmentReversal"),
        @SerialName(value = "internalTransfer") InternalTransfer("internalTransfer"),
        @SerialName(value = "invoiceDeduction") InvoiceDeduction("invoiceDeduction"),
        @SerialName(value = "leftover") Leftover("leftover"),
        @SerialName(value = "manualCorrection") ManualCorrection("manualCorrection"),
        @SerialName(value = "miscCost") MiscCost("miscCost"),
        @SerialName(value = "payment") Payment("payment"),
        @SerialName(value = "paymentCost") PaymentCost("paymentCost"),
        @SerialName(value = "refund") Refund("refund"),
        @SerialName(value = "refundReversal") RefundReversal("refundReversal"),
        @SerialName(value = "repayment") Repayment("repayment"),
        @SerialName(value = "reserveAdjustment") ReserveAdjustment("reserveAdjustment"),
        @SerialName(value = "secondChargeback") SecondChargeback("secondChargeback"),
        @SerialName(value = "secondChargebackCorrection") SecondChargebackCorrection("secondChargebackCorrection");
    }
}

