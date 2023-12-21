
# Profile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | **kotlin.String** | The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**. | 
**bssType** | **kotlin.String** | Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations. | 
**ssid** | **kotlin.String** | The name of the wireless network. | 
**wsec** | **kotlin.String** | The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip** | 
**autoWifi** | **kotlin.Boolean** | Indicates whether to automatically select the best authentication method available. Does not work on older terminal models. |  [optional]
**channel** | **kotlin.Int** | The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection. |  [optional]
**defaultProfile** | **kotlin.Boolean** | Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first. |  [optional]
**eap** | **kotlin.String** | For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast** |  [optional]
**eapCaCert** | [**com.adyen.client.infrastructure.OctetByteArray**](com.adyen.client.infrastructure.OctetByteArray.md) |  |  [optional]
**eapClientCert** | [**com.adyen.client.infrastructure.OctetByteArray**](com.adyen.client.infrastructure.OctetByteArray.md) |  |  [optional]
**eapClientKey** | [**com.adyen.client.infrastructure.OctetByteArray**](com.adyen.client.infrastructure.OctetByteArray.md) |  |  [optional]
**eapClientPwd** | **kotlin.String** | For &#x60;eap&#x60; **tls**. The password of the RSA key file, if that file is password-protected. |  [optional]
**eapIdentity** | **kotlin.String** | For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server. |  [optional]
**eapIntermediateCert** | [**com.adyen.client.infrastructure.OctetByteArray**](com.adyen.client.infrastructure.OctetByteArray.md) |  |  [optional]
**eapPwd** | **kotlin.String** | For &#x60;eap&#x60; **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server. |  [optional]
**hiddenSsid** | **kotlin.Boolean** | Indicates if the network doesn&#39;t broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network. |  [optional]
**name** | **kotlin.String** | Your name for the Wi-Fi profile. |  [optional]
**psk** | **kotlin.String** | For &#x60;authType&#x60; **wpa-psk or **wpa2-psk**. The password to the wireless network. |  [optional]



