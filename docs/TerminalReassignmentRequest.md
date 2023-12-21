
# TerminalReassignmentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **kotlin.String** | The unique identifier of the company account to which the terminal is reassigned. |  [optional]
**inventory** | **kotlin.Boolean** | Must be specified when reassigning terminals to a merchant account:  - If set to **true**, reassigns terminals to the inventory of the merchant account and the terminals cannot process transactions.  - If set to **false**, reassigns terminals directly to the merchant account and the terminals can process transactions. |  [optional]
**merchantId** | **kotlin.String** | The unique identifier of the merchant account to which the terminal is reassigned. When reassigning terminals to a merchant account, you must specify the &#x60;inventory&#x60; field. |  [optional]
**storeId** | **kotlin.String** | The unique identifier of the store to which the terminal is reassigned. |  [optional]



