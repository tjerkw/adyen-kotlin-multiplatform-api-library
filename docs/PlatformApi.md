# PlatformApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalancePlatformsId**](PlatformApi.md#getBalancePlatformsId) | **GET** /balancePlatforms/{id} | Get a balance platform
[**getBalancePlatformsIdAccountHolders**](PlatformApi.md#getBalancePlatformsIdAccountHolders) | **GET** /balancePlatforms/{id}/accountHolders | Get all account holders under a balance platform


<a name="getBalancePlatformsId"></a>
# **getBalancePlatformsId**
> BalancePlatform getBalancePlatformsId(id)

Get a balance platform

Returns a balance platform.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PlatformApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the balance platform.
try {
    val result : BalancePlatform = apiInstance.getBalancePlatformsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#getBalancePlatformsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#getBalancePlatformsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the balance platform. |

### Return type

[**BalancePlatform**](BalancePlatform.md)

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

<a name="getBalancePlatformsIdAccountHolders"></a>
# **getBalancePlatformsIdAccountHolders**
> PaginatedAccountHoldersResponse getBalancePlatformsIdAccountHolders(id, offset, limit)

Get all account holders under a balance platform

Returns a paginated list of all the account holders that belong to the balance platform. To fetch multiple pages, use the query parameters.   For example, to limit the page to 5 account holders and to skip the first 20, use &#x60;/balancePlatforms/{id}/accountHolders?limit&#x3D;5&amp;offset&#x3D;20&#x60;.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = PlatformApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the balance platform.
val offset : kotlin.Int = 56 // kotlin.Int | The number of items that you want to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
try {
    val result : PaginatedAccountHoldersResponse = apiInstance.getBalancePlatformsIdAccountHolders(id, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlatformApi#getBalancePlatformsIdAccountHolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlatformApi#getBalancePlatformsIdAccountHolders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the balance platform. |
 **offset** | **kotlin.Int**| The number of items that you want to skip. | [optional]
 **limit** | **kotlin.Int**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional]

### Return type

[**PaginatedAccountHoldersResponse**](PaginatedAccountHoldersResponse.md)

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

