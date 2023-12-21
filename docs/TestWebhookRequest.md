
# TestWebhookRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notification** | [**CustomNotification**](CustomNotification.md) |  |  [optional]
**types** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of event codes for which to send test notifications. Only the webhook types below are supported.   Possible values if webhook &#x60;type&#x60;: **standard**:  * **AUTHORISATION** * **CHARGEBACK_REVERSED** * **ORDER_CLOSED** * **ORDER_OPENED** * **PAIDOUT_REVERSED** * **PAYOUT_THIRDPARTY** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA** * **REPORT_AVAILABLE** * **CUSTOM** - set your custom notification fields in the [&#x60;notification&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookId}/test__reqParam_notification) object.  Possible values if webhook &#x60;type&#x60;: **banktransfer-notification**:  * **PENDING**  Possible values if webhook &#x60;type&#x60;: **report-notification**:  * **REPORT_AVAILABLE**  Possible values if webhook &#x60;type&#x60;: **ideal-notification**:  * **AUTHORISATION**  Possible values if webhook &#x60;type&#x60;: **pending-notification**:  * **PENDING**  |  [optional]



