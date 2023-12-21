
# ThreeDSRequestorPriorAuthenticationInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threeDSReqPriorAuthData** | **kotlin.String** | Data that documents and supports a specific authentication process. Maximum length: 2048 bytes. |  [optional]
**threeDSReqPriorAuthMethod** | [**inline**](#ThreeDSReqPriorAuthMethod) | Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods. |  [optional]
**threeDSReqPriorAuthTimestamp** | **kotlin.String** | Date and time in UTC of the prior cardholder authentication. Format: YYYYMMDDHHMM |  [optional]
**threeDSReqPriorRef** | **kotlin.String** | This data element provides additional information to the ACS to determine the best approach for handing a request. This data element contains an ACS Transaction ID for a prior authenticated transaction. For example, the first recurring transaction that was authenticated with the cardholder. Length: 30 characters. |  [optional]


<a name="ThreeDSReqPriorAuthMethod"></a>
## Enum: threeDSReqPriorAuthMethod
Name | Value
---- | -----
threeDSReqPriorAuthMethod | 01, 02, 03, 04



