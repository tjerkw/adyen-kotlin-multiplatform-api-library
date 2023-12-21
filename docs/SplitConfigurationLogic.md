
# SplitConfigurationLogic

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commission** | [**Commission**](Commission.md) |  | 
**acquiringFees** | [**inline**](#AcquiringFees) | Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**additionalCommission** | [**AdditionalCommission**](AdditionalCommission.md) |  |  [optional]
**adyenCommission** | [**inline**](#AdyenCommission) | Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**adyenFees** | [**inline**](#AdyenFees) | Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**adyenMarkup** | [**inline**](#AdyenMarkup) | Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**chargeback** | [**inline**](#Chargeback) | Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**. |  [optional]
**chargebackCostAllocation** | [**inline**](#ChargebackCostAllocation) | Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount** |  [optional]
**interchange** | [**inline**](#Interchange) | Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**paymentFee** | [**inline**](#PaymentFee) | Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**remainder** | [**inline**](#Remainder) | Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**. |  [optional]
**schemeFee** | [**inline**](#SchemeFee) | Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**. |  [optional]
**splitLogicId** | **kotlin.String** | Unique identifier of the split logic that is applied when the split configuration conditions are met. |  [optional] [readonly]
**surcharge** | [**inline**](#Surcharge) | Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount** |  [optional]
**tip** | [**inline**](#Tip) | Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**. |  [optional]


<a name="AcquiringFees"></a>
## Enum: acquiringFees
Name | Value
---- | -----
acquiringFees | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="AdyenCommission"></a>
## Enum: adyenCommission
Name | Value
---- | -----
adyenCommission | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="AdyenFees"></a>
## Enum: adyenFees
Name | Value
---- | -----
adyenFees | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="AdyenMarkup"></a>
## Enum: adyenMarkup
Name | Value
---- | -----
adyenMarkup | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="Chargeback"></a>
## Enum: chargeback
Name | Value
---- | -----
chargeback | deductFromLiableAccount, deductFromOneBalanceAccount, deductAccordingToSplitRatio


<a name="ChargebackCostAllocation"></a>
## Enum: chargebackCostAllocation
Name | Value
---- | -----
chargebackCostAllocation | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="Interchange"></a>
## Enum: interchange
Name | Value
---- | -----
interchange | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="PaymentFee"></a>
## Enum: paymentFee
Name | Value
---- | -----
paymentFee | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="Remainder"></a>
## Enum: remainder
Name | Value
---- | -----
remainder | addToLiableAccount, addToOneBalanceAccount


<a name="SchemeFee"></a>
## Enum: schemeFee
Name | Value
---- | -----
schemeFee | deductFromLiableAccount, deductFromOneBalanceAccount


<a name="Surcharge"></a>
## Enum: surcharge
Name | Value
---- | -----
surcharge | addToLiableAccount, addToOneBalanceAccount


<a name="Tip"></a>
## Enum: tip
Name | Value
---- | -----
tip | addToLiableAccount, addToOneBalanceAccount



