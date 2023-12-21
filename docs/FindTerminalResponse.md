
# FindTerminalResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyAccount** | **kotlin.String** | The company account that the terminal is associated with. If this is the only account level shown in the response, the terminal is assigned to the inventory of the company account. | 
**terminal** | **kotlin.String** | The unique terminal ID. | 
**merchantAccount** | **kotlin.String** | The merchant account that the terminal is associated with. If the response doesn&#39;t contain a &#x60;store&#x60; the terminal is assigned to this merchant account. |  [optional]
**merchantInventory** | **kotlin.Boolean** | Boolean that indicates if the terminal is assigned to the merchant inventory. This is returned when the terminal is assigned to a merchant account.  - If **true**, this indicates that the terminal is in the merchant inventory. This also means that the terminal cannot be boarded.  - If **false**, this indicates that the terminal is assigned to the merchant account as an in-store terminal. This means that the terminal is ready to be boarded, or is already boarded. |  [optional]
**store** | **kotlin.String** | The store code of the store that the terminal is assigned to. |  [optional]



