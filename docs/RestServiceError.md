
# RestServiceError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | **kotlin.String** | A human-readable explanation specific to this occurrence of the problem. | 
**errorCode** | **kotlin.String** | A code that identifies the problem type. | 
**status** | **kotlin.Int** | The HTTP status code. | 
**title** | **kotlin.String** | A short, human-readable summary of the problem type. | 
**type** | **kotlin.String** | A URI that identifies the problem type, pointing to human-readable documentation on this problem type. | 
**instance** | **kotlin.String** | A unique URI that identifies the specific occurrence of the problem. |  [optional]
**invalidFields** | [**kotlin.collections.List&lt;InvalidField&gt;**](InvalidField.md) | Detailed explanation of each validation error, when applicable. |  [optional]
**requestId** | **kotlin.String** | A unique reference for the request, essentially the same as &#x60;pspReference&#x60;. |  [optional]
**response** | **kotlin.String** | JSON response payload. |  [optional]



