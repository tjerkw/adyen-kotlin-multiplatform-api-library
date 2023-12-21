
# PaymentDetailsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**PaymentCompletionDetails**](PaymentCompletionDetails.md) |  | 
**authenticationData** | [**DetailsRequestAuthenticationData**](DetailsRequestAuthenticationData.md) |  |  [optional]
**paymentData** | **kotlin.String** | Encoded payment data. For [authorizing a payment after using 3D Secure 2 Authentication-only](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only/#authorise-the-payment-with-adyen):  If you received &#x60;resultCode&#x60;: **AuthenticationNotRequired** in the &#x60;/payments&#x60; response, use the &#x60;threeDSPaymentData&#x60; from the same response.  If you received &#x60;resultCode&#x60;: **AuthenticationFinished** in the &#x60;/payments&#x60; response, use the &#x60;action.paymentData&#x60; from the same response. |  [optional]
**threeDSAuthenticationOnly** | **kotlin.Boolean** | Change the &#x60;authenticationOnly&#x60; indicator originally set in the &#x60;/payments&#x60; request. Only needs to be set if you want to modify the value set previously. |  [optional]



