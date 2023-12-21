# DocumentsApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocumentsId**](DocumentsApi.md#deleteDocumentsId) | **DELETE** /documents/{id} | Delete a document
[**getDocumentsId**](DocumentsApi.md#getDocumentsId) | **GET** /documents/{id} | Get a document
[**patchDocumentsId**](DocumentsApi.md#patchDocumentsId) | **PATCH** /documents/{id} | Update a document
[**postDocuments**](DocumentsApi.md#postDocuments) | **POST** /documents | Upload a document for verification checks


<a name="deleteDocumentsId"></a>
# **deleteDocumentsId**
> deleteDocumentsId(id)

Delete a document

Deletes a document.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = DocumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the document to be deleted.
try {
    apiInstance.deleteDocumentsId(id)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#deleteDocumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#deleteDocumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the document to be deleted. |

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

<a name="getDocumentsId"></a>
# **getDocumentsId**
> Document getDocumentsId(id)

Get a document

Returns a document.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = DocumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the document.
try {
    val result : Document = apiInstance.getDocumentsId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#getDocumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#getDocumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the document. |

### Return type

[**Document**](Document.md)

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

<a name="patchDocumentsId"></a>
# **patchDocumentsId**
> Document patchDocumentsId(id, xRequestedVerificationCode, document)

Update a document

Updates a document.   &gt;You can upload a maximum of 15 pages for photo IDs.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = DocumentsApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the document to be updated.
val xRequestedVerificationCode : kotlin.String = 0_0001 // kotlin.String | Use the requested verification code 0_0001 to resolve any suberrors associated with the document. Requested verification codes can only be used in your test environment.
val document : Document =  // Document | 
try {
    val result : Document = apiInstance.patchDocumentsId(id, xRequestedVerificationCode, document)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#patchDocumentsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#patchDocumentsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the document to be updated. |
 **xRequestedVerificationCode** | **kotlin.String**| Use the requested verification code 0_0001 to resolve any suberrors associated with the document. Requested verification codes can only be used in your test environment. | [optional]
 **document** | [**Document**](Document.md)|  | [optional]

### Return type

[**Document**](Document.md)

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

<a name="postDocuments"></a>
# **postDocuments**
> Document postDocuments(xRequestedVerificationCode, document)

Upload a document for verification checks

Uploads a document for verification checks.   Adyen uses the information from the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities) to run automated verification checks. If these checks fail, you will be notified to provide additional documents.   You should only upload documents when Adyen requests additional information for the legal entity.   &gt;You can upload a maximum of 15 pages for photo IDs.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = DocumentsApi()
val xRequestedVerificationCode : kotlin.String = 1_3008 // kotlin.String | Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment.
val document : Document =  // Document | 
try {
    val result : Document = apiInstance.postDocuments(xRequestedVerificationCode, document)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#postDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#postDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedVerificationCode** | **kotlin.String**| Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment. | [optional]
 **document** | [**Document**](Document.md)|  | [optional]

### Return type

[**Document**](Document.md)

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

