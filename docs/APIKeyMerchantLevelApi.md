# APIKeyMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey**](APIKeyMerchantLevelApi.md#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateApiKey | Generate new API key


<a name="postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey"></a>
# **postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey**
> GenerateApiKeyResponse postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey(merchantId, apiCredentialId)

Generate new API key

Returns a new API key for the API credential. You can use the new API key a few minutes after generating it. The old API key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APIKeyMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
try {
    val result : GenerateApiKeyResponse = apiInstance.postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey(merchantId, apiCredentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APIKeyMerchantLevelApi#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeyMerchantLevelApi#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |

### Return type

[**GenerateApiKeyResponse**](GenerateApiKeyResponse.md)

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

