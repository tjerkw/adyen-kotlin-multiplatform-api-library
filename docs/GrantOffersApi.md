# GrantOffersApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGrantOffers**](GrantOffersApi.md#getGrantOffers) | **GET** /grantOffers | Get all available grant offers
[**getGrantOffersGrantOfferId**](GrantOffersApi.md#getGrantOffersGrantOfferId) | **GET** /grantOffers/{grantOfferId} | Get a grant offer


<a name="getGrantOffers"></a>
# **getGrantOffers**
> GrantOffers getGrantOffers(accountHolderId)

Get all available grant offers

Returns a list of all [grant offers](https://docs.adyen.com/marketplaces-and-platforms/capital#grant-offers) available for &#x60;accountHolderId&#x60; specified as a query parameter.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = GrantOffersApi()
val accountHolderId : kotlin.String = accountHolderId_example // kotlin.String | The unique identifier of the grant account.
try {
    val result : GrantOffers = apiInstance.getGrantOffers(accountHolderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantOffersApi#getGrantOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantOffersApi#getGrantOffers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountHolderId** | **kotlin.String**| The unique identifier of the grant account. |

### Return type

[**GrantOffers**](GrantOffers.md)

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

<a name="getGrantOffersGrantOfferId"></a>
# **getGrantOffersGrantOfferId**
> GrantOffer getGrantOffersGrantOfferId(grantOfferId)

Get a grant offer

Returns the details of a single grant offer.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = GrantOffersApi()
val grantOfferId : kotlin.String = grantOfferId_example // kotlin.String | The unique identifier of the grant offer.
try {
    val result : GrantOffer = apiInstance.getGrantOffersGrantOfferId(grantOfferId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantOffersApi#getGrantOffersGrantOfferId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantOffersApi#getGrantOffersGrantOfferId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantOfferId** | **kotlin.String**| The unique identifier of the grant offer. |

### Return type

[**GrantOffer**](GrantOffer.md)

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

