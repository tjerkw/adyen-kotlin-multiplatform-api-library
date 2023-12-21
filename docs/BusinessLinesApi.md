# BusinessLinesApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessLinesId**](BusinessLinesApi.md#deleteBusinessLinesId) | **DELETE** /businessLines/{id} | Delete a business line
[**getBusinessLinesId**](BusinessLinesApi.md#getBusinessLinesId) | **GET** /businessLines/{id} | Get a business line
[**patchBusinessLinesId**](BusinessLinesApi.md#patchBusinessLinesId) | **PATCH** /businessLines/{id} | Update a business line
[**postBusinessLines**](BusinessLinesApi.md#postBusinessLines) | **POST** /businessLines | Create a business line


<a name="deleteBusinessLinesId"></a>
# **deleteBusinessLinesId**
> deleteBusinessLinesId(id)

Delete a business line

Deletes a business line.   &gt;If you delete a business line linked to a [payment method](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api), it can affect your merchant account&#39;s ability to use the [payment method](https://docs.adyen.com/api-explorer/Management/latest/post/merchants/_merchantId_/paymentMethodSettings). The business line is removed from all linked merchant accounts.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = BusinessLinesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the business line to be deleted.
try {
    apiInstance.deleteBusinessLinesId(id)
} catch (e: ClientException) {
    println("4xx response calling BusinessLinesApi#deleteBusinessLinesId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessLinesApi#deleteBusinessLinesId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the business line to be deleted. |

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

<a name="getBusinessLinesId"></a>
# **getBusinessLinesId**
> BusinessLine getBusinessLinesId(id)

Get a business line

Returns the detail of a business line.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = BusinessLinesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the business line.
try {
    val result : BusinessLine = apiInstance.getBusinessLinesId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessLinesApi#getBusinessLinesId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessLinesApi#getBusinessLinesId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the business line. |

### Return type

[**BusinessLine**](BusinessLine.md)

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

<a name="patchBusinessLinesId"></a>
# **patchBusinessLinesId**
> BusinessLine patchBusinessLinesId(id, businessLineInfoUpdate)

Update a business line

Updates a business line.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = BusinessLinesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the business line.
val businessLineInfoUpdate : BusinessLineInfoUpdate =  // BusinessLineInfoUpdate | 
try {
    val result : BusinessLine = apiInstance.patchBusinessLinesId(id, businessLineInfoUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessLinesApi#patchBusinessLinesId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessLinesApi#patchBusinessLinesId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the business line. |
 **businessLineInfoUpdate** | [**BusinessLineInfoUpdate**](BusinessLineInfoUpdate.md)|  | [optional]

### Return type

[**BusinessLine**](BusinessLine.md)

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

<a name="postBusinessLines"></a>
# **postBusinessLines**
> BusinessLine postBusinessLines(businessLineInfo)

Create a business line

Creates a business line.   This resource contains information about your user&#39;s line of business, including their industry and their source of funds. Adyen uses this information to verify your users as required by payment industry regulations. Adyen informs you of the verification results through webhooks or API responses.  &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = BusinessLinesApi()
val businessLineInfo : BusinessLineInfo =  // BusinessLineInfo | 
try {
    val result : BusinessLine = apiInstance.postBusinessLines(businessLineInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessLinesApi#postBusinessLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessLinesApi#postBusinessLines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessLineInfo** | [**BusinessLineInfo**](BusinessLineInfo.md)|  | [optional]

### Return type

[**BusinessLine**](BusinessLine.md)

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

