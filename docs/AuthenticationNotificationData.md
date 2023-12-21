
# AuthenticationNotificationData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication** | [**AuthenticationInfo**](AuthenticationInfo.md) |  | 
**id** | **kotlin.String** | Unique identifier of the authentication. | 
**paymentInstrumentId** | **kotlin.String** | Unique identifier of the payment instrument that was used for the authentication. | 
**purchase** | [**PurchaseInfo**](PurchaseInfo.md) |  | 
**status** | [**inline**](#Status) | Outcome of the authentication. Allowed values: * authenticated * rejected * error | 
**balancePlatform** | **kotlin.String** | The unique identifier of the balance platform. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | authenticated, rejected, error



