
# LegalEntityAssociation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legalEntityId** | **kotlin.String** | The unique identifier of the associated [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). | 
**type** | [**inline**](#Type) | Defines the relationship of the legal entity to the current legal entity.  Possible values for organizations: **uboThroughOwnership**, **uboThroughControl**, **director**, **signatory**, or **ultimateParentCompany**.  Possible values for sole proprietorships: **soleProprietorship**.  Possible value for trusts: **trust**  Possible values for trust members: **definedBeneficiary**, **protector**, **secondaryTrustee**, **settlor**, **uboThroughControl**, or **uboThroughOwnership**. | 
**associatorId** | **kotlin.String** | The unique identifier of another legal entity with which the &#x60;legalEntityId&#x60; is associated. When the &#x60;legalEntityId&#x60; is associated to legal entities other than the current one, the response returns all the associations. |  [optional] [readonly]
**entityType** | **kotlin.String** | The legal entity type of associated legal entity.  For example, **organization**, **soleProprietorship** or **individual**. |  [optional] [readonly]
**jobTitle** | **kotlin.String** | The individual&#39;s job title if the &#x60;type&#x60; is **uboThroughControl** or **signatory**. |  [optional]
**name** | **kotlin.String** | The name of the associated [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id).  - For **individual**, &#x60;name.firstName&#x60; and &#x60;name.lastName&#x60;. - For **organization**, &#x60;legalName&#x60;. - For **soleProprietorship**, &#x60;name&#x60;. |  [optional] [readonly]
**settlorExemptionReason** | **kotlin.collections.List&lt;kotlin.String&gt;** | Defines the Kyc Exemption Reason for a Settlor associated with a trust.  For example, **professionalServiceProvider**, **deceased**, or **contributionBelowThreshold**. |  [optional] [readonly]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | definedBeneficiary, director, pciSignatory, protector, secondaryTrustee, settlor, signatory, soleProprietorship, trust, trustOwnership, uboThroughControl, uboThroughOwnership, ultimateParentCompany, undefinedBeneficiary



