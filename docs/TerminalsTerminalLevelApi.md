# TerminalsTerminalLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTerminals**](TerminalsTerminalLevelApi.md#getTerminals) | **GET** /terminals | Get a list of terminals
[**postTerminalsTerminalIdReassign**](TerminalsTerminalLevelApi.md#postTerminalsTerminalIdReassign) | **POST** /terminals/{terminalId}/reassign | Reassign a terminal


<a name="getTerminals"></a>
# **getTerminals**
> ListTerminalsResponse getTerminals(searchQuery, otpQuery, countries, merchantIds, storeIds, brandModels, pageNumber, pageSize)

Get a list of terminals

Returns the payment terminals that the API credential has access to and that match the query parameters.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API — Terminal actions read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalsTerminalLevelApi()
val searchQuery : kotlin.String = searchQuery_example // kotlin.String | Returns terminals with an ID that contains the specified string. If present, other query parameters are ignored.
val otpQuery : kotlin.String = otpQuery_example // kotlin.String | Returns one or more terminals associated with the one-time passwords specified in the request. If this query parameter is used, other query parameters are ignored.
val countries : kotlin.String = countries_example // kotlin.String | Returns terminals located in the countries specified by their [two-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
val merchantIds : kotlin.String = merchantIds_example // kotlin.String | Returns terminals that belong to the merchant accounts specified by their unique merchant account ID.
val storeIds : kotlin.String = storeIds_example // kotlin.String | Returns terminals that are assigned to the [stores](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores) specified by their unique store ID.
val brandModels : kotlin.String = brandModels_example // kotlin.String | Returns terminals of the [models](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) specified in the format *brand.model*.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 20 items on a page.
try {
    val result : ListTerminalsResponse = apiInstance.getTerminals(searchQuery, otpQuery, countries, merchantIds, storeIds, brandModels, pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalsTerminalLevelApi#getTerminals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalsTerminalLevelApi#getTerminals")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchQuery** | **kotlin.String**| Returns terminals with an ID that contains the specified string. If present, other query parameters are ignored. | [optional]
 **otpQuery** | **kotlin.String**| Returns one or more terminals associated with the one-time passwords specified in the request. If this query parameter is used, other query parameters are ignored. | [optional]
 **countries** | **kotlin.String**| Returns terminals located in the countries specified by their [two-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). | [optional]
 **merchantIds** | **kotlin.String**| Returns terminals that belong to the merchant accounts specified by their unique merchant account ID. | [optional]
 **storeIds** | **kotlin.String**| Returns terminals that are assigned to the [stores](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores) specified by their unique store ID. | [optional]
 **brandModels** | **kotlin.String**| Returns terminals of the [models](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) specified in the format *brand.model*. | [optional]
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional]

### Return type

[**ListTerminalsResponse**](ListTerminalsResponse.md)

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

<a name="postTerminalsTerminalIdReassign"></a>
# **postTerminalsTerminalIdReassign**
> postTerminalsTerminalIdReassign(terminalId, terminalReassignmentRequest)

Reassign a terminal

Reassigns a payment terminal to a company account, merchant account, merchant account inventory, or a store.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Assign Terminal

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalsTerminalLevelApi()
val terminalId : kotlin.String = terminalId_example // kotlin.String | The unique identifier of the payment terminal.
val terminalReassignmentRequest : TerminalReassignmentRequest =  // TerminalReassignmentRequest | 
try {
    apiInstance.postTerminalsTerminalIdReassign(terminalId, terminalReassignmentRequest)
} catch (e: ClientException) {
    println("4xx response calling TerminalsTerminalLevelApi#postTerminalsTerminalIdReassign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalsTerminalLevelApi#postTerminalsTerminalIdReassign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminalId** | **kotlin.String**| The unique identifier of the payment terminal. |
 **terminalReassignmentRequest** | [**TerminalReassignmentRequest**](TerminalReassignmentRequest.md)|  | [optional]

### Return type

null (empty response body)

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

