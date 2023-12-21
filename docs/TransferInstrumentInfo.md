
# TransferInstrumentInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccount** | [**BankAccountInfo**](BankAccountInfo.md) |  | 
**legalEntityId** | **kotlin.String** | The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument. | 
**type** | [**inline**](#Type) | The type of transfer instrument.  Possible value: **bankAccount**. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | bankAccount, recurringDetail



