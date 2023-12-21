
# CardDetailsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardNumber** | **kotlin.String** | A minimum of the first 8 digits of the card number and a maximum of the full card number. 11 digits gives the best result.   You must be [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide) to collect raw card data. | 
**merchantAccount** | **kotlin.String** | The merchant account identifier, with which you want to process the transaction. | 
**countryCode** | **kotlin.String** | The shopper country.  Format: [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) Example: NL or DE |  [optional]
**encryptedCardNumber** | **kotlin.String** | The encrypted card number. |  [optional]
**supportedBrands** | **kotlin.collections.List&lt;kotlin.String&gt;** | The card brands you support. This is the [&#x60;brands&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods__resParam_paymentMethods-brands) array from your [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.   If not included, our API uses the ones configured for your merchant account and, if provided, the country code. |  [optional]



