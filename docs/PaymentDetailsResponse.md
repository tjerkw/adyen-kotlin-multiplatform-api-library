
# PaymentDetailsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** &gt; **Developers** &gt; **Additional data**. |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**donationToken** | **kotlin.String** | Donation Token containing payment details for Adyen Giving. |  [optional]
**fraudResult** | [**FraudResult**](FraudResult.md) |  |  [optional]
**merchantReference** | **kotlin.String** | The reference used during the /payments request. |  [optional]
**order** | [**CheckoutOrderResponse**](CheckoutOrderResponse.md) |  |  [optional]
**paymentMethod** | [**ResponsePaymentMethod**](ResponsePaymentMethod.md) |  |  [optional]
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request. |  [optional]
**refusalReason** | **kotlin.String** | If the payment&#39;s authorisation is refused or an error occurs during authorisation, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons). |  [optional]
**refusalReasonCode** | **kotlin.String** | Code that specifies the refusal reason. For more information, see [Authorisation refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons). |  [optional]
**resultCode** | [**inline**](#ResultCode) | The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper&#39;s device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **PartiallyAuthorised** – The payment has been authorised for a partial amount. This happens for card payments when the merchant supports Partial Authorisations and the cardholder has insufficient funds. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state. |  [optional]
**shopperLocale** | **kotlin.String** | The shopperLocale. |  [optional]
**threeDS2ResponseData** | [**ThreeDS2ResponseData**](ThreeDS2ResponseData.md) |  |  [optional]
**threeDS2Result** | [**ThreeDS2Result**](ThreeDS2Result.md) |  |  [optional]
**threeDSPaymentData** | **kotlin.String** | When non-empty, contains a value that you must submit to the &#x60;/payments/details&#x60; endpoint as &#x60;paymentData&#x60;. |  [optional]


<a name="ResultCode"></a>
## Enum: resultCode
Name | Value
---- | -----
resultCode | AuthenticationFinished, AuthenticationNotRequired, Authorised, Cancelled, ChallengeShopper, Error, IdentifyShopper, PartiallyAuthorised, Pending, PresentToShopper, Received, RedirectShopper, Refused, Success



