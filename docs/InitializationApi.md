# InitializationApi

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payout/v68*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postStoreDetail**](InitializationApi.md#postStoreDetail) | **POST** /storeDetail | Store payout details
[**postStoreDetailAndSubmitThirdParty**](InitializationApi.md#postStoreDetailAndSubmitThirdParty) | **POST** /storeDetailAndSubmitThirdParty | Store details and submit a payout
[**postSubmitThirdParty**](InitializationApi.md#postSubmitThirdParty) | **POST** /submitThirdParty | Submit a payout


<a name="postStoreDetail"></a>
# **postStoreDetail**
> StoreDetailResponse postStoreDetail(storeDetailRequest)

Store payout details

Stores payment details under the &#x60;PAYOUT&#x60; recurring contract. These payment details can be used later to submit a payout via the &#x60;/submitThirdParty&#x60; call.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payout.*

val apiInstance = InitializationApi()
val storeDetailRequest : StoreDetailRequest =  // StoreDetailRequest | 
try {
    val result : StoreDetailResponse = apiInstance.postStoreDetail(storeDetailRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitializationApi#postStoreDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitializationApi#postStoreDetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeDetailRequest** | [**StoreDetailRequest**](StoreDetailRequest.md)|  | [optional]

### Return type

[**StoreDetailResponse**](StoreDetailResponse.md)

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

<a name="postStoreDetailAndSubmitThirdParty"></a>
# **postStoreDetailAndSubmitThirdParty**
> StoreDetailAndSubmitResponse postStoreDetailAndSubmitThirdParty(storeDetailAndSubmitRequest)

Store details and submit a payout

Submits a payout and stores its details for subsequent payouts.  The submitted payout must be confirmed or declined either by a reviewer or via &#x60;/confirmThirdParty&#x60; or &#x60;/declineThirdParty&#x60; calls.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payout.*

val apiInstance = InitializationApi()
val storeDetailAndSubmitRequest : StoreDetailAndSubmitRequest =  // StoreDetailAndSubmitRequest | 
try {
    val result : StoreDetailAndSubmitResponse = apiInstance.postStoreDetailAndSubmitThirdParty(storeDetailAndSubmitRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitializationApi#postStoreDetailAndSubmitThirdParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitializationApi#postStoreDetailAndSubmitThirdParty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeDetailAndSubmitRequest** | [**StoreDetailAndSubmitRequest**](StoreDetailAndSubmitRequest.md)|  | [optional]

### Return type

[**StoreDetailAndSubmitResponse**](StoreDetailAndSubmitResponse.md)

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

<a name="postSubmitThirdParty"></a>
# **postSubmitThirdParty**
> SubmitResponse postSubmitThirdParty(submitRequest)

Submit a payout

Submits a payout using the previously stored payment details. To store payment details, use the &#x60;/storeDetail&#x60; API call.  The submitted payout must be confirmed or declined either by a reviewer or via &#x60;/confirmThirdParty&#x60; or &#x60;/declineThirdParty&#x60; calls.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payout.*

val apiInstance = InitializationApi()
val submitRequest : SubmitRequest =  // SubmitRequest | 
try {
    val result : SubmitResponse = apiInstance.postSubmitThirdParty(submitRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitializationApi#postSubmitThirdParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitializationApi#postSubmitThirdParty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitRequest** | [**SubmitRequest**](SubmitRequest.md)|  | [optional]

### Return type

[**SubmitResponse**](SubmitResponse.md)

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

