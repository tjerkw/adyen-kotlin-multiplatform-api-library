
# Store

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**store** | **kotlin.String** | The code of the store. | 
**address** | [**Address**](Address.md) |  |  [optional]
**description** | **kotlin.String** | The description of the store. |  [optional]
**inStoreTerminals** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of terminals assigned to the store. |  [optional]
**merchantAccountCode** | **kotlin.String** | The code of the merchant account. |  [optional]
**status** | **kotlin.String** | The status of the store:  - &#x60;PreActive&#x60;: the store has been created, but not yet activated.   - &#x60;Active&#x60;: the store has been activated. This means you can process payments for this store.   - &#x60;Inactive&#x60;: the store is currently not active.   - &#x60;InactiveWithModifications&#x60;: the store is currently not active, but payment modifications such as refunds are possible.   - &#x60;Closed&#x60;: the store has been closed.  |  [optional]



