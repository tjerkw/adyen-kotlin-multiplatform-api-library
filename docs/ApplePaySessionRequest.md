
# ApplePaySessionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **kotlin.String** | This is the name that your shoppers will see in the Apple Pay interface.  The value returned as &#x60;configuration.merchantName&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response. | 
**domainName** | **kotlin.String** | The domain name you provided when you added Apple Pay in your Customer Area.  This must match the &#x60;window.location.hostname&#x60; of the web shop. | 
**merchantIdentifier** | **kotlin.String** | Your merchant identifier registered with Apple Pay.  Use the value of the &#x60;configuration.merchantId&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response. | 



