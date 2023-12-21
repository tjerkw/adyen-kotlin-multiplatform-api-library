
# PaymentCompletionDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MD** | **kotlin.String** | A payment session identifier returned by the card issuer. |  [optional]
**paReq** | **kotlin.String** | (3D) Payment Authentication Request data for the card issuer. |  [optional]
**paRes** | **kotlin.String** | (3D) Payment Authentication Response data by the card issuer. |  [optional]
**authorizationToken** | **kotlin.String** |  |  [optional]
**billingToken** | **kotlin.String** | PayPal-generated token for recurring payments. |  [optional]
**cupsecureplusSmscode** | **kotlin.String** | The SMS verification code collected from the shopper. |  [optional]
**facilitatorAccessToken** | **kotlin.String** | PayPal-generated third party access token. |  [optional]
**oneTimePasscode** | **kotlin.String** | A random number sent to the mobile phone number of the shopper to verify the payment. |  [optional]
**orderID** | **kotlin.String** | PayPal-assigned ID for the order. |  [optional]
**payerID** | **kotlin.String** | PayPal-assigned ID for the payer (shopper). |  [optional]
**payload** | **kotlin.String** | Payload appended to the &#x60;returnURL&#x60; as a result of the redirect. |  [optional]
**paymentID** | **kotlin.String** | PayPal-generated ID for the payment. |  [optional]
**paymentStatus** | **kotlin.String** | Value passed from the WeChat MiniProgram &#x60;wx.requestPayment&#x60; **complete** callback. Possible values: any value starting with &#x60;requestPayment:&#x60;. |  [optional]
**redirectResult** | **kotlin.String** | The result of the redirect as appended to the &#x60;returnURL&#x60;. |  [optional]
**resultCode** | **kotlin.String** | Value you received from the WeChat Pay SDK. |  [optional]
**threeDSResult** | **kotlin.String** | Base64-encoded string returned by the Component after the challenge flow. It contains the following parameters: &#x60;transStatus&#x60;, &#x60;authorisationToken&#x60;. |  [optional]
**threeds2ChallengeResult** | **kotlin.String** | Base64-encoded string returned by the Component after the challenge flow. It contains the following parameter: &#x60;transStatus&#x60;. |  [optional]
**threeds2Fingerprint** | **kotlin.String** | Base64-encoded string returned by the Component after the challenge flow. It contains the following parameter: &#x60;threeDSCompInd&#x60;. |  [optional]



