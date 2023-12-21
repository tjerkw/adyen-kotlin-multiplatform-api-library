
# BankAccountIdentificationTypeRequirement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **bankAccountIdentificationTypeRequirement** | 
**bankAccountIdentificationTypes** | [**inline**](#kotlin.collections.List&lt;BankAccountIdentificationTypes&gt;) | List of bank account identification types: eg.; [iban , numberAndBic] |  [optional]
**description** | **kotlin.String** | Specifies the bank account details for a particular route per required field in this object depending on the country of the bank account and the currency of the transfer. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | bankAccountIdentificationTypeRequirement


<a name="kotlin.collections.List<BankAccountIdentificationTypes>"></a>
## Enum: bankAccountIdentificationTypes
Name | Value
---- | -----
bankAccountIdentificationTypes | auLocal, brLocal, caLocal, czLocal, dkLocal, hkLocal, huLocal, iban, legacy, noLocal, numberAndBic, nzLocal, plLocal, seLocal, sgLocal, ukLocal, usLocal



