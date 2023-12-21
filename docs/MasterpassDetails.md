
# MasterpassDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**masterpassTransactionId** | **kotlin.String** | The Masterpass transaction ID. | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**type** | [**inline**](#Type) | **masterpass** |  [optional]


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | masterpass



