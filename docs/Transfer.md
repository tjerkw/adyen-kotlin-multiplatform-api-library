
# Transfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**category** | [**inline**](#Category) | The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users. | 
**counterparty** | [**CounterpartyV3**](CounterpartyV3.md) |  | 
**status** | [**inline**](#Status) | The result of the transfer.   For example, **authorised**, **refused**, or **error**. | 
**accountHolder** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**balanceAccount** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**categoryData** | [**TransferCategoryData**](TransferCategoryData.md) |  |  [optional]
**creationDate** | **kotlin.String** | The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**. |  [optional]
**description** | **kotlin.String** | Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , &#39; + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] &amp; $ % # @** **~ &#x3D; + - _ &#39; \&quot; ! ?** |  [optional]
**direction** | [**inline**](#Direction) | The direction of the transfer.  Possible values: **incoming**, **outgoing**. |  [optional]
**id** | **kotlin.String** | The ID of the resource. |  [optional]
**paymentInstrument** | [**PaymentInstrument**](PaymentInstrument.md) |  |  [optional]
**reason** | [**inline**](#Reason) | Additional information about the status of the transfer. |  [optional]
**reference** | **kotlin.String** | Your reference for the transfer, used internally within your platform. If you don&#39;t provide this in the request, Adyen generates a unique reference. |  [optional]
**referenceForBeneficiary** | **kotlin.String** |  A reference that is sent to the recipient. This reference is also sent in all webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the &#x60;category&#x60;.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others. |  [optional]


<a name="Category"></a>
## Enum: category
Name | Value
---- | -----
category | bank, internal, issuedCard, platformPayment


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | approvalPending, atmWithdrawal, atmWithdrawalReversalPending, atmWithdrawalReversed, authAdjustmentAuthorised, authAdjustmentError, authAdjustmentRefused, authorised, bankTransfer, bankTransferPending, booked, bookingPending, cancelled, capturePending, captureReversalPending, captureReversed, captured, capturedExternally, chargeback, chargebackExternally, chargebackPending, chargebackReversalPending, chargebackReversed, credited, depositCorrection, depositCorrectionPending, dispute, disputeClosed, disputeExpired, disputeNeedsReview, error, expired, failed, fee, feePending, internalTransfer, internalTransferPending, invoiceDeduction, invoiceDeductionPending, manualCorrectionPending, manuallyCorrected, matchedStatement, matchedStatementPending, merchantPayin, merchantPayinPending, merchantPayinReversed, merchantPayinReversedPending, miscCost, miscCostPending, paymentCost, paymentCostPending, received, refundPending, refundReversalPending, refundReversed, refunded, refundedExternally, refused, reserveAdjustment, reserveAdjustmentPending, returned, secondChargeback, secondChargebackPending, undefined


<a name="Direction"></a>
## Enum: direction
Name | Value
---- | -----
direction | incoming, outgoing


<a name="Reason"></a>
## Enum: reason
Name | Value
---- | -----
reason | amountLimitExceeded, approved, balanceAccountTemporarilyBlockedByTransactionRule, counterpartyAccountBlocked, counterpartyAccountClosed, counterpartyAccountNotFound, counterpartyAddressRequired, counterpartyBankTimedOut, counterpartyBankUnavailable, declinedByTransactionRule, error, notEnoughBalance, refusedByCounterpartyBank, routeNotFound, scaFailed, unknown



