
# Modification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**direction** | **kotlin.String** | The direction of the money movement. |  [optional]
**id** | **kotlin.String** | Our reference for the modification. |  [optional]
**reference** | **kotlin.String** | Your reference for the modification, used internally within your platform. |  [optional]
**status** | [**inline**](#Status) | The status of the transfer event. |  [optional]
**type** | **kotlin.String** | The type of transfer modification. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | approvalPending, atmWithdrawal, atmWithdrawalReversalPending, atmWithdrawalReversed, authAdjustmentAuthorised, authAdjustmentError, authAdjustmentRefused, authorised, bankTransfer, bankTransferPending, booked, bookingPending, cancelled, capturePending, captureReversalPending, captureReversed, captured, capturedExternally, chargeback, chargebackExternally, chargebackPending, chargebackReversalPending, chargebackReversed, credited, depositCorrection, depositCorrectionPending, dispute, disputeClosed, disputeExpired, disputeNeedsReview, error, expired, failed, fee, feePending, internalTransfer, internalTransferPending, invoiceDeduction, invoiceDeductionPending, manualCorrectionPending, manuallyCorrected, matchedStatement, matchedStatementPending, merchantPayin, merchantPayinPending, merchantPayinReversed, merchantPayinReversedPending, miscCost, miscCostPending, paymentCost, paymentCostPending, received, refundPending, refundReversalPending, refundReversed, refunded, refundedExternally, refused, reserveAdjustment, reserveAdjustmentPending, returned, secondChargeback, secondChargebackPending, undefined



