
# AssignTerminalsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyAccount** | **kotlin.String** | Your company account. To return terminals to the company inventory, specify only this parameter and the &#x60;terminals&#x60;. | 
**terminals** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array containing a list of terminal IDs that you want to assign or reassign to the merchant account or store, or that you want to return to the company inventory.  For example, &#x60;[\&quot;V400m-324689776\&quot;,\&quot;P400Plus-329127412\&quot;]&#x60;. | 
**merchantAccount** | **kotlin.String** | Name of the merchant account. Specify this parameter to assign terminals to this merchant account or to a store under this merchant account. |  [optional]
**merchantInventory** | **kotlin.Boolean** | Boolean that indicates if you are assigning the terminals to the merchant inventory. Do not use when assigning terminals to a store. Required when assigning the terminal to a merchant account.  - Set this to **true** to assign the terminals to the merchant inventory. This also means that the terminals cannot be boarded.  - Set this to **false** to assign the terminals to the merchant account as in-store terminals. This makes the terminals ready to be boarded and to process payments through the specified merchant account. |  [optional]
**store** | **kotlin.String** | The store code of the store that you want to assign the terminals to. |  [optional]



