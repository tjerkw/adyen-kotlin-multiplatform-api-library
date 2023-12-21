
# UpdateCompanyWebhookRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptsExpiredCertificate** | **kotlin.Boolean** | Indicates if expired SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsSelfSignedCertificate** | **kotlin.Boolean** | Indicates if self-signed SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsUntrustedRootCertificate** | **kotlin.Boolean** | Indicates if untrusted SSL certificates are accepted. Default value: **false**. |  [optional]
**active** | **kotlin.Boolean** | Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account. |  [optional]
**additionalSettings** | [**AdditionalSettings**](AdditionalSettings.md) |  |  [optional]
**communicationFormat** | [**inline**](#CommunicationFormat) | Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json**  |  [optional]
**description** | **kotlin.String** | Your description for this webhook configuration. |  [optional]
**encryptionProtocol** | [**inline**](#EncryptionProtocol) | SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**. |  [optional]
**filterMerchantAccountType** | [**inline**](#FilterMerchantAccountType) | Shows how merchant accounts are filtered when configuring the webhook. Possible values: * **includeAccounts**: The webhook is configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. * **excludeAccounts**: The webhook is not configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;. |  [optional]
**filterMerchantAccounts** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**. |  [optional]
**networkType** | [**inline**](#NetworkType) | Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**. |  [optional]
**password** | **kotlin.String** | Password to access the webhook URL. |  [optional]
**populateSoapActionHeader** | **kotlin.Boolean** | Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**. |  [optional]
**url** | **kotlin.String** | Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**. |  [optional]
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



