
# AdditionalDataRiskStandalone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payPalCountryCode** | **kotlin.String** | Shopper&#39;s country of residence in the form of ISO standard 3166 2-character country codes. |  [optional]
**payPalEmailId** | **kotlin.String** | Shopper&#39;s email. |  [optional]
**payPalFirstName** | **kotlin.String** | Shopper&#39;s first name. |  [optional]
**payPalLastName** | **kotlin.String** | Shopper&#39;s last name. |  [optional]
**payPalPayerId** | **kotlin.String** | Unique PayPal Customer Account identification number. Character length and limitations: 13 single-byte alphanumeric characters. |  [optional]
**payPalPhone** | **kotlin.String** | Shopper&#39;s phone number. |  [optional]
**payPalProtectionEligibility** | **kotlin.String** | Allowed values: * **Eligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Unauthorized Payments and Item Not Received.  * **PartiallyEligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Item Not Received.  * **Ineligible** — Merchant is not protected under the Seller Protection Policy. |  [optional]
**payPalTransactionId** | **kotlin.String** | Unique transaction ID of the payment. |  [optional]
**avsResultRaw** | **kotlin.String** | Raw AVS result received from the acquirer, where available. Example: D |  [optional]
**bin** | **kotlin.String** | The Bank Identification Number of a credit card, which is the first six digits of a card number. Required for [tokenized card request](https://docs.adyen.com/risk-management/standalone-risk#tokenised-pan-request). |  [optional]
**cvcResultRaw** | **kotlin.String** | Raw CVC result received from the acquirer, where available. Example: 1 |  [optional]
**riskToken** | **kotlin.String** | Unique identifier or token for the shopper&#39;s card details. |  [optional]
**threeDAuthenticated** | **kotlin.String** | A Boolean value indicating whether 3DS authentication was completed on this payment. Example: true |  [optional]
**threeDOffered** | **kotlin.String** | A Boolean value indicating whether 3DS was offered for this payment. Example: true |  [optional]
**tokenDataType** | **kotlin.String** | Required for PayPal payments only. The only supported value is: **paypal**. |  [optional]



