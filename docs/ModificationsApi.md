# ModificationsApi

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payment/v68*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAdjustAuthorisation**](ModificationsApi.md#postAdjustAuthorisation) | **POST** /adjustAuthorisation | Change the authorised amount
[**postCancel**](ModificationsApi.md#postCancel) | **POST** /cancel | Cancel an authorisation
[**postCancelOrRefund**](ModificationsApi.md#postCancelOrRefund) | **POST** /cancelOrRefund | Cancel or refund a payment
[**postCapture**](ModificationsApi.md#postCapture) | **POST** /capture | Capture an authorisation
[**postDonate**](ModificationsApi.md#postDonate) | **POST** /donate | Create a donation
[**postRefund**](ModificationsApi.md#postRefund) | **POST** /refund | Refund a captured payment
[**postTechnicalCancel**](ModificationsApi.md#postTechnicalCancel) | **POST** /technicalCancel | Cancel an authorisation using your reference
[**postVoidPendingRefund**](ModificationsApi.md#postVoidPendingRefund) | **POST** /voidPendingRefund | Cancel an in-person refund


<a name="postAdjustAuthorisation"></a>
# **postAdjustAuthorisation**
> ModificationResult postAdjustAuthorisation(adjustAuthorisationRequest)

Change the authorised amount

Allows you to increase or decrease the authorised amount after the initial authorisation has taken place. This functionality enables for example tipping, improving the chances your authorisation will be valid, or charging the shopper when they have already left the merchant premises.  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). &gt; If you have a [newer integration](https://docs.adyen.com/online-payments), and are doing: &gt; * [Asynchronous adjustments](https://docs.adyen.com/online-payments/adjust-authorisation#asynchronous-or-synchronous-adjustment), use the [&#x60;/payments/{paymentPspReference}/amountUpdates&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/v67/post/payments/{paymentPspReference}/amountUpdates) endpoint on Checkout API. &gt; * [Synchronous adjustments](https://docs.adyen.com/online-payments/adjust-authorisation#asynchronous-or-synchronous-adjustment), use this endpoint.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val adjustAuthorisationRequest : AdjustAuthorisationRequest =  // AdjustAuthorisationRequest | 
try {
    val result : ModificationResult = apiInstance.postAdjustAuthorisation(adjustAuthorisationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postAdjustAuthorisation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postAdjustAuthorisation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adjustAuthorisationRequest** | [**AdjustAuthorisationRequest**](AdjustAuthorisationRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postCancel"></a>
# **postCancel**
> ModificationResult postCancel(cancelRequest)

Cancel an authorisation

Cancels the authorisation hold on a payment, returning a unique reference for this request. You can cancel payments after authorisation only for payment methods that support distinct authorisations and captures.  For more information, refer to [Cancel](https://docs.adyen.com/online-payments/classic-integrations/modify-payments/cancel).  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments/{paymentPspReference}/cancels&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/payments/{paymentPspReference}/cancels) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val cancelRequest : CancelRequest =  // CancelRequest | 
try {
    val result : ModificationResult = apiInstance.postCancel(cancelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancelRequest** | [**CancelRequest**](CancelRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postCancelOrRefund"></a>
# **postCancelOrRefund**
> ModificationResult postCancelOrRefund(cancelOrRefundRequest)

Cancel or refund a payment

Cancels a payment if it has not been captured yet, or refunds it if it has already been captured. This is useful when it is not certain if the payment has been captured or not (for example, when using auto-capture).  Do not use this endpoint for payments that involve:  * [Multiple partial captures](https://docs.adyen.com/online-payments/capture).  * [Split data](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information) either at time of payment or capture for Adyen for Platforms.   Instead, check if the payment has been captured and make a corresponding [&#x60;/refund&#x60;](https://docs.adyen.com/api-explorer/#/Payment/refund) or [&#x60;/cancel&#x60;](https://docs.adyen.com/api-explorer/#/Payment/cancel) call.  For more information, refer to [Cancel or refund](https://docs.adyen.com/online-payments/classic-integrations/modify-payments/cancel-or-refund).  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments/{paymentPspReference}/reversals&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/payments/{paymentPspReference}/reversals) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val cancelOrRefundRequest : CancelOrRefundRequest =  // CancelOrRefundRequest | 
try {
    val result : ModificationResult = apiInstance.postCancelOrRefund(cancelOrRefundRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postCancelOrRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postCancelOrRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancelOrRefundRequest** | [**CancelOrRefundRequest**](CancelOrRefundRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postCapture"></a>
# **postCapture**
> ModificationResult postCapture(captureRequest)

Capture an authorisation

Captures the authorisation hold on a payment, returning a unique reference for this request. Usually the full authorisation amount is captured, however it&#39;s also possible to capture a smaller amount, which results in cancelling the remaining authorisation balance.  Payment methods that are captured automatically after authorisation don&#39;t need to be captured. However, submitting a capture request on these transactions will not result in double charges. If immediate or delayed auto-capture is enabled, calling the capture method is not neccessary.  For more information refer to [Capture](https://docs.adyen.com/online-payments/classic-integrations/modify-payments/capture).  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments/{paymentPspReference}/captures&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/v67/post/payments/{paymentPspReference}/captures) endpoint on Checkout API instead.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val captureRequest : CaptureRequest =  // CaptureRequest | 
try {
    val result : ModificationResult = apiInstance.postCapture(captureRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postCapture")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postCapture")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **captureRequest** | [**CaptureRequest**](CaptureRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postDonate"></a>
# **postDonate**
> ModificationResult postDonate(donationRequest)

Create a donation

Schedules a new payment to be created (including a new authorisation request) for the specified donation using the payment details of the original payment.  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/donations&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/donations) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val donationRequest : DonationRequest =  // DonationRequest | 
try {
    val result : ModificationResult = apiInstance.postDonate(donationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postDonate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postDonate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **donationRequest** | [**DonationRequest**](DonationRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postRefund"></a>
# **postRefund**
> ModificationResult postRefund(refundRequest)

Refund a captured payment

Refunds a payment that has previously been captured, returning a unique reference for this request. Refunding can be done on the full captured amount or a partial amount. Multiple (partial) refunds will be accepted as long as their sum doesn&#39;t exceed the captured amount. Payments which have been authorised, but not captured, cannot be refunded, use the /cancel method instead.  Some payment methods/gateways do not support partial/multiple refunds. A margin above the captured limit can be configured to cover shipping/handling costs.  For more information, refer to [Refund](https://docs.adyen.com/online-payments/classic-integrations/modify-payments/refund).  &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/payments/{paymentPspReference}/refunds&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/payments/{paymentPspReference}/refunds) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val refundRequest : RefundRequest =  // RefundRequest | 
try {
    val result : ModificationResult = apiInstance.postRefund(refundRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postTechnicalCancel"></a>
# **postTechnicalCancel**
> ModificationResult postTechnicalCancel(technicalCancelRequest)

Cancel an authorisation using your reference

This endpoint allows you to cancel a payment if you do not have the PSP reference of the original payment request available.  In your call, refer to the original payment by using the &#x60;reference&#x60; that you specified in your payment request.  For more information, see [Technical cancel](https://docs.adyen.com/online-payments/classic-integrations/modify-payments/cancel#technical-cancel).   &gt; This endpoint is part of our [classic API integration](https://docs.adyen.com/online-payments/classic-integrations/api-integration-ecommerce). If using a [newer integration](https://docs.adyen.com/online-payments), use the [&#x60;/cancels&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/cancels) endpoint under Checkout API instead.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val technicalCancelRequest : TechnicalCancelRequest =  // TechnicalCancelRequest | 
try {
    val result : ModificationResult = apiInstance.postTechnicalCancel(technicalCancelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postTechnicalCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postTechnicalCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **technicalCancelRequest** | [**TechnicalCancelRequest**](TechnicalCancelRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

<a name="postVoidPendingRefund"></a>
# **postVoidPendingRefund**
> ModificationResult postVoidPendingRefund(voidPendingRefundRequest)

Cancel an in-person refund

This endpoint allows you to cancel an unreferenced refund request before it has been completed.  In your call, you can refer to the original refund request either by using the &#x60;tenderReference&#x60;, or the &#x60;pspReference&#x60;. We recommend implementing based on the &#x60;tenderReference&#x60;, as this is generated for both offline and online transactions.  For more information, refer to [Cancel an unreferenced refund](https://docs.adyen.com/point-of-sale/refund-payment/cancel-unreferenced).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payment.*

val apiInstance = ModificationsApi()
val voidPendingRefundRequest : VoidPendingRefundRequest =  // VoidPendingRefundRequest | 
try {
    val result : ModificationResult = apiInstance.postVoidPendingRefund(voidPendingRefundRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModificationsApi#postVoidPendingRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModificationsApi#postVoidPendingRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voidPendingRefundRequest** | [**VoidPendingRefundRequest**](VoidPendingRefundRequest.md)|  | [optional]

### Return type

[**ModificationResult**](ModificationResult.md)

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

