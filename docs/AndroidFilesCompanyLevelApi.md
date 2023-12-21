# AndroidFilesCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompaniesCompanyIdAndroidApps**](AndroidFilesCompanyLevelApi.md#getCompaniesCompanyIdAndroidApps) | **GET** /companies/{companyId}/androidApps | Get a list of Android apps
[**getCompaniesCompanyIdAndroidAppsId**](AndroidFilesCompanyLevelApi.md#getCompaniesCompanyIdAndroidAppsId) | **GET** /companies/{companyId}/androidApps/{id} | Get Android app
[**getCompaniesCompanyIdAndroidCertificates**](AndroidFilesCompanyLevelApi.md#getCompaniesCompanyIdAndroidCertificates) | **GET** /companies/{companyId}/androidCertificates | Get a list of Android certificates
[**postCompaniesCompanyIdAndroidApps**](AndroidFilesCompanyLevelApi.md#postCompaniesCompanyIdAndroidApps) | **POST** /companies/{companyId}/androidApps | Upload Android App


<a name="getCompaniesCompanyIdAndroidApps"></a>
# **getCompaniesCompanyIdAndroidApps**
> AndroidAppsResponse getCompaniesCompanyIdAndroidApps(companyId, pageNumber, pageSize, packageName, versionCode)

Get a list of Android apps

Returns a list of the Android apps that are available for the company identified in the path.  These apps have been uploaded to Adyen and can be installed or uninstalled on Android payment terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Android files read * Management API—Android files read and write * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AndroidFilesCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 20 items on a page.
val packageName : kotlin.String = packageName_example // kotlin.String | The package name that uniquely identifies the Android app.
val versionCode : kotlin.Int = 56 // kotlin.Int | The version number of the app.
try {
    val result : AndroidAppsResponse = apiInstance.getCompaniesCompanyIdAndroidApps(companyId, pageNumber, pageSize, packageName, versionCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AndroidFilesCompanyLevelApi#getCompaniesCompanyIdAndroidApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AndroidFilesCompanyLevelApi#getCompaniesCompanyIdAndroidApps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional]
 **packageName** | **kotlin.String**| The package name that uniquely identifies the Android app. | [optional]
 **versionCode** | **kotlin.Int**| The version number of the app. | [optional]

### Return type

[**AndroidAppsResponse**](AndroidAppsResponse.md)

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

<a name="getCompaniesCompanyIdAndroidAppsId"></a>
# **getCompaniesCompanyIdAndroidAppsId**
> AndroidApp getCompaniesCompanyIdAndroidAppsId(companyId, id)

Get Android app

Returns the details of the Android app identified in the path.  These apps have been uploaded to Adyen and can be installed or uninstalled on Android payment terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Android files read * Management API—Android files read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AndroidFilesCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the app.
try {
    val result : AndroidApp = apiInstance.getCompaniesCompanyIdAndroidAppsId(companyId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AndroidFilesCompanyLevelApi#getCompaniesCompanyIdAndroidAppsId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AndroidFilesCompanyLevelApi#getCompaniesCompanyIdAndroidAppsId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **id** | **kotlin.String**| The unique identifier of the app. |

### Return type

[**AndroidApp**](AndroidApp.md)

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

<a name="getCompaniesCompanyIdAndroidCertificates"></a>
# **getCompaniesCompanyIdAndroidCertificates**
> AndroidCertificatesResponse getCompaniesCompanyIdAndroidCertificates(companyId, pageNumber, pageSize, certificateName)

Get a list of Android certificates

Returns a list of the Android certificates that are available for the company identified in the path. Typically, these certificates enable running apps on Android payment terminals. The certifcates in the list have been uploaded to Adyen and can be installed or uninstalled on Android terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Android files read * Management API—Android files read and write * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AndroidFilesCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
val pageNumber : kotlin.Int = 56 // kotlin.Int | The number of the page to fetch.
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to have on a page, maximum 100. The default is 20 items on a page.
val certificateName : kotlin.String = certificateName_example // kotlin.String | The name of the certificate.
try {
    val result : AndroidCertificatesResponse = apiInstance.getCompaniesCompanyIdAndroidCertificates(companyId, pageNumber, pageSize, certificateName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AndroidFilesCompanyLevelApi#getCompaniesCompanyIdAndroidCertificates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AndroidFilesCompanyLevelApi#getCompaniesCompanyIdAndroidCertificates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |
 **pageNumber** | **kotlin.Int**| The number of the page to fetch. | [optional]
 **pageSize** | **kotlin.Int**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional]
 **certificateName** | **kotlin.String**| The name of the certificate. | [optional]

### Return type

[**AndroidCertificatesResponse**](AndroidCertificatesResponse.md)

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

<a name="postCompaniesCompanyIdAndroidApps"></a>
# **postCompaniesCompanyIdAndroidApps**
> postCompaniesCompanyIdAndroidApps(companyId)

Upload Android App

Uploads an Android APK file to Adyen. The maximum APK file size is 200 MB. To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Android files read and write  &gt;By choosing to upload, install, or run any third-party applications on an Adyen payment terminal, you accept full responsibility and liability for any consequences of uploading, installing, or running any such applications.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.management.*

val apiInstance = AndroidFilesCompanyLevelApi()
val companyId : kotlin.String = companyId_example // kotlin.String | The unique identifier of the company account.
try {
    apiInstance.postCompaniesCompanyIdAndroidApps(companyId)
} catch (e: ClientException) {
    println("4xx response calling AndroidFilesCompanyLevelApi#postCompaniesCompanyIdAndroidApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AndroidFilesCompanyLevelApi#postCompaniesCompanyIdAndroidApps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| The unique identifier of the company account. |

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

