# TransferInstrumentsApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTransferInstrumentsId**](TransferInstrumentsApi.md#deleteTransferInstrumentsId) | **DELETE** /transferInstruments/{id} | Delete a transfer instrument
[**getTransferInstrumentsId**](TransferInstrumentsApi.md#getTransferInstrumentsId) | **GET** /transferInstruments/{id} | Get a transfer instrument
[**patchTransferInstrumentsId**](TransferInstrumentsApi.md#patchTransferInstrumentsId) | **PATCH** /transferInstruments/{id} | Update a transfer instrument
[**postTransferInstruments**](TransferInstrumentsApi.md#postTransferInstruments) | **POST** /transferInstruments | Create a transfer instrument


<a name="deleteTransferInstrumentsId"></a>
# **deleteTransferInstrumentsId**
> deleteTransferInstrumentsId(id)

Delete a transfer instrument

Deletes a transfer instrument.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TransferInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the transfer instrument to be deleted.
try {
    apiInstance.deleteTransferInstrumentsId(id)
} catch (e: ClientException) {
    println("4xx response calling TransferInstrumentsApi#deleteTransferInstrumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransferInstrumentsApi#deleteTransferInstrumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the transfer instrument to be deleted. |

### Return type

null (empty response body)

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

<a name="getTransferInstrumentsId"></a>
# **getTransferInstrumentsId**
> TransferInstrument getTransferInstrumentsId(id)

Get a transfer instrument

Returns the details of a transfer instrument.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TransferInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the transfer instrument.
try {
    val result : TransferInstrument = apiInstance.getTransferInstrumentsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransferInstrumentsApi#getTransferInstrumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransferInstrumentsApi#getTransferInstrumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the transfer instrument. |

### Return type

[**TransferInstrument**](TransferInstrument.md)

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

<a name="patchTransferInstrumentsId"></a>
# **patchTransferInstrumentsId**
> TransferInstrument patchTransferInstrumentsId(id, xRequestedVerificationCode, transferInstrumentInfo)

Update a transfer instrument

Updates a transfer instrument.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TransferInstrumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the transfer instrument.
val xRequestedVerificationCode : kotlin.String = 0_0001 // kotlin.String | Use the requested verification code 0_0001 to resolve any suberrors associated with the transfer instrument. Requested verification codes can only be used in your test environment.
val transferInstrumentInfo : TransferInstrumentInfo =  // TransferInstrumentInfo | 
try {
    val result : TransferInstrument = apiInstance.patchTransferInstrumentsId(id, xRequestedVerificationCode, transferInstrumentInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransferInstrumentsApi#patchTransferInstrumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransferInstrumentsApi#patchTransferInstrumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the transfer instrument. |
 **xRequestedVerificationCode** | **kotlin.String**| Use the requested verification code 0_0001 to resolve any suberrors associated with the transfer instrument. Requested verification codes can only be used in your test environment. | [optional]
 **transferInstrumentInfo** | [**TransferInstrumentInfo**](TransferInstrumentInfo.md)|  | [optional]

### Return type

[**TransferInstrument**](TransferInstrument.md)

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

<a name="postTransferInstruments"></a>
# **postTransferInstruments**
> TransferInstrument postTransferInstruments(xRequestedVerificationCode, transferInstrumentInfo)

Create a transfer instrument

Creates a transfer instrument.   A transfer instrument is a bank account that a legal entity owns. Adyen performs verification checks on the transfer instrument as required by payment industry regulations. We inform you of the verification results through webhooks or API responses.  When the transfer instrument passes the verification checks, you can start sending funds from the balance platform to the transfer instrument (such as payouts).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TransferInstrumentsApi()
val xRequestedVerificationCode : kotlin.String = 1_7002 // kotlin.String | Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment.
val transferInstrumentInfo : TransferInstrumentInfo =  // TransferInstrumentInfo | 
try {
    val result : TransferInstrument = apiInstance.postTransferInstruments(xRequestedVerificationCode, transferInstrumentInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransferInstrumentsApi#postTransferInstruments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransferInstrumentsApi#postTransferInstruments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedVerificationCode** | **kotlin.String**| Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment. | [optional]
 **transferInstrumentInfo** | [**TransferInstrumentInfo**](TransferInstrumentInfo.md)|  | [optional]

### Return type

[**TransferInstrument**](TransferInstrument.md)

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

