
# ScheduleTerminalActionsRequestActionDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **kotlin.String** | The unique identifier of the app to be uninstalled. |  [optional]
**type** | [**inline**](#Type) | Type of terminal action: Uninstall an Android certificate. |  [optional]
**certificateId** | **kotlin.String** | The unique identifier of the certificate to be uninstalled. |  [optional]
**updateAtFirstMaintenanceCall** | **kotlin.Boolean** | Boolean flag that tells if the terminal should update at the first next maintenance call. If false, terminal will update on its configured reboot time. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | UninstallAndroidCertificate



