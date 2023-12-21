
# SubjectErasureByPspReferenceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forceErasure** | **kotlin.Boolean** | Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction. |  [optional]
**merchantAccount** | **kotlin.String** | Your merchant account |  [optional]
**pspReference** | **kotlin.String** | The PSP reference of the payment. We will delete all shopper-related data for this payment. |  [optional]



