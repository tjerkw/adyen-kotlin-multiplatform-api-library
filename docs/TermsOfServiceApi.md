# TermsOfServiceApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLegalEntitiesIdTermsOfServiceAcceptanceInfos**](TermsOfServiceApi.md#getLegalEntitiesIdTermsOfServiceAcceptanceInfos) | **GET** /legalEntities/{id}/termsOfServiceAcceptanceInfos | Get Terms of Service information for a legal entity
[**getLegalEntitiesIdTermsOfServiceStatus**](TermsOfServiceApi.md#getLegalEntitiesIdTermsOfServiceStatus) | **GET** /legalEntities/{id}/termsOfServiceStatus | Get Terms of Service status
[**patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid**](TermsOfServiceApi.md#patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid) | **PATCH** /legalEntities/{id}/termsOfService/{termsofservicedocumentid} | Accept Terms of Service
[**postLegalEntitiesIdTermsOfService**](TermsOfServiceApi.md#postLegalEntitiesIdTermsOfService) | **POST** /legalEntities/{id}/termsOfService | Get Terms of Service document


<a name="getLegalEntitiesIdTermsOfServiceAcceptanceInfos"></a>
# **getLegalEntitiesIdTermsOfServiceAcceptanceInfos**
> GetTermsOfServiceAcceptanceInfosResponse getLegalEntitiesIdTermsOfServiceAcceptanceInfos(id)

Get Terms of Service information for a legal entity

Returns Terms of Service information for a legal entity.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TermsOfServiceApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner.
try {
    val result : GetTermsOfServiceAcceptanceInfosResponse = apiInstance.getLegalEntitiesIdTermsOfServiceAcceptanceInfos(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsOfServiceApi#getLegalEntitiesIdTermsOfServiceAcceptanceInfos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsOfServiceApi#getLegalEntitiesIdTermsOfServiceAcceptanceInfos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner. |

### Return type

[**GetTermsOfServiceAcceptanceInfosResponse**](GetTermsOfServiceAcceptanceInfosResponse.md)

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

<a name="getLegalEntitiesIdTermsOfServiceStatus"></a>
# **getLegalEntitiesIdTermsOfServiceStatus**
> CalculateTermsOfServiceStatusResponse getLegalEntitiesIdTermsOfServiceStatus(id)

Get Terms of Service status

Returns the required types of Terms of Service that need to be accepted by a legal entity.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TermsOfServiceApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner.
try {
    val result : CalculateTermsOfServiceStatusResponse = apiInstance.getLegalEntitiesIdTermsOfServiceStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsOfServiceApi#getLegalEntitiesIdTermsOfServiceStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsOfServiceApi#getLegalEntitiesIdTermsOfServiceStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner. |

### Return type

[**CalculateTermsOfServiceStatusResponse**](CalculateTermsOfServiceStatusResponse.md)

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

<a name="patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid"></a>
# **patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid**
> AcceptTermsOfServiceResponse patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid(id, termsofservicedocumentid, acceptTermsOfServiceRequest)

Accept Terms of Service

Accepts Terms of Service.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TermsOfServiceApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner.
val termsofservicedocumentid : kotlin.String = termsofservicedocumentid_example // kotlin.String | The unique identifier of the Terms of Service document.
val acceptTermsOfServiceRequest : AcceptTermsOfServiceRequest =  // AcceptTermsOfServiceRequest | 
try {
    val result : AcceptTermsOfServiceResponse = apiInstance.patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid(id, termsofservicedocumentid, acceptTermsOfServiceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsOfServiceApi#patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsOfServiceApi#patchLegalEntitiesIdTermsOfServiceTermsofservicedocumentid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner. |
 **termsofservicedocumentid** | **kotlin.String**| The unique identifier of the Terms of Service document. |
 **acceptTermsOfServiceRequest** | [**AcceptTermsOfServiceRequest**](AcceptTermsOfServiceRequest.md)|  | [optional]

### Return type

[**AcceptTermsOfServiceResponse**](AcceptTermsOfServiceResponse.md)

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

<a name="postLegalEntitiesIdTermsOfService"></a>
# **postLegalEntitiesIdTermsOfService**
> GetTermsOfServiceDocumentResponse postLegalEntitiesIdTermsOfService(id, getTermsOfServiceDocumentRequest)

Get Terms of Service document

Returns the Terms of Service document for a legal entity.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = TermsOfServiceApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner.
val getTermsOfServiceDocumentRequest : GetTermsOfServiceDocumentRequest =  // GetTermsOfServiceDocumentRequest | 
try {
    val result : GetTermsOfServiceDocumentResponse = apiInstance.postLegalEntitiesIdTermsOfService(id, getTermsOfServiceDocumentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsOfServiceApi#postLegalEntitiesIdTermsOfService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsOfServiceApi#postLegalEntitiesIdTermsOfService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. For sole proprietorships, this is the individual legal entity ID of the owner. |
 **getTermsOfServiceDocumentRequest** | [**GetTermsOfServiceDocumentRequest**](GetTermsOfServiceDocumentRequest.md)|  | [optional]

### Return type

[**GetTermsOfServiceDocumentResponse**](GetTermsOfServiceDocumentResponse.md)

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

