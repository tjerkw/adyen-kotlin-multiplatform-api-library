
# GeneratePciDescriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalSalesChannels** | [**inline**](#kotlin.collections.List&lt;AdditionalSalesChannels&gt;) | An array of additional sales channels to generate PCI questionnaires. Include the relevant sales channels if you need your user to sign PCI questionnaires. Not required if you [create stores](https://docs.adyen.com/marketplaces-and-platforms/additional-for-platform-setup/create-stores/) and [add payment methods](https://docs.adyen.com/marketplaces-and-platforms/payment-methods/) before you generate the questionnaires.  Possible values: *  **eCommerce** *  **pos** *  **ecomMoto** *  **posMoto**   |  [optional]
**language** | **kotlin.String** | Sets the language of the PCI questionnaire. Its value is a two-character [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1) language code, for example, **en**. |  [optional]


<a name="kotlin.collections.List<AdditionalSalesChannels>"></a>
## Enum: additionalSalesChannels
Name | Value
---- | -----
additionalSalesChannels | eCommerce, ecomMoto, pos, posMoto



