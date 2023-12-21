
# LegalEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier of the legal entity. |  [readonly]
**capabilities** | [**kotlin.collections.Map&lt;kotlin.String, LegalEntityCapability&gt;**](LegalEntityCapability.md) | Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. |  [optional] [readonly]
**documentDetails** | [**kotlin.collections.List&lt;DocumentReference&gt;**](DocumentReference.md) | List of documents uploaded for the legal entity. |  [optional]
**documents** | [**kotlin.collections.List&lt;EntityReference&gt;**](EntityReference.md) | List of documents uploaded for the legal entity. |  [optional]
**entityAssociations** | [**kotlin.collections.List&lt;LegalEntityAssociation&gt;**](LegalEntityAssociation.md) | List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories. |  [optional]
**individual** | [**Individual**](Individual.md) |  |  [optional]
**organization** | [**Organization**](Organization.md) |  |  [optional]
**problems** | [**kotlin.collections.List&lt;CapabilityProblem&gt;**](CapabilityProblem.md) | List of verification errors related to capabilities for the legal entity. |  [optional]
**reference** | **kotlin.String** | Your reference for the legal entity, maximum 150 characters. |  [optional]
**soleProprietorship** | [**SoleProprietorship**](SoleProprietorship.md) |  |  [optional]
**transferInstruments** | [**kotlin.collections.List&lt;TransferInstrumentReference&gt;**](TransferInstrumentReference.md) | List of transfer instruments that the legal entity owns. |  [optional] [readonly]
**trust** | [**Trust**](Trust.md) |  |  [optional]
**type** | [**inline**](#Type) | The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**. |  [optional]
**unincorporatedPartnership** | [**UnincorporatedPartnership**](UnincorporatedPartnership.md) |  |  [optional]
**verificationDeadlines** | [**kotlin.collections.List&lt;VerificationDeadline&gt;**](VerificationDeadline.md) | List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved. |  [optional] [readonly]
**verificationPlan** | **kotlin.String** | A key-value pair that specifies the [verification process](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details/) for a legal entity. Set to **upfront** for [upfront verification](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details#upfront). |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | individual, organization, soleProprietorship, trust, unincorporatedPartnership



