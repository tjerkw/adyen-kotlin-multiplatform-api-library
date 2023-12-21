
# PartyIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullName** | **kotlin.String** | The name of the entity. | 
**address** | [**Address**](Address.md) |  |  [optional]
**dateOfBirth** | **kotlin.String** | The date of birth of the individual in [ISO-8601](https://www.w3.org/TR/NOTE-datetime) format. For example, **YYYY-MM-DD**. Should not be before January 1, 1900.  Allowed only when &#x60;type&#x60; is **individual**. |  [optional]
**firstName** | **kotlin.String** | First name of the individual.  Allowed only when &#x60;type&#x60; is **individual**. |  [optional]
**lastName** | **kotlin.String** | Last name of the individual.  Allowed only when &#x60;type&#x60; is **individual**. |  [optional]
**reference** | **kotlin.String** | A unique reference to identify the party or counterparty involved in transfers. This identifier ensures consistency and uniqueness throughout all transactions initiated to and from the same party. For example, your client&#39;s unique wallet or payee ID. |  [optional]
**type** | [**inline**](#Type) | The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | individual, organization, unknown



