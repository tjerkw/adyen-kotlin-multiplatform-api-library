# ClientKeyMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey**](ClientKeyMerchantLevelApi.md#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateClientKey | Generate new client key


<a name="postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey"></a>
# **postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey**
> GenerateClientKeyResponse postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey(merchantId, apiCredentialId)

Generate new client key

Returns a new [client key](https://docs.adyen.com/development-resources/client-side-authentication#how-it-works) for the API credential identified in the path. You can use the new client key a few minutes after generating it. The old client key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = ClientKeyMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
try {
    val result : GenerateClientKeyResponse = apiInstance.postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey(merchantId, apiCredentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientKeyMerchantLevelApi#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientKeyMerchantLevelApi#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |

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

