
# SupportingEntityCapability

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **kotlin.Boolean** | Indicates whether the capability is allowed for the supporting entity.  If a capability is allowed for a supporting entity but not for the parent legal entity, this means the legal entity has other supporting entities that failed verification.  **You can use the allowed supporting entity** regardless of the verification status of other supporting entities. |  [optional] [readonly]
**id** | **kotlin.String** | Supporting entity reference  |  [optional] [readonly]
**requested** | **kotlin.Boolean** | Indicates whether the supporting entity capability is requested.  |  [optional] [readonly]
**verificationStatus** | **kotlin.String** | The status of the verification checks for the capability of the supporting entity.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  |  [optional] [readonly]



