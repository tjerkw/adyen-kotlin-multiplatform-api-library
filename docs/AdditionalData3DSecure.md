
# AdditionalData3DSecure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow3DS2** | **kotlin.String** | Indicates if you are able to process 3D Secure 2 transactions natively on your payment page. Send this parameter when you are using &#x60;/payments&#x60; endpoint with any of our [native 3D Secure 2 solutions](https://docs.adyen.com/online-payments/3d-secure/native-3ds2).   &gt; This parameter only indicates readiness to support native 3D Secure 2 authentication. To specify if you _want_ to perform 3D Secure, use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) or send the &#x60;executeThreeD&#x60; parameter.  Possible values: * **true** - Ready to support native 3D Secure 2 authentication. Setting this to true does not mean always applying 3D Secure 2. Adyen still selects the version of 3D Secure based on configuration to optimize authorisation rates and improve the shopper&#39;s experience. * **false** – Not ready to support native 3D Secure 2 authentication. Adyen will not offer 3D Secure 2 to your shopper regardless of your configuration.  |  [optional]
**challengeWindowSize** | [**inline**](#ChallengeWindowSize) | Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen |  [optional]
**executeThreeD** | **kotlin.String** | Indicates if you want to perform 3D Secure authentication on a transaction.   &gt; Alternatively, you can use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) to configure rules for applying 3D Secure.  Possible values: * **true** – Perform 3D Secure authentication. * **false** – Don&#39;t perform 3D Secure authentication. Note that this setting results in refusals if the issuer mandates 3D Secure because of the PSD2 directive  or other, national regulations.   |  [optional]
**mpiImplementationType** | **kotlin.String** | In case of Secure+, this field must be set to **CUPSecurePlus**. |  [optional]
**scaExemption** | **kotlin.String** | Indicates the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that you want to request for the transaction.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis**  |  [optional]
**threeDSVersion** | **kotlin.String** | Indicates your preference for the 3D Secure version.  &gt; If you use this parameter, you override the checks from Adyen&#39;s Authentication Engine. We recommend to use this field only if you have an extensive knowledge of 3D Secure.  Possible values: * **1.0.2**: Apply 3D Secure version 1.0.2.  * **2.1.0**: Apply 3D Secure version 2.1.0.  * **2.2.0**: Apply 3D Secure version 2.2.0. If the issuer does not support version 2.2.0, we will fall back to 2.1.0.  The following rules apply: * If you prefer 2.1.0 or 2.2.0 but we receive a negative &#x60;transStatus&#x60; in the &#x60;ARes&#x60;, we will apply the fallback policy configured in your account. For example, if the configuration is to fall back to 3D Secure 1, we will apply version 1.0.2. * If you prefer 2.1.0 or 2.2.0 but the BIN is not enrolled, you will receive an error.   |  [optional]


<a name="ChallengeWindowSize"></a>
## Enum: challengeWindowSize
Name | Value
---- | -----
challengeWindowSize | 01, 02, 03, 04, 05



