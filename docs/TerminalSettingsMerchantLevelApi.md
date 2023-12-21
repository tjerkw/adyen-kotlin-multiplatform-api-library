# TerminalSettingsMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdTerminalLogos**](TerminalSettingsMerchantLevelApi.md#getMerchantsMerchantIdTerminalLogos) | **GET** /merchants/{merchantId}/terminalLogos | Get the terminal logo
[**getMerchantsMerchantIdTerminalSettings**](TerminalSettingsMerchantLevelApi.md#getMerchantsMerchantIdTerminalSettings) | **GET** /merchants/{merchantId}/terminalSettings | Get terminal settings
[**patchMerchantsMerchantIdTerminalLogos**](TerminalSettingsMerchantLevelApi.md#patchMerchantsMerchantIdTerminalLogos) | **PATCH** /merchants/{merchantId}/terminalLogos | Update the terminal logo
[**patchMerchantsMerchantIdTerminalSettings**](TerminalSettingsMerchantLevelApi.md#patchMerchantsMerchantIdTerminalSettings) | **PATCH** /merchants/{merchantId}/terminalSettings | Update terminal settings


<a name="getMerchantsMerchantIdTerminalLogos"></a>
# **getMerchantsMerchantIdTerminalLogos**
> Logo getMerchantsMerchantIdTerminalLogos(merchantId, model)

Get the terminal logo

Returns the logo that is configured for a specific payment terminal model at the merchant account identified in the path.  The logo is returned as a Base64-encoded string. You need to Base64-decode the string to get the actual image file.  This logo applies to all terminals of the specified model under the merchant account, unless a different logo is configured at a lower level (store or individual terminal).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
try {
    val result : Logo = apiInstance.getMerchantsMerchantIdTerminalLogos(merchantId, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsMerchantLevelApi#getMerchantsMerchantIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsMerchantLevelApi#getMerchantsMerchantIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
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

<a name="getMerchantsMerchantIdTerminalSettings"></a>
# **getMerchantsMerchantIdTerminalSettings**
> TerminalSettings getMerchantsMerchantIdTerminalSettings(merchantId)

Get terminal settings

Returns the payment terminal settings that are configured for the merchant account identified in the path. These settings apply to all terminals under the merchant account unless different values are configured at a lower level (store or individual terminal).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : TerminalSettings = apiInstance.getMerchantsMerchantIdTerminalSettings(merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsMerchantLevelApi#getMerchantsMerchantIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsMerchantLevelApi#getMerchantsMerchantIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |

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

<a name="patchMerchantsMerchantIdTerminalLogos"></a>
# **patchMerchantsMerchantIdTerminalLogos**
> Logo patchMerchantsMerchantIdTerminalLogos(merchantId, model, logo)

Update the terminal logo

Updates the logo for a specific payment terminal model at the merchant account identified in the path. You can update the logo for only one terminal model at a time.  This logo applies to all terminals of the specified model under the merchant account, unless a different logo is configured at a lower level (store or individual terminal).  * To change the logo, specify the image file as a Base64-encoded string. * To restore the logo inherited from the company account, specify an empty logo value.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Allowed values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
val logo : Logo =  // Logo | 
try {
    val result : Logo = apiInstance.patchMerchantsMerchantIdTerminalLogos(merchantId, model, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsMerchantLevelApi#patchMerchantsMerchantIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsMerchantLevelApi#patchMerchantsMerchantIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **model** | **kotlin.String**| The terminal model. Allowed values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T. |
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

<a name="patchMerchantsMerchantIdTerminalSettings"></a>
# **patchMerchantsMerchantIdTerminalSettings**
> TerminalSettings patchMerchantsMerchantIdTerminalSettings(merchantId, terminalSettings)

Update terminal settings

Updates payment terminal settings for the merchant account identified in the path. These settings apply to all terminals under the merchant account, unless different values are configured at a lower level (store or individual terminal).  * To change a parameter value, include the full object that contains the parameter, even if you don&#39;t want to change all parameters in the object. * To restore a parameter value inherited from a higher level, include the full object that contains the parameter, and specify an empty value for the parameter or omit the parameter. * Objects that are not included in the request are not updated.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val terminalSettings : TerminalSettings =  // TerminalSettings | 
try {
    val result : TerminalSettings = apiInstance.patchMerchantsMerchantIdTerminalSettings(merchantId, terminalSettings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsMerchantLevelApi#patchMerchantsMerchantIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsMerchantLevelApi#patchMerchantsMerchantIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
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

