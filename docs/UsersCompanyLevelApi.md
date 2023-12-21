# UsersCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompaniesCompanyIdUsers**](UsersCompanyLevelApi.md#getCompaniesCompanyIdUsers) | **GET** /companies/{companyId}/users | Get a list of users
[**getCompaniesCompanyIdUsersUserId**](UsersCompanyLevelApi.md#getCompaniesCompanyIdUsersUserId) | **GET** /companies/{companyId}/users/{userId} | Get user details
[**patchCompaniesCompanyIdUsersUserId**](UsersCompanyLevelApi.md#patchCompaniesCompanyIdUsersUserId) | **PATCH** /companies/{companyId}/users/{userId} | Update user details
[**postCompaniesCompanyIdUsers**](UsersCompanyLevelApi.md#postCompaniesCompanyIdUsers) | **POST** /companies/{companyId}/users | Create a new user


<a name="getCompaniesCompanyIdUsers"></a>
# **getCompaniesCompanyIdUsers**
> ListCompanyUsersResponse getCompaniesCompanyIdUsers(companyId, pageNumber, pageSize, username)

Get a list of users

Returns the list of users for the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to return.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page. Maximum value is **100**. The default is **10** items on a page.
val username : kotlin.String = username_example // kotlin.String | The partial or complete username to select all users that match.
try {
    val result : ListCompanyUsersResponse = apiInstance.getCompaniesCompanyIdUsers(companyId, pageNumber, pageSize, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersCompanyLevelApi#getCompaniesCompanyIdUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersCompanyLevelApi#getCompaniesCompanyIdUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **pageNumber** | **kotlin.Int**| The number of the page to return. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page. Maximum value is **100**. The default is **10** items on a page. | [optional]
 **username** | **kotlin.String**| The partial or complete username to select all users that match. | [optional]

### Return type

[**ListCompanyUsersResponse**](ListCompanyUsersResponse.md)

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

<a name="getCompaniesCompanyIdUsersUserId"></a>
# **getCompaniesCompanyIdUsersUserId**
> CompanyUser getCompaniesCompanyIdUsersUserId(companyId, userId)

Get user details

Returns user details for the &#x60;userId&#x60; and the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val userId : kotlin.String = userId_example // kotlin.String | The unique identifier of the user.
try {
    val result : CompanyUser = apiInstance.getCompaniesCompanyIdUsersUserId(companyId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersCompanyLevelApi#getCompaniesCompanyIdUsersUserId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersCompanyLevelApi#getCompaniesCompanyIdUsersUserId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **userId** | **kotlin.String**| The unique identifier of the user. |

### Return type

[**CompanyUser**](CompanyUser.md)

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

<a name="patchCompaniesCompanyIdUsersUserId"></a>
# **patchCompaniesCompanyIdUsersUserId**
> CompanyUser patchCompaniesCompanyIdUsersUserId(companyId, userId, updateCompanyUserRequest)

Update user details

Updates user details for the &#x60;userId&#x60; and the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val userId : kotlin.String = userId_example // kotlin.String | The unique identifier of the user.
val updateCompanyUserRequest : UpdateCompanyUserRequest =  // UpdateCompanyUserRequest | 
try {
    val result : CompanyUser = apiInstance.patchCompaniesCompanyIdUsersUserId(companyId, userId, updateCompanyUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersCompanyLevelApi#patchCompaniesCompanyIdUsersUserId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersCompanyLevelApi#patchCompaniesCompanyIdUsersUserId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **userId** | **kotlin.String**| The unique identifier of the user. |
 **updateCompanyUserRequest** | [**UpdateCompanyUserRequest**](UpdateCompanyUserRequest.md)|  | [optional]

### Return type

[**CompanyUser**](CompanyUser.md)

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

<a name="postCompaniesCompanyIdUsers"></a>
# **postCompaniesCompanyIdUsers**
> CreateCompanyUserResponse postCompaniesCompanyIdUsers(companyId, createCompanyUserRequest)

Create a new user

Creates the user for the &#x60;companyId&#x60; identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val createCompanyUserRequest : CreateCompanyUserRequest =  // CreateCompanyUserRequest | 
try {
    val result : CreateCompanyUserResponse = apiInstance.postCompaniesCompanyIdUsers(companyId, createCompanyUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersCompanyLevelApi#postCompaniesCompanyIdUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersCompanyLevelApi#postCompaniesCompanyIdUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **createCompanyUserRequest** | [**CreateCompanyUserRequest**](CreateCompanyUserRequest.md)|  | [optional]

### Return type

[**CreateCompanyUserResponse**](CreateCompanyUserResponse.md)

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

