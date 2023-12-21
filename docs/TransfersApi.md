# TransfersApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/btl/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postTransfers**](TransfersApi.md#postTransfers) | **POST** /transfers | Transfer funds
[**postTransfersIdReturns**](TransfersApi.md#postTransfersIdReturns) | **POST** /transfers/{id}/returns | Return a transfer


<a name="postTransfers"></a>
# **postTransfers**
> Transfer postTransfers(wwWAuthenticate, transferInfo)

Transfer funds

&gt;Versions 1 and 2 of the Transfers API are deprecated. If you are just starting your implementation, use the latest version.  Starts a request to transfer funds to [balance accounts](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts), [transfer instruments](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments), or third-party bank accounts. Adyen sends the outcome of the transfer request through webhooks.  To use this endpoint, you need an additional role for your API credential and transfers must be enabled for the source balance account. Your Adyen contact will set these up for you.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = TransfersApi()
val wwWAuthenticate : kotlin.String = SCA realm="Transfer" auth-param1="eyJjaGFsbGVuZ2UiOiJiVlV6ZW5wek0waFNl..." // kotlin.String | Header for authenticating through SCA
val transferInfo : TransferInfo =  // TransferInfo | 
try {
    val result : Transfer = apiInstance.postTransfers(wwWAuthenticate, transferInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransfersApi#postTransfers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransfersApi#postTransfers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwWAuthenticate** | **kotlin.String**| Header for authenticating through SCA | [optional]
 **transferInfo** | [**TransferInfo**](TransferInfo.md)|  | [optional]

### Return type

[**Transfer**](Transfer.md)

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

<a name="postTransfersIdReturns"></a>
# **postTransfersIdReturns**
> ReturnTransferResponse postTransfersIdReturns(id, returnTransferRequest)

Return a transfer

Returns previously transferred funds without creating a new &#x60;transferId&#x60;.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.transfers.*

val apiInstance = TransfersApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the transfer to be returned.
val returnTransferRequest : ReturnTransferRequest =  // ReturnTransferRequest | 
try {
    val result : ReturnTransferResponse = apiInstance.postTransfersIdReturns(id, returnTransferRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransfersApi#postTransfersIdReturns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransfersApi#postTransfersIdReturns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the transfer to be returned. |
 **returnTransferRequest** | [**ReturnTransferRequest**](ReturnTransferRequest.md)|  | [optional]

### Return type

[**ReturnTransferResponse**](ReturnTransferResponse.md)

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

