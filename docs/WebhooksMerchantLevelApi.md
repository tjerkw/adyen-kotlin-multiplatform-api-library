# WebhooksMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMerchantsMerchantIdWebhooksWebhookId**](WebhooksMerchantLevelApi.md#deleteMerchantsMerchantIdWebhooksWebhookId) | **DELETE** /merchants/{merchantId}/webhooks/{webhookId} | Remove a webhook
[**getMerchantsMerchantIdWebhooks**](WebhooksMerchantLevelApi.md#getMerchantsMerchantIdWebhooks) | **GET** /merchants/{merchantId}/webhooks | List all webhooks
[**getMerchantsMerchantIdWebhooksWebhookId**](WebhooksMerchantLevelApi.md#getMerchantsMerchantIdWebhooksWebhookId) | **GET** /merchants/{merchantId}/webhooks/{webhookId} | Get a webhook
[**patchMerchantsMerchantIdWebhooksWebhookId**](WebhooksMerchantLevelApi.md#patchMerchantsMerchantIdWebhooksWebhookId) | **PATCH** /merchants/{merchantId}/webhooks/{webhookId} | Update a webhook
[**postMerchantsMerchantIdWebhooks**](WebhooksMerchantLevelApi.md#postMerchantsMerchantIdWebhooks) | **POST** /merchants/{merchantId}/webhooks | Set up a webhook
[**postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac**](WebhooksMerchantLevelApi.md#postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac) | **POST** /merchants/{merchantId}/webhooks/{webhookId}/generateHmac | Generate an HMAC key
[**postMerchantsMerchantIdWebhooksWebhookIdTest**](WebhooksMerchantLevelApi.md#postMerchantsMerchantIdWebhooksWebhookIdTest) | **POST** /merchants/{merchantId}/webhooks/{webhookId}/test | Test a webhook


<a name="deleteMerchantsMerchantIdWebhooksWebhookId"></a>
# **deleteMerchantsMerchantIdWebhooksWebhookId**
> deleteMerchantsMerchantIdWebhooksWebhookId(merchantId, webhookId)

Remove a webhook

Remove the configuration for the webhook identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
try {
    apiInstance.deleteMerchantsMerchantIdWebhooksWebhookId(merchantId, webhookId)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#deleteMerchantsMerchantIdWebhooksWebhookId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#deleteMerchantsMerchantIdWebhooksWebhookId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |

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

<a name="getMerchantsMerchantIdWebhooks"></a>
# **getMerchantsMerchantIdWebhooks**
> ListWebhooksResponse getMerchantsMerchantIdWebhooks(merchantId, pageNumber, pageSize)

List all webhooks

Lists all webhook configurations for the merchant account.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListWebhooksResponse = apiInstance.getMerchantsMerchantIdWebhooks(merchantId, pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#getMerchantsMerchantIdWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#getMerchantsMerchantIdWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]

### Return type

[**ListWebhooksResponse**](ListWebhooksResponse.md)

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

<a name="getMerchantsMerchantIdWebhooksWebhookId"></a>
# **getMerchantsMerchantIdWebhooksWebhookId**
> Webhook getMerchantsMerchantIdWebhooksWebhookId(merchantId, webhookId)

Get a webhook

Returns the configuration for the webhook identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
try {
    val result : Webhook = apiInstance.getMerchantsMerchantIdWebhooksWebhookId(merchantId, webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#getMerchantsMerchantIdWebhooksWebhookId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#getMerchantsMerchantIdWebhooksWebhookId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |

### Return type

[**Webhook**](Webhook.md)

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

<a name="patchMerchantsMerchantIdWebhooksWebhookId"></a>
# **patchMerchantsMerchantIdWebhooksWebhookId**
> Webhook patchMerchantsMerchantIdWebhooksWebhookId(merchantId, webhookId, updateMerchantWebhookRequest)

Update a webhook

Make changes to the configuration of the webhook identified in the path. The request contains the new values you want to have in the webhook configuration. The response contains the full configuration for the webhook, which includes the new values from the request.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
val updateMerchantWebhookRequest : UpdateMerchantWebhookRequest =  // UpdateMerchantWebhookRequest | 
try {
    val result : Webhook = apiInstance.patchMerchantsMerchantIdWebhooksWebhookId(merchantId, webhookId, updateMerchantWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#patchMerchantsMerchantIdWebhooksWebhookId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#patchMerchantsMerchantIdWebhooksWebhookId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |
 **updateMerchantWebhookRequest** | [**UpdateMerchantWebhookRequest**](UpdateMerchantWebhookRequest.md)|  | [optional]

### Return type

[**Webhook**](Webhook.md)

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

<a name="postMerchantsMerchantIdWebhooks"></a>
# **postMerchantsMerchantIdWebhooks**
> Webhook postMerchantsMerchantIdWebhooks(merchantId, createMerchantWebhookRequest)

Set up a webhook

Subscribe to receive webhook notifications about events related to your merchant account. You can add basic authentication to make sure the data is secure.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val createMerchantWebhookRequest : CreateMerchantWebhookRequest =  // CreateMerchantWebhookRequest | 
try {
    val result : Webhook = apiInstance.postMerchantsMerchantIdWebhooks(merchantId, createMerchantWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#postMerchantsMerchantIdWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#postMerchantsMerchantIdWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **createMerchantWebhookRequest** | [**CreateMerchantWebhookRequest**](CreateMerchantWebhookRequest.md)|  | [optional]

### Return type

[**Webhook**](Webhook.md)

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

<a name="postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac"></a>
# **postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac**
> GenerateHmacKeyResponse postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac(merchantId, webhookId)

Generate an HMAC key

Returns an [HMAC key](https://en.wikipedia.org/wiki/HMAC) for the webhook identified in the path. This key allows you to check the integrity and the origin of the notifications you receive.By creating an HMAC key, you start receiving [HMAC-signed notifications](https://docs.adyen.com/development-resources/webhooks/verify-hmac-signatures#enable-hmac-signatures) from Adyen. Find out more about how to [verify HMAC signatures](https://docs.adyen.com/development-resources/webhooks/verify-hmac-signatures).  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | 
try {
    val result : GenerateHmacKeyResponse = apiInstance.postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac(merchantId, webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **webhookId** | **kotlin.String**|  |

### Return type

[**GenerateHmacKeyResponse**](GenerateHmacKeyResponse.md)

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

<a name="postMerchantsMerchantIdWebhooksWebhookIdTest"></a>
# **postMerchantsMerchantIdWebhooksWebhookIdTest**
> TestWebhookResponse postMerchantsMerchantIdWebhooksWebhookIdTest(merchantId, webhookId, testWebhookRequest)

Test a webhook

Sends sample notifications to test if the webhook is set up correctly.  We send four test notifications for each event code you choose. They cover success and failure scenarios for the hard-coded currencies EUR and GBP, regardless of the currencies configured in the merchant accounts. For custom notifications, we only send the specified custom notification.  The response describes the result of the test. The &#x60;status&#x60; field tells you if the test was successful or not. You can use the other fields to troubleshoot unsuccessful tests.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | The unique identifier of the merchant account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
val testWebhookRequest : TestWebhookRequest =  // TestWebhookRequest | 
try {
    val result : TestWebhookResponse = apiInstance.postMerchantsMerchantIdWebhooksWebhookIdTest(merchantId, webhookId, testWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksMerchantLevelApi#postMerchantsMerchantIdWebhooksWebhookIdTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksMerchantLevelApi#postMerchantsMerchantIdWebhooksWebhookIdTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| The unique identifier of the merchant account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |
 **testWebhookRequest** | [**TestWebhookRequest**](TestWebhookRequest.md)|  | [optional]

### Return type

[**TestWebhookResponse**](TestWebhookResponse.md)

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

