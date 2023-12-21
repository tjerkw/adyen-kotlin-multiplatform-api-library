# APICredentialsMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdApiCredentials**](APICredentialsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentials) | **GET** /merchants/{merchantId}/apiCredentials | Get a list of API credentials
[**getMerchantsMerchantIdApiCredentialsApiCredentialId**](APICredentialsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentialsApiCredentialId) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId} | Get an API credential
[**patchMerchantsMerchantIdApiCredentialsApiCredentialId**](APICredentialsMerchantLevelApi.md#patchMerchantsMerchantIdApiCredentialsApiCredentialId) | **PATCH** /merchants/{merchantId}/apiCredentials/{apiCredentialId} | Update an API credential
[**postMerchantsMerchantIdApiCredentials**](APICredentialsMerchantLevelApi.md#postMerchantsMerchantIdApiCredentials) | **POST** /merchants/{merchantId}/apiCredentials | Create an API credential


<a name="getMerchantsMerchantIdApiCredentials"></a>
# **getMerchantsMerchantIdApiCredentials**
> ListMerchantApiCredentialsResponse getMerchantsMerchantIdApiCredentials(merchantId, pageNumber, pageSize)

Get a list of API credentials

Returns the list of [API credentials](https://docs.adyen.com/development-resources/api-credentials) for the merchant account. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListMerchantApiCredentialsResponse = apiInstance.getMerchantsMerchantIdApiCredentials(merchantId, pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsMerchantLevelApi#getMerchantsMerchantIdApiCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsMerchantLevelApi#getMerchantsMerchantIdApiCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]

### Return type

[**ListMerchantApiCredentialsResponse**](ListMerchantApiCredentialsResponse.md)

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

<a name="getMerchantsMerchantIdApiCredentialsApiCredentialId"></a>
# **getMerchantsMerchantIdApiCredentialsApiCredentialId**
> ApiCredential getMerchantsMerchantIdApiCredentialsApiCredentialId(merchantId, apiCredentialId)

Get an API credential

Returns the [API credential](https://docs.adyen.com/development-resources/api-credentials) identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
try {
    val result : ApiCredential = apiInstance.getMerchantsMerchantIdApiCredentialsApiCredentialId(merchantId, apiCredentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsMerchantLevelApi#getMerchantsMerchantIdApiCredentialsApiCredentialId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsMerchantLevelApi#getMerchantsMerchantIdApiCredentialsApiCredentialId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |

### Return type

[**ApiCredential**](ApiCredential.md)

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

<a name="patchMerchantsMerchantIdApiCredentialsApiCredentialId"></a>
# **patchMerchantsMerchantIdApiCredentialsApiCredentialId**
> ApiCredential patchMerchantsMerchantIdApiCredentialsApiCredentialId(merchantId, apiCredentialId, updateMerchantApiCredentialRequest)

Update an API credential

Changes the API credential&#39;s roles, or allowed origins. The request has the new values for the fields you want to change. The response contains the full updated API credential, including the new values from the request.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val updateMerchantApiCredentialRequest : UpdateMerchantApiCredentialRequest =  // UpdateMerchantApiCredentialRequest | 
try {
    val result : ApiCredential = apiInstance.patchMerchantsMerchantIdApiCredentialsApiCredentialId(merchantId, apiCredentialId, updateMerchantApiCredentialRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsMerchantLevelApi#patchMerchantsMerchantIdApiCredentialsApiCredentialId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsMerchantLevelApi#patchMerchantsMerchantIdApiCredentialsApiCredentialId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |
 **updateMerchantApiCredentialRequest** | [**UpdateMerchantApiCredentialRequest**](UpdateMerchantApiCredentialRequest.md)|  | [optional]

### Return type

[**ApiCredential**](ApiCredential.md)

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

<a name="postMerchantsMerchantIdApiCredentials"></a>
# **postMerchantsMerchantIdApiCredentials**
> CreateApiCredentialResponse postMerchantsMerchantIdApiCredentials(merchantId, createMerchantApiCredentialRequest)

Create an API credential

Creates an [API credential](https://docs.adyen.com/development-resources/api-credentials) for the company account identified in the path. In the request, you can specify the roles and allowed origins for the new API credential.  The response includes the: * [API key](https://docs.adyen.com/development-resources/api-authentication#api-key-authentication): used for API request authentication. * [Client key](https://docs.adyen.com/development-resources/client-side-authentication#how-it-works): public key used for client-side authentication. * [Username and password](https://docs.adyen.com/development-resources/api-authentication#using-basic-authentication): used for basic authentication.  &gt; Make sure you store the API key securely in your system. You won&#39;t be able to retrieve it later.  If your API key is lost or compromised, you need to [generate a new API key](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateApiKey).  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val createMerchantApiCredentialRequest : CreateMerchantApiCredentialRequest =  // CreateMerchantApiCredentialRequest | 
try {
    val result : CreateApiCredentialResponse = apiInstance.postMerchantsMerchantIdApiCredentials(merchantId, createMerchantApiCredentialRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsMerchantLevelApi#postMerchantsMerchantIdApiCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsMerchantLevelApi#postMerchantsMerchantIdApiCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **createMerchantApiCredentialRequest** | [**CreateMerchantApiCredentialRequest**](CreateMerchantApiCredentialRequest.md)|  | [optional]

### Return type

[**CreateApiCredentialResponse**](CreateApiCredentialResponse.md)

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

