# TerminalSettingsStoreLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdStoresReferenceTerminalLogos**](TerminalSettingsStoreLevelApi.md#getMerchantsMerchantIdStoresReferenceTerminalLogos) | **GET** /merchants/{merchantId}/stores/{reference}/terminalLogos | Get the terminal logo
[**getMerchantsMerchantIdStoresReferenceTerminalSettings**](TerminalSettingsStoreLevelApi.md#getMerchantsMerchantIdStoresReferenceTerminalSettings) | **GET** /merchants/{merchantId}/stores/{reference}/terminalSettings | Get terminal settings
[**getStoresStoreIdTerminalLogos**](TerminalSettingsStoreLevelApi.md#getStoresStoreIdTerminalLogos) | **GET** /stores/{storeId}/terminalLogos | Get the terminal logo
[**getStoresStoreIdTerminalSettings**](TerminalSettingsStoreLevelApi.md#getStoresStoreIdTerminalSettings) | **GET** /stores/{storeId}/terminalSettings | Get terminal settings
[**patchMerchantsMerchantIdStoresReferenceTerminalLogos**](TerminalSettingsStoreLevelApi.md#patchMerchantsMerchantIdStoresReferenceTerminalLogos) | **PATCH** /merchants/{merchantId}/stores/{reference}/terminalLogos | Update the terminal logo
[**patchMerchantsMerchantIdStoresReferenceTerminalSettings**](TerminalSettingsStoreLevelApi.md#patchMerchantsMerchantIdStoresReferenceTerminalSettings) | **PATCH** /merchants/{merchantId}/stores/{reference}/terminalSettings | Update terminal settings
[**patchStoresStoreIdTerminalLogos**](TerminalSettingsStoreLevelApi.md#patchStoresStoreIdTerminalLogos) | **PATCH** /stores/{storeId}/terminalLogos | Update the terminal logo
[**patchStoresStoreIdTerminalSettings**](TerminalSettingsStoreLevelApi.md#patchStoresStoreIdTerminalSettings) | **PATCH** /stores/{storeId}/terminalSettings | Update terminal settings


<a name="getMerchantsMerchantIdStoresReferenceTerminalLogos"></a>
# **getMerchantsMerchantIdStoresReferenceTerminalLogos**
> Logo getMerchantsMerchantIdStoresReferenceTerminalLogos(merchantId, reference, model)

Get the terminal logo

Returns the logo that is configured for a specific payment terminal model at the store identified in the path.  The logo is returned as a Base64-encoded string. You need to Base64-decode the string to get the actual image file.  This logo applies to all terminals of the specified model under the store, unless a different logo is configured for an individual terminal.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val reference : kotlin.String = reference_example // kotlin.String | The reference that identifies the store.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
try {
    val result : Logo = apiInstance.getMerchantsMerchantIdStoresReferenceTerminalLogos(merchantId, reference, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#getMerchantsMerchantIdStoresReferenceTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#getMerchantsMerchantIdStoresReferenceTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **reference** | **kotlin.String**| The reference that identifies the store. |
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

<a name="getMerchantsMerchantIdStoresReferenceTerminalSettings"></a>
# **getMerchantsMerchantIdStoresReferenceTerminalSettings**
> TerminalSettings getMerchantsMerchantIdStoresReferenceTerminalSettings(merchantId, reference)

Get terminal settings

Returns the payment terminal settings that are configured for the store identified in the path. These settings apply to all terminals under the store unless different values are configured for an individual terminal.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val reference : kotlin.String = reference_example // kotlin.String | The reference that identifies the store.
try {
    val result : TerminalSettings = apiInstance.getMerchantsMerchantIdStoresReferenceTerminalSettings(merchantId, reference)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#getMerchantsMerchantIdStoresReferenceTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#getMerchantsMerchantIdStoresReferenceTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **reference** | **kotlin.String**| The reference that identifies the store. |

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

<a name="getStoresStoreIdTerminalLogos"></a>
# **getStoresStoreIdTerminalLogos**
> Logo getStoresStoreIdTerminalLogos(storeId, model)

Get the terminal logo

Returns the logo that is configured for a specific payment terminal model at the store identified in the path.  The logo is returned as a Base64-encoded string. You need to Base64-decode the string to get the actual image file.  This logo applies to all terminals of that model under the store unless a different logo is configured for an individual terminal.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
try {
    val result : Logo = apiInstance.getStoresStoreIdTerminalLogos(storeId, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#getStoresStoreIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#getStoresStoreIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**| The unique identifier of the store. |
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

<a name="getStoresStoreIdTerminalSettings"></a>
# **getStoresStoreIdTerminalSettings**
> TerminalSettings getStoresStoreIdTerminalSettings(storeId)

Get terminal settings

Returns the payment terminal settings that are configured for the store identified in the path. These settings apply to all terminals under the store unless different values are configured for an individual terminal.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
try {
    val result : TerminalSettings = apiInstance.getStoresStoreIdTerminalSettings(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#getStoresStoreIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#getStoresStoreIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**| The unique identifier of the store. |

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

<a name="patchMerchantsMerchantIdStoresReferenceTerminalLogos"></a>
# **patchMerchantsMerchantIdStoresReferenceTerminalLogos**
> Logo patchMerchantsMerchantIdStoresReferenceTerminalLogos(merchantId, reference, model, logo)

Update the terminal logo

Updates the logo that is configured for a specific payment terminal model at the store identified in the path. You can update the logo for only one terminal model at a time. This logo applies to all terminals of the specified model under the store, unless a different logo is configured for an individual terminal.   * To change the logo, specify the image file as a Base64-encoded string. * To restore the logo inherited from a higher level (merchant or company account), specify an empty logo value.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val reference : kotlin.String = reference_example // kotlin.String | The reference that identifies the store.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T
val logo : Logo =  // Logo | 
try {
    val result : Logo = apiInstance.patchMerchantsMerchantIdStoresReferenceTerminalLogos(merchantId, reference, model, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#patchMerchantsMerchantIdStoresReferenceTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#patchMerchantsMerchantIdStoresReferenceTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **reference** | **kotlin.String**| The reference that identifies the store. |
 **model** | **kotlin.String**| The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T |
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

<a name="patchMerchantsMerchantIdStoresReferenceTerminalSettings"></a>
# **patchMerchantsMerchantIdStoresReferenceTerminalSettings**
> TerminalSettings patchMerchantsMerchantIdStoresReferenceTerminalSettings(merchantId, reference, terminalSettings)

Update terminal settings

Updates payment terminal settings for the store identified in the path. These settings apply to all terminals under the store, unless different values are configured for an individual terminal.  * To change a parameter value, include the full object that contains the parameter, even if you don&#39;t want to change all parameters in the object. * To restore a parameter value inherited from a higher level, include the full object that contains the parameter, and specify an empty value for the parameter or omit the parameter. * Objects that are not included in the request are not updated.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val reference : kotlin.String = reference_example // kotlin.String | The reference that identifies the store.
val terminalSettings : TerminalSettings =  // TerminalSettings | 
try {
    val result : TerminalSettings = apiInstance.patchMerchantsMerchantIdStoresReferenceTerminalSettings(merchantId, reference, terminalSettings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#patchMerchantsMerchantIdStoresReferenceTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#patchMerchantsMerchantIdStoresReferenceTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **reference** | **kotlin.String**| The reference that identifies the store. |
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

<a name="patchStoresStoreIdTerminalLogos"></a>
# **patchStoresStoreIdTerminalLogos**
> Logo patchStoresStoreIdTerminalLogos(storeId, model, logo)

Update the terminal logo

Updates the logo that is configured for a specific payment terminal model at the store identified in the path. You can update the logo for only one terminal model at a time. This logo applies to all terminals of the specified model under the store, unless a different logo is configured for an individual terminal.   * To change the logo, specify the image file as a Base64-encoded string. * To restore the logo inherited from a higher level (merchant or company account), specify an empty logo value.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
val model : kotlin.String = model_example // kotlin.String | The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T.
val logo : Logo =  // Logo | 
try {
    val result : Logo = apiInstance.patchStoresStoreIdTerminalLogos(storeId, model, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#patchStoresStoreIdTerminalLogos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#patchStoresStoreIdTerminalLogos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**| The unique identifier of the store. |
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

<a name="patchStoresStoreIdTerminalSettings"></a>
# **patchStoresStoreIdTerminalSettings**
> TerminalSettings patchStoresStoreIdTerminalSettings(storeId, terminalSettings)

Update terminal settings

Updates payment terminal settings for the store identified in the path. These settings apply to all terminals under the store, unless different values are configured for an individual terminal.  * To change a parameter value, include the full object that contains the parameter, even if you don&#39;t want to change all parameters in the object. * To restore a parameter value inherited from a higher level, include the full object that contains the parameter, and specify an empty value for the parameter or omit the parameter. * Objects that are not included in the request are not updated.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal settings read and write  For [sensitive terminal settings](https://docs.adyen.com/point-of-sale/automating-terminal-management/configure-terminals-api#sensitive-terminal-settings), your API credential must have the following role: * Management API—Terminal settings Advanced read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalSettingsStoreLevelApi()
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
val terminalSettings : TerminalSettings =  // TerminalSettings | 
try {
    val result : TerminalSettings = apiInstance.patchStoresStoreIdTerminalSettings(storeId, terminalSettings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalSettingsStoreLevelApi#patchStoresStoreIdTerminalSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalSettingsStoreLevelApi#patchStoresStoreIdTerminalSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**| The unique identifier of the store. |
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

