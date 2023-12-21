
# SoleProprietorship

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryOfGoverningLaw** | **kotlin.String** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country. | 
**name** | **kotlin.String** | The legal name. | 
**registeredAddress** | [**Address**](Address.md) |  | 
**dateOfIncorporation** | **kotlin.String** | The date when the legal arrangement was incorporated in YYYY-MM-DD format. |  [optional]
**description** | **kotlin.String** | Short description about the Legal Arrangement. |  [optional]
**doingBusinessAs** | **kotlin.String** | The registered name, if different from the &#x60;name&#x60;. |  [optional]
**principalPlaceOfBusiness** | [**Address**](Address.md) |  |  [optional]
**registrationNumber** | **kotlin.String** | The registration number. |  [optional]
**taxInformation** | [**kotlin.collections.List&lt;TaxInformation&gt;**](TaxInformation.md) | The tax information of the entity. |  [optional]
**vatAbsenceReason** | [**inline**](#VatAbsenceReason) | The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**. |  [optional]
**vatNumber** | **kotlin.String** | The VAT number. |  [optional]


<a name="VatAbsenceReason"></a>
## Enum: vatAbsenceReason
Name | Value
---- | -----
vatAbsenceReason | industryExemption, belowTaxThreshold



