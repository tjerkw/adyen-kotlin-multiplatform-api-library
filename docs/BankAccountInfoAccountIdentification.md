
# BankAccountInfoAccountIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountNumber** | **kotlin.String** | The bank account number, without separators or whitespace. | 
**bsbCode** | **kotlin.String** | The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace. | 
**type** | [**inline**](#Type) | **usLocal** | 
**institutionNumber** | **kotlin.String** | The 3-digit institution number, without separators or whitespace. | 
**transitNumber** | **kotlin.String** | The 5-digit transit number, without separators or whitespace. | 
**bankCode** | **kotlin.String** | The 4-digit bank code (Registreringsnummer) (without separators or whitespace). | 
**clearingCode** | **kotlin.String** | The 3-digit clearing code, without separators or whitespace. | 
**iban** | **kotlin.String** | The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. | 
**bic** | **kotlin.String** | The bank&#39;s 8- or 11-character BIC or SWIFT code. | 
**clearingNumber** | **kotlin.String** | The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace. | 
**sortCode** | **kotlin.String** | The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace. | 
**routingNumber** | **kotlin.String** | The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. | 
**accountType** | [**inline**](#AccountType) | The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. |  [optional]
**additionalBankIdentification** | [**AdditionalBankIdentification**](AdditionalBankIdentification.md) |  |  [optional]


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



