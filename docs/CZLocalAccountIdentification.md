
# CZLocalAccountIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountNumber** | **kotlin.String** | The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized) | 
**bankCode** | **kotlin.String** | The 4-digit bank code (Kód banky), without separators or whitespace. | 
**type** | [**inline**](#Type) | **czLocal** | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | czLocal



