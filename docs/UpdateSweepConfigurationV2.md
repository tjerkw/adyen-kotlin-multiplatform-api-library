
# UpdateSweepConfigurationV2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**inline**](#Category) | The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;. |  [optional]
**counterparty** | [**SweepCounterparty**](SweepCounterparty.md) |  |  [optional]
**currency** | **kotlin.String** | The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances). |  [optional]
**description** | **kotlin.String** | The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters. |  [optional]
**id** | **kotlin.String** | The unique identifier of the sweep. |  [optional] [readonly]
**priorities** | [**inline**](#kotlin.collections.List&lt;Priorities&gt;) | The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that&#39;s not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set &#x60;category&#x60; to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup). |  [optional]
**reason** | [**inline**](#Reason) | The reason for disabling the sweep. |  [optional] [readonly]
**schedule** | [**SweepSchedule**](SweepSchedule.md) |  |  [optional]
**status** | [**inline**](#Status) | The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.    |  [optional]
**sweepAmount** | [**Amount**](Amount.md) |  |  [optional]
**targetAmount** | [**Amount**](Amount.md) |  |  [optional]
**triggerAmount** | [**Amount**](Amount.md) |  |  [optional]
**type** | [**inline**](#Type) | The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account. |  [optional]


<a name="Category"></a>
## Enum: category
Name | Value
---- | -----
category | bank, internal, platformPayment


<a name="kotlin.collections.List<Priorities>"></a>
## Enum: priorities
Name | Value
---- | -----
priorities | crossBorder, fast, instant, internal, regular, wire


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



