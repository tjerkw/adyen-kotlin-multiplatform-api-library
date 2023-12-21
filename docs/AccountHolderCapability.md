
# AccountHolderCapability

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **kotlin.Boolean** | Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability. |  [optional]
**allowedLevel** | [**inline**](#AllowedLevel) | The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**. |  [optional]
**allowedSettings** | [**CapabilitySettings**](CapabilitySettings.md) |  |  [optional]
**enabled** | **kotlin.Boolean** | Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder. |  [optional]
**problems** | [**kotlin.collections.List&lt;CapabilityProblem&gt;**](CapabilityProblem.md) | Contains verification errors and the actions that you can take to resolve them. |  [optional]
**requested** | **kotlin.Boolean** | Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the &#x60;allowed&#x60; field. |  [optional]
**requestedLevel** | [**inline**](#RequestedLevel) | The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**. |  [optional]
**requestedSettings** | [**CapabilitySettings**](CapabilitySettings.md) |  |  [optional]
**transferInstruments** | [**kotlin.collections.List&lt;AccountSupportingEntityCapability&gt;**](AccountSupportingEntityCapability.md) | Contains the status of the transfer instruments associated with this capability.  |  [optional]
**verificationStatus** | [**inline**](#VerificationStatus) | The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  |  [optional]


<a name="AllowedLevel"></a>
## Enum: allowedLevel
Name | Value
---- | -----
allowedLevel | high, low, medium, notApplicable


<a name="RequestedLevel"></a>
## Enum: requestedLevel
Name | Value
---- | -----
requestedLevel | high, low, medium, notApplicable


<a name="VerificationStatus"></a>
## Enum: verificationStatus
Name | Value
---- | -----
verificationStatus | invalid, pending, rejected, valid



