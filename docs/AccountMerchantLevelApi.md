# AccountMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchants**](AccountMerchantLevelApi.md#getMerchants) | **GET** /merchants | Get a list of merchant accounts
[**getMerchantsMerchantId**](AccountMerchantLevelApi.md#getMerchantsMerchantId) | **GET** /merchants/{merchantId} | Get a merchant account
[**postMerchants**](AccountMerchantLevelApi.md#postMerchants) | **POST** /merchants | Create a merchant account
[**postMerchantsMerchantIdActivate**](AccountMerchantLevelApi.md#postMerchantsMerchantIdActivate) | **POST** /merchants/{merchantId}/activate | Request to activate a merchant account


<a name="getMerchants"></a>
# **getMerchants**
> ListMerchantResponse getMerchants(pageNumber, pageSize)

Get a list of merchant accounts

Returns the list of merchant accounts that your API credential has access to. The list is grouped into pages as defined by the query parameters.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountMerchantLevelApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListMerchantResponse = apiInstance.getMerchants(pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountMerchantLevelApi#getMerchants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountMerchantLevelApi#getMerchants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]

### Return type

[**ListMerchantResponse**](ListMerchantResponse.md)

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

<a name="getMerchantsMerchantId"></a>
# **getMerchantsMerchantId**
> Merchant getMerchantsMerchantId(merchantId)

Get a merchant account

Returns the merchant account specified in the path. Your API credential must have access to the merchant account.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : Merchant = apiInstance.getMerchantsMerchantId(merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountMerchantLevelApi#getMerchantsMerchantId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountMerchantLevelApi#getMerchantsMerchantId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |

### Return type

[**Merchant**](Merchant.md)

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

<a name="postMerchants"></a>
# **postMerchants**
> CreateMerchantResponse postMerchants(createMerchantRequest)

Create a merchant account

Creates a merchant account for the company account specified in the request.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Accounts read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountMerchantLevelApi()
val createMerchantRequest : CreateMerchantRequest =  // CreateMerchantRequest | 
try {
    val result : CreateMerchantResponse = apiInstance.postMerchants(createMerchantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountMerchantLevelApi#postMerchants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountMerchantLevelApi#postMerchants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMerchantRequest** | [**CreateMerchantRequest**](CreateMerchantRequest.md)|  | [optional]

### Return type

[**CreateMerchantResponse**](CreateMerchantResponse.md)

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

<a name="postMerchantsMerchantIdActivate"></a>
# **postMerchantsMerchantIdActivate**
> RequestActivationResponse postMerchantsMerchantIdActivate(merchantId)

Request to activate a merchant account

Sends a request to activate the merchant account identified in the path.  You get the result of the activation asynchronously through a [&#x60;merchant.updated&#x60;](https://docs.adyen.com/api-explorer/ManagementNotification/latest/post/merchant.updated) webhook. Once the merchant account is activated, you can start using it to accept payments and payouts.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Accounts read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : RequestActivationResponse = apiInstance.postMerchantsMerchantIdActivate(merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountMerchantLevelApi#postMerchantsMerchantIdActivate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountMerchantLevelApi#postMerchantsMerchantIdActivate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |

### Return type

[**RequestActivationResponse**](RequestActivationResponse.md)

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

