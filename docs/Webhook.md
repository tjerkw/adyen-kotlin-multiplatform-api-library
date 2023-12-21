
# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **kotlin.Boolean** | Indicates if the webhook configuration is active. The field must be **true** for you to receive webhooks about events related an account. | 
**communicationFormat** | [**inline**](#CommunicationFormat) | Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json**  | 
**type** | **kotlin.String** | The type of webhook. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **ach-notification-of-change-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **terminal-api-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications). | 
**url** | **kotlin.String** | Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**. | 
**links** | [**WebhookLinks**](WebhookLinks.md) |  |  [optional]
**acceptsExpiredCertificate** | **kotlin.Boolean** | Indicates if expired SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsSelfSignedCertificate** | **kotlin.Boolean** | Indicates if self-signed SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsUntrustedRootCertificate** | **kotlin.Boolean** | Indicates if untrusted SSL certificates are accepted. Default value: **false**. |  [optional]
**accountReference** | **kotlin.String** | Reference to the account the webook is set on. |  [optional]
**additionalSettings** | [**AdditionalSettingsResponse**](AdditionalSettingsResponse.md) |  |  [optional]
**certificateAlias** | **kotlin.String** | The alias of our SSL certificate. When you receive a notification from us, the alias from the HMAC signature will match this alias. |  [optional]
**description** | **kotlin.String** | Your description for this webhook configuration. |  [optional]
**encryptionProtocol** | [**inline**](#EncryptionProtocol) | SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**. |  [optional]
**filterMerchantAccountType** | [**inline**](#FilterMerchantAccountType) | Shows how merchant accounts are included in company-level webhooks. Possible values: * **includeAccounts** * **excludeAccounts** * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;. |  [optional]
**filterMerchantAccounts** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**. |  [optional]
**hasError** | **kotlin.Boolean** | Indicates if the webhook configuration has errors that need troubleshooting. If the value is **true**, troubleshoot the configuration using the [testing endpoint](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookid}/test). |  [optional]
**hasPassword** | **kotlin.Boolean** | Indicates if the webhook is password protected. |  [optional]
**hmacKeyCheckValue** | **kotlin.String** | The [checksum](https://en.wikipedia.org/wiki/Key_checksum_value) of the HMAC key generated for this webhook. You can use this value to uniquely identify the HMAC key configured for this webhook. |  [optional]
**id** | **kotlin.String** | Unique identifier for this webhook. |  [optional]
**networkType** | [**inline**](#NetworkType) | Network type for Terminal API details webhooks. |  [optional]
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


<a name="FilterMerchantAccountType"></a>
## Enum: filterMerchantAccountType
Name | Value
---- | -----
filterMerchantAccountType | allAccounts, excludeAccounts, includeAccounts


<a name="NetworkType"></a>
## Enum: networkType
Name | Value
---- | -----
networkType | local, public



