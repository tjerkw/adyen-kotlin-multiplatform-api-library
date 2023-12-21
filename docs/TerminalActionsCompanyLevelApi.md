# TerminalActionsCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompaniesCompanyIdTerminalActions**](TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdTerminalActions) | **GET** /companies/{companyId}/terminalActions | Get a list of terminal actions
[**getCompaniesCompanyIdTerminalActionsActionId**](TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdTerminalActionsActionId) | **GET** /companies/{companyId}/terminalActions/{actionId} | Get terminal action


<a name="getCompaniesCompanyIdTerminalActions"></a>
# **getCompaniesCompanyIdTerminalActions**
> ListExternalTerminalActionsResponse getCompaniesCompanyIdTerminalActions(companyId, pageNumber, pageSize, status, type)

Get a list of terminal actions

Returns the [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) that have been scheduled for the company identified in the path.The response doesn&#39;t include actions that are scheduled by Adyen. To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalActionsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 20 items on a page.
val status : kotlin.String = status_example // kotlin.String | Returns terminal actions with the specified status.  Allowed values: **pending**, **successful**, **failed**, **cancelled**, **tryLater**.
val type : kotlin.String = type_example // kotlin.String | Returns terminal actions of the specified type.  Allowed values: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, **UninstallAndroidCertificate**.
try {
    val result : ListExternalTerminalActionsResponse = apiInstance.getCompaniesCompanyIdTerminalActions(companyId, pageNumber, pageSize, status, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdTerminalActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdTerminalActions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional]
 **status** | **kotlin.String**| Returns terminal actions with the specified status.  Allowed values: **pending**, **successful**, **failed**, **cancelled**, **tryLater**. | [optional]
 **type** | **kotlin.String**| Returns terminal actions of the specified type.  Allowed values: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, **UninstallAndroidCertificate**. | [optional]

### Return type

[**ListExternalTerminalActionsResponse**](ListExternalTerminalActionsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""
Configure BasicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompaniesCompanyIdTerminalActionsActionId"></a>
# **getCompaniesCompanyIdTerminalActionsActionId**
> ExternalTerminalAction getCompaniesCompanyIdTerminalActionsActionId(companyId, actionId)

Get terminal action

Returns the details of the [terminal action](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) identified in the path. To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalActionsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val actionId : kotlin.String = actionId_example // kotlin.String | The unique identifier of the terminal action.
try {
    val result : ExternalTerminalAction = apiInstance.getCompaniesCompanyIdTerminalActionsActionId(companyId, actionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdTerminalActionsActionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdTerminalActionsActionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **actionId** | **kotlin.String**| The unique identifier of the terminal action. |

### Return type

[**ExternalTerminalAction**](ExternalTerminalAction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""
Configure BasicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

