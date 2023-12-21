
# DSPublicKeyDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **kotlin.String** | Card brand. |  [optional]
**directoryServerId** | **kotlin.String** | Directory Server (DS) identifier. |  [optional]
**fromSDKVersion** | **kotlin.String** | The version of the mobile 3D Secure 2 SDK. For the possible values, refer to the versions in [Adyen 3DS2 Android](https://github.com/Adyen/adyen-3ds2-android/releases) and [Adyen 3DS2 iOS](https://github.com/Adyen/adyen-3ds2-ios/releases). |  [optional]
**publicKey** | [**com.adyen.client.infrastructure.Base64ByteArray**](com.adyen.client.infrastructure.Base64ByteArray.md) | Public key. The 3D Secure 2 SDK encrypts the device information by using the DS public key. |  [optional]
**rootCertificates** | **kotlin.String** | Directory Server root certificates. The 3D Secure 2 SDK verifies the ACS signed content using the rootCertificates. |  [optional]



