
# FundRecipient

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**paymentMethod** | [**CardDetails**](CardDetails.md) |  |  [optional]
**shopperEmail** | **kotlin.String** | the email address of the person |  [optional]
**shopperName** | [**Name**](Name.md) |  |  [optional]
**shopperReference** | **kotlin.String** | Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address. |  [optional]
**storedPaymentMethodId** | **kotlin.String** | This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token. |  [optional]
**subMerchant** | [**SubMerchant**](SubMerchant.md) |  |  [optional]
**telephoneNumber** | **kotlin.String** | the telephone number of the person |  [optional]
**walletIdentifier** | **kotlin.String** | indicates where the money is going |  [optional]
**walletOwnerTaxId** | **kotlin.String** | indicates the tax identifier of the fund recepient |  [optional]



