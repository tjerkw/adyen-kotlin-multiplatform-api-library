# PayoutSettingsMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](PayoutSettingsMerchantLevelApi.md#deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId) | **DELETE** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Delete a payout setting
[**getMerchantsMerchantIdPayoutSettings**](PayoutSettingsMerchantLevelApi.md#getMerchantsMerchantIdPayoutSettings) | **GET** /merchants/{merchantId}/payoutSettings | Get a list of payout settings
[**getMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](PayoutSettingsMerchantLevelApi.md#getMerchantsMerchantIdPayoutSettingsPayoutSettingsId) | **GET** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Get a payout setting
[**patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](PayoutSettingsMerchantLevelApi.md#patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId) | **PATCH** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Update a payout setting
[**postMerchantsMerchantIdPayoutSettings**](PayoutSettingsMerchantLevelApi.md#postMerchantsMerchantIdPayoutSettings) | **POST** /merchants/{merchantId}/payoutSettings | Add a payout setting


<a name="deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId"></a>
# **deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId**
> deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId(merchantId, payoutSettingsId)

Delete a payout setting

Deletes the payout setting identified in the path.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions):  * Management API—Payout account settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PayoutSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val payoutSettingsId : kotlin.String = payoutSettingsId_example // kotlin.String | The unique identifier of the payout setting.
try {
    apiInstance.deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId(merchantId, payoutSettingsId)
} catch (e: ClientException) {
    println("4xx response calling PayoutSettingsMerchantLevelApi#deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutSettingsMerchantLevelApi#deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **payoutSettingsId** | **kotlin.String**| The unique identifier of the payout setting. |

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

<a name="getMerchantsMerchantIdPayoutSettings"></a>
# **getMerchantsMerchantIdPayoutSettings**
> PayoutSettingsResponse getMerchantsMerchantIdPayoutSettings(merchantId)

Get a list of payout settings

Returns the list of payout settings for the merchant account identified in the path.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payout account settings read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PayoutSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
try {
    val result : PayoutSettingsResponse = apiInstance.getMerchantsMerchantIdPayoutSettings(merchantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutSettingsMerchantLevelApi#getMerchantsMerchantIdPayoutSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutSettingsMerchantLevelApi#getMerchantsMerchantIdPayoutSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |

### Return type

[**PayoutSettingsResponse**](PayoutSettingsResponse.md)

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

<a name="getMerchantsMerchantIdPayoutSettingsPayoutSettingsId"></a>
# **getMerchantsMerchantIdPayoutSettingsPayoutSettingsId**
> PayoutSettings getMerchantsMerchantIdPayoutSettingsPayoutSettingsId(merchantId, payoutSettingsId)

Get a payout setting

Returns the payout setting identified in the path.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payout account settings read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PayoutSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val payoutSettingsId : kotlin.String = payoutSettingsId_example // kotlin.String | The unique identifier of the payout setting.
try {
    val result : PayoutSettings = apiInstance.getMerchantsMerchantIdPayoutSettingsPayoutSettingsId(merchantId, payoutSettingsId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutSettingsMerchantLevelApi#getMerchantsMerchantIdPayoutSettingsPayoutSettingsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutSettingsMerchantLevelApi#getMerchantsMerchantIdPayoutSettingsPayoutSettingsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **payoutSettingsId** | **kotlin.String**| The unique identifier of the payout setting. |

### Return type

[**PayoutSettings**](PayoutSettings.md)

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

<a name="patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId"></a>
# **patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId**
> PayoutSettings patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId(merchantId, payoutSettingsId, updatePayoutSettingsRequest)

Update a payout setting

Updates the payout setting identified in the path. You can enable or disable the payout setting.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions):  * Management API—Payout account settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PayoutSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val payoutSettingsId : kotlin.String = payoutSettingsId_example // kotlin.String | The unique identifier of the payout setting.
val updatePayoutSettingsRequest : UpdatePayoutSettingsRequest =  // UpdatePayoutSettingsRequest | 
try {
    val result : PayoutSettings = apiInstance.patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId(merchantId, payoutSettingsId, updatePayoutSettingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutSettingsMerchantLevelApi#patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutSettingsMerchantLevelApi#patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **payoutSettingsId** | **kotlin.String**| The unique identifier of the payout setting. |
 **updatePayoutSettingsRequest** | [**UpdatePayoutSettingsRequest**](UpdatePayoutSettingsRequest.md)|  | [optional]

### Return type

[**PayoutSettings**](PayoutSettings.md)

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

<a name="postMerchantsMerchantIdPayoutSettings"></a>
# **postMerchantsMerchantIdPayoutSettings**
> PayoutSettings postMerchantsMerchantIdPayoutSettings(merchantId, payoutSettingsRequest)

Add a payout setting

Sends a request to add a payout setting for the merchant account specified in the path. A payout setting links the merchant account to the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the payout bank account. Adyen verifies the bank account before allowing and enabling the payout setting.  If you&#39;re accepting payments in multiple currencies, you may add multiple payout settings for the merchant account.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions):  * Management API—Payout account settings read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = PayoutSettingsMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val payoutSettingsRequest : PayoutSettingsRequest =  // PayoutSettingsRequest | 
try {
    val result : PayoutSettings = apiInstance.postMerchantsMerchantIdPayoutSettings(merchantId, payoutSettingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutSettingsMerchantLevelApi#postMerchantsMerchantIdPayoutSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutSettingsMerchantLevelApi#postMerchantsMerchantIdPayoutSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **payoutSettingsRequest** | [**PayoutSettingsRequest**](PayoutSettingsRequest.md)|  | [optional]

### Return type

[**PayoutSettings**](PayoutSettings.md)

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

