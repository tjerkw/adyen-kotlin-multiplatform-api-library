# AccountHoldersApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountHoldersId**](AccountHoldersApi.md#getAccountHoldersId) | **GET** /accountHolders/{id} | Get an account holder
[**getAccountHoldersIdBalanceAccounts**](AccountHoldersApi.md#getAccountHoldersIdBalanceAccounts) | **GET** /accountHolders/{id}/balanceAccounts | Get all balance accounts of an account holder
[**getAccountHoldersIdTaxForms**](AccountHoldersApi.md#getAccountHoldersIdTaxForms) | **GET** /accountHolders/{id}/taxForms | Get a tax form
[**patchAccountHoldersId**](AccountHoldersApi.md#patchAccountHoldersId) | **PATCH** /accountHolders/{id} | Update an account holder
[**postAccountHolders**](AccountHoldersApi.md#postAccountHolders) | **POST** /accountHolders | Create an account holder


<a name="getAccountHoldersId"></a>
# **getAccountHoldersId**
> AccountHolder getAccountHoldersId(id)

Get an account holder

Returns an account holder.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = AccountHoldersApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the account holder.
try {
    val result : AccountHolder = apiInstance.getAccountHoldersId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountHoldersApi#getAccountHoldersId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountHoldersApi#getAccountHoldersId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the account holder. |

### Return type

[**AccountHolder**](AccountHolder.md)

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

<a name="getAccountHoldersIdBalanceAccounts"></a>
# **getAccountHoldersIdBalanceAccounts**
> PaginatedBalanceAccountsResponse getAccountHoldersIdBalanceAccounts(id, offset, limit)

Get all balance accounts of an account holder

Returns a paginated list of the balance accounts associated with an account holder. To fetch multiple pages, use the query parameters.   For example, to limit the page to 5 balance accounts and skip the first 10, use &#x60;/accountHolders/{id}/balanceAccounts?limit&#x3D;5&amp;offset&#x3D;10&#x60;.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = AccountHoldersApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the account holder.
val offset : kotlin.Int = 56 // kotlin.Int | The number of items that you want to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
try {
    val result : PaginatedBalanceAccountsResponse = apiInstance.getAccountHoldersIdBalanceAccounts(id, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountHoldersApi#getAccountHoldersIdBalanceAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountHoldersApi#getAccountHoldersIdBalanceAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the account holder. |
 **offset** | **kotlin.Int**| The number of items that you want to skip. | [optional]
 **limit** | **kotlin.Int**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional]

### Return type

[**PaginatedBalanceAccountsResponse**](PaginatedBalanceAccountsResponse.md)

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

<a name="getAccountHoldersIdTaxForms"></a>
# **getAccountHoldersIdTaxForms**
> GetTaxFormResponse getAccountHoldersIdTaxForms(id, formType, year)

Get a tax form

Generates a tax form for account holders operating in the US. For more information, refer to [Providing tax forms](https://docs.adyen.com/marketplaces-and-platforms/us-tax-forms/).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = AccountHoldersApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the account holder.
val formType : kotlin.String = formType_example // kotlin.String | The type of tax form you want to retrieve. Accepted values are **US1099k** and **US1099nec**
val year : kotlin.Int = 56 // kotlin.Int | The tax year in YYYY format for the tax form you want to retrieve
try {
    val result : GetTaxFormResponse = apiInstance.getAccountHoldersIdTaxForms(id, formType, year)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountHoldersApi#getAccountHoldersIdTaxForms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountHoldersApi#getAccountHoldersIdTaxForms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the account holder. |
 **formType** | **kotlin.String**| The type of tax form you want to retrieve. Accepted values are **US1099k** and **US1099nec** | [enum: US1099k, US1099nec]
 **year** | **kotlin.Int**| The tax year in YYYY format for the tax form you want to retrieve |

### Return type

[**GetTaxFormResponse**](GetTaxFormResponse.md)

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

<a name="patchAccountHoldersId"></a>
# **patchAccountHoldersId**
> AccountHolder patchAccountHoldersId(id, accountHolderUpdateRequest)

Update an account holder

Updates an account holder. When updating an account holder resource, if a parameter is not provided in the request, it is left unchanged.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = AccountHoldersApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the account holder.
val accountHolderUpdateRequest : AccountHolderUpdateRequest =  // AccountHolderUpdateRequest | 
try {
    val result : AccountHolder = apiInstance.patchAccountHoldersId(id, accountHolderUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountHoldersApi#patchAccountHoldersId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountHoldersApi#patchAccountHoldersId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the account holder. |
 **accountHolderUpdateRequest** | [**AccountHolderUpdateRequest**](AccountHolderUpdateRequest.md)|  | [optional]

### Return type

[**AccountHolder**](AccountHolder.md)

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

<a name="postAccountHolders"></a>
# **postAccountHolders**
> AccountHolder postAccountHolders(accountHolderInfo)

Create an account holder

Creates an account holder linked to a [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = AccountHoldersApi()
val accountHolderInfo : AccountHolderInfo =  // AccountHolderInfo | 
try {
    val result : AccountHolder = apiInstance.postAccountHolders(accountHolderInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountHoldersApi#postAccountHolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountHoldersApi#postAccountHolders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountHolderInfo** | [**AccountHolderInfo**](AccountHolderInfo.md)|  | [optional]

### Return type

[**AccountHolder**](AccountHolder.md)

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

