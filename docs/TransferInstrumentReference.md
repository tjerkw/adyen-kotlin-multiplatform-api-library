
# TransferInstrumentReference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountIdentifier** | **kotlin.String** | The masked IBAN or bank account number. | 
**id** | **kotlin.String** | The unique identifier of the resource. | 
**realLastFour** | **kotlin.String** | Four last digits of the bank account number. If the transfer instrument is created using [instant bank account verification](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-08-hosted-onboarding), and it is a virtual bank account, these digits may be different from the last four digits of the masked account number. |  [optional]
**trustedSource** | **kotlin.Boolean** | Identifies if the bank account was created through [instant bank verification](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-08-hosted-onboarding). |  [optional] [readonly]



