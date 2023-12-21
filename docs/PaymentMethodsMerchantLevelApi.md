# PaymentMethodsMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdPaymentMethodSettings**](PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettings) | **GET** /merchants/{merchantId}/paymentMethodSettings | Get all payment methods
[**getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId) | **GET** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Get payment method details
[**getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains**](PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains) | **GET** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId}/getApplePayDomains | Get Apple Pay domains
[**patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](PaymentMethodsMerchantLevelApi.md#patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId) | **PATCH** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Update a payment method
[**postMerchantsMerchantIdPaymentMethodSettings**](PaymentMethodsMerchantLevelApi.md#postMerchantsMerchantIdPaymentMethodSettings) | **POST** /merchants/{merchantId}/paymentMethodSettings | Request a payment method
[**postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains**](PaymentMethodsMerchantLevelApi.md#postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains) | **POST** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId}/addApplePayDomains | Add an Apple Pay domain


<a name="getMerchantsMerchantIdPaymentMethodSettings"></a>
# **getMerchantsMerchantIdPaymentMethodSettings**
> PaymentMethodResponse getMerchantsMerchantIdPaymentMethodSettings(merchantId, storeId, businessLineId, pageSize, pageNumber)

Get all payment methods

Returns details for all payment methods of the merchant account identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PaymentMethodsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val storeId : kotlin.String = storeId_example // kotlin.String | The unique identifier of the store for which to return the payment methods.
val businessLineId : kotlin.String = businessLineId_example // kotlin.String | The unique identifier of the Business Line for which to return the payment methods.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
try {
    val result : PaymentMethodResponse = apiInstance.getMerchantsMerchantIdPaymentMethodSettings(merchantId, storeId, businessLineId, pageSize, pageNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **storeId** | **kotlin.String**| The unique identifier of the store for which to return the payment methods. | [optional]
 **businessLineId** | **kotlin.String**| The unique identifier of the Business Line for which to return the payment methods. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

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

<a name="getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId"></a>
# **getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**
> PaymentMethod getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId)

Get payment method details

Returns details for the merchant account and the payment method identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PaymentMethodsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val paymentMethodId : kotlin.String = paymentMethodId_example // kotlin.String | The unique identifier of the payment method.
try {
    val result : PaymentMethod = apiInstance.getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **paymentMethodId** | **kotlin.String**| The unique identifier of the payment method. |

### Return type

[**PaymentMethod**](PaymentMethod.md)

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

<a name="getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains"></a>
# **getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains**
> ApplePayInfo getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains(merchantId, paymentMethodId)

Get Apple Pay domains

Returns all Apple Pay domains that are registered with the merchant account and the payment method identified in the path. For more information, see [Apple Pay documentation](https://docs.adyen.com/payment-methods/apple-pay/enable-apple-pay#register-merchant-domain).  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PaymentMethodsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val paymentMethodId : kotlin.String = paymentMethodId_example // kotlin.String | The unique identifier of the payment method.
try {
    val result : ApplePayInfo = apiInstance.getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains(merchantId, paymentMethodId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdGetApplePayDomains")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **paymentMethodId** | **kotlin.String**| The unique identifier of the payment method. |

### Return type

[**ApplePayInfo**](ApplePayInfo.md)

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

<a name="patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId"></a>
# **patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**
> PaymentMethod patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId, updatePaymentMethodInfo)

Update a payment method

Updates payment method details for the merchant account and the payment method identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PaymentMethodsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val paymentMethodId : kotlin.String = paymentMethodId_example // kotlin.String | The unique identifier of the payment method.
val updatePaymentMethodInfo : UpdatePaymentMethodInfo =  // UpdatePaymentMethodInfo | 
try {
    val result : PaymentMethod = apiInstance.patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId, updatePaymentMethodInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsMerchantLevelApi#patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsMerchantLevelApi#patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **paymentMethodId** | **kotlin.String**| The unique identifier of the payment method. |
 **updatePaymentMethodInfo** | [**UpdatePaymentMethodInfo**](UpdatePaymentMethodInfo.md)|  | [optional]

### Return type

[**PaymentMethod**](PaymentMethod.md)

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

<a name="postMerchantsMerchantIdPaymentMethodSettings"></a>
# **postMerchantsMerchantIdPaymentMethodSettings**
> PaymentMethod postMerchantsMerchantIdPaymentMethodSettings(merchantId, paymentMethodSetupInfo)

Request a payment method

Sends a request to add a new payment method to the merchant account identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PaymentMethodsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val paymentMethodSetupInfo : PaymentMethodSetupInfo =  // PaymentMethodSetupInfo | 
try {
    val result : PaymentMethod = apiInstance.postMerchantsMerchantIdPaymentMethodSettings(merchantId, paymentMethodSetupInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsMerchantLevelApi#postMerchantsMerchantIdPaymentMethodSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsMerchantLevelApi#postMerchantsMerchantIdPaymentMethodSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **paymentMethodSetupInfo** | [**PaymentMethodSetupInfo**](PaymentMethodSetupInfo.md)|  | [optional]

### Return type

[**PaymentMethod**](PaymentMethod.md)

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

<a name="postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains"></a>
# **postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains**
> postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains(merchantId, paymentMethodId, applePayInfo)

Add an Apple Pay domain

Adds the new domain to the list of Apple Pay domains that are registered with the merchant account and the payment method identified in the path. For more information, see [Apple Pay documentation](https://docs.adyen.com/payment-methods/apple-pay/enable-apple-pay#register-merchant-domain).  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PaymentMethodsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val paymentMethodId : kotlin.String = paymentMethodId_example // kotlin.String | The unique identifier of the payment method.
val applePayInfo : ApplePayInfo =  // ApplePayInfo | 
try {
    apiInstance.postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains(merchantId, paymentMethodId, applePayInfo)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsMerchantLevelApi#postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsMerchantLevelApi#postMerchantsMerchantIdPaymentMethodSettingsPaymentMethodIdAddApplePayDomains")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **paymentMethodId** | **kotlin.String**| The unique identifier of the payment method. |
 **applePayInfo** | [**ApplePayInfo**](ApplePayInfo.md)|  | [optional]

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

 - **Content-Type**: application/json
 - **Accept**: application/json

