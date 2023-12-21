
# SweepConfigurationV2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterparty** | [**SweepCounterparty**](SweepCounterparty.md) |  | 
**currency** | **kotlin.String** | The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances). | 
**id** | **kotlin.String** | The unique identifier of the sweep. | 
**schedule** | [**SweepSchedule**](SweepSchedule.md) |  | 
**description** | **kotlin.String** | The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters. |  [optional]
**reason** | [**inline**](#Reason) | The reason for disabling the sweep. |  [optional]
**status** | [**inline**](#Status) | The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.    |  [optional]
**sweepAmount** | [**Amount**](Amount.md) |  |  [optional]
**targetAmount** | [**Amount**](Amount.md) |  |  [optional]
**triggerAmount** | [**Amount**](Amount.md) |  |  [optional]
**type** | [**inline**](#Type) | The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account. |  [optional]


<a name="Reason"></a>
## Enum: reason
Name | Value
---- | -----
reason | amountLimitExceeded, approved, balanceAccountTemporarilyBlockedByTransactionRule, counterpartyAccountBlocked, counterpartyAccountClosed, counterpartyAccountNotFound, counterpartyAddressRequired, counterpartyBankTimedOut, counterpartyBankUnavailable, declinedByTransactionRule, error, notEnoughBalance, refusedByCounterpartyBank, routeNotFound, scaFailed, unknown


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, inactive


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | pull, push



