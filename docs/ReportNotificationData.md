
# ReportNotificationData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadUrl** | **kotlin.String** | The URL at which you can download the report. To download, you must authenticate your GET request with your [API credentials](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/overview). | 
**fileName** | **kotlin.String** | The filename of the report. | 
**reportType** | **kotlin.String** | Type of report. | 
**accountHolder** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**balanceAccount** | [**ResourceReference**](ResourceReference.md) |  |  [optional]
**balancePlatform** | **kotlin.String** | The unique identifier of the balance platform. |  [optional]
**creationDate** | **kotlin.String** | The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**. |  [optional]



