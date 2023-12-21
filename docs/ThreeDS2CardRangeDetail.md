
# ThreeDS2CardRangeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acsInfoInd** | **kotlin.collections.List&lt;kotlin.String&gt;** | Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported) |  [optional]
**brandCode** | **kotlin.String** | Card brand. |  [optional]
**endRange** | **kotlin.String** | BIN end range. |  [optional]
**startRange** | **kotlin.String** | BIN start range. |  [optional]
**threeDS2Versions** | **kotlin.collections.List&lt;kotlin.String&gt;** | Supported 3D Secure protocol versions |  [optional]
**threeDSMethodURL** | **kotlin.String** | In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to. |  [optional]



