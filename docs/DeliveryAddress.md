
# DeliveryAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **kotlin.String** | The name of the city. Maximum length: 3000 characters. | 
**country** | **kotlin.String** | The two-character ISO-3166-1 alpha-2 country code. For example, **US**. &gt; If you don&#39;t know the country or are not collecting the country from the shopper, provide &#x60;country&#x60; as &#x60;ZZ&#x60;. | 
**houseNumberOrName** | **kotlin.String** | The number or name of the house. Maximum length: 3000 characters. | 
**postalCode** | **kotlin.String** | A maximum of five digits for an address in the US, or a maximum of ten characters for an address in all other countries. | 
**street** | **kotlin.String** | The name of the street. Maximum length: 3000 characters. &gt; The house number should not be included in this field; it should be separately provided via &#x60;houseNumberOrName&#x60;. | 
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**stateOrProvince** | **kotlin.String** | The two-character ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. &gt; Required for the US and Canada. |  [optional]



