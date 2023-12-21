
# ReturnTransferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier of the return. |  [optional]
**reference** | **kotlin.String** | Your internal reference for the return. |  [optional]
**status** | [**inline**](#Status) | The resulting status of the return.  For example: **authorised**, **booked**, **error**. |  [optional]
**transferId** | **kotlin.String** | The unique identifier of the original transfer. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | Authorised, Declined



