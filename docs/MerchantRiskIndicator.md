
# MerchantRiskIndicator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressMatch** | **kotlin.Boolean** | Whether the chosen delivery address is identical to the billing address. |  [optional]
**deliveryAddressIndicator** | [**inline**](#DeliveryAddressIndicator) | Indicator regarding the delivery address. Allowed values: * &#x60;shipToBillingAddress&#x60; * &#x60;shipToVerifiedAddress&#x60; * &#x60;shipToNewAddress&#x60; * &#x60;shipToStore&#x60; * &#x60;digitalGoods&#x60; * &#x60;goodsNotShipped&#x60; * &#x60;other&#x60; |  [optional]
**deliveryEmail** | **kotlin.String** | The delivery email address (for digital goods). |  [optional]
**deliveryEmailAddress** | **kotlin.String** | For Electronic delivery, the email address to which the merchandise was delivered. Maximum length: 254 characters. |  [optional]
**deliveryTimeframe** | [**inline**](#DeliveryTimeframe) | The estimated delivery time for the shopper to receive the goods. Allowed values: * &#x60;electronicDelivery&#x60; * &#x60;sameDayShipping&#x60; * &#x60;overnightShipping&#x60; * &#x60;twoOrMoreDaysShipping&#x60; |  [optional]
**giftCardAmount** | [**Amount**](Amount.md) |  |  [optional]
**giftCardCount** | **kotlin.Int** | For prepaid or gift card purchase, total count of individual prepaid or gift cards/codes purchased. |  [optional]
**giftCardCurr** | **kotlin.String** | For prepaid or gift card purchase, [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html) three-digit currency code of the gift card, other than those listed in Table A.5 of the EMVCo 3D Secure Protocol and Core Functions Specification. |  [optional]
**preOrderDate** | **kotlin.String** | For pre-order purchases, the expected date this product will be available to the shopper. |  [optional]
**preOrderPurchase** | **kotlin.Boolean** | Indicator for whether this transaction is for pre-ordering a product. |  [optional]
**preOrderPurchaseInd** | **kotlin.String** | Indicates whether Cardholder is placing an order for merchandise with a future availability or release date. |  [optional]
**reorderItems** | **kotlin.Boolean** | Indicator for whether the shopper has already purchased the same items in the past. |  [optional]
**reorderItemsInd** | **kotlin.String** | Indicates whether the cardholder is reordering previously purchased merchandise. |  [optional]
**shipIndicator** | **kotlin.String** | Indicates shipping method chosen for the transaction. |  [optional]


<a name="DeliveryAddressIndicator"></a>
## Enum: deliveryAddressIndicator
Name | Value
---- | -----
deliveryAddressIndicator | shipToBillingAddress, shipToVerifiedAddress, shipToNewAddress, shipToStore, digitalGoods, goodsNotShipped, other


<a name="DeliveryTimeframe"></a>
## Enum: deliveryTimeframe
Name | Value
---- | -----
deliveryTimeframe | electronicDelivery, sameDayShipping, overnightShipping, twoOrMoreDaysShipping



