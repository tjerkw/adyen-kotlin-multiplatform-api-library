
# CompanyUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **kotlin.String** | The email address of the user. | 
**id** | **kotlin.String** | The unique identifier of the user. | 
**roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [roles](https://docs.adyen.com/account/user-roles) for this user. | 
**timeZoneCode** | **kotlin.String** | The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**. | 
**username** | **kotlin.String** | The username for this user. | 
**links** | [**Links**](Links.md) |  |  [optional]
**accountGroups** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user. |  [optional]
**active** | **kotlin.Boolean** | Indicates whether this user is active. |  [optional]
**apps** | **kotlin.collections.List&lt;kotlin.String&gt;** | Set of apps available to this user |  [optional]
**associatedMerchantAccounts** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user. |  [optional]
**name** | [**Name**](Name.md) |  |  [optional]



