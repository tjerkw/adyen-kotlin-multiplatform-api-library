# AccountStoreLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdStores**](AccountStoreLevelApi.md#getMerchantsMerchantIdStores) | **GET** /merchants/{merchantId}/stores | Get a list of stores
[**getMerchantsMerchantIdStoresStoreId**](AccountStoreLevelApi.md#getMerchantsMerchantIdStoresStoreId) | **GET** /merchants/{merchantId}/stores/{storeId} | Get a store
[**getStores**](AccountStoreLevelApi.md#getStores) | **GET** /stores | Get a list of stores
[**getStoresStoreId**](AccountStoreLevelApi.md#getStoresStoreId) | **GET** /stores/{storeId} | Get a store
[**patchMerchantsMerchantIdStoresStoreId**](AccountStoreLevelApi.md#patchMerchantsMerchantIdStoresStoreId) | **PATCH** /merchants/{merchantId}/stores/{storeId} | Update a store
[**patchStoresStoreId**](AccountStoreLevelApi.md#patchStoresStoreId) | **PATCH** /stores/{storeId} | Update a store
[**postMerchantsMerchantIdStores**](AccountStoreLevelApi.md#postMerchantsMerchantIdStores) | **POST** /merchants/{merchantId}/stores | Create a store
[**postStores**](AccountStoreLevelApi.md#postStores) | **POST** /stores | Create a store


<a name="getMerchantsMerchantIdStores"></a>
# **getMerchantsMerchantIdStores**
> ListStoresResponse getMerchantsMerchantIdStores(merchantId, pageNumber, pageSize, reference)

Get a list of stores

Returns a list of stores for the merchant account identified in the path. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
val reference : kotlin.String = reference_example // kotlin.String | The reference of the store.
try {
    val result : ListStoresResponse = apiInstance.getMerchantsMerchantIdStores(merchantId, pageNumber, pageSize, reference)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#getMerchantsMerchantIdStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#getMerchantsMerchantIdStores")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]
 **reference** | **kotlin.String**| The reference of the store. | [optional]

### Return type

[**ListStoresResponse**](ListStoresResponse.md)

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

<a name="getMerchantsMerchantIdStoresStoreId"></a>
# **getMerchantsMerchantIdStoresStoreId**
> Store getMerchantsMerchantIdStoresStoreId(merchantId, storeId)

Get a store

Returns the details of the store identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
try {
    val result : Store = apiInstance.getMerchantsMerchantIdStoresStoreId(merchantId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#getMerchantsMerchantIdStoresStoreId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#getMerchantsMerchantIdStoresStoreId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **storeId** | **kotlin.String**| The unique identifier of the store. |

### Return type

[**Store**](Store.md)

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

<a name="getStores"></a>
# **getStores**
> ListStoresResponse getStores(pageNumber, pageSize, reference, merchantId)

Get a list of stores

Returns a list of stores. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
val reference : kotlin.String = reference_example // kotlin.String | The reference of the store.
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : ListStoresResponse = apiInstance.getStores(pageNumber, pageSize, reference, merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#getStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#getStores")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]
 **reference** | **kotlin.String**| The reference of the store. | [optional]
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. | [optional]

### Return type

[**ListStoresResponse**](ListStoresResponse.md)

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

<a name="getStoresStoreId"></a>
# **getStoresStoreId**
> Store getStoresStoreId(storeId)

Get a store

Returns the details of the store identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
try {
    val result : Store = apiInstance.getStoresStoreId(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#getStoresStoreId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#getStoresStoreId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**| The unique identifier of the store. |

### Return type

[**Store**](Store.md)

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

<a name="patchMerchantsMerchantIdStoresStoreId"></a>
# **patchMerchantsMerchantIdStoresStoreId**
> Store patchMerchantsMerchantIdStoresStoreId(merchantId, storeId, updateStoreRequest)

Update a store

Updates the store identified in the path. You can only update some store parameters.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
val updateStoreRequest : UpdateStoreRequest =  // UpdateStoreRequest | 
try {
    val result : Store = apiInstance.patchMerchantsMerchantIdStoresStoreId(merchantId, storeId, updateStoreRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#patchMerchantsMerchantIdStoresStoreId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#patchMerchantsMerchantIdStoresStoreId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **storeId** | **kotlin.String**| The unique identifier of the store. |
 **updateStoreRequest** | [**UpdateStoreRequest**](UpdateStoreRequest.md)|  | [optional]

### Return type

[**Store**](Store.md)

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

<a name="patchStoresStoreId"></a>
# **patchStoresStoreId**
> Store patchStoresStoreId(storeId, updateStoreRequest)

Update a store

Updates the store identified in the path. You can only update some store parameters.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store.
val updateStoreRequest : UpdateStoreRequest =  // UpdateStoreRequest | 
try {
    val result : Store = apiInstance.patchStoresStoreId(storeId, updateStoreRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#patchStoresStoreId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#patchStoresStoreId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **kotlin.String**| The unique identifier of the store. |
 **updateStoreRequest** | [**UpdateStoreRequest**](UpdateStoreRequest.md)|  | [optional]

### Return type

[**Store**](Store.md)

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

<a name="postMerchantsMerchantIdStores"></a>
# **postMerchantsMerchantIdStores**
> Store postMerchantsMerchantIdStores(merchantId, storeCreationRequest)

Create a store

Creates a store for the merchant account identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val storeCreationRequest : StoreCreationRequest =  // StoreCreationRequest | 
try {
    val result : Store = apiInstance.postMerchantsMerchantIdStores(merchantId, storeCreationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#postMerchantsMerchantIdStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#postMerchantsMerchantIdStores")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **storeCreationRequest** | [**StoreCreationRequest**](StoreCreationRequest.md)|  | [optional]

### Return type

[**Store**](Store.md)

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

<a name="postStores"></a>
# **postStores**
> Store postStores(storeCreationWithMerchantCodeRequest)

Create a store

Creates a store for the merchant account specified in the request.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Stores read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountStoreLevelApi()
val storeCreationWithMerchantCodeRequest : StoreCreationWithMerchantCodeRequest =  // StoreCreationWithMerchantCodeRequest | 
try {
    val result : Store = apiInstance.postStores(storeCreationWithMerchantCodeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountStoreLevelApi#postStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountStoreLevelApi#postStores")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeCreationWithMerchantCodeRequest** | [**StoreCreationWithMerchantCodeRequest**](StoreCreationWithMerchantCodeRequest.md)|  | [optional]

### Return type

[**Store**](Store.md)

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

