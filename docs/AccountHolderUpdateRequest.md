
# AccountHolderUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balancePlatform** | **kotlin.String** | The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms. |  [optional]
**capabilities** | [**kotlin.collections.Map&lt;kotlin.String, AccountHolderCapability&gt;**](AccountHolderCapability.md) | Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability. |  [optional]
**contactDetails** | [**ContactDetails**](ContactDetails.md) |  |  [optional]
**description** | **kotlin.String** | Your description for the account holder, maximum 300 characters. |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs. |  [optional]
**migratedAccountHolderCode** | **kotlin.String** | The unique identifier of the migrated account holder in the classic integration. |  [optional] [readonly]
**primaryBalanceAccount** | **kotlin.String** | The ID of the account holder&#39;s primary balance account. By default, this is set to the first balance account that you create for the account holder. To assign a different balance account, send a PATCH request. |  [optional]
**reference** | **kotlin.String** | Your reference for the account holder, maximum 150 characters. |  [optional]
**status** | [**inline**](#Status) | The status of the account holder.  Possible values:    * **active**: The account holder is active. This is the default status when creating an account holder.    * **inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **closed**: The account holder is permanently deactivated by you. This action cannot be undone. |  [optional]
**timeZone** | **kotlin.String** | The time zone of the account holder. For example, **Europe/Amsterdam**. Defaults to the time zone of the balance platform if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  [optional]
**verificationDeadlines** | [**kotlin.collections.List&lt;VerificationDeadline&gt;**](VerificationDeadline.md) | List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved. |  [optional] [readonly]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, closed, inactive, suspended



