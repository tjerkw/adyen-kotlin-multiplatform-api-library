
# LegalEntityCapability

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **kotlin.Boolean** | Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful. |  [optional] [readonly]
**allowedLevel** | [**inline**](#AllowedLevel) | The capability level that is allowed for the legal entity.  Possible values: **notApplicable**, **low**, **medium**, **high**. |  [optional] [readonly]
**allowedSettings** | [**CapabilitySettings**](CapabilitySettings.md) |  |  [optional]
**requested** | **kotlin.Boolean** | Indicates whether the capability is requested. To check whether the legal entity is permitted to use the capability, refer to the &#x60;allowed&#x60; field. |  [optional] [readonly]
**requestedLevel** | [**inline**](#RequestedLevel) | The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**. |  [optional] [readonly]
**requestedSettings** | [**CapabilitySettings**](CapabilitySettings.md) |  |  [optional]
**transferInstruments** | [**kotlin.collections.List&lt;SupportingEntityCapability&gt;**](SupportingEntityCapability.md) | The capability status of transfer instruments associated with the legal entity. |  [optional] [readonly]
**verificationStatus** | **kotlin.String** | The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability.  |  [optional] [readonly]


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



