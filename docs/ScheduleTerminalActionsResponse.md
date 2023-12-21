
# ScheduleTerminalActionsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionDetails** | [**ScheduleTerminalActionsRequestActionDetails**](ScheduleTerminalActionsRequestActionDetails.md) |  |  [optional]
**items** | [**kotlin.collections.List&lt;TerminalActionScheduleDetail&gt;**](TerminalActionScheduleDetail.md) | A list containing a terminal ID and an action ID for each terminal that the action was scheduled for. |  [optional]
**scheduledAt** | **kotlin.String** | The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call. |  [optional]
**storeId** | **kotlin.String** | The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the &#x60;terminalIds&#x60; list must be assigned to this store. |  [optional]
**terminalsWithErrors** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;** | The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to. |  [optional]
**totalErrors** | **kotlin.Int** | The number of terminals for which scheduling the action failed. |  [optional]
**totalScheduled** | **kotlin.Int** | The number of terminals for which the action was successfully scheduled. This doesn&#39;t mean the action has happened yet. |  [optional]



