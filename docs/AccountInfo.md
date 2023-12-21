
# AccountInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountAgeIndicator** | [**inline**](#AccountAgeIndicator) | Indicator for the length of time since this shopper account was created in the merchant&#39;s environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days |  [optional]
**accountChangeDate** | **kotlin.String** | Date when the shopper&#39;s account was last changed. |  [optional]
**accountChangeIndicator** | [**inline**](#AccountChangeIndicator) | Indicator for the length of time since the shopper&#39;s account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days |  [optional]
**accountCreationDate** | **kotlin.String** | Date when the shopper&#39;s account was created. |  [optional]
**accountType** | [**inline**](#AccountType) | Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit |  [optional]
**addCardAttemptsDay** | **kotlin.Int** | Number of attempts the shopper tried to add a card to their account in the last day. |  [optional]
**deliveryAddressUsageDate** | **kotlin.String** | Date the selected delivery address was first used. |  [optional]
**deliveryAddressUsageIndicator** | [**inline**](#DeliveryAddressUsageIndicator) | Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days |  [optional]
**homePhone** | **kotlin.String** | Shopper&#39;s home phone number (including the country code). |  [optional]
**mobilePhone** | **kotlin.String** | Shopper&#39;s mobile phone number (including the country code). |  [optional]
**passwordChangeDate** | **kotlin.String** | Date when the shopper last changed their password. |  [optional]
**passwordChangeIndicator** | [**inline**](#PasswordChangeIndicator) | Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days |  [optional]
**pastTransactionsDay** | **kotlin.Int** | Number of all transactions (successful and abandoned) from this shopper in the past 24 hours. |  [optional]
**pastTransactionsYear** | **kotlin.Int** | Number of all transactions (successful and abandoned) from this shopper in the past year. |  [optional]
**paymentAccountAge** | **kotlin.String** | Date this payment method was added to the shopper&#39;s account. |  [optional]
**paymentAccountIndicator** | [**inline**](#PaymentAccountIndicator) | Indicator for the length of time since this payment method was added to this shopper&#39;s account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days |  [optional]
**purchasesLast6Months** | **kotlin.Int** | Number of successful purchases in the last six months. |  [optional]
**suspiciousActivity** | **kotlin.Boolean** | Whether suspicious activity was recorded on this account. |  [optional]
**workPhone** | **kotlin.String** | Shopper&#39;s work phone number (including the country code). |  [optional]


<a name="AccountAgeIndicator"></a>
## Enum: accountAgeIndicator
Name | Value
---- | -----
accountAgeIndicator | notApplicable, thisTransaction, lessThan30Days, from30To60Days, moreThan60Days


<a name="AccountChangeIndicator"></a>
## Enum: accountChangeIndicator
Name | Value
---- | -----
accountChangeIndicator | thisTransaction, lessThan30Days, from30To60Days, moreThan60Days


<a name="AccountType"></a>
## Enum: accountType
Name | Value
---- | -----
accountType | notApplicable, credit, debit


<a name="DeliveryAddressUsageIndicator"></a>
## Enum: deliveryAddressUsageIndicator
Name | Value
---- | -----
deliveryAddressUsageIndicator | thisTransaction, lessThan30Days, from30To60Days, moreThan60Days


<a name="PasswordChangeIndicator"></a>
## Enum: passwordChangeIndicator
Name | Value
---- | -----
passwordChangeIndicator | notApplicable, thisTransaction, lessThan30Days, from30To60Days, moreThan60Days


<a name="PaymentAccountIndicator"></a>
## Enum: paymentAccountIndicator
Name | Value
---- | -----
paymentAccountIndicator | notApplicable, thisTransaction, lessThan30Days, from30To60Days, moreThan60Days



