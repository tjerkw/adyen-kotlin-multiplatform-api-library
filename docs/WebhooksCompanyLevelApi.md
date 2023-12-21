# WebhooksCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCompaniesCompanyIdWebhooksWebhookId**](WebhooksCompanyLevelApi.md#deleteCompaniesCompanyIdWebhooksWebhookId) | **DELETE** /companies/{companyId}/webhooks/{webhookId} | Remove a webhook
[**getCompaniesCompanyIdWebhooks**](WebhooksCompanyLevelApi.md#getCompaniesCompanyIdWebhooks) | **GET** /companies/{companyId}/webhooks | List all webhooks
[**getCompaniesCompanyIdWebhooksWebhookId**](WebhooksCompanyLevelApi.md#getCompaniesCompanyIdWebhooksWebhookId) | **GET** /companies/{companyId}/webhooks/{webhookId} | Get a webhook
[**patchCompaniesCompanyIdWebhooksWebhookId**](WebhooksCompanyLevelApi.md#patchCompaniesCompanyIdWebhooksWebhookId) | **PATCH** /companies/{companyId}/webhooks/{webhookId} | Update a webhook
[**postCompaniesCompanyIdWebhooks**](WebhooksCompanyLevelApi.md#postCompaniesCompanyIdWebhooks) | **POST** /companies/{companyId}/webhooks | Set up a webhook
[**postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac**](WebhooksCompanyLevelApi.md#postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac) | **POST** /companies/{companyId}/webhooks/{webhookId}/generateHmac | Generate an HMAC key
[**postCompaniesCompanyIdWebhooksWebhookIdTest**](WebhooksCompanyLevelApi.md#postCompaniesCompanyIdWebhooksWebhookIdTest) | **POST** /companies/{companyId}/webhooks/{webhookId}/test | Test a webhook


<a name="deleteCompaniesCompanyIdWebhooksWebhookId"></a>
# **deleteCompaniesCompanyIdWebhooksWebhookId**
> deleteCompaniesCompanyIdWebhooksWebhookId(companyId, webhookId)

Remove a webhook

Remove the configuration for the webhook identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
try {
    apiInstance.deleteCompaniesCompanyIdWebhooksWebhookId(companyId, webhookId)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#deleteCompaniesCompanyIdWebhooksWebhookId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#deleteCompaniesCompanyIdWebhooksWebhookId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
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

<a name="getCompaniesCompanyIdWebhooks"></a>
# **getCompaniesCompanyIdWebhooks**
> ListWebhooksResponse getCompaniesCompanyIdWebhooks(companyId, pageNumber, pageSize)

List all webhooks

Lists all webhook configurations for the company account.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account).
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListWebhooksResponse = apiInstance.getCompaniesCompanyIdWebhooks(companyId, pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#getCompaniesCompanyIdWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#getCompaniesCompanyIdWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). |
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

<a name="getCompaniesCompanyIdWebhooksWebhookId"></a>
# **getCompaniesCompanyIdWebhooksWebhookId**
> Webhook getCompaniesCompanyIdWebhooksWebhookId(companyId, webhookId)

Get a webhook

Returns the configuration for the webhook identified in the path.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account).
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
try {
    val result : Webhook = apiInstance.getCompaniesCompanyIdWebhooksWebhookId(companyId, webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#getCompaniesCompanyIdWebhooksWebhookId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#getCompaniesCompanyIdWebhooksWebhookId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). |
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

<a name="patchCompaniesCompanyIdWebhooksWebhookId"></a>
# **patchCompaniesCompanyIdWebhooksWebhookId**
> Webhook patchCompaniesCompanyIdWebhooksWebhookId(companyId, webhookId, updateCompanyWebhookRequest)

Update a webhook

Make changes to the configuration of the webhook identified in the path. The request contains the new values you want to have in the webhook configuration. The response contains the full configuration for the webhook, which includes the new values from the request.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
val updateCompanyWebhookRequest : UpdateCompanyWebhookRequest =  // UpdateCompanyWebhookRequest | 
try {
    val result : Webhook = apiInstance.patchCompaniesCompanyIdWebhooksWebhookId(companyId, webhookId, updateCompanyWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#patchCompaniesCompanyIdWebhooksWebhookId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#patchCompaniesCompanyIdWebhooksWebhookId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |
 **updateCompanyWebhookRequest** | [**UpdateCompanyWebhookRequest**](UpdateCompanyWebhookRequest.md)|  | [optional]

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

<a name="postCompaniesCompanyIdWebhooks"></a>
# **postCompaniesCompanyIdWebhooks**
> Webhook postCompaniesCompanyIdWebhooks(companyId, createCompanyWebhookRequest)

Set up a webhook

Subscribe to receive webhook notifications about events related to your company account. You can add basic authentication to make sure the data is secure.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account).
val createCompanyWebhookRequest : CreateCompanyWebhookRequest =  // CreateCompanyWebhookRequest | 
try {
    val result : Webhook = apiInstance.postCompaniesCompanyIdWebhooks(companyId, createCompanyWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#postCompaniesCompanyIdWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#postCompaniesCompanyIdWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). |
 **createCompanyWebhookRequest** | [**CreateCompanyWebhookRequest**](CreateCompanyWebhookRequest.md)|  | [optional]

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

<a name="postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac"></a>
# **postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac**
> GenerateHmacKeyResponse postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac(companyId, webhookId)

Generate an HMAC key

Returns an [HMAC key](https://en.wikipedia.org/wiki/HMAC) for the webhook identified in the path. This key allows you to check the integrity and the origin of the notifications you receive.By creating an HMAC key, you start receiving [HMAC-signed notifications](https://docs.adyen.com/development-resources/webhooks/verify-hmac-signatures#enable-hmac-signatures) from Adyen. Find out more about how to [verify HMAC signatures](https://docs.adyen.com/development-resources/webhooks/verify-hmac-signatures).  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
try {
    val result : GenerateHmacKeyResponse = apiInstance.postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac(companyId, webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |

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

<a name="postCompaniesCompanyIdWebhooksWebhookIdTest"></a>
# **postCompaniesCompanyIdWebhooksWebhookIdTest**
> TestWebhookResponse postCompaniesCompanyIdWebhooksWebhookIdTest(companyId, webhookId, testCompanyWebhookRequest)

Test a webhook

Sends sample notifications to test if the webhook is set up correctly.  We send sample notifications for maximum 20 of the merchant accounts that the webhook is configured for. If the webhook is configured for more than 20 merchant accounts, use the &#x60;merchantIds&#x60; array to specify a subset of the merchant accounts for which to send test notifications.  We send four test notifications for each event code you choose. They cover success and failure scenarios for the hard-coded currencies EUR and GBP, regardless of the currencies configured in the merchant accounts. For custom notifications, we only send the specified custom notification.  The response describes the result of the test. The &#x60;status&#x60; field tells you if the test was successful or not. You can use the other response fields to troubleshoot unsuccessful tests.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Webhooks read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = WebhooksCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val webhookId : kotlin.String = webhookId_example // kotlin.String | Unique identifier of the webhook configuration.
val testCompanyWebhookRequest : TestCompanyWebhookRequest =  // TestCompanyWebhookRequest | 
try {
    val result : TestWebhookResponse = apiInstance.postCompaniesCompanyIdWebhooksWebhookIdTest(companyId, webhookId, testCompanyWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksCompanyLevelApi#postCompaniesCompanyIdWebhooksWebhookIdTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksCompanyLevelApi#postCompaniesCompanyIdWebhooksWebhookIdTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **webhookId** | **kotlin.String**| Unique identifier of the webhook configuration. |
 **testCompanyWebhookRequest** | [**TestCompanyWebhookRequest**](TestCompanyWebhookRequest.md)|  | [optional]

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

