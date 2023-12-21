
# BalanceTransferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**createdAt** | **kotlin.String** | The date when the balance transfer was requested. | 
**fromMerchant** | **kotlin.String** | The unique identifier of the source merchant account from which funds are deducted. | 
**pspReference** | **kotlin.String** | Adyen&#39;s 16-character string reference associated with the balance transfer. | 
**status** | [**inline**](#Status) | The status of the balance transfer. Possible values: **transferred**, **failed**, **error**, and **notEnoughBalance**. | 
**toMerchant** | **kotlin.String** | The unique identifier of the destination merchant account from which funds are transferred. | 
**type** | [**inline**](#Type) | The type of balance transfer. Possible values: **tax**, **fee**, **terminalSale**, **credit**, **debit**, and **adjustment**. | 
**description** | **kotlin.String** | A human-readable description for the transfer. You can use alphanumeric characters and hyphens. We recommend sending a maximum of 140 characters, otherwise the description may be truncated. |  [optional]
**reference** | **kotlin.String** | A reference for the balance transfer. If you don&#39;t provide this in the request, Adyen generates a unique reference. Maximum length: 80 characters. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | error, failed, notEnoughBalance, transferred


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | tax, fee, terminalSale, credit, debit, adjustment



