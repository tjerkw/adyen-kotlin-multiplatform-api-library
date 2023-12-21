
# ThreeDSecureData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationResponse** | [**inline**](#AuthenticationResponse) | In 3D Secure 1, the authentication response if the shopper was redirected.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the challenge result. If the transaction was frictionless, omit this parameter. |  [optional]
**cavv** | [**com.adyen.client.infrastructure.Base64ByteArray**](com.adyen.client.infrastructure.Base64ByteArray.md) | The cardholder authentication value (base64 encoded, 20 bytes in a decoded form). |  [optional]
**cavvAlgorithm** | **kotlin.String** | The CAVV algorithm used. Include this only for 3D Secure 1. |  [optional]
**challengeCancel** | [**inline**](#ChallengeCancel) | Indicator informing the Access Control Server (ACS) and the Directory Server (DS) that the authentication has been cancelled. For possible values, refer to [3D Secure API reference](https://docs.adyen.com/online-payments/3d-secure/api-reference#mpidata). |  [optional]
**directoryResponse** | [**inline**](#DirectoryResponse) | In 3D Secure 1, this is the enrollment response from the 3D directory server.  In 3D Secure 2, this is the &#x60;transStatus&#x60; from the &#x60;ARes&#x60;. |  [optional]
**dsTransID** | **kotlin.String** | Supported for 3D Secure 2. The unique transaction identifier assigned by the Directory Server (DS) to identify a single transaction. |  [optional]
**eci** | **kotlin.String** | The electronic commerce indicator. |  [optional]
**riskScore** | **kotlin.String** | Risk score calculated by Directory Server (DS). Required for Cartes Bancaires integrations. |  [optional]
**threeDSVersion** | **kotlin.String** | The version of the 3D Secure protocol. |  [optional]
**tokenAuthenticationVerificationValue** | [**com.adyen.client.infrastructure.Base64ByteArray**](com.adyen.client.infrastructure.Base64ByteArray.md) | Network token authentication verification value (TAVV). The network token cryptogram. |  [optional]
**transStatusReason** | **kotlin.String** | Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values). |  [optional]
**xid** | [**com.adyen.client.infrastructure.Base64ByteArray**](com.adyen.client.infrastructure.Base64ByteArray.md) | Supported for 3D Secure 1. The transaction identifier (Base64-encoded, 20 bytes in a decoded form). |  [optional]


<a name="AuthenticationResponse"></a>
## Enum: authenticationResponse
Name | Value
---- | -----
authenticationResponse | Y, N, U, A


<a name="ChallengeCancel"></a>
## Enum: challengeCancel
Name | Value
---- | -----
challengeCancel | 01, 02, 03, 04, 05, 06, 07


<a name="DirectoryResponse"></a>
## Enum: directoryResponse
Name | Value
---- | -----
directoryResponse | A, C, D, I, N, R, U, Y



