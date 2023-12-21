
# UpdateCompanyUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountGroups** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user. |  [optional]
**active** | **kotlin.Boolean** | Indicates whether this user is active. |  [optional]
**associatedMerchantAccounts** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) to associate the user with. |  [optional]
**email** | **kotlin.String** | The email address of the user. |  [optional]
**name** | [**Name2**](Name2.md) |  |  [optional]
**roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [roles](https://docs.adyen.com/account/user-roles) for this user. |  [optional]
**timeZoneCode** | **kotlin.String** | The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**. |  [optional]



