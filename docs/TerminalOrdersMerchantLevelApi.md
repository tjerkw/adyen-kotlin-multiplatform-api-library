# TerminalOrdersMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdBillingEntities**](TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdBillingEntities) | **GET** /merchants/{merchantId}/billingEntities | Get a list of billing entities
[**getMerchantsMerchantIdShippingLocations**](TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdShippingLocations) | **GET** /merchants/{merchantId}/shippingLocations | Get a list of shipping locations
[**getMerchantsMerchantIdTerminalModels**](TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalModels) | **GET** /merchants/{merchantId}/terminalModels | Get a list of terminal models
[**getMerchantsMerchantIdTerminalOrders**](TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalOrders) | **GET** /merchants/{merchantId}/terminalOrders | Get a list of orders
[**getMerchantsMerchantIdTerminalOrdersOrderId**](TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalOrdersOrderId) | **GET** /merchants/{merchantId}/terminalOrders/{orderId} | Get an order
[**getMerchantsMerchantIdTerminalProducts**](TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalProducts) | **GET** /merchants/{merchantId}/terminalProducts | Get a list of terminal products
[**patchMerchantsMerchantIdTerminalOrdersOrderId**](TerminalOrdersMerchantLevelApi.md#patchMerchantsMerchantIdTerminalOrdersOrderId) | **PATCH** /merchants/{merchantId}/terminalOrders/{orderId} | Update an order
[**postMerchantsMerchantIdShippingLocations**](TerminalOrdersMerchantLevelApi.md#postMerchantsMerchantIdShippingLocations) | **POST** /merchants/{merchantId}/shippingLocations | Create a shipping location
[**postMerchantsMerchantIdTerminalOrders**](TerminalOrdersMerchantLevelApi.md#postMerchantsMerchantIdTerminalOrders) | **POST** /merchants/{merchantId}/terminalOrders | Create an order
[**postMerchantsMerchantIdTerminalOrdersOrderIdCancel**](TerminalOrdersMerchantLevelApi.md#postMerchantsMerchantIdTerminalOrdersOrderIdCancel) | **POST** /merchants/{merchantId}/terminalOrders/{orderId}/cancel | Cancel an order


<a name="getMerchantsMerchantIdBillingEntities"></a>
# **getMerchantsMerchantIdBillingEntities**
> BillingEntitiesResponse getMerchantsMerchantIdBillingEntities(merchantId, name)

Get a list of billing entities

Returns the billing entities of the merchant account identified in the path. A billing entity is a legal entity where we charge orders to. An order for terminal products must contain the ID of a billing entity.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val name : kotlin.String = name_example // kotlin.String | The name of the billing entity.
try {
    val result : BillingEntitiesResponse = apiInstance.getMerchantsMerchantIdBillingEntities(merchantId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdBillingEntities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdBillingEntities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **name** | **kotlin.String**| The name of the billing entity. | [optional]

### Return type

[**BillingEntitiesResponse**](BillingEntitiesResponse.md)

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

<a name="getMerchantsMerchantIdShippingLocations"></a>
# **getMerchantsMerchantIdShippingLocations**
> ShippingLocationsResponse getMerchantsMerchantIdShippingLocations(merchantId, name, offset, limit)

Get a list of shipping locations

Returns the shipping locations for the merchant account identified in the path. A shipping location includes the address where orders can be delivered, and an ID which you need to specify when ordering terminal products.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val name : kotlin.String = name_example // kotlin.String | The name of the shipping location.
val offset : kotlin.Int = 56 // kotlin.Int | The number of locations to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of locations to return.
try {
    val result : ShippingLocationsResponse = apiInstance.getMerchantsMerchantIdShippingLocations(merchantId, name, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdShippingLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdShippingLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **name** | **kotlin.String**| The name of the shipping location. | [optional]
 **offset** | **kotlin.Int**| The number of locations to skip. | [optional]
 **limit** | **kotlin.Int**| The number of locations to return. | [optional]

### Return type

[**ShippingLocationsResponse**](ShippingLocationsResponse.md)

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

<a name="getMerchantsMerchantIdTerminalModels"></a>
# **getMerchantsMerchantIdTerminalModels**
> TerminalModelsResponse getMerchantsMerchantIdTerminalModels(merchantId)

Get a list of terminal models

Returns the payment terminal models that merchant account identified in the path has access to. The response includes the terminal model ID, which can be used as a query parameter when getting a list of terminals or a list of products for ordering.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : TerminalModelsResponse = apiInstance.getMerchantsMerchantIdTerminalModels(merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalModels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |

### Return type

[**TerminalModelsResponse**](TerminalModelsResponse.md)

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

<a name="getMerchantsMerchantIdTerminalOrders"></a>
# **getMerchantsMerchantIdTerminalOrders**
> TerminalOrdersResponse getMerchantsMerchantIdTerminalOrders(merchantId, customerOrderReference, status, offset, limit)

Get a list of orders

Returns a list of terminal products orders for the merchant account identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | 
val customerOrderReference : kotlin.String = customerOrderReference_example // kotlin.String | Your purchase order number.
val status : kotlin.String = status_example // kotlin.String | The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered.
val offset : kotlin.Int = 56 // kotlin.Int | The number of orders to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of orders to return.
try {
    val result : TerminalOrdersResponse = apiInstance.getMerchantsMerchantIdTerminalOrders(merchantId, customerOrderReference, status, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**|  |
 **customerOrderReference** | **kotlin.String**| Your purchase order number. | [optional]
 **status** | **kotlin.String**| The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered. | [optional]
 **offset** | **kotlin.Int**| The number of orders to skip. | [optional]
 **limit** | **kotlin.Int**| The number of orders to return. | [optional]

### Return type

[**TerminalOrdersResponse**](TerminalOrdersResponse.md)

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

<a name="getMerchantsMerchantIdTerminalOrdersOrderId"></a>
# **getMerchantsMerchantIdTerminalOrdersOrderId**
> TerminalOrder getMerchantsMerchantIdTerminalOrdersOrderId(merchantId, orderId)

Get an order

Returns the details of the terminal products order identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val orderId : kotlin.String = orderId_example // kotlin.String | The unique identifier of the order.
try {
    val result : TerminalOrder = apiInstance.getMerchantsMerchantIdTerminalOrdersOrderId(merchantId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalOrdersOrderId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalOrdersOrderId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **orderId** | **kotlin.String**| The unique identifier of the order. |

### Return type

[**TerminalOrder**](TerminalOrder.md)

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

<a name="getMerchantsMerchantIdTerminalProducts"></a>
# **getMerchantsMerchantIdTerminalProducts**
> TerminalProductsResponse getMerchantsMerchantIdTerminalProducts(merchantId, country, terminalModelId, offset, limit)

Get a list of terminal products

Returns a country-specific list of payment terminal packages and parts that the merchant account identified in the path has access to.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val country : kotlin.String = country_example // kotlin.String | The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US**
val terminalModelId : kotlin.String = terminalModelId_example // kotlin.String | The terminal model to return products for. Use the ID returned in the [GET `/terminalModels`](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/merchants/{merchantId}/terminalModels) response. For example, **Verifone.M400**
val offset : kotlin.Int = 56 // kotlin.Int | The number of products to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of products to return.
try {
    val result : TerminalProductsResponse = apiInstance.getMerchantsMerchantIdTerminalProducts(merchantId, country, terminalModelId, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#getMerchantsMerchantIdTerminalProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **country** | **kotlin.String**| The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** |
 **terminalModelId** | **kotlin.String**| The terminal model to return products for. Use the ID returned in the [GET &#x60;/terminalModels&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/merchants/{merchantId}/terminalModels) response. For example, **Verifone.M400** | [optional]
 **offset** | **kotlin.Int**| The number of products to skip. | [optional]
 **limit** | **kotlin.Int**| The number of products to return. | [optional]

### Return type

[**TerminalProductsResponse**](TerminalProductsResponse.md)

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

<a name="patchMerchantsMerchantIdTerminalOrdersOrderId"></a>
# **patchMerchantsMerchantIdTerminalOrdersOrderId**
> TerminalOrder patchMerchantsMerchantIdTerminalOrdersOrderId(merchantId, orderId, terminalOrderRequest)

Update an order

Updates the terminal products order identified in the path. Updating is only possible while the order has the status **Placed**.  The request body only needs to contain what you want to change.  However, to update the products in the &#x60;items&#x60; array, you must provide the entire array. For example, if the array has three items:  To remove one item, the array must include the remaining two items. Or to add one item, the array must include all four items.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val orderId : kotlin.String = orderId_example // kotlin.String | The unique identifier of the order.
val terminalOrderRequest : TerminalOrderRequest =  // TerminalOrderRequest | 
try {
    val result : TerminalOrder = apiInstance.patchMerchantsMerchantIdTerminalOrdersOrderId(merchantId, orderId, terminalOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#patchMerchantsMerchantIdTerminalOrdersOrderId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#patchMerchantsMerchantIdTerminalOrdersOrderId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **orderId** | **kotlin.String**| The unique identifier of the order. |
 **terminalOrderRequest** | [**TerminalOrderRequest**](TerminalOrderRequest.md)|  | [optional]

### Return type

[**TerminalOrder**](TerminalOrder.md)

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

<a name="postMerchantsMerchantIdShippingLocations"></a>
# **postMerchantsMerchantIdShippingLocations**
> ShippingLocation postMerchantsMerchantIdShippingLocations(merchantId, shippingLocation)

Create a shipping location

Creates a shipping location for the merchant account identified in the path. A shipping location defines an address where orders can be shipped to.   To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val shippingLocation : ShippingLocation =  // ShippingLocation | 
try {
    val result : ShippingLocation = apiInstance.postMerchantsMerchantIdShippingLocations(merchantId, shippingLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#postMerchantsMerchantIdShippingLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#postMerchantsMerchantIdShippingLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **shippingLocation** | [**ShippingLocation**](ShippingLocation.md)|  | [optional]

### Return type

[**ShippingLocation**](ShippingLocation.md)

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

<a name="postMerchantsMerchantIdTerminalOrders"></a>
# **postMerchantsMerchantIdTerminalOrders**
> TerminalOrder postMerchantsMerchantIdTerminalOrders(merchantId, terminalOrderRequest)

Create an order

Creates an order for payment terminal products for the merchant account identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write &gt;Requests to the Management API test endpoint do not create actual orders for test terminals. To order test terminals, you need to [submit a sales order](https://docs.adyen.com/point-of-sale/managing-terminals/order-terminals/#sales-order-steps) in your Customer Area.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val terminalOrderRequest : TerminalOrderRequest =  // TerminalOrderRequest | 
try {
    val result : TerminalOrder = apiInstance.postMerchantsMerchantIdTerminalOrders(merchantId, terminalOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#postMerchantsMerchantIdTerminalOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#postMerchantsMerchantIdTerminalOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **terminalOrderRequest** | [**TerminalOrderRequest**](TerminalOrderRequest.md)|  | [optional]

### Return type

[**TerminalOrder**](TerminalOrder.md)

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

<a name="postMerchantsMerchantIdTerminalOrdersOrderIdCancel"></a>
# **postMerchantsMerchantIdTerminalOrdersOrderIdCancel**
> TerminalOrder postMerchantsMerchantIdTerminalOrdersOrderIdCancel(merchantId, orderId)

Cancel an order

Cancels the terminal products order identified in the path. Cancelling is only possible while the order has the status **Placed**. To cancel an order, make a POST call without a request body. The response returns the full order details, but with the status changed to **Cancelled**.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val orderId : kotlin.String = orderId_example // kotlin.String | The unique identifier of the order.
try {
    val result : TerminalOrder = apiInstance.postMerchantsMerchantIdTerminalOrdersOrderIdCancel(merchantId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersMerchantLevelApi#postMerchantsMerchantIdTerminalOrdersOrderIdCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersMerchantLevelApi#postMerchantsMerchantIdTerminalOrdersOrderIdCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **orderId** | **kotlin.String**| The unique identifier of the order. |

### Return type

[**TerminalOrder**](TerminalOrder.md)

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

