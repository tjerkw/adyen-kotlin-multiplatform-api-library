# BankAccountValidationApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postValidateBankAccountIdentification**](BankAccountValidationApi.md#postValidateBankAccountIdentification) | **POST** /validateBankAccountIdentification | Validate a bank account


<a name="postValidateBankAccountIdentification"></a>
# **postValidateBankAccountIdentification**
> postValidateBankAccountIdentification(bankAccountIdentificationValidationRequest)

Validate a bank account

Validates bank account identification details. You can use this endpoint to validate bank account details before you [make a transfer](https://docs.adyen.com/api-explorer/transfers/latest/post/transfers) or [create a transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.balanceplatform.*

val apiInstance = BankAccountValidationApi()
val bankAccountIdentificationValidationRequest : BankAccountIdentificationValidationRequest =  // BankAccountIdentificationValidationRequest | 
try {
    apiInstance.postValidateBankAccountIdentification(bankAccountIdentificationValidationRequest)
} catch (e: ClientException) {
    println("4xx response calling BankAccountValidationApi#postValidateBankAccountIdentification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountValidationApi#postValidateBankAccountIdentification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccountIdentificationValidationRequest** | [**BankAccountIdentificationValidationRequest**](BankAccountIdentificationValidationRequest.md)|  | [optional]

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

