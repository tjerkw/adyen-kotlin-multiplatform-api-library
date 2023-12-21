
# BusinessLineInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**industryCode** | **kotlin.String** | A code that represents the industry of the legal entity. For example, **4431A** for computer software stores. | 
**legalEntityId** | **kotlin.String** | Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line. | 
**service** | [**inline**](#Service) | The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**   | 
**capability** | [**inline**](#Capability) | The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount** |  [optional]
**salesChannels** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**. |  [optional]
**sourceOfFunds** | [**SourceOfFunds**](SourceOfFunds.md) |  |  [optional]
**webData** | [**kotlin.collections.List&lt;WebData&gt;**](WebData.md) | List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object. |  [optional]
**webDataExemption** | [**WebDataExemption**](WebDataExemption.md) |  |  [optional]


<a name="Service"></a>
## Enum: service
Name | Value
---- | -----
service | paymentProcessing, banking


<a name="Capability"></a>
## Enum: capability
Name | Value
---- | -----
capability | receivePayments, receiveFromPlatformPayments, issueBankAccount



