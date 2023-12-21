
# MidServiceNotificationData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier of the resource. | 
**merchantId** | **kotlin.String** | The unique identifier of the merchant account. | 
**status** | [**inline**](#Status) | The status of the request to add a payment method. Possible values:  * **success**: the payment method was added. * **failure**: the request failed. * **capabilityPending**: the **receivePayments** capability is not allowed.  | 
**type** | **kotlin.String** | Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). | 
**allowed** | **kotlin.Boolean** | Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account. |  [optional]
**enabled** | **kotlin.Boolean** | Indicates whether the payment method is enabled (**true**) or disabled (**false**). |  [optional]
**reference** | **kotlin.String** | Your reference for the payment method. |  [optional]
**storeId** | **kotlin.String** | The unique identifier of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/merchants/{id}/paymentMethodSettings__reqParam_storeId), if any. |  [optional]
**verificationStatus** | [**inline**](#VerificationStatus) | Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected** |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | success, failure, capabilityPending, dataRequired, updatesExpected


<a name="VerificationStatus"></a>
## Enum: verificationStatus
Name | Value
---- | -----
verificationStatus | valid, pending, invalid, rejected



