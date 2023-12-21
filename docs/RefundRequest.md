
# RefundRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantAccount** | **kotlin.String** | The merchant account that is used to process the payment. | 
**modificationAmount** | [**Amount**](Amount.md) |  | 
**originalReference** | **kotlin.String** | The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification   | 
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value. |  [optional]
**mpiData** | [**ThreeDSecureData**](ThreeDSecureData.md) |  |  [optional]
**originalMerchantReference** | **kotlin.String** | The original merchant reference to cancel. |  [optional]
**platformChargebackLogic** | [**PlatformChargebackLogic**](PlatformChargebackLogic.md) |  |  [optional]
**reference** | **kotlin.String** | Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters. |  [optional]
**splits** | [**kotlin.collections.List&lt;Split&gt;**](Split.md) | An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information). |  [optional]
**tenderReference** | **kotlin.String** | The transaction reference provided by the PED. For point-of-sale integrations only. |  [optional]
**uniqueTerminalId** | **kotlin.String** | Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only. |  [optional]



