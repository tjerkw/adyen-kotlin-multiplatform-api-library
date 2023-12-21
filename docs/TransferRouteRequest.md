
# TransferRouteRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balancePlatform** | **kotlin.String** | The unique identifier assigned to the balance platform associated with the account holder. | 
**category** | [**inline**](#Category) |  The type of transfer. Possible values:    - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  | 
**currency** | **kotlin.String** | The three-character ISO currency code of transfer. For example, **USD** or **EUR**. | 
**balanceAccountId** | **kotlin.String** | The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id). Required if &#x60;counterparty&#x60; is **transferInstrumentId**. |  [optional]
**counterparty** | [**Counterparty**](Counterparty.md) |  |  [optional]
**country** | **kotlin.String** | The two-character ISO-3166-1 alpha-2 country code of the counterparty. For example, **US** or **NL**.  &gt; Either &#x60;counterparty&#x60; or &#x60;country&#x60; field must be provided in a transfer route request. |  [optional]
**priorities** | [**inline**](#kotlin.collections.List&lt;Priorities&gt;) | The list of priorities for the bank transfer. Priorities set the speed at which the transfer is sent and the fees that you have to pay. Multiple values can be provided. Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN). |  [optional]


<a name="Category"></a>
## Enum: category
Name | Value
---- | -----
category | bank


<a name="kotlin.collections.List<Priorities>"></a>
## Enum: priorities
Name | Value
---- | -----
priorities | crossBorder, fast, instant, internal, regular, wire



