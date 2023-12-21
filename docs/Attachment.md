
# Attachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**com.adyen.client.infrastructure.Base64ByteArray**](com.adyen.client.infrastructure.Base64ByteArray.md) | The document in Base64-encoded string format. | 
**contentType** | **kotlin.String** | The file format.   Possible values: **application/pdf**, **image/jpg**, **image/jpeg**, **image/png**.  |  [optional]
**filename** | **kotlin.String** | The name of the file including the file extension. |  [optional]
**pageName** | **kotlin.String** | The name of the file including the file extension. |  [optional]
**pageType** | **kotlin.String** | Specifies which side of the ID card is uploaded.  * When &#x60;type&#x60; is **driversLicense** or **identityCard**, set this to **front** or **back**.  * When omitted, we infer the page number based on the order of attachments. |  [optional]



