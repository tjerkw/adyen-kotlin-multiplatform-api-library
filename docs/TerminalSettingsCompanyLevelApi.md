# TerminalSettingsCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompaniesCompanyIdTerminalLogos**](TerminalSettingsCompanyLevelApi.md#getCompaniesCompanyIdTerminalLogos) | **GET** /companies/{companyId}/terminalLogos | Get the terminal logo
[**getCompaniesCompanyIdTerminalSettings**](TerminalSettingsCompanyLevelApi.md#getCompaniesCompanyIdTerminalSettings) | **GET** /companies/{companyId}/terminalSettings | Get terminal settings
[**patchCompaniesCompanyIdTerminalLogos**](TerminalSettingsCompanyLevelApi.md#patchCompaniesCompanyIdTerminalLogos) | **PATCH** /companies/{companyId}/terminalLogos | Update the terminal logo
[**patchCompaniesCompanyIdTerminalSettings**](TerminalSettingsCompanyLevelApi.md#patchCompaniesCompanyIdTerminalSettings) | **PATCH** /companies/{companyId}/terminalSettings | Update terminal settings


<a name="getCompaniesCompanyIdTerminalLogos"></a>
# **getCompaniesCompanyIdTerminalLogos**
> Logo getCompaniesCompanyIdTerminalLogos(companyId, model)

Get the terminal logo

Returns the logo that is configured for a specific payment terminal model at the company identified in the path.   The logo is returned as a Base64-encoded string. You need to Base64-decode the string to get the actual image file.  This logo applies to all terminals of the specified model under the company, unless a different logo is configured at a lower level (merchant account, store, or individual terminal).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
try {
    val result : Logo = apiInstance.getCompaniesCompanyIdTerminalLogos(companyId, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsCompanyLevelApi#getCompaniesCompanyIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsCompanyLevelApi#getCompaniesCompanyIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **model** | **kotlin.String**| The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T. |

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

<a name="getCompaniesCompanyIdTerminalSettings"></a>
# **getCompaniesCompanyIdTerminalSettings**
> TerminalSettings getCompaniesCompanyIdTerminalSettings(companyId)

Get terminal settings

Returns the payment terminal settings that are configured for the company identified in the path. These settings apply to all terminals under the company, unless different values are configured at a lower level (merchant account, store, or individual terminal).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
try {
    val result : TerminalSettings = apiInstance.getCompaniesCompanyIdTerminalSettings(companyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsCompanyLevelApi#getCompaniesCompanyIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsCompanyLevelApi#getCompaniesCompanyIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |

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

<a name="patchCompaniesCompanyIdTerminalLogos"></a>
# **patchCompaniesCompanyIdTerminalLogos**
> Logo patchCompaniesCompanyIdTerminalLogos(companyId, model, logo)

Update the terminal logo

Updates the logo that is configured for a specific payment terminal model at the company identified in the path. You can update the logo for only one terminal model at a time. This logo applies to all terminals of the specified model under the company, unless a different logo is configured at a lower level (merchant account, store, or individual terminal).  * To change the logo, specify the image file as a Base64-encoded string. * To restore the logo inherited from the Adyen PSP level, specify an empty logo value.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
val logo : Logo =  // Logo | 
try {
    val result : Logo = apiInstance.patchCompaniesCompanyIdTerminalLogos(companyId, model, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsCompanyLevelApi#patchCompaniesCompanyIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsCompanyLevelApi#patchCompaniesCompanyIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **model** | **kotlin.String**| The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T. |
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

<a name="patchCompaniesCompanyIdTerminalSettings"></a>
# **patchCompaniesCompanyIdTerminalSettings**
> TerminalSettings patchCompaniesCompanyIdTerminalSettings(companyId, terminalSettings)

Update terminal settings

Updates payment terminal settings for the company identified in the path. These settings apply to all terminals under the company, unless different values are configured at a lower level (merchant account, store, or individual terminal).  * To change a parameter value, include the full object that contains the parameter, even if you don&#39;t want to change all parameters in the object. * To restore a parameter value inherited from the Adyen PSP level, include the full object that contains the parameter, and specify an empty value for the parameter or omit the parameter. * Objects that are not included in the request are not updated.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val terminalSettings : TerminalSettings =  // TerminalSettings | 
try {
    val result : TerminalSettings = apiInstance.patchCompaniesCompanyIdTerminalSettings(companyId, terminalSettings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsCompanyLevelApi#patchCompaniesCompanyIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsCompanyLevelApi#patchCompaniesCompanyIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

