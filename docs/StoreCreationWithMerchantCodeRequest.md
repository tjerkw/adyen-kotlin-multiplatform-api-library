
# StoreCreationWithMerchantCodeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**StoreLocation**](StoreLocation.md) |  | 
**description** | **kotlin.String** | Your description of the store. | 
**merchantId** | **kotlin.String** | The unique identifier of the merchant account that the store belongs to. | 
**phoneNumber** | **kotlin.String** | The phone number of the store, including &#39;+&#39; and country code in the [E.164](https://en.wikipedia.org/wiki/E.164) format. If passed in a different format, we convert and validate the phone number against E.164.  | 
**shopperStatement** | **kotlin.String** | The store name to be shown on the shopper&#39;s bank or credit card statement and on the shopper receipt. Maximum length: 22 characters; can&#39;t be all numbers. | 
**businessLineIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The unique identifiers of the [business lines](https://docs.adyen.com/api-explorer/legalentity/latest/post/businessLines#responses-200-id) that the store is associated with. If not specified, the business line of the merchant account is used. Required when there are multiple business lines under the merchant account. |  [optional]
**externalReferenceId** | **kotlin.String** | The unique identifier of the store, used by certain payment methods and tax authorities. Accepts up to 14 digits.  Required for CNPJ in Brazil, in the format 00.000.000/00git00-00 separated by dots, slashes, hyphens, or without separators.  Optional for Zip in Australia and SIRET in France, required except for nonprofit organizations and incorporated associations.   |  [optional]
**reference** | **kotlin.String** | Your reference to recognize the store by. Also known as the store code.  Allowed characters: lowercase and uppercase letters without diacritics, numbers 0 through 9, hyphen (-), and underscore (_).  If you do not provide a reference in your POST request, it is populated with the Adyen-generated [id](https://docs.adyen.com/api-explorer/Management/latest/post/stores#responses-200-id). |  [optional]
**splitConfiguration** | [**StoreSplitConfiguration**](StoreSplitConfiguration.md) |  |  [optional]



