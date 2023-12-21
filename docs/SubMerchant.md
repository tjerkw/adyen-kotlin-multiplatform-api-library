
# SubMerchant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **kotlin.String** | The city of the sub-merchant&#39;s address. * Format: Alphanumeric * Maximum length: 13 characters |  [optional]
**country** | **kotlin.String** | The three-letter country code of the sub-merchant&#39;s address. For example, **BRA** for Brazil.  * Format: [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) * Fixed length: 3 characters |  [optional]
**mcc** | **kotlin.String** | The sub-merchant&#39;s 4-digit Merchant Category Code (MCC).  * Format: Numeric * Fixed length: 4 digits |  [optional]
**name** | **kotlin.String** | The name of the sub-merchant. Based on scheme specifications, this value will overwrite the shopper statement  that will appear in the card statement. * Format: Alphanumeric * Maximum length: 22 characters |  [optional]
**taxId** | **kotlin.String** | The tax ID of the sub-merchant. * Format: Numeric * Fixed length: 11 digits for the CPF or 14 digits for the CNPJ |  [optional]



