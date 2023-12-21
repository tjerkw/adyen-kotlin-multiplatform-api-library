# LegalEntitiesApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLegalEntitiesId**](LegalEntitiesApi.md#getLegalEntitiesId) | **GET** /legalEntities/{id} | Get a legal entity
[**getLegalEntitiesIdBusinessLines**](LegalEntitiesApi.md#getLegalEntitiesIdBusinessLines) | **GET** /legalEntities/{id}/businessLines | Get all business lines under a legal entity
[**patchLegalEntitiesId**](LegalEntitiesApi.md#patchLegalEntitiesId) | **PATCH** /legalEntities/{id} | Update a legal entity
[**postLegalEntities**](LegalEntitiesApi.md#postLegalEntities) | **POST** /legalEntities | Create a legal entity
[**postLegalEntitiesIdCheckVerificationErrors**](LegalEntitiesApi.md#postLegalEntitiesIdCheckVerificationErrors) | **POST** /legalEntities/{id}/checkVerificationErrors | Check a legal entity&#39;s verification errors
[**postLegalEntitiesIdConfirmDataReview**](LegalEntitiesApi.md#postLegalEntitiesIdConfirmDataReview) | **POST** /legalEntities/{id}/confirmDataReview | Confirm data review


<a name="getLegalEntitiesId"></a>
# **getLegalEntitiesId**
> LegalEntity getLegalEntitiesId(id)

Get a legal entity

Returns a legal entity.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = LegalEntitiesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity.
try {
    val result : LegalEntity = apiInstance.getLegalEntitiesId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegalEntitiesApi#getLegalEntitiesId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegalEntitiesApi#getLegalEntitiesId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. |

### Return type

[**LegalEntity**](LegalEntity.md)

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

<a name="getLegalEntitiesIdBusinessLines"></a>
# **getLegalEntitiesIdBusinessLines**
> BusinessLines getLegalEntitiesIdBusinessLines(id)

Get all business lines under a legal entity

Returns the business lines owned by a legal entity.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = LegalEntitiesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity.
try {
    val result : BusinessLines = apiInstance.getLegalEntitiesIdBusinessLines(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegalEntitiesApi#getLegalEntitiesIdBusinessLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegalEntitiesApi#getLegalEntitiesIdBusinessLines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. |

### Return type

[**BusinessLines**](BusinessLines.md)

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

<a name="patchLegalEntitiesId"></a>
# **patchLegalEntitiesId**
> LegalEntity patchLegalEntitiesId(id, xRequestedVerificationCode, legalEntityInfo)

Update a legal entity

Updates a legal entity.   &gt;To change the legal entity type, include only the new &#x60;type&#x60; in your request. To update the &#x60;entityAssociations&#x60; array, you need to replace the entire array. For example, if the array has 3 entries and you want to remove 1 entry, you need to PATCH the resource with the remaining 2 entries.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = LegalEntitiesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity.
val xRequestedVerificationCode : kotlin.String = 0_0001 // kotlin.String | Use the requested verification code 0_0001 to resolve any suberrors associated with the legal entity. Requested verification codes can only be used in your test environment.
val legalEntityInfo : LegalEntityInfo =  // LegalEntityInfo | 
try {
    val result : LegalEntity = apiInstance.patchLegalEntitiesId(id, xRequestedVerificationCode, legalEntityInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegalEntitiesApi#patchLegalEntitiesId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegalEntitiesApi#patchLegalEntitiesId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. |
 **xRequestedVerificationCode** | **kotlin.String**| Use the requested verification code 0_0001 to resolve any suberrors associated with the legal entity. Requested verification codes can only be used in your test environment. | [optional]
 **legalEntityInfo** | [**LegalEntityInfo**](LegalEntityInfo.md)|  | [optional]

### Return type

[**LegalEntity**](LegalEntity.md)

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

<a name="postLegalEntities"></a>
# **postLegalEntities**
> LegalEntity postLegalEntities(xRequestedVerificationCode, legalEntityInfoRequiredType)

Create a legal entity

Creates a legal entity.   This resource contains information about the user that will be onboarded in your platform. Adyen uses this information to perform verification checks as required by payment industry regulations. Adyen informs you of the verification results through webhooks or API responses.   &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = LegalEntitiesApi()
val xRequestedVerificationCode : kotlin.String = 1_3004 // kotlin.String | Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment.
val legalEntityInfoRequiredType : LegalEntityInfoRequiredType =  // LegalEntityInfoRequiredType | 
try {
    val result : LegalEntity = apiInstance.postLegalEntities(xRequestedVerificationCode, legalEntityInfoRequiredType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegalEntitiesApi#postLegalEntities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegalEntitiesApi#postLegalEntities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedVerificationCode** | **kotlin.String**| Use a suberror code as your requested verification code. You can include one code at a time in your request header. Requested verification codes can only be used in your test environment. | [optional]
 **legalEntityInfoRequiredType** | [**LegalEntityInfoRequiredType**](LegalEntityInfoRequiredType.md)|  | [optional]

### Return type

[**LegalEntity**](LegalEntity.md)

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

<a name="postLegalEntitiesIdCheckVerificationErrors"></a>
# **postLegalEntitiesIdCheckVerificationErrors**
> VerificationErrors postLegalEntitiesIdCheckVerificationErrors(id)

Check a legal entity&#39;s verification errors

Returns the verification errors for a legal entity and its supporting entities.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = LegalEntitiesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity.
try {
    val result : VerificationErrors = apiInstance.postLegalEntitiesIdCheckVerificationErrors(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegalEntitiesApi#postLegalEntitiesIdCheckVerificationErrors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegalEntitiesApi#postLegalEntitiesIdCheckVerificationErrors")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. |

### Return type

[**VerificationErrors**](VerificationErrors.md)

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

<a name="postLegalEntitiesIdConfirmDataReview"></a>
# **postLegalEntitiesIdConfirmDataReview**
> DataReviewConfirmationResponse postLegalEntitiesIdConfirmDataReview(id)

Confirm data review

Confirms that your user has reviewed the data for the legal entity specified in the path. Call this endpoint to inform Adyen that your user reviewed and verified that the data is up-to-date. The endpoint returns the timestamp of when Adyen received the request.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = LegalEntitiesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity.
try {
    val result : DataReviewConfirmationResponse = apiInstance.postLegalEntitiesIdConfirmDataReview(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegalEntitiesApi#postLegalEntitiesIdConfirmDataReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegalEntitiesApi#postLegalEntitiesIdConfirmDataReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity. |

### Return type

[**DataReviewConfirmationResponse**](DataReviewConfirmationResponse.md)

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

