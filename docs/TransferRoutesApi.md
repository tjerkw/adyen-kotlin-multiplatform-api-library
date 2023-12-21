# TransferRoutesApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postTransferRoutesCalculate**](TransferRoutesApi.md#postTransferRoutesCalculate) | **POST** /transferRoutes/calculate | Calculate transfer routes


<a name="postTransferRoutesCalculate"></a>
# **postTransferRoutesCalculate**
> TransferRouteResponse postTransferRoutesCalculate(transferRouteRequest)

Calculate transfer routes

Returns available transfer routes based on a combination of transfer &#x60;country&#x60;, &#x60;currency&#x60;, &#x60;counterparty&#x60;, and &#x60;priorities&#x60;. Use this endpoint to find optimal transfer priorities and associated requirements before you [make a transfer](https://docs.adyen.com/api-explorer/transfers/latest/post/transfers).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = TransferRoutesApi()
val transferRouteRequest : TransferRouteRequest =  // TransferRouteRequest | 
try {
    val result : TransferRouteResponse = apiInstance.postTransferRoutesCalculate(transferRouteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransferRoutesApi#postTransferRoutesCalculate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransferRoutesApi#postTransferRoutesCalculate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRouteRequest** | [**TransferRouteRequest**](TransferRouteRequest.md)|  | [optional]

### Return type

[**TransferRouteResponse**](TransferRouteResponse.md)

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

