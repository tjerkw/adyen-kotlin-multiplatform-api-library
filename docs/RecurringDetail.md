
# RecurringDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recurringDetailReference** | **kotlin.String** | The reference that uniquely identifies the recurring detail. | 
**variant** | **kotlin.String** | The payment method, such as “mc\&quot;, \&quot;visa\&quot;, \&quot;ideal\&quot;, \&quot;paypal\&quot;. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be returned in a particular response.  The additionalData object consists of entries, each of which includes the key and value. |  [optional]
**alias** | **kotlin.String** | The alias of the credit card number.  Applies only to recurring contracts storing credit card details |  [optional]
**aliasType** | **kotlin.String** | The alias type of the credit card number.  Applies only to recurring contracts storing credit card details. |  [optional]
**bank** | [**BankAccount**](BankAccount.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**card** | [**Card**](Card.md) |  |  [optional]
**contractTypes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Types of recurring contracts. |  [optional]
**creationDate** | **kotlin.String** | The date when the recurring details were created. |  [optional]
**firstPspReference** | **kotlin.String** | The &#x60;pspReference&#x60; of the first recurring payment that created the recurring detail. |  [optional]
**name** | **kotlin.String** | An optional descriptive name for this recurring detail. |  [optional]
**networkTxReference** | **kotlin.String** | Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID. |  [optional]
**paymentMethodVariant** | **kotlin.String** | The  type or sub-brand of a payment method used, e.g. Visa Debit, Visa Corporate, etc. For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant). |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**socialSecurityNumber** | **kotlin.String** | A shopper&#39;s social security number (only in countries where it is legal to collect). |  [optional]
**tokenDetails** | [**TokenDetails**](TokenDetails.md) |  |  [optional]



