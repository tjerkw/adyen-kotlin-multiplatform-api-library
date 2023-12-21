
# GrantOffer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountHolderId** | **kotlin.String** | The identifier of the account holder to which the grant is offered. | 
**amount** | [**Amount**](Amount.md) |  |  [optional]
**contractType** | [**inline**](#ContractType) | The contract type of the grant offer. Possible value: **cashAdvance**, **loan**. |  [optional]
**expiresAt** | **kotlin.String** |  |  [optional]
**fee** | [**Fee**](Fee.md) |  |  [optional]
**id** | **kotlin.String** | The unique identifier of the grant offer. |  [optional]
**repayment** | [**Repayment**](Repayment.md) |  |  [optional]
**startsAt** | **kotlin.String** |  |  [optional]


<a name="ContractType"></a>
## Enum: contractType
Name | Value
---- | -----
contractType | cashAdvance, loan



