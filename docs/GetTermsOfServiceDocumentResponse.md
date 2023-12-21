
# GetTermsOfServiceDocumentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | [**com.adyen.client.infrastructure.Base64ByteArray**](com.adyen.client.infrastructure.Base64ByteArray.md) | The Terms of Service document in Base64-encoded format. |  [optional]
**id** | **kotlin.String** | The unique identifier of the legal entity. |  [optional]
**language** | **kotlin.String** | The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English. |  [optional]
**termsOfServiceDocumentId** | **kotlin.String** | The unique identifier of the Terms of Service document. |  [optional]
**type** | [**inline**](#Type) | The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**   |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | adyenAccount, adyenCapital, adyenCard, adyenForPlatformsAdvanced, adyenForPlatformsManage, adyenFranchisee, adyenIssuing



