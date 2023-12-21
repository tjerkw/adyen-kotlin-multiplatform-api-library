
# CreateMerchantWebhookRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **kotlin.Boolean** | Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account. | 
**communicationFormat** | [**inline**](#CommunicationFormat) | Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json**  | 
**type** | **kotlin.String** | The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **ach-notification-of-change-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications). | 
**url** | **kotlin.String** | Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**. | 
**acceptsExpiredCertificate** | **kotlin.Boolean** | Indicates if expired SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsSelfSignedCertificate** | **kotlin.Boolean** | Indicates if self-signed SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsUntrustedRootCertificate** | **kotlin.Boolean** | Indicates if untrusted SSL certificates are accepted. Default value: **false**. |  [optional]
**additionalSettings** | [**AdditionalSettings**](AdditionalSettings.md) |  |  [optional]
**description** | **kotlin.String** | Your description for this webhook configuration. |  [optional]
**encryptionProtocol** | [**inline**](#EncryptionProtocol) | SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**. |  [optional]
**networkType** | [**inline**](#NetworkType) | Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**. |  [optional]
**password** | **kotlin.String** | Password to access the webhook URL. |  [optional]
**populateSoapActionHeader** | **kotlin.Boolean** | Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**. |  [optional]
**username** | **kotlin.String** | Username to access the webhook URL. |  [optional]


<a name="CommunicationFormat"></a>
## Enum: communicationFormat
Name | Value
---- | -----
communicationFormat | http, json, soap


<a name="EncryptionProtocol"></a>
## Enum: encryptionProtocol
Name | Value
---- | -----
encryptionProtocol | HTTP, TLSv1.2, TLSv1.3


<a name="NetworkType"></a>
## Enum: networkType
Name | Value
---- | -----
networkType | local, public



