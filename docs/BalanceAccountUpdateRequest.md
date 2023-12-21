
# BalanceAccountUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountHolderId** | **kotlin.String** | The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account. |  [optional]
**description** | **kotlin.String** | A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder. |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs. |  [optional]
**platformPaymentConfiguration** | [**PlatformPaymentConfiguration**](PlatformPaymentConfiguration.md) |  |  [optional]
**reference** | **kotlin.String** | Your reference to the balance account, maximum 150 characters. |  [optional]
**status** | [**inline**](#Status) | The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **active**.  Possible values: **active**, **inactive**, **closed**, **suspended**. |  [optional]
**timeZone** | **kotlin.String** | The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, closed, inactive, suspended



