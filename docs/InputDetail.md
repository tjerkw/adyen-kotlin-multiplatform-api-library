
# InputDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configuration** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Configuration parameters for the required input. |  [optional]
**details** | [**kotlin.collections.List&lt;SubInputDetail&gt;**](SubInputDetail.md) | Input details can also be provided recursively. |  [optional]
**inputDetails** | [**kotlin.collections.List&lt;SubInputDetail&gt;**](SubInputDetail.md) | Input details can also be provided recursively (deprecated). |  [optional]
**itemSearchUrl** | **kotlin.String** | In case of a select, the URL from which to query the items. |  [optional]
**items** | [**kotlin.collections.List&lt;Item&gt;**](Item.md) | In case of a select, the items to choose from. |  [optional]
**key** | **kotlin.String** | The value to provide in the result. |  [optional]
**optional** | **kotlin.Boolean** | True if this input value is optional. |  [optional]
**type** | **kotlin.String** | The type of the required input. |  [optional]
**&#x60;value&#x60;** | **kotlin.String** | The value can be pre-filled, if available. |  [optional]



