
# RiskData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientData** | **kotlin.String** | Contains client-side data, like the device fingerprint, cookies, and specific browser settings. |  [optional]
**customFields** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Any custom fields used as part of the input to configured risk rules. |  [optional]
**fraudOffset** | **kotlin.Int** | An integer value that is added to the normal fraud score. The value can be either positive or negative. |  [optional]
**profileReference** | **kotlin.String** | The risk profile to assign to this payment. When left empty, the merchant-level account&#39;s default risk profile will be applied. |  [optional]



