# CapitalApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/btl/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGrants**](CapitalApi.md#getGrants) | **GET** /grants | Get a capital account
[**getGrantsId**](CapitalApi.md#getGrantsId) | **GET** /grants/{id} | Get grant reference details
[**postGrants**](CapitalApi.md#postGrants) | **POST** /grants | Request a grant payout


<a name="getGrants"></a>
# **getGrants**
> CapitalGrants getGrants(counterpartyAccountHolderId)

Get a capital account

Returns a list of grants with status and outstanding balances.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = CapitalApi()
val counterpartyAccountHolderId : kotlin.String = counterpartyAccountHolderId_example // kotlin.String | The counterparty account holder id.
try {
    val result : CapitalGrants = apiInstance.getGrants(counterpartyAccountHolderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CapitalApi#getGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CapitalApi#getGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyAccountHolderId** | **kotlin.String**| The counterparty account holder id. | [optional]

### Return type

[**CapitalGrants**](CapitalGrants.md)

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

<a name="getGrantsId"></a>
# **getGrantsId**
> CapitalGrant getGrantsId(id)

Get grant reference details

Returns the details of a capital account specified in the path.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = CapitalApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the grant.
try {
    val result : CapitalGrant = apiInstance.getGrantsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CapitalApi#getGrantsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CapitalApi#getGrantsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the grant. |

### Return type

[**CapitalGrant**](CapitalGrant.md)

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

<a name="postGrants"></a>
# **postGrants**
> CapitalGrant postGrants(capitalGrantInfo)

Request a grant payout

Requests the payout of the selected grant offer.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = CapitalApi()
val capitalGrantInfo : CapitalGrantInfo =  // CapitalGrantInfo | 
try {
    val result : CapitalGrant = apiInstance.postGrants(capitalGrantInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CapitalApi#postGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CapitalApi#postGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **capitalGrantInfo** | [**CapitalGrantInfo**](CapitalGrantInfo.md)|  | [optional]

### Return type

[**CapitalGrant**](CapitalGrant.md)

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

