
# StoredPaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccountNumber** | **kotlin.String** | The bank account number (without separators). |  [optional]
**bankLocationId** | **kotlin.String** | The location id of the bank. The field value is &#x60;nil&#x60; in most cases. |  [optional]
**brand** | **kotlin.String** | The brand of the card. |  [optional]
**expiryMonth** | **kotlin.String** | The month the card expires. |  [optional]
**expiryYear** | **kotlin.String** | The last two digits of the year the card expires. For example, **22** for the year 2022. |  [optional]
**holderName** | **kotlin.String** | The unique payment method code. |  [optional]
**iban** | **kotlin.String** | The IBAN of the bank account. |  [optional]
**id** | **kotlin.String** | A unique identifier of this stored payment method. |  [optional]
**label** | **kotlin.String** | The shopper’s issuer account label |  [optional]
**lastFour** | **kotlin.String** | The last four digits of the PAN. |  [optional]
**name** | **kotlin.String** | The display name of the stored payment method. |  [optional]
**networkTxReference** | **kotlin.String** | Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID. |  [optional]
**ownerName** | **kotlin.String** | The name of the bank account holder. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper’s email address. |  [optional]
**supportedRecurringProcessingModels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The supported recurring processing models for this stored payment method. |  [optional]
**supportedShopperInteractions** | **kotlin.collections.List&lt;kotlin.String&gt;** | The supported shopper interactions for this stored payment method. |  [optional]
**type** | **kotlin.String** | The type of payment method. |  [optional]



