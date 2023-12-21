
# BrandVariantsRestriction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **kotlin.String** | Defines how the condition must be evaluated. | 
**&#x60;value&#x60;** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of card brand variants.  Possible values:   - **mc**, **mccredit**, **mccommercialcredit_b2b**, **mcdebit**, **mcbusinessdebit**, **mcbusinessworlddebit**, **mcprepaid**, **mcmaestro**   - **visa**, **visacredit**, **visadebit**, **visaprepaid**.  You can specify a rule for a generic variant. For example, to create a rule for all Mastercard payment instruments, use **mc**. The rule is applied to all payment instruments under **mc**, such as **mcbusinessdebit** and **mcdebit**.   |  [optional]



