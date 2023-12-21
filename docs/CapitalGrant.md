
# CapitalGrant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balances** | [**CapitalBalance**](CapitalBalance.md) |  | 
**grantAccountId** | **kotlin.String** | The identifier of the grant account used for the grant. | 
**grantOfferId** | **kotlin.String** | The identifier of the grant offer that has been selected and from which the grant details will be used. | 
**id** | **kotlin.String** | The identifier of the grant reference. | 
**status** | [**inline**](#Status) | The current status of the grant. Possible values: **Pending**, **Active**, **Repaid**. | 
**amount** | [**Amount**](Amount.md) |  |  [optional]
**counterparty** | [**Counterparty**](Counterparty.md) |  |  [optional]
**fee** | [**Fee**](Fee.md) |  |  [optional]
**repayment** | [**Repayment**](Repayment.md) |  |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | Pending, Active, Repaid



