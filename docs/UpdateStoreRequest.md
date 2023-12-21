
# UpdateStoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**UpdatableAddress**](UpdatableAddress.md) |  |  [optional]
**businessLineIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The unique identifiers of the [business lines](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines__resParam_id) that the store is associated with. |  [optional]
**description** | **kotlin.String** | The description of the store. |  [optional]
**externalReferenceId** | **kotlin.String** | When using the Zip payment method: The location ID that Zip has assigned to your store. |  [optional]
**phoneNumber** | **kotlin.String** | The phone number of the store, including &#39;+&#39; and country code in the [E.164](https://en.wikipedia.org/wiki/E.164) format. If passed in a different format, we convert and validate the phone number against E.164.  |  [optional]
**splitConfiguration** | [**StoreSplitConfiguration**](StoreSplitConfiguration.md) |  |  [optional]
**status** | [**inline**](#Status) | The status of the store. Possible values are:  - **active**: This value is assigned automatically when a store is created.  - **inactive**: The maximum [transaction limits and number of Store-and-Forward transactions](https://docs.adyen.com/point-of-sale/determine-account-structure/configure-features#payment-features) for the store are set to 0. This blocks new transactions, but captures are still possible. - **closed**: The terminals of the store are reassigned to the merchant inventory, so they can&#39;t process payments.  You can change the status from **active** to **inactive**, and from **inactive** to **active** or **closed**.  Once **closed**, a store can&#39;t be reopened. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | active, closed, inactive



