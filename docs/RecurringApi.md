# RecurringApi

All URIs are relative to *https://checkout-test.adyen.com/v71*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteStoredPaymentMethodsStoredPaymentMethodId**](RecurringApi.md#deleteStoredPaymentMethodsStoredPaymentMethodId) | **DELETE** /storedPaymentMethods/{storedPaymentMethodId} | Delete a token for stored payment details
[**getStoredPaymentMethods**](RecurringApi.md#getStoredPaymentMethods) | **GET** /storedPaymentMethods | Get tokens for stored payment details


<a name="deleteStoredPaymentMethodsStoredPaymentMethodId"></a>
# **deleteStoredPaymentMethodsStoredPaymentMethodId**
> deleteStoredPaymentMethodsStoredPaymentMethodId(storedPaymentMethodId, shopperReference, merchantAccount)

Delete a token for stored payment details

Deletes the token identified in the path. The token can no longer be used with payment requests.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = RecurringApi()
val storedPaymentMethodId : kotlin.String = storedPaymentMethodId_example // kotlin.String | The unique identifier of the token.
val shopperReference : kotlin.String = shopperReference_example // kotlin.String | Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.
val merchantAccount : kotlin.String = merchantAccount_example // kotlin.String | Your merchant account.
try {
    apiInstance.deleteStoredPaymentMethodsStoredPaymentMethodId(storedPaymentMethodId, shopperReference, merchantAccount)
} catch (e: ClientException) {
    println("4xx response calling RecurringApi#deleteStoredPaymentMethodsStoredPaymentMethodId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringApi#deleteStoredPaymentMethodsStoredPaymentMethodId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storedPaymentMethodId** | **kotlin.String**| The unique identifier of the token. |
 **shopperReference** | **kotlin.String**| Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |
 **merchantAccount** | **kotlin.String**| Your merchant account. |

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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoredPaymentMethods"></a>
# **getStoredPaymentMethods**
> ListStoredPaymentMethodsResponse getStoredPaymentMethods(shopperReference, merchantAccount)

Get tokens for stored payment details

Lists the tokens for stored payment details for the shopper identified in the path, if there are any available. The token ID can be used with payment requests for the shopper&#39;s payment. A summary of the stored details is included.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.checkout.*

val apiInstance = RecurringApi()
val shopperReference : kotlin.String = shopperReference_example // kotlin.String | Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.
val merchantAccount : kotlin.String = merchantAccount_example // kotlin.String | Your merchant account.
try {
    val result : ListStoredPaymentMethodsResponse = apiInstance.getStoredPaymentMethods(shopperReference, merchantAccount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringApi#getStoredPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringApi#getStoredPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopperReference** | **kotlin.String**| Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. | [optional]
 **merchantAccount** | **kotlin.String**| Your merchant account. | [optional]

### Return type

[**ListStoredPaymentMethodsResponse**](ListStoredPaymentMethodsResponse.md)

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

