# TerminalSettingsTerminalLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTerminalsTerminalIdTerminalLogos**](TerminalSettingsTerminalLevelApi.md#getTerminalsTerminalIdTerminalLogos) | **GET** /terminals/{terminalId}/terminalLogos | Get the terminal logo
[**getTerminalsTerminalIdTerminalSettings**](TerminalSettingsTerminalLevelApi.md#getTerminalsTerminalIdTerminalSettings) | **GET** /terminals/{terminalId}/terminalSettings | Get terminal settings
[**patchTerminalsTerminalIdTerminalLogos**](TerminalSettingsTerminalLevelApi.md#patchTerminalsTerminalIdTerminalLogos) | **PATCH** /terminals/{terminalId}/terminalLogos | Update the logo
[**patchTerminalsTerminalIdTerminalSettings**](TerminalSettingsTerminalLevelApi.md#patchTerminalsTerminalIdTerminalSettings) | **PATCH** /terminals/{terminalId}/terminalSettings | Update terminal settings


<a name="getTerminalsTerminalIdTerminalLogos"></a>
# **getTerminalsTerminalIdTerminalLogos**
> Logo getTerminalsTerminalIdTerminalLogos(terminalId)

Get the terminal logo

Returns the logo that is configured for the payment terminal identified in the path. The logo is returned as a Base64-encoded string. You need to Base64-decode the string to get the actual image file.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsTerminalLevelApi()
val terminalId : kotlin.String = terminalId_example // kotlin.String | The unique identifier of the payment terminal.
try {
    val result : Logo = apiInstance.getTerminalsTerminalIdTerminalLogos(terminalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsTerminalLevelApi#getTerminalsTerminalIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsTerminalLevelApi#getTerminalsTerminalIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminalId** | **kotlin.String**| The unique identifier of the payment terminal. |

### Return type

[**Logo**](Logo.md)

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

<a name="getTerminalsTerminalIdTerminalSettings"></a>
# **getTerminalsTerminalIdTerminalSettings**
> TerminalSettings getTerminalsTerminalIdTerminalSettings(terminalId)

Get terminal settings

Returns the settings that are configured for the payment terminal identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsTerminalLevelApi()
val terminalId : kotlin.String = terminalId_example // kotlin.String | The unique identifier of the payment terminal.
try {
    val result : TerminalSettings = apiInstance.getTerminalsTerminalIdTerminalSettings(terminalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsTerminalLevelApi#getTerminalsTerminalIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsTerminalLevelApi#getTerminalsTerminalIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminalId** | **kotlin.String**| The unique identifier of the payment terminal. |

### Return type

[**TerminalSettings**](TerminalSettings.md)

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

<a name="patchTerminalsTerminalIdTerminalLogos"></a>
# **patchTerminalsTerminalIdTerminalLogos**
> Logo patchTerminalsTerminalIdTerminalLogos(terminalId, logo)

Update the logo

Updates the logo for the payment terminal identified in the path.  * To change the logo, specify the image file as a Base64-encoded string. * To restore the logo inherited from a higher level (store, merchant account, or company account), specify an empty logo value.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsTerminalLevelApi()
val terminalId : kotlin.String = terminalId_example // kotlin.String | The unique identifier of the payment terminal.
val logo : Logo =  // Logo | 
try {
    val result : Logo = apiInstance.patchTerminalsTerminalIdTerminalLogos(terminalId, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsTerminalLevelApi#patchTerminalsTerminalIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsTerminalLevelApi#patchTerminalsTerminalIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminalId** | **kotlin.String**| The unique identifier of the payment terminal. |
 **logo** | [**Logo**](Logo.md)|  | [optional]

### Return type

[**Logo**](Logo.md)

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

<a name="patchTerminalsTerminalIdTerminalSettings"></a>
# **patchTerminalsTerminalIdTerminalSettings**
> TerminalSettings patchTerminalsTerminalIdTerminalSettings(terminalId, terminalSettings)

Update terminal settings

Updates the settings that are configured for the payment terminal identified in the path.  * To change a parameter value, include the full object that contains the parameter, even if you don&#39;t want to change all parameters in the object. * To restore a parameter value inherited from a higher level, include the full object that contains the parameter, and specify an empty value for the parameter or omit the parameter. * Objects that are not included in the request are not updated.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsTerminalLevelApi()
val terminalId : kotlin.String = terminalId_example // kotlin.String | The unique identifier of the payment terminal.
val terminalSettings : TerminalSettings =  // TerminalSettings | 
try {
    val result : TerminalSettings = apiInstance.patchTerminalsTerminalIdTerminalSettings(terminalId, terminalSettings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsTerminalLevelApi#patchTerminalsTerminalIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsTerminalLevelApi#patchTerminalsTerminalIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminalId** | **kotlin.String**| The unique identifier of the payment terminal. |
 **terminalSettings** | [**TerminalSettings**](TerminalSettings.md)|  | [optional]

### Return type

[**TerminalSettings**](TerminalSettings.md)

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

