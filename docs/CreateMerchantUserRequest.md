
# CreateMerchantUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **kotlin.String** | The email address of the user. | 
**name** | [**Name**](Name.md) |  | 
**username** | **kotlin.String** | The user&#39;s email address that will be their username. Must be the same as the one in the &#x60;email&#x60; field. | 
**accountGroups** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user. |  [optional]
**roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [roles](https://docs.adyen.com/account/user-roles) for this user. |  [optional]
**timeZoneCode** | **kotlin.String** | The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**. |  [optional]



