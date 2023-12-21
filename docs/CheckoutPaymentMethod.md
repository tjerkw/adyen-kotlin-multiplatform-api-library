
# CheckoutPaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccountNumber** | **kotlin.String** | The bank account number (without separators). | 
**ownerName** | **kotlin.String** | The name of the bank account holder. | 
**type** | [**inline**](#Type) | **zip** | 
**applePayToken** | **kotlin.String** | The stringified and base64 encoded &#x60;paymentData&#x60; you retrieved from the Apple framework. | 
**issuer** | **kotlin.String** | The shopper&#39;s bank. Specify this with the issuer value that corresponds to this bank. | 
**firstName** | **kotlin.String** | The shopper&#39;s first name. | 
**lastName** | **kotlin.String** | The shopper&#39;s last name. | 
**shopperEmail** | **kotlin.String** |  | 
**telephoneNumber** | **kotlin.String** |  | 
**googlePayToken** | **kotlin.String** | The &#x60;token&#x60; that you obtained from the [Google Pay API](https://developers.google.com/pay/api/web/reference/response-objects#PaymentData) &#x60;PaymentData&#x60; response. | 
**masterpassTransactionId** | **kotlin.String** | The Masterpass transaction ID. | 
**samsungPayToken** | **kotlin.String** | The payload you received from the Samsung Pay SDK response. | 
**iban** | **kotlin.String** | The International Bank Account Number (IBAN). | 
**billingSequenceNumber** | **kotlin.String** | The sequence number for the debit. For example, send **2** if this is the second debit for the subscription. The sequence number is included in the notification sent to the shopper. | 
**visaCheckoutCallId** | **kotlin.String** | The Visa Click to Pay Call ID value. When your shopper selects a payment and/or a shipping address from Visa Click to Pay, you will receive a Visa Click to Pay Call ID. | 
**bankAccountType** | [**inline**](#BankAccountType) | The bank account type (checking, savings...). |  [optional]
**bankLocationId** | **kotlin.String** | The bank routing number of the account. |  [optional]
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**encryptedBankAccountNumber** | **kotlin.String** | Encrypted bank account number. The bank account number (without separators). |  [optional]
**encryptedBankLocationId** | **kotlin.String** | Encrypted location id. The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases. |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**billingAddress** | **kotlin.String** | The address where to send the invoice. |  [optional]
**deliveryAddress** | **kotlin.String** | The address where the goods should be delivered. |  [optional]
**personalDetails** | **kotlin.String** | Shopper name, date of birth, phone number, and email address. |  [optional]
**amazonPayToken** | **kotlin.String** | This is the &#x60;amazonPayToken&#x60; that you obtained from the [Get Checkout Session](https://amazon-pay-acquirer-guide.s3-eu-west-1.amazonaws.com/v1/amazon-pay-api-v2/checkout-session.html#get-checkout-session) response. This token is used for API only integration specifically. |  [optional]
**checkoutSessionId** | **kotlin.String** | The &#x60;checkoutSessionId&#x60; is used to identify the checkout session at the Amazon Pay side. This field is required only for drop-in and components integration, where it replaces the amazonPayToken. |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**holderName** | **kotlin.String** | The name of the card holder. |  [optional]
**blikCode** | **kotlin.String** | BLIK code consisting of 6 digits. |  [optional]
**brand** | **kotlin.String** | Secondary brand of the card. For example: **plastix**, **hmclub**. |  [optional]
**cupsecureplusSmscode** | **kotlin.String** |  |  [optional]
**cvc** | **kotlin.String** | The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**encryptedCardNumber** | **kotlin.String** | The encrypted card number. |  [optional]
**encryptedExpiryMonth** | **kotlin.String** | The encrypted card expiry month. |  [optional]
**encryptedExpiryYear** | **kotlin.String** | The encrypted card expiry year. |  [optional]
**encryptedSecurityCode** | **kotlin.String** | The encrypted card verification code. |  [optional]
**expiryMonth** | **kotlin.String** | The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**expiryYear** | **kotlin.String** | The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**networkPaymentReference** | **kotlin.String** | The network token reference. This is the [&#x60;networkTxReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment. |  [optional]
**number** | **kotlin.String** | The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide). |  [optional]
**shopperNotificationReference** | **kotlin.String** | The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used for recurring payment only. |  [optional]
**threeDS2SdkVersion** | **kotlin.String** | Required for mobile integrations. Version of the 3D Secure 2 mobile SDK. |  [optional]
**subtype** | [**inline**](#Subtype) | The type of flow to initiate. |  [optional]
**orderID** | **kotlin.String** | The unique ID associated with the order. |  [optional]
**payeePreferred** | **kotlin.String** | IMMEDIATE_PAYMENT_REQUIRED or UNRESTRICTED |  [optional]
**payerID** | **kotlin.String** | The unique ID associated with the payer. |  [optional]
**payerSelected** | **kotlin.String** | PAYPAL or PAYPAL_CREDIT |  [optional]
**virtualPaymentAddress** | **kotlin.String** | The virtual payment address for UPI. |  [optional]
**appId** | **kotlin.String** |  |  [optional]
**openid** | **kotlin.String** |  |  [optional]
**clickAndCollect** | **kotlin.String** | Set this to **true** if the shopper would like to pick up and collect their order, instead of having the goods delivered to them. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | zip, zip_pos


<a name="BankAccountType"></a>
## Enum: bankAccountType
Name | Value
---- | -----
bankAccountType | balance, checking, deposit, general, other, payment, savings


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Subtype"></a>
## Enum: subtype
Name | Value
---- | -----
subtype | redirect, sdk



