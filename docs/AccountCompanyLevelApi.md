# AccountCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanies**](AccountCompanyLevelApi.md#getCompanies) | **GET** /companies | Get a list of company accounts
[**getCompaniesCompanyId**](AccountCompanyLevelApi.md#getCompaniesCompanyId) | **GET** /companies/{companyId} | Get a company account
[**getCompaniesCompanyIdMerchants**](AccountCompanyLevelApi.md#getCompaniesCompanyIdMerchants) | **GET** /companies/{companyId}/merchants | Get a list of merchant accounts


<a name="getCompanies"></a>
# **getCompanies**
> ListCompanyResponse getCompanies(pageNumber, pageSize)

Get a list of company accounts

Returns the list of company accounts that your API credential has access to. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions):  * Management API—Account read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountCompanyLevelApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListCompanyResponse = apiInstance.getCompanies(pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountCompanyLevelApi#getCompanies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountCompanyLevelApi#getCompanies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]

### Return type

[**ListCompanyResponse**](ListCompanyResponse.md)

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

<a name="getCompaniesCompanyId"></a>
# **getCompaniesCompanyId**
> Company getCompaniesCompanyId(companyId)

Get a company account

Returns the company account specified in the path. Your API credential must have access to the company account.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
try {
    val result : Company = apiInstance.getCompaniesCompanyId(companyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountCompanyLevelApi#getCompaniesCompanyId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountCompanyLevelApi#getCompaniesCompanyId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |

### Return type

[**Company**](Company.md)

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

<a name="getCompaniesCompanyIdMerchants"></a>
# **getCompaniesCompanyIdMerchants**
> ListMerchantResponse getCompaniesCompanyIdMerchants(companyId, pageNumber, pageSize)

Get a list of merchant accounts

Returns the list of merchant accounts under the company account specified in the path. The list only includes merchant accounts that your API credential has access to. The list is grouped into pages as defined by the query parameters.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AccountCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListMerchantResponse = apiInstance.getCompaniesCompanyIdMerchants(companyId, pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountCompanyLevelApi#getCompaniesCompanyIdMerchants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountCompanyLevelApi#getCompaniesCompanyIdMerchants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]

### Return type

[**ListMerchantResponse**](ListMerchantResponse.md)

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

