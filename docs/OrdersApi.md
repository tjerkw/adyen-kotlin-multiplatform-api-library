# OrdersApi

All URIs are relative to *https://checkout-test.adyen.com/v71*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postOrders**](OrdersApi.md#postOrders) | **POST** /orders | Create an order
[**postOrdersCancel**](OrdersApi.md#postOrdersCancel) | **POST** /orders/cancel | Cancel an order
[**postPaymentMethodsBalance**](OrdersApi.md#postPaymentMethodsBalance) | **POST** /paymentMethods/balance | Get the balance of a gift card


<a name="postOrders"></a>
# **postOrders**
> CreateOrderResponse postOrders(idempotencyKey, createOrderRequest)

Create an order

Creates an order to be used for partial payments. Make a POST &#x60;/orders&#x60; call before making a &#x60;/payments&#x60; call when processing payments with different payment methods.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = OrdersApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val createOrderRequest : CreateOrderRequest =  // CreateOrderRequest | 
try {
    val result : CreateOrderResponse = apiInstance.postOrders(idempotencyKey, createOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#postOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#postOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  | [optional]

### Return type

[**CreateOrderResponse**](CreateOrderResponse.md)

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

<a name="postOrdersCancel"></a>
# **postOrdersCancel**
> CancelOrderResponse postOrdersCancel(idempotencyKey, cancelOrderRequest)

Cancel an order

Cancels an order. Cancellation of an order results in an automatic rollback of all payments made in the order, either by canceling or refunding the payment, depending on the type of payment method.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = OrdersApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val cancelOrderRequest : CancelOrderRequest =  // CancelOrderRequest | 
try {
    val result : CancelOrderResponse = apiInstance.postOrdersCancel(idempotencyKey, cancelOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#postOrdersCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#postOrdersCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **cancelOrderRequest** | [**CancelOrderRequest**](CancelOrderRequest.md)|  | [optional]

### Return type

[**CancelOrderResponse**](CancelOrderResponse.md)

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

<a name="postPaymentMethodsBalance"></a>
# **postPaymentMethodsBalance**
> BalanceCheckResponse postPaymentMethodsBalance(idempotencyKey, balanceCheckRequest)

Get the balance of a gift card

Retrieves the balance remaining on a shopper&#39;s gift card. To check a gift card&#39;s balance, make a POST &#x60;/paymentMethods/balance&#x60; call and include the gift card&#39;s details inside a &#x60;paymentMethod&#x60; object.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = OrdersApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val balanceCheckRequest : BalanceCheckRequest =  // BalanceCheckRequest | 
try {
    val result : BalanceCheckResponse = apiInstance.postPaymentMethodsBalance(idempotencyKey, balanceCheckRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#postPaymentMethodsBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#postPaymentMethodsBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **balanceCheckRequest** | [**BalanceCheckRequest**](BalanceCheckRequest.md)|  | [optional]

### Return type

[**BalanceCheckResponse**](BalanceCheckResponse.md)

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

