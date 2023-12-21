# PaymentInstrumentsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentInstrumentsId**](PaymentInstrumentsApi.md#getPaymentInstrumentsId) | **GET** /paymentInstruments/{id} | Get a payment instrument
[**getPaymentInstrumentsIdNetworkTokens**](PaymentInstrumentsApi.md#getPaymentInstrumentsIdNetworkTokens) | **GET** /paymentInstruments/{id}/networkTokens | List network tokens
[**getPaymentInstrumentsIdReveal**](PaymentInstrumentsApi.md#getPaymentInstrumentsIdReveal) | **GET** /paymentInstruments/{id}/reveal | Get the PAN of a payment instrument
[**getPaymentInstrumentsIdTransactionRules**](PaymentInstrumentsApi.md#getPaymentInstrumentsIdTransactionRules) | **GET** /paymentInstruments/{id}/transactionRules | Get all transaction rules for a payment instrument
[**patchPaymentInstrumentsId**](PaymentInstrumentsApi.md#patchPaymentInstrumentsId) | **PATCH** /paymentInstruments/{id} | Update a payment instrument
[**postPaymentInstruments**](PaymentInstrumentsApi.md#postPaymentInstruments) | **POST** /paymentInstruments | Create a payment instrument


<a name="getPaymentInstrumentsId"></a>
# **getPaymentInstrumentsId**
> PaymentInstrument getPaymentInstrumentsId(id)

Get a payment instrument

Returns the details of a payment instrument.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument.
try {
    val result : PaymentInstrument = apiInstance.getPaymentInstrumentsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentsApi#getPaymentInstrumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentsApi#getPaymentInstrumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument. |

### Return type

[**PaymentInstrument**](PaymentInstrument.md)

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

<a name="getPaymentInstrumentsIdNetworkTokens"></a>
# **getPaymentInstrumentsIdNetworkTokens**
> ListNetworkTokensResponse getPaymentInstrumentsIdNetworkTokens(id)

List network tokens

List the network tokens connected to a payment instrument.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument.
try {
    val result : ListNetworkTokensResponse = apiInstance.getPaymentInstrumentsIdNetworkTokens(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentsApi#getPaymentInstrumentsIdNetworkTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentsApi#getPaymentInstrumentsIdNetworkTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument. |

### Return type

[**ListNetworkTokensResponse**](ListNetworkTokensResponse.md)

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

<a name="getPaymentInstrumentsIdReveal"></a>
# **getPaymentInstrumentsIdReveal**
> PaymentInstrumentRevealInfo getPaymentInstrumentsIdReveal(id)

Get the PAN of a payment instrument

Returns the primary account number (PAN) of a payment instrument.  To make this request, your API credential must have the following [role](https://docs.adyen.com/issuing/manage-access/api-credentials-web-service#api-permissions):  * Balance Platform BCL PCI role

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument.
try {
    val result : PaymentInstrumentRevealInfo = apiInstance.getPaymentInstrumentsIdReveal(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentsApi#getPaymentInstrumentsIdReveal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentsApi#getPaymentInstrumentsIdReveal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument. |

### Return type

[**PaymentInstrumentRevealInfo**](PaymentInstrumentRevealInfo.md)

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

<a name="getPaymentInstrumentsIdTransactionRules"></a>
# **getPaymentInstrumentsIdTransactionRules**
> TransactionRulesResponse getPaymentInstrumentsIdTransactionRules(id)

Get all transaction rules for a payment instrument

Returns a list of transaction rules associated with a payment instrument.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument.
try {
    val result : TransactionRulesResponse = apiInstance.getPaymentInstrumentsIdTransactionRules(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentsApi#getPaymentInstrumentsIdTransactionRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentsApi#getPaymentInstrumentsIdTransactionRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument. |

### Return type

[**TransactionRulesResponse**](TransactionRulesResponse.md)

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

<a name="patchPaymentInstrumentsId"></a>
# **patchPaymentInstrumentsId**
> UpdatePaymentInstrument patchPaymentInstrumentsId(id, paymentInstrumentUpdateRequest)

Update a payment instrument

Updates a payment instrument. Once a payment instrument is already active, you can only update its status. However, for cards created with **inactive** status, you can still update the balance account associated with the card.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument.
val paymentInstrumentUpdateRequest : PaymentInstrumentUpdateRequest =  // PaymentInstrumentUpdateRequest | 
try {
    val result : UpdatePaymentInstrument = apiInstance.patchPaymentInstrumentsId(id, paymentInstrumentUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentsApi#patchPaymentInstrumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentsApi#patchPaymentInstrumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument. |
 **paymentInstrumentUpdateRequest** | [**PaymentInstrumentUpdateRequest**](PaymentInstrumentUpdateRequest.md)|  | [optional]

### Return type

[**UpdatePaymentInstrument**](UpdatePaymentInstrument.md)

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

<a name="postPaymentInstruments"></a>
# **postPaymentInstruments**
> PaymentInstrument postPaymentInstruments(paymentInstrumentInfo)

Create a payment instrument

Creates a payment instrument to issue a physical card, a virtual card, or a business account to your user.   For more information, refer to [Issue cards](https://docs.adyen.com/issuing/create-cards) or [Issue business accounts](https://docs.adyen.com/marketplaces-and-platforms/business-accounts).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentsApi()
val paymentInstrumentInfo : PaymentInstrumentInfo =  // PaymentInstrumentInfo | 
try {
    val result : PaymentInstrument = apiInstance.postPaymentInstruments(paymentInstrumentInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentsApi#postPaymentInstruments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentsApi#postPaymentInstruments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentInfo** | [**PaymentInstrumentInfo**](PaymentInstrumentInfo.md)|  | [optional]

### Return type

[**PaymentInstrument**](PaymentInstrument.md)

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

