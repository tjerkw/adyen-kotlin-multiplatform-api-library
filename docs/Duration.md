
# Duration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unit** | [**inline**](#Unit) | The unit of time. You can only use **minutes** and **hours** if the &#x60;interval.type&#x60; is **sliding**.  Possible values: **minutes**, **hours**, **days**, **weeks**, or **months** |  [optional]
**&#x60;value&#x60;** | **kotlin.Int** | The length of time by the unit. For example, 5 days.  The maximum duration is 90 days or an equivalent in other units. For example, 3 months. |  [optional]


<a name="Unit"></a>
## Enum: unit
Name | Value
---- | -----
unit | days, hours, minutes, months, weeks



