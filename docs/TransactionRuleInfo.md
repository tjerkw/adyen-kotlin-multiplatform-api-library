
# TransactionRuleInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **kotlin.String** | Your description for the transaction rule, maximum 300 characters. | 
**entityKey** | [**TransactionRuleEntityKey**](TransactionRuleEntityKey.md) |  | 
**interval** | [**TransactionRuleInterval**](TransactionRuleInterval.md) |  | 
**reference** | **kotlin.String** | Your reference for the transaction rule, maximum 150 characters. | 
**ruleRestrictions** | [**TransactionRuleRestrictions**](TransactionRuleRestrictions.md) |  | 
**type** | [**inline**](#Type) | The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met.  | 
**aggregationLevel** | **kotlin.String** | The level at which data must be accumulated, used in rules with &#x60;type&#x60; **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the &#x60;entityKey&#x60;.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**. |  [optional]
**endDate** | **kotlin.String** | The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**. |  [optional]
**outcomeType** | [**inline**](#OutcomeType) | The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the &#x60;score&#x60; you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined. |  [optional]
**requestType** | [**inline**](#RequestType) | Indicates the type of request to which the rule applies. If not provided, by default, this is set to **authorization**.  Possible values: **authorization**, **authentication**, **tokenization**, **bankTransfer**. |  [optional]
**score** | **kotlin.Int** | A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when &#x60;outcomeType&#x60; is **scoreBased**.  The value must be between **-100** and **100**. |  [optional]
**startDate** | **kotlin.String** | The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the &#x60;startDate&#x60; is set to the date when the rule status is set to **active**.    |  [optional]
**status** | [**inline**](#Status) | The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | allowList, blockList, maxUsage, velocity


<a name="OutcomeType"></a>
## Enum: outcomeType
Name | Value
---- | -----
outcomeType | enforceSCA, hardBlock, scoreBased


<a name="RequestType"></a>
## Enum: requestType
Name | Value
---- | -----
requestType | authentication, authorization, bankTransfer, tokenization


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, inactive



