
# StoreDetailAndSubmitRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**dateOfBirth** | **kotlin.String** | The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons. | 
**entityType** | [**inline**](#EntityType) | The type of the entity the payout is processed for. | 
**merchantAccount** | **kotlin.String** | The merchant account identifier, with which you want to process the transaction. | 
**nationality** | **kotlin.String** | The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;). | 
**recurring** | [**Recurring**](Recurring.md) |  | 
**reference** | **kotlin.String** | The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement. | 
**shopperEmail** | **kotlin.String** | The shopper&#39;s email address. | 
**shopperReference** | **kotlin.String** | The shopper&#39;s reference for the payment transaction. | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be required for a particular request. |  [optional]
**bank** | [**BankAccount**](BankAccount.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**card** | [**Card**](Card.md) |  |  [optional]
**fraudOffset** | **kotlin.Int** | An integer value that is added to the normal fraud score. The value can be either positive or negative. |  [optional]
**selectedBrand** | **kotlin.String** | The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;. |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperStatement** | **kotlin.String** | The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method). |  [optional]
**socialSecurityNumber** | **kotlin.String** | The shopper&#39;s social security number. |  [optional]
**telephoneNumber** | **kotlin.String** | The shopper&#39;s phone number. |  [optional]


<a name="EntityType"></a>
## Enum: entityType
Name | Value
---- | -----
entityType | NaturalPerson, Company



