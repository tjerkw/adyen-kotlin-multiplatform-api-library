
# ResponseAdditionalData3DSecure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardHolderInfo** | **kotlin.String** | Information provided by the issuer to the cardholder. If this field is present, you need to display this information to the cardholder.  |  [optional]
**cavv** | **kotlin.String** | The Cardholder Authentication Verification Value (CAVV) for the 3D Secure authentication session, as a Base64-encoded 20-byte array. |  [optional]
**cavvAlgorithm** | **kotlin.String** | The CAVV algorithm used. |  [optional]
**scaExemptionRequested** | **kotlin.String** | Shows the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that Adyen requested for the payment.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis**  |  [optional]
**threeds2CardEnrolled** | **kotlin.Boolean** | Indicates whether a card is enrolled for 3D Secure 2. |  [optional]



