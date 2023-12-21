
# Gratuity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowCustomAmount** | **kotlin.Boolean** | Indicates whether one of the predefined tipping options is to let the shopper enter a custom tip. If **true**, only three of the other options defined in &#x60;predefinedTipEntries&#x60; are shown. |  [optional]
**currency** | **kotlin.String** | The currency that the tipping settings apply to. |  [optional]
**predefinedTipEntries** | **kotlin.collections.List&lt;kotlin.String&gt;** | Tipping options the shopper can choose from if &#x60;usePredefinedTipEntries&#x60; is **true**. The maximum number of predefined options is four, or three plus the option to enter a custom tip. The options can be a mix of:  - A percentage of the transaction amount. Example: **5%** - A tip amount in [minor units](https://docs.adyen.com/development-resources/currency-codes). Example: **500** for a EUR 5 tip. |  [optional]
**usePredefinedTipEntries** | **kotlin.Boolean** | Indicates whether the terminal shows a prompt to enter a tip (**false**), or predefined tipping options to choose from (**true**). |  [optional]



