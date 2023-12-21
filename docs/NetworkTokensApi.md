# NetworkTokensApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetworkTokensNetworkTokenId**](NetworkTokensApi.md#getNetworkTokensNetworkTokenId) | **GET** /networkTokens/{networkTokenId} | Get a network token
[**patchNetworkTokensNetworkTokenId**](NetworkTokensApi.md#patchNetworkTokensNetworkTokenId) | **PATCH** /networkTokens/{networkTokenId} | Update a network token


<a name="getNetworkTokensNetworkTokenId"></a>
# **getNetworkTokensNetworkTokenId**
> GetNetworkTokenResponse getNetworkTokensNetworkTokenId(networkTokenId)

Get a network token

Returns the details of a network token.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = NetworkTokensApi()
val networkTokenId : kotlin.String = networkTokenId_example // kotlin.String | The unique identifier of the network token.
try {
    val result : GetNetworkTokenResponse = apiInstance.getNetworkTokensNetworkTokenId(networkTokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkTokensApi#getNetworkTokensNetworkTokenId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkTokensApi#getNetworkTokensNetworkTokenId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkTokenId** | **kotlin.String**| The unique identifier of the network token. |

### Return type

[**GetNetworkTokenResponse**](GetNetworkTokenResponse.md)

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

<a name="patchNetworkTokensNetworkTokenId"></a>
# **patchNetworkTokensNetworkTokenId**
> patchNetworkTokensNetworkTokenId(networkTokenId, updateNetworkTokenRequest)

Update a network token

Updates the status of the network token.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = NetworkTokensApi()
val networkTokenId : kotlin.String = networkTokenId_example // kotlin.String | The unique identifier of the network token.
val updateNetworkTokenRequest : UpdateNetworkTokenRequest =  // UpdateNetworkTokenRequest | 
try {
    apiInstance.patchNetworkTokensNetworkTokenId(networkTokenId, updateNetworkTokenRequest)
} catch (e: ClientException) {
    println("4xx response calling NetworkTokensApi#patchNetworkTokensNetworkTokenId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkTokensApi#patchNetworkTokensNetworkTokenId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkTokenId** | **kotlin.String**| The unique identifier of the network token. |
 **updateNetworkTokenRequest** | [**UpdateNetworkTokenRequest**](UpdateNetworkTokenRequest.md)|  | [optional]

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

 - **Content-Type**: application/json
 - **Accept**: application/json

