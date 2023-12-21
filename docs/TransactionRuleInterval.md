
# TransactionRuleInterval

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The [type of interval](https://docs.adyen.com/issuing/transaction-rules#time-intervals) during which the rule conditions and limits apply, and how often counters are reset.  Possible values:   * **perTransaction**: conditions are evaluated and the counters are reset for every transaction.  * **daily**: the counters are reset daily at 00:00:00 UTC.  * **weekly**: the counters are reset every Monday at 00:00:00 UTC.   * **monthly**: the counters reset every first day of the month at 00:00:00 UTC.   * **lifetime**: conditions are applied to the lifetime of the payment instrument.  * **rolling**: conditions are applied and the counters are reset based on a &#x60;duration&#x60;. If the reset date and time are not provided, Adyen applies the default reset time similar to fixed intervals. For example, if the duration is every two weeks, the counter resets every third Monday at 00:00:00 UTC.  * **sliding**: conditions are applied and the counters are reset based on the current time and a &#x60;duration&#x60; that you specify. | 
**dayOfMonth** | **kotlin.Int** | The day of month, used when the &#x60;duration.unit&#x60; is **months**. If not provided, by default, this is set to **1**, the first day of the month. |  [optional]
**dayOfWeek** | [**inline**](#DayOfWeek) | The day of week, used when the &#x60;duration.unit&#x60; is **weeks**. If not provided, by default, this is set to **monday**.  Possible values: **sunday**, **monday**, **tuesday**, **wednesday**, **thursday**, **friday**. |  [optional]
**duration** | [**Duration**](Duration.md) |  |  [optional]
**timeOfDay** | **kotlin.String** | The time of day, in **hh:mm:ss** format, used when the &#x60;duration.unit&#x60; is **hours**. If not provided, by default, this is set to **00:00:00**. |  [optional]
**timeZone** | **kotlin.String** | The [time zone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). For example, **Europe/Amsterdam**. By default, this is set to **UTC**. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | daily, lifetime, monthly, perTransaction, rolling, sliding, weekly


<a name="DayOfWeek"></a>
## Enum: dayOfWeek
Name | Value
---- | -----
dayOfWeek | friday, monday, saturday, sunday, thursday, tuesday, wednesday



