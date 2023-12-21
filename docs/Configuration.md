
# Configuration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **kotlin.String** | Payment method, like **eftpos_australia** or **mc**. See the [possible values](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).  | 
**currencies** | [**kotlin.collections.List&lt;Currency&gt;**](Currency.md) | Currency, and surcharge percentage or amount. | 
**country** | **kotlin.collections.List&lt;kotlin.String&gt;** | Countries, to filter different surcharge amounts for domestic or international cards. |  [optional]
**sources** | **kotlin.collections.List&lt;kotlin.String&gt;** | Funding source. Possible values: * **Credit** * **Debit** |  [optional]



