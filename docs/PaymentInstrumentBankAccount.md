
# PaymentInstrumentBankAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **kotlin.String** | The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. | 
**type** | [**inline**](#Type) | **usLocal** | 
**accountNumber** | **kotlin.String** | The bank account number, without separators or whitespace. | 
**routingNumber** | **kotlin.String** | The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. | 
**accountType** | [**inline**](#AccountType) | The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | usLocal


<a name="AccountType"></a>
## Enum: accountType
Name | Value
---- | -----
accountType | checking, savings



