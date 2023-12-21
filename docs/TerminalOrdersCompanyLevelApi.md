# TerminalOrdersCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompaniesCompanyIdBillingEntities**](TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdBillingEntities) | **GET** /companies/{companyId}/billingEntities | Get a list of billing entities
[**getCompaniesCompanyIdShippingLocations**](TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdShippingLocations) | **GET** /companies/{companyId}/shippingLocations | Get a list of shipping locations
[**getCompaniesCompanyIdTerminalModels**](TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalModels) | **GET** /companies/{companyId}/terminalModels | Get a list of terminal models
[**getCompaniesCompanyIdTerminalOrders**](TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalOrders) | **GET** /companies/{companyId}/terminalOrders | Get a list of orders
[**getCompaniesCompanyIdTerminalOrdersOrderId**](TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalOrdersOrderId) | **GET** /companies/{companyId}/terminalOrders/{orderId} | Get an order
[**getCompaniesCompanyIdTerminalProducts**](TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalProducts) | **GET** /companies/{companyId}/terminalProducts | Get a list of terminal products
[**patchCompaniesCompanyIdTerminalOrdersOrderId**](TerminalOrdersCompanyLevelApi.md#patchCompaniesCompanyIdTerminalOrdersOrderId) | **PATCH** /companies/{companyId}/terminalOrders/{orderId} | Update an order
[**postCompaniesCompanyIdShippingLocations**](TerminalOrdersCompanyLevelApi.md#postCompaniesCompanyIdShippingLocations) | **POST** /companies/{companyId}/shippingLocations | Create a shipping location
[**postCompaniesCompanyIdTerminalOrders**](TerminalOrdersCompanyLevelApi.md#postCompaniesCompanyIdTerminalOrders) | **POST** /companies/{companyId}/terminalOrders | Create an order
[**postCompaniesCompanyIdTerminalOrdersOrderIdCancel**](TerminalOrdersCompanyLevelApi.md#postCompaniesCompanyIdTerminalOrdersOrderIdCancel) | **POST** /companies/{companyId}/terminalOrders/{orderId}/cancel | Cancel an order


<a name="getCompaniesCompanyIdBillingEntities"></a>
# **getCompaniesCompanyIdBillingEntities**
> BillingEntitiesResponse getCompaniesCompanyIdBillingEntities(companyId, name)

Get a list of billing entities

Returns the billing entities of the company identified in the path and all merchant accounts belonging to the company. A billing entity is a legal entity where we charge orders to. An order for terminal products must contain the ID of a billing entity.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val name : kotlin.String = name_example // kotlin.String | The name of the billing entity.
try {
    val result : BillingEntitiesResponse = apiInstance.getCompaniesCompanyIdBillingEntities(companyId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdBillingEntities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdBillingEntities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdShippingLocations"></a>
# **getCompaniesCompanyIdShippingLocations**
> ShippingLocationsResponse getCompaniesCompanyIdShippingLocations(companyId, name, offset, limit)

Get a list of shipping locations

Returns the shipping locations for the company identified in the path and all merchant accounts belonging to the company. A shipping location includes the address where orders can be delivered, and an ID which you need to specify when ordering terminal products.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val name : kotlin.String = name_example // kotlin.String | The name of the shipping location.
val offset : kotlin.Int = 56 // kotlin.Int | The number of locations to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of locations to return.
try {
    val result : ShippingLocationsResponse = apiInstance.getCompaniesCompanyIdShippingLocations(companyId, name, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdShippingLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdShippingLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdTerminalModels"></a>
# **getCompaniesCompanyIdTerminalModels**
> TerminalModelsResponse getCompaniesCompanyIdTerminalModels(companyId)

Get a list of terminal models

Returns a list of payment terminal models that the company identified in the path has access to. The response includes the terminal model ID, which can be used as a query parameter when getting a list of terminals or a list of products for ordering.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
try {
    val result : TerminalModelsResponse = apiInstance.getCompaniesCompanyIdTerminalModels(companyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalModels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |

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

<a name="getCompaniesCompanyIdTerminalOrders"></a>
# **getCompaniesCompanyIdTerminalOrders**
> TerminalOrdersResponse getCompaniesCompanyIdTerminalOrders(companyId, customerOrderReference, status, offset, limit)

Get a list of orders

Returns a lists of terminal products orders for the company identified in the path. To filter the list, use one or more of the query parameters.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val customerOrderReference : kotlin.String = customerOrderReference_example // kotlin.String | Your purchase order number.
val status : kotlin.String = status_example // kotlin.String | The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered.
val offset : kotlin.Int = 56 // kotlin.Int | The number of orders to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of orders to return.
try {
    val result : TerminalOrdersResponse = apiInstance.getCompaniesCompanyIdTerminalOrders(companyId, customerOrderReference, status, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdTerminalOrdersOrderId"></a>
# **getCompaniesCompanyIdTerminalOrdersOrderId**
> TerminalOrder getCompaniesCompanyIdTerminalOrdersOrderId(companyId, orderId)

Get an order

Returns the details of the terminal products order identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val orderId : kotlin.String = orderId_example // kotlin.String | The unique identifier of the order.
try {
    val result : TerminalOrder = apiInstance.getCompaniesCompanyIdTerminalOrdersOrderId(companyId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalOrdersOrderId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalOrdersOrderId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdTerminalProducts"></a>
# **getCompaniesCompanyIdTerminalProducts**
> TerminalProductsResponse getCompaniesCompanyIdTerminalProducts(companyId, country, terminalModelId, offset, limit)

Get a list of terminal products

Returns a country-specific list of payment terminal packages and parts that the company identified in the path has access to.   To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val country : kotlin.String = country_example // kotlin.String | The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US**
val terminalModelId : kotlin.String = terminalModelId_example // kotlin.String | The terminal model to return products for. Use the ID returned in the [GET `/terminalModels`](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) response. For example, **Verifone.M400**
val offset : kotlin.Int = 56 // kotlin.Int | The number of products to skip.
val limit : kotlin.Int = 56 // kotlin.Int | The number of products to return.
try {
    val result : TerminalProductsResponse = apiInstance.getCompaniesCompanyIdTerminalProducts(companyId, country, terminalModelId, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#getCompaniesCompanyIdTerminalProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **country** | **kotlin.String**| The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** |
 **terminalModelId** | **kotlin.String**| The terminal model to return products for. Use the ID returned in the [GET &#x60;/terminalModels&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) response. For example, **Verifone.M400** | [optional]
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

<a name="patchCompaniesCompanyIdTerminalOrdersOrderId"></a>
# **patchCompaniesCompanyIdTerminalOrdersOrderId**
> TerminalOrder patchCompaniesCompanyIdTerminalOrdersOrderId(companyId, orderId, terminalOrderRequest)

Update an order

Updates the terminal products order identified in the path. Updating is only possible while the order has the status **Placed**.  The request body only needs to contain what you want to change.  However, to update the products in the &#x60;items&#x60; array, you must provide the entire array. For example, if the array has three items:  To remove one item, the array must include the remaining two items. Or to add one item, the array must include all four items.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val orderId : kotlin.String = orderId_example // kotlin.String | The unique identifier of the order.
val terminalOrderRequest : TerminalOrderRequest =  // TerminalOrderRequest | 
try {
    val result : TerminalOrder = apiInstance.patchCompaniesCompanyIdTerminalOrdersOrderId(companyId, orderId, terminalOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#patchCompaniesCompanyIdTerminalOrdersOrderId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#patchCompaniesCompanyIdTerminalOrdersOrderId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="postCompaniesCompanyIdShippingLocations"></a>
# **postCompaniesCompanyIdShippingLocations**
> ShippingLocation postCompaniesCompanyIdShippingLocations(companyId, shippingLocation)

Create a shipping location

Creates a shipping location for the company identified in the path. A shipping location defines an address where orders can be delivered.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val shippingLocation : ShippingLocation =  // ShippingLocation | 
try {
    val result : ShippingLocation = apiInstance.postCompaniesCompanyIdShippingLocations(companyId, shippingLocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#postCompaniesCompanyIdShippingLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#postCompaniesCompanyIdShippingLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="postCompaniesCompanyIdTerminalOrders"></a>
# **postCompaniesCompanyIdTerminalOrders**
> TerminalOrder postCompaniesCompanyIdTerminalOrders(companyId, terminalOrderRequest)

Create an order

Creates an order for payment terminal products for the company identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write &gt;Requests to the Management API test endpoint do not create actual orders for test terminals. To order test terminals, you need to [submit a sales order](https://docs.adyen.com/point-of-sale/managing-terminals/order-terminals/#sales-order-steps) in your Customer Area.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val terminalOrderRequest : TerminalOrderRequest =  // TerminalOrderRequest | 
try {
    val result : TerminalOrder = apiInstance.postCompaniesCompanyIdTerminalOrders(companyId, terminalOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#postCompaniesCompanyIdTerminalOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#postCompaniesCompanyIdTerminalOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="postCompaniesCompanyIdTerminalOrdersOrderIdCancel"></a>
# **postCompaniesCompanyIdTerminalOrdersOrderIdCancel**
> TerminalOrder postCompaniesCompanyIdTerminalOrdersOrderIdCancel(companyId, orderId)

Cancel an order

Cancels the terminal products order identified in the path. Cancelling is only possible while the order has the status **Placed**. To cancel an order, make a POST call without a request body. The response returns the full order details, but with the status changed to **Cancelled**.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal ordering read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = TerminalOrdersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val orderId : kotlin.String = orderId_example // kotlin.String | The unique identifier of the order.
try {
    val result : TerminalOrder = apiInstance.postCompaniesCompanyIdTerminalOrdersOrderIdCancel(companyId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerminalOrdersCompanyLevelApi#postCompaniesCompanyIdTerminalOrdersOrderIdCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerminalOrdersCompanyLevelApi#postCompaniesCompanyIdTerminalOrdersOrderIdCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

