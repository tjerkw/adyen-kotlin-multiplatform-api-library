
# AuthenticationData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptAuthentication** | [**inline**](#AttemptAuthentication) | Indicates when 3D Secure authentication should be attempted. This overrides all other rules, including [Dynamic 3D Secure settings](https://docs.adyen.com/risk-management/dynamic-3d-secure).  Possible values:  * **always**: Perform 3D Secure authentication. * **never**: Don&#39;t perform 3D Secure authentication. If PSD2 SCA or other national regulations require authentication, the transaction gets declined. |  [optional]
**authenticationOnly** | **kotlin.Boolean** | If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. Default: **false**. |  [optional]
**threeDSRequestData** | [**ThreeDSRequestData**](ThreeDSRequestData.md) |  |  [optional]


<a name="AttemptAuthentication"></a>
## Enum: attemptAuthentication
Name | Value
---- | -----
attemptAuthentication | always, never



