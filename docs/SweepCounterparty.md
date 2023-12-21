
# SweepCounterparty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAccountId** | **kotlin.String** | The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as &#x60;schedule.type&#x60; **daily** or **monthly**. |  [optional]
**merchantAccount** | **kotlin.String** | The merchant account that will be the source of funds.  You can only use this parameter with sweeps of &#x60;type&#x60; **pull** and &#x60;schedule.type&#x60; **balance**, and if you are processing payments with Adyen. |  [optional]
**transferInstrumentId** | **kotlin.String** | The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id) depending on the sweep &#x60;type&#x60;  . To [set up automated top-up sweeps to balance accounts](https://docs.adyen.com/marketplaces-and-platforms/top-up-balance-account/#before-you-begin), use this parameter in combination with a &#x60;merchantAccount&#x60; and a sweep &#x60;type&#x60; of **pull**. Top-up sweeps start a direct debit request from the source transfer instrument. Contact Adyen Support to enable this feature. |  [optional]



