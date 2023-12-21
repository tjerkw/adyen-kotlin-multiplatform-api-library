
# TaxReportingClassification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessType** | [**inline**](#BusinessType) | The organization&#39;s business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**. |  [optional]
**financialInstitutionNumber** | **kotlin.String** | The Global Intermediary Identification Number (GIIN) required for FATCA. Only required if the organization is a US financial institution and the &#x60;businessType&#x60; is **financialInstitution**. |  [optional]
**mainSourceOfIncome** | [**inline**](#MainSourceOfIncome) | The organization&#39;s main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**. |  [optional]
**type** | [**inline**](#Type) | The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**. |  [optional]


<a name="BusinessType"></a>
## Enum: businessType
Name | Value
---- | -----
businessType | other, listedPublicCompany, subsidiaryOfListedPublicCompany, governmentalOrganization, internationalOrganization, financialInstitution.


<a name="MainSourceOfIncome"></a>
## Enum: mainSourceOfIncome
Name | Value
---- | -----
mainSourceOfIncome | businessOperation, realEstateSales, investmentInterestOrRoyalty, propertyRental, other


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | nonFinancialNonReportable, financialNonReportable, nonFinancialActive, nonFinancialPassive



