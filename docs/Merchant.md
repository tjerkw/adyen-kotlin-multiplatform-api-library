
# Merchant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**MerchantLinks**](MerchantLinks.md) |  |  [optional]
**captureDelay** | **kotlin.String** | The [capture delay](https://docs.adyen.com/online-payments/capture#capture-delay) set for the merchant account.  Possible values: * **Immediate** * **Manual** * Number of days from **1** to **29** |  [optional]
**companyId** | **kotlin.String** | The unique identifier of the company account this merchant belongs to |  [optional]
**dataCenters** | [**kotlin.collections.List&lt;DataCenter&gt;**](DataCenter.md) | List of available data centers.  Adyen has several data centers around the world.In the URL that you use for making API requests, we recommend you use the live URL prefix from the data center closest to your shoppers. |  [optional]
**defaultShopperInteraction** | **kotlin.String** | The default [&#x60;shopperInteraction&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/v68/post/payments__reqParam_shopperInteraction) value used when processing payments through this merchant account. |  [optional]
**description** | **kotlin.String** | Your description for the merchant account, maximum 300 characters |  [optional]
**id** | **kotlin.String** | The unique identifier of the merchant account. |  [optional]
**merchantCity** | **kotlin.String** | The city where the legal entity of this merchant account is registered. |  [optional]
**name** | **kotlin.String** | The name of the legal entity associated with the merchant account. |  [optional]
**pricingPlan** | **kotlin.String** | Only applies to merchant accounts managed by Adyen&#39;s partners. The name of the pricing plan assigned to the merchant account. |  [optional]
**primarySettlementCurrency** | **kotlin.String** | The currency of the country where the legal entity of this merchant account is registered. Format: [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, a legal entity based in the United States has USD as the primary settlement currency. |  [optional]
**reference** | **kotlin.String** | Reference of the merchant account. |  [optional]
**shopWebAddress** | **kotlin.String** | The URL for the ecommerce website used with this merchant account. |  [optional]
**status** | **kotlin.String** | The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. You cannot process new payments but you can still modify payments, for example issue refunds. You can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled. |  [optional]



