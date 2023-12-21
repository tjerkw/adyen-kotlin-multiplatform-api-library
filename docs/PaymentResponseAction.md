
# PaymentResponseAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **voucher** | 
**paymentData** | **kotlin.String** | Encoded payment data. |  [optional]
**paymentMethodType** | **kotlin.String** | Specifies the payment method. |  [optional]
**url** | **kotlin.String** | Specifies the URL to redirect to. |  [optional]
**authorisationToken** | **kotlin.String** | A token needed to authorise a payment. |  [optional]
**token** | **kotlin.String** | A token to pass to the 3DS2 Component to get the fingerprint. |  [optional]
**&#x60;data&#x60;** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | When the redirect URL must be accessed via POST, use this data to post to the redirect URL. |  [optional]
**method** | **kotlin.String** | Specifies the HTTP method, for example GET or POST. |  [optional]
**nativeRedirectData** | **kotlin.String** | Native SDK&#39;s redirect data containing the direct issuer link and state data that must be submitted to the /v1/nativeRedirect/redirectResult. |  [optional]
**expiresAt** | **kotlin.String** | The date time of the voucher expiry. |  [optional]
**qrCodeData** | **kotlin.String** | The contents of the QR code as a UTF8 string. |  [optional]
**sdkData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | The data to pass to the SDK. |  [optional]
**subtype** | **kotlin.String** | A subtype of the token. |  [optional]
**alternativeReference** | **kotlin.String** | The voucher alternative reference code. |  [optional]
**collectionInstitutionNumber** | **kotlin.String** | A collection institution number (store number) for Econtext Pay-Easy ATM. |  [optional]
**downloadUrl** | **kotlin.String** | The URL to download the voucher. |  [optional]
**entity** | **kotlin.String** | An entity number of Multibanco. |  [optional]
**initialAmount** | [**Amount**](Amount.md) |  |  [optional]
**instructionsUrl** | **kotlin.String** | The URL to the detailed instructions to make payment using the voucher. |  [optional]
**issuer** | **kotlin.String** | The issuer of the voucher. |  [optional]
**maskedTelephoneNumber** | **kotlin.String** | The shopper telephone number (partially masked). |  [optional]
**merchantName** | **kotlin.String** | The merchant name. |  [optional]
**merchantReference** | **kotlin.String** | The merchant reference. |  [optional]
**passCreationToken** | **kotlin.String** | A base64 encoded signature of all properties |  [optional]
**reference** | **kotlin.String** | The voucher reference code. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper email. |  [optional]
**shopperName** | **kotlin.String** | The shopper name. |  [optional]
**surcharge** | [**Amount**](Amount.md) |  |  [optional]
**totalAmount** | [**Amount**](Amount.md) |  |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | voucher



