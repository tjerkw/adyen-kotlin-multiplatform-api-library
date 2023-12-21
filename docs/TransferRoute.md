
# TransferRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**inline**](#Category) |  The type of transfer.   Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  |  [optional]
**country** | **kotlin.String** | The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**. |  [optional]
**currency** | **kotlin.String** | The three-character ISO currency code of transfer. For example, **USD** or **EUR**. |  [optional]
**priority** | [**inline**](#Priority) | The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN). |  [optional]
**requirements** | [**TransferRouteRequirements**](TransferRouteRequirements.md) |  |  [optional]


<a name="Category"></a>
## Enum: category
Name | Value
---- | -----
category | bank, card, grants, internal, issuedCard, migration, platformPayment, topUp, upgrade


<a name="Priority"></a>
## Enum: priority
Name | Value
---- | -----
priority | crossBorder, fast, instant, internal, regular, wire



