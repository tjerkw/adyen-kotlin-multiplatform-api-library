
# AndroidApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier of the app. | 
**status** | **kotlin.String** | The status of the app. Possible values:  * &#x60;processing&#x60;: the app is being signed and converted to a format that the terminal can handle. * &#x60;error&#x60;: something went wrong. Check that the app matches the [requirements](https://docs.adyen.com/point-of-sale/android-terminals/app-requirements). * &#x60;invalid&#x60;: there is something wrong with the APK file of the app. * &#x60;ready&#x60;: the app has been signed and converted. * &#x60;archived&#x60;: the app is no longer available. | 
**description** | **kotlin.String** | The description that was provided when uploading the app. The description is not shown on the terminal. |  [optional]
**errorCode** | **kotlin.String** | The error code of the app. It exists if the status is error or invalid. |  [optional]
**label** | **kotlin.String** | The app name that is shown on the terminal. |  [optional]
**packageName** | **kotlin.String** | The package name that uniquely identifies the Android app. |  [optional]
**versionCode** | **kotlin.Int** | The version number of the app. |  [optional]
**versionName** | **kotlin.String** | The app version number that is shown on the terminal. |  [optional]



