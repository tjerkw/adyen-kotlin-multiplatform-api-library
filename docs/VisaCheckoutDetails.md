
# VisaCheckoutDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**visaCheckoutCallId** | **kotlin.String** | The Visa Click to Pay Call ID value. When your shopper selects a payment and/or a shipping address from Visa Click to Pay, you will receive a Visa Click to Pay Call ID. | 
**checkoutAttemptId** | **kotlin.String** | The checkout attempt identifier. |  [optional]
**fundingSource** | [**inline**](#FundingSource) | The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**. |  [optional]
**type** | [**inline**](#Type) | **visacheckout** |  [optional]


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | visacheckout



