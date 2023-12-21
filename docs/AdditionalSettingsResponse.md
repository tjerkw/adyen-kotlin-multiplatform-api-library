
# AdditionalSettingsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**excludeEventCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Object containing list of event codes for which the notifcation will not be sent.  |  [optional]
**includeEventCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Object containing list of event codes for which the notifcation will be sent.  |  [optional]
**properties** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Boolean&gt;** | Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, &#x60;captureDelayHours&#x60;: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured. |  [optional]



