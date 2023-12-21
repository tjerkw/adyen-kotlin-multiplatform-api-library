
# PlatformPaymentConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**salesDayClosingTime** | **kotlin.String** | Specifies at what time a [sales day](https://docs.adyen.com/marketplaces-and-platforms/settle-funds/sales-day-settlement#sales-day) ends.  Possible values: Time in **\&quot;HH:MM\&quot;** format. **HH** ranges from **00** to **07**. **MM** must be **00**.  Default value: **\&quot;00:00\&quot;**. |  [optional]
**settlementDelayDays** | **kotlin.Int** | Specifies after how many business days the funds in a [settlement batch](https://docs.adyen.com/marketplaces-and-platforms/settle-funds/sales-day-settlement#settlement-batch) are made available.  Possible values: **0** to **10**, or **null**. * Setting this value to an integer enables [Sales day settlement](https://docs.adyen.com/marketplaces-and-platforms/settle-funds/sales-day-settlement). * Setting this value to **null** enables [Pass-through settlement](https://docs.adyen.com/marketplaces-and-platforms/settle-funds/pass-through-settlement).  Default value: **null**. |  [optional]



