
# TransferInstrument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccount** | [**BankAccountInfo**](BankAccountInfo.md) |  | 
**id** | **kotlin.String** | The unique identifier of the transfer instrument. |  [readonly]
**legalEntityId** | **kotlin.String** | The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument. | 
**type** | [**inline**](#Type) | The type of transfer instrument.  Possible value: **bankAccount**. | 
**capabilities** | [**kotlin.collections.Map&lt;kotlin.String, SupportingEntityCapability&gt;**](SupportingEntityCapability.md) | List of capabilities for this transfer instrument. |  [optional]
**documentDetails** | [**kotlin.collections.List&lt;DocumentReference&gt;**](DocumentReference.md) | List of documents uploaded for the transfer instrument. |  [optional]
**problems** | [**kotlin.collections.List&lt;CapabilityProblem&gt;**](CapabilityProblem.md) | The verification errors related to capabilities for this transfer instrument. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | bankAccount, recurringDetail



