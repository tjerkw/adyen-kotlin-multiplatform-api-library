
# AdditionalDataLevel23

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enhancedSchemeDataCustomerReference** | **kotlin.String** | The customer code. * Encoding: ASCII * Max length: 25 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataDestinationCountryCode** | **kotlin.String** | The three-letter [ISO 3166-1 alpha-3 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) for the destination address. * Encoding: ASCII * Fixed length: 3 characters |  [optional]
**enhancedSchemeDataDestinationPostalCode** | **kotlin.String** | The postal code of the destination address. * Encoding: ASCII * Max length: 10 characters * Must not start with a space |  [optional]
**enhancedSchemeDataDestinationStateProvinceCode** | **kotlin.String** | Destination state or province code. * Encoding: ASCII * Max length: 3 characters * Must not start with a space |  [optional]
**enhancedSchemeDataDutyAmount** | **kotlin.String** | The duty amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * For example, 2000 means USD 20.00. * Encoding: Numeric * Max length: 12 characters |  [optional]
**enhancedSchemeDataFreightAmount** | **kotlin.String** | The shipping amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * For example, 2000 means USD 20.00. * Encoding: Numeric *Max length: 12 characters |  [optional]
**enhancedSchemeDataItemDetailLineItemNrCommodityCode** | **kotlin.String** | The [UNSPC commodity code](https://www.unspsc.org/) of the item. * Encoding: ASCII * Max length: 12 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataItemDetailLineItemNrDescription** | **kotlin.String** | A description of the item. * Encoding: ASCII * Max length: 26 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataItemDetailLineItemNrDiscountAmount** | **kotlin.String** | The discount amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * For example, 2000 means USD 20.00. * Encoding: Numeric * Max length: 12 characters |  [optional]
**enhancedSchemeDataItemDetailLineItemNrProductCode** | **kotlin.String** | The product code. * Encoding: ASCII. * Max length: 12 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataItemDetailLineItemNrQuantity** | **kotlin.String** | The number of items. Must be an integer greater than zero. * Encoding: Numeric * Max length: 12 characters * Must not start with a space or be all spaces   |  [optional]
**enhancedSchemeDataItemDetailLineItemNrTotalAmount** | **kotlin.String** | The total amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * For example, 2000 means USD 20.00. * Max length: 12 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure** | **kotlin.String** | The unit of measurement for an item. * Encoding: ASCII  Max length: 3 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataItemDetailLineItemNrUnitPrice** | **kotlin.String** | The unit price in [minor units](https://docs.adyen.com/development-resources/currency-codes). * For example, 2000 means USD 20.00. * Encoding: Numeric * Max length: 12 characters * Must not be all zeros. |  [optional]
**enhancedSchemeDataOrderDate** | **kotlin.String** | The order date. * Format: &#x60;ddMMyy&#x60; * Encoding: ASCII * Max length: 6 characters |  [optional]
**enhancedSchemeDataShipFromPostalCode** | **kotlin.String** | The postal code of the address the item is shipped from. * Encoding: ASCII * Max length: 10 characters * Must not start with a space or be all spaces * Must not be all zeros. |  [optional]
**enhancedSchemeDataTotalTaxAmount** | **kotlin.String** | The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * For example, 2000 means USD 20.00. *Encoding: Numeric *Max length: 12 characters * Must not be all zeros. |  [optional]



