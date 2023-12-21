
# NotifyShopperRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | 
**merchantAccount** | **kotlin.String** | The merchant account identifier with which you want to process the transaction. | 
**reference** | **kotlin.String** | Pre-debit notification reference sent by the merchant. This is a mandatory field | 
**shopperReference** | **kotlin.String** | The ID that uniquely identifies the shopper.  This &#x60;shopperReference&#x60; must be the same as the &#x60;shopperReference&#x60; used in the initial payment. | 
**billingDate** | **kotlin.String** | Date on which the subscription amount will be debited from the shopper. In YYYY-MM-DD format |  [optional]
**billingSequenceNumber** | **kotlin.String** | Sequence of the debit. Depends on Frequency and Billing Attempts Rule. |  [optional]
**displayedReference** | **kotlin.String** | Reference of Pre-debit notification that is displayed to the shopper. Optional field. Maps to reference if missing |  [optional]
**recurringDetailReference** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]



