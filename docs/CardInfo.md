
# CardInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **kotlin.String** | The brand of the physical or the virtual card. Possible values: **visa**, **mc**. | 
**brandVariant** | **kotlin.String** | The brand variant of the physical or the virtual card. For example, **visadebit** or **mcprepaid**. &gt;Reach out to your Adyen contact to get the values relevant for your integration. | 
**cardholderName** | **kotlin.String** | The name of the cardholder.  Maximum length: 26 characters. | 
**formFactor** | [**inline**](#FormFactor) | The form factor of the card. Possible values: **virtual**, **physical**. | 
**authentication** | [**Authentication**](Authentication.md) |  |  [optional]
**configuration** | [**CardConfiguration**](CardConfiguration.md) |  |  [optional]
**deliveryContact** | [**DeliveryContact**](DeliveryContact.md) |  |  [optional]
**threeDSecure** | **kotlin.String** | Allocates a specific product range for either a physical or a virtual card. Possible values: **fullySupported**, **secureCorporate**. &gt;Reach out to your Adyen contact to get the values relevant for your integration. |  [optional]


<a name="FormFactor"></a>
## Enum: formFactor
Name | Value
---- | -----
formFactor | physical, unknown, virtual



