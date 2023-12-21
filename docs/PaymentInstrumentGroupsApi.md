# PaymentInstrumentGroupsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentInstrumentGroupsId**](PaymentInstrumentGroupsApi.md#getPaymentInstrumentGroupsId) | **GET** /paymentInstrumentGroups/{id} | Get a payment instrument group
[**getPaymentInstrumentGroupsIdTransactionRules**](PaymentInstrumentGroupsApi.md#getPaymentInstrumentGroupsIdTransactionRules) | **GET** /paymentInstrumentGroups/{id}/transactionRules | Get all transaction rules for a payment instrument group
[**postPaymentInstrumentGroups**](PaymentInstrumentGroupsApi.md#postPaymentInstrumentGroups) | **POST** /paymentInstrumentGroups | Create a payment instrument group


<a name="getPaymentInstrumentGroupsId"></a>
# **getPaymentInstrumentGroupsId**
> PaymentInstrumentGroup getPaymentInstrumentGroupsId(id)

Get a payment instrument group

Returns the details of a payment instrument group.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentGroupsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument group.
try {
    val result : PaymentInstrumentGroup = apiInstance.getPaymentInstrumentGroupsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentGroupsApi#getPaymentInstrumentGroupsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentGroupsApi#getPaymentInstrumentGroupsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument group. |

### Return type

[**PaymentInstrumentGroup**](PaymentInstrumentGroup.md)

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

<a name="getPaymentInstrumentGroupsIdTransactionRules"></a>
# **getPaymentInstrumentGroupsIdTransactionRules**
> TransactionRulesResponse getPaymentInstrumentGroupsIdTransactionRules(id)

Get all transaction rules for a payment instrument group

Returns a list of all the transaction rules associated with a payment instrument group.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentGroupsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the payment instrument group.
try {
    val result : TransactionRulesResponse = apiInstance.getPaymentInstrumentGroupsIdTransactionRules(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentGroupsApi#getPaymentInstrumentGroupsIdTransactionRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentGroupsApi#getPaymentInstrumentGroupsIdTransactionRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the payment instrument group. |

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

<a name="postPaymentInstrumentGroups"></a>
# **postPaymentInstrumentGroups**
> PaymentInstrumentGroup postPaymentInstrumentGroups(paymentInstrumentGroupInfo)

Create a payment instrument group

Creates a payment instrument group to associate and group payment instrument resources together. You can apply a transaction rule to a payment instrument group.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PaymentInstrumentGroupsApi()
val paymentInstrumentGroupInfo : PaymentInstrumentGroupInfo =  // PaymentInstrumentGroupInfo | 
try {
    val result : PaymentInstrumentGroup = apiInstance.postPaymentInstrumentGroups(paymentInstrumentGroupInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentInstrumentGroupsApi#postPaymentInstrumentGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentInstrumentGroupsApi#postPaymentInstrumentGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentGroupInfo** | [**PaymentInstrumentGroupInfo**](PaymentInstrumentGroupInfo.md)|  | [optional]

### Return type

[**PaymentInstrumentGroup**](PaymentInstrumentGroup.md)

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

