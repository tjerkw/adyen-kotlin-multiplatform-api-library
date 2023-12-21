
# Mandate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **kotlin.String** | The billing amount (in minor units) of the recurring transactions. | 
**endsAt** | **kotlin.String** | End date of the billing plan, in YYYY-MM-DD format. | 
**frequency** | [**inline**](#Frequency) | The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**. | 
**amountRule** | [**inline**](#AmountRule) | The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.   |  [optional]
**billingAttemptsRule** | [**inline**](#BillingAttemptsRule) | The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.   |  [optional]
**billingDay** | **kotlin.String** | The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the &#x60;frequency&#x60;. |  [optional]
**remarks** | **kotlin.String** | The message shown by UPI to the shopper on the approval screen. |  [optional]
**startsAt** | **kotlin.String** | Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date. |  [optional]


<a name="Frequency"></a>
## Enum: frequency
Name | Value
---- | -----
frequency | adhoc, daily, weekly, biWeekly, monthly, quarterly, halfYearly, yearly


<a name="AmountRule"></a>
## Enum: amountRule
Name | Value
---- | -----
amountRule | max, exact


<a name="BillingAttemptsRule"></a>
## Enum: billingAttemptsRule
Name | Value
---- | -----
billingAttemptsRule | on, before, after



