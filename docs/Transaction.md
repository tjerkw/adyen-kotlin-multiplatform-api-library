
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountHolder** | [**ResourceReference**](ResourceReference.md) |  | 
**amount** | [**Amount**](Amount.md) |  | 
**balanceAccount** | [**ResourceReference**](ResourceReference.md) |  | 
**balancePlatform** | **kotlin.String** | The unique identifier of the balance platform. | 
**bookingDate** | **kotlin.String** | The date the transaction was booked into the balance account. | 
**id** | **kotlin.String** | The unique identifier of the transaction. | 
**status** | [**inline**](#Status) | The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.   | 
**valueDate** | **kotlin.String** | The date the transfer amount becomes available in the balance account. | 
**creationDate** | **kotlin.String** | The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**. |  [optional]
**transfer** | [**TransferData**](TransferData.md) |  |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | booked, pending



