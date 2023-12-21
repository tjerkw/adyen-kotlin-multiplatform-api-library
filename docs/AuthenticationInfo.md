
# AuthenticationInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acsTransId** | **kotlin.String** | Universally unique transaction identifier assigned by the Access Control Server (ACS) to identify a single transaction. | 
**challengeIndicator** | [**inline**](#ChallengeIndicator) | Specifies a preference for receiving a challenge. Possible values:  * **01**: No preference * **02**: No challenge requested * **03**: Challenge requested (preference) * **04**: Challenge requested (mandate) * **05**: No challenge requested (transactional risk analysis is already performed) * **07**: No challenge requested (SCA is already performed) * **08**: No challenge requested (trusted beneficiaries exemption of no challenge required) * **09**: Challenge requested (trusted beneficiaries prompt requested if challenge required) * **80**: No challenge requested (secure corporate payment with Mastercard) * **82**: No challenge requested (secure corporate payment with Visa)  | 
**createdAt** | **kotlin.String** | Date and time in UTC of the cardholder authentication.   [ISO 8601](https://www.w3.org/TR/NOTE-datetime) format: YYYY-MM-DDThh:mm:ss+TZD, for example, **2020-12-18T10:15:30+01:00**. | 
**deviceChannel** | [**inline**](#DeviceChannel) | Indicates the type of channel interface being used to initiate the transaction. Possible values:  * **app** * **browser** * **3DSRequestorInitiated** (initiated by a merchant when the cardholder is not available) | 
**dsTransID** | **kotlin.String** | Universally unique transaction identifier assigned by the DS (card scheme) to identify a single transaction. | 
**inPSD2Scope** | **kotlin.Boolean** | Indicates if the purchase was in the PSD2 scope. | 
**messageCategory** | [**inline**](#MessageCategory) | Identifies the category of the message for a specific use case. Possible values:  * **payment** * **nonPayment** | 
**messageVersion** | **kotlin.String** | The &#x60;messageVersion&#x60; value as defined in the 3D Secure 2 specification. | 
**threeDSServerTransID** | **kotlin.String** | The &#x60;threeDSServerTransID&#x60; value as defined in the 3D Secure 2 specification. | 
**transStatus** | [**inline**](#TransStatus) | The &#x60;transStatus&#x60; value as defined in the 3D Secure 2 specification. Possible values:  * **Y**: Authentication / Account verification successful. * **N**: Not Authenticated / Account not verified. Transaction denied. * **U**: Authentication / Account verification could not be performed. * **I**: Informational Only / 3D Secure Requestor challenge preference acknowledged. * **R**: Authentication / Account verification rejected by the Issuer.  | 
**type** | [**inline**](#Type) | The type of authentication performed. Possible values:  * **frictionless** * **challenge** | 
**challenge** | [**ChallengeInfo**](ChallengeInfo.md) |  |  [optional]
**exemptionIndicator** | [**inline**](#ExemptionIndicator) | Indicates the exemption type that was applied to the authentication by the issuer, if exemption applied. Possible values:  * **lowValue** * **secureCorporate** * **trustedBeneficiary** * **transactionRiskAnalysis** * **acquirerExemption** * **noExemptionApplied** * **visaDAFExemption**  |  [optional]
**riskScore** | **kotlin.Int** | Risk score calculated from the transaction rules. |  [optional]
**transStatusReason** | [**inline**](#TransStatusReason) | Provides information on why the &#x60;transStatus&#x60; field has the specified value. For possible values, refer to [our docs](https://docs.adyen.com/online-payments/3d-secure/api-reference#possible-transstatusreason-values). |  [optional]


<a name="ChallengeIndicator"></a>
## Enum: challengeIndicator
Name | Value
---- | -----
challengeIndicator | 01, 02, 03, 04, 05, 07, 08, 09, 80, 82


<a name="DeviceChannel"></a>
## Enum: deviceChannel
Name | Value
---- | -----
deviceChannel | app, browser, ThreeDSRequestorInitiated


<a name="MessageCategory"></a>
## Enum: messageCategory
Name | Value
---- | -----
messageCategory | payment, nonPayment


<a name="TransStatus"></a>
## Enum: transStatus
Name | Value
---- | -----
transStatus | Y, N, R, I, U


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | frictionless, challenge


<a name="ExemptionIndicator"></a>
## Enum: exemptionIndicator
Name | Value
---- | -----
exemptionIndicator | lowValue, secureCorporate, trustedBeneficiary, transactionRiskAnalysis, acquirerExemption, noExemptionApplied, visaDAFExemption


<a name="TransStatusReason"></a>
## Enum: transStatusReason
Name | Value
---- | -----
transStatusReason | 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 80, 81, 82, 83, 84, 85, 86, 87, 88



