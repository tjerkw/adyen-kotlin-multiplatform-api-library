
# AdditionalBankIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **kotlin.String** | The value of the additional bank identification. |  [optional]
**type** | [**inline**](#Type) | The type of additional bank identification, depending on the country.  Possible values:   * **gbSortCode**: The 6-digit [UK sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or spaces  * **usRoutingNumber**: The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or spaces. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | gbSortCode, usRoutingNumber



