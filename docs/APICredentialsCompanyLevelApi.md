# APICredentialsCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompaniesCompanyIdApiCredentials**](APICredentialsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentials) | **GET** /companies/{companyId}/apiCredentials | Get a list of API credentials
[**getCompaniesCompanyIdApiCredentialsApiCredentialId**](APICredentialsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentialsApiCredentialId) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId} | Get an API credential
[**patchCompaniesCompanyIdApiCredentialsApiCredentialId**](APICredentialsCompanyLevelApi.md#patchCompaniesCompanyIdApiCredentialsApiCredentialId) | **PATCH** /companies/{companyId}/apiCredentials/{apiCredentialId} | Update an API credential.
[**postCompaniesCompanyIdApiCredentials**](APICredentialsCompanyLevelApi.md#postCompaniesCompanyIdApiCredentials) | **POST** /companies/{companyId}/apiCredentials | Create an API credential.


<a name="getCompaniesCompanyIdApiCredentials"></a>
# **getCompaniesCompanyIdApiCredentials**
> ListCompanyApiCredentialsResponse getCompaniesCompanyIdApiCredentials(companyId, pageNumber, pageSize)

Get a list of API credentials

Returns the list of [API credentials](https://docs.adyen.com/development-resources/api-credentials) for the company account. The list is grouped into pages as defined by the query parameters.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 10 items on a page.
try {
    val result : ListCompanyApiCredentialsResponse = apiInstance.getCompaniesCompanyIdApiCredentials(companyId, pageNumber, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsCompanyLevelApi#getCompaniesCompanyIdApiCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsCompanyLevelApi#getCompaniesCompanyIdApiCredentials")
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

[**ListCompanyApiCredentialsResponse**](ListCompanyApiCredentialsResponse.md)

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

<a name="getCompaniesCompanyIdApiCredentialsApiCredentialId"></a>
# **getCompaniesCompanyIdApiCredentialsApiCredentialId**
> CompanyApiCredential getCompaniesCompanyIdApiCredentialsApiCredentialId(companyId, apiCredentialId)

Get an API credential

Returns the [API credential](https://docs.adyen.com/development-resources/api-credentials) identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
try {
    val result : CompanyApiCredential = apiInstance.getCompaniesCompanyIdApiCredentialsApiCredentialId(companyId, apiCredentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsCompanyLevelApi#getCompaniesCompanyIdApiCredentialsApiCredentialId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsCompanyLevelApi#getCompaniesCompanyIdApiCredentialsApiCredentialId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |

### Return type

[**CompanyApiCredential**](CompanyApiCredential.md)

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

<a name="patchCompaniesCompanyIdApiCredentialsApiCredentialId"></a>
# **patchCompaniesCompanyIdApiCredentialsApiCredentialId**
> CompanyApiCredential patchCompaniesCompanyIdApiCredentialsApiCredentialId(companyId, apiCredentialId, updateCompanyApiCredentialRequest)

Update an API credential.

Changes the API credential&#39;s roles, merchant account access, or allowed origins. The request has the new values for the fields you want to change. The response contains the full updated API credential, including the new values from the request.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val apiCredentialId : kotlin.String = apiCredentialId_example // kotlin.String | Unique identifier of the API credential.
val updateCompanyApiCredentialRequest : UpdateCompanyApiCredentialRequest =  // UpdateCompanyApiCredentialRequest | 
try {
    val result : CompanyApiCredential = apiInstance.patchCompaniesCompanyIdApiCredentialsApiCredentialId(companyId, apiCredentialId, updateCompanyApiCredentialRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsCompanyLevelApi#patchCompaniesCompanyIdApiCredentialsApiCredentialId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsCompanyLevelApi#patchCompaniesCompanyIdApiCredentialsApiCredentialId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **apiCredentialId** | **kotlin.String**| Unique identifier of the API credential. |
 **updateCompanyApiCredentialRequest** | [**UpdateCompanyApiCredentialRequest**](UpdateCompanyApiCredentialRequest.md)|  | [optional]

### Return type

[**CompanyApiCredential**](CompanyApiCredential.md)

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

<a name="postCompaniesCompanyIdApiCredentials"></a>
# **postCompaniesCompanyIdApiCredentials**
> CreateCompanyApiCredentialResponse postCompaniesCompanyIdApiCredentials(companyId, createCompanyApiCredentialRequest)

Create an API credential.

Creates an [API credential](https://docs.adyen.com/development-resources/api-credentials) for the company account identified in the path. In the request, you can specify which merchant accounts the new API credential will have access to, as well as its roles and allowed origins.  The response includes several types of authentication details: * [API key](https://docs.adyen.com/development-resources/api-authentication#api-key-authentication): used for API request authentication. * [Client key](https://docs.adyen.com/development-resources/client-side-authentication#how-it-works): public key used for client-side authentication. * [Username and password](https://docs.adyen.com/development-resources/api-authentication#using-basic-authentication): used for basic authentication.  &gt; Make sure you store the API key securely in your system. You won&#39;t be able to retrieve it later.  If your API key is lost or compromised, you need to [generate a new API key](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/apiCredentials/{apiCredentialId}/generateApiKey).  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = APICredentialsCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val createCompanyApiCredentialRequest : CreateCompanyApiCredentialRequest =  // CreateCompanyApiCredentialRequest | 
try {
    val result : CreateCompanyApiCredentialResponse = apiInstance.postCompaniesCompanyIdApiCredentials(companyId, createCompanyApiCredentialRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APICredentialsCompanyLevelApi#postCompaniesCompanyIdApiCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APICredentialsCompanyLevelApi#postCompaniesCompanyIdApiCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **createCompanyApiCredentialRequest** | [**CreateCompanyApiCredentialRequest**](CreateCompanyApiCredentialRequest.md)|  | [optional]

### Return type

[**CreateCompanyApiCredentialResponse**](CreateCompanyApiCredentialResponse.md)

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

