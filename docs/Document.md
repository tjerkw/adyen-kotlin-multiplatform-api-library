
# Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **kotlin.String** | Your description for the document. | 
**type** | [**inline**](#Type) | Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, **proofOfOwnership**, **proofOfIndustry**, or **proofOfFundingOrWealthSource**.  * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, **proofOfIndividualTaxId**, or **proofOfFundingOrWealthSource**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id). | 
**attachment** | [**Attachment**](Attachment.md) |  |  [optional]
**attachments** | [**kotlin.collections.List&lt;Attachment&gt;**](Attachment.md) | Array that contains the document. The array supports multiple attachments for uploading different sides or pages of a document. |  [optional]
**creationDate** | **kotlin.String** | The creation date of the document. |  [optional] [readonly]
**expiryDate** | **kotlin.String** | The expiry date of the document, in YYYY-MM-DD format. |  [optional]
**fileName** | **kotlin.String** | The filename of the document. |  [optional]
**id** | **kotlin.String** | The unique identifier of the document. |  [optional] [readonly]
**issuerCountry** | **kotlin.String** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**. |  [optional]
**issuerState** | **kotlin.String** | The state or province where the document was issued (AU only). |  [optional]
**modificationDate** | **kotlin.String** | The modification date of the document. |  [optional] [readonly]
**number** | **kotlin.String** | The number in the document. |  [optional]
**owner** | [**OwnerEntity**](OwnerEntity.md) |  |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | bankStatement, driversLicense, identityCard, nationalIdNumber, passport, proofOfAddress, proofOfNationalIdNumber, proofOfResidency, registrationDocument, vatDocument, proofOfOrganizationTaxInfo, proofOfIndustry, constitutionalDocument, proofOfFundingOrWealthSource



