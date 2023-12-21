# ClassicCheckoutSDKApi

All URIs are relative to *https://checkout-test.adyen.com/v71*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPaymentSession**](ClassicCheckoutSDKApi.md#postPaymentSession) | **POST** /paymentSession | Create a payment session
[**postPaymentsResult**](ClassicCheckoutSDKApi.md#postPaymentsResult) | **POST** /payments/result | Verify a payment result


<a name="postPaymentSession"></a>
# **postPaymentSession**
> PaymentSetupResponse postPaymentSession(idempotencyKey, paymentSetupRequest)

Create a payment session

Provides the data object that can be used to start the Checkout SDK. To set up the payment, pass its amount, currency, and other required parameters. We use this to optimise the payment flow and perform better risk assessment of the transaction.  For more information, refer to [How it works](https://docs.adyen.com/online-payments#howitworks).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = ClassicCheckoutSDKApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val paymentSetupRequest : PaymentSetupRequest =  // PaymentSetupRequest | 
try {
    val result : PaymentSetupResponse = apiInstance.postPaymentSession(idempotencyKey, paymentSetupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassicCheckoutSDKApi#postPaymentSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassicCheckoutSDKApi#postPaymentSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **paymentSetupRequest** | [**PaymentSetupRequest**](PaymentSetupRequest.md)|  | [optional]

### Return type

[**PaymentSetupResponse**](PaymentSetupResponse.md)

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

<a name="postPaymentsResult"></a>
# **postPaymentsResult**
> PaymentVerificationResponse postPaymentsResult(idempotencyKey, paymentVerificationRequest)

Verify a payment result

Verifies the payment result using the payload returned from the Checkout SDK.  For more information, refer to [How it works](https://docs.adyen.com/online-payments#howitworks).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = ClassicCheckoutSDKApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val paymentVerificationRequest : PaymentVerificationRequest =  // PaymentVerificationRequest | 
try {
    val result : PaymentVerificationResponse = apiInstance.postPaymentsResult(idempotencyKey, paymentVerificationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassicCheckoutSDKApi#postPaymentsResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassicCheckoutSDKApi#postPaymentsResult")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **paymentVerificationRequest** | [**PaymentVerificationRequest**](PaymentVerificationRequest.md)|  | [optional]

### Return type

[**PaymentVerificationResponse**](PaymentVerificationResponse.md)

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

