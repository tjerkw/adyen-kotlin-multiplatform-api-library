# PaymentsApi

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payment/v68*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAuthorise**](PaymentsApi.md#postAuthorise) | **POST** /authorise | Create an authorisation
[**postAuthorise3d**](PaymentsApi.md#postAuthorise3d) | **POST** /authorise3d | Complete a 3DS authorisation
[**postAuthorise3ds2**](PaymentsApi.md#postAuthorise3ds2) | **POST** /authorise3ds2 | Complete a 3DS2 authorisation
[**postGetAuthenticationResult**](PaymentsApi.md#postGetAuthenticationResult) | **POST** /getAuthenticationResult | Get the 3DS authentication result
[**postRetrieve3ds2Result**](PaymentsApi.md#postRetrieve3ds2Result) | **POST** /retrieve3ds2Result | Get the 3DS2 authentication result


<a name="postAuthorise"></a>
# **postAuthorise**
> PaymentResult postAuthorise(paymentRequest)

Create an authorisation

Creates a payment with a unique reference (&#x60;pspReference&#x60;) and attempts to obtain an authorisation hold. For cards, this amount can be captured or cancelled later. Non-card payment methods typically don&#39;t support this and will automatically capture as part of the authorisation. &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/payments) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = PaymentsApi()
val paymentRequest : PaymentRequest =  // PaymentRequest | 
try {
    val result : PaymentResult = apiInstance.postAuthorise(paymentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#postAuthorise")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#postAuthorise")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)|  | [optional]

### Return type

[**PaymentResult**](PaymentResult.md)

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

<a name="postAuthorise3d"></a>
# **postAuthorise3d**
> PaymentResult postAuthorise3d(paymentRequest3d)

Complete a 3DS authorisation

For an authenticated 3D Secure session, completes the payment authorisation. This endpoint must receive the &#x60;md&#x60; and &#x60;paResponse&#x60; parameters that you get from the card issuer after a shopper pays via 3D Secure.  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce/3d-secure). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments/details&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/payments/details) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = PaymentsApi()
val paymentRequest3d : PaymentRequest3d =  // PaymentRequest3d | 
try {
    val result : PaymentResult = apiInstance.postAuthorise3d(paymentRequest3d)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#postAuthorise3d")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#postAuthorise3d")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequest3d** | [**PaymentRequest3d**](PaymentRequest3d.md)|  | [optional]

### Return type

[**PaymentResult**](PaymentResult.md)

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

<a name="postAuthorise3ds2"></a>
# **postAuthorise3ds2**
> PaymentResult postAuthorise3ds2(paymentRequest3ds2)

Complete a 3DS2 authorisation

For an authenticated 3D Secure 2 session, completes the payment authorisation. This endpoint must receive the &#x60;threeDS2Token&#x60; and &#x60;threeDS2Result&#x60; parameters.  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce/3d-secure). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments/details&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/payments/details) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = PaymentsApi()
val paymentRequest3ds2 : PaymentRequest3ds2 =  // PaymentRequest3ds2 | 
try {
    val result : PaymentResult = apiInstance.postAuthorise3ds2(paymentRequest3ds2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#postAuthorise3ds2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#postAuthorise3ds2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequest3ds2** | [**PaymentRequest3ds2**](PaymentRequest3ds2.md)|  | [optional]

### Return type

[**PaymentResult**](PaymentResult.md)

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

<a name="postGetAuthenticationResult"></a>
# **postGetAuthenticationResult**
> AuthenticationResultResponse postGetAuthenticationResult(authenticationResultRequest)

Get the 3DS authentication result

Return the authentication result after doing a 3D Secure authentication only.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = PaymentsApi()
val authenticationResultRequest : AuthenticationResultRequest =  // AuthenticationResultRequest | 
try {
    val result : AuthenticationResultResponse = apiInstance.postGetAuthenticationResult(authenticationResultRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#postGetAuthenticationResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#postGetAuthenticationResult")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationResultRequest** | [**AuthenticationResultRequest**](AuthenticationResultRequest.md)|  | [optional]

### Return type

[**AuthenticationResultResponse**](AuthenticationResultResponse.md)

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

<a name="postRetrieve3ds2Result"></a>
# **postRetrieve3ds2Result**
> ThreeDS2ResultResponse postRetrieve3ds2Result(threeDS2ResultRequest)

Get the 3DS2 authentication result

Retrieves the &#x60;threeDS2Result&#x60; after doing a 3D Secure 2 authentication only.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = PaymentsApi()
val threeDS2ResultRequest : ThreeDS2ResultRequest =  // ThreeDS2ResultRequest | 
try {
    val result : ThreeDS2ResultResponse = apiInstance.postRetrieve3ds2Result(threeDS2ResultRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#postRetrieve3ds2Result")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#postRetrieve3ds2Result")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threeDS2ResultRequest** | [**ThreeDS2ResultRequest**](ThreeDS2ResultRequest.md)|  | [optional]

### Return type

[**ThreeDS2ResultResponse**](ThreeDS2ResultResponse.md)

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

