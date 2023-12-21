
# TransactionRulesResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advice** | **kotlin.String** | The advice given by the Risk analysis. |  [optional]
**allHardBlockRulesPassed** | **kotlin.Boolean** | Indicates whether the transaction passed the evaluation for all hardblock rules |  [optional]
**score** | **kotlin.Int** | The score of the Risk analysis. |  [optional]
**triggeredTransactionRules** | [**kotlin.collections.List&lt;TransactionEventViolation&gt;**](TransactionEventViolation.md) | Array containing all the transaction rules that the transaction triggered. |  [optional]



