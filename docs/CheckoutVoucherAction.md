
# CheckoutVoucherAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | **voucher** | 
**alternativeReference** | **kotlin.String** | The voucher alternative reference code. |  [optional]
**collectionInstitutionNumber** | **kotlin.String** | A collection institution number (store number) for Econtext Pay-Easy ATM. |  [optional]
**downloadUrl** | **kotlin.String** | The URL to download the voucher. |  [optional]
**entity** | **kotlin.String** | An entity number of Multibanco. |  [optional]
**expiresAt** | **kotlin.String** | The date time of the voucher expiry. |  [optional]
**initialAmount** | [**Amount**](Amount.md) |  |  [optional]
**instructionsUrl** | **kotlin.String** | The URL to the detailed instructions to make payment using the voucher. |  [optional]
**issuer** | **kotlin.String** | The issuer of the voucher. |  [optional]
**maskedTelephoneNumber** | **kotlin.String** | The shopper telephone number (partially masked). |  [optional]
**merchantName** | **kotlin.String** | The merchant name. |  [optional]
**merchantReference** | **kotlin.String** | The merchant reference. |  [optional]
**passCreationToken** | **kotlin.String** | A base64 encoded signature of all properties |  [optional]
**paymentData** | **kotlin.String** | Encoded payment data. |  [optional]
**paymentMethodType** | **kotlin.String** | Specifies the payment method. |  [optional]
**reference** | **kotlin.String** | The voucher reference code. |  [optional]
**shopperEmail** | **kotlin.String** | The shopper email. |  [optional]
**shopperName** | **kotlin.String** | The shopper name. |  [optional]
**surcharge** | [**Amount**](Amount.md) |  |  [optional]
**totalAmount** | [**Amount**](Amount.md) |  |  [optional]
**url** | **kotlin.String** | Specifies the URL to redirect to. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | voucher



