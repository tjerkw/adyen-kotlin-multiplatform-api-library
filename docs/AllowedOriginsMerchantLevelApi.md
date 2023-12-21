# AllowedOriginsMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](AllowedOriginsMerchantLevelApi.md#deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **DELETE** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Delete an allowed origin
[**getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**](AllowedOriginsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins | Get a list of allowed origins
[**getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](AllowedOriginsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Get an allowed origin
[**postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**](AllowedOriginsMerchantLevelApi.md#postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins | Create an allowed origin


<a name="deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId"></a>
# **deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**
> deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(merchantId, apiCredentialId, originId)

Delete an allowed origin

Removes the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) identified in the path. As soon as an allowed origin is removed, we no longer accept client-side requests from that domain.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val originId : kotlin.String = originId_example // kotlin.String | Unique identifier of the allowed origin.
try {
    apiInstance.deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(merchantId, apiCredentialId, originId)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsMerchantLevelApi#deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsMerchantLevelApi#deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |
 **originId** | **kotlin.String**| Unique identifier of the allowed origin. |

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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins"></a>
# **getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**
> AllowedOriginsResponse getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins(merchantId, apiCredentialId)

Get a list of allowed origins

Returns the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the API credential identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
try {
    val result : AllowedOriginsResponse = apiInstance.getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins(merchantId, apiCredentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsMerchantLevelApi#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsMerchantLevelApi#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |

### Return type

[**AllowedOriginsResponse**](AllowedOriginsResponse.md)

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

<a name="getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId"></a>
# **getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**
> AllowedOrigin getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(merchantId, apiCredentialId, originId)

Get an allowed origin

Returns the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val originId : kotlin.String = originId_example // kotlin.String | Unique identifier of the allowed origin.
try {
    val result : AllowedOrigin = apiInstance.getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(merchantId, apiCredentialId, originId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsMerchantLevelApi#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsMerchantLevelApi#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |
 **originId** | **kotlin.String**| Unique identifier of the allowed origin. |

### Return type

[**AllowedOrigin**](AllowedOrigin.md)

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

<a name="postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins"></a>
# **postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**
> AllowedOriginsResponse postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins(merchantId, apiCredentialId, allowedOrigin)

Create an allowed origin

Adds a new [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) to the API credential&#39;s list of allowed origins.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val allowedOrigin : AllowedOrigin =  // AllowedOrigin | 
try {
    val result : AllowedOriginsResponse = apiInstance.postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins(merchantId, apiCredentialId, allowedOrigin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsMerchantLevelApi#postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsMerchantLevelApi#postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |
 **allowedOrigin** | [**AllowedOrigin**](AllowedOrigin.md)|  | [optional]

### Return type

[**AllowedOriginsResponse**](AllowedOriginsResponse.md)

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

