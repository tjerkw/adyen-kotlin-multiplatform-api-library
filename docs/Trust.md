
# Trust

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryOfGoverningLaw** | **kotlin.String** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country. | 
**name** | **kotlin.String** | The legal name. | 
**registeredAddress** | [**Address**](Address.md) |  | 
**type** | [**inline**](#Type) | Type of trust.  Possible values for Australian trusts: **cashManagementTrust**, **corporateUnitTrust**, **deceasedEstate**, **discretionaryInvestmentTrust**, **discretionaryServicesManagementTrust**, **discretionaryTradingTrust**, **firstHomeSaverAccountsTrust**, **fixedTrust**, **fixedUnitTrust**, **hybridTrust**, **listedPublicUnitTrust**, **otherTrust**, **pooledSuperannuationTrust**, **publicTradingTrust**, **unlistedPublicUnitTrust**. | 
**dateOfIncorporation** | **kotlin.String** | The date when the legal arrangement was incorporated in YYYY-MM-DD format. |  [optional]
**description** | **kotlin.String** | Short description about the trust. |  [optional]
**doingBusinessAs** | **kotlin.String** | The registered name, if different from the &#x60;name&#x60;. |  [optional]
**principalPlaceOfBusiness** | [**Address**](Address.md) |  |  [optional]
**registrationNumber** | **kotlin.String** | The registration number. |  [optional]
**taxInformation** | [**kotlin.collections.List&lt;TaxInformation&gt;**](TaxInformation.md) | The tax information of the entity. |  [optional]
**undefinedBeneficiaryInfo** | [**kotlin.collections.List&lt;UndefinedBeneficiary&gt;**](UndefinedBeneficiary.md) | The undefined beneficiary information of the entity. |  [optional]
**vatAbsenceReason** | [**inline**](#VatAbsenceReason) | The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**. |  [optional]
**vatNumber** | **kotlin.String** | The VAT number. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | cashManagementTrust, corporateUnitTrust, deceasedEstate, discretionaryInvestmentTrust, discretionaryServicesManagementTrust, discretionaryTradingTrust, firstHomeSaverAccountsTrust, fixedTrust, fixedUnitTrust, hybridTrust, listedPublicUnitTrust, otherTrust, pooledSuperannuationTrust, publicTradingTrust, unlistedPublicUnitTrust


<a name="VatAbsenceReason"></a>
## Enum: vatAbsenceReason
Name | Value
---- | -----
vatAbsenceReason | industryExemption, belowTaxThreshold



