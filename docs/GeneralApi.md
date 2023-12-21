# GeneralApi

All URIs are relative to *https://ca-test.adyen.com/ca/services/DisputeService/v30*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAcceptDispute**](GeneralApi.md#postAcceptDispute) | **POST** /acceptDispute | Accept a dispute
[**postDefendDispute**](GeneralApi.md#postDefendDispute) | **POST** /defendDispute | Defend a dispute
[**postDeleteDisputeDefenseDocument**](GeneralApi.md#postDeleteDisputeDefenseDocument) | **POST** /deleteDisputeDefenseDocument | Delete a defense document
[**postRetrieveApplicableDefenseReasons**](GeneralApi.md#postRetrieveApplicableDefenseReasons) | **POST** /retrieveApplicableDefenseReasons | Get applicable defense reasons
[**postSupplyDefenseDocument**](GeneralApi.md#postSupplyDefenseDocument) | **POST** /supplyDefenseDocument | Supply a defense document


<a name="postAcceptDispute"></a>
# **postAcceptDispute**
> AcceptDisputeResponse postAcceptDispute(acceptDisputeRequest)

Accept a dispute

Accepts a specific dispute.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.disputes.*

val apiInstance = GeneralApi()
val acceptDisputeRequest : AcceptDisputeRequest =  // AcceptDisputeRequest | 
try {
    val result : AcceptDisputeResponse = apiInstance.postAcceptDispute(acceptDisputeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#postAcceptDispute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#postAcceptDispute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptDisputeRequest** | [**AcceptDisputeRequest**](AcceptDisputeRequest.md)|  | [optional]

### Return type

[**AcceptDisputeResponse**](AcceptDisputeResponse.md)

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

<a name="postDefendDispute"></a>
# **postDefendDispute**
> DefendDisputeResponse postDefendDispute(defendDisputeRequest)

Defend a dispute

Defends a specific dispute.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.disputes.*

val apiInstance = GeneralApi()
val defendDisputeRequest : DefendDisputeRequest =  // DefendDisputeRequest | 
try {
    val result : DefendDisputeResponse = apiInstance.postDefendDispute(defendDisputeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#postDefendDispute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#postDefendDispute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defendDisputeRequest** | [**DefendDisputeRequest**](DefendDisputeRequest.md)|  | [optional]

### Return type

[**DefendDisputeResponse**](DefendDisputeResponse.md)

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

<a name="postDeleteDisputeDefenseDocument"></a>
# **postDeleteDisputeDefenseDocument**
> DeleteDefenseDocumentResponse postDeleteDisputeDefenseDocument(deleteDefenseDocumentRequest)

Delete a defense document

Deletes a specific dispute defense document that was supplied earlier.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.disputes.*

val apiInstance = GeneralApi()
val deleteDefenseDocumentRequest : DeleteDefenseDocumentRequest =  // DeleteDefenseDocumentRequest | 
try {
    val result : DeleteDefenseDocumentResponse = apiInstance.postDeleteDisputeDefenseDocument(deleteDefenseDocumentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#postDeleteDisputeDefenseDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#postDeleteDisputeDefenseDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteDefenseDocumentRequest** | [**DeleteDefenseDocumentRequest**](DeleteDefenseDocumentRequest.md)|  | [optional]

### Return type

[**DeleteDefenseDocumentResponse**](DeleteDefenseDocumentResponse.md)

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

<a name="postRetrieveApplicableDefenseReasons"></a>
# **postRetrieveApplicableDefenseReasons**
> DefenseReasonsResponse postRetrieveApplicableDefenseReasons(defenseReasonsRequest)

Get applicable defense reasons

Returns a list of all applicable defense reasons to defend a specific dispute.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.disputes.*

val apiInstance = GeneralApi()
val defenseReasonsRequest : DefenseReasonsRequest =  // DefenseReasonsRequest | 
try {
    val result : DefenseReasonsResponse = apiInstance.postRetrieveApplicableDefenseReasons(defenseReasonsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#postRetrieveApplicableDefenseReasons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#postRetrieveApplicableDefenseReasons")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defenseReasonsRequest** | [**DefenseReasonsRequest**](DefenseReasonsRequest.md)|  | [optional]

### Return type

[**DefenseReasonsResponse**](DefenseReasonsResponse.md)

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

<a name="postSupplyDefenseDocument"></a>
# **postSupplyDefenseDocument**
> SupplyDefenseDocumentResponse postSupplyDefenseDocument(supplyDefenseDocumentRequest)

Supply a defense document

Supplies a specific dispute defense document.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.disputes.*

val apiInstance = GeneralApi()
val supplyDefenseDocumentRequest : SupplyDefenseDocumentRequest =  // SupplyDefenseDocumentRequest | 
try {
    val result : SupplyDefenseDocumentResponse = apiInstance.postSupplyDefenseDocument(supplyDefenseDocumentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#postSupplyDefenseDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#postSupplyDefenseDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplyDefenseDocumentRequest** | [**SupplyDefenseDocumentRequest**](SupplyDefenseDocumentRequest.md)|  | [optional]

### Return type

[**SupplyDefenseDocumentResponse**](SupplyDefenseDocumentResponse.md)

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

