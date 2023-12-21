
# LegalEntityInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**kotlin.collections.Map&lt;kotlin.String, LegalEntityCapability&gt;**](LegalEntityCapability.md) | Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. |  [optional] [readonly]
**entityAssociations** | [**kotlin.collections.List&lt;LegalEntityAssociation&gt;**](LegalEntityAssociation.md) | List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories. |  [optional]
**individual** | [**Individual**](Individual.md) |  |  [optional]
**organization** | [**Organization**](Organization.md) |  |  [optional]
**reference** | **kotlin.String** | Your reference for the legal entity, maximum 150 characters. |  [optional]
**soleProprietorship** | [**SoleProprietorship**](SoleProprietorship.md) |  |  [optional]
**trust** | [**Trust**](Trust.md) |  |  [optional]
**type** | [**inline**](#Type) | The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**. |  [optional]
**unincorporatedPartnership** | [**UnincorporatedPartnership**](UnincorporatedPartnership.md) |  |  [optional]
**verificationPlan** | **kotlin.String** | A key-value pair that specifies the [verification process](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details/) for a legal entity. Set to **upfront** for [upfront verification](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details#upfront). |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | individual, organization, soleProprietorship, trust, unincorporatedPartnership



