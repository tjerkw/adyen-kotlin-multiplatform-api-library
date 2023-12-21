
# TermsOfServiceAcceptanceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedBy** | **kotlin.String** | The unique identifier of the user that accepted the Terms of Service. |  [optional]
**acceptedFor** | **kotlin.String** | The unique identifier of the legal entity for which the Terms of Service are accepted. |  [optional]
**createdAt** | **kotlin.String** | The date when the Terms of Service were accepted. |  [optional]
**id** | **kotlin.String** | An Adyen-generated reference for the accepted Terms of Service. |  [optional]
**type** | [**inline**](#Type) | The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**   |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | adyenAccount, adyenCapital, adyenCard, adyenForPlatformsAdvanced, adyenForPlatformsManage, adyenFranchisee, adyenIssuing



