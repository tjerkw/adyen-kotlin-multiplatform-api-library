
# CardDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **kotlin.String** | Secondary brand of the card. For example: **plastix**, **hmclub**. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**cupsecureplusSmscode** | **kotlin.String** |  |  [optional]
**cvc** | **kotlin.String** | The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**encryptedCardNumber** | **kotlin.String** | The encrypted card number. |  [optional]
**encryptedExpiryMonth** | **kotlin.String** | The encrypted card expiry month. |  [optional]
**encryptedExpiryYear** | **kotlin.String** | The encrypted card expiry year. |  [optional]
**encryptedSecurityCode** | **kotlin.String** | The encrypted card verification code. |  [optional]
**expiryMonth** | **kotlin.String** | The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**expiryYear** | **kotlin.String** | The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**holderName** | **kotlin.String** | The name of the card holder. |  [optional]
**networkPaymentReference** | **kotlin.String** | The network token reference. This is the [&#x60;networkTxReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment. |  [optional]
**number** | **kotlin.String** | The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**shopperNotificationReference** | **kotlin.String** | The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used only for recurring payments in India. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**threeDS2SdkVersion** | **kotlin.String** | Required for mobile integrations. Version of the 3D Secure 2 mobile SDK. |  [optional]
**type** | [**inline**](#Type) | Default payment method details. Common for scheme payment methods, and for simple payment method details. |  [optional]


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | scheme, networkToken, card



