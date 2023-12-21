
# ThreeDS2Result

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationValue** | **kotlin.String** | The &#x60;authenticationValue&#x60; value as defined in the 3D Secure 2 specification. |  [optional]
**cavvAlgorithm** | **kotlin.String** | The algorithm used by the ACS to calculate the authentication value, only for Cartes Bancaires integrations. |  [optional]
**challengeCancel** | [**inline**](#ChallengeCancel) | Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata). |  [optional]
**dsTransID** | **kotlin.String** | The &#x60;dsTransID&#x60; value as defined in the 3D Secure 2 specification. |  [optional]
**eci** | **kotlin.String** | The &#x60;eci&#x60; value as defined in the 3D Secure 2 specification. |  [optional]
**exemptionIndicator** | [**inline**](#ExemptionIndicator) | Indicates the exemption type that was applied by the issuer to the authentication, if exemption applied. Allowed values: * &#x60;lowValue&#x60; * &#x60;secureCorporate&#x60; * &#x60;trustedBeneficiary&#x60; * &#x60;transactionRiskAnalysis&#x60;  |  [optional]
**messageVersion** | **kotlin.String** | The &#x60;messageVersion&#x60; value as defined in the 3D Secure 2 specification. |  [optional]
**riskScore** | **kotlin.String** | Risk score calculated by Cartes Bancaires Directory Server (DS). |  [optional]
**threeDSRequestorChallengeInd** | [**inline**](#ThreeDSRequestorChallengeInd) | Indicates whether a challenge is requested for this transaction. Possible values: * **01** — No preference * **02** — No challenge requested * **03** — Challenge requested (3DS Requestor preference) * **04** — Challenge requested (Mandate) * **05** — No challenge (transactional risk analysis is already performed) * **06** — Data Only |  [optional]
**threeDSServerTransID** | **kotlin.String** | The &#x60;threeDSServerTransID&#x60; value as defined in the 3D Secure 2 specification. |  [optional]
**timestamp** | **kotlin.String** | The &#x60;timestamp&#x60; value of the 3D Secure 2 authentication. |  [optional]
**transStatus** | **kotlin.String** | The &#x60;transStatus&#x60; value as defined in the 3D Secure 2 specification. |  [optional]
**transStatusReason** | **kotlin.String** | Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values). |  [optional]
**whiteListStatus** | **kotlin.String** | The &#x60;whiteListStatus&#x60; value as defined in the 3D Secure 2 specification. |  [optional]


<a name="ChallengeCancel"></a>
## Enum: challengeCancel
Name | Value
---- | -----
challengeCancel | 01, 02, 03, 04, 05, 06, 07


<a name="ExemptionIndicator"></a>
## Enum: exemptionIndicator
Name | Value
---- | -----
exemptionIndicator | lowValue, secureCorporate, trustedBeneficiary, transactionRiskAnalysis


<a name="ThreeDSRequestorChallengeInd"></a>
## Enum: threeDSRequestorChallengeInd
Name | Value
---- | -----
threeDSRequestorChallengeInd | 01, 02, 03, 04, 05, 06



