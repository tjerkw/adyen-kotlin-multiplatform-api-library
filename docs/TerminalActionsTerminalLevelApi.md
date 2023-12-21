# TerminalActionsTerminalLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postTerminalsScheduleActions**](TerminalActionsTerminalLevelApi.md#postTerminalsScheduleActions) | **POST** /terminals/scheduleActions | Create a terminal action


<a name="postTerminalsScheduleActions"></a>
# **postTerminalsScheduleActions**
> ScheduleTerminalActionsResponse postTerminalsScheduleActions(scheduleTerminalActionsRequest)

Create a terminal action

Schedules a [terminal action](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) by specifying the action and the terminals that the action must be applied to.   The following restrictions apply: * You can schedule only one action at a time. For example, to install a new app version and remove an old app version, you have to make two API requests.  * The maximum number of terminals in a request is **100**. For example, to apply an action to 250 terminals, you have to divide the terminals over three API requests.  * If there is an error with one or more terminal IDs in the request, the action is scheduled for none of the terminals. You need to fix the error and try again.   To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalActionsTerminalLevelApi()
val scheduleTerminalActionsRequest : ScheduleTerminalActionsRequest =  // ScheduleTerminalActionsRequest | 
try {
    val result : ScheduleTerminalActionsResponse = apiInstance.postTerminalsScheduleActions(scheduleTerminalActionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalActionsTerminalLevelApi#postTerminalsScheduleActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalActionsTerminalLevelApi#postTerminalsScheduleActions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleTerminalActionsRequest** | [**ScheduleTerminalActionsRequest**](ScheduleTerminalActionsRequest.md)|  | [optional]

### Return type

[**ScheduleTerminalActionsResponse**](ScheduleTerminalActionsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""
Configure BasicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

