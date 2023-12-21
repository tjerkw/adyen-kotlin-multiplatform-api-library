# HostedOnboardingApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getThemes**](HostedOnboardingApi.md#getThemes) | **GET** /themes | Get a list of hosted onboarding page themes
[**getThemesId**](HostedOnboardingApi.md#getThemesId) | **GET** /themes/{id} | Get an onboarding link theme
[**postLegalEntitiesIdOnboardingLinks**](HostedOnboardingApi.md#postLegalEntitiesIdOnboardingLinks) | **POST** /legalEntities/{id}/onboardingLinks | Get a link to an Adyen-hosted onboarding page


<a name="getThemes"></a>
# **getThemes**
> OnboardingThemes getThemes()

Get a list of hosted onboarding page themes

Returns a list of hosted onboarding page themes.  &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = HostedOnboardingApi()
try {
    val result : OnboardingThemes = apiInstance.getThemes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HostedOnboardingApi#getThemes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HostedOnboardingApi#getThemes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OnboardingThemes**](OnboardingThemes.md)

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

<a name="getThemesId"></a>
# **getThemesId**
> OnboardingTheme getThemesId(id)

Get an onboarding link theme

Returns the details of the theme identified in the path.&gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = HostedOnboardingApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the theme
try {
    val result : OnboardingTheme = apiInstance.getThemesId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HostedOnboardingApi#getThemesId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HostedOnboardingApi#getThemesId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the theme |

### Return type

[**OnboardingTheme**](OnboardingTheme.md)

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

<a name="postLegalEntitiesIdOnboardingLinks"></a>
# **postLegalEntitiesIdOnboardingLinks**
> OnboardingLink postLegalEntitiesIdOnboardingLinks(id, onboardingLinkInfo)

Get a link to an Adyen-hosted onboarding page

Returns a link to an Adyen-hosted onboarding page where you need to redirect your user.  &gt;If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-01-legal-entity-management-api-3) for your API requests.  

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = HostedOnboardingApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity
val onboardingLinkInfo : OnboardingLinkInfo =  // OnboardingLinkInfo | 
try {
    val result : OnboardingLink = apiInstance.postLegalEntitiesIdOnboardingLinks(id, onboardingLinkInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HostedOnboardingApi#postLegalEntitiesIdOnboardingLinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HostedOnboardingApi#postLegalEntitiesIdOnboardingLinks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity |
 **onboardingLinkInfo** | [**OnboardingLinkInfo**](OnboardingLinkInfo.md)|  | [optional]

### Return type

[**OnboardingLink**](OnboardingLink.md)

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

