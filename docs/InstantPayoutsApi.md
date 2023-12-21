# InstantPayoutsApi

All URIs are relative to *https://pal-test.adyen.com/pal/servlet/Payout/v68*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPayout**](InstantPayoutsApi.md#postPayout) | **POST** /payout | Make an instant card payout


<a name="postPayout"></a>
# **postPayout**
> PayoutResponse postPayout(payoutRequest)

Make an instant card payout

With this call, you can pay out to your customers, and funds will be made available within 30 minutes on the cardholder&#39;s bank account (this is dependent on whether the issuer supports this functionality). Instant card payouts are only supported for Visa and Mastercard cards.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.payout.*

val apiInstance = InstantPayoutsApi()
val payoutRequest : PayoutRequest =  // PayoutRequest | 
try {
    val result : PayoutResponse = apiInstance.postPayout(payoutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstantPayoutsApi#postPayout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstantPayoutsApi#postPayout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutRequest** | [**PayoutRequest**](PayoutRequest.md)|  | [optional]

### Return type

[**PayoutResponse**](PayoutResponse.md)

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

