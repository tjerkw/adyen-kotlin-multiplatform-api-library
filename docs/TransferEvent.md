
# TransferEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  |  [optional]
**amountAdjustments** | [**kotlin.collections.List&lt;AmountAdjustment&gt;**](AmountAdjustment.md) | The amount adjustments in this transfer. |  [optional]
**bookingDate** | **kotlin.String** | The date when the transfer request was sent. |  [optional]
**estimatedArrivalTime** | **kotlin.String** | The estimated time the beneficiary should have access to the funds. |  [optional]
**id** | **kotlin.String** | The unique identifier of the transfer event. |  [optional]
**modification** | [**Modification**](Modification.md) |  |  [optional]
**mutations** | [**kotlin.collections.List&lt;BalanceMutation&gt;**](BalanceMutation.md) | The list of the balance mutation per event. |  [optional]
**originalAmount** | [**Amount**](Amount.md) |  |  [optional]
**reason** | [**inline**](#Reason) | The reason for the transfer status. |  [optional]
**schemeTraceID** | **kotlin.String** | SchemeTraceID retrieved from scheme. |  [optional]
**schemeUniqueTransactionID** | **kotlin.String** | SchemeUniqueTransactionID retrieved from scheme. |  [optional]
**status** | [**inline**](#Status) | The status of the transfer event. |  [optional]
**transactionId** | **kotlin.String** | The id of the transaction that is related to this accounting event. Only sent for events of type **accounting** where the balance changes. |  [optional]
**type** | [**inline**](#Type) | The type of the transfer event. Possible values: **accounting**, **tracking**. |  [optional]
**updateDate** | **kotlin.String** | The date when the tracking status was updated. |  [optional]
**valueDate** | **kotlin.String** | A future date, when the funds are expected to be deducted from or credited to the balance account. |  [optional]


<a name="Reason"></a>
## Enum: reason
Name | Value
---- | -----
reason | amountLimitExceeded, approved, balanceAccountTemporarilyBlockedByTransactionRule, counterpartyAccountBlocked, counterpartyAccountClosed, counterpartyAccountNotFound, counterpartyAddressRequired, counterpartyBankTimedOut, counterpartyBankUnavailable, declinedByTransactionRule, error, notEnoughBalance, refusedByCounterpartyBank, routeNotFound, scaFailed, unknown


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | approvalPending, atmWithdrawal, atmWithdrawalReversalPending, atmWithdrawalReversed, authAdjustmentAuthorised, authAdjustmentError, authAdjustmentRefused, authorised, bankTransfer, bankTransferPending, booked, bookingPending, cancelled, capturePending, captureReversalPending, captureReversed, captured, capturedExternally, chargeback, chargebackExternally, chargebackPending, chargebackReversalPending, chargebackReversed, credited, depositCorrection, depositCorrectionPending, dispute, disputeClosed, disputeExpired, disputeNeedsReview, error, expired, failed, fee, feePending, internalTransfer, internalTransferPending, invoiceDeduction, invoiceDeductionPending, manualCorrectionPending, manuallyCorrected, matchedStatement, matchedStatementPending, merchantPayin, merchantPayinPending, merchantPayinReversed, merchantPayinReversedPending, miscCost, miscCostPending, paymentCost, paymentCostPending, received, refundPending, refundReversalPending, refundReversed, refunded, refundedExternally, refused, reserveAdjustment, reserveAdjustmentPending, returned, secondChargeback, secondChargebackPending, undefined


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | accounting, tracking



