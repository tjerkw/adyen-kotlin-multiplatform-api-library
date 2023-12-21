# BalanceAccountsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBalanceAccountsBalanceAccountIdSweepsSweepId**](BalanceAccountsApi.md#deleteBalanceAccountsBalanceAccountIdSweepsSweepId) | **DELETE** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Delete a sweep
[**getBalanceAccountsBalanceAccountIdSweeps**](BalanceAccountsApi.md#getBalanceAccountsBalanceAccountIdSweeps) | **GET** /balanceAccounts/{balanceAccountId}/sweeps | Get all sweeps for a balance account
[**getBalanceAccountsBalanceAccountIdSweepsSweepId**](BalanceAccountsApi.md#getBalanceAccountsBalanceAccountIdSweepsSweepId) | **GET** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Get a sweep
[**getBalanceAccountsId**](BalanceAccountsApi.md#getBalanceAccountsId) | **GET** /balanceAccounts/{id} | Get a balance account
[**getBalanceAccountsIdPaymentInstruments**](BalanceAccountsApi.md#getBalanceAccountsIdPaymentInstruments) | **GET** /balanceAccounts/{id}/paymentInstruments | Get all payment instruments for a balance account
[**patchBalanceAccountsBalanceAccountIdSweepsSweepId**](BalanceAccountsApi.md#patchBalanceAccountsBalanceAccountIdSweepsSweepId) | **PATCH** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Update a sweep
[**patchBalanceAccountsId**](BalanceAccountsApi.md#patchBalanceAccountsId) | **PATCH** /balanceAccounts/{id} | Update a balance account
[**postBalanceAccounts**](BalanceAccountsApi.md#postBalanceAccounts) | **POST** /balanceAccounts | Create a balance account
[**postBalanceAccountsBalanceAccountIdSweeps**](BalanceAccountsApi.md#postBalanceAccountsBalanceAccountIdSweeps) | **POST** /balanceAccounts/{balanceAccountId}/sweeps | Create a sweep


<a name="deleteBalanceAccountsBalanceAccountIdSweepsSweepId"></a>
# **deleteBalanceAccountsBalanceAccountIdSweepsSweepId**
> deleteBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId)

Delete a sweep

Deletes a sweep for a balance account.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val balanceAccountId : kotlin.String = balanceAccountId_example // kotlin.String | The unique identifier of the balance account.
val sweepId : kotlin.String = sweepId_example // kotlin.String | The unique identifier of the sweep.
try {
    apiInstance.deleteBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#deleteBalanceAccountsBalanceAccountIdSweepsSweepId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#deleteBalanceAccountsBalanceAccountIdSweepsSweepId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceAccountId** | **kotlin.String**| The unique identifier of the balance account. |
 **sweepId** | **kotlin.String**| The unique identifier of the sweep. |

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
 - **Accept**: application/json

<a name="getBalanceAccountsBalanceAccountIdSweeps"></a>
# **getBalanceAccountsBalanceAccountIdSweeps**
> BalanceSweepConfigurationsResponse getBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, offset, limit)

Get all sweeps for a balance account

Returns a list of the sweeps configured for a balance account.  To fetch multiple pages, use the query parameters. For example, to limit the page to 5 sweeps and to skip the first 10, use &#x60;/balanceAccounts/{balanceAccountId}/sweeps?limit&#x3D;5&amp;offset&#x3D;10&#x60;.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val balanceAccountId : kotlin.String = balanceAccountId_example // kotlin.String | The unique identifier of the balance account.
val offset : kotlin.Int = 56 // kotlin.Int | The number of items that you want to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
try {
    val result : BalanceSweepConfigurationsResponse = apiInstance.getBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#getBalanceAccountsBalanceAccountIdSweeps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#getBalanceAccountsBalanceAccountIdSweeps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceAccountId** | **kotlin.String**| The unique identifier of the balance account. |
 **offset** | **kotlin.Int**| The number of items that you want to skip. | [optional]
 **limit** | **kotlin.Int**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional]

### Return type

[**BalanceSweepConfigurationsResponse**](BalanceSweepConfigurationsResponse.md)

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

<a name="getBalanceAccountsBalanceAccountIdSweepsSweepId"></a>
# **getBalanceAccountsBalanceAccountIdSweepsSweepId**
> SweepConfigurationV2 getBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId)

Get a sweep

Returns a sweep.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val balanceAccountId : kotlin.String = balanceAccountId_example // kotlin.String | The unique identifier of the balance account.
val sweepId : kotlin.String = sweepId_example // kotlin.String | The unique identifier of the sweep.
try {
    val result : SweepConfigurationV2 = apiInstance.getBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#getBalanceAccountsBalanceAccountIdSweepsSweepId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#getBalanceAccountsBalanceAccountIdSweepsSweepId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceAccountId** | **kotlin.String**| The unique identifier of the balance account. |
 **sweepId** | **kotlin.String**| The unique identifier of the sweep. |

### Return type

[**SweepConfigurationV2**](SweepConfigurationV2.md)

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

<a name="getBalanceAccountsId"></a>
# **getBalanceAccountsId**
> BalanceAccount getBalanceAccountsId(id)

Get a balance account

Returns a balance account and its balances for the default currency and other currencies with a non-zero balance.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the balance account.
try {
    val result : BalanceAccount = apiInstance.getBalanceAccountsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#getBalanceAccountsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#getBalanceAccountsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the balance account. |

### Return type

[**BalanceAccount**](BalanceAccount.md)

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

<a name="getBalanceAccountsIdPaymentInstruments"></a>
# **getBalanceAccountsIdPaymentInstruments**
> PaginatedPaymentInstrumentsResponse getBalanceAccountsIdPaymentInstruments(id, offset, limit)

Get all payment instruments for a balance account

Returns a paginated list of the payment instruments associated with a balance account.   To fetch multiple pages, use the query parameters.For example, to limit the page to 3 payment instruments and to skip the first 6, use &#x60;/balanceAccounts/{id}/paymentInstruments?limit&#x3D;3&amp;offset&#x3D;6&#x60;.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the balance account.
val offset : kotlin.Int = 56 // kotlin.Int | The number of items that you want to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
try {
    val result : PaginatedPaymentInstrumentsResponse = apiInstance.getBalanceAccountsIdPaymentInstruments(id, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#getBalanceAccountsIdPaymentInstruments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#getBalanceAccountsIdPaymentInstruments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the balance account. |
 **offset** | **kotlin.Int**| The number of items that you want to skip. | [optional]
 **limit** | **kotlin.Int**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional]

### Return type

[**PaginatedPaymentInstrumentsResponse**](PaginatedPaymentInstrumentsResponse.md)

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

<a name="patchBalanceAccountsBalanceAccountIdSweepsSweepId"></a>
# **patchBalanceAccountsBalanceAccountIdSweepsSweepId**
> SweepConfigurationV2 patchBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId, updateSweepConfigurationV2)

Update a sweep

Updates a sweep. When updating a sweep resource, note that if a request parameter is not provided, the parameter is left unchanged.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val balanceAccountId : kotlin.String = balanceAccountId_example // kotlin.String | The unique identifier of the balance account.
val sweepId : kotlin.String = sweepId_example // kotlin.String | The unique identifier of the sweep.
val updateSweepConfigurationV2 : UpdateSweepConfigurationV2 =  // UpdateSweepConfigurationV2 | 
try {
    val result : SweepConfigurationV2 = apiInstance.patchBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId, updateSweepConfigurationV2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#patchBalanceAccountsBalanceAccountIdSweepsSweepId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#patchBalanceAccountsBalanceAccountIdSweepsSweepId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceAccountId** | **kotlin.String**| The unique identifier of the balance account. |
 **sweepId** | **kotlin.String**| The unique identifier of the sweep. |
 **updateSweepConfigurationV2** | [**UpdateSweepConfigurationV2**](UpdateSweepConfigurationV2.md)|  | [optional]

### Return type

[**SweepConfigurationV2**](SweepConfigurationV2.md)

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

<a name="patchBalanceAccountsId"></a>
# **patchBalanceAccountsId**
> BalanceAccount patchBalanceAccountsId(id, balanceAccountUpdateRequest)

Update a balance account

Updates a balance account.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the balance account.
val balanceAccountUpdateRequest : BalanceAccountUpdateRequest =  // BalanceAccountUpdateRequest | 
try {
    val result : BalanceAccount = apiInstance.patchBalanceAccountsId(id, balanceAccountUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#patchBalanceAccountsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#patchBalanceAccountsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the balance account. |
 **balanceAccountUpdateRequest** | [**BalanceAccountUpdateRequest**](BalanceAccountUpdateRequest.md)|  | [optional]

### Return type

[**BalanceAccount**](BalanceAccount.md)

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

<a name="postBalanceAccounts"></a>
# **postBalanceAccounts**
> BalanceAccount postBalanceAccounts(balanceAccountInfo)

Create a balance account

Creates a balance account that holds the funds of the associated account holder.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val balanceAccountInfo : BalanceAccountInfo =  // BalanceAccountInfo | 
try {
    val result : BalanceAccount = apiInstance.postBalanceAccounts(balanceAccountInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#postBalanceAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#postBalanceAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceAccountInfo** | [**BalanceAccountInfo**](BalanceAccountInfo.md)|  | [optional]

### Return type

[**BalanceAccount**](BalanceAccount.md)

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

<a name="postBalanceAccountsBalanceAccountIdSweeps"></a>
# **postBalanceAccountsBalanceAccountIdSweeps**
> SweepConfigurationV2 postBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, createSweepConfigurationV2)

Create a sweep

Creates a sweep that results in moving funds from or to a balance account.  A sweep pulls in or pushes out funds based on a defined schedule, amount, currency, and a source or a destination.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BalanceAccountsApi()
val balanceAccountId : kotlin.String = balanceAccountId_example // kotlin.String | The unique identifier of the balance account.
val createSweepConfigurationV2 : CreateSweepConfigurationV2 =  // CreateSweepConfigurationV2 | 
try {
    val result : SweepConfigurationV2 = apiInstance.postBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, createSweepConfigurationV2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalanceAccountsApi#postBalanceAccountsBalanceAccountIdSweeps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalanceAccountsApi#postBalanceAccountsBalanceAccountIdSweeps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceAccountId** | **kotlin.String**| The unique identifier of the balance account. |
 **createSweepConfigurationV2** | [**CreateSweepConfigurationV2**](CreateSweepConfigurationV2.md)|  | [optional]

### Return type

[**SweepConfigurationV2**](SweepConfigurationV2.md)

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

