
# DonationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**donationAccount** | **kotlin.String** | The Adyen account name of the charity. | 
**merchantAccount** | **kotlin.String** | The merchant account that is used to process the payment. | 
**modificationAmount** | [**Amount**](Amount.md) |  | 
**originalReference** | **kotlin.String** | The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification   |  [optional]
**platformChargebackLogic** | [**PlatformChargebackLogic**](PlatformChargebackLogic.md) |  |  [optional]
**reference** | **kotlin.String** | Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters. |  [optional]



