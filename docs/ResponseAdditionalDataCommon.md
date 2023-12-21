
# ResponseAdditionalDataCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acquirerAccountCode** | **kotlin.String** | The name of the Adyen acquirer account.  Example: PayPalSandbox_TestAcquirer  &gt; Only relevant for PayPal transactions. |  [optional]
**acquirerCode** | **kotlin.String** | The name of the acquirer processing the payment request.  Example: TestPmmAcquirer |  [optional]
**acquirerReference** | **kotlin.String** | The reference number that can be used for reconciliation in case a non-Adyen acquirer is used for settlement.  Example: 7C9N3FNBKT9 |  [optional]
**alias** | **kotlin.String** | The Adyen alias of the card.  Example: H167852639363479 |  [optional]
**aliasType** | **kotlin.String** | The type of the card alias.  Example: Default |  [optional]
**authCode** | **kotlin.String** | Authorisation code: * When the payment is authorised successfully, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.  Example: 58747 |  [optional]
**authorisationMid** | **kotlin.String** | Merchant ID known by the acquirer. |  [optional]
**authorisedAmountCurrency** | **kotlin.String** | The currency of the authorised amount, as a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). |  [optional]
**authorisedAmountValue** | **kotlin.String** | Value of the amount authorised.  This amount is represented in minor units according to the [following table](https://docs.adyen.com/development-resources/currency-codes). |  [optional]
**avsResult** | **kotlin.String** | The AVS result code of the payment, which provides information about the outcome of the AVS check.  For possible values, see [AVS](https://docs.adyen.com/risk-management/configure-standard-risk-rules/consistency-rules#billing-address-does-not-match-cardholder-address-avs). |  [optional]
**avsResultRaw** | **kotlin.String** | Raw AVS result received from the acquirer, where available.  Example: D |  [optional]
**bic** | **kotlin.String** | BIC of a bank account.  Example: TESTNL01  &gt; Only relevant for SEPA Direct Debit transactions. |  [optional]
**coBrandedWith** | **kotlin.String** | Includes the co-branded card information. |  [optional]
**cvcResult** | **kotlin.String** | The result of CVC verification. |  [optional]
**cvcResultRaw** | **kotlin.String** | The raw result of CVC verification. |  [optional]
**dsTransID** | **kotlin.String** | Supported for 3D Secure 2. The unique transaction identifier assigned by the DS to identify a single transaction. |  [optional]
**eci** | **kotlin.String** | The Electronic Commerce Indicator returned from the schemes for the 3DS payment session.  Example: 02 |  [optional]
**expiryDate** | **kotlin.String** | The expiry date on the card.  Example: 6/2016  &gt; Returned only in case of a card payment. |  [optional]
**extraCostsCurrency** | **kotlin.String** | The currency of the extra amount charged due to additional amounts set in the skin used in the HPP payment request.  Example: EUR |  [optional]
**extraCostsValue** | **kotlin.String** | The value of the extra amount charged due to additional amounts set in the skin used in the HPP payment request. The amount is in minor units. |  [optional]
**fraudCheckItemNrFraudCheckname** | **kotlin.String** | The fraud score due to a particular fraud check. The fraud check name is found in the key of the key-value pair. |  [optional]
**fraudManualReview** | **kotlin.String** | Indicates if the payment is sent to manual review. |  [optional]
**fraudResultType** | [**inline**](#FraudResultType) | The fraud result properties of the payment. |  [optional]
**fundingSource** | **kotlin.String** | Information regarding the funding type of the card. The possible return values are: * CHARGE * CREDIT * DEBIT * PREPAID * PREPAID_RELOADABLE  * PREPAID_NONRELOADABLE * DEFFERED_DEBIT  &gt; This functionality requires additional configuration on Adyen&#39;s end. To enable it, contact the Support Team.  For receiving this field in the notification, enable **Include Funding Source** in **Notifications** &gt; **Additional settings**. |  [optional]
**fundsAvailability** | **kotlin.String** | Indicates availability of funds.  Visa: * \&quot;I\&quot; (fast funds are supported) * \&quot;N\&quot; (otherwise)  Mastercard: * \&quot;I\&quot; (product type is Prepaid or Debit, or issuing country is in CEE/HGEM list) * \&quot;N\&quot; (otherwise)  &gt; Returned when you verify a card BIN or estimate costs, and only if payoutEligible is \&quot;Y\&quot; or \&quot;D\&quot;. |  [optional]
**inferredRefusalReason** | **kotlin.String** | Provides the more granular indication of why a transaction was refused. When a transaction fails with either \&quot;Refused\&quot;, \&quot;Restricted Card\&quot;, \&quot;Transaction Not Permitted\&quot;, \&quot;Not supported\&quot; or \&quot;DeclinedNon Generic\&quot; refusalReason from the issuer, Adyen cross references its PSP-wide data for extra insight into the refusal reason. If an inferred refusal reason is available, the &#x60;inferredRefusalReason&#x60;, field is populated and the &#x60;refusalReason&#x60;, is set to \&quot;Not Supported\&quot;.  Possible values:  * 3D Secure Mandated * Closed Account * ContAuth Not Supported * CVC Mandated * Ecommerce Not Allowed * Crossborder Not Supported * Card Updated  * Low Authrate Bin * Non-reloadable prepaid card |  [optional]
**isCardCommercial** | **kotlin.String** | Indicates if the card is used for business purposes only. |  [optional]
**issuerCountry** | **kotlin.String** | The issuing country of the card based on the BIN list that Adyen maintains.  Example: JP |  [optional]
**liabilityShift** | **kotlin.String** | A Boolean value indicating whether a liability shift was offered for this payment. |  [optional]
**mcBankNetReferenceNumber** | **kotlin.String** | The &#x60;mcBankNetReferenceNumber&#x60;, is a minimum of six characters and a maximum of nine characters long.  &gt; Contact Support Team to enable this field. |  [optional]
**merchantAdviceCode** | **kotlin.String** | The Merchant Advice Code (MAC) can be returned by Mastercard issuers for refused payments. If present, the MAC contains information about why the payment failed, and whether it can be retried.  For more information see [Mastercard Merchant Advice Codes](https://docs.adyen.com/development-resources/raw-acquirer-responses#mastercard-merchant-advice-codes). |  [optional]
**merchantReference** | **kotlin.String** | The reference provided for the transaction. |  [optional]
**networkTxReference** | **kotlin.String** | Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID. |  [optional]
**ownerName** | **kotlin.String** | The owner name of a bank account.  Only relevant for SEPA Direct Debit transactions. |  [optional]
**paymentAccountReference** | **kotlin.String** | The Payment Account Reference (PAR) value links a network token with the underlying primary account number (PAN). The PAR value consists of 29 uppercase alphanumeric characters. |  [optional]
**paymentMethod** | **kotlin.String** | The payment method used in the transaction. |  [optional]
**paymentMethodVariant** | **kotlin.String** | The Adyen sub-variant of the payment method used for the payment request.  For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).  Example: mcpro |  [optional]
**payoutEligible** | **kotlin.String** | Indicates whether a payout is eligible or not for this card.  Visa: * \&quot;Y\&quot; * \&quot;N\&quot;  Mastercard: * \&quot;Y\&quot; (domestic and cross-border)  * \&quot;D\&quot; (only domestic) * \&quot;N\&quot; (no MoneySend) * \&quot;U\&quot; (unknown) |  [optional]
**realtimeAccountUpdaterStatus** | **kotlin.String** | The response code from the Real Time Account Updater service.  Possible return values are: * CardChanged * CardExpiryChanged * CloseAccount  * ContactCardAccountHolder |  [optional]
**receiptFreeText** | **kotlin.String** | Message to be displayed on the terminal. |  [optional]
**recurringContractTypes** | **kotlin.String** | The recurring contract types applicable to the transaction. |  [optional]
**recurringFirstPspReference** | **kotlin.String** | The &#x60;pspReference&#x60;, of the first recurring payment that created the recurring detail.  This functionality requires additional configuration on Adyen&#39;s end. To enable it, contact the Support Team. |  [optional]
**recurringRecurringDetailReference** | **kotlin.String** | The reference that uniquely identifies the recurring transaction. |  [optional]
**recurringShopperReference** | **kotlin.String** | The provided reference of the shopper for a recurring transaction. |  [optional]
**recurringProcessingModel** | [**inline**](#RecurringProcessingModel) | The processing model used for the recurring transaction. |  [optional]
**referred** | **kotlin.String** | If the payment is referred, this field is set to true.  This field is unavailable if the payment is referred and is usually not returned with ecommerce transactions.  Example: true |  [optional]
**refusalReasonRaw** | **kotlin.String** | Raw refusal reason received from the acquirer, where available.  Example: AUTHORISED |  [optional]
**requestAmount** | **kotlin.String** | The amount of the payment request. |  [optional]
**requestCurrencyCode** | **kotlin.String** | The currency of the payment request. |  [optional]
**shopperInteraction** | **kotlin.String** | The shopper interaction type of the payment request.  Example: Ecommerce |  [optional]
**shopperReference** | **kotlin.String** | The shopperReference passed in the payment request.  Example: AdyenTestShopperXX |  [optional]
**terminalId** | **kotlin.String** | The terminal ID used in a point-of-sale payment.  Example: 06022622 |  [optional]
**threeDAuthenticated** | **kotlin.String** | A Boolean value indicating whether 3DS authentication was completed on this payment.  Example: true |  [optional]
**threeDAuthenticatedResponse** | **kotlin.String** | The raw 3DS authentication result from the card issuer.  Example: N |  [optional]
**threeDOffered** | **kotlin.String** | A Boolean value indicating whether 3DS was offered for this payment.  Example: true |  [optional]
**threeDOfferedResponse** | **kotlin.String** | The raw enrollment result from the 3DS directory services of the card schemes.  Example: Y |  [optional]
**threeDSVersion** | **kotlin.String** | The 3D Secure 2 version. |  [optional]
**visaTransactionId** | **kotlin.String** | The &#x60;visaTransactionId&#x60;, has a fixed length of 15 numeric characters.  &gt; Contact Support Team to enable this field. |  [optional]
**xid** | **kotlin.String** | The 3DS transaction ID of the 3DS session sent in notifications. The value is Base64-encoded and is returned for transactions with directoryResponse &#39;N&#39; or &#39;Y&#39;. If you want to submit the xid in your 3D Secure 1 request, use the &#x60;mpiData.xid&#x60;, field.  Example: ODgxNDc2MDg2MDExODk5MAAAAAA&#x3D; |  [optional]


<a name="FraudResultType"></a>
## Enum: fraudResultType
Name | Value
---- | -----
fraudResultType | GREEN, FRAUD


<a name="RecurringProcessingModel"></a>
## Enum: recurringProcessingModel
Name | Value
---- | -----
recurringProcessingModel | CardOnFile, Subscription, UnscheduledCardOnFile



