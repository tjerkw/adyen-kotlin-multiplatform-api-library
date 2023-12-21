
# TerminalOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingEntity** | [**BillingEntity**](BillingEntity.md) |  |  [optional]
**customerOrderReference** | **kotlin.String** | The merchant-defined purchase order number. This will be printed on the packing list. |  [optional]
**id** | **kotlin.String** | The unique identifier of the order. |  [optional]
**items** | [**kotlin.collections.List&lt;OrderItem&gt;**](OrderItem.md) | The products included in the order. |  [optional]
**orderDate** | **kotlin.String** | The date and time that the order was placed, in UTC ISO 8601 format. For example, \&quot;2011-12-03T10:15:30Z\&quot;. |  [optional]
**shippingLocation** | [**ShippingLocation**](ShippingLocation.md) |  |  [optional]
**status** | **kotlin.String** | The processing status of the order. |  [optional]
**trackingUrl** | **kotlin.String** | The URL, provided by the carrier company, where the shipment can be tracked. |  [optional]



