# UsersMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdUsers**](UsersMerchantLevelApi.md#getMerchantsMerchantIdUsers) | **GET** /merchants/{merchantId}/users | Get a list of users
[**getMerchantsMerchantIdUsersUserId**](UsersMerchantLevelApi.md#getMerchantsMerchantIdUsersUserId) | **GET** /merchants/{merchantId}/users/{userId} | Get user details
[**patchMerchantsMerchantIdUsersUserId**](UsersMerchantLevelApi.md#patchMerchantsMerchantIdUsersUserId) | **PATCH** /merchants/{merchantId}/users/{userId} | Update a user
[**postMerchantsMerchantIdUsers**](UsersMerchantLevelApi.md#postMerchantsMerchantIdUsers) | **POST** /merchants/{merchantId}/users | Create a new user


<a name="getMerchantsMerchantIdUsers"></a>
# **getMerchantsMerchantIdUsers**
> ListMerchantUsersResponse getMerchantsMerchantIdUsers(merchantId, pageNumber, pageSize, username)

Get a list of users

Returns a list of users associated with the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | Unique identifier of the merchant.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page. Maximum value is **100**. The default is **10** items on a page.
val username : kotlin.String = username_example // kotlin.String | The partial or complete username to select all users that match.
try {
    val result : ListMerchantUsersResponse = apiInstance.getMerchantsMerchantIdUsers(merchantId, pageNumber, pageSize, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersMerchantLevelApi#getMerchantsMerchantIdUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersMerchantLevelApi#getMerchantsMerchantIdUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| Unique identifier of the merchant. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page. Maximum value is **100**. The default is **10** items on a page. | [optional]
 **username** | **kotlin.String**| The partial or complete username to select all users that match. | [optional]

### Return type

[**ListMerchantUsersResponse**](ListMerchantUsersResponse.md)

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

<a name="getMerchantsMerchantIdUsersUserId"></a>
# **getMerchantsMerchantIdUsersUserId**
> User getMerchantsMerchantIdUsersUserId(merchantId, userId)

Get user details

Returns user details for the &#x60;userId&#x60; and the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | Unique identifier of the merchant.
val userId : kotlin.String = userId_example // kotlin.String | Unique identifier of the user.
try {
    val result : User = apiInstance.getMerchantsMerchantIdUsersUserId(merchantId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersMerchantLevelApi#getMerchantsMerchantIdUsersUserId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersMerchantLevelApi#getMerchantsMerchantIdUsersUserId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| Unique identifier of the merchant. |
 **userId** | **kotlin.String**| Unique identifier of the user. |

### Return type

[**User**](User.md)

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

<a name="patchMerchantsMerchantIdUsersUserId"></a>
# **patchMerchantsMerchantIdUsersUserId**
> User patchMerchantsMerchantIdUsersUserId(merchantId, userId, updateMerchantUserRequest)

Update a user

Updates user details for the &#x60;userId&#x60; and the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | Unique identifier of the merchant.
val userId : kotlin.String = userId_example // kotlin.String | Unique identifier of the user.
val updateMerchantUserRequest : UpdateMerchantUserRequest =  // UpdateMerchantUserRequest | 
try {
    val result : User = apiInstance.patchMerchantsMerchantIdUsersUserId(merchantId, userId, updateMerchantUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersMerchantLevelApi#patchMerchantsMerchantIdUsersUserId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersMerchantLevelApi#patchMerchantsMerchantIdUsersUserId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| Unique identifier of the merchant. |
 **userId** | **kotlin.String**| Unique identifier of the user. |
 **updateMerchantUserRequest** | [**UpdateMerchantUserRequest**](UpdateMerchantUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

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

<a name="postMerchantsMerchantIdUsers"></a>
# **postMerchantsMerchantIdUsers**
> CreateUserResponse postMerchantsMerchantIdUsers(merchantId, createMerchantUserRequest)

Create a new user

Creates a user for the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = UsersMerchantLevelApi()
val merchantId : kotlin.String = merchantId_example // kotlin.String | Unique identifier of the merchant.
val createMerchantUserRequest : CreateMerchantUserRequest =  // CreateMerchantUserRequest | 
try {
    val result : CreateUserResponse = apiInstance.postMerchantsMerchantIdUsers(merchantId, createMerchantUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersMerchantLevelApi#postMerchantsMerchantIdUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersMerchantLevelApi#postMerchantsMerchantIdUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.String**| Unique identifier of the merchant. |
 **createMerchantUserRequest** | [**CreateMerchantUserRequest**](CreateMerchantUserRequest.md)|  | [optional]

### Return type

[**CreateUserResponse**](CreateUserResponse.md)

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

