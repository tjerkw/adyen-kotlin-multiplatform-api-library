
# Installments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**&#x60;value&#x60;** | **kotlin.Int** | Defines the number of installments. Its value needs to be greater than zero.  Usually, the maximum allowed number of installments is capped. For example, it may not be possible to split a payment in more than 24 installments. The acquirer sets this upper limit, so its value may vary. | 
**plan** | [**inline**](#Plan) | The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving**  |  [optional]


<a name="Plan"></a>
## Enum: plan
Name | Value
---- | -----
plan | regular, revolving



