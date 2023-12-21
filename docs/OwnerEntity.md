
# OwnerEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique identifier of the resource that owns the document. For &#x60;type&#x60; **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). For &#x60;type&#x60; **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id). | 
**type** | **kotlin.String** | Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**. | 



