
# CALocalAccountIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountNumber** | **kotlin.String** | The 5- to 12-digit bank account number, without separators or whitespace. | 
**institutionNumber** | **kotlin.String** | The 3-digit institution number, without separators or whitespace. | 
**transitNumber** | **kotlin.String** | The 5-digit transit number, without separators or whitespace. | 
**type** | [**inline**](#Type) | **caLocal** | 
**accountType** | [**inline**](#AccountType) | The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | caLocal


<a name="AccountType"></a>
## Enum: accountType
Name | Value
---- | -----
accountType | checking, savings



