
# PaymentInstrumentInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAccountId** | **kotlin.String** | The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument. | 
**issuingCountryCode** | **kotlin.String** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**. | 
**type** | [**inline**](#Type) | Type of payment instrument.  Possible value: **card**, **bankAccount**.  | 
**card** | [**CardInfo**](CardInfo.md) |  |  [optional]
**description** | **kotlin.String** | Your description for the payment instrument, maximum 300 characters. |  [optional]
**paymentInstrumentGroupId** | **kotlin.String** | The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs. |  [optional]
**reference** | **kotlin.String** | Your reference for the payment instrument, maximum 150 characters. |  [optional]
**status** | [**inline**](#Status) | The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.    |  [optional]
**statusReason** | [**inline**](#StatusReason) | The reason for the status of the payment instrument.  Possible values: **accountClosure**, **damaged**, **endOfLife**, **expired**, **lost**, **stolen**, **suspectedFraud**, **transactionRule**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | bankAccount, card


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, closed, inactive, suspended


<a name="StatusReason"></a>
## Enum: statusReason
Name | Value
---- | -----
statusReason | accountClosure, damaged, endOfLife, expired, lost, other, stolen, suspectedFraud, transactionRule



