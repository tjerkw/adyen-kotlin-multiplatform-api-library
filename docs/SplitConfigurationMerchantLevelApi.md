# SplitConfigurationMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](SplitConfigurationMerchantLevelApi.md#deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId) | **DELETE** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Delete a split configuration
[**deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId**](SplitConfigurationMerchantLevelApi.md#deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId) | **DELETE** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId}/rules/{ruleId} | Delete a split configuration rule
[**getMerchantsMerchantIdSplitConfigurations**](SplitConfigurationMerchantLevelApi.md#getMerchantsMerchantIdSplitConfigurations) | **GET** /merchants/{merchantId}/splitConfigurations | Get a list of split configurations
[**getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](SplitConfigurationMerchantLevelApi.md#getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId) | **GET** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Get a split configuration
[**patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](SplitConfigurationMerchantLevelApi.md#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId) | **PATCH** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Update split configuration description
[**patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId**](SplitConfigurationMerchantLevelApi.md#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId) | **PATCH** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId}/rules/{ruleId} | Update split conditions
[**patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId**](SplitConfigurationMerchantLevelApi.md#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId) | **PATCH** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId}/rules/{ruleId}/splitLogic/{splitLogicId} | Update the split logic
[**postMerchantsMerchantIdSplitConfigurations**](SplitConfigurationMerchantLevelApi.md#postMerchantsMerchantIdSplitConfigurations) | **POST** /merchants/{merchantId}/splitConfigurations | Create a split configuration
[**postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**](SplitConfigurationMerchantLevelApi.md#postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId) | **POST** /merchants/{merchantId}/splitConfigurations/{splitConfigurationId} | Create a rule


<a name="deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId"></a>
# **deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**
> SplitConfiguration deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId)

Delete a split configuration

Deletes the split configuration specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The unique identifier of the split configuration.
try {
    val result : SplitConfiguration = apiInstance.deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The unique identifier of the split configuration. |

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId"></a>
# **deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId**
> SplitConfiguration deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId(merchantId, splitConfigurationId, ruleId)

Delete a split configuration rule

Deletes the split configuration rule specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The unique identifier of the split configuration.
val ruleId : kotlin.String = ruleId_example // kotlin.String | 
try {
    val result : SplitConfiguration = apiInstance.deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId(merchantId, splitConfigurationId, ruleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#deleteMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The unique identifier of the split configuration. |
 **ruleId** | **kotlin.String**|  |

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="getMerchantsMerchantIdSplitConfigurations"></a>
# **getMerchantsMerchantIdSplitConfigurations**
> SplitConfigurationList getMerchantsMerchantIdSplitConfigurations(merchantId)

Get a list of split configurations

Returns the list of split configurations for the merchant account.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : SplitConfigurationList = apiInstance.getMerchantsMerchantIdSplitConfigurations(merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#getMerchantsMerchantIdSplitConfigurations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#getMerchantsMerchantIdSplitConfigurations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |

### Return type

[**SplitConfigurationList**](SplitConfigurationList.md)

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

<a name="getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId"></a>
# **getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**
> SplitConfiguration getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId)

Get a split configuration

Returns the split configuration specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The unique identifier of the split configuration.
try {
    val result : SplitConfiguration = apiInstance.getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#getMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The unique identifier of the split configuration. |

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId"></a>
# **patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**
> SplitConfiguration patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId, updateSplitConfigurationRequest)

Update split configuration description

Changes the description of the split configuration specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The unique identifier of the split configuration.
val updateSplitConfigurationRequest : UpdateSplitConfigurationRequest =  // UpdateSplitConfigurationRequest | 
try {
    val result : SplitConfiguration = apiInstance.patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId, updateSplitConfigurationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The unique identifier of the split configuration. |
 **updateSplitConfigurationRequest** | [**UpdateSplitConfigurationRequest**](UpdateSplitConfigurationRequest.md)|  | [optional]

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId"></a>
# **patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId**
> SplitConfiguration patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId(merchantId, splitConfigurationId, ruleId, updateSplitConfigurationRuleRequest)

Update split conditions

Changes the conditions of the split configuration rule specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The identifier of the split configuration.
val ruleId : kotlin.String = ruleId_example // kotlin.String | The unique identifier of the split configuration rule.
val updateSplitConfigurationRuleRequest : UpdateSplitConfigurationRuleRequest =  // UpdateSplitConfigurationRuleRequest | 
try {
    val result : SplitConfiguration = apiInstance.patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId(merchantId, splitConfigurationId, ruleId, updateSplitConfigurationRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The identifier of the split configuration. |
 **ruleId** | **kotlin.String**| The unique identifier of the split configuration rule. |
 **updateSplitConfigurationRuleRequest** | [**UpdateSplitConfigurationRuleRequest**](UpdateSplitConfigurationRuleRequest.md)|  | [optional]

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId"></a>
# **patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId**
> SplitConfiguration patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId(merchantId, splitConfigurationId, ruleId, splitLogicId, updateSplitConfigurationLogicRequest)

Update the split logic

Changes the split logic specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The unique identifier of the split configuration.
val ruleId : kotlin.String = ruleId_example // kotlin.String | The unique identifier of the split configuration rule.
val splitLogicId : kotlin.String = splitLogicId_example // kotlin.String | The unique identifier of the split configuration split.
val updateSplitConfigurationLogicRequest : UpdateSplitConfigurationLogicRequest =  // UpdateSplitConfigurationLogicRequest | 
try {
    val result : SplitConfiguration = apiInstance.patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId(merchantId, splitConfigurationId, ruleId, splitLogicId, updateSplitConfigurationLogicRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#patchMerchantsMerchantIdSplitConfigurationsSplitConfigurationIdRulesRuleIdSplitLogicSplitLogicId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The unique identifier of the split configuration. |
 **ruleId** | **kotlin.String**| The unique identifier of the split configuration rule. |
 **splitLogicId** | **kotlin.String**| The unique identifier of the split configuration split. |
 **updateSplitConfigurationLogicRequest** | [**UpdateSplitConfigurationLogicRequest**](UpdateSplitConfigurationLogicRequest.md)|  | [optional]

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="postMerchantsMerchantIdSplitConfigurations"></a>
# **postMerchantsMerchantIdSplitConfigurations**
> SplitConfiguration postMerchantsMerchantIdSplitConfigurations(merchantId, splitConfiguration)

Create a split configuration

Creates a split configuration for the merchant account specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfiguration : SplitConfiguration =  // SplitConfiguration | 
try {
    val result : SplitConfiguration = apiInstance.postMerchantsMerchantIdSplitConfigurations(merchantId, splitConfiguration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#postMerchantsMerchantIdSplitConfigurations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#postMerchantsMerchantIdSplitConfigurations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfiguration** | [**SplitConfiguration**](SplitConfiguration.md)|  | [optional]

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

<a name="postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId"></a>
# **postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId**
> SplitConfiguration postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId, splitConfigurationRule)

Create a rule

Creates a rule in the split configuration specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API - SplitConfiguration read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = SplitConfigurationMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val splitConfigurationId : kotlin.String = splitConfigurationId_example // kotlin.String | The unique identifier of the split configuration.
val splitConfigurationRule : SplitConfigurationRule =  // SplitConfigurationRule | 
try {
    val result : SplitConfiguration = apiInstance.postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId(merchantId, splitConfigurationId, splitConfigurationRule)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SplitConfigurationMerchantLevelApi#postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SplitConfigurationMerchantLevelApi#postMerchantsMerchantIdSplitConfigurationsSplitConfigurationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **splitConfigurationId** | **kotlin.String**| The unique identifier of the split configuration. |
 **splitConfigurationRule** | [**SplitConfigurationRule**](SplitConfigurationRule.md)|  | [optional]

### Return type

[**SplitConfiguration**](SplitConfiguration.md)

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

