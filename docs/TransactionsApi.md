# TransactionsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/btl/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | Get all transactions
[**getTransactionsId**](TransactionsApi.md#getTransactionsId) | **GET** /transactions/{id} | Get a transaction


<a name="getTransactions"></a>
# **getTransactions**
> TransactionSearchResponse getTransactions(createdSince, createdUntil, balancePlatform, paymentInstrumentId, accountHolderId, balanceAccountId, cursor, limit)

Get all transactions

&gt;Versions 1 and 2 of the Transfers API are deprecated. If you are just starting your implementation, use the latest version.  Returns all the transactions related to a balance account, account holder, or balance platform.  When making this request, you must include at least one of the following: - &#x60;balanceAccountId&#x60; - &#x60;accountHolderId&#x60; - &#x60;balancePlatform&#x60;.  This endpoint supports cursor-based pagination. The response returns the first page of results, and returns links to the next and previous pages when applicable. You can use the links to page through the results.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = TransactionsApi()
val createdSince : kotlin.String = 2013-10-20T19:20:30+01:00 // kotlin.String | Only include transactions that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**.
val createdUntil : kotlin.String = 2013-10-20T19:20:30+01:00 // kotlin.String | Only include transactions that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**.
val balancePlatform : kotlin.String = balancePlatform_example // kotlin.String | The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id).  Required if you don't provide a `balanceAccountId` or `accountHolderId`.
val paymentInstrumentId : kotlin.String = paymentInstrumentId_example // kotlin.String | The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/paymentInstruments/_id_).  To use this parameter, you must also provide a `balanceAccountId`, `accountHolderId`, or `balancePlatform`.  The `paymentInstrumentId` must be related to the `balanceAccountId` or `accountHolderId` that you provide.
val accountHolderId : kotlin.String = accountHolderId_example // kotlin.String | The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/accountHolders/{id}__queryParam_id).  Required if you don't provide a `balanceAccountId` or `balancePlatform`.  If you provide a `balanceAccountId`, the `accountHolderId` must be related to the `balanceAccountId`.
val balanceAccountId : kotlin.String = balanceAccountId_example // kotlin.String | The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id).  Required if you don't provide an `accountHolderId` or `balancePlatform`.  If you provide an `accountHolderId`, the `balanceAccountId` must be related to the `accountHolderId`.
val cursor : kotlin.String = cursor_example // kotlin.String | The `cursor` returned in the links of the previous response.
val limit : kotlin.Int = 56 // kotlin.Int | The number of items returned per page, maximum of 100 items. By default, the response returns 10 items per page.
try {
    val result : TransactionSearchResponse = apiInstance.getTransactions(createdSince, createdUntil, balancePlatform, paymentInstrumentId, accountHolderId, balanceAccountId, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdSince** | **kotlin.String**| Only include transactions that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. |
 **createdUntil** | **kotlin.String**| Only include transactions that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. |
 **balancePlatform** | **kotlin.String**| The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id).  Required if you don&#39;t provide a &#x60;balanceAccountId&#x60; or &#x60;accountHolderId&#x60;. | [optional]
 **paymentInstrumentId** | **kotlin.String**| The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/paymentInstruments/_id_).  To use this parameter, you must also provide a &#x60;balanceAccountId&#x60;, &#x60;accountHolderId&#x60;, or &#x60;balancePlatform&#x60;.  The &#x60;paymentInstrumentId&#x60; must be related to the &#x60;balanceAccountId&#x60; or &#x60;accountHolderId&#x60; that you provide. | [optional]
 **accountHolderId** | **kotlin.String**| The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/accountHolders/{id}__queryParam_id).  Required if you don&#39;t provide a &#x60;balanceAccountId&#x60; or &#x60;balancePlatform&#x60;.  If you provide a &#x60;balanceAccountId&#x60;, the &#x60;accountHolderId&#x60; must be related to the &#x60;balanceAccountId&#x60;. | [optional]
 **balanceAccountId** | **kotlin.String**| The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id).  Required if you don&#39;t provide an &#x60;accountHolderId&#x60; or &#x60;balancePlatform&#x60;.  If you provide an &#x60;accountHolderId&#x60;, the &#x60;balanceAccountId&#x60; must be related to the &#x60;accountHolderId&#x60;. | [optional]
 **cursor** | **kotlin.String**| The &#x60;cursor&#x60; returned in the links of the previous response. | [optional]
 **limit** | **kotlin.Int**| The number of items returned per page, maximum of 100 items. By default, the response returns 10 items per page. | [optional]

### Return type

[**TransactionSearchResponse**](TransactionSearchResponse.md)

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

<a name="getTransactionsId"></a>
# **getTransactionsId**
> Transaction getTransactionsId(id)

Get a transaction

&gt;Versions 1 and 2 of the Transfers API are deprecated. If you are just starting your implementation, use the latest version.  Returns a transaction.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = TransactionsApi()
val id : kotlin.String = id_example // kotlin.String | Unique identifier of the transaction.
try {
    val result : Transaction = apiInstance.getTransactionsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactionsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactionsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Unique identifier of the transaction. |

### Return type

[**Transaction**](Transaction.md)

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

