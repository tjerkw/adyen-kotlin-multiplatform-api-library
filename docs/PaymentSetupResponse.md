
# PaymentSetupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentSession** | **kotlin.String** | The encoded payment session that you need to pass to the SDK. |  [optional]
**recurringDetails** | [**kotlin.collections.List&lt;RecurringDetail&gt;**](RecurringDetail.md) | The detailed list of stored payment details required to generate payment forms. Will be empty if oneClick is set to false in the request. |  [optional]



