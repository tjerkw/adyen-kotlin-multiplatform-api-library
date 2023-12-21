
# CardBin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bin** | **kotlin.String** | The first 6 digit of the card number. Enable this field via merchant account settings. |  [optional]
**commercial** | **kotlin.Boolean** | If true, it indicates a commercial card. Enable this field via merchant account settings. |  [optional]
**fundingSource** | **kotlin.String** | The card funding source. Valid values are: * CHARGE * CREDIT * DEBIT * DEFERRED_DEBIT * PREPAID * PREPAID_RELOADABLE * PREPAID_NONRELOADABLE &gt; Enable this field via merchant account settings. |  [optional]
**fundsAvailability** | **kotlin.String** | Indicates availability of funds.  Visa: * \&quot;I\&quot; (fast funds are supported) * \&quot;N\&quot; (otherwise)  Mastercard: * \&quot;I\&quot; (product type is Prepaid or Debit, or issuing country is in CEE/HGEM list) * \&quot;N\&quot; (otherwise) &gt; Returned when you verify a card BIN or estimate costs, and only if &#x60;payoutEligible&#x60; is different from \&quot;N\&quot; or \&quot;U\&quot;. |  [optional]
**issuerBin** | **kotlin.String** | The first 8 digit of the card number. Enable this field via merchant account settings. |  [optional]
**issuingBank** | **kotlin.String** | The issuing bank of the card. |  [optional]
**issuingCountry** | **kotlin.String** | The country where the card was issued from. |  [optional]
**issuingCurrency** | **kotlin.String** | The currency of the card. |  [optional]
**paymentMethod** | **kotlin.String** | The payment method associated with the card (e.g. visa, mc, or amex). |  [optional]
**payoutEligible** | **kotlin.String** | Indicates whether a payout is eligible or not for this card.  Visa: * \&quot;Y\&quot; * \&quot;N\&quot;  Mastercard: * \&quot;Y\&quot; (domestic and cross-border) * \&quot;D\&quot; (only domestic) * \&quot;N\&quot; (no MoneySend) * \&quot;U\&quot; (unknown) &gt; Returned when you verify a card BIN or estimate costs, and only if &#x60;payoutEligible&#x60; is different from \&quot;N\&quot; or \&quot;U\&quot;. |  [optional]
**summary** | **kotlin.String** | The last four digits of the card number. |  [optional]



