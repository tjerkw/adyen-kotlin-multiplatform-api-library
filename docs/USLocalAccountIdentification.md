
# USLocalAccountIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountNumber** | **kotlin.String** | The bank account number, without separators or whitespace. | 
**routingNumber** | **kotlin.String** | The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. | 
**type** | [**inline**](#Type) | **usLocal** | 
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



