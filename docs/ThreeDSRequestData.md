
# ThreeDSRequestData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**challengeWindowSize** | [**inline**](#ChallengeWindowSize) | Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen |  [optional]
**dataOnly** | [**inline**](#DataOnly) | Flag for data only flow. |  [optional]
**nativeThreeDS** | [**inline**](#NativeThreeDS) | Indicates if [native 3D Secure authentication](https://docs.adyen.com/online-payments/3d-secure/native-3ds2) should be used when available.  Possible values: * **preferred**: Use native 3D Secure authentication when available. |  [optional]
**threeDSVersion** | [**inline**](#ThreeDSVersion) | The version of 3D Secure to use.  Possible values:  * **2.1.0** * **2.2.0** |  [optional]


<a name="ChallengeWindowSize"></a>
## Enum: challengeWindowSize
Name | Value
---- | -----
challengeWindowSize | 01, 02, 03, 04, 05


<a name="DataOnly"></a>
## Enum: dataOnly
Name | Value
---- | -----
dataOnly | false, true


<a name="NativeThreeDS"></a>
## Enum: nativeThreeDS
Name | Value
---- | -----
nativeThreeDS | preferred


<a name="ThreeDSVersion"></a>
## Enum: threeDSVersion
Name | Value
---- | -----
threeDSVersion | 2.1.0, 2.2.0



