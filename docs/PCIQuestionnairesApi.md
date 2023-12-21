# PCIQuestionnairesApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLegalEntitiesIdPciQuestionnaires**](PCIQuestionnairesApi.md#getLegalEntitiesIdPciQuestionnaires) | **GET** /legalEntities/{id}/pciQuestionnaires | Get PCI questionnaire details
[**getLegalEntitiesIdPciQuestionnairesPciid**](PCIQuestionnairesApi.md#getLegalEntitiesIdPciQuestionnairesPciid) | **GET** /legalEntities/{id}/pciQuestionnaires/{pciid} | Get PCI questionnaire
[**postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates**](PCIQuestionnairesApi.md#postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates) | **POST** /legalEntities/{id}/pciQuestionnaires/generatePciTemplates | Generate PCI questionnaire
[**postLegalEntitiesIdPciQuestionnairesSignPciTemplates**](PCIQuestionnairesApi.md#postLegalEntitiesIdPciQuestionnairesSignPciTemplates) | **POST** /legalEntities/{id}/pciQuestionnaires/signPciTemplates | Sign PCI questionnaire


<a name="getLegalEntitiesIdPciQuestionnaires"></a>
# **getLegalEntitiesIdPciQuestionnaires**
> GetPciQuestionnaireInfosResponse getLegalEntitiesIdPciQuestionnaires(id)

Get PCI questionnaire details

Get a list of signed PCI questionnaires.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = PCIQuestionnairesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity to get PCI questionnaire information.
try {
    val result : GetPciQuestionnaireInfosResponse = apiInstance.getLegalEntitiesIdPciQuestionnaires(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PCIQuestionnairesApi#getLegalEntitiesIdPciQuestionnaires")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PCIQuestionnairesApi#getLegalEntitiesIdPciQuestionnaires")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity to get PCI questionnaire information. |

### Return type

[**GetPciQuestionnaireInfosResponse**](GetPciQuestionnaireInfosResponse.md)

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

<a name="getLegalEntitiesIdPciQuestionnairesPciid"></a>
# **getLegalEntitiesIdPciQuestionnairesPciid**
> GetPciQuestionnaireResponse getLegalEntitiesIdPciQuestionnairesPciid(id, pciid)

Get PCI questionnaire

Returns the signed PCI questionnaire.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = PCIQuestionnairesApi()
val id : kotlin.String = id_example // kotlin.String | The legal entity ID of the individual who signed the PCI questionnaire.
val pciid : kotlin.String = pciid_example // kotlin.String | The unique identifier of the signed PCI questionnaire.
try {
    val result : GetPciQuestionnaireResponse = apiInstance.getLegalEntitiesIdPciQuestionnairesPciid(id, pciid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PCIQuestionnairesApi#getLegalEntitiesIdPciQuestionnairesPciid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PCIQuestionnairesApi#getLegalEntitiesIdPciQuestionnairesPciid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The legal entity ID of the individual who signed the PCI questionnaire. |
 **pciid** | **kotlin.String**| The unique identifier of the signed PCI questionnaire. |

### Return type

[**GetPciQuestionnaireResponse**](GetPciQuestionnaireResponse.md)

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

<a name="postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates"></a>
# **postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates**
> GeneratePciDescriptionResponse postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates(id, generatePciDescriptionRequest)

Generate PCI questionnaire

Generates the required PCI questionnaires based on the user&#39;s [salesChannel](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines__reqParam_salesChannels).

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = PCIQuestionnairesApi()
val id : kotlin.String = id_example // kotlin.String | The unique identifier of the legal entity to get PCI questionnaire information.
val generatePciDescriptionRequest : GeneratePciDescriptionRequest =  // GeneratePciDescriptionRequest | 
try {
    val result : GeneratePciDescriptionResponse = apiInstance.postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates(id, generatePciDescriptionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PCIQuestionnairesApi#postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PCIQuestionnairesApi#postLegalEntitiesIdPciQuestionnairesGeneratePciTemplates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The unique identifier of the legal entity to get PCI questionnaire information. |
 **generatePciDescriptionRequest** | [**GeneratePciDescriptionRequest**](GeneratePciDescriptionRequest.md)|  | [optional]

### Return type

[**GeneratePciDescriptionResponse**](GeneratePciDescriptionResponse.md)

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

<a name="postLegalEntitiesIdPciQuestionnairesSignPciTemplates"></a>
# **postLegalEntitiesIdPciQuestionnairesSignPciTemplates**
> PciSigningResponse postLegalEntitiesIdPciQuestionnairesSignPciTemplates(id, pciSigningRequest)

Sign PCI questionnaire

Signs the required PCI questionnaire.

### Example
```kotlin
// Import classes:
//import com.adyen.client.infrastructure.*
//import com.adyen.model.legalentitymanagement.*

val apiInstance = PCIQuestionnairesApi()
val id : kotlin.String = id_example // kotlin.String | The legal entity ID of the individual who signed the PCI questionnaire.
val pciSigningRequest : PciSigningRequest =  // PciSigningRequest | 
try {
    val result : PciSigningResponse = apiInstance.postLegalEntitiesIdPciQuestionnairesSignPciTemplates(id, pciSigningRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PCIQuestionnairesApi#postLegalEntitiesIdPciQuestionnairesSignPciTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PCIQuestionnairesApi#postLegalEntitiesIdPciQuestionnairesSignPciTemplates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The legal entity ID of the individual who signed the PCI questionnaire. |
 **pciSigningRequest** | [**PciSigningRequest**](PciSigningRequest.md)|  | [optional]

### Return type

[**PciSigningResponse**](PciSigningResponse.md)

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

