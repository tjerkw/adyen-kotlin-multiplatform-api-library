
# ChallengeInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flow** | [**inline**](#Flow) | The flow used in the challenge. Possible values:  * **OTP_SMS**: one-time password (OTP) flow * **OOB**: out-of-band (OOB) flow | 
**lastInteraction** | **kotlin.String** | The last time of interaction with the challenge. | 
**challengeCancel** | [**inline**](#ChallengeCancel) | Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata). |  [optional]
**phoneNumber** | **kotlin.String** | The last four digits of the phone number used in the challenge. |  [optional]
**resends** | **kotlin.Int** | The number of times the one-time password (OTP) was resent during the challenge. |  [optional]
**retries** | **kotlin.Int** | The number of retries used in the challenge. |  [optional]


<a name="Flow"></a>
## Enum: flow
Name | Value
---- | -----
flow | OTP_SMS, OOB


<a name="ChallengeCancel"></a>
## Enum: challengeCancel
Name | Value
---- | -----
challengeCancel | 01, 02, 03, 04, 05, 06, 07



