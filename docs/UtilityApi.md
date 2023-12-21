# UtilityApi

All URIs are relative to *https://checkout-test.adyen.com/v71*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postApplePaySessions**](UtilityApi.md#postApplePaySessions) | **POST** /applePay/sessions | Get an Apple Pay session
[**postOriginKeys**](UtilityApi.md#postOriginKeys) | **POST** /originKeys | Create originKey values for domains


<a name="postApplePaySessions"></a>
# **postApplePaySessions**
> ApplePaySessionResponse postApplePaySessions(idempotencyKey, applePaySessionRequest)

Get an Apple Pay session

You need to use this endpoint if you have an API-only integration with Apple Pay which uses Adyen&#39;s Apple Pay certificate.  The endpoint returns the Apple Pay session data which you need to complete the [Apple Pay session validation](https://docs.adyen.com/payment-methods/apple-pay/api-only?tab&#x3D;adyen-certificate-validation_1#complete-apple-pay-session-validation).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = UtilityApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val applePaySessionRequest : ApplePaySessionRequest =  // ApplePaySessionRequest | 
try {
    val result : ApplePaySessionResponse = apiInstance.postApplePaySessions(idempotencyKey, applePaySessionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilityApi#postApplePaySessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilityApi#postApplePaySessions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **applePaySessionRequest** | [**ApplePaySessionRequest**](ApplePaySessionRequest.md)|  | [optional]

### Return type

[**ApplePaySessionResponse**](ApplePaySessionResponse.md)

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

<a name="postOriginKeys"></a>
# **postOriginKeys**
> UtilityResponse postOriginKeys(idempotencyKey, utilityRequest)

Create originKey values for domains

This operation takes the origin domains and returns a JSON object containing the corresponding origin keys for the domains.  &gt; If you&#39;re still using origin key for your Web Drop-in or Components integration, we recommend [switching to client key](https://docs.adyen.com/development-resources/client-side-authentication/migrate-from-origin-key-to-client-key). This allows you to use a single key for all origins, add or remove origins without generating a new key, and detect the card type from the number entered in your payment form. 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = UtilityApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val utilityRequest : UtilityRequest =  // UtilityRequest | 
try {
    val result : UtilityResponse = apiInstance.postOriginKeys(idempotencyKey, utilityRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilityApi#postOriginKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilityApi#postOriginKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **utilityRequest** | [**UtilityRequest**](UtilityRequest.md)|  | [optional]

### Return type

[**UtilityResponse**](UtilityResponse.md)

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

