
# AccountCapabilityData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requested** | **kotlin.Boolean** | Indicates whether you requested the capability. | 
**requestedLevel** | **kotlin.String** | The level that you requested for the capability. Some capabilities have different levels which correspond to thresholds. Higher levels may require additional checks and increased monitoring.Possible values: **notApplicable**, **low**, **medium**, **high**. | 
**allowed** | **kotlin.Boolean** | Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful. |  [optional]
**allowedLevel** | **kotlin.String** | The allowed level of the capability. Some capabilities have different levels which correspond to thresholds. Higher levels may require additional checks and increased monitoring.Possible values: **notApplicable**, **low**, **medium**, **high**. |  [optional]
**capability** | **kotlin.String** | The name of the capability. For example, **sendToTransferInstrument**. |  [optional]
**problems** | [**kotlin.collections.List&lt;CapabilityProblem&gt;**](CapabilityProblem.md) | List of entities that has problems with verification. The information includes the details of the errors and the actions that you can take to resolve them. |  [optional]
**verificationStatus** | **kotlin.String** | The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification was successful.  * **rejected**: Adyen checked the information and found reasons to not allow the capability.  |  [optional]



