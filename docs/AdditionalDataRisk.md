
# AdditionalDataRisk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**riskdataCustomFieldName** | **kotlin.String** | The data for your custom risk field. For more information, refer to [Create custom risk fields](https://docs.adyen.com/risk-management/configure-custom-risk-rules#step-1-create-custom-risk-fields). |  [optional]
**riskdataBasketItemItemNrAmountPerItem** | **kotlin.String** | The price of item in the basket, represented in [minor units](https://docs.adyen.com/development-resources/currency-codes). |  [optional]
**riskdataBasketItemItemNrBrand** | **kotlin.String** | Brand of the item. |  [optional]
**riskdataBasketItemItemNrCategory** | **kotlin.String** | Category of the item. |  [optional]
**riskdataBasketItemItemNrColor** | **kotlin.String** | Color of the item. |  [optional]
**riskdataBasketItemItemNrCurrency** | **kotlin.String** | The three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional]
**riskdataBasketItemItemNrItemID** | **kotlin.String** | ID of the item. |  [optional]
**riskdataBasketItemItemNrManufacturer** | **kotlin.String** | Manufacturer of the item. |  [optional]
**riskdataBasketItemItemNrProductTitle** | **kotlin.String** | A text description of the product the invoice line refers to. |  [optional]
**riskdataBasketItemItemNrQuantity** | **kotlin.String** | Quantity of the item purchased. |  [optional]
**riskdataBasketItemItemNrReceiverEmail** | **kotlin.String** | Email associated with the given product in the basket (usually in electronic gift cards). |  [optional]
**riskdataBasketItemItemNrSize** | **kotlin.String** | Size of the item. |  [optional]
**riskdataBasketItemItemNrSku** | **kotlin.String** | [Stock keeping unit](https://en.wikipedia.org/wiki/Stock_keeping_unit). |  [optional]
**riskdataBasketItemItemNrUpc** | **kotlin.String** | [Universal Product Code](https://en.wikipedia.org/wiki/Universal_Product_Code). |  [optional]
**riskdataPromotionsPromotionItemNrPromotionCode** | **kotlin.String** | Code of the promotion. |  [optional]
**riskdataPromotionsPromotionItemNrPromotionDiscountAmount** | **kotlin.String** | The discount amount of the promotion, represented in [minor units](https://docs.adyen.com/development-resources/currency-codes). |  [optional]
**riskdataPromotionsPromotionItemNrPromotionDiscountCurrency** | **kotlin.String** | The three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217). |  [optional]
**riskdataPromotionsPromotionItemNrPromotionDiscountPercentage** | **kotlin.String** | Promotion&#39;s percentage discount. It is represented in percentage value and there is no need to include the &#39;%&#39; sign.  e.g. for a promotion discount of 30%, the value of the field should be 30. |  [optional]
**riskdataPromotionsPromotionItemNrPromotionName** | **kotlin.String** | Name of the promotion. |  [optional]
**riskdataRiskProfileReference** | **kotlin.String** | Reference number of the risk profile that you want to apply to the payment. If not provided or left blank, the merchant-level account&#39;s default risk profile will be applied to the payment. For more information, see [dynamically assign a risk profile to a payment](https://docs.adyen.com/risk-management/create-and-use-risk-profiles#dynamically-assign-a-risk-profile-to-a-payment). |  [optional]
**riskdataSkipRisk** | **kotlin.String** | If this parameter is provided with the value **true**, risk checks for the payment request are skipped and the transaction will not get a risk score. |  [optional]



