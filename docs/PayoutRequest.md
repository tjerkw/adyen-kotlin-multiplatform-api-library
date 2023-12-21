
# PayoutRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**merchantAccount** | **kotlin.String** | The merchant account identifier, with which you want to process the transaction. | 
**reference** | **kotlin.String** | The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters. | 
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**card** | [**Card**](Card.md) |  |  [optional]
**fraudOffset** | **kotlin.Int** | An integer value that is added to the normal fraud score. The value can be either positive or negative. |  [optional]
**fundSource** | [**FundSource**](FundSource.md) |  |  [optional]
**recurring** | [**Recurring**](Recurring.md) |  |  [optional]
**selectedRecurringDetailReference** | **kotlin.String** | The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper&#39;s email address. We recommend that you provide this data, as it is used in velocity fraud checks. &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperEmail&#x60; for all browser-based and mobile implementations. |  [optional]
**shopperInteraction** | [**inline**](#ShopperInteraction) | Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal. |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperReference** | **kotlin.String** | Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**telephoneNumber** | **kotlin.String** | The shopper&#39;s telephone number. |  [optional]


<a name="ShopperInteraction"></a>
## Enum: shopperInteraction
Name | Value
---- | -----
shopperInteraction | Ecommerce, ContAuth, Moto, POS



