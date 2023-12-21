
# StoredPaymentMethodResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **kotlin.String** | The brand of the card. |  [optional]
**expiryMonth** | **kotlin.String** | The month the card expires. |  [optional]
**expiryYear** | **kotlin.String** | The last two digits of the year the card expires. For example, **22** for the year 2022. |  [optional]
**externalResponseCode** | **kotlin.String** | The response code returned by an external system (for example after a provisioning operation). |  [optional]
**externalTokenReference** | **kotlin.String** | The token reference of a linked token in an external system (for example a network token reference). |  [optional]
**holderName** | **kotlin.String** | The unique payment method code. |  [optional]
**iban** | **kotlin.String** | The IBAN of the bank account. |  [optional]
**id** | **kotlin.String** | A unique identifier of this stored payment method. |  [optional]
**issuerName** | **kotlin.String** | The name of the issuer of token or card. |  [optional]
**lastFour** | **kotlin.String** | The last four digits of the PAN. |  [optional]
**name** | **kotlin.String** | The display name of the stored payment method. |  [optional]
**networkTxReference** | **kotlin.String** | Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID. |  [optional]
**ownerName** | **kotlin.String** | The name of the bank account holder. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper’s email address. |  [optional]
**shopperReference** | **kotlin.String** | Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**supportedRecurringProcessingModels** | **kotlin.collections.List&lt;kotlin.String&gt;** | Defines a recurring payment type. Allowed values: * &#x60;Subscription&#x60; – A transaction for a fixed or variable amount, which follows a fixed schedule. * &#x60;CardOnFile&#x60; – With a card-on-file (CoF) transaction, card details are stored to enable one-click or omnichannel journeys, or simply to streamline the checkout process. Any subscription not following a fixed schedule is also considered a card-on-file transaction. * &#x60;UnscheduledCardOnFile&#x60; – An unscheduled card-on-file (UCoF) transaction is a transaction that occurs on a non-fixed schedule and/or have variable amounts. For example, automatic top-ups when a cardholder&#39;s balance drops below a certain amount. |  [optional]
**type** | **kotlin.String** | The type of payment method. |  [optional]



