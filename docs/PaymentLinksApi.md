# PaymentLinksApi

All URIs are relative to *https://checkout-test.adyen.com/v71*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentLinksLinkId**](PaymentLinksApi.md#getPaymentLinksLinkId) | **GET** /paymentLinks/{linkId} | Get a payment link
[**patchPaymentLinksLinkId**](PaymentLinksApi.md#patchPaymentLinksLinkId) | **PATCH** /paymentLinks/{linkId} | Update the status of a payment link
[**postPaymentLinks**](PaymentLinksApi.md#postPaymentLinks) | **POST** /paymentLinks | Create a payment link


<a name="getPaymentLinksLinkId"></a>
# **getPaymentLinksLinkId**
> PaymentLinkResponse getPaymentLinksLinkId(linkId)

Get a payment link

Retrieves the payment link details using the payment link &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = PaymentLinksApi()
val linkId : kotlin.String = linkId_example // kotlin.String | Unique identifier of the payment link.
try {
    val result : PaymentLinkResponse = apiInstance.getPaymentLinksLinkId(linkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinksApi#getPaymentLinksLinkId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinksApi#getPaymentLinksLinkId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **kotlin.String**| Unique identifier of the payment link. |

### Return type

[**PaymentLinkResponse**](PaymentLinkResponse.md)

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

<a name="patchPaymentLinksLinkId"></a>
# **patchPaymentLinksLinkId**
> PaymentLinkResponse patchPaymentLinksLinkId(linkId, updatePaymentLinkRequest)

Update the status of a payment link

Updates the status of a payment link. Use this endpoint to [force the expiry of a payment link](https://docs.adyen.com/online-payments/pay-by-link#update-payment-link-status).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = PaymentLinksApi()
val linkId : kotlin.String = linkId_example // kotlin.String | Unique identifier of the payment link.
val updatePaymentLinkRequest : UpdatePaymentLinkRequest =  // UpdatePaymentLinkRequest | 
try {
    val result : PaymentLinkResponse = apiInstance.patchPaymentLinksLinkId(linkId, updatePaymentLinkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinksApi#patchPaymentLinksLinkId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinksApi#patchPaymentLinksLinkId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **kotlin.String**| Unique identifier of the payment link. |
 **updatePaymentLinkRequest** | [**UpdatePaymentLinkRequest**](UpdatePaymentLinkRequest.md)|  | [optional]

### Return type

[**PaymentLinkResponse**](PaymentLinkResponse.md)

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

<a name="postPaymentLinks"></a>
# **postPaymentLinks**
> PaymentLinkResponse postPaymentLinks(idempotencyKey, paymentLinkRequest)

Create a payment link

Creates a payment link to our hosted payment form where shoppers can pay. The list of payment methods presented to the shopper depends on the &#x60;currency&#x60; and &#x60;country&#x60; parameters sent in the request.  For more information, refer to [Pay by Link documentation](https://docs.adyen.com/online-payments/pay-by-link#create-payment-links-through-api).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = PaymentLinksApi()
val idempotencyKey : kotlin.String = 37ca9c97-d1d1-4c62-89e8-706891a563ed // kotlin.String | A unique identifier for the message with a maximum of 64 characters (we recommend a UUID).
val paymentLinkRequest : PaymentLinkRequest =  // PaymentLinkRequest | 
try {
    val result : PaymentLinkResponse = apiInstance.postPaymentLinks(idempotencyKey, paymentLinkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinksApi#postPaymentLinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinksApi#postPaymentLinks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| A unique identifier for the message with a maximum of 64 characters (we recommend a UUID). | [optional]
 **paymentLinkRequest** | [**PaymentLinkRequest**](PaymentLinkRequest.md)|  | [optional]

### Return type

[**PaymentLinkResponse**](PaymentLinkResponse.md)

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

