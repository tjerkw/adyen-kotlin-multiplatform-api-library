# AllowedOriginsCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](AllowedOriginsCompanyLevelApi.md#deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **DELETE** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Delete an allowed origin
[**getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**](AllowedOriginsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins | Get a list of allowed origins
[**getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](AllowedOriginsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Get an allowed origin
[**postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**](AllowedOriginsCompanyLevelApi.md#postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins | Create an allowed origin


<a name="deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId"></a>
# **deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**
> deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(companyId, apiCredentialId, originId)

Delete an allowed origin

Removes the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) identified in the path. As soon as an allowed origin is removed, we no longer accept client-side requests from that domain.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val originId : kotlin.String = originId_example // kotlin.String | Unique identifier of the allowed origin.
try {
    apiInstance.deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(companyId, apiCredentialId, originId)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsCompanyLevelApi#deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsCompanyLevelApi#deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins"></a>
# **getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**
> AllowedOriginsResponse getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins(companyId, apiCredentialId)

Get a list of allowed origins

Returns the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the API credential identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
try {
    val result : AllowedOriginsResponse = apiInstance.getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins(companyId, apiCredentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsCompanyLevelApi#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsCompanyLevelApi#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId"></a>
# **getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**
> AllowedOrigin getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(companyId, apiCredentialId, originId)

Get an allowed origin

Returns the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val originId : kotlin.String = originId_example // kotlin.String | Unique identifier of the allowed origin.
try {
    val result : AllowedOrigin = apiInstance.getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(companyId, apiCredentialId, originId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsCompanyLevelApi#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsCompanyLevelApi#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins"></a>
# **postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**
> AllowedOriginsResponse postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins(companyId, apiCredentialId, allowedOrigin)

Create an allowed origin

Adds a new [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) to the API credential&#39;s list of allowed origins.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AllowedOriginsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val allowedOrigin : AllowedOrigin =  // AllowedOrigin | 
try {
    val result : AllowedOriginsResponse = apiInstance.postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins(companyId, apiCredentialId, allowedOrigin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllowedOriginsCompanyLevelApi#postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllowedOriginsCompanyLevelApi#postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

