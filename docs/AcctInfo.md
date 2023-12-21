
# AcctInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chAccAgeInd** | [**inline**](#ChAccAgeInd) | Length of time that the cardholder has had the account with the 3DS Requestor.  Allowed values: * **01** — No account * **02** — Created during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days |  [optional]
**chAccChange** | **kotlin.String** | Date that the cardholder’s account with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Format: **YYYYMMDD** |  [optional]
**chAccChangeInd** | [**inline**](#ChAccChangeInd) | Length of time since the cardholder’s account information with the 3DS Requestor was last changed, including Billing or Shipping address, new payment account, or new user(s) added.  Allowed values: * **01** — Changed during this transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days |  [optional]
**chAccPwChange** | **kotlin.String** | Date that cardholder’s account with the 3DS Requestor had a password change or account reset.  Format: **YYYYMMDD** |  [optional]
**chAccPwChangeInd** | [**inline**](#ChAccPwChangeInd) | Indicates the length of time since the cardholder’s account with the 3DS Requestor had a password change or account reset.  Allowed values: * **01** — No change * **02** — Changed during this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days |  [optional]
**chAccString** | **kotlin.String** | Date that the cardholder opened the account with the 3DS Requestor.  Format: **YYYYMMDD** |  [optional]
**nbPurchaseAccount** | **kotlin.String** | Number of purchases with this cardholder account during the previous six months. Max length: 4 characters. |  [optional]
**paymentAccAge** | **kotlin.String** | String that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Format: **YYYYMMDD** |  [optional]
**paymentAccInd** | [**inline**](#PaymentAccInd) | Indicates the length of time that the payment account was enrolled in the cardholder’s account with the 3DS Requestor.  Allowed values: * **01** — No account (guest checkout) * **02** — During this transaction * **03** — Less than 30 days * **04** — 30–60 days * **05** — More than 60 days |  [optional]
**provisionAttemptsDay** | **kotlin.String** | Number of Add Card attempts in the last 24 hours. Max length: 3 characters. |  [optional]
**shipAddressUsage** | **kotlin.String** | String when the shipping address used for this transaction was first used with the 3DS Requestor.  Format: **YYYYMMDD** |  [optional]
**shipAddressUsageInd** | [**inline**](#ShipAddressUsageInd) | Indicates when the shipping address used for this transaction was first used with the 3DS Requestor.  Allowed values: * **01** — This transaction * **02** — Less than 30 days * **03** — 30–60 days * **04** — More than 60 days |  [optional]
**shipNameIndicator** | [**inline**](#ShipNameIndicator) | Indicates if the Cardholder Name on the account is identical to the shipping Name used for this transaction.  Allowed values: * **01** — Account Name identical to shipping Name * **02** — Account Name different to shipping Name |  [optional]
**suspiciousAccActivity** | [**inline**](#SuspiciousAccActivity) | Indicates whether the 3DS Requestor has experienced suspicious activity (including previous fraud) on the cardholder account.  Allowed values: * **01** — No suspicious activity has been observed * **02** — Suspicious activity has been observed |  [optional]
**txnActivityDay** | **kotlin.String** | Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous 24 hours. Max length: 3 characters. |  [optional]
**txnActivityYear** | **kotlin.String** | Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous year. Max length: 3 characters. |  [optional]


<a name="ChAccAgeInd"></a>
## Enum: chAccAgeInd
Name | Value
---- | -----
chAccAgeInd | 01, 02, 03, 04, 05


<a name="ChAccChangeInd"></a>
## Enum: chAccChangeInd
Name | Value
---- | -----
chAccChangeInd | 01, 02, 03, 04


<a name="ChAccPwChangeInd"></a>
## Enum: chAccPwChangeInd
Name | Value
---- | -----
chAccPwChangeInd | 01, 02, 03, 04, 05


<a name="PaymentAccInd"></a>
## Enum: paymentAccInd
Name | Value
---- | -----
paymentAccInd | 01, 02, 03, 04, 05


<a name="ShipAddressUsageInd"></a>
## Enum: shipAddressUsageInd
Name | Value
---- | -----
shipAddressUsageInd | 01, 02, 03, 04


<a name="ShipNameIndicator"></a>
## Enum: shipNameIndicator
Name | Value
---- | -----
shipNameIndicator | 01, 02


<a name="SuspiciousAccActivity"></a>
## Enum: suspiciousAccActivity
Name | Value
---- | -----
suspiciousAccActivity | 01, 02



