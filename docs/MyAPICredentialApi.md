# MyAPICredentialApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMeAllowedOriginsOriginId**](MyAPICredentialApi.md#deleteMeAllowedOriginsOriginId) | **DELETE** /me/allowedOrigins/{originId} | Remove allowed origin
[**getMe**](MyAPICredentialApi.md#getMe) | **GET** /me | Get API credential details
[**getMeAllowedOrigins**](MyAPICredentialApi.md#getMeAllowedOrigins) | **GET** /me/allowedOrigins | Get allowed origins
[**getMeAllowedOriginsOriginId**](MyAPICredentialApi.md#getMeAllowedOriginsOriginId) | **GET** /me/allowedOrigins/{originId} | Get allowed origin details
[**postMeAllowedOrigins**](MyAPICredentialApi.md#postMeAllowedOrigins) | **POST** /me/allowedOrigins | Add allowed origin
[**postMeGenerateClientKey**](MyAPICredentialApi.md#postMeGenerateClientKey) | **POST** /me/generateClientKey | Generate a client key


<a name="deleteMeAllowedOriginsOriginId"></a>
# **deleteMeAllowedOriginsOriginId**
> deleteMeAllowedOriginsOriginId(originId)

Remove allowed origin

Removes the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) specified in the path. The API key from the request is used to identify the [API credential](https://docs.adyen.com/development-resources/api-credentials).  You can make this request with any of the Management API roles.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = MyAPICredentialApi()
val originId : kotlin.String = originId_example // kotlin.String | Unique identifier of the allowed origin.
try {
    apiInstance.deleteMeAllowedOriginsOriginId(originId)
} catch (e: ClientException) {
    println("4xx response calling MyAPICredentialApi#deleteMeAllowedOriginsOriginId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyAPICredentialApi#deleteMeAllowedOriginsOriginId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="getMe"></a>
# **getMe**
> MeApiCredential getMe()

Get API credential details

Returns your [API credential](https://docs.adyen.com/development-resources/api-credentials) details based on the API Key you used in the request.  You can make this request with any of the Management API roles.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = MyAPICredentialApi()
try {
    val result : MeApiCredential = apiInstance.getMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyAPICredentialApi#getMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyAPICredentialApi#getMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MeApiCredential**](MeApiCredential.md)

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

<a name="getMeAllowedOrigins"></a>
# **getMeAllowedOrigins**
> AllowedOriginsResponse getMeAllowedOrigins()

Get allowed origins

Returns the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) of your [API credential](https://docs.adyen.com/development-resources/api-credentials) based on the API key you used in the request.  You can make this request with any of the Management API roles.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = MyAPICredentialApi()
try {
    val result : AllowedOriginsResponse = apiInstance.getMeAllowedOrigins()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyAPICredentialApi#getMeAllowedOrigins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyAPICredentialApi#getMeAllowedOrigins")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

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

<a name="getMeAllowedOriginsOriginId"></a>
# **getMeAllowedOriginsOriginId**
> AllowedOrigin getMeAllowedOriginsOriginId(originId)

Get allowed origin details

Returns the details of the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) specified in the path. The API key from the request is used to identify the [API credential](https://docs.adyen.com/development-resources/api-credentials).  You can make this request with any of the Management API roles.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = MyAPICredentialApi()
val originId : kotlin.String = originId_example // kotlin.String | Unique identifier of the allowed origin.
try {
    val result : AllowedOrigin = apiInstance.getMeAllowedOriginsOriginId(originId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyAPICredentialApi#getMeAllowedOriginsOriginId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyAPICredentialApi#getMeAllowedOriginsOriginId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="postMeAllowedOrigins"></a>
# **postMeAllowedOrigins**
> AllowedOrigin postMeAllowedOrigins(createAllowedOriginRequest)

Add allowed origin

Adds an allowed origin to the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) of your API credential. The API key from the request is used to identify the [API credential](https://docs.adyen.com/development-resources/api-credentials).  You can make this request with any of the Management API roles.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = MyAPICredentialApi()
val createAllowedOriginRequest : CreateAllowedOriginRequest =  // CreateAllowedOriginRequest | 
try {
    val result : AllowedOrigin = apiInstance.postMeAllowedOrigins(createAllowedOriginRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyAPICredentialApi#postMeAllowedOrigins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyAPICredentialApi#postMeAllowedOrigins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAllowedOriginRequest** | [**CreateAllowedOriginRequest**](CreateAllowedOriginRequest.md)|  | [optional]

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMeGenerateClientKey"></a>
# **postMeGenerateClientKey**
> GenerateClientKeyResponse postMeGenerateClientKey()

Generate a client key

Generates a new [client key](https://docs.adyen.com/development-resources/client-side-authentication/) used to authenticate requests from your payment environment. You can use the new client key a few minutes after generating it. The old client key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = MyAPICredentialApi()
try {
    val result : GenerateClientKeyResponse = apiInstance.postMeGenerateClientKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyAPICredentialApi#postMeGenerateClientKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyAPICredentialApi#postMeGenerateClientKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GenerateClientKeyResponse**](GenerateClientKeyResponse.md)

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

