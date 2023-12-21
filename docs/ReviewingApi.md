# ReviewingApi

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payout/v68*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postConfirmThirdParty**](ReviewingApi.md#postConfirmThirdParty) | **POST** /confirmThirdParty | Confirm a payout
[**postDeclineThirdParty**](ReviewingApi.md#postDeclineThirdParty) | **POST** /declineThirdParty | Cancel a payout


<a name="postConfirmThirdParty"></a>
# **postConfirmThirdParty**
> ModifyResponse postConfirmThirdParty(modifyRequest)

Confirm a payout

Confirms a previously submitted payout.  To cancel a payout, use the &#x60;/declineThirdParty&#x60; endpoint.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payout.*

val apiInstance = ReviewingApi()
val modifyRequest : ModifyRequest =  // ModifyRequest | 
try {
    val result : ModifyResponse = apiInstance.postConfirmThirdParty(modifyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewingApi#postConfirmThirdParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewingApi#postConfirmThirdParty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyRequest** | [**ModifyRequest**](ModifyRequest.md)|  | [optional]

### Return type

[**ModifyResponse**](ModifyResponse.md)

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

<a name="postDeclineThirdParty"></a>
# **postDeclineThirdParty**
> ModifyResponse postDeclineThirdParty(modifyRequest)

Cancel a payout

Cancels a previously submitted payout.  To confirm and send a payout, use the &#x60;/confirmThirdParty&#x60; endpoint.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payout.*

val apiInstance = ReviewingApi()
val modifyRequest : ModifyRequest =  // ModifyRequest | 
try {
    val result : ModifyResponse = apiInstance.postDeclineThirdParty(modifyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewingApi#postDeclineThirdParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewingApi#postDeclineThirdParty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyRequest** | [**ModifyRequest**](ModifyRequest.md)|  | [optional]

### Return type

[**ModifyResponse**](ModifyResponse.md)

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

