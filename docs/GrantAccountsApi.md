# GrantAccountsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGrantAccountsId**](GrantAccountsApi.md#getGrantAccountsId) | **GET** /grantAccounts/{id} | Get a grant account


<a name="getGrantAccountsId"></a>
# **getGrantAccountsId**
> CapitalGrantAccount getGrantAccountsId(id)

Get a grant account

Returns the details of the [grant account](https://docs.adyen.com/marketplaces-and-platforms/capital#grant-account).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = GrantAccountsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the grant account.
try {
    val result : CapitalGrantAccount = apiInstance.getGrantAccountsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantAccountsApi#getGrantAccountsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantAccountsApi#getGrantAccountsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the grant account. |

### Return type

[**CapitalGrantAccount**](CapitalGrantAccount.md)

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

