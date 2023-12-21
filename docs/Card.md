
# Card

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **kotlin.String** | The brand of the physical or the virtual card. Possible values: **visa**, **mc**. | 
**brandVariant** | **kotlin.String** | The brand variant of the physical or the virtual card. For example, **visadebit** or **mcprepaid**. &gt;Reach out to your Adyen contact to get the values relevant for your integration. | 
**cardholderName** | **kotlin.String** | The name of the cardholder.  Maximum length: 26 characters. | 
**formFactor** | [**inline**](#FormFactor) | The form factor of the card. Possible values: **virtual**, **physical**. | 
**number** | **kotlin.String** | The primary account number (PAN) of the card. &gt; The PAN is masked by default and returned only for single-use virtual cards. | 
**authentication** | [**Authentication**](Authentication.md) |  |  [optional]
**bin** | **kotlin.String** | The bank identification number (BIN) of the card number. |  [optional]
**configuration** | [**CardConfiguration**](CardConfiguration.md) |  |  [optional]
**cvc** | **kotlin.String** | The CVC2 value of the card. &gt; The CVC2 is not sent by default. This is only returned in the &#x60;POST&#x60; response for single-use virtual cards. |  [optional]
**deliveryContact** | [**Contact**](Contact.md) |  |  [optional]
**expiration** | [**Expiry**](Expiry.md) |  |  [optional]
**lastFour** | **kotlin.String** | Last last four digits of the card number. |  [optional]
**threeDSecure** | **kotlin.String** | Allocates a specific product range for either a physical or a virtual card. Possible values: **fullySupported**, **secureCorporate**. &gt;Reach out to your Adyen contact to get the values relevant for your integration. |  [optional]


<a name="FormFactor"></a>
## Enum: formFactor
Name | Value
---- | -----
formFactor | physical, unknown, virtual



