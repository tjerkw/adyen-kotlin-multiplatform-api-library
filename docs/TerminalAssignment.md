
# TerminalAssignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **kotlin.String** | The unique identifier of the company account to which terminal is assigned. | 
**status** | [**inline**](#Status) | The status of the reassignment. Possible values:   * &#x60;reassignmentInProgress&#x60;: the terminal was boarded and is now scheduled to remove the configuration. Wait for the terminal to synchronize with the Adyen platform.  * &#x60;deployed&#x60;: the terminal is deployed and reassigned.   * &#x60;inventory&#x60;: the terminal is in inventory and cannot process transactions.   * &#x60;boarded&#x60;: the terminal is boarded to a store, or a merchant account representing a store, and can process transactions.   | 
**merchantId** | **kotlin.String** | The unique identifier of the merchant account to which terminal is assigned. |  [optional]
**reassignmentTarget** | [**TerminalReassignmentTarget**](TerminalReassignmentTarget.md) |  |  [optional]
**storeId** | **kotlin.String** | The unique identifier of the store to which terminal is assigned. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | boarded, deployed, inventory, reassignmentInProgress



