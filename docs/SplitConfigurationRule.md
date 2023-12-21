
# SplitConfigurationRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **kotlin.String** | The currency condition that defines whether the split logic applies. Its value must be a three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217). | 
**paymentMethod** | **kotlin.String** | The payment method condition that defines whether the split logic applies.  Possible values: * [Payment method variant](https://docs.adyen.com/development-resources/paymentmethodvariant): Apply the split logic for a specific payment method. * **ANY**: Apply the split logic for all available payment methods. | 
**shopperInteraction** | [**inline**](#ShopperInteraction) | The sales channel condition that defines whether the split logic applies.  Possible values: * **Ecommerce**: Online transactions where the cardholder is present. * **ContAuth**: Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). * **Moto**: Mail-order and telephone-order transactions where the customer is in contact with the merchant via email or telephone. * **POS**: Point-of-sale transactions where the customer is physically present to make a payment using a secure payment terminal. * **ANY**: All sales channels. | 
**splitLogic** | [**SplitConfigurationLogic**](SplitConfigurationLogic.md) |  | 
**fundingSource** | [**inline**](#FundingSource) | The funding source condition of the payment method (only for cards).  Possible values: **credit**, **debit**, or **ANY**. |  [optional]
**ruleId** | **kotlin.String** | The unique identifier of the split configuration rule. |  [optional] [readonly]


<a name="ShopperInteraction"></a>
## Enum: shopperInteraction
Name | Value
---- | -----
shopperInteraction | Ecommerce, ContAuth, Moto, POS, ANY


<a name="FundingSource"></a>
## Enum: fundingSource
Name | Value
---- | -----
fundingSource | credit, debit, ANY


