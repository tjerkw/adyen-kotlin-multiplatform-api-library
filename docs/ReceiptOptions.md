
# ReceiptOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logo** | **kotlin.String** | The receipt logo converted to a Base64-encoded string. The image must be a .bmp file of &lt; 256 KB, dimensions 240 (H) x 384 (W) px. |  [optional]
**qrCodeData** | **kotlin.String** | Data to print on the receipt as a QR code. This can include static text and the following variables:  - &#x60;${merchantreference}&#x60;: the merchant reference of the transaction. - &#x60;${pspreference}&#x60;: the PSP reference of the transaction.   For example, **http://www.example.com/order/${pspreference}/${merchantreference}**. |  [optional]



