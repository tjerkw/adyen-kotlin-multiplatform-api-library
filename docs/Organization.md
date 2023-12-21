
# Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legalName** | **kotlin.String** | The organization&#39;s legal name. | 
**registeredAddress** | [**Address**](Address.md) |  | 
**dateOfIncorporation** | **kotlin.String** | The date when the organization was incorporated in YYYY-MM-DD format. |  [optional]
**description** | **kotlin.String** | Your description for the organization. |  [optional]
**doingBusinessAs** | **kotlin.String** | The organization&#39;s trading name, if different from the registered legal name. |  [optional]
**email** | **kotlin.String** | The email address of the legal entity. |  [optional]
**phone** | [**PhoneNumber**](PhoneNumber.md) |  |  [optional]
**principalPlaceOfBusiness** | [**Address**](Address.md) |  |  [optional]
**registrationNumber** | **kotlin.String** | The organization&#39;s registration number. |  [optional]
**stockData** | [**StockData**](StockData.md) |  |  [optional]
**taxInformation** | [**kotlin.collections.List&lt;TaxInformation&gt;**](TaxInformation.md) | The tax information of the organization. |  [optional]
**taxReportingClassification** | [**TaxReportingClassification**](TaxReportingClassification.md) |  |  [optional]
**type** | [**inline**](#Type) | Type of organization.  Possible values: **associationIncorporated**, **governmentalOrganization**, **listedPublicCompany**, **nonProfit**, **partnershipIncorporated**, **privateCompany**. |  [optional]
**vatAbsenceReason** | [**inline**](#VatAbsenceReason) | The reason the organization has not provided a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**. |  [optional]
**vatNumber** | **kotlin.String** | The organization&#39;s VAT number. |  [optional]
**webData** | [**WebData**](WebData.md) |  |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | associationIncorporated, governmentalOrganization, listedPublicCompany, nonProfit, partnershipIncorporated, privateCompany


<a name="VatAbsenceReason"></a>
## Enum: vatAbsenceReason
Name | Value
---- | -----
vatAbsenceReason | industryExemption, belowTaxThreshold



