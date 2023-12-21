
# NetworkToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brandVariant** | **kotlin.String** | The card brand variant of the payment instrument associated with the network token. For example, **mc_prepaid_mrw**. |  [optional]
**creationDate** | **kotlin.String** | Date and time when the network token was created, in [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) extended format. For example, **2020-12-18T10:15:30+01:00**.. |  [optional]
**device** | [**DeviceInfo**](DeviceInfo.md) |  |  [optional]
**id** | **kotlin.String** | The unique identifier of the network token. |  [optional]
**paymentInstrumentId** | **kotlin.String** | The unique identifier of the payment instrument to which this network token belongs to. |  [optional]
**status** | [**inline**](#Status) | The status of the network token. Possible values: **active**, **inactive**, **suspended**, **closed**. |  [optional]
**tokenLastFour** | **kotlin.String** | The last four digits of the network token &#x60;id&#x60;. |  [optional]
**type** | **kotlin.String** | The type of wallet the network token is associated with. For example, **applePay**. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, inactive, suspended, closed



