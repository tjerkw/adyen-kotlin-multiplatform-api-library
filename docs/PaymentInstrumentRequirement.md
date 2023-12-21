
# PaymentInstrumentRequirement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **paymentInstrumentRequirement** | 
**description** | **kotlin.String** | Specifies the requirements for the payment instrument that need to be included in the request for a particular route. |  [optional]
**issuingCountryCode** | **kotlin.String** | The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**. |  [optional]
**onlyForCrossBalancePlatform** | **kotlin.Boolean** | Specifies if the requirement only applies to transfers to another balance platform. |  [optional]
**paymentInstrumentType** | [**inline**](#PaymentInstrumentType) | The type of the payment instrument. For example, \&quot;BankAccount\&quot; or \&quot;Card\&quot;. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | paymentInstrumentRequirement


<a name="PaymentInstrumentType"></a>
## Enum: paymentInstrumentType
Name | Value
---- | -----
paymentInstrumentType | BankAccount, Card



