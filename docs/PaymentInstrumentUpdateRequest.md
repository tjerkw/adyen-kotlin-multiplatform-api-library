
# PaymentInstrumentUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAccountId** | **kotlin.String** | The unique identifier of the balance account associated with this payment instrument. &gt;You can only change the balance account ID if the payment instrument has **inactive** status. |  [optional]
**card** | [**CardInfo**](CardInfo.md) |  |  [optional]
**status** | [**inline**](#Status) | The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.    |  [optional]
**statusComment** | **kotlin.String** | Comment for the status of the payment instrument.  Required if &#x60;statusReason&#x60; is **other**. |  [optional]
**statusReason** | [**inline**](#StatusReason) | The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change. |  [optional]


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



