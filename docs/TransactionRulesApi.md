# TransactionRulesApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTransactionRulesTransactionRuleId**](TransactionRulesApi.md#deleteTransactionRulesTransactionRuleId) | **DELETE** /transactionRules/{transactionRuleId} | Delete a transaction rule
[**getTransactionRulesTransactionRuleId**](TransactionRulesApi.md#getTransactionRulesTransactionRuleId) | **GET** /transactionRules/{transactionRuleId} | Get a transaction rule
[**patchTransactionRulesTransactionRuleId**](TransactionRulesApi.md#patchTransactionRulesTransactionRuleId) | **PATCH** /transactionRules/{transactionRuleId} | Update a transaction rule
[**postTransactionRules**](TransactionRulesApi.md#postTransactionRules) | **POST** /transactionRules | Create a transaction rule


<a name="deleteTransactionRulesTransactionRuleId"></a>
# **deleteTransactionRulesTransactionRuleId**
> TransactionRule deleteTransactionRulesTransactionRuleId(transactionRuleId)

Delete a transaction rule

Deletes a transaction rule.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = TransactionRulesApi()
val transactionRuleId : kotlin.String = transactionRuleId_example // kotlin.String | The unique identifier of the transaction rule.
try {
    val result : TransactionRule = apiInstance.deleteTransactionRulesTransactionRuleId(transactionRuleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRulesApi#deleteTransactionRulesTransactionRuleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRulesApi#deleteTransactionRulesTransactionRuleId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRuleId** | **kotlin.String**| The unique identifier of the transaction rule. |

### Return type

[**TransactionRule**](TransactionRule.md)

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

<a name="getTransactionRulesTransactionRuleId"></a>
# **getTransactionRulesTransactionRuleId**
> TransactionRuleResponse getTransactionRulesTransactionRuleId(transactionRuleId)

Get a transaction rule

Returns the details of a transaction rule.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = TransactionRulesApi()
val transactionRuleId : kotlin.String = transactionRuleId_example // kotlin.String | The unique identifier of the transaction rule.
try {
    val result : TransactionRuleResponse = apiInstance.getTransactionRulesTransactionRuleId(transactionRuleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRulesApi#getTransactionRulesTransactionRuleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRulesApi#getTransactionRulesTransactionRuleId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRuleId** | **kotlin.String**| The unique identifier of the transaction rule. |

### Return type

[**TransactionRuleResponse**](TransactionRuleResponse.md)

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

<a name="patchTransactionRulesTransactionRuleId"></a>
# **patchTransactionRulesTransactionRuleId**
> TransactionRule patchTransactionRulesTransactionRuleId(transactionRuleId, transactionRuleInfo)

Update a transaction rule

Updates a transaction rule.   * To update only the status of a transaction rule, send only the &#x60;status&#x60; parameter. All other parameters not provided in the request are left unchanged.  * When updating any other parameter, you need to send all existing resource parameters. If you omit a parameter in the request, that parameter is removed from the resource.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = TransactionRulesApi()
val transactionRuleId : kotlin.String = transactionRuleId_example // kotlin.String | The unique identifier of the transaction rule.
val transactionRuleInfo : TransactionRuleInfo =  // TransactionRuleInfo | 
try {
    val result : TransactionRule = apiInstance.patchTransactionRulesTransactionRuleId(transactionRuleId, transactionRuleInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRulesApi#patchTransactionRulesTransactionRuleId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRulesApi#patchTransactionRulesTransactionRuleId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRuleId** | **kotlin.String**| The unique identifier of the transaction rule. |
 **transactionRuleInfo** | [**TransactionRuleInfo**](TransactionRuleInfo.md)|  | [optional]

### Return type

[**TransactionRule**](TransactionRule.md)

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

<a name="postTransactionRules"></a>
# **postTransactionRules**
> TransactionRule postTransactionRules(transactionRuleInfo)

Create a transaction rule

Creates a [transaction rule](https://docs.adyen.com/issuing/transaction-rules). When your user makes a transaction with their Adyen-issued card, the transaction is allowed or declined based on the conditions and outcome defined in the transaction rule. You can apply the transaction rule to several cards, such as all the cards in your platform, or to a specific card. For use cases, see [examples](https://docs.adyen.com/issuing/transaction-rules/examples).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = TransactionRulesApi()
val transactionRuleInfo : TransactionRuleInfo =  // TransactionRuleInfo | 
try {
    val result : TransactionRule = apiInstance.postTransactionRules(transactionRuleInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRulesApi#postTransactionRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRulesApi#postTransactionRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRuleInfo** | [**TransactionRuleInfo**](TransactionRuleInfo.md)|  | [optional]

### Return type

[**TransactionRule**](TransactionRule.md)

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

