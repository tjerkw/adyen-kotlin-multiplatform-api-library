
# VerificationErrorMinusRecursive

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **kotlin.String** | The verification error code. |  [optional]
**message** | **kotlin.String** | The verification error message. |  [optional]
**type** | [**inline**](#Type) | The type of verification error.  Possible values: **invalidInput**, **dataMissing**, and **pendingStatus**. |  [optional]
**remediatingActions** | [**kotlin.collections.List&lt;RemediatingAction&gt;**](RemediatingAction.md) | The actions that you can take to resolve the verification error. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | dataMissing, invalidInput, pendingStatus



