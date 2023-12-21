
# GetTerminalsUnderAccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyAccount** | **kotlin.String** | Your company account. If you only specify this parameter, the response includes all terminals at all account levels. | 
**merchantAccount** | **kotlin.String** | The merchant account. This is required if you are retrieving the terminals assigned to a store.If you don&#39;t specify a &#x60;store&#x60; the response includes the terminals assigned to the specified merchant account and the terminals assigned to the stores under this merchant account. |  [optional]
**store** | **kotlin.String** | The store code of the store. With this parameter, the response only includes the terminals assigned to the specified store. |  [optional]



