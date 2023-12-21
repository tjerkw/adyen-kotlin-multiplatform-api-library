
# InstallmentOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxValue** | **kotlin.Int** | The maximum number of installments offered for this payment method. |  [optional]
**plans** | [**inline**](#kotlin.collections.List&lt;Plans&gt;) | Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving** |  [optional]
**preselectedValue** | **kotlin.Int** | Preselected number of installments offered for this payment method. |  [optional]
**propertyValues** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with &#x60;maxValue&#x60;. |  [optional]


<a name="kotlin.collections.List<Plans>"></a>
## Enum: plans
Name | Value
---- | -----
plans | regular, revolving



