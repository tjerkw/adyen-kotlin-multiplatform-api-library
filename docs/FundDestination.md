
# FundDestination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | a map of name/value pairs for passing in additional/industry-specific data |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**card** | [**Card**](Card.md) |  |  [optional]
**selectedRecurringDetailReference** | **kotlin.String** | The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail. |  [optional]
**shopperEmail** | **kotlin.String** | the email address of the person |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperReference** | **kotlin.String** | Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**subMerchant** | [**SubMerchant**](SubMerchant.md) |  |  [optional]
**telephoneNumber** | **kotlin.String** | the telephone number of the person |  [optional]



